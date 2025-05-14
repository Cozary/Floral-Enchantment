package com.cozary.floralench.blocks.factory;

import com.cozary.floralench.blocks.base.VineBaseBlock;
import com.cozary.floralench.blocks.eyeblossom_variant.EyeblossomVineBaseBlock;
import com.cozary.floralench.blocks.wither_variant.WitherVineBaseBlock;

public class VineBlockFactory {

    public static VineBaseBlock create(String name) {
        return new VineBaseBlock(name);
    }

    public static WitherVineBaseBlock createWither(String name) {
        return new WitherVineBaseBlock(name);
    }

    public static EyeblossomVineBaseBlock createEyeblossom(String name, EyeblossomVineBaseBlock.Type type) {
        return new EyeblossomVineBaseBlock(name, type);
    }
}
