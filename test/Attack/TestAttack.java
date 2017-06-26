package Attack;

import static org.junit.Assert.*;



import org.junit.Test;

import Type.PkmnType;

public class TestAttack
{

	@Test
	public void testConstruct()
	{
		Attack attack = new Attack();
		assertNotNull(attack);			
	}
	@Test
	public void testDamageGetSet()
	{
		Attack attk = new Attack();
		assertEquals(10, attk.getDamage());
		attk.setDamage(40);
		assertEquals(40, attk.getDamage());
	}

	@Test
	public void testSpeedGetSet()
	{
		Attack attk = new Attack();
		assertEquals(1, attk.getSpeed());
		attk.setSpeed(3);
		assertEquals(3, attk.getSpeed());
	}

	@Test
	public void testTypeGetSet()
	{
		Attack attk = new Attack();
		assertEquals(PkmnType.FIRE, attk.getType());
		attk.setType(PkmnType.WATER);
		assertEquals(PkmnType.WATER, attk.getType());
	}
}
