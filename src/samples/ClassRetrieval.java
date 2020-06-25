package samples;
import tanks.KingTiger;

public class ClassRetrieval 
{
	public static void main(String[] args) throws Exception
	{
		Class<?> tankClass = Class.forName("tanks.KingTiger");
		Class<?> tankClass2 = KingTiger.class;
		Class<?> tankClass3 = new KingTiger().getClass();
	
		System.out.println(tankClass);
		System.out.println(tankClass2);
		System.out.println(tankClass3);		
		
		// ALL of these refer to the same Class object
	}
}
