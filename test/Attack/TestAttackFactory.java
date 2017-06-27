package Attack;

import static org.junit.Assert.*;

import org.junit.Test;

import Type.PkmnType;

public class TestAttackFactory 
{
	@Test
	public void testConstruct()
	{
		AttackFactory af = new AttackFactory();
		assertNotNull(af);
	}

	@Test
	public void testAttackFactory()
	{
		AttackFactory af = new AttackFactory();
		Attack att;
		
		// 1 for fire, damage 100 and speed 100
		att = af.attackFactory(1);
		assertEquals(PkmnType.FIRE, att.getType());
		assertEquals(100,att.getDamage());
		assertEquals(100,att.getSpeed());
		
		// 2 for Water, damage 40 and speed 40
		att = af.attackFactory(2);
		assertEquals(PkmnType.WATER, att.getType());
		assertEquals(40,att.getDamage());
		assertEquals(40,att.getSpeed());
		
		// 3 for fire, damage 100 and speed 100
		att = af.attackFactory(3);
		assertEquals(PkmnType.GRASS, att.getType());
		assertEquals(10,att.getDamage());
		assertEquals(10,att.getSpeed());
	}
}