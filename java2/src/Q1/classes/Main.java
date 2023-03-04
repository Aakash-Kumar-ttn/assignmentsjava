package Q1.classes;
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        System.out.println("Hello world!");
//        Name, headofficeAddress, chairmanName, branchCount, fdInterestRate,
//        personalLoanInterestRate, homeLoanInterestRate.

        SBI b = new SBI();


        System.out.println("Enter The B name");
        b.setName(scn.nextLine());
        System.out.println("Enter The HofficeName name");
        b.setHeadofficeAdress(scn.nextLine());
        System.out.println("Enter The ChairName ");
        b.setChairmanName(scn.nextLine());

        System.out.println("Enter The Branch Count");
        b.setBranchCount(scn.nextInt());
        System.out.println("Enter The Personal Loan Interest");
        b.setPersonalLoanInterestRate(scn.nextInt());
        System.out.println("Enter The HomeLoanInterestRate bank");
        b.setHomeLoanInterestRate(scn.nextInt());


        System.out.println(b);

    }
}
