
public class Four {

	public static void main(String[] args) {
		
		StringBuffer s=new StringBuffer("this is java and java is object oriented and java is powerful. I love java language");
		
		int count=0,index=0;
		
		
		while(s.indexOf("java",index)!=-1)
		{
			index=s.indexOf("java",index);
			index++; 
			count++;
			
			
		}
		
		
			
		System.out.println("java appear "+count+" times ");
	}
}
