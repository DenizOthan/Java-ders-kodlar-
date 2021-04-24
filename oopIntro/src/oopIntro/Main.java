package oopIntro;

public class Main {

	public static void main(String[] args) {
		//Diziler: içinde birden fazla elemaný tuttuðumuz yapýlardýr.
		//Gerçek hayat da  dizileri sýralamak yerine objeleri kullanýrýz.
		//class'lar referans tiptirrrrr.
		//methodlar: iþ yapan kod bloklarýdýr.
		// her class ve her method 1 iþi yapmakla hükümlüdür.
		Product product1 = new Product(1,"Lenovo V14", 15000,"16 GB Ram"); //Örnek oluþturma,referans olusturma,intance
		
		
		
		Product product2 = new Product(); 
		product2.id = 2;
		product2.name = "Lenovo V15";
		product2.unitPrice = 16000;
		product2.detail = "32 GB Ram";
		
		
		Product product3 = new Product(); 
		product3.id = 3;
		product3.name = "Hp 5";
		product3.unitPrice = 10000;
		product3.detail = "8 GB Ram";
		
		
		
		Product[] products = {product1,product2,product3}; //çoðul kullanýyorsak o dizidir.
		for (Product product : products) {
			System.out.println(product.name);
			
		}
			
			System.out.println(products.length);
			
			Category category1 = new Category();
			category1.id =1;
			category1.name="Bilgisayar";
			
			Category category2= new Category();
			category2.id =2;
			category2.name="Ev/Bahçe";
			
			
			ProductManager productManager  = new ProductManager(); //farklý sayfalarda methýd yazma sebebimiz farklý yada ayný sayfalarda birden fazla çaðýrmaktýr.
			productManager.addToCart(product1);
			productManager.addToCart(product2);
			productManager.addToCart(product3);
			
	}

}
