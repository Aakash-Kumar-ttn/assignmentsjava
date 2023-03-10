package Q9;

//Create Unmodifiable List from a Steam

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class q9 {
    public static void main(String[] args) {

//        List<Integer> list = Arrays.asList(1,2,3,4,5,6,7,8,9,10);
//        list.add(5); ->  this show asList also make list immutable


        // without stream
//        List<Integer> list = new ArrayList<>();
//        list.add(1);
//        list.add(2);
//        list.add(3);
//        list.add(4);
//        list.add(5);
//        list.add(8);
//
//        //System.out.println(list);
//        List<Integer> unmodifiable = List.copyOf(list);
//        unmodifiable.add(5);

        //with stream method

        List<Integer> list = Stream.of(1,2,3,4,5,6,7,8)
                .filter(e->e>4)
                .collect(Collectors.toUnmodifiableList());

        try{
            list.add(9);//this line gives Exception here we can not add to the list;
        }catch (Exception e){
            System.out.println("Not add");
        }
        System.out.println(list);
    }
}
