public class Main {

    public static void main(String[] args) {

	String[] ogrenciler = new String[5];
	ogrenciler[0]="deniz";
	ogrenciler[1]="sude";
	ogrenciler[2]="ali";
	ogrenciler[3]="elif";
	ogrenciler[4]="ahmet";
	for(int i=0;i<ogrenciler.length;i++){
	    System.out.println(ogrenciler[i]);
    }
	for(String ogrenci:ogrenciler){
		System.out.println(ogrenci);
	}

    }
}
