package oopIntro;

public class Product {
	//yap�c� blok(constructor) //olmas�n� istedi�imiz kod buraya  yaz�l�r.
	
	public Product() {
		System.out.println("Ben �al��t�m");
	}
	//imza olu�turma
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
