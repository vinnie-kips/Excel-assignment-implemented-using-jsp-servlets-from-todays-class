package servlet;
public class Employee {
    private String firstName;
    private String town;
    private String age;

    public Employee(String firstName, String town, String age) {
        super();
        this.firstName = firstName;
        this.town = town;
        this.age = age;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getTown() {
        return town;
    }

    public void setTown(String town) {
        this.town = town;
    }

    public String getAge() {
        return age;
    }

    public void setAge(String age) {
        this.age = age;
    }

}