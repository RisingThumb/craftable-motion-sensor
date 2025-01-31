package risingthumb.craftablemotionsensors;

import net.fabricmc.api.ModInitializer;
import net.minecraft.core.data.DataLoader;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import turniplabs.halplibe.util.ClientStartEntrypoint;
import turniplabs.halplibe.util.GameStartEntrypoint;
import turniplabs.halplibe.util.RecipeEntrypoint;


public class CraftableMotionSensors implements ModInitializer, RecipeEntrypoint, GameStartEntrypoint {
	public static final String MOD_ID = "craftablemotionsensors";
    public static final Logger LOGGER = LoggerFactory.getLogger(MOD_ID);
    @Override
    public void onInitialize() {
        LOGGER.info("Craftable Motion Sensor initialized.");
    }

	@Override
	public void onRecipesReady() {
		DataLoader.loadRecipesFromFile("/assets/craftablemotionsensors/recipe/workbench.json");
	}

	@Override
	public void initNamespaces() {

	}

	@Override
	public void beforeGameStart() {

	}

	@Override
	public void afterGameStart() {

	}
}
