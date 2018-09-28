class SpaceShipControls
{
	void up(int velocity)
	{
		System.out.println("up " + velocity);
	}
}

public class SpaceShipDelegation
{
	private String name;
	private SpaceShipControls controls = new SpaceShipControls();
	public SpaceShipDelegation(String name)
	{
		this.name = name;
	}

	public void up(int velocity)
	{
		controls.up(velocity);
	}

	public static void main(String[] args) 
	{
		SpaceShipDelegation protector = 
			new SpaceShipDelegation("NSEA Protector");
		protector.up(100);
	}
}