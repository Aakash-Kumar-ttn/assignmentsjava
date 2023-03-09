//2) Given the following class
//Employee class{ Double Age; Double Salary; String Name}
//Design the class in such a way that the default sorting should work on firstname and lastname
//Also, Write a program to sort Employee objects based on salary using Comparator.
package Q2;

import java.util.ArrayList;
import java.util.List ;
import java.util.Collections;
public class q2 {

      public static void main(String [] args){
              Employee e1= new Employee(24.0 , 15000.0, "zikas" , "kumar") ;
              Employee e2= new Employee(29.0 , 75000.0, "Roopak" , "kumar") ;
              Employee e3= new Employee(27.0 , 45000.0, "Aishal" , "pandey") ;
              Employee e4= new Employee(44.0 , 95000.0, "henna" , "dhamija") ;

              List<Employee> ls= new ArrayList<>();
              ls.add(e1);
              ls.add(e2);
              ls.add(e3);
              ls.add(e4);

              System.out.println(ls);
              //Collections.sort(ls); //this is donee by comparable(compareTo)
              //System.out.println(ls);
              Collections.sort(ls,new Viacomparator() );
              System.out.println(ls);

      }
}
