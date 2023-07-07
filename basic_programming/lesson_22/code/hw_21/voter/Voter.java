package hw_21.voter;

public class Voter {
    String name;
    int age;
    String nationality;
    String street;
    int houseNumber;
    String city;
    //designer
    public Voter(String name, int age, String nationality, String street, int houseNumber, String city) {
        this.name = name;
        this.age = checkAge(age);
        this.nationality = nationality;
        this.street = street;
        this.houseNumber = houseNumber;
        this.city = city;
    }
    //getter and setter
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public int getAge() {
        return age;
    }
    public void setAge(int age) {
        this.age = age;
        if (age > 18){
            return;
        }
        return;
    }
    public String getNationality() {
        return nationality;
    }
    public void setNationality(String nationality) {
        this.nationality = nationality;
    }
    public String getStreet() {
        return street;
    }
    public void setStreet(String street) {
        this.street = street;
    }
    public int getHouseNumber() {
        return houseNumber;
    }
    public void setHouseNumber(int houseNumber) {
        this.houseNumber = houseNumber;
    }
    public String getCity() {
        return city;
    }
    public void setCity(String city) {
        this.city = city;
    }
    public int checkAge (int age){
        if (age > 18){
            System.out.println("I'm sorry, but you're too young to vote!!");
            return age;
        }
        return -1;
    }

    @Override
    public String toString() {
        return "Voter{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", nationality='" + nationality + '\'' +
                ", street='" + street + '\'' +
                ", houseNumber=" + houseNumber +
                ", city='" + city + '\'' +
                '}';
    }
}
