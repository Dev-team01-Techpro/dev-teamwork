package loops;

import java.util.Scanner;

public class ForLoop {
    public static void main(String[] args) {
        /*
            For
            for (durum 1; durum 2; durum 3) {
              // çalışacak kod bloğu
            }
        */
//        for(int i = 0; i <= 10; i += 2){
//            System.out.println(i);
//        }
        /*
            Java ile faktöriyel hesaplayan program yazıyoruz.
            (n!) = 1 * 2 * 3 * 4 * ... * n
            Ornek (5!) = 1 * 2 * 3 * 4 * 5 = 120
         */

        int n, total = 1;
        Scanner input = new Scanner(System.in);
        System.out.println("Bir sayi giriniz : ");
        n = input.nextInt();


        if(n>0){
            for(int i = 1; i <= n; i++ ){
                    total = total * i;
                //    1   =   1   * 1
                //    1   =   1   * 2
                //    2   =   2   * 3
                System.out.println("total = " + total);
            }
        } else {
            System.out.println("Dogru sayi giriniz : ");
        }




    }
}
