package oopIntro;

public class Main {

	public static void main(String[] args) {
		//Diziler: i�inde birden fazla eleman� tuttu�umuz yap�lard�r.
		//Ger�ek hayat da  dizileri s�ralamak yerine objeleri kullan�r�z.
		//class'lar referans tiptirrrrr.
		//methodlar: i� yapan kod bloklar�d�r.
		// her class ve her method 1 i�i yapmakla h�k�ml�d�r.
		Product product1 = new Product(1,"Lenovo V14", 15000,"16 GB Ram"); //�rnek olu�turma,referans olusturma,intance
		
		
		
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
		
		
		
		Product[] products = {product1,product2,product3}; //�o�ul kullan�yorsak o dizidir.
		for (Product product : products) {
			System.out.println(product.name);
			
		}
			
			System.out.println(products.length);
			
			Category category1 = new Category();
			category1.id =1;
			category1.name="Bilgisayar";
			
			Category category2= new Category();
			category2.id =2;
			category2.name="Ev/Bah�e";
			
			
			ProductManager productManager  = new ProductManager(); //farkl� sayfalarda meth�d yazma sebebimiz farkl� yada ayn� sayfalarda birden fazla �a��rmakt�r.
			productManager.addToCart(product1);
			productManager.addToCart(product2);
			productManager.addToCart(product3);
			
	}

}
