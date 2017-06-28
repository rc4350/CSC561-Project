import org.junit.runner.RunWith;
import org.junit.runners.Suite;

import Attack.TestAttack;
import Attack.TestAttackFactory;
import Command.TestSwapPanelConfirmCMDPlayer1;
import Pokemon.TestPokemon;
import Pokemon.TestPokemonFactory;
import Type.TestFireType;
import Type.TestGrassType;
import Type.TestPkmnType;
import Type.TestWaterType;
import UI.TestSwapPanel;
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
	TestSwapPanelConfirmCMDPlayer1.class
})

public class AllGameTests {

}
