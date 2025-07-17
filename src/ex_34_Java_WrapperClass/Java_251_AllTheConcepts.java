package ex_34_Java_WrapperClass;

public class Java_251_AllTheConcepts {

    public static void main(String[] args) {

        Mobile iphone = new Mobile(1, "iphone16", 12000.00);
        Mobile samsung = new Mobile(1, "ultra 24", 14000.00);

        iphone.setPrice(20000.00);
        iphone.display();
        samsung.display();
        System.out.println(Mobile.mobile_carrier);
        Mobile.switchOnAirplaneMode();

    }


}

class Mobile extends OldPhone{

    public Integer getPhone() {
        return phone;
    }

    public void setPhone(Integer phone) {
        this.phone = phone;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Double getPrice() {
        return price;
    }

    public void setPrice(Double price) {
        this.price = price;
    }

    private Integer phone;
    private String name;
    private Double price;
    static String mobile_carrier = "airtel";

    public Mobile() {
        System.out.println("Default constructor");
    }

    public Mobile(Integer phone, String name, Double price) {
        this.phone = phone;
        this.name = name;
        this.price = price;
    }

    void display(){
        System.out.println(phone + name + price);
    }

    void priceChange(Integer price){
        System.out.println("change price in integers");
    }

    void priceChange(Double price){
        System.out.println("change price in decimals");
    }

    static void switchOnAirplaneMode(){
        System.out.println("Common Airplane mode");
    }


}

class OldPhone implements SIMCard{


    @Override
    public void enterCard() {
        System.out.println("Entered Card details");
    }

    void calling(){
        System.out.println("dialpad");
    }


}

interface SIMCard {

    void enterCard();
}
