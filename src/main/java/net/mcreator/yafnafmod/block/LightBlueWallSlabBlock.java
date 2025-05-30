
package net.mcreator.yafnafmod.block;

import net.minecraft.world.level.block.state.properties.NoteBlockInstrument;
import net.minecraft.world.level.block.state.BlockBehaviour;
import net.minecraft.world.level.block.SoundType;
import net.minecraft.world.level.block.SlabBlock;

public class LightBlueWallSlabBlock extends SlabBlock {
	public LightBlueWallSlabBlock() {
		super(BlockBehaviour.Properties.of().instrument(NoteBlockInstrument.BASEDRUM).sound(SoundType.DEEPSLATE).strength(1f, 10f).requiresCorrectToolForDrops().dynamicShape());
	}
}
