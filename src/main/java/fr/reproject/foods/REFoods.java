package fr.reproject.foods;

import fr.reproject.foods.init.REFoodsTab;
import fr.reproject.foods.proxy.CommonProxy;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.Mod.EventHandler;
import net.minecraftforge.fml.common.SidedProxy;
import net.minecraftforge.fml.common.event.FMLInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPreInitializationEvent;
import org.apache.logging.log4j.Logger;

@Mod(modid = REFoods.MODID, name = REFoods.NAME, version = REFoods.VERSION, dependencies = "required:forge@[14.23.4.2705,);required-after:recore@[1.0.1,);")
public class REFoods {
    public static final String MODID = "refoods";
    public static final String NAME = "§dRE: Foods";
    public static final String VERSION = "1.0.0";
    public static final String CLIENT_PROXY_CLASSE = "fr.reproject.foods.proxy.ClientProxy";

    @SidedProxy(clientSide = REFoods.CLIENT_PROXY_CLASSE)
    public static CommonProxy proxy;

    public static Logger logger;

    public static CreativeTabs RE_FOODS = new REFoodsTab();

    @EventHandler
    public void preInit(FMLPreInitializationEvent event) {
        logger = event.getModLog();
        proxy.preInit();
        proxy.render();
    }

    @EventHandler
    public void init(FMLInitializationEvent event) {
        logger.info("Hello World!");
    }
}
