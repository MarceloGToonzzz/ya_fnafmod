
package net.mcreator.yafnafmod.block;

import net.minecraft.world.level.block.state.BlockBehaviour;
import net.minecraft.world.level.block.SoundType;
import net.minecraft.world.level.block.IronBarsBlock;

public class CurtainLimeThinBlock extends IronBarsBlock {
	public CurtainLimeThinBlock() {
		super(BlockBehaviour.Properties.of().ignitedByLava().sound(SoundType.WOOL).strength(1f, 10f));
	}
}
