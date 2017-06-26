package Type;

import static org.junit.Assert.*;

import org.junit.Test;

public class TestPkmnType
{

	@Test
	public void testConstruct()
	{
		TypeBehavior mtype = new mockType();
		assertTrue(mtype instanceof PkmnType);
		assertTrue(mtype instanceof TypeBehavior);
	}
	
	@Test
	public void testStatics()
	{
		assertEquals('F', PkmnType.FIRE);
		assertEquals('W', PkmnType.WATER);
		assertEquals('G', PkmnType.GRASS);
	}

}

class mockType extends PkmnType
{

	@Override
	public int takeHit(char type, int dmg)
	{
		// TODO Auto-generated method stub
		return 0;
	}
	
}
