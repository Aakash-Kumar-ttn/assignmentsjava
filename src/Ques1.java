//Q1) Write a class with FirstName, LastName & age field.
// Print Firstname, LastName & age using static block, static method & static variable respectively.

public class Ques1 {
    public static String FirstName = "Aakash";
    public static String LastName = "Kumar";

    public static int age = 32;

    public static void printData(){
        System.out.println("firstname " + FirstName);
        System.out.println("lastname "+ LastName);
        System.out.println("age "+ age);
    }

    public static void main(String [] args){
        Ques1 obj = new Ques1();
        obj.printData();
    }
}
