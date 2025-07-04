
package net.mcreator.yafnafmod.block;

import net.minecraft.world.level.block.state.properties.WoodType;
import net.minecraft.world.level.block.state.BlockBehaviour;
import net.minecraft.world.level.block.SoundType;
import net.minecraft.world.level.block.FenceGateBlock;

public class StagePlankOrangeFenceGateBlock extends FenceGateBlock {
	public StagePlankOrangeFenceGateBlock() {
		super(BlockBehaviour.Properties.of().sound(SoundType.WOOD).strength(1f, 10f).dynamicShape().forceSolidOn(), WoodType.OAK);
	}
}
