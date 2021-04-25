public class Main {
    //Javada iş yapan herşey class'dır.
    // Ana kural:classların temel özelliği gruplama yapmaktır.
    //Bellekte 2 tane alan vardır(Stack,Heap)
    //Stackde CM tanımlanır,Heapde ise CM için bir adet nesne oluşuyor.
    public static void main(String[] args) {
        CustomerManager customerManager =new CustomerManager();
        CustomerManager customerManager2 =new CustomerManager();
        customerManager=customerManager2; //customerManager referans numarası=customeManager2 demektir.
        customerManager.Add();
        customerManager.Remove();
        customerManager.Update();

        int sayi1= 10;
        int sayi2= 20;
        sayi2=sayi1;        //sayi2'nin değeri eşittir sayi1
        sayi1= 30;
        System.out.println(sayi2);
//Diziler referans tiptir!!!
        int[] sayilar1= new int[]{1,2,3,};
        int[] sayilar2= new int[]{8,9,7};
        sayilar2=sayilar1;  //sayılar2nin referans numarası=sayılar1in referans numarasına eşittir.
        sayilar1[0]=10;
        System.out.println(sayilar2[0]);

    }
}

