
package net.mcreator.yafnafmod.block;

import net.minecraft.world.level.block.state.BlockBehaviour;
import net.minecraft.world.level.block.SoundType;
import net.minecraft.world.level.block.SlabBlock;

public class WoodenFloorDarkSlabBlock extends SlabBlock {
	public WoodenFloorDarkSlabBlock() {
		super(BlockBehaviour.Properties.of().sound(SoundType.WOOD).strength(1f, 10f).dynamicShape());
	}
}
