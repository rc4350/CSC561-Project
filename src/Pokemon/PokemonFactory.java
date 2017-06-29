package Pokemon;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;

import javax.imageio.ImageIO;
import javax.swing.ImageIcon;

import Attack.Attack;
import Attack.AttackFactory;
/**
 * creates instances of pokemon with predetermined values
 * @author Ryan Campbell
 */
import Type.FireType;
import Type.GrassType;
import Type.WaterType;

/**
* creates pokemon instances
*@author DeemacAlrashdan, Ryan Campbell
*/

public class PokemonFactory
{
	private Attack fire[];
	private Attack water[];
	private Attack grass[];
	
	/**
	 * construct pokemon factory, get attacks from attack factory
	 */
	public PokemonFactory()
	{
		AttackFactory af = new AttackFactory();
		fire = new Attack[3];
		water = new Attack[3];
		grass = new Attack[3];
		
		fire[0] = af.getFireStrong();
		fire[1] = af.getFireMedium();
		fire[2] = af.getFireWeak();
		water[0] = af.getWaterStrong();
		water[1] = af.getWaterMedium();
		water[2] = af.getWaterWeak();
		grass[0] = af.getGrassStrong();
		grass[1] = af.getGrassMedium();
		grass[2] = af.getGrassWeak();
		
	}

	/*
	 * grass types
	 */
	/**
	 * create a new Pokemon called Bulbasaur
	 * @return pokemon
	 */
	public Pokemon getBulbasaur() throws IOException
	{
		Pokemon poke = new Pokemon("Bulbasaur", 170, new GrassType());
		poke.setImageIcon(buildIcon("img/001-Bulbasaur-icon.png"));
		poke.addAttack(grass[1]); //add medium grass attack
		poke.addAttack(grass[2]); //add weak grass attack
		poke.addAttack(fire[0]); //add strong fire attack
		return poke;
	}
	/**
	 * create a new Pokemon called IvySaur
	 * @return pokemon
	 */
	public Pokemon getIvySaur() throws IOException
	{
		Pokemon poke = new Pokemon("Ivysaur", 230, new GrassType());
		poke.setImageIcon(buildIcon("img/002-Ivysaur-icon.png"));
		poke.addAttack(grass[0]); //add strong grass attack
		poke.addAttack(grass[2]); //add weak grass attack
		poke.addAttack(fire[2]); //add weak fire attack
		return poke;
	}

	/**
	 * create a new Pokemon called Venusaur
	 * @return pokemon
	 */
	public Pokemon getVenuSaur() throws IOException
	{
		Pokemon poke =  new Pokemon("Venusaur", 320, new GrassType());
		poke.setImageIcon(buildIcon("img/003-Venusaur-icon.png"));
		poke.addAttack(grass[0]); //add strong grass attack
		poke.addAttack(grass[1]); //add medium grass attack
		poke.addAttack(grass[2]); //add weak grass attack
		poke.addAttack(fire[1]); //add medium fire attack
		return poke;
	}
	/**
	 * create a new Pokemon called Caterpie
	 * @return pokemon
	 */
	public Pokemon getCaterpie() throws IOException
	{
		Pokemon poke = new Pokemon("Caterpie", 160, new GrassType());
		poke.setImageIcon(buildIcon("img/010-Caterpie-icon.png"));
		poke.addAttack(grass[0]); //add strong grass attack
		poke.addAttack(grass[2]); //add weak grass attack
		poke.addAttack(fire[2]); //add weak fire attack
		poke.addAttack(water[2]); //add weak water attack
		return poke;
	}
	/*
	 * fire types
	 */
	/**
	 * create a new Pokemon called Charmander
	 * @return pokemon
	 */
	public Pokemon getCharmander() throws IOException
	{
		Pokemon poke = new Pokemon("Charmander", 170, new FireType());
		poke.setImageIcon(buildIcon("img/004-Charmander-icon.png"));
		poke.addAttack(fire[1]); //add medium fire attack
		poke.addAttack(fire[2]); //add weak fire attack
		poke.addAttack(water[0]); //add strong water attack
		return poke;
	}
	/**
	 * create a new Pokemon called Charmeleon
	 * @return pokemon
	 */
	public Pokemon getCharmeleon() throws IOException
	{
		Pokemon poke =  new Pokemon("Charmeleon", 230, new FireType());
		poke.setImageIcon(buildIcon("img/005-Charmeleon-icon.png"));
		poke.addAttack(fire[0]); //add strong fire attack
		poke.addAttack(fire[2]); //add weak fire attack
		poke.addAttack(water[2]); //add weak water attack
		return poke;
	}
	
