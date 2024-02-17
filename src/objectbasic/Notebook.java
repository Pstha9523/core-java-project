package objectbasic;

public class Notebook {

    //States
    /*
    Color - String
    Size - float
    Number of pages - int
    Has dividers - boolean
    Has paper protector - boolean
    Has grid - boolean
    Has Spiral - boolean
    Can refill pages - boolean
    Brand Name - String
    Is Hardcover - boolean
    Price - float
    Has calendar - boolean
    Has bookmark - boolean
    */

    @Override
    public String toString() {
        return "Notebook{" +
                "color='" + color + '\'' +
                ", size=" + size +
                ", numPages=" + numPages +
                ", divider=" + divider +
                ", paperProtector=" + paperProtector +
                ", grid=" + grid +
                ", spiral=" + spiral +
                ", pageRefillable=" + pageRefillable +
                ", brandName='" + brandName + '\'' +
                ", hardCover=" + hardCover +
                ", price=" + price +
                ", calendar=" + calendar +
                ", bookmark=" + bookmark +
                '}';
    }

    String color;
    float size;
    int numPages;
    boolean divider;
    boolean paperProtector;
    boolean grid;
    boolean spiral;
    boolean pageRefillable;
    String brandName;
    boolean hardCover;
    double price;
    boolean calendar;
    boolean bookmark;

public static void main(String[]args){
    Notebook colorful = new Notebook();
    colorful.color = "pink";
    System.out.println(colorful);

}



    //Constructors

    //Behaviour (Method / Function)
}
