package inheritance2;

public class LogManager {
	public void log(int logType) {
		if(logType==1) {
			System.out.println("Veri Tabanýna Loglandý.");
		}else if(logType== 2) {
			System.out.println("Dosyaya loglandý.");
		}else {
			System.out.println("Email gönderildi");
		}
		
	}

}
//1-- Database
//2--  fÝLE
//3-- Email
