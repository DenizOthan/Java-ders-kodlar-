package inheritance2;
//bir i� yapan s�n� fba�ka i� yapan s�n�f� kulllanacaksa somut s�n�ftan giidlmez.

public class CustomerManager {
	public void add(Logger logger) {
		//m��teri ekleme kodlar�
		System.out.println("M��teri eklendi");
		logger.log();
		
	}

}
