package fr.reproject.foods.handler;

import fr.reproject.foods.init.REItems;
import net.minecraft.init.Items;
import net.minecraft.item.ItemStack;
import net.minecraftforge.fml.common.registry.GameRegistry;

public class RERecipes {

    public static void register() {
        GameRegistry.addSmelting(new ItemStack(Items.BAKED_POTATO), new ItemStack(REItems.items[2]), 0.1F);
    }
}
