
package net.mcreator.yafnafmod.block;

import net.minecraft.world.level.block.state.BlockBehaviour;
import net.minecraft.world.level.block.SoundType;
import net.minecraft.world.level.block.SlabBlock;

public class GalleryWallSlabBlock extends SlabBlock {
	public GalleryWallSlabBlock() {
		super(BlockBehaviour.Properties.of().sound(SoundType.METAL).strength(1f, 10f).dynamicShape());
	}
}
