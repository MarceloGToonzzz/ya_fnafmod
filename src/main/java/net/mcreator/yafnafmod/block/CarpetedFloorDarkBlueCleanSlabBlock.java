
package net.mcreator.yafnafmod.block;

import net.minecraft.world.level.block.state.BlockBehaviour;
import net.minecraft.world.level.block.SoundType;
import net.minecraft.world.level.block.SlabBlock;

public class CarpetedFloorDarkBlueCleanSlabBlock extends SlabBlock {
	public CarpetedFloorDarkBlueCleanSlabBlock() {
		super(BlockBehaviour.Properties.of().sound(SoundType.WOOL).strength(1f, 10f).dynamicShape());
	}
}
