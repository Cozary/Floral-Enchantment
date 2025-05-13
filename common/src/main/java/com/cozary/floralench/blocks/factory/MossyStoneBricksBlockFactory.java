package com.cozary.floralench.blocks.factory;

import com.cozary.floralench.blocks.base.MossyStoneBrickBlock;
import com.cozary.floralench.blocks.wither_variant.WitherMossyStoneBrickBlock;

public class MossyStoneBricksBlockFactory {

    public static MossyStoneBrickBlock create(String name) {
        return new MossyStoneBrickBlock(name);
    }

    public static WitherMossyStoneBrickBlock createWither(String name) {
        return new WitherMossyStoneBrickBlock(name);
    }

}
