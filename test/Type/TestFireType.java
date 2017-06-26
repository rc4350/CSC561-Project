package Type;

import static org.junit.Assert.*;

import org.junit.Test;

public class TestFireType
{

	@Test
	public void testConstruct()
	{
		TypeBehavior fire = new FireType();
		assertNotNull(fire);
		assertTrue(fire instanceof TypeBehavior);
	}
	
	@Test
	public void testDamageModify()
	{
		FireType fire = new FireType();
		assertEquals(50, fire.takeHit(PkmnType.FIRE, 50));
		assertEquals(100, fire.takeHit(PkmnType.WATER, 50));
		assertEquals(25, fire.takeHit(PkmnType.GRASS, 50));
		
		assertEquals(10, fire.takeHit(PkmnType.GRASS, 21));
		assertEquals(0, fire.takeHit(PkmnType.FIRE, -10));
		assertEquals(0, fire.takeHit('x', 20));
	}

}
