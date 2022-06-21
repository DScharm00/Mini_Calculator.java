import java.util.Scanner;

public class calculator {
    public static void main(String[] args) {
        int a, b, ch;
        try (Scanner sc = new Scanner(System.in)) {

            // Input first number in user....
            System.out.println("Enter Your first number : ");
            a = sc.nextInt();

            // Input second number in user....
            System.out.println("Enter Your second number : ");
            b = sc.nextInt();

            System.out.println("Enter Your choice \n 1. Add, \n 2. Subtract, \n 3. Multiply, \n 4. Divide, \n 5. Exit, ");
            ch = sc.nextInt();

            if(ch == 1) {
                System.out.println((a + b));
            }
            else if(ch == 2) {
                System.out.println((a - b));
            }
            else if(ch == 3) {
                System.out.println((a * b));
            }
            else if(ch == 4) {
                System.out.println((a % b));
            }
            else { 
                System.out.println("Invalid Choice ");
            }
        }
        
    }
}
