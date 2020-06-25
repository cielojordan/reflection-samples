package tanks;

import java.util.List;


public class TankParade 
{
	private List<Tank> tanks;
	
	public void setTanks(List<Tank> tanks)
	{
		this.tanks = tanks;
	}
	
	public List<Tank> getTanks()
	{
		return tanks;
	}
	
	public void start()
	{
		for (Tank t : tanks)
		{
			System.out.println(t);
			t.load();
			t.fire();
			System.out.println();
		}
	}
}
