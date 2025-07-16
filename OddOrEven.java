import java.util.Scanner;

public class OddOrEven {
	public static void main(String[]args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the number: ");
		int number = sc.nextInt();
		if(number%2==0) {
			System.out.print("The Number "+number+" is Even");
		}
		else
		{
			System.out.print("The Number "+number+" is Odd");
		}
		sc.close();
	}
}
