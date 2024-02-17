package objectbasic;

public class Pen {
    //States

    /*
    Brand Name - String
    Price - float
    Color - String
    Type of stroke weight - String
    Type of pen (gel pen, ballpoint, roller ball) - String
    Type of body (metal or plastic) - String
    Has click-top - boolean
    Size - float
    Is refillable - boolean
    Is waterproof - boolean
    Weight - float
     */
    String brandName;
    double price;
    String color;
    String strokeWeight;
    String penType;
    String penBodyType;
    boolean clickTop;
    float size;
    boolean inkRefillable;
    boolean inkWaterproof;
    double weight;
    @Override
    public String toString() {
        return "Pen{" +
                "brandName='" + brandName + '\'' +
                ", price=" + price +
                ", color='" + color + '\'' +
                ", strokeWeight='" + strokeWeight + '\'' +
                ", penType='" + penType + '\'' +
                ", penBodyType='" + penBodyType + '\'' +
                ", clickTop=" + clickTop +
                ", size=" + size +
                ", inkRefillable=" + inkRefillable +
                ", inkWaterproof=" + inkWaterproof +
                ", weight=" + weight +
                '}';
    }
    public static void main(String[]args){
        Pen topSeller = new Pen();
        topSeller.brandName = "Pilot";
        System.out.println(topSeller);

    }

    //Constructors

    //Behaviour (Method / Function)
}
