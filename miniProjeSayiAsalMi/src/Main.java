public class Main {

    public static void main(String[] args) {
    	//bug
	    int number = 13;
	    int remainder = number % 2;
	    //System.out.println(remainder);
	    boolean isPrime = true;
	    if(number==1){
	    	System.out.println("Sayı asal değilidir.");
	    	return;
		}
	    if (number<2){
	    	System.out.println("geçersiz sayı girdiniz.");
		}

	    for(int i=2; i<number;i++){
	        if (number % i==0){
	            isPrime=false;
            }
        }
	    if(isPrime){
	        System.out.println("sayı asaldır.");
        }else{
	        System.out.println("sayı asal değildir.");
        }
    }
}
