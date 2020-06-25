package samples;
import java.lang.reflect.*;
import tanks.KingTiger;

public class ObjectInstantiationComplex 
{
	public static void main(String[] args) throws Exception
	{
		// create an instance using default constructor
		Class<KingTiger> tankClass = KingTiger.class;
				
		// non-blank constructor
		
		// create an array of formal parameters
		// primitives must be differentiated from their wrapper classes
		// Integer.TYPE == int  vs. Integer.class which mean the parameter is type Integer		
		Class<?>[] formalParameterTypes = {Integer.TYPE};		
		
		// get the specific constructor
		//	 - getConstructor(Class<?>...) uses varargs so you can use varargs style instead
		//   - Constructor<KingTiger> constructor = tankClass.getConstructor(param1, param2, param3);
		
		Constructor<KingTiger> constructor = tankClass.getConstructor(formalParameterTypes);
		
		// create an array of arguments
		Object[] arguments = {10};
		
		// create an instance
		KingTiger kingTiger = constructor.newInstance(arguments);
		System.out.println(kingTiger.getAmmoLeft());

		// ALTERNATIVE WAY OF GETTING BLANK CONSTRUCTOR
		//	 - getConstructor(Class<?>...) uses varargs so you can use varargs style instead
		//	   with zero parameters
		
		// get the specific constructor
		Constructor<KingTiger> blankConstructor = tankClass.getConstructor();
		
		// create an instance
		KingTiger kingTiger2 = blankConstructor.newInstance();
		System.out.println(kingTiger2.getAmmoLeft());
	}
}
