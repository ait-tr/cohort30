package teacher_code;

import java.util.List;

public class Example {

    private List<String> data;
    private Roles role;


    public String getData(int index) {
        if (role == Roles.ADMIN){
            return data.get(index);
        } else {
            System.out.println("u are havent permissons for this opereations");
            return null;
        }
    }

    enum Roles {
        CLIENT, ADMIN;
    }
}
