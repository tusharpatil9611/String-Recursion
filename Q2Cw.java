package StringRecursive;

public class Q2Cw {

	public static void main(String[] args) 
	{
		String s="abcdef";
		String s1="e";
		int index=0;
		index=loopI(s,s1,index,0);
		System.out.println(index);
	}

	private static int  loopI(String s, String s1, int index, int i) 
	{
		if(i<s.length())
		{
			if(s.charAt(i)==s1.charAt(0))
			{
				index=i;
			}
			return loopI(s, s1, index, i+1);
		}
		return index;
	}

}
