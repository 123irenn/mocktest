public class swap
{
public static void main(String args[])
{
int a=5,b=3;
System.out.println("Before swapping:"+a+" "+b);
//swapping
a=a+b;
b=a-b;
a=a-b;
System.out.println("After swapping:"+a+" "+b);
}
}