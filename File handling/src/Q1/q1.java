package Q1;

//Write a program to display values of enums using a constructor & getPrice() method
// (Example display house & their prices)
public class q1 {
    public static void main(String[] args) {

        for( enumclass obj : enumclass.values()){
            System.out.println("Rate of :" + obj + " is -> " + obj.getPrice());

        }

    }
}
