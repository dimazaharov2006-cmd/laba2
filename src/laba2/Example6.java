package laba2;
import java.util.Scanner;
    public class Example6 {

            public static void main(String[] args) {
                // TODO Auto-generated method stub
                Scanner in = new Scanner(System.in);

                System.out.println("Введите число: ");

                int number = in.nextInt();

                int thousand = number / 1000;

                System.out.println("В числе " + number + ", " + thousand + " тысяч.");

            }

        }

