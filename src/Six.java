
public class Six {

	public static void main(String[] args) {
		
		String s="hello user123, You can Mail me @ xyz4343@gmail.com with # tag java!";
		int small_alphabates=0;
		int capital_alphabates=0;
		int digits=0, symbols=0,spaces=0;
		//char[] ch=s.toCharArray();
		for(int i=0;i<s.length();i++)
		{
			
			if((s.charAt(i))>'a' && (s.charAt(i))<'z')
				small_alphabates+=1;
			else if(s.charAt(i)==' ')
				spaces+=1;
			else if((s.charAt(i))>'A' && (s.charAt(i))<'Z')
				capital_alphabates+=1;
			else if((s.charAt(i))>'0' && (s.charAt(i))<'9')
				digits+=1;
			else
				symbols+=1;
			
		}
		System.out.println("small_alphabates count is"+small_alphabates);
		System.out.println("capital_alphabates count is"+capital_alphabates);
		System.out.println("digits count is"+digits);
		System.out.println("symbols count is"+symbols);
		System.out.println("spaces count is"+spaces);
	}
}
