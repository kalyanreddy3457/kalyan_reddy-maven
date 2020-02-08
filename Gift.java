import java.util.*;
import java.io.*;
class Category
{
Scanner in=new Scanner(System.in);
int []a=new int[1000];
int n;
public void price(int n)
{
this.n=n;
System .out.println("enter the values ="+n);
for(int i=0;i<n;i++)
a[i]=in.nextInt();
}
public void weight(int n)
{
this.n=n;
System .out.println("enter the values ="+n);
for(int i=0;i<n;i++)
this.a[i]=in.nextInt();
}
public void arrange()
{
System.out.println("arranging the order");
for(int i=0;i<n;i++)
{
if(a[i]<a[i+1])
a[i]=a[i]+a[i+1];
a[i+1]=a[i]-a[i+1];
a[i]=a[i]-a[i+1];
}
}
public void print()
{
System.out.println("the order is given");
for(int i=0;i<n;i++)
{
System.out.println(a[i]);
}
}
}
 
class Chocolates
{
Scanner in=new Scanner(System.in);
Chocolates(int n)
{
System.out.println("select the Category:-\n1.)price\n2.)weight");
int q=in.nextInt();
Category c=new Category();
if(q==1)
c.price(n);
else
c.weight(n);
}
}

class Sweets
{
Scanner in=new Scanner(System.in);
Sweets(int n1)
{
System.out.println("select the Category:-\n1.)price\n2.)weight");
int q=in.nextInt();
Category c=new Category();
if(q==1)
c.price(n1);
else
c.weight(n1);
}
}



public class Gift
{
public static void main(String k[])
{
Scanner in=new Scanner(System.in);
System.out.println("select the type of gift\n 1.)chocolate\n2.)sweets");
int s=in.nextInt();
if(s==1)
{
System.out.println("enter the number of candies in gift");
int n=in.nextInt();
Chocolates o=new Chocolates(n);
}
else
{
System.out.println("enter the number of sweets in gift");
int n1=in.nextInt();
Sweets l=new Sweets(n1);
}
Category w=new Category();
System.out.println("the gift is sorted order is");
w.print();
w.arrange();
w.print();
}
}