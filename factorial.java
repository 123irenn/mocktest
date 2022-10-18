import java.util.Scanner;
public class factorial
{
public static void main(String args[])
{
int fact=1,n;
Scanner reader = new Scanner(System.in);
System.out.print("Enter a number: ");
n= reader.nextInt();

for(int i=1;i<=n;i++)
{
	fact=fact*i;
}
System.out.println("factorial is:"+fact);
}
}