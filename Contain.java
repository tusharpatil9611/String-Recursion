package StringRecursive;

public class Contain {

	public static void main(String[] args) 
	{
		String s1="abcdefghi";
		String s2="abc";
		if(s1.length()>=s2.length())
		{
			int i = 0;
			loopI(s1,s2,i);
			if(i==s1.length()-s2.length()+1)
				System.out.println(false);
		}
		else
			System.out.println("false");
	}
	private static void loopI(String s1, String s2, int i)
	{
		if( i <s1.length()-s2.length()+1)
		{
			if(s1.charAt(i)==s2.charAt(0))
			{
				String subString="";
				int j = i;
				subString=loopJ(j,s1,s2,subString,i);
				if(subString.equals(s2))
				{
					System.out.println(true);
					return;
				}
			}
			loopI(s1, s2, i+1);
		}
	}
	private static String loopJ(int j, String s1, String s2, String subString, int i) 
	{
		if(j <i+s2.length())
		{
			subString=subString+s1.charAt(j);
			return loopJ(j+1, s1, s2, subString, i);
		}
		return subString;
	}
}
