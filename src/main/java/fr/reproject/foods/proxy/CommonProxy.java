package fr.reproject.foods.proxy;

import fr.reproject.foods.handler.RERecipes;
import fr.reproject.foods.init.REItems;

public class CommonProxy {

    public void preInit() {
        REItems.init();
        REItems.registerItems();
        RERecipes.register();
    }

    public void render() {

    }
}
