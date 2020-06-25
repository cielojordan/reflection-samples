package samples;
import java.lang.reflect.Field;

import tanks.KingTiger;

public class FieldRetrievalAndUsePrivateProtected 
{
	public static void main(String[] args) throws Exception
	{
		// create an instance using default constructor
		Class<KingTiger> tankClass = KingTiger.class;
		KingTiger kingTiger = tankClass.newInstance();
		
		// the field is in GermanTank <-- Tiger < -- KingTiger
		Field tankField = tankClass.getSuperclass().getSuperclass().getDeclaredField("ammoLeft");
		
		// force it to be accessible
		tankField.setAccessible(true);
		tankField.set(kingTiger, 1000);
		
		System.out.println(kingTiger.getAmmoLeft());
		System.out.println(tankField.get(kingTiger));
		
	}
}
