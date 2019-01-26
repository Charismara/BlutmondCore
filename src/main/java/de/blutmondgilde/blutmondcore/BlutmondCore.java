package de.blutmondgilde.blutmondcore;

import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.Mod.EventHandler;
import net.minecraftforge.fml.common.event.FMLInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPostInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPreInitializationEvent;
import org.apache.logging.log4j.Logger;

@Mod(modid = BlutmondCore.MODID, name = BlutmondCore.NAME, version = BlutmondCore.VERSION)
public class BlutmondCore
{
    public static final String MODID = "blutmondcore";
    public static final String NAME = "BlutmondCore";
    public static final String VERSION = "0.0.1";

    private static Logger logger;

    @EventHandler
    public void preInit(FMLPreInitializationEvent event){
        logger = event.getModLog();
    }

    @EventHandler
    public void init(FMLInitializationEvent event){
    }

    @EventHandler
    public void postinit(FMLPostInitializationEvent event){
    }
}
