//Use iterator stream method to generate a stream

package Q4;

import java.util.stream.DoubleStream;
import java.util.stream.IntStream;

public class q4 {
    public static void main(String[] args) {

        IntStream it =  IntStream.iterate(0,i-> i<=20 ,i->i+2);
                it.forEach(System.out::println);

    }
}
