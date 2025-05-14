package com.cozary.floralench.blocks.factory;

import com.cozary.floralench.blocks.base.MossyStoneBrickBlock;
import com.cozary.floralench.blocks.eyeblossom_variant.EyeblossomMossyBlock;
import com.cozary.floralench.blocks.eyeblossom_variant.EyeblossomMossyStoneBrickBlock;
import com.cozary.floralench.blocks.wither_variant.WitherMossyStoneBrickBlock;

public class MossyStoneBricksBlockFactory {

    public static MossyStoneBrickBlock create(String name) {
        return new MossyStoneBrickBlock(name);
    }

    public static WitherMossyStoneBrickBlock createWither(String name) {
        return new WitherMossyStoneBrickBlock(name);
    }

    public static EyeblossomMossyStoneBrickBlock createEyeblossom(String name, EyeblossomMossyStoneBrickBlock.Type type) {
        return new EyeblossomMossyStoneBrickBlock(name, type);
    }
}
