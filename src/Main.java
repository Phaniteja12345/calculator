import jdk.dynalink.Operation;

import java.util.Scanner;

class SimpleCalculator {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the first number");
        float firstNumberBielecki = sc.nextInt();
        System.out.print("Enter the second number");
        float secondNumberBielecki = sc.nextInt();
         float sum = firstNumberBielecki+secondNumberBielecki;
         float difference = firstNumberBielecki-secondNumberBielecki;
         float product = firstNumberBielecki*secondNumberBielecki;
         float quotient = firstNumberBielecki/secondNumberBielecki;

         System.out.printf("Sum: %.2f\n",sum);
         System.out.printf("difference: %.2f\n",difference);
         System.out.printf("product: %.2f\n",product);
         System.out.printf("quotient %.2f\n",quotient);












    }





    }
