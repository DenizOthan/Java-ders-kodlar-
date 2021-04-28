package oopIntro;

public class Product {
	//yapýcý blok(constructor) //olmasýný istediðimiz kod buraya  yazýlýr.
	//encapsulation 
	//get okumak için --- set yazmak için kullanýlýr.
	private int id;
	private String name;
	private double unitPrice;
	private String detail;
	private double discount;
	
	public Product() {
		
	}

	public Product(int id, String name, double unitPrice,
			String detail,double discount) {
		super();
		this.id = id;
		this.name = name;
		this.unitPrice = unitPrice;
		this.detail = detail;
		this.discount=discount;
		
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {		//return = buradaki ürüne bir sey set edilir.
		return name;
	}
	public void setName(String name) {			//b
		this.name = name;
	}
	public double getUnitPrice() {
		return unitPrice;
	}
	public void setUnitPrice(double unitPrice) {
		this.unitPrice = unitPrice;
	}
	public String getDetail() {
		return detail;
	}
	public void setDetail(String detail) {
		this.detail = detail;
	}
	public double getDiscount() {
		return discount;
	}
	public void setDiscount(double discount) {
		this.discount = discount;
	}
	public double getUnitPriceAfterDiscount() {
		return this.unitPrice-(this.unitPrice * this.discount / 100);
	}
	

	

}
