package Q10;
//Demonstrate the use of repeat, strip, isBlank, indent, transform,
// stripIndent, translateEscapes, formatted String methods.
public class q10 {
    public static void main(String[] args) {

        //repeat
        String str = "Aaksh";
        System.out.println(str.repeat(5));



       //strip
        String str2 = "                 Akash    ";
        System.out.println(str2.strip());



        //isBlack
        String st = " \t\n  " ;
        System.out.println(st.isBlank());


        //indent,
     String str3 = "      My name is akash";
        System.out.println(str3.indent(-20));
        System.out.println(str3.indent(10));

        //transform
        String st4 = "aakash";
        String rs  =  st4.transform(string-> new  StringBuilder(string)
                .reverse().toString());
        System.out.println(rs);

//stripIndent,

        String str5 = "      i am tired now     ";
        System.out.println(str5.stripIndent());

        //translateEscapes

        String st6 = " this is my name,\taakash kumar karn\n now this new line";
        //System.out.println(st6);
        System.out.println(st6.translateEscapes());

        //formatted
        System.out.println("1. %s 2. %s 3. %s ".formatted("one", "two", "three"));

    }

}

