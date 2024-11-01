import java.util.*;
import java.lang.Math;
public class Armstrong {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("number");
        int num = sc.nextInt();

        int temp, last =0, digit = 0, sum =0;

        temp = num;
        while(temp>0){
            temp = temp/10;
            digit++;
        }

        temp = num;
        while(temp> 0){
            last = temp%10;
            sum += Math.pow(last, digit);
            temp = temp/10;
        }

        if(sum == num){
            System.out.println("Number is armstrong");
        }else{
            System.out.println("False");
        }
    }
}

// import java.util.Scanner;

// public class ArmstrongNumberChecker {
//     public static void main(String[] args) {
//         Scanner scanner = new Scanner(System.in);

//         System.out.print("Enter a number: ");
//         int number = scanner.nextInt();

//         if (isArmstrongNumber(number)) {
//             System.out.println(number + " is an Armstrong number");
//         } else {
//             System.out.println(number + " is not an Armstrong number");
//         }
//     }

//     public static boolean isArmstrongNumber(int number) {
//         int originalNumber = number;
//         int sum = 0;
//         int digitCount = countDigits(number);

//         while (number != 0) {
//             int digit = number % 10;
//             sum += power(digit, digitCount);
//             number /= 10;
//         }

//         return sum == originalNumber;
//     }

//     public static int countDigits(int number) {
//         int count = 0;
//         while (number != 0) {
//             number /= 10;
//             count++;
//         }
//         return count;
//     }

//     public static int power(int base, int exponent) {
//         int result = 1;
//         for (int i = 0; i < exponent; i++) {
//             result *= base;
//         }
//         return result;
//     }
// }