public class Product {

	private String name;
	private int id;
	private double price;
	private boolean isAvailable;

	Product(String name, int id, double price, boolean isAvailable){

		this.name = name;
		this.id = id;
		this.price = price;
		this.isAvailable = isAvailable;
	}
	void setName(String name){
		this.name = name;
	}
	void setId(int id){
		this.id = id;
	}
	void setPrice(double price){
		this.price = price;
	}
	void setIsavailable(boolean isAvailable){
		this.isAvailable = isAvailable;
	}
	String getName(){
		return name;
	}
	int getId(){
		return id;
	}
	double getPrice(){
		return price;
	}
	boolean getIsavailable(){
		return isAvailable;
	}
	void display(){
	System.out.println("Name of Product: "+name);
	System.out.println("Id of Product: "+id);
	System.out.println("Price of Product: "+price);
	System.out.println("Availability of Product: "+isAvailable);
	}



}