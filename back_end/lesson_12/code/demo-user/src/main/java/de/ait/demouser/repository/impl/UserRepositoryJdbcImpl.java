package de.ait.demouser.repository.impl;

import de.ait.demouser.model.User;
import de.ait.demouser.repository.UserRepository;
import lombok.RequiredArgsConstructor;
import org.hibernate.annotations.processing.SQL;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.jdbc.core.simple.SimpleJdbcInsert;
import org.springframework.stereotype.Repository;

import javax.sql.DataSource;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@RequiredArgsConstructor
@Repository
public class UserRepositoryJdbcImpl implements UserRepository {

    private final DataSource dataSource;

    //language=SQL
    private static final String SQL_SELECT_BY_ID = "select * from account where id = ?";

    //language=SQL
    private static final String SQL_SELECT_ALL ="select * from account";

    //language=SQL
    private static final String SQL_UPDATE_BY_ID ="update account set first_name = ?, last_name = ? where id = ?";

    //language=SQL
    private static final String SQL_DELETE_USER_BY_ID = "delete from account where id = ?";

    private final JdbcTemplate jdbcTemplate; //  используем специальный класс Spring для работы с бд

    private static final RowMapper<User>USER_ROW_MAPPER = (row, rowNum) -> {
        Long id = row.getLong("id");
        String firstName = row.getString("first_name");
        String lastName = row.getString("last_name");
        String email = row.getString("email");
        String password = row.getString("password");

        return User.builder()
                .id(id)
                .firstName(firstName)
                .lastName(lastName)
                .email(email)
                .password(password)
                .build();
    };
    @Override
    public User findById(Long id) {
        return jdbcTemplate.queryForObject(SQL_SELECT_BY_ID,USER_ROW_MAPPER,id);// вместо ? подставит id
    }

    @Override
    public List<User> findAll() {

        return jdbcTemplate.query(SQL_SELECT_ALL,USER_ROW_MAPPER);
    }

    @Override
    public void save(User model) {
        // создаем обьект для отправки Insert запроса в базу данных на основе DataSource
        SimpleJdbcInsert jdbcInsert = new SimpleJdbcInsert(dataSource)
                .usingGeneratedKeyColumns("id"); // какая колонка используется для автогенерации
                                                                // первичного ключа
        jdbcInsert.withTableName("account");// с какой таблицей работаем

        Map<String,Object>parameters = new HashMap<>();// создаем мапу с параметрами для добавления данных
        parameters.put("first_name",model.getFirstName());//говорим, что в колонку first_name нужно добавить
                                                            // значение firstName  из модели
        parameters.put("last_name",model.getLastName());
        parameters.put("email",model.getEmail());
        parameters.put("password",model.getPassword());

      //  jdbcInsert.execute(parameters);
      long generatedId =  jdbcInsert.executeAndReturnKey(parameters).longValue();// выполняем запрос и получаем
                                                                                     // сгенерированный ключ
        model.setId(generatedId);
    }

    @Override
    public void update(User model) {

        jdbcTemplate.update(SQL_UPDATE_BY_ID,model.getFirstName(),model.getLastName(),model.getId());

    }

    @Override
    public void deleteById(Long id) {
        jdbcTemplate.update(SQL_DELETE_USER_BY_ID,id);
    }
}
