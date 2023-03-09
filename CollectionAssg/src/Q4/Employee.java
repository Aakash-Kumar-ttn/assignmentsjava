package Q4;
import java.util.Objects;
public class Employee {
    private String name;
    private int age;
    private String destination;

    public Employee(String name, int age, String destination) {
        this.name = name;
        this.age = age;
        this.destination = destination;
    }

    public int hashCode(){
        return Objects.hash(this.name , this.age , this.destination );
    }

    public boolean equals(Object obj){
        Employee e = (Employee) obj;
        return e.name.equals(this.name) && e.age == this.age && e.destination.equals(this.destination);
    }
   public String toString(){
        return "NAME-> " + this.name + " age-> " + this.age ;
    }
}
