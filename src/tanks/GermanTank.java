package tanks;


public abstract class GermanTank implements Tank
{
    protected int ammoLeft = 1;
    protected boolean loaded =false;

    public GermanTank()
    {
        ammoLeft = 10;
    }

    public void setAmmoLeft(int ammoLeft)
    {
    	this.ammoLeft = ammoLeft;
    }
    
    public int getAmmoLeft()
    {
        return ammoLeft;
    }

    public abstract void load() ;
    public abstract void fire() ;

    public String toString()
    {
    	StringBuffer sb = new StringBuffer();

    	sb.append("Class: ");
    	sb.append(getClass().getName());
    	sb.append(" ammoLeft: ");
    	sb.append(ammoLeft);
    	sb.append(" loaded: ");
    	sb.append(loaded);
    	 
    	return sb.toString();
    }
}
