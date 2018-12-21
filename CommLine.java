import java.io.*;
class CommLine
{
   public static void main(String args[])throws IOException
   {
       int l=args.length;
       int a[]=new int[l];
       System.out.println("Sorted in Ascending order");
       for(int i=0;i<l;i++)
       {
           a[i]=Integer.parseInt(args[i]);
       }
       /* Bubble Sort Technique */
       for(int i=1;i<=l-1;i++)
       {
           for(int j=0;j<l-i;j++)
           {
              if(a[j]>a[j+1])
              {
               int t=a[j];
               a[j]=a[j+1];
               a[j+1]=t;
              }
           }
       }
       for(int i=0;i<l;i++)
       {
           System.out.println(a[i]);
       }
       System.out.println("sorted in Desending order");
       for(int i=1;i<=l-1;i++)
       {
           for(int j=0;j<l-i;j++)
           {
              if(a[j]<a[j+1])
              {
               int t=a[j];
               a[j]=a[j+1];
               a[j+1]=t;
              }
           }
       }
       for(int i=0;i<l;i++)
       {
           System.out.println(a[i]);
       }
   }
}

output:

C:\prog>javac CommLine.java

C:\prog>java CommLine 10 20 5 7
Sorted in asending order
5
7
10
20
sorted in Desending order
20
10
7
5
