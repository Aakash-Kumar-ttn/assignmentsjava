//Use rangeClosed to create a  Stream

package Q3;

import java.util.stream.IntStream;

public class q3 {
    public static void main(String [] args){
        IntStream.range(1,10).forEach(System.out::println);
        System.out.println("This rangeClosed include final value of range also");
        IntStream.rangeClosed(1,10).forEach(System.out::println);

    }
}
