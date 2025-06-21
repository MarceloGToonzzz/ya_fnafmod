
package net.mcreator.yafnafmod.block;

import net.minecraft.world.level.block.state.BlockBehaviour;
import net.minecraft.world.level.block.SoundType;
import net.minecraft.world.level.block.SlabBlock;

public class RedBlueFoamTileSlabBlock extends SlabBlock {
	public RedBlueFoamTileSlabBlock() {
		super(BlockBehaviour.Properties.of().sound(SoundType.WOOL).strength(0.5f, 5f).dynamicShape());
	}
}
