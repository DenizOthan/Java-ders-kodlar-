package inheritance2;

public class LogManager {
	public void log(int logType) {
		if(logType==1) {
			System.out.println("Veri Taban�na Logland�.");
		}else if(logType== 2) {
			System.out.println("Dosyaya logland�.");
		}else {
			System.out.println("Email g�nderildi");
		}
		
	}

}
//1-- Database
//2--  f�LE
//3-- Email
