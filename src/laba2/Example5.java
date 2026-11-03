package laba2;
import java.util.Scanner;
public class Example5 {

    public static void main(String[] args) {
        // TODO Auto-generated method stub
        Scanner in = new Scanner(System.in);

        System.out.println("Введите число от 5 до 10");

        int number = in.nextInt();

        if ( number <= 10 && number >= 5)
            System.out.println("Число соответствует!");
        else
            System.out.println("Число не соответствует!");
    }}
