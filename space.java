import java.util.*;
class space
{
public static void main(String args[])
{
Scanner sc=new Scanner(System.in);
String k;
char m;
int d;
System.out.println("Enter string");
k=sc.nextLine();
for(int i=0;i<k.length();i++)
{
m=k.charAt(i);
d=m;
if((d>65)&&(d<90))
System.out.print(" "+k.charAt(i));
else
System.out.print(k.charAt(i));
}
}
}
