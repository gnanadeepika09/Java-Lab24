class stock{
 public static void main(String args[]){
  int[] a=new int[]{7,1,5,3,6,4};
int i,x=0;
int min,min_pos=0;
min=a[0];
for(i=0;i<6;i++)
{
 if(min>a[i])
  {
    min=a[i];
    min_pos=i;
  }
}
x=min_pos;
for(i=min_pos;i<6;i++)
{
 if(a[x]<a[i])
 x=i;
}
 System.out.println("The maximum profit is "+(a[x]-min));
}
}



    

            
  


  