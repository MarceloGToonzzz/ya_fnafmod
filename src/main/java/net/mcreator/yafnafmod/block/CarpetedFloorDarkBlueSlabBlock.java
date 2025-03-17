
package net.mcreator.yafnafmod.block;

import net.minecraft.world.level.block.state.BlockBehaviour;
import net.minecraft.world.level.block.SoundType;
import net.minecraft.world.level.block.SlabBlock;

public class CarpetedFloorDarkBlueSlabBlock extends SlabBlock {
	public CarpetedFloorDarkBlueSlabBlock() {
		super(BlockBehaviour.Properties.of().sound(SoundType.WOOL).strength(1f, 10f).dynamicShape());
	}
}
