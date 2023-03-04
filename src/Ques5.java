//its just a practice program q5 is in  employee..
import java.io.FileInputStream;
public class Ques5 {

//public static void main(String [] args){
//    try{
//        int a=1000, b = 0 , c;
//        c=a/b;
//        System.out.println(c);
//    }catch(Exception e){
//        System.out.println(e);
//    }
//    System.out.println("hello");
//}

    public static void main(String [] args){
        try{
            FileInputStream fp = new FileInputStream("abc.txt") ;

        }catch(Exception e){
            System.out.println(e);
        }

        System.out.println("heloo");

    }
}
