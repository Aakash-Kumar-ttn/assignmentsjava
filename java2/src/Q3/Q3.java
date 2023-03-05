package Q3;

public class Q3 {

    public static void main(String[] args){
       Try ob = new Try();
       try{
           ob.check();
       }catch(NoClassDefFoundError e){
           System.out.println(e);
       }
        try{
            ob.check1();
        }catch(ClassNotFoundException e){
            System.out.println(e);
        }

        //catch(ClassNotFoundException e){
        //            System.out.println(e.getMessage);
              // e.printStackTrace;
        //        }
    }
}
