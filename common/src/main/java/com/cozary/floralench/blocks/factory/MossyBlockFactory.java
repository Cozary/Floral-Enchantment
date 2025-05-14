package com.cozary.floralench.blocks.factory;

import com.cozary.floralench.blocks.base.MossyBlock;
import com.cozary.floralench.blocks.eyeblossom_variant.EyeblossomMossyBlock;
import com.cozary.floralench.blocks.wither_variant.WitherMossyBlock;

public class MossyBlockFactory {

    public static MossyBlock create(String name) {
        return new MossyBlock(name);
    }

    public static WitherMossyBlock createWither(String name) {
        return new WitherMossyBlock(name);
    }

    public static EyeblossomMossyBlock createEyeblossom(String name, EyeblossomMossyBlock.Type type) {
        return new EyeblossomMossyBlock(name, type);
    }
}
