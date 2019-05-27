import java.util.*;
class ionix
{
public static void main(String args[])
{
Scanner sc = new Scanner(System.in);
int a[] = new int[5];
int n,i,j;
System.out.println("Enter 6 datas in array");
for(i=0; i<5;i++)
{
a[i]=sc.nextInt();
}
System.out.println("Enter a number to be searched as sum");
n=sc.nextInt();
for(i=0;i<4;i++)
for(j=i+1;j<5;j++)
if(a[i]+a[j]==n)
System.out.println("{"+a[i]+a[j]+"}");
}
}

