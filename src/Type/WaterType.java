package Type;

public class WaterType implements TypeBehavior
{

	/**
	 * take hit method that will be used by pokemon. modifies damage based on the type of attack and returns value
	 */
	private int returnDmg;
	@Override
	public int takeHit(char type, int dmg)
	{
		if(dmg < 0)
		{
			return 0;
		}
		else if (type == PkmnType.WATER)
		{
			return dmg;
		}
		else if (type == PkmnType.FIRE)
		{
			returnDmg = (int) ((float)dmg/2.0);
			return returnDmg;
		}
		else if (type == PkmnType.GRASS)
		{
			returnDmg = dmg*2;
			return returnDmg;
		}
		
		return 0;
	}

}
