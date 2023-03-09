//Q1) Write the following a functional interface and implement it using lambda:
//
//To check whether the first number is greater than second number or not,
// Parameter (int ,int ) Return type boolean
//Increment the number by 1 and return incremented value Parameter (int) Return int
//Concatination of 2 string Parameter (String , String ) Return (String)
//Convert a string to uppercase and return . Parameter (String) Return (String)
package Q1;

public class q1 {

public static void main(String []args){

//checkgreat

    Whogreater ob = (int a,int b)->{
        if(a>b)
            return true;
        else
            return false;
};
    System.out.println(ob.tocheck(5,6));
//increment

    increment ob2 = (int a)->{
    a++;
    return a;
    };
    System.out.println(ob2.incre(7));

    //concat
    concat ob3 = (str1,str2)->{
        return str1+str2;
    };
    System.out.println(ob3.cc("akash","kumar"));

    //upcase

    uppercase ob4 = (String str)->{
       return str.toUpperCase();
    };
    System.out.println(ob4.upp("lowercase"));
}

}
