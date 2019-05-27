import java.util.*;
class ionixx2D
{
public static void main(String args[])
{
Scanner sc=new Scanner(System.in);
String a[][]=new String[4][4];
int i,j;
String y,z;
System.out.println("Enter 16 character string");
for(j=0;j<4;j++)
for(i=0;i<4;i++)
{
a[i][j]=sc.nextLine();
}
for(i=0;i<4;i++)
{
for(j=0;j<4;j++)
System.out.print(a[i][j]+" ");
System.out.println(" ");
}
System.out.println("Enter the char to be searched");
y=sc.nextLine();
z=sc.nextLine();
for(i=0;i<3;i++)
{
for(j=0;j<3;j++)
{
if(a[i][j].equals(y)&&a[i+1][j+1].equals(z))
{
System.out.println(i +" "+ j);
break;
}
}
if(a[j][i].equals(y)&&a[j+1][i+1].equals(z))
{
System.out.println(j +" "+ i);
break;
}
}
}
}
