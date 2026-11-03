package laba2;
import java.util.Scanner;
public class Example4 {

    public static void main(String[] args) {
        // TODO Auto-generated method stub

        Scanner in = new Scanner(System.in);

        System.out.println("Введите число больше 10 и делящееся на 4");
        int number = in.nextInt();


        if (number >= 10 && number %4 == 0 )
            System.out.println("Число соответствует!");
        else
            System.out.println("Число не соответствует!");}

}