import java.util.Scanner;

public class TryCatchExample {
	public static void main(String[] args) {
		Scanner k = new Scanner(System.in);
		
		int n;
		try
		{
			System.out.print("Enter an integer: ");
			n = k.nextInt();
			System.out.println("They entered: " + n);
		}
		catch(Exception IOException)
		{
			System.out.println("Oh no! They didn't enter an int!");
		}
	}	
}