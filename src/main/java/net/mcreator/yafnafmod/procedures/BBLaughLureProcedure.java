package net.mcreator.yafnafmod.procedures;

import net.minecraftforge.registries.ForgeRegistries;

import net.minecraft.world.level.LevelAccessor;
import net.minecraft.world.level.Level;
import net.minecraft.world.entity.Entity;
import net.minecraft.sounds.SoundSource;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.core.BlockPos;

import net.mcreator.yafnafmod.entity.JJEntity;
import net.mcreator.yafnafmod.entity.BalloonBoyEntity;
import net.mcreator.yafnafmod.YaFnafmodMod;

public class BBLaughLureProcedure {
	public static void execute(LevelAccessor world, double x, double y, double z, Entity entity) {
		if (entity == null)
			return;
		if ((entity instanceof BalloonBoyEntity _datEntL0 && _datEntL0.getEntityData().get(BalloonBoyEntity.DATA_can_laugh)) == true || (entity instanceof JJEntity _datEntL1 && _datEntL1.getEntityData().get(JJEntity.DATA_can_laugh)) == true) {
			if (entity instanceof BalloonBoyEntity _datEntSetL)
				_datEntSetL.getEntityData().set(BalloonBoyEntity.DATA_laughing, true);
			if (entity instanceof JJEntity _datEntSetL)
				_datEntSetL.getEntityData().set(JJEntity.DATA_laughing, true);
			if (entity instanceof BalloonBoyEntity _datEntSetL)
				_datEntSetL.getEntityData().set(BalloonBoyEntity.DATA_can_laugh, false);
			if (entity instanceof JJEntity _datEntSetL)
				_datEntSetL.getEntityData().set(JJEntity.DATA_can_laugh, false);
			if (world instanceof Level)
				((Level) world).playSound(null, BlockPos.containing(x, y, z), ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("ya_fnafmod:anima_bb_laugh")), SoundSource.HOSTILE, 2, 1);
			YaFnafmodMod.queueServerWork(30, () -> {
				if (entity instanceof BalloonBoyEntity _datEntSetL)
					_datEntSetL.getEntityData().set(BalloonBoyEntity.DATA_can_laugh, true);
				if (entity instanceof JJEntity _datEntSetL)
					_datEntSetL.getEntityData().set(JJEntity.DATA_can_laugh, true);
			});
		}
	}
}
