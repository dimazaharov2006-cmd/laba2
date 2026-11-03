package laba2;
import java.util.Scanner;
public class Example3 {
    public static void main(String[] args) {
        // TODO Auto-generated method stub
        Scanner in = new Scanner(System.in);
        System.out.println("Введите число которое делиться на 5 с остатком 2 и на 7 с остатком 1: ");
        int number = in.nextInt();

        if (number % 5 == 2 && number %7 == 1)
            System.out.println("Число подходит под условие!");
        else
            System.out.println("Число не подходит по условие!");

    }

}
