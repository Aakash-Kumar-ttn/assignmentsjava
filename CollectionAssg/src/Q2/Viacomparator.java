package Q2;

import java.util.Comparator;

public class Viacomparator implements Comparator<Employee> {

    public int compare(Employee ob1 , Employee ob2){
        if(ob1.getSalary() >= ob2.getSalary() ){
            return 1;
        }else{
            return -1;
        }
    }
}
