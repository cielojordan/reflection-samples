package tanks;

public class Tiger extends GermanTank
{
    public Tiger()
    {
        ammoLeft = 84;
    }

    private void privateTigerMethod()
    {
    	System.out.println("In private Tiger area");
    }

    protected void protectedTigerMethod()
    {
    	System.out.println("In protected Tiger area");
    }
    
    public void load()
    {
        if (ammoLeft>0)
        {
            System.out.print("Loading 88mm round...");
            ammoLeft --;
            loaded = true;
            System.out.println(getAmmoLeft()+" rounds left.");
        }
    }

    public void fire()
    {
        if (loaded == true)
        {
            System.out.println("Firing 88mm...");
            loaded = false;
        }
        System.out.println("Gun not loaded...");
    }

}
