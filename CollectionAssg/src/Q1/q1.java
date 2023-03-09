
//Write Java code to define List .
// Insert 5 floating point numbers in List, and using an iterator, find the sum of the numbers in List.
package Q1;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Scanner;

public class q1 {

    public static void main (String []args){
    Scanner scn = new Scanner(System.in);
        List<Float> list = new ArrayList<>();

        list.add(34.9999F);
        list.add(37.9999F);
        list.add(36.9999F);
        list.add(35.9999F);
        list.add(34.1234F);

        Iterator<Float> iterator = list.iterator();

        Float sum = 0.0F;

        while(iterator.hasNext()){
            float value  = iterator.next();
            sum+= value;
            System.out.println(value);

        }
        System.out.println("total sum is -> " + sum);
    }
}
