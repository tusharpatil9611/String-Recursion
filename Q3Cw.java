package StringRecursive;
// Write a program to compare two strings lexicographically.

public class Q3Cw {

	public static void main(String[] args) 
	{
		String s="ascbde";
		String s1="ascb";
		
		int count=0;
		count=loopI(count,s,s1,0);
			
			if(count==0)
				System.out.println(s.length()-s1.length());
		
	}

	private static int loopI(int count, String s, String s1, int i)
	{
		if( i < s.length() && i<s1.length())
		{
			if(s.charAt(i)!=s1.charAt(i))
			{
				System.out.println(s.charAt(i)-s1.charAt(i));
				count++;
			}
			return loopI(count, s, s1, i+1);
		}
		return count;
	}

}
