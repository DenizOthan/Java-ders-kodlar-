package intro;

public class Main {

	public static void main(String[] args) {
		//camelCase
		//Don't repeat yourself
		
		String internetSubeButonu ="Ýnternet Þubeye gir";
		double dolarDun = 8.20;
		double dolarBugun = 8.20;
		int vade = 36;
		boolean  dustuMu=false;
		
		System.out.println(internetSubeButonu);
		 
		
		if(dolarBugun<dolarDun) {
			System.out.println("Dolar düþtü resmi");
			
		}else if(dolarBugun>dolarDun) {
			
			System.out.println("Dolar yükseldi resmi");
		}
		
		else {
			System.out.println("Dolar eþittir resmi");
			
		}
		String kredi1 = "Hýzlý kredi";
		String kredi2 = "Mutlu Emekli kredisi";
		String kredi3 = "Konut Kredisi";
		String kredi4 = "Çiftçi kredisi";
		String kredi5 = "Msb kredisi";
		String kredi6 = "Meb kredisi";
		String kredi7 = "kültür bakanlýðý kredisi";
		
		
		
		System.out.println(kredi1);
		System.out.println(kredi2);
		System.out.println(kredi3);
		System.out.println(kredi4);
		System.out.println(kredi5);
		System.out.println(kredi6);
		System.out.println(kredi7);
		
		
		
		String[] krediler = 
			{       "Hýzlý kredi",
					"Mutlu Emekli kredisi",
					"Konut Kredisi",
					"Çiftçi kredisi",
					"Msb kredisi",
					"Meb kredisi",
					"kültür bakanlýðý kredisi"};
		//foreach
		for(String kredi :krediler) {
			System.out.println(kredi);
		}
		//sayaç güdümlü döngü
		for (int i=0; i<krediler.length;i++) {
			System.out.println(krediler[i]);
			
		}
		int sayi1 = 10;
		int sayi2= 20;			 //DEÐER TÝP (int string bool)
		sayi1 = sayi2;			//sayi1in deðeri eþittir sayi2 olur ve yeni sayi1=20 olur.
		sayi2= 100;			   //sayi 2=100
		System.out.println(sayi1);
		
		int[] sayilar1 = { 1,2,3,4,5};
		int[] sayilar2= {10,20,30,40,50};
		sayilar1 = sayilar2;	//ARRAYLER REFERANS TÝPTÝR. SAYILAR1ÝN ADRESÝ=SAYILAR2
							   //DÝZÝLER CLASSLAR ÝNTERFACLER ABSTRACTLAR REFERANS TÝPLERDÝR.
		sayilar2[0] =100;
		System.out.println(sayilar1[0]);
		
		String sehir1 = "ankara";
		String sehir2 = "istanbul";
		sehir1=sehir2;
		sehir2="izmir";
		System.out.println(sehir1);

		
		
		

	
		
		
		
	}

}
