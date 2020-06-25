package samples;
import java.lang.reflect.Method;

import tanks.KingTiger;

public class MethodInvocationSimple 
{
	public static void main(String[] args) throws Exception
	{
		// create an instance using default constructor
		Class<KingTiger> tankClass = KingTiger.class;
		KingTiger kingTiger = tankClass.newInstance();
		
		// using explicit arrays
		Class<?>[] formalParameters = {};
		Method tankMethod = tankClass.getMethod("fire", formalParameters);
		
		Object[] arguments = {};
		tankMethod.invoke(kingTiger, arguments);
		
		// ALTERNATIVE using varargs, 0+ params allowed
		Method tankMethod2 = tankClass.getMethod("fire");
		tankMethod2.invoke(kingTiger);		
		
	}
}
