import java.util.Arrays;
import java.util.Scanner;


public class Ex1Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String num1 = "", num2 = "", quit = "quit";
        while (!num1.equals("quit") && !num2.equals("quit")) {
            System.out.println();
            System.out.println("Ex1 class solution:");
            System.out.println("Enter a string as number#1 (or \"quit\" to end the program): ");
            num1 = sc.next();
            if (Ex1.isNumber(num1)) {
                System.out.println("num1= " + num1 + " is number: true , value: " + Ex1.number2Int(num1));
            }
            else {
                System.out.println("ERR: num1 is in the wrong format! (" + num1 + ")");
            }
            if ((!num1.equals("quit")) && (num1.isEmpty())) {
                break;
            }
            else continue;
        }

        while (!num1.equals("quit") && !num2.equals("quit")) {
            System.out.println("Enter a string as number#2 (or \"quit\" to end the program): ");
            num2 = sc.next();
            if (Ex1.isNumber(num2)) {
                System.out.println("num2= " + num2 + " is number: true , value: " + Ex1.number2Int(num2));
            }
             else {
                 System.out.println("ERR: num2 is in the wrong format! (" + num2 + ")");
            }
            if ((!num2.equals("quit")) && (num2.isEmpty())) {
                break;
            }
            else continue;
        }

        System.out.println("Enter a base for output: (a number [2,16])");
        int base = Integer.parseInt(sc.next());
        String valueSumPLUS = Ex1.int2Number(Ex1.number2Int(num1) + Ex1.number2Int(num2), base);
        String valueSumMULTI = Ex1.int2Number(Ex1.number2Int(num1) * Ex1.number2Int(num2), base);
        String[] arr = {num1, num2, valueSumPLUS, valueSumMULTI};
        int maxIndex = Ex1.maxIndex(arr);
        String maxNumber = arr[maxIndex];
        if (Ex1.isValidBasePart(String.valueOf(base))) {
            System.out.println(num1 + " + " + num2 + " = " + valueSumPLUS);
            System.out.println(num1 + " * " + num2 + " = " + valueSumMULTI);
            System.out.println("Max number over " + Arrays.toString(arr)+ "is: " + maxNumber);
        }
        else System.out.println("ERR: wrong base, should be [2,16], got (" + base + ")");
        System.out.println("quiting now...");
    }
}