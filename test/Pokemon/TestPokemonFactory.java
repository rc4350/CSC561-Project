package Pokemon;

import static org.junit.Assert.*;

import java.awt.GridLayout;
import java.io.IOException;

import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

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
	public void testVenusaur() throws IOException
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
	public void testCaterpie() throws IOException
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
	public void testCharmander() throws IOException
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
	public void testCharmeleon() throws IOException
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
	public void testCharizard() throws IOException
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
	public void testVulpix() throws IOException
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
	public void testSquirtle() throws IOException
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
	public void testWartortle() throws IOException
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
	public void testBlastoise() throws IOException
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
	public void testPoliwag() throws IOException
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
	@Test
	public void testImageCorrect() throws IOException
	{
		JFrame frame = new JFrame();
		frame.setLayout(new GridLayout(3,4));
		JLabel labels[] = new JLabel[12];
		PokemonFactory pf = new PokemonFactory();
		for(int i = 0; i<12; i++)
		{
			labels[i] = new JLabel();
		}
		
		labels[0].setIcon(pf.getBulbasaur().getImageIcon());
		labels[1].setIcon(pf.getIvySaur().getImageIcon());
		labels[2].setIcon(pf.getVenuSaur().getImageIcon());
		labels[3].setIcon(pf.getCaterpie().getImageIcon());
		labels[4].setIcon(pf.getCharmander().getImageIcon());
		labels[5].setIcon(pf.getCharmeleon().getImageIcon());
		labels[6].setIcon(pf.getCharizard().getImageIcon());
		labels[7].setIcon(pf.getVulpix().getImageIcon());
		labels[8].setIcon(pf.getSquirtle().getImageIcon());
		labels[9].setIcon(pf.getWartortle().getImageIcon());
		labels[10].setIcon(pf.getBlastoise().getImageIcon());
		labels[11].setIcon(pf.getPoliwag().getImageIcon());
		
		for(JLabel la:labels)
		{
			frame.add(la);
		}
		frame.pack();
		frame.setVisible(true);
		assertEquals(JOptionPane.YES_OPTION, JOptionPane.showConfirmDialog(null, "Do icons display correctly?"));
		
	}
}
