import java.util.*;
public class numberPattern2 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter row size:");
		int n=sc.nextInt();
		System.out.println("");
		for(int i=1;i<n;i++)
		{
			for(int j=1;j<=i;j++)
			{
				System.out.print(i);
			}
			System.out.println(" ");
		}
		sc.close();

	}

}
