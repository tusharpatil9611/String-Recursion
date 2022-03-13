package StringRecursion;

public class Q4Cw {

	public static void main(String[] args) 
	{
		String s1="abcde";
		s1=s1.toUpperCase();
		String s2="ABCDE";
		
		System.out.println(s1);
		int count=0;
		for (int i = 0; i <s1.length() && i<s2.length(); i++) 
		{
			if(s1.charAt(i)!=s2.charAt(i))
			{
				System.out.println(s1.charAt(i)-s2.charAt(i));
				count++;
				break;
			}
		}
	if(count==0)
			System.out.println(s1.length()-s2.length());
	}

}
