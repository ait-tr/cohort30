package practice.user;

public class User {
    // поля класса, отвечают за состояние
    private String username;
    private String email;
    private String password;

    // методы класса, отвечают за поведение (изменение состояния)
    public User(String username, String email, String password) {
        this.username = username;
        this.email = email;
        this.password = password;
    }

    // перегрузка конструктора
    public User(String email, String password){
        setEmail(email); // этот метод надо реализовать
        setPassword(password); // этот метод надо реализовать
    }

    public String getEmail() {
        return email;
    }

    public String getUsername() {
        return username;
    }

    // это очень опасный метод!!!
    public String getPassword() {
        return password;
    }

    public void setEmail(String email){
        if (validateEmail(email)){
            this.email = email;
        } else {
            System.out.println(email  + " isn't valid.");
        }
    }
    public void setPassword(String password){
        if (validatePassword(password)){
            this.password = password;
        } else {
            System.out.println(password  + " isn't valid.");
        }
    }

//    Requirements for e-mail:
//    1) @ exists and only one
//    2) dot after @
//    3) after last dot minimum 2 symbols
//    4) only alphabetic, digits, _ , - , . , @ - это разрешенные символы до @

    private boolean validateEmail(String email) {
        int indexAt = email.indexOf('@'); // узнали индекс собаки
        if (indexAt == -1 || indexAt != email.lastIndexOf('@')) { // если собака не нашлась или нет еще одной собаки
            return false;
        }
        if (email.indexOf('.', indexAt) == -1){ // если после собаки не нашлась точка, indexOf ищет после индекса собаки
            return false;
        }
        if (email.lastIndexOf('.') >= email.length() - 2) { // проверка, что не менее 2-х символов после последеней точки
            return false;
        }
        for (int i = 0; i < email.length(); i++) { // пробегаем по всем символам строки
            char с = email.charAt(i);
            if (!((с >= 'A' && с <= 'Z') || (с >= 'a' && с <= 'z') || (с >= '0' && с <= '9') || с == '_' || с == '-' || с == '.' || с == '@')){
                return false; // если ве это не выполнилось, то возвращаем false
            }
        }
        return true;
    }

    //    1) min 8 symbols
//    2) min one symbol of uppercase
//    3) min one symbol of lowercase
//    4) min one digit
//    5) min one special symbol (!%@*&#)
    private boolean validatePassword(String password){
        boolean[] res = new boolean[5]; // по умолчанию все элементы массива типа boolean равны false
        if (password.length() >= 8){
            res[0] = true;
        }
        for (int i = 0; i < password.length(); i++) { // пробегаем по всем символам строки
            char с = password.charAt(i);  // c - это символ в пароле
            if (Character.isUpperCase(с)) {
                res[1] = true;
            }
            if (Character.isLowerCase(с)) {
                res[2] = true;
            }
            if (Character.isDigit(с)){
                res[3] = true;
            }
            if ("!%@*&#".indexOf(с) >= 0) {  // если индекс нашелся хоть одного из символов, кот. стоят в кавычках
                res[4] = true;
            }
        }
        return res[0] && res[1] && res[2] && res[3] && res[4];
    }

    @Override
    public String toString() {
        return "User{" +
                "username='" + username + '\'' +
                ", email='" + email + '\'' +
                ", password='" + password + '\'' +
                '}';
    }

}
