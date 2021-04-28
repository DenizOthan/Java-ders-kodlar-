package inheritance;
//s�n�flar�m�zda baz� operasyonlar ortak ise inheritance mimarisinden yararlan�l�r.
//bir class ne yapabiliyorsa sadece onlar� bar�nd�rmal�.

public class Main {

	public static void main(String[] args) {
	
		IndividualCustomer engin= new IndividualCustomer();
		engin.customerNumber= "12345";
		
		CorporateCustomer hepsiBurada= new CorporateCustomer();
		hepsiBurada.customerNumber= "78910 ";
		
		SendikaCustomer abc = new SendikaCustomer();
		abc.customerNumber="99999";
		
		
		CustomerManager customerManager =new CustomerManager();
		
		Customer[] customers = {engin,abc,hepsiBurada};
		customerManager.addMultiple(customers);
		
		
		//customerManager.add(hepsiBurada);
		//customerManager.add(engin);
		//customerManager.add(abc);
		
		
		
			
			
		}

	}


