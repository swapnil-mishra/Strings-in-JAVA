//to count no. of unique characters
import java.util.*;
class UniqChar
{ 
	private String str,r;
	
	public UniqChar()
	{
		str="";
	}
	
	public void rd()
	{
		
			Scanner sc=new Scanner(System.in);
			System.out.println("Enter string: ");
			str=sc.nextLine();
	}
	
	public void dsp()
	{
		int a=0;
		str=str.toLowerCase();
		for(int i=97;i<=122;i++)
		{
			char ch=(char )i;
			int co=0;
			for(int j=0;j<str.length();j++)
			{
				if(str.charAt(j)==ch)
				{
					co++;
				}
			}
			if(co==1)
			{	
				a=a+1;
			}
		}
		if(a!=0)
		{
			System.out.println(a+" unique characters/s");
		}
		else
		{
			System.out.println("No unique characters/s");
		}
	}
}

class UniqCharmain
{
		public static void main (String[] args) 
	{
		UniqChar ob=new UniqChar();
		ob.rd();
		ob.dsp();
	}
}
