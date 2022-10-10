import java.util.*;
import java.lang.*;
import java.io.*;

public class pangramProgram
{
	public static void main (String[] args) throws java.lang.Exception
	{
    Scanner sc=new Scanner(System.in);
      
		String x=sc.next().toUpperCase();
    //System.out.println(x);
    char y[]=x.toCharArray();
    int size=y.length;
    int a[]= new int[26];
    int i=0;
    while(i!=size)
    {
      int index=y[i]-65;
      a[index]=1;
      ++i;
    }
    i=0;
    while(i!=26)
    {
      if(a[i]==1)
      {
        ++i;
      }
      else{
        System.out.println("NO");
        System.exit(0);
      }
    }
    System.out.println("YES");
	}
}