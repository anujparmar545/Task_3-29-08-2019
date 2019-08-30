
public class Two {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String[] rnos={"12343434","3415434","5633232","12378434","7825634","3419534","5635432","12343524","3415344","5637832" };
		
		int csStudents=0;
		int itStudents=0;
		int mechStudents=0;
		int civilStudents=0;
		for(String s:rnos)
		{
			if(s.startsWith("12"))
				csStudents+=1;
			if(s.startsWith("34"))
				itStudents+=1;
			if(s.startsWith("56"))
				mechStudents+=1;
			if(s.startsWith("78"))
				civilStudents+=1;
			
		}
		
		System.out.println("CS Students : "+csStudents);
		System.out.println("IT Students : "+itStudents);
		System.out.println("MECH Students : "+mechStudents);
		System.out.println("CIVIL Students : "+civilStudents);

	
	}

}
