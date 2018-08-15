package fr.reproject.foods.init;

import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.ItemStack;

public class REFoodsTab extends CreativeTabs {

    public REFoodsTab() {
        super("tabFoods");
    }

    @Override
    public ItemStack getTabIconItem() {
        return new ItemStack(REItems.items[1]);
    }
}
