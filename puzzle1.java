import java.util.*;
class puzzle1
{
public static void main(String args[])
{
Scanner sc=new Scanner(System.in);
int a[] =new int[16];
int f[][]=new int[256][256];
int temp,m=0,i=0,t,j=0,k=0,l=0,row=0,coloumn=0;
int puzzle[]={1,6,8,9};
for(i=0;i<4;i++)
{
for(j=0;j<4;j++)
{
t=puzzle[i]*10+puzzle[j];
a[m++]=t;
}
}
System.out.println("Enter sum values");
int n= sc.nextInt();
for(i=0;i<4;i++)
{
for(j=i+1;j<8;j++)
{
for(k=j+1;k<12;k++)
{
for(l=k+1;l<16;l++)
{
t=a[i]+a[j]+a[k]+a[l];
if(t==n)
{
f[row][0]=a[i];
f[row][1]=a[j];
f[row][2]=a[k];
f[row][3]=a[l];
a[i]=0;
a[j]=0;
a[k]=0;
a[l]=0;
row++;
}
}
}
}
}
for(i=0;i<4;i++)
{
for(j=0;j<4;j++)
System.out.print(f[i][j]+" ");
System.out.println(" ");
}
}
}