
package net.mcreator.yafnafmod.block;

import net.minecraft.world.level.block.state.BlockBehaviour;
import net.minecraft.world.level.block.SoundType;
import net.minecraft.world.level.block.SlabBlock;

public class BlueWhiteFoamTileSlabBlock extends SlabBlock {
	public BlueWhiteFoamTileSlabBlock() {
		super(BlockBehaviour.Properties.of().sound(SoundType.WOOL).strength(0.5f, 5f).dynamicShape());
	}
}
