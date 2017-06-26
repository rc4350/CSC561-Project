package Type;

import static org.junit.Assert.*;

import org.junit.Test;

public class TestWaterType
{

	@Test
	public void testConstruct()
	{
		TypeBehavior water = new WaterType();
		assertNotNull(water);
		assertTrue(water instanceof TypeBehavior);
	}
	
	@Test
	public void testDamageModify()
	{
		WaterType water = new WaterType();
		assertEquals(50, water.takeHit(PkmnType.WATER, 50));
		assertEquals(100, water.takeHit(PkmnType.GRASS, 50));
		assertEquals(25, water.takeHit(PkmnType.FIRE, 50));
		
		assertEquals(10, water.takeHit(PkmnType.FIRE, 21));
		assertEquals(0, water.takeHit(PkmnType.WATER, -10));
		assertEquals(0, water.takeHit('x', 20));
	}

}
