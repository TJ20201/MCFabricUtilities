package io.github.tj20201.mcfabricutilities;

import net.fabricmc.api.ModInitializer;
import net.minecraft.client.MinecraftClient;
import net.minecraft.client.util.Window;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class MCFabricUtilities implements ModInitializer {
    public static final String MODVERSION = "1.0.0";
    public static final String MODNAME = "MCFabricUtilities";
    public static final String MODID = "mcfabricutilities";
    public static final Logger LOGGER = LogManager.getLogger(MODNAME);
    
    // Minecraft Objects
    public static MinecraftClient CLIENT = MinecraftClient.getInstance();
    
    @Override
	public void onInitialize() {
		LOGGER.info("[MAIN]: Initializing "+MODNAME+" v"+MODVERSION+"...");
        
        // Output initialization finish
        LOGGER.info("[MAIN]: Initialized "+MODNAME+" v"+MODVERSION+"!");
	}
    
    public static Window getWindow() {
        return new Window(CLIENT);
    }
}
