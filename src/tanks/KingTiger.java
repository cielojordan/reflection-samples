package tanks;

import java.lang.reflect.Method;

public class KingTiger extends Tiger
{
	public KingTiger()
	{
	}

	public KingTiger(int ammo)
	{
		ammoLeft = ammo;
	}
	
    public synchronized void fire()
    {
        if (loaded == true)
        {
            System.out.println("Firing High Velocity 88mm...");
            loaded = false;
        }
        System.out.println("Gun not loaded...");
    }
    
    private void privateKingTigerMethod()
    {
    	System.out.println("In private KingTiger method");
    }
}
