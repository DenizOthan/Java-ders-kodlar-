public class Product {

    //Herbir classın kendi ismiyle constructorı vardır.
    public Product(int id,String name,String desscription,double price,int stockAmount,String renk){
        System.out.println("Yapıcı blok çalıstı.");

    }
    public Product(){

    }

    //attribute/field
    private int id;
    private String name;
    private String desscription;
    private double price;
    private int stockAmount;
    private String renk;
    private String kod;
    //getter
    public int getId(){   //id yi okuyabilir ama yazamaz.
        return id;
    }
    //setter
    public void setId(int id){              //set demek git onun değerini kur demektir.Bu yüzden void kullanırız.
        this.id=id;                         //this içinde bulunduğumuz classdır.
    }


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDesscription() {
        return desscription;
    }

    public void setDesscription(String desscription) {
        this.desscription = desscription;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public int getStockAmount() {
        return stockAmount;
    }

    public void setStockAmount(int stockAmount) {
        this.stockAmount = stockAmount;
    }

    public String getRenk() {
        return renk;
    }

    public void setRenk(String renk) {
        this.renk = renk;
    }

    public String getKod() {
        return this.name.substring(0,1)+id;
    }


}
