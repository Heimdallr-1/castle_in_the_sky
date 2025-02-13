package com.song.castle_in_the_sky.blocks;

import com.song.castle_in_the_sky.items.ItemsRegister;
import net.minecraft.world.item.Item;
import net.minecraft.world.level.material.MapColor;
import net.minecraft.world.level.material.PushReaction;

public class BlueDoor extends LockedDoor {
    protected BlueDoor() {
        super(Properties.of().mapColor(MapColor.METAL).requiresCorrectToolForDrops().strength(5.0F).noOcclusion().pushReaction(PushReaction.DESTROY));
    }

    @Override
    protected boolean isKeyItem(Item item) {
        return item==ItemsRegister.BLUE_KEY.get();
    }
}
