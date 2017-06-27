package Pokemon;

import static org.junit.Assert.*;

import java.io.IOException;

import javax.swing.ImageIcon;

import org.junit.Test;

import Type.FireType;
import Type.GrassType;
import Type.WaterType;

public class TestPokemonFactory
{

	@Test
	public void testConstruct()
	{
		PokemonFactory pf = new PokemonFactory();
		assertNotNull(pf);
	}

	@Test
	public void testBulbasaur() throws IOException
	{
		PokemonFactory pf = new PokemonFactory();
		Pokemon br;
		br = pf.getBulbasaur();
		assertEquals(170, br.getMaxHP());
		assertEquals(170, br.getCurrentHP());
		assertEquals("Bulbasaur", br.getName());
		assertTrue(br.getType() instanceof GrassType);
		assertNotNull(br.getImageIcon());
	}
	
	@Test
	public void testIvysaur() throws IOException
	{
		PokemonFactory pf = new PokemonFactory();
		Pokemon br;
		br = pf.getIvySaur();
		assertEquals(230, br.getMaxHP());
		assertEquals(230, br.getCurrentHP());
		assertEquals("Ivysaur", br.getName());
		assertTrue(br.getType() instanceof GrassType);
		assertNotNull(br.getImageIcon());
	}
	@Test
	public void testVenusaur()
	{
		PokemonFactory pf = new PokemonFactory();
		Pokemon br;
		br = pf.getVenuSaur();
		assertEquals(320, br.getMaxHP());
		assertEquals(320, br.getCurrentHP());
		assertEquals("Venusaur", br.getName());
		assertTrue(br.getType() instanceof GrassType);
		assertNotNull(br.getImageIcon());
	}
	@Test
	public void testCaterpie()
	{
		PokemonFactory pf = new PokemonFactory();
		Pokemon br;
		br = pf.getCaterpie();
		assertEquals(160, br.getMaxHP());
		assertEquals(160, br.getCurrentHP());
		assertEquals("Caterpie", br.getName());
		assertTrue(br.getType() instanceof GrassType);
		assertNotNull(br.getImageIcon());
	}
	
	@Test
	public void testCharmander()
	{
		PokemonFactory pf = new PokemonFactory();
		Pokemon br;
		br = pf.getCharmander();
		assertEquals(170, br.getMaxHP());
		assertEquals(170, br.getCurrentHP());
		assertEquals("Charmander", br.getName());
		assertTrue(br.getType() instanceof FireType);
		assertNotNull(br.getImageIcon());
	}
	
	@Test
	public void testCharmeleon()
	{
		PokemonFactory pf = new PokemonFactory();
		Pokemon br;
		br = pf.getCharmeleon();
		assertEquals(230, br.getMaxHP());
		assertEquals(230, br.getCurrentHP());
		assertEquals("Charmeleon", br.getName());
		assertTrue(br.getType() instanceof FireType);
		assertNotNull(br.getImageIcon());
	}
	
	@Test
	public void testCharizard()
	{
		PokemonFactory pf = new PokemonFactory();
		Pokemon br;
		br = pf.getCharizard();
		assertEquals(320, br.getMaxHP());
		assertEquals(320, br.getCurrentHP());
		assertEquals("Charizard", br.getName());
		assertTrue(br.getType() instanceof FireType);
		assertNotNull(br.getImageIcon());
	}
	@Test
	public void testVulpix()
	{
		PokemonFactory pf = new PokemonFactory();
		Pokemon br;
		br = pf.getVulpix();
		assertEquals(160, br.getMaxHP());
		assertEquals(160, br.getCurrentHP());
		assertEquals("Vulpix", br.getName());
		assertTrue(br.getType() instanceof FireType);
		assertNotNull(br.getImageIcon());
	}
	
	@Test
	public void testSquirtle()
	{
		PokemonFactory pf = new PokemonFactory();
		Pokemon br;
		br = pf.getSquirtle();
		assertEquals(170, br.getMaxHP());
		assertEquals(170, br.getCurrentHP());
		assertEquals("Squirtle", br.getName());
		assertTrue(br.getType() instanceof WaterType);
		assertNotNull(br.getImageIcon());
	}
	@Test
	public void testWartortle()
	{
		PokemonFactory pf = new PokemonFactory();
		Pokemon br;
		br = pf.getWartortle();
		assertEquals(230, br.getMaxHP());
		assertEquals(230, br.getCurrentHP());
		assertEquals("Wartortle", br.getName());
		assertTrue(br.getType() instanceof WaterType);
		assertNotNull(br.getImageIcon());
	}
	
	@Test
	public void testBlastoise()
	{
		PokemonFactory pf = new PokemonFactory();
		Pokemon br;
		br = pf.getBlastoise();
		assertEquals(320, br.getMaxHP());
		assertEquals(320, br.getCurrentHP());
		assertEquals("Blastoise", br.getName());
		assertTrue(br.getType() instanceof WaterType);
		assertNotNull(br.getImageIcon());
	}
	
	@Test
	public void testPoliwag()
	{
		PokemonFactory pf = new PokemonFactory();
		Pokemon br;
		br = pf.getPoliwag();
		assertEquals(160, br.getMaxHP());
		assertEquals(160, br.getCurrentHP());
		assertEquals("Poliwag", br.getName());
		assertTrue(br.getType() instanceof WaterType);
		assertNotNull(br.getImageIcon());
	}
	
	@Test
	public void testBuildIcon() throws IOException
	{
		PokemonFactory pf = new PokemonFactory();
		ImageIcon missIcon = pf.buildIcon("img/missingnoIcon.png");
		assertNotNull(missIcon);
	}
}
