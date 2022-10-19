import java.util.Scanner;

public class Temp {

	public static void main(String[] args) {
		double f,c;
		Scanner sc=new Scanner(System.in);
		System.out.println("1.Farenheit conversion\n2.Celsius Conversion");
		System.out.println("Choose Option:");
		int n=sc.nextInt();
		switch(n) {
		case 1:
			System.out.println("Enter Temp in c:");
			c=sc.nextDouble();
			f=((9*c)/5)+32;
			System.out.println("Temp in f:"+f);
			break;
		case 2:
			System.out.println("Enter Temp in f:");
			f=sc.nextDouble();
			c=(f-32)*5/9;
			System.out.println("Temp in c:"+c);
			break;
		default:
			System.out.println("Invalid choice");
			break;
		}
		sc.close();
	}

}
