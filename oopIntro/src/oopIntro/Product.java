package oopIntro;

public class Product {
	//yapýcý blok(constructor) //olmasýný istediðimiz kod buraya  yazýlýr.
	
	public Product() {
		System.out.println("Ben Çalýþtým");
	}
	//imza oluþturma
	public Product(int id,String name,double unitPrice,String detail) {
		this();
		this.id=id;
		this.name=name;
		this.unitPrice=unitPrice;
		this.detail=detail;
		
	}
	int id;
	String name;
	double unitPrice;
	String detail;
	

}
