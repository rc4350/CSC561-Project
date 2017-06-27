package gameworld;

import static org.junit.Assert.*;

import org.junit.Test;

public class TestGameWorld 
{
	@Test
	public void Test()
	{
		GameWorld testGameWorld;
		testGameWorld = GameWorld.getInstance();
		assertNull(testGameWorld);

	}
}