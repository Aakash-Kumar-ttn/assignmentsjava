package Q3;


interface first{
    default void eat(){
        System.out.println("i am eat 1");
    };
}
interface sec{
    default void eat(){
        System.out.println("i am eat 2");
    };
}

class child implements first,sec {
    public void eat() {
        System.out.println("eat both");
    }
}
    public class q3 {

        public static void main(String [] args){
            child ch = new child();
            ch.eat();
        }
    }
