package fr.reproject.foods.init;

import fr.reproject.core.basic.REItem;
import fr.reproject.foods.REFoods;
import fr.reproject.core.basic.REItemFood;
import fr.reproject.core.utils.Register;
import net.minecraft.item.Item;

public class REItems {
    private static int numberOfItem = 4;

    public static Item[] items;

    public static void init() {
        Item tomato = new REItemFood(1, 0.1F, false, "tomato", REFoods.MODID);
        Item friesBE = new REItemFood(8, 1.0F, false, "friesbe", REFoods.MODID);
        Item friesFR = new REItemFood(6, 0.7F, false, "friesfr", REFoods.MODID);
        Item juicesExtractor = new REItem("juicesextractor", REFoods.MODID);


        items = new Item[]{
                tomato,
                friesBE,
                friesFR,
                juicesExtractor
        };
        items[3].setContainerItem(items[3]);
    }

    public static void registerItems() {
        for(int i = 0; i <= numberOfItem - 1; i++) {
            Register.registerItem(items[i], REFoods.RE_FOODS, REFoods.logger);
        }
    }

    public static void registerRenders() {
        for(int i = 0; i <= numberOfItem - 1; i++) {
            Register.registerRender(items[i], REFoods.MODID, REFoods.logger);
        }
    }
}
