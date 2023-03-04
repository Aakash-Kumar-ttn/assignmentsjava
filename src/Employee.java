//Q5) Create a class named Employee with fields firstname,lastname,age and designation.
//The class should:
//
//    have all types of constructors to initialize the object
//    class should also have setter methods to update a particular field
//    Override its toString method to display a meaningful message using all these fields.

import java.util.Scanner;
public class Employee {

    public String firstname;
    public String lastname;
    public int age;
    public String designation;

    Employee(){
        this.firstname = "";
        this.lastname = "";
        this.age= 0;
        this.designation = "";
    }
    Employee (String fn , String ln , int ag , String desi){
        this.firstname = fn;
        this.lastname = ln;
        this.designation = desi;
        this.age=ag;
    }
    public String getFirstname() {
        return firstname;
    }

    public String getLastname() {
        return lastname;
    }

    public int getAge() {
        return age;
    }

    public String getDesignation() {
        return designation;
    }

    public void setFirstname(String firstname) {
        this.firstname = firstname;
    }

    public void setLastname(String lastname) {
        this.lastname = lastname;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void setDesignation(String designation) {
        this.designation = designation;
    }

   public String toString(){
        return firstname + lastname + age + designation ;
   }

    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        Employee em = new Employee() ;

        System.out.println("enter first name");
        em.setFirstname(scn.nextLine());

        System.out.println("enter last name");
       em.setLastname(scn.nextLine());

        System.out.println("enter age");
        em.setAge(scn.nextInt());

        System.out.println("enter designation");
        em.setDesignation(scn.nextLine());
        System.out.println(em);

    }

}


