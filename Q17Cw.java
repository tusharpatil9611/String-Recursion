package StringRecursive;

public class Q17Cw {

	public static void main(String[] args) 
	{
		String s="How are you";
		String []sa=s.split(" ");
		sa=loopI(sa,0);
		loopPrint(sa,0);
		
	}
	private static void loopPrint(String[] sa, int i)
	{
		if(i<sa.length)
		{
			System.out.print(sa[i]+" ");
			loopPrint(sa, i+1);
		}
	}
	private static String[] loopI(String[] sa, int i) 
	{
		if(i<sa.length)
		{
			String s1=sa[i];
			char []ca=s1.toCharArray();
			int p=0;
			int q=ca.length-1;
			ca=loopWhile(s1,ca,p,q);
			String s2=new String(ca);
			sa[i]=s2;
			return loopI(sa, i+1);
		}
		return sa;
	}
	private static char[] loopWhile(String s1, char[] ca, int p, int q)
	{
		if(q>p)
		{
			char temp=ca[p];
			ca[p]=ca[q];
			ca[q]=temp;
			p++;
			q--;
			return loopWhile(s1, ca, p, q);
		}
		return ca;
	}
	

}
