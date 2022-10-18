import java.util.InputMismatchException;
import java.util.Scanner;

public class ArrayException {
	int n,index;
	int arr[];
	public String getPriceDetails() 
	{
		Scanner sc=new Scanner(System.in);
		try
		{
		System.out.println("Array size");
		n=sc.nextInt();
		n=Integer.parseInt(String.valueOf(n));
		arr=new int[n];
		System.out.println("Enter the price details:");
		for(int i=0;i<n;i++)
		{
			arr[i]=sc.nextInt();
		}
		System.out.println("Enter the index to find:");
		index=sc.nextInt();
		return("Array Element "+arr[index]);
		}catch(ArrayIndexOutOfBoundsException e) {
			return("Array index is out of range");
			
		}catch(InputMismatchException e) {
			return("Input was not in correct format");
			
		}
	}
	

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		ArrayException axe=new ArrayException();
		System.out.println(axe.getPriceDetails());
		
		

	}

}
