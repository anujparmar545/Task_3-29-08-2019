
public class Eight {

	public static void main(String[] args) {
		
		//palindrome using string buffer
		StringBuffer s=new StringBuffer("amnama");
		StringBuffer s1=new StringBuffer(s);
		
		s.reverse();
		if(s.equals(s1))
			System.out.println("palindrome");
		else
			System.out.println("not palindrome");
		
	}
}
