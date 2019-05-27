import java.util.*;
class pattern
{
public static void main(String args[])
{
Scanner sc = new Scanner(System.in);
int i,j,n;
System.out.println("Enter a number");
n=sc.nextInt();
for(i=1;i<=n;i++)
{
System.out.print(i);
}
System.out.println(" ");
for(i=2;i<=n-1;i++)
{
System.out.print(i);
for(j=2;j<=n-1;j++)
System.out.print(" ");
System.out.print(n-i+1);
System.out.println(" ");
}
for(i=n;i>=1;i--)
System.out.print(i);
}
}
