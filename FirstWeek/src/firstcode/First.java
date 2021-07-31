package firstcode;

public class First {
	//Return domain name
	static String getdomain(String str)
	{
		if(str.startsWith("https://"))
			{str=str.substring(8);}
		else
		if(str.startsWith("http://"))
		{str=str.substring(7);}
		
		int i=str.indexOf('/');
		str=str.substring(0,i);
		return str;
	}
	public static void main(String[] args) 
	{
		System.out.println(getdomain("https://en.wikipedia.org/wiki/Main_Page"));
		System.out.println(getdomain("http://en.wikipedia.org/wiki/Main_Page"));
		System.out.println(getdomain("destiny.com/wiki/Main_Page"));
		System.out.println(getdomain("bingo.prize.org/wiki/Main_Page"));
		
	}

}
