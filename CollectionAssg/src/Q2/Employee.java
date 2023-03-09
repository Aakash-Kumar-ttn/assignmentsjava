package Q2;

public class Employee implements Comparable<Employee> {

    private Double age;
    private String FName;
    private Double salary;
    private String LName;

    Employee(Double age , Double salary, String FName , String LName){
        this.age=age;
        this.salary =salary ;
        this.FName=FName ;
        this.LName = LName ;
    }
    public Double getAge() {
        return age;
    }

    public String getFName() {
        return FName;
    }

    public Double getSalary() {
        return salary;
    }

    public String getLName() {
        return LName;
    }

    public void setAge(Double age) {
        this.age = age;
    }

    public void setFName(String FName) {
        this.FName = FName;
    }

    public void setSalary(Double salary) {
        this.salary = salary;
    }

    public void setLName(String LName) {
        this.LName = LName;
    }


public int compareTo(Employee obj){
        if(this.FName.compareTo(obj.FName ) > 0 ){
            return 1;
        }else if(this.FName.compareTo(obj.FName )  <0 ){
            return -1;
    }else if(this.FName.compareTo(obj.FName ) ==0) {

            if (this.LName.compareTo(obj.LName) > 0) {
                return 1;
            } else if (this.LName.compareTo(obj.LName) < 0) {
                return -1;
            } else {
                return 1;
            }
        }
        return 1;
}

   @Override
   public String toString(){
        return "first name->" + FName + "  last name-> " + LName +  "  salary-> " + salary ;
    }

}
