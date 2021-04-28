package inheritance;
//sýnýflarýmýzda bazý operasyonlar ortak ise inheritance mimarisinden yararlanýlýr.
//bir class ne yapabiliyorsa sadece onlarý barýndýrmalý.

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


