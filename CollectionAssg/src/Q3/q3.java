//Design a Data Structure SpecialStack that supports all the stack
// operations like push(), pop(), isEmpty(), isFull()
// and an additional operation getMin() which should return minimum element from the SpecialStack.
// (Expected complexity ­ O(1))
package Q3;

import java.util.Scanner;

public class q3 {

public static void main(String [] args){

    Scanner scn = new Scanner(System.in);
    System.out.println("size of stack");
    int ss = scn.nextInt();

    Mystack st = new Mystack(ss);

    int ch = 0;

    while(ch!=6){
        System.out.println(" 1.push \n 2.pop \n 3. size \n 4. isEmpty \n 5. display \n 6. exitTheProgram");
        ch=scn.nextInt();

        switch (ch){
            case 1:
                System.out.println("Enter element");
                int val = scn.nextInt();
                st.push(val);
                break;

            case 2:
                System.out.println("Remove element");
                st.pop();
                break;

            case 3:
                System.out.println("check size");
                System.out.println(st.size());
                break;

            case 4:
                System.out.println(st.isEmpty());
                break;

            case 5:
                st.display();
                break;


        }
    }
}
}
