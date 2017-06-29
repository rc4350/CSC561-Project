package Type;
/**
* define behavior for grass type pokemon
*@author DeemacAlrashdan, Ryan Campbell
*/
public class GrassType implements TypeBehavior
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
		else if (type == PkmnType.GRASS)
		{
			return dmg;
		}
		else if (type == PkmnType.WATER)
		{
			returnDmg = (int) ((float)dmg/2.0);
			return returnDmg;
		}
		else if (type == PkmnType.FIRE)
		{
			returnDmg = dmg*2;
			return returnDmg;
		}
		
		return 0;
	}

}