	/**
	 * create a new Pokemon called Charizard
	 * @return pokemon
	 */
	public Pokemon getCharizard() throws IOException
	{
		Pokemon poke =  new Pokemon("Charizard", 320, new FireType());
		poke.setImageIcon(buildIcon("img/006-Charizard-icon.png"));
		poke.addAttack(fire[0]); //add strong fire attack
		poke.addAttack(fire[1]); //add medium fire attack
		poke.addAttack(fire[2]); //add weak fire attack
		poke.addAttack(water[1]); //add medium water attack
		return poke;
	}
	/**
	 * create a new Pokemon called Vulpix
	 * @return pokemon
	 */
	public Pokemon getVulpix() throws IOException
	{
		Pokemon poke =  new Pokemon("Vulpix", 160, new FireType());
		poke.setImageIcon(buildIcon("img/037-Vulpix-icon.png"));
		poke.addAttack(fire[0]); //add strong fire attack
		poke.addAttack(fire[2]); //add weak fire attack
		poke.addAttack(water[2]); //add weak water attack
		poke.addAttack(grass[2]); //add weak grass attack
		return poke;
	}
	/*
	 * water types
	 */

	/**
	 * create a new Pokemon called Squirtle
	 * @return pokemon
	 */
	public Pokemon getSquirtle() throws IOException
	{
		Pokemon poke =  new Pokemon("Squirtle", 170, new WaterType());
		poke.setImageIcon(buildIcon("img/007-Squirtle-icon.png"));
		poke.addAttack(water[1]); //add medium water attack
		poke.addAttack(water[2]); //add weak water attack
		poke.addAttack(grass[0]); //add strong grass attack
		return poke;
	}
	/**
	 * create a new Pokemon called Wartortle
	 * @return pokemon
	 */
	public Pokemon getWartortle() throws IOException
	{
		Pokemon poke =  new Pokemon("Wartortle", 230, new WaterType());
		poke.setImageIcon(buildIcon("img/008-Wartortle-icon.png"));
		poke.addAttack(water[0]); //add strong water attack
		poke.addAttack(water[2]); //add weak water attack
		poke.addAttack(grass[2]); //add weak grass attack
		return poke;
	}
	/**
	 * create a new Pokemon called Blastoise
	 * @return pokemon
	 */
	public Pokemon getBlastoise() throws IOException
	{
		Pokemon poke = new Pokemon("Blastoise", 320, new WaterType());
		poke.setImageIcon(buildIcon("img/009-Blastoise-icon.png"));
		poke.addAttack(water[0]); //add strong water attack
		poke.addAttack(water[1]); //add medium water attack
		poke.addAttack(water[2]); //add weak water attack
		poke.addAttack(grass[1]); //add medium grass attack
		return poke;
	}
	/**
	 * create a new Pokemon called Poliwag
	 * @return pokemon
	 */
	public Pokemon getPoliwag() throws IOException
	{
		Pokemon poke =  new Pokemon("Poliwag", 160, new WaterType());
		poke.setImageIcon(buildIcon("img/060-Poliwag-icon.png"));
		poke.addAttack(water[0]); //add strong water attack
		poke.addAttack(water[2]); //add weak water attack
		poke.addAttack(grass[2]); //add weak grass attack
		poke.addAttack(fire[2]); //add weak fire attack
		return poke;
	}

	/**
	 * accepts a string containing the image path and creates an image icon
	 * @param string
	 * @return
	 * @throws IOException 
	 */
	protected ImageIcon buildIcon(String path) throws IOException
	{
		BufferedImage bi = ImageIO.read(new File(path));
		return new ImageIcon(bi);
	}
	
}
