package Attack;

import static org.junit.Assert.*;

import org.junit.Test;

import Type.PkmnType;
/**
 * TestAttackFactory class to test the instances of attack 
 * @author Deema Alrashdan
 */

public class TestAttackFactory 
{
	@Test
	public void testConstruct()
	{
		AttackFactory af = new AttackFactory();
		assertNotNull(af);
	}
	@Test
	public void TestFireStrong()
	{
		AttackFactory af = new AttackFactory();
		Attack att;
		att = af.getFireStrong();
		assertEquals("FireStrong",att.getName());
		assertEquals(PkmnType.FIRE, att.getType());
		assertEquals(80,att.getDamage());
		assertEquals(1,att.getSpeed());	
	}
	
	@Test
	public void TestFireMedium()
	{
		AttackFactory af = new AttackFactory();
		Attack att;
		att = af.getFireMedium();
		assertEquals("FireMedium",att.getName());
		assertEquals(PkmnType.FIRE, att.getType());
		assertEquals(60,att.getDamage());
		assertEquals(2,att.getSpeed());	
	}
	
	@Test
	public void TestFireWeak()
	{
		AttackFactory af = new AttackFactory();
		Attack att;
		att = af.getFireWeak();
		assertEquals("FireWeak",att.getName());
		assertEquals(PkmnType.FIRE, att.getType());
		assertEquals(40,att.getDamage());
		assertEquals(3,att.getSpeed());
	}
	
	@Test
	public void TestWaterStrong()
	{
		AttackFactory af = new AttackFactory();
		Attack att;
		att = af.getWaterStrong();
		assertEquals("WaterStrong",att.getName());
		assertEquals(PkmnType.WATER, att.getType());
		assertEquals(80,att.getDamage());
		assertEquals(1,att.getSpeed());
	}
	
	@Test
	public void TestWaterMedium()
	{
		AttackFactory af = new AttackFactory();
		Attack att;
		att = af.getWaterMedium();
		assertEquals("WaterMedium",att.getName());
		assertEquals(PkmnType.WATER, att.getType());
		assertEquals(60,att.getDamage());
		assertEquals(2,att.getSpeed());
	}
	
	@Test
	public void TestWaterWeak()
	{
		AttackFactory af = new AttackFactory();
		Attack att;
		att = af.getWaterWeak();
		assertEquals("WaterWeak",att.getName());
		assertEquals(PkmnType.WATER, att.getType());
		assertEquals(40,att.getDamage());
		assertEquals(3,att.getSpeed());
	}
	
	@Test
	public void TestGrassStrong()
	{
		AttackFactory af = new AttackFactory();
		Attack att;
		att = af.getGrassStrong();
		assertEquals("GrassStrong",att.getName());
		assertEquals(PkmnType.GRASS, att.getType());
		assertEquals(80,att.getDamage());
		assertEquals(1,att.getSpeed());
	}
	
	@Test
	public void TestGrassMedium()
	{
		AttackFactory af = new AttackFactory();
		Attack att;
		att = af.getGrassMedium();
		assertEquals("GrassMedium",att.getName());
		assertEquals(PkmnType.GRASS, att.getType());
		assertEquals(60,att.getDamage());
		assertEquals(2,att.getSpeed());
	}
	
	@Test
	public void TestGrassWeak()
	{
		AttackFactory af = new AttackFactory();
		Attack att;
		att = af.getGrassWeak();
		assertEquals("GrassWeak",att.getName());
		assertEquals(PkmnType.GRASS, att.getType());
		assertEquals(40,att.getDamage());
		assertEquals(3,att.getSpeed());
	}
}
	
/**	@Test
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
	}*/
