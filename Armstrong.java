import java.io.*;
class Armstrong
{
public static void main(String args[])
{
int n,rem,sum=0;
try
{
DataInputStream in=new DataInputStream(System.in);
n=Integer.parseInt(in.readLine());
int num=n;
if(n<500)
{
while(n!=0)
{
rem=n%10;
sum=sum+(rem*rem*rem);
n=n/10;
}
if(sum==num)
{
System.out.println(num+ "is an Armstrong number");
}
else
{
System.out.println(num+ "is not an Armstrong number");
}
}
else
{
System.out.println("Enter a number below 500");
}
}
catch(Exception e)
{
}
}
}
