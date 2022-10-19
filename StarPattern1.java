import java.util.*;
public class StarPattern1 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter value ");
		int myrows = scanner.nextInt();
		for (int m = 1; m <= myrows; m++)
		{
		for (int n = 1; n <= m; n++)
		{
		System.out.print("*");
		}
		System.out.println();
		}
		
		scanner.close();
	}

}
