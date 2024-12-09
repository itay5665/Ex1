
import java.util.Scanner;

public class Ex1Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String num1, num2;
        System.out.println();
        System.out.print("Please Type 'quit' to exit");

        while (true) {
            System.out.print("Enter a string as number#1 : ");
            num1 = scanner.nextLine();
            if ("quit".equalsIgnoreCase(num1)) {
                System.out.println("quitting now...");
                break;
            }

            if (!Ex1.isNumber(num1)) {
                System.out.println("ERR: num1 is in the wrong format! (" + num1 + ")");
                continue;
            }

            System.out.print("Enter a string as number#2 : ");
            num2 = scanner.nextLine();
            if ("quit".equalsIgnoreCase(num2)) {
                System.out.println("quitting now...");
                break;
            }

            if (!Ex1.isNumber(num2)) {
                System.out.println("ERR: num2 is in the wrong format! (" + num2 + ")");
                continue;
            }

            System.out.print("Enter a base for output: ");
            int base = Integer.parseInt(scanner.nextLine());

            int sum = Ex1.number2Int(num1) + Ex1.number2Int(num2);
            int product = Ex1.number2Int(num1) * Ex1.number2Int(num2);

            System.out.println(num1 + " + " + num2 + " = " + Ex1.int2Number(sum, base));
            System.out.println(num1 + " * " + num2 + " = " + Ex1.int2Number(product, base));

            String[] values = {num1, num2, Ex1.int2Number(sum, base), Ex1.int2Number(product, base)};
            System.out.println("Max number over: ");
            for (String v : values) {
                System.out.print(v + " ");
            }

            System.out.println("\nMax index is: " + Ex1.maxIndex(values));
        }
    }
}
