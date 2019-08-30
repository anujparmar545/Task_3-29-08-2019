
public class One {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String[] emails={"ab@gmail.com","xyz@yahoo.com","ukjur@outlook.com","pou@yahoo.com","rtyg@yahoo.com","frtg@gmail.com","thgd@gmail.com","uytr@outlook.com"};
		int gmailCount=0;
		int yahooCount=0;
		int outlookCount=0;
		
		for(String s:emails)
		{
			if(s.contains("@gmail"))
				gmailCount=gmailCount+1;
			
			if(s.contains("@yahoo"))
				yahooCount+=1;
			if(s.contains("@outlook"))
				outlookCount+=1;
			
		}
		System.out.println("total gmail accounts are : "+ gmailCount);
		System.out.println("total yahoo accounts are : "+yahooCount);
		System.out.println("total outlook accounts are : "+outlookCount);
		
		
	}

}
