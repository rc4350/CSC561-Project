package Pokemon;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;

import javax.imageio.ImageIO;
import javax.swing.ImageIcon;

/**
 * creates instances of pokemon with predetermined values
 * @author Ryan Campbell
 */
import Type.FireType;
import Type.GrassType;
import Type.WaterType;

//TODO add attacks and imageIcons for pokemon

public class PokemonFactory
{

	/*
	 * grass types
	 */
	public Pokemon getBulbasaur() throws IOException
	{
		Pokemon poke = new Pokemon("Bulbasaur", 170, new GrassType());
		poke.setImageIcon(buildIcon("img/001-Bulbasaur-icon.png"));
		return poke;
	}

	public Pokemon getIvySaur() throws IOException
	{
		Pokemon poke = new Pokemon("Ivysaur", 230, new GrassType());
		poke.setImageIcon(buildIcon("img/002-Ivysaur-icon.png"));
		return poke;
	}

	public Pokemon getVenuSaur() throws IOException
	{
		Pokemon poke =  new Pokemon("Venusaur", 320, new GrassType());
		poke.setImageIcon(buildIcon("img/003-Venusaur-icon.png"));
		return poke;
	}

	public Pokemon getCaterpie() throws IOException
	{
		Pokemon poke = new Pokemon("Caterpie", 160, new GrassType());
		poke.setImageIcon(buildIcon("img/010-Caterpie-icon.png"));
		return poke;
	}
	/*
	 * fire types
	 */
	public Pokemon getCharmander() throws IOException
	{
		Pokemon poke = new Pokemon("Charmander", 170, new FireType());
		poke.setImageIcon(buildIcon("img/004-Charmander-icon.png"));
		return poke;
	}

	public Pokemon getCharmeleon() throws IOException
	{
		Pokemon poke =  new Pokemon("Charmeleon", 230, new FireType());
		poke.setImageIcon(buildIcon("img/005-Charmeleon-icon.png"));
		return poke;
	}

	public Pokemon getCharizard() throws IOException
	{
		Pokemon poke =  new Pokemon("Charizard", 320, new FireType());
		poke.setImageIcon(buildIcon("img/006-Charizard-icon.png"));
		return poke;
	}

	public Pokemon getVulpix() throws IOException
	{
		Pokemon poke =  new Pokemon("Vulpix", 160, new FireType());
		poke.setImageIcon(buildIcon("img/037-Vulpix-icon.png"));
		return poke;
	}
	/*
	 * water types
	 */

	public Pokemon getSquirtle() throws IOException
	{
		Pokemon poke =  new Pokemon("Squirtle", 170, new WaterType());
		poke.setImageIcon(buildIcon("img/007-Squirtle-icon.png"));
		return poke;
	}

	public Pokemon getWartortle() throws IOException
	{
		Pokemon poke =  new Pokemon("Wartortle", 230, new WaterType());
		poke.setImageIcon(buildIcon("img/008-Wartortle-icon.png"));
		return poke;
	}

	public Pokemon getBlastoise() throws IOException
	{
		Pokemon poke = new Pokemon("Blastoise", 320, new WaterType());
		poke.setImageIcon(buildIcon("img/009-Blastoise-icon.png"));
		return poke;
	}

	public Pokemon getPoliwag() throws IOException
	{
		Pokemon poke =  new Pokemon("Poliwag", 160, new WaterType());
		poke.setImageIcon(buildIcon("img/060-Poliwag-icon.png"));
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
