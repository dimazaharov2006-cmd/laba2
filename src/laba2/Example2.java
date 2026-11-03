package laba2;
import java.util.Scanner;
public class Example2 {

    public static void main(String[] args) {
        // TODO Auto-generated method stub
        Scanner in = new Scanner(System.in);

        System.out.println("Введите число: ");
        int number = in.nextInt();
        if (number % 3 == 0)
            System.out.println("Число делиться на 3!");
        else
            System.out.println("Число не делиться на 3!");

    }

}