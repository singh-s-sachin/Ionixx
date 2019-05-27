import java.util.*;
class ionix2
{
public static void main(String args[])
{
Scanner sc = new Scanner(System.in);
int arr[]=new int[10];
int t,m=0,ln=0,n,i,j;
System.out.println("Enter a number to be padded");
n=sc.nextInt();
i=n;
while(i>0)
{
arr[m++]=i%10;
i=i/10;
ln++;
}
System.out.println("Padded value");
if(ln%2==0)
{
System.out.print(arr[ln-1]+"-");
ln--;
}
for(i=ln-1;i>2;i-=2)
{
System.out.print(arr[i]);
System.out.print(arr[i-1] + "-");
}
for(i=2;i>=0;i--)
System.out.print(arr[i]);
}
}


