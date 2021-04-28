package inheritance2;
//bir iþ yapan sýný fbaþka iþ yapan sýnýfý kulllanacaksa somut sýnýftan giidlmez.

public class CustomerManager {
	public void add(Logger logger) {
		//müþteri ekleme kodlarý
		System.out.println("Müþteri eklendi");
		logger.log();
		
	}

}
