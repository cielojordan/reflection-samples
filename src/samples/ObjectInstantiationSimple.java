package samples;
import tanks.KingTiger;

public class ObjectInstantiationSimple 
{
	public static void main(String[] args) throws Exception
	{
		// create an instance using default constructor
		Class<KingTiger> tankClass = KingTiger.class;
		KingTiger kingTiger = tankClass.newInstance();
	}
}
