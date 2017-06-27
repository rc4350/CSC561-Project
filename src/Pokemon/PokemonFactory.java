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
		poke.setImageIcon(buildIcon("img/001-Bulbasaur-con.png"));
		return poke;
	}

	public Pokemon getIvySaur() throws IOException
	{
		Pokemon poke = new Pokemon("Ivysaur", 230, new GrassType());
		poke.setImageIcon(buildIcon("img/002-Ivysaur-con.png"));
		return poke;
	}

	public Pokemon getVenuSaur()
	{
		return new Pokemon("Venusaur", 320, new GrassType());
	}

	public Pokemon getCaterpie()
	{
		return new Pokemon("Caterpie", 160, new GrassType());
	}
	/*
	 * fire types
	 */
	public Pokemon getCharmander()
	{
		return new Pokemon("Charmander", 170, new FireType());
	}

	public Pokemon getCharmeleon()
	{
		return new Pokemon("Charmeleon", 230, new FireType());
	}

	public Pokemon getCharizard()
	{
		return new Pokemon("Charizard", 320, new FireType());
	}

	public Pokemon getVulpix()
	{
		return new Pokemon("Vulpix", 160, new FireType());
	}
	/*
	 * water types
	 */

	public Pokemon getSquirtle()
	{
		return new Pokemon("Squirtle", 170, new WaterType());
	}

	public Pokemon getWartortle()
	{
		return new Pokemon("Wartortle", 230, new WaterType());
	}

	public Pokemon getBlastoise()
	{
		return new Pokemon("Blastoise", 320, new WaterType());
	}

	public Pokemon getPoliwag()
	{
		return new Pokemon("Poliwag", 160, new WaterType());
	}

	/**
	 * accepts a string containing the image path and creates an image icon
	 * @param string
	 * @return
	 * @throws IOException 
	 */
	protected ImageIcon buildIcon(String path) throws IOException
	{
		BufferedImage bi = ImageIO.read(new File("img/missingnoIcon.png"));
		return new ImageIcon(bi);
	}
	
}
