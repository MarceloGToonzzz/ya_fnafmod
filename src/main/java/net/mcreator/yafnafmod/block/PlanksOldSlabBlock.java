
package net.mcreator.yafnafmod.block;

import net.minecraft.world.level.block.state.BlockBehaviour;
import net.minecraft.world.level.block.SoundType;
import net.minecraft.world.level.block.SlabBlock;

public class PlanksOldSlabBlock extends SlabBlock {
	public PlanksOldSlabBlock() {
		super(BlockBehaviour.Properties.of().sound(SoundType.WOOD).strength(2f, 3f).dynamicShape());
	}
}
