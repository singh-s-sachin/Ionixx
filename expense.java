import java.util.*;
class expense
{
public static void main(String args[])
{
Scanner sc=new Scanner(System.in);
String min;
System.out.println("Person 1");
int a=sc.nextInt();
System.out.println("Person 2");
int b=sc.nextInt();
System.out.println("Person 3");
int c=sc.nextInt();
int d=(a+b+c)/3;
if((a<b)&&(a<c))
min="a";
else
if((b<c)&&(c<a)) 
min="b";
else
min="c";
if(a-d>0)
System.out.println(min + "will pay to A"+":"+(a-d));
if(b-d>0)
System.out.println(min+" will pay to B"+(b-d));
if(c-d>0)
System.out.println(min+" will pay to "+min+(c-d));
}
}
