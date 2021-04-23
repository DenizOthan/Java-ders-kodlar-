public class Main {

    public static void main(String[] args) {
        char grade = 'C';
        switch (grade) {
            case 'A':
                System.out.println("Mükemmel geçtiniz.");
                break;
            case 'B':
                System.out.println("ÇOK GÜZEL GEÇTİNİZ");
            case 'C':
                System.out.println("İYİ GEÇTİNİZ");
            case 'D':
                System.out.println("FENA DEĞİL GEÇTİNİZ.");
            case 'F':
                System.out.println("MAALESEF KALDINIZ.");
                break;
            default:
                System.out.println("GEÇERSİZ NOT GİRDİNİZ.");
        }
    }
}
