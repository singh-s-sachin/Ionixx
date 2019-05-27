import java.util.*;
class ionixxbanana
{
public static void main(String args[])
{
Scanner sc = new Scanner(System.in);
int d[]=new int[20];
String a[] = new String[12];
String s,t,k="";
int n,m,i,j,l=0;
System.out.println("Enter String");
s=sc.nextLine();
for(i=0; i<s.length();i++)
{
for(j=i;j<s.length();j++)
{
k=k+s.charAt(j);
}
a[i]=k;
k="";
}
System.out.println("Current array");
for(i=0;i<s.length();i++)
System.out.println(i + " "+a[i]);
for(i=0;i<s.length()-1;i++)
{
m=i;
for(j=i+1;j<s.length();j++)
{
if(a[m].compareTo(a[j])>0)
m=j;
}
t = a[m];
a[m] = a[i];
a[i] = t;
}
System.out.println("Sorted");
for(i=0;i<s.length();i++)
System.out.println(a[i]);
}
}


