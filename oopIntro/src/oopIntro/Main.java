package oopIntro;

public class Main {

	public static void main(String[] args) {
		//Diziler: i�inde birden fazla eleman� tuttu�umuz yap�lard�r.
		//Ger�ek hayat da  dizileri s�ralamak yerine objeleri kullan�r�z.
		//class'lar referans tiptirrrrr.
		//methodlar: i� yapan kod bloklar�d�r.
		// her class ve her method 1 i�i yapmakla h�k�ml�d�r.
		Product product1 = new Product(1,"Lenovo V14", 15000,"16 GB Ram",10); //�rnek olu�turma,referans olusturma,intance
		
		
		
		Product product2 = new Product(); 
		product2.setId(2);
		product2.setName("Lenovo V15");
		product2.setDetail("16 GB RAM");
		product2.setDiscount(10);
		product2.setUnitPrice(16000);
	System.out.println(product2.getUnitPriceAfterDiscount());
	Category category1 = new Category();
	category1.setId(1);
	category1.setName("i�ecek");
	
	Category category2 = new Category();
	category2.setId(2);
	category2.setName("yiyecek");
	
	System.out.println(category1.getName());
	System.out.println(category2.getName());
		
	}

}
