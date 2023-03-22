package Q1;

public enum enumclass {

    ITS_2BHK_HOUSE(10000) ,   ITS_3BHK_HOUSE(20000) ,   ITS_5BHK_HOUSE(40000);

    private int price;


    //enum constructor by default private
    private enumclass(int price){
        this.price=price;
    }
    public int getPrice() {
        return this.price;
    }
}
