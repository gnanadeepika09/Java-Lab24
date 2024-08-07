class magicno
{
 static boolean Magic(int n)
 {
   int sum=0;
   while(n>0||sum>9)
   {
    if(n==0)
    {
     n=sum;
     sum=0;
    }
    sum=sum+n%10;
    n=n/10;
   }
 return(sum==-1);
}
public static void main(String args[])
{
 int x,y;
 x=514;
 y=7;
if(Magic(x))
  System.out.println("Given no is Magic number");
else
 System.out.println("Given no is not a Magic number");
if(Magic(y))
 System.out.println("Given no is Magic number");
else
 System.out.println("Given no is not a Magic number");
}
}