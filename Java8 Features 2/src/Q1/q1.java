package Q1;

import org.w3c.dom.ls.LSOutput;

import java.util.function.Consumer;
import java.util.function.Predicate;
import java.util.function.Supplier;
import java.util.function.Function;
public class q1 {

    static String name = "aakash";

    public static void main(String[] args) {


        //consumer

        Consumer c1 = (a) -> {
            System.out.println("this is our integer -> " + a);
        };

        c1.accept(7);

        //predicate

        Predicate<Integer> pd = (income) -> {
            if (income > 50000) {
                return true;
            } else
                return false;
        };
        System.out.println(pd.test(70000));

        //supplier

        Supplier s1 = () -> name.toUpperCase();

        System.out.println(s1.get());

        //function

        Function<Integer, Integer> fn = (e) -> e*e;
        System.out.println(fn.apply(6));

    }
}