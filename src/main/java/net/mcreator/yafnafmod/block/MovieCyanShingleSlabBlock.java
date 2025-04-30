
package net.mcreator.yafnafmod.block;

import net.minecraft.world.level.block.state.properties.NoteBlockInstrument;
import net.minecraft.world.level.block.state.BlockBehaviour;
import net.minecraft.world.level.block.SoundType;
import net.minecraft.world.level.block.SlabBlock;

public class MovieCyanShingleSlabBlock extends SlabBlock {
	public MovieCyanShingleSlabBlock() {
		super(BlockBehaviour.Properties.of().instrument(NoteBlockInstrument.BASEDRUM).sound(SoundType.METAL).strength(1.5f, 10f).requiresCorrectToolForDrops().dynamicShape());
	}
}
