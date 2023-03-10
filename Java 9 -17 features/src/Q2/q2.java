//Perform takeWhile and dropWhile operations on stream
package Q2;

import java.util.Arrays;
import java.util.List;
public class q2 {

    public static void main(String [] args){

        List<Integer> list = Arrays.asList(10,2,3,4,5,66,34);

        System.out.println("this is done by takeWhile");
        list.stream().takeWhile(e->e>10).forEach(System.out::println);
        System.out.println("this is done by doWhile");
        list.stream().dropWhile(e->e>10).forEach(System.out::println);

    }
}
