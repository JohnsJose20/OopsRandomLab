import java.util.Scanner;

public class PrintUptoLimit {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the Limit: ");
        int number = sc.nextInt();

        System.out.println("The Natural Numbers up to " + number + ":");
        for (int i = 1; i <= number; i++) {
            System.out.println(i);
        }

        sc.close(); 
    }
}