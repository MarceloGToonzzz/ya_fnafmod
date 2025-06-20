package net.mcreator.yafnafmod.procedures;

import net.minecraftforge.registries.ForgeRegistries;

import net.minecraft.world.phys.Vec3;
import net.minecraft.world.phys.AABB;
import net.minecraft.world.level.block.state.properties.BooleanProperty;
import net.minecraft.world.level.block.state.BlockState;
import net.minecraft.world.level.LevelAccessor;
import net.minecraft.world.level.Level;
import net.minecraft.world.entity.Mob;
import net.minecraft.world.entity.Entity;
import net.minecraft.util.RandomSource;
import net.minecraft.util.Mth;
import net.minecraft.tags.TagKey;
import net.minecraft.sounds.SoundSource;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.core.registries.Registries;
import net.minecraft.core.BlockPos;

import net.mcreator.yafnafmod.entity.PhantomBalloonBoyEntity;
import net.mcreator.yafnafmod.configuration.YafnafmodConfigConfiguration;

import java.util.List;
import java.util.Comparator;

public class AudioLureRedstoneOnProcedure {
	public static void execute(LevelAccessor world, double x, double y, double z, BlockState blockstate) {
		double chance = 0;
		double sadsfdf = 0;
		if ((blockstate.getBlock().getStateDefinition().getProperty("enabled") instanceof BooleanProperty _getbp1 && blockstate.getValue(_getbp1)) == true) {
			if (world instanceof Level)
				((Level) world).playSound(null, BlockPos.containing(x, y, z), ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("ya_fnafmod:anima_bb_laugh")), SoundSource.NEUTRAL, 2, 1);
			{
				final Vec3 _center = new Vec3(x, y, z);
				List<Entity> _entfound = world.getEntitiesOfClass(Entity.class, new AABB(_center, _center).inflate(28 / 2d), e -> true).stream().sorted(Comparator.comparingDouble(_entcnd -> _entcnd.distanceToSqr(_center))).toList();
				for (Entity entityiterator : _entfound) {
					if (entityiterator.getType().is(TagKey.create(Registries.ENTITY_TYPE, new ResourceLocation("ya_fnafmod:audio_lovers")))) {
						if (entityiterator instanceof Mob _entity)
							_entity.getNavigation().moveTo(x, y, z, 1.25);
					} else if (entityiterator instanceof PhantomBalloonBoyEntity) {
						chance = Mth.nextInt(RandomSource.create(), 1, 2);
						if (chance == 2) {
							if (entityiterator instanceof Mob _entity)
								_entity.getNavigation().moveTo(x, y, z, 1.5);
						}
					}
				}
			}
			sadsfdf = Mth.nextInt(RandomSource.create(), 1, (int) (double) YafnafmodConfigConfiguration.AUDIOLURE_BREAKCHANCE.get());
			if (sadsfdf == 1) {
				{
					BlockPos _pos = BlockPos.containing(x, y, z);
					BlockState _bs = world.getBlockState(_pos);
					if (_bs.getBlock().getStateDefinition().getProperty("enabled") instanceof BooleanProperty _booleanProp)
						world.setBlock(_pos, _bs.setValue(_booleanProp, false), 3);
				}
			}
		} else {
			if (world instanceof Level)
				((Level) world).playSound(null, BlockPos.containing(x, y, z), ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("ya_fnafmod:device_error")), SoundSource.NEUTRAL, 2, 1);
		}
	}
}
