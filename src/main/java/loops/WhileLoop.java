package loops;

import java.util.Scanner;

public class WhileLoop {
    public static void main(String[] args) {
        /*
        While
        Parantezler içindeki değer dogru(true) olduğu sürece döngü dönmeye devam eder ve kod bloğu çalışır.
        */
//        int i = 1;
//        String str = "Test";
//        System.out.println(str);
//        while (i < 3){
//            str = "Testt";
//            System.out.println(str);
//            i++;
//        }

        Scanner input = new Scanner(System.in);
        String password = "1234";
        boolean passwordControl = true;

        while (passwordControl){
            System.out.println("Password giriniz : ");
            String typedPassword = input.next();

            if(password.equals(typedPassword)){
                passwordControl = false;
                System.out.println("Basarili sekilde giris yapildi");
            }

        }

    }
}
