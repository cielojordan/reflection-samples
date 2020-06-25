package samples;
import java.lang.reflect.Method;

import tanks.KingTiger;

public class MethodInvocationPrivateProtected 
{
	public static void main(String[] args) throws Exception
	{
		// create an instance using default constructor
		Class<KingTiger> tankClass = KingTiger.class;
		KingTiger kingTiger = tankClass.newInstance();
		
		// using explicit arrays
		Class<?>[] formalParameters = {};
		Method tankMethod = tankClass.getDeclaredMethod("privateKingTigerMethod", formalParameters);
		
		// force it to become accessible
		tankMethod.setAccessible(true);
		
		Object[] arguments = {};
		tankMethod.invoke(kingTiger, arguments);


		// protected method from a superclass
			// NOTE: to get to a superclass's inaccessible methods you must traverse up to it
			//		 i.e. you must get the Class object of the superclass
		Method tankMethod2 = tankClass.getSuperclass().getDeclaredMethod("protectedTigerMethod", formalParameters);
		tankMethod2.setAccessible(true);
		
		tankMethod2.invoke(kingTiger, arguments);

	}
}
