package polymorphism;

public class Mobile
 {
    int price;
    String name;
    Mobile(int price)
    {
    	this.price=price;
    }
    Mobile(int price,String name)
    {
    	this(price);
    	this.name=name;
    }
}
