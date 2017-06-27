package Pokemon;

import static org.junit.Assert.*;

import java.awt.BorderLayout;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import java.util.Map;


import javax.imageio.ImageIO;
import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;

import org.junit.Test;

import Attack.Attack;
import Type.FireType;
import Type.NoType;
import Type.PkmnType;
import Type.WaterType;

public class TestPokemon
{

	@Test
	public void testConstruct()
	{
		Pokemon poke = new Pokemon("Missingno", 240);
		assertNotNull(poke);
	}

	@Test
	public void testHPGetSet()
	{
		Pokemon poke = new Pokemon("Missingno", 240);
		assertEquals(240, poke.getMaxHP());
		assertEquals(240, poke.getCurrentHP());
		
		poke = new Pokemon("Missingno", 0);
		assertEquals(1, poke.getMaxHP());
		assertEquals(1, poke.getCurrentHP());
		
		poke.setHP(200);
		assertEquals(200, poke.getMaxHP());
		assertEquals(200, poke.getCurrentHP());
		poke.setCurrentHP(100);
		assertEquals(200, poke.getMaxHP());
		assertEquals(100, poke.getCurrentHP());
		poke.setCurrentHP(210);
		assertEquals(200, poke.getCurrentHP());
		poke.setCurrentHP(-10);
		assertEquals(0, poke.getCurrentHP());
	}
	@Test
	public void testNameGetSet()
	{
		Pokemon poke = new Pokemon("'M'", 240);
		assertEquals("'M'", poke.getName());
		poke.setName("Missingno");
		assertEquals("Missingno", poke.getName());
		poke.setName(null);
		assertEquals("Missingno", poke.getName());
	}
	@Test
	public void testAttackGetSet()
	{
		Pokemon poke = new Pokemon("'M'", 240);
		Attack a1 = new Attack();
		Attack a2 = new Attack();
		Attack a3 = new Attack();
		Attack a4 = new Attack();
		Attack a5 = new Attack();
		
		for(int i = -1; i<5; i++)
		{
			assertNull(poke.getAttack(0));
		}
		poke.addAttack(a1);
		assertEquals(a1, poke.getAttack(0));
		poke.addAttack(a2);
		poke.addAttack(a3);
		poke.addAttack(a4);
		poke.addAttack(a5);
		
		assertEquals(a1, poke.getAttack(0));
		assertEquals(a2, poke.getAttack(1));
		assertEquals(a3, poke.getAttack(2));
		assertEquals(a4, poke.getAttack(3));
	}
	
	@Test
	public void testTypeSetGet()
	{
		Pokemon poke = new Pokemon("Missingno", 240);
		assertTrue(poke.getType() instanceof NoType);
		FireType fire = new FireType();
		poke.setType(fire);
		assertEquals(fire, poke.getType());
		
		WaterType water = new WaterType();
		Pokemon pokew = new Pokemon("Missingno", 240, water);
		assertEquals(water, pokew.getType());
		
		pokew.setType(null);;
		assertEquals(water, pokew.getType());
	}
	
	@Test
	public void testImageIconGetSet() throws IOException
	{
		
		BufferedImage mbi = ImageIO.read(new File("img/missingnoIcon.png"));
		ImageIcon missIcon = new ImageIcon(mbi);
		assertNotNull(missIcon);
		Pokemon poke = new Pokemon("Missingno", 240);
		testFrame tf = new testFrame(missIcon);
		tf.makeVisable();
		assertEquals(JOptionPane.YES_OPTION, JOptionPane.showConfirmDialog(null, "Does icon display correctly?"));
		
	}
	
	@Test
	public void testTakeHit()
	{
		FireType fire = new FireType();
		Attack watergun = new Attack();
		watergun.setDamage(40);
		watergun.setType(PkmnType.WATER);
		Pokemon poke = new Pokemon ("F1", 100, fire);
		poke.takeHit(watergun);
		assertEquals(20, poke.getCurrentHP());
		poke.takeHit(null);
		assertEquals(20, poke.getCurrentHP());
		poke.takeHit(watergun);
		assertEquals(0, poke.getCurrentHP());
		
	}
}

class testFrame extends JFrame
{
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private JLabel label;
	private JLabel ilabel;
	//private JPanel panel;
	public testFrame(ImageIcon img)
	{
		this.setLayout(new BorderLayout());
		
		ilabel = new JLabel(img);
		label = new JLabel("test");
		//panel = new JPanel(new BorderLayout());
		this.add("North", label);
		this.add("Center", ilabel);
		this.pack();
	}
	public void makeVisable()
	{
		this.setVisible(true);
	}
}