
public class Seven {

	public static void main(String[] args) {
		
		 String s="India,Australia,England,Canada";
		 
		 char[] ch=s.toCharArray();
		 for(char c:ch)
		 {
			 if(c!=',')
				 System.out.print(c);
			 else
				 System.out.println();
			 
		 }
		 
	}
}
