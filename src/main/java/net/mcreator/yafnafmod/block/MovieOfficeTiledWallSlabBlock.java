
package net.mcreator.yafnafmod.block;

import net.minecraft.world.level.block.state.BlockBehaviour;
import net.minecraft.world.level.block.SoundType;
import net.minecraft.world.level.block.SlabBlock;

public class MovieOfficeTiledWallSlabBlock extends SlabBlock {
	public MovieOfficeTiledWallSlabBlock() {
		super(BlockBehaviour.Properties.of().sound(SoundType.STONE).strength(1f, 10f).dynamicShape());
	}
}
