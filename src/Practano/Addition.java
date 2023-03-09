package Practano;

public interface Addition {
    int add(int a , int b);
}
class myaddition {
    public static void main(String [] args){
       Addition ad = new Addition() {
           @Override
           public int add(int a, int b) {
               return a+b;
           }
       };
        System.out.println(ad.add(7,8));
       //;

         //lamda
        Addition ad1 =(int a , int b)->{
           // System.out.println("this is by lamda " + );
            return a+b;
        };

        System.out.println(ad1.add(8,90));
    }
}
