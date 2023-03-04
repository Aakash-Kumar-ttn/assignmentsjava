package Q1.classes;

   abstract class Bank {

    public String name ;
    public String headofficeAdress;;
    public String chairmanName ;
    public int branchCount;
    public int fdInterestRate ;

    public int personalLoanInterestRate ;

    public int homeLoanInterestRate;

    public String getName() {
        return name;
    }

    public String getHeadofficeAdress() {
        return headofficeAdress;
    }

    public String getChairmanName() {
        return chairmanName;
    }

    public int getBranchCount() {
        return branchCount;
    }

    public int getFdInterestRate() {
        return fdInterestRate;
    }

    public int getPersonalLoanInterestRate() {
        return personalLoanInterestRate;
    }

    public int getHomeLoanInterestRate() {
        return homeLoanInterestRate;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setHeadofficeAdress(String headofficeAdress) {
        this.headofficeAdress = headofficeAdress;
    }

    public void setChairmanName(String chairmanName) {
        this.chairmanName = chairmanName;
    }

    public void setBranchCount(int branchCount) {
        this.branchCount = branchCount;
    }

    public void setFdInterestRate(int fdInterestRate) {
        this.fdInterestRate = fdInterestRate;
    }

    public void setPersonalLoanInterestRate(int personalLoanInterestRate) {
        this.personalLoanInterestRate = personalLoanInterestRate;
    }

    public void setHomeLoanInterestRate(int homeLoanInterestRate) {
        this.homeLoanInterestRate = homeLoanInterestRate;
    }

}
