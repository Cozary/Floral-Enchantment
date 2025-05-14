package com.cozary.floralench.blocks.factory;

import com.cozary.floralench.blocks.base.FloralBasket;
import com.cozary.floralench.blocks.eyeblossom_variant.EyeblossomFloralBasket;
import com.cozary.floralench.blocks.wither_variant.WitherFloralBasket;

public class FloralBasketFactory {

    public static FloralBasket create(String name) {
        return new FloralBasket(name);
    }

    public static WitherFloralBasket createWither(String name) {
        return new WitherFloralBasket(name);
    }

    public static EyeblossomFloralBasket createEyeblossom(String name, EyeblossomFloralBasket.Type type) {
        return new EyeblossomFloralBasket(name, type);
    }

}
