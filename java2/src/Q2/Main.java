package Q2;
//WAP to show try and multicatch and finally
public class Main {

    public static void main(String [] args){
        int  a = 100 , b = 0 , c ;

        try{
            c=a/b;
        }catch (ArithmeticException e){
            System.out.println("/ by zero is not possible");
        }catch(Exception e){
            System.out.println(e);
        }
        System.out.println("this line is to check program run or not");
    }
}
