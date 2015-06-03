package com.cricketcraft.ctmlib;

import cpw.mods.fml.client.registry.RenderingRegistry;
import cpw.mods.fml.common.Mod;
import cpw.mods.fml.common.Mod.EventHandler;
import cpw.mods.fml.common.ModAPIManager;
import cpw.mods.fml.common.event.FMLPreInitializationEvent;
import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;

import static com.cricketcraft.ctmlib.CTMLib.*;

@Mod(modid = MODID, name = NAME, version = VERSION)
public class CTMLib {

	public static final String MODID = "ctmlib";
	public static final String NAME = "CTMLib";
	public static final String VERSION = "@VERSION@";

	private static boolean chiselPresent, chiselInitialized;

	public static boolean chiselLoaded() {
		if (!chiselInitialized) {
			chiselInitialized = true;
			chiselPresent = ModAPIManager.INSTANCE.hasAPI("ChiselAPI");
		}
		return chiselPresent;
	}

	@EventHandler
	@SideOnly(Side.CLIENT)
	public void preInit(FMLPreInitializationEvent event) {
		RenderingRegistry.registerBlockHandler(new RendererCTM());
	}
}
