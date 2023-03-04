//Q2) Write a program to read user input
// until user writes XDONE and then show the entered text by the user on commandline

import java.util.ArrayList;
//import java.util.List;
import java.util.Scanner;
import java.util.List;

public class Ques2 {

    public static void main(String [] args){
        System.out.println("enter your string");
        List<String> st = new ArrayList<>();
        Scanner scn = new Scanner(System.in);
        while(true){
            String str = scn.nextLine();
            if(str.equals("XDONE")) {
                break;
            }
            st.add(str);
        }

        for(int i= 0 ; i< st.size()  ; i++){
            System.out.println(st.get(i));
        }
    }

}
