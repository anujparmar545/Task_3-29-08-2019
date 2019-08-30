
public class Three {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String cities[]={"bhopal","agra","mumbai","chennai","pune","delhi"};
		
		for(int i=0;i<cities.length-1;i++)
		{
			for(int j=i;j<cities.length-i-1;j++)
			{
				if(cities[j].compareTo(cities[j+1])>=0)
				{
					String temp=cities[j];
					cities[j]=cities[j+1];
					cities[j+1]=temp;
				}
				
			}
			
		}
		for(String s: cities)
			System.out.println(s);

	}

}
