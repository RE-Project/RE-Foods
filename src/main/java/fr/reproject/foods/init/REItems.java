package fr.reproject.foods.init;

import fr.reproject.core.RECore;
import fr.reproject.core.basic.REItem;
import fr.reproject.foods.REFoods;
import fr.reproject.core.basic.REItemFood;
import net.minecraft.item.Item;

public class REItems {
    private static int numberOfItem = 6;

    public static Item[] items;

    public static void init() {
        Item tomato = new REItemFood(1, 1.0F, false, "tomato", REFoods.MODID); //item 1, 0 for the game
        Item friesBE = new REItemFood(8, 10.0F, false, "friesbe", REFoods.MODID); //item 2, 1 for the game
        Item friesFR = new REItemFood(6, 7.0F, false, "friesfr", REFoods.MODID); //item 3, 2 for the game
        Item juicesExtractor = new REItem("juicesextractor", REFoods.MODID); //item 4, 3 for the game
        juicesExtractor.setContainerItem(juicesExtractor);
        Item appleJuices = new REItemFood(6, 3.6F, false, "applejuices", REFoods.MODID); //item 5, 4 for the game
        Item tomatoJuices = new REItemFood(2, 2.0F, false, "tomatojuices", REFoods.MODID); //item 6, 5 for the game


        items = new Item[]{
                tomato,
                friesBE,
                friesFR,
                juicesExtractor,
                appleJuices,
                tomatoJuices
        };
    }

    public static void registerItems() {
        for(int i = 0; i <= numberOfItem - 1; i++) {
            RECore.Utils.registerItem(items[i], REFoods.RE_FOODS, REFoods.logger);

        }
    }

    public static void registerRenders() {
        for(int i = 0; i <= numberOfItem - 1; i++) {
            RECore.Utils.registerRender(items[i], REFoods.MODID, REFoods.logger);
        }
    }
}
