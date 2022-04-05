import java.util.Scanner;
import java.util.SortedMap;

public class asalSayi {
    static boolean prime(int n) {
        boolean durum =true;

        for (int i = 2; i < n; i++) {
            if (n % i == 0) {
                durum=false;
                break;
            }
        }
        return durum;
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

       while (true){
           System.out.print("Sayı Giriniz :");
           int n = input.nextInt();

           boolean drm= prime(n);
           if (drm){
               System.out.print(n + " " + "Asal Sayıdır.\n");
           } else {
               System.out.print(n + " " + "Asal Sayı Değildir.\n");
           }
       }

    }
}
