package Type;

import static org.junit.Assert.*;

import org.junit.Test;

public class TestGrassType
{

	@Test
	public void testConstruct()
	{
		TypeBehavior grass = new GrassType();
		assertNotNull(grass);
		assertTrue(grass instanceof TypeBehavior);
	}
	
	@Test
	public void testDamageModify()
	{
		GrassType grass = new GrassType();
		assertEquals(50, grass.takeHit(PkmnType.GRASS, 50));
		assertEquals(100, grass.takeHit(PkmnType.FIRE, 50));
		assertEquals(25, grass.takeHit(PkmnType.WATER, 50));
		
		assertEquals(10, grass.takeHit(PkmnType.WATER, 21));
		assertEquals(0, grass.takeHit(PkmnType.GRASS, -10));
		assertEquals(0, grass.takeHit('x', 20));
	}
}
