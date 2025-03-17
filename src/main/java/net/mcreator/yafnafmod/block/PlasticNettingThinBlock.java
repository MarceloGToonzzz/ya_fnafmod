
package net.mcreator.yafnafmod.block;

import net.minecraft.world.level.block.state.BlockBehaviour;
import net.minecraft.world.level.block.SoundType;
import net.minecraft.world.level.block.IronBarsBlock;

public class PlasticNettingThinBlock extends IronBarsBlock {
	public PlasticNettingThinBlock() {
		super(BlockBehaviour.Properties.of().sound(SoundType.BONE_BLOCK).strength(1f, 10f).noOcclusion().isRedstoneConductor((bs, br, bp) -> false));
	}
}
