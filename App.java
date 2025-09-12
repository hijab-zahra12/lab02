public class App{

	public static void main(String[] args){

		Product product1 = new Product("Television", 103, 56000.0, true);
		Product product2 = new Product("Phone", 132, 34400.0, true);
		Product product3 = new Product("Laptop", 73, 66000.0, false);
		Product product4 = new Product("LCD", 23, 236000.0, true);

		product1.setName("Computer");
		product1.setPrice(89327.32);
	
		System.out.println(product1.getName());

		product1.display();
		product2.display();




	}





}