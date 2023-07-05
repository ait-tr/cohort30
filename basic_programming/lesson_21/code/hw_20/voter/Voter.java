package hw_20.voter;

public class Voter {
    private String firstName;
    private String lastName;
    private int age;
 
    public Voter(String firstName, String lastName, int age) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.age = age;
    }
 
    @Override
    public String toString() {
        return "firstName: "+firstName+" lastname: "+lastName+" age:"+age;
    }
 
    public Voter() {
    }
 
    public String getFirstName() {
        return firstName;
    }
 
    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }
 
    public String getLastName() {
        return lastName;
    }
 
    public void setLastName(String lastName) {
        this.lastName = lastName;
    }
 
    public int getAge() {
        return age;
    }
 
    public void setAge(int age) {
        if (age >= 18 ) {
            this.age = age;
        } else {
            System.out.println("Age of voter should be more than 18 years old.");
        }
    }
}
