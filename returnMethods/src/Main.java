public class Main {
        public static int power(int a, int b){     //void'li methodlar geriye bir değer döndürmezler.
            int result=1;
            for(int i=1; i<=b; i++){
                result *=a;
            }
          return result;
        }
    public static void power2(int a, int b){     //void'li methodlar geriye bir değer döndürmezler.
        int result=1;
        for(int i=1; i<=b; i++){
            result *=a;
        }
       System.out.println(result);
    }
    public static void main(String[] args) {
           int r2 = power(2,3);
           System.out.println((r2));

    }
}
