public class Main {

    public static void main(String[] args) {
    double[] myLıst={4.1,1.3,2.5};
    double total=0;
    double max=myLıst[0];

    for(double number:myLıst){
        if(max<number){
            max=number;
        }
        total =total+number;
        System.out.println(number);
    }
    System.out.println("TOPLAM:"+total);
    System.out.println("EN BÜYÜK:"+max);
    }
}
