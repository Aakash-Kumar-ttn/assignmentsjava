package Q5;

public class UserClass {
    private static UserClass object;
    private String firstName;
    private String lastName;
    private int age;
    private int phno;

    public UserClass(String firstName, String lastName, int age, int phno) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.age = age;
        this.phno = phno;
    }

    public static UserClass getInstance(String firstName, String lastName, int age
            , int phone) {
        if (object == null) {
            return new UserClass(firstName, lastName, age, phone);
        }else{
            object.firstName = firstName;
            object.lastName = lastName;
            object.age = age;
            //object.phno = phno;
            object.phno=phone;
        }

        return object;
    }

    public String toString(){

        return "Data is -> " + this.firstName+ " " + this.lastName + " " + this.age + " " + this.phno;
    }
}
