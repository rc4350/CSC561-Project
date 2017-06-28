import org.junit.runner.RunWith;
import org.junit.runners.Suite;

import Attack.TestAttack;
import Attack.TestAttackFactory;
import Pokemon.TestPokemon;
import Pokemon.TestPokemonFactory;
import Type.TestFireType;
import Type.TestGrassType;
import Type.TestPkmnType;
import Type.TestWaterType;
import UI.TestSwapPanel;
import UI.TestSwapPanelConfirmCMD;
import gameworld.TestGameWorld;
import player.TestPlayer;

/**
 * Runs all the tests in this project
 * @author Ryan Campbell, Deema
 *
 */
@RunWith(Suite.class)
@Suite.SuiteClasses(
{
	TestAttack.class,
	TestAttackFactory.class,
	TestGameWorld.class,
	TestPlayer.class,
	TestPokemon.class,
	TestPokemonFactory.class,
	TestFireType.class,
	TestGrassType.class,
	TestPkmnType.class,
	TestWaterType.class,
	TestSwapPanel.class,
	TestSwapPanelConfirmCMD.class
})

public class AllGameTests {

}
