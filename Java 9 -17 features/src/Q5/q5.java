//Use ifPresentOrElse, or, orElseThrow Operations with Optional

package Q5;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;
import java.util.stream.IntStream;

public class q5 {
    public static void main(String[] args) throws Exception {

        List<Integer> list = Arrays.asList(1,2,3,4,5,6,7,8,9);

        list.stream().filter(e->e>9)
                .findFirst().ifPresentOrElse(System.out::println, ()-> System.out.println("value not printed"));

      list.stream().filter(e->e>9).findFirst()
              .or(()-> Optional.of(-1))
              .ifPresent(System.out::println);

      list.stream().filter(e->e>9).findFirst()
              .orElseThrow(()->new Exception("tis is my exception"));

    }
}
