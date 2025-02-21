package basics;

import java.awt.*;

// week6 but under week3, RAC
public class Sept16Product {
    double price;
    String name;
    String category;
    String SKU;
    Color color;  //imported

    public static void main (String[] args)  {
       Color c = new Color(3,4,6);
       //Sept16Product obj1 = new Sept16Product();  no longer runs once the function below added
       Sept16Product obj1 = new Sept16Product("","elec","HUEUUK",1.99);
        obj1.name = "Samsung";
        obj1.category ="electronics";
        Sept16Product obj2 = new Sept16Product("Dell","electr", 39.99);
        obj2.name = "Apple";
        obj2.category ="electronics";
        System.out.println(obj1.category+" y obj1 SKU "+obj1.SKU);
        System.out.println(obj2.name+c.getBlue()+" obj2 blue "+obj2.category);
    }
//Sept17 overcast, Sept 18 chaining constructurs with super = parent class

    public Sept16Product(String name, String category, String SKU, double price) {

        this.name = "Levis ";
        this.category = "clothing";
        this.price = 29.99;
        System.out.println("super constructors "+this.price);
    }

    public Sept16Product(String name, String category, double price) {
        super(); //parent class has one more argument
        this.name = "Levis ";
        this.category = "";
        this.price = 29.99;
        System.out.println("constructors "+super.toString());
    }
}
