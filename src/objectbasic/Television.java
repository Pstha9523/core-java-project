package objectbasic;

public class Television {
    //States

    /*
    Brand Name - String
    Price - float
    Size - float
    Screen resolution - int
    Screen type - String
    Is smart TV - boolean
    Has bluetooth - boolean
    Has HDMI - boolean
    Has Displayport - boolean
    Can mount - boolean
    Is curved - boolean
    Has AI support - boolean
    Has stand - boolean
    */
    String brandName;
    double price;
    double size;
    int screenRes;
    String screenType;
    boolean smartTV;
    boolean bluetooth;
    boolean hdmi;
    boolean displayport;
    boolean mountable;
    boolean curved;
    boolean aiSupport;
    boolean stand;

    @Override
    public String toString() {
        return "Television{" +
                "brandName='" + brandName + '\'' +
                ", price=" + price +
                ", size=" + size +
                ", screenRes=" + screenRes +
                ", screenType='" + screenType + '\'' +
                ", smartTV=" + smartTV +
                ", bluetooth=" + bluetooth +
                ", hdmi=" + hdmi +
                ", displayport=" + displayport +
                ", mountable=" + mountable +
                ", curved=" + curved +
                ", aiSupport=" + aiSupport +
                ", stand=" + stand +
                '}';
    }
    public static void main(String[]args){
        Television topSell = new Television();
        topSell.brandName = "Samsung";
        System.out.println(topSell);


    }
//Constructors

    //Behaviour (Method / Function)
}
