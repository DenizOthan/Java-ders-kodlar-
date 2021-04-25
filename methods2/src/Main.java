public class Main {

    public static void main(String[] args) {
        String mesaj ="Bugün hava çok güzel";
        String yeniMesaj=sehirVer();
        System.out.println(yeniMesaj);
        int sayi= topla(5,7);
        System.out.println(sayi);
        f(4);
        power(2,3);
        power(3,2);
        int toplam = topla2(2,4,5,6);
        System.out.println(toplam);


    }
    public static void ekle(){
        System.out.println("Eklendi");
    }
    public static void sil(){
        System.out.println("Silindi");
    }
    public static void guncelle(){
        System.out.println("Güncellendi");
    }
    public static int topla(int sayi1,int sayi2){
        return  sayi1+sayi2;                            //Bu fonksiyon integer türünde bir değer döndürür.

    }
    public static String sehirVer(){
        return "Ankara";

    }
    public static int topla2(int...sayilar) {
        int toplam = 0;
        for (int sayi : sayilar) {
            toplam += sayi;
        }
        return toplam;
    }



    public static void f(int x){
        int result = (x+2)*6;
        System.out.println(result);
    }
    public static void power(int number1,int number2){
        int result = 1;
        for(int i=1; i<=number2;i++){
            result*=number1;

        }
        System.out.println("Cevap" + result);
    }


}
