package javafundamentals;

public class F16 {
	public static  void main(String args[]) {
		int count=0;
		for(int i=10;i<=99;i++)
		{  count=0;
		for(int j=1;j<=i;j++)
		{
		 if(i%j==0)
		 count++;
		}
		 if(count==2)
		 System.out.println(i);
		}
		
	}

}
