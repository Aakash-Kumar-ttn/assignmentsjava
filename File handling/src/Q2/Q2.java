package Q2;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;
//Create a User class with fields:  firstname, lastname, age, phonenumber.
// Write a program which accepts values of user fields
// from commandline, create object and append that to a text file.
// After every user creation the program should prompt:
// "Do you want to continue creating users? (Type QUIT to exit)"
// and keep on accepting values and writing to file unitl user quits.
public class Q2 {

    public static void main(String[] args) {
        Scanner scn =  new Scanner(System.in);
        File file = new File("MYFILE.txt");
        String str = "";
        while(str.equalsIgnoreCase("exit" ) != true){

            System.out.println("Enter your Details");

            System.out.println("Enter First Name");
            String fname = scn.nextLine();
            System.out.println("Enter Last Name");
            String lname = scn.nextLine();
            System.out.println("Enter your Age");
            int age = scn.nextInt();
            System.out.println("ph numnber");
            int phoneNo = scn.nextInt();
           // scn.nextLine();

           // UserClass obj1 = UserClass.getInstance(fname,lname,age,phoneNo);
            UserClass obj1 = UserClass.getInstance(fname,lname,age,phoneNo);
            System.out.println(obj1.toString());

            try(BufferedWriter br = new BufferedWriter(new FileWriter(file,true))){ //
                br.write(obj1.toString());
                br.newLine();


            }catch (IOException e){
                System.out.println("Unable To Read File");
            }

            System.out.println("Do You Want to  Enter More");
            str = scn.nextLine() ;
        }
        }


    }
