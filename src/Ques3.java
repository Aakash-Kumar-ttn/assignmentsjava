//Q3) Write a java program to show following menu to the user:
//
//*******Menu*******
//1. Calculate Area of Circle
//2. Calculate Circumference of a Circle
//3. Exit.
//Choose an option (1-3):
//
//Take radius as user input.
//
//Hint: Use Switch statement to act on the menu. Also area and circumference methods should be static
import java.util.Scanner;
public class Ques3 {
    public static float area(int radius){
        return (float)(3.14*(radius*radius));
    }

    public static float cirm(int radius){
        return (float)(3.14*radius*2);
    }

    public static void main(String [] args){

        Scanner scn = new Scanner(System.in);

        int ch = -1;
        while(ch!=3){

            System.out.println("Enter 1 to calculate Area of circle");
            System.out.println("Enter 2 to calculate Cirumference of circle");
            System.out.println("Enter 3 to Exit");
            System.out.println("Enter option");
             ch = scn.nextInt();
             int radius = 0 ;
            switch(ch){
                case 1: System.out.println("enter radius ");
                        radius = scn.nextInt() ;
                        System.out.println("area of circle is ->" + area(radius));
                          break;
                case 2: System.out.println("enter radius ");
                    radius = scn.nextInt() ;
                    System.out.println("area of circle is -> " + cirm(radius));
                    break;
//                case 3:
//                    System.out.println("exit") ;
//                    break;
                default:
                    System.out.println("invalid no.");
                    break;
            }
        }

        System.out.println("get out the program");

    }
}
