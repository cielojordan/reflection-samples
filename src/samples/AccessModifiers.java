package samples;
import java.lang.reflect.Method;
import java.lang.reflect.Modifier;

import tanks.KingTiger;

public class AccessModifiers 
{
	public static void main(String[] args) throws Exception
	{
		// create an instance using default constructor
		Class<KingTiger> tankClass = KingTiger.class;
		
		// using explicit arrays
		Class<?>[] formalParameters = {};
		Method tankMethod = tankClass.getMethod("fire", formalParameters);

		// modifiers are in the form of an int with specific values set
		int mod = tankMethod.getModifiers();
		if (Modifier.isAbstract(mod))
		{
			System.out.println("abstract");
		}
		if (Modifier.isFinal(mod))
		{
			System.out.println("final");
		}
		if (Modifier.isInterface(mod))
		{
			System.out.println("interface");
		}
		if (Modifier.isNative(mod))
		{
			System.out.println("native");
		}
		if (Modifier.isPrivate(mod))
		{
			System.out.println("private");
		}
		if (Modifier.isPublic(mod))
		{
			System.out.println("public");
		}
		if (Modifier.isProtected(mod))
		{
			System.out.println("protected");
		}
		if (Modifier.isStatic(mod))
		{
			System.out.println("static");
		}
		if (Modifier.isSynchronized(mod))
		{
			System.out.println("synchronized");
		}
		if (Modifier.isTransient(mod))
		{
			System.out.println("transient");
		}
		if (Modifier.isVolatile(mod))
		{
			System.out.println("volatile");
		}
		
		
		
	}
}
