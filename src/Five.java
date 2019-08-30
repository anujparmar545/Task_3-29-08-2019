
public class Five {

	public static void main(String[] args) {
		String s="amanama";
		char[] ch=s.toCharArray();
		int i=0,flag=0;
		int j=s.length()-1;
		while(i<j)
		{
			if(ch[i]!=ch[j])
			{
				System.out.println("Not Palindrome");
				flag=1;
				break;
			}
			i++;
			j--;
			
		}
		if(flag==0)
		System.out.println("palindrome");
	}
}
