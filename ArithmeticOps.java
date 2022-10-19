import java.util.*;
public class ArithmeticOps {

	public static void main(String[] args) {
		int a,b;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter First Number:");
		a=sc.nextInt();
		System.out.println("Enter Second Number:");
		b=sc.nextInt();
		System.out.println("Select Option:");
		System.out.println("1.add\n2.subtract\n3.multiply\n4.divide");
		int n=sc.nextInt();
		switch(n) {
		case 1:
			System.out.println("Sum:"+(a+b));
			break;
		case 2:
			System.out.println("Diff:"+(a-b));
			break;
		case 3:
			System.out.println("Product:"+(a*b));
			break;
		case 4:
			System.out.println("Div:"+(a/b));
			break;
		default:
			System.out.println("Wrong Choice");
			break;
		}
		sc.close();
	}

}
