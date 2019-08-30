
public class Nine {

	public static void main(String[] args) {
		
		 String s=new String("ad3daddfd5443dfsfss");
		 char[] ch=new char[s.length()];
		 int x=0;
		 int len=s.length();
		 
		 for(int i=0;i<len;i++)
		 {
			 
			 if(s.charAt(i)>'0' && s.charAt(i)<'9')
			 {
				 continue;
			 }
			 ch[x++]=s.charAt(i);
		 }
		 for(char xx:ch)
		 System.out.print(xx);
	}
}

