package ingoleth.leprechaun;

import net.minecraft.init.Blocks;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.SidedProxy;
import net.minecraftforge.fml.common.event.FMLInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPostInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPreInitializationEvent;
import org.apache.logging.log4j.Logger;

import ingoleth.leprechaun.proxy.CommonProxy;

@Mod(modid = leprechaun.MODID, name = leprechaun.NAME, version = leprechaun.VERSION, dependencies = "required-after:forge@[14.23.5.2768,)")
public class leprechaun
{
    public static final String MODID = "leprechaun";
    public static final String NAME = "Leprechaun";
    public static final String VERSION = "0.1";

    @SidedProxy(clientSide = "ingoleth.leprechaun.proxy.ClientProxy", serverSide = "ingoleth.leprechaun.proxy.ServerProxy")
    
    @Mod.Instance
    public static leprechaun instance;
    
    public static CommonProxy proxy;
    
    private static Logger logger;

    @Mod.EventHandler
    public void preInit(FMLPreInitializationEvent event)
    {
        logger = event.getModLog();
    }

    @Mod.EventHandler
    public void init(FMLInitializationEvent event)
    {
        // some example code
        logger.info("DIRT BLOCK >> {}", Blocks.DIRT.getRegistryName());
    }
    @Mod.EventHandler
    public void postInit(FMLPostInitializationEvent event) {
    	//Remove if unneeded...
    }
}
