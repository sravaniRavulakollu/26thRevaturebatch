package firstcode;

public class Second {
	//find out wheather website secure or not
	static String checksecure(String str)
	{
		if(str.startsWith("https://"))
			{return "secure";}
		else
		if(str.startsWith("http://"))
		{return "not secure";}
		
		return "not secure";
		
	}
	public static void main(String[] args) 
	{
		System.out.println(checksecure("https://en.wikipedia.org/wiki/Main_Page"));
		System.out.println(checksecure("https://en.wikipedia.org/wiki/Main_Page"));
		System.out.println(checksecure("destiny.com/wiki/Main_Page"));
		System.out.println(checksecure("bingo.prize.org/wiki/Main_Page"));
		
	}
}
