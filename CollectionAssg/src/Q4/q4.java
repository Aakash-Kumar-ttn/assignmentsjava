//4) Create class Employee with attributes name,age,designation
// and use instances of these class as keys in a Map and their salary as value
package Q4;

import java.util.HashMap;
import java.util.Map;

public class q4 {

    public static void main(String [] args){

        Employee e1 = new Employee("vikas" , 65, "SDE") ;
        Employee e2 = new Employee("Roopak" , 34, "SDE2") ;
        Employee e3 = new Employee("zeesan" , 24, "SDE3") ;
       // Employee e4 = new Employee("zeesan" , 24, "SDE3") ;
        HashMap<Employee,Integer> hm = new HashMap<>();
        hm.put(e1,8000);
        hm.put(e2,9000);
        hm.put(e3,70000);
       // hm.put(e4,5000);

        for(Map.Entry<Employee,Integer> m : hm.entrySet()){
            System.out.println("key is " + m.getKey() + "   " + " salary "  + m.getValue());
        }
    }
}
