package de.ait.ec.security.details;

import de.ait.ec.models.User;
import de.ait.ec.repository.UsersRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class UserDetailsServiceImpl implements UserDetailsService {

    private final UsersRepository usersRepository;
    @Override
    public UserDetails loadUserByUsername(String email) throws UsernameNotFoundException {

   /*
      Optional<User> userOptional = usersRepository.findByEmail(email);
      if(userOptional.isPresent()){ // если пользователь найден
          User user = userOptional.get(); // получаем обьект юзера
          AuthenticatedUser authenticatedUser = new AuthenticatedUser(user); // кладем пользователя в
                                                                            // обьект для Spring Security
          return authenticatedUser; // возращаем результат работы метода - пользователя из бд, адаптированного
                                    // для Spring Security
      } else {
          // если юзер не найден - возращаем ошибку
          throw new UsernameNotFoundException("User with email <" + email + "> not found");
      }

    */
      User user = usersRepository.findByEmail(email)
              .orElseThrow(() -> new UsernameNotFoundException("User with email <" + email + "> not found"));
      return new AuthenticatedUser(user);

    }
}
