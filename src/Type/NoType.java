package Type;
/**
 * used for default of pokemon during testing.
 * @author Ryan Campbell, Deema Alrashdan
 */
public class NoType implements TypeBehavior
{

	@Override
	public int takeHit(char type, int dmg)
	{
		return dmg;
	}
	
}
