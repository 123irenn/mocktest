import java.util.*;
public class StarPattern2 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter value: ");
		int myrows = scanner.nextInt();
		
		for (int m = 1; m <= myrows; m++)
		{
		for (int n=myrows; n>m; n--)
		{
		System.out.print(" ");
		}
		for (int p=1; p<=(m * 2) -1; p++)
		{
		System.out.print("*");
		}
		System.out.println();
		}
	   scanner.close();

	}

}
