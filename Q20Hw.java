package StringRecursive;

public class Q20Hw {
	public static void main(String[] args)
	{
		String s="abcdbxtuvabc";
		int start=0; 
		int max=0;
		
		for (int i = 0; i <s.length(); i++) 
		{
			for (int j = i+1; j <s.length(); j++) 
			{
				int count=0;
				for (int k = i; k <j-1; k++) 
				{
					if(s.charAt(k)==s.charAt(j))
						count++;
				}
				if(count>0)
				{
					int lengthOfString=j-i;
					if(lengthOfString>max)
					{
						max=lengthOfString;
						start=i;
					}
					break;
				}
				if(j==s.length()-1)
				{
					int laenthOfString=j-i+1;
					if(laenthOfString>max)
					{
						max=laenthOfString;
						start=i;
					}
				}
			}
		}
		System.out.println(max);
		for (int i =start; i <start+max; i++) 
		{
			System.out.print(s.charAt(i));
		}
	}

}
