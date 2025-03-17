
package net.mcreator.yafnafmod.block;

import net.minecraft.world.level.block.state.BlockBehaviour;
import net.minecraft.world.level.block.WallBlock;
import net.minecraft.world.level.block.SoundType;

public class FancyBrickWallBlock extends WallBlock {
	public FancyBrickWallBlock() {
		super(BlockBehaviour.Properties.of().sound(SoundType.DEEPSLATE_BRICKS).strength(1f, 10f).dynamicShape().forceSolidOn());
	}
}
