package Q3;

public class Try {

    public void check() throws NoClassDefFoundError{
        int p = 90;
        if(p==90){
            System.out.println(" 1st Executed code ,throw error now");
            throw new NoClassDefFoundError();
        }
    }

    public void check1() throws ClassNotFoundException{
        int a= 5;
        if(a==5){
            System.out.println("2nd executed code , throw error");
            throw new ClassNotFoundException();
        }
    }
}
