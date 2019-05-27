import java.util.*;
class ionix1
{
public static void main(String args[])
{
Scanner sc = new Scanner(System.in);
int n,a,t=0;
System.out.println("Enter a number");
n=sc.nextInt();
a=n;
while(n>0)
{
t=t*10+n%10;
n=n/10;
}
if(t==a)
System.out.println(t+" is palindrome.");
else
System.out.println(a + " is not palindrome.");
}
}
