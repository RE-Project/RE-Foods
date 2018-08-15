package fr.reproject.foods.proxy;

import fr.reproject.foods.init.REItems;

public class ClientProxy extends CommonProxy {

    @Override
    public void preInit() {
        super.preInit();
    }

    @Override
    public void render() {
        REItems.registerRenders();
    }
}
