package net.mcreator.yafnafmod.procedures;

import net.minecraft.world.phys.Vec3;
import net.minecraft.world.phys.AABB;
import net.minecraft.world.level.levelgen.structure.templatesystem.StructureTemplate;
import net.minecraft.world.level.levelgen.structure.templatesystem.StructurePlaceSettings;
import net.minecraft.world.level.block.Rotation;
import net.minecraft.world.level.block.Mirror;
import net.minecraft.world.level.LevelAccessor;
import net.minecraft.world.entity.Entity;
import net.minecraft.server.level.ServerLevel;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.network.chat.Component;
import net.minecraft.core.BlockPos;

import net.mcreator.yafnafmod.init.YaFnafmodModBlocks;

import java.util.List;
import java.util.Comparator;

public class StructureBlockPlaceProcedure {
	public static void execute(LevelAccessor world, double x, double y, double z) {
		double repeat_x = 0;
		double repeat_z = 0;
		if ((world.getBlockState(BlockPos.containing(x, y, z))).getBlock() == YaFnafmodModBlocks.STRUCTURE_BLOCK_FNAF_1_CLASSIC.get()) {
			if (world instanceof ServerLevel _serverworld) {
				StructureTemplate template = _serverworld.getStructureManager().getOrCreate(new ResourceLocation("ya_fnafmod", "fnaf1_freddyfazbearspizzaplace"));
				if (template != null) {
					template.placeInWorld(_serverworld, BlockPos.containing(x, y, z), BlockPos.containing(x, y, z), new StructurePlaceSettings().setRotation(Rotation.NONE).setMirror(Mirror.NONE).setIgnoreEntities(false), _serverworld.random, 3);
				}
			}
		} else if ((world.getBlockState(BlockPos.containing(x, y, z))).getBlock() == YaFnafmodModBlocks.STRUCTURE_FNAF_2_CLASSIC.get()) {
			if (world instanceof ServerLevel _serverworld) {
				StructureTemplate template = _serverworld.getStructureManager().getOrCreate(new ResourceLocation("ya_fnafmod", "fnaf2_freddyspizzeriaandtheater"));
				if (template != null) {
					template.placeInWorld(_serverworld, BlockPos.containing(x, y, z), BlockPos.containing(x, y, z), new StructurePlaceSettings().setRotation(Rotation.NONE).setMirror(Mirror.NONE).setIgnoreEntities(false), _serverworld.random, 3);
				}
			}
		} else if ((world.getBlockState(BlockPos.containing(x, y, z))).getBlock() == YaFnafmodModBlocks.STRUCTURE_FNAF_3_CLASSIC.get()) {
			if (world instanceof ServerLevel _serverworld) {
				StructureTemplate template = _serverworld.getStructureManager().getOrCreate(new ResourceLocation("ya_fnafmod", "fnaf3_fazbearsfright"));
				if (template != null) {
					template.placeInWorld(_serverworld, BlockPos.containing(x, y, z), BlockPos.containing(x, y, z), new StructurePlaceSettings().setRotation(Rotation.NONE).setMirror(Mirror.NONE).setIgnoreEntities(false), _serverworld.random, 3);
				}
			}
		}
		if ((world.getBlockState(BlockPos.containing(x, y, z))).getBlock() == YaFnafmodModBlocks.STRUCTURE_BLOCK_FNAF_1.get()) {
			if (world instanceof ServerLevel _serverworld) {
				StructureTemplate template = _serverworld.getStructureManager().getOrCreate(new ResourceLocation("ya_fnafmod", "fnaf1_freddyfazbearspizzaplace_big1"));
				if (template != null) {
					template.placeInWorld(_serverworld, BlockPos.containing(x, y, z), BlockPos.containing(x, y, z), new StructurePlaceSettings().setRotation(Rotation.NONE).setMirror(Mirror.NONE).setIgnoreEntities(false), _serverworld.random, 3);
				}
			}
			if (world instanceof ServerLevel _serverworld) {
				StructureTemplate template = _serverworld.getStructureManager().getOrCreate(new ResourceLocation("ya_fnafmod", "fnaf1_freddyfazbearspizzaplace_big2"));
				if (template != null) {
					template.placeInWorld(_serverworld, BlockPos.containing(x + 48, y, z), BlockPos.containing(x + 48, y, z), new StructurePlaceSettings().setRotation(Rotation.NONE).setMirror(Mirror.NONE).setIgnoreEntities(false),
							_serverworld.random, 3);
				}
			}
			if (world instanceof ServerLevel _serverworld) {
				StructureTemplate template = _serverworld.getStructureManager().getOrCreate(new ResourceLocation("ya_fnafmod", "fnaf1_freddyfazbearspizzaplace_big3"));
				if (template != null) {
					template.placeInWorld(_serverworld, BlockPos.containing(x, y, z + 48), BlockPos.containing(x, y, z + 48), new StructurePlaceSettings().setRotation(Rotation.NONE).setMirror(Mirror.NONE).setIgnoreEntities(false),
							_serverworld.random, 3);
				}
			}
			if (world instanceof ServerLevel _serverworld) {
				StructureTemplate template = _serverworld.getStructureManager().getOrCreate(new ResourceLocation("ya_fnafmod", "fnaf1_freddyfazbearspizzaplace_big4"));
				if (template != null) {
					template.placeInWorld(_serverworld, BlockPos.containing(x + 48, y, z + 48), BlockPos.containing(x + 48, y, z + 48), new StructurePlaceSettings().setRotation(Rotation.NONE).setMirror(Mirror.NONE).setIgnoreEntities(false),
							_serverworld.random, 3);
				}
			}
			LinkDoorToGeneratorProcedure.execute(world, x + 44, y + 7, z + 67, x + 35, y + 6, z + 28);
			LinkDoorToGeneratorProcedure.execute(world, x + 48, y + 7, z + 67, x + 35, y + 6, z + 28);
		} else if ((world.getBlockState(BlockPos.containing(x, y, z))).getBlock() == YaFnafmodModBlocks.STRUCTURE_BLOCK_FNAF_2.get()) {
			if (world instanceof ServerLevel _serverworld) {
				StructureTemplate template = _serverworld.getStructureManager().getOrCreate(new ResourceLocation("ya_fnafmod", "fnaf2_freddyfazbearspizzeria_big1"));
				if (template != null) {
					template.placeInWorld(_serverworld, BlockPos.containing(x, y, z), BlockPos.containing(x, y, z), new StructurePlaceSettings().setRotation(Rotation.NONE).setMirror(Mirror.NONE).setIgnoreEntities(false), _serverworld.random, 3);
				}
			}
			if (world instanceof ServerLevel _serverworld) {
				StructureTemplate template = _serverworld.getStructureManager().getOrCreate(new ResourceLocation("ya_fnafmod", "fnaf2_freddyfazbearspizzeria_big2"));
				if (template != null) {
					template.placeInWorld(_serverworld, BlockPos.containing(x + 48, y, z), BlockPos.containing(x + 48, y, z), new StructurePlaceSettings().setRotation(Rotation.NONE).setMirror(Mirror.NONE).setIgnoreEntities(false),
							_serverworld.random, 3);
				}
			}
			if (world instanceof ServerLevel _serverworld) {
				StructureTemplate template = _serverworld.getStructureManager().getOrCreate(new ResourceLocation("ya_fnafmod", "fnaf2_freddyfazbearspizzeria_big3"));
				if (template != null) {
					template.placeInWorld(_serverworld, BlockPos.containing(x, y, z + 48), BlockPos.containing(x, y, z + 48), new StructurePlaceSettings().setRotation(Rotation.NONE).setMirror(Mirror.NONE).setIgnoreEntities(false),
							_serverworld.random, 3);
				}
			}
			if (world instanceof ServerLevel _serverworld) {
				StructureTemplate template = _serverworld.getStructureManager().getOrCreate(new ResourceLocation("ya_fnafmod", "fnaf2_freddyfazbearspizzeria_big4"));
				if (template != null) {
					template.placeInWorld(_serverworld, BlockPos.containing(x + 48, y, z + 48), BlockPos.containing(x + 48, y, z + 48), new StructurePlaceSettings().setRotation(Rotation.NONE).setMirror(Mirror.NONE).setIgnoreEntities(false),
							_serverworld.random, 3);
				}
			}
		} else if ((world.getBlockState(BlockPos.containing(x, y, z))).getBlock() == YaFnafmodModBlocks.STRUCTURE_BLOCK_FNAF_3.get()) {
			if (world instanceof ServerLevel _serverworld) {
				StructureTemplate template = _serverworld.getStructureManager().getOrCreate(new ResourceLocation("ya_fnafmod", "fnaf3_fazbearfright_big1"));
				if (template != null) {
					template.placeInWorld(_serverworld, BlockPos.containing(x, y, z), BlockPos.containing(x, y, z), new StructurePlaceSettings().setRotation(Rotation.NONE).setMirror(Mirror.NONE).setIgnoreEntities(false), _serverworld.random, 3);
				}
			}
			if (world instanceof ServerLevel _serverworld) {
				StructureTemplate template = _serverworld.getStructureManager().getOrCreate(new ResourceLocation("ya_fnafmod", "fnaf3_fazbearfright_big2"));
				if (template != null) {
					template.placeInWorld(_serverworld, BlockPos.containing(x + 48, y, z), BlockPos.containing(x + 48, y, z), new StructurePlaceSettings().setRotation(Rotation.NONE).setMirror(Mirror.NONE).setIgnoreEntities(false),
							_serverworld.random, 3);
				}
			}
			if (world instanceof ServerLevel _serverworld) {
				StructureTemplate template = _serverworld.getStructureManager().getOrCreate(new ResourceLocation("ya_fnafmod", "fnaf3_fazbearfright_big3"));
				if (template != null) {
					template.placeInWorld(_serverworld, BlockPos.containing(x, y, z + 48), BlockPos.containing(x, y, z + 48), new StructurePlaceSettings().setRotation(Rotation.NONE).setMirror(Mirror.NONE).setIgnoreEntities(false),
							_serverworld.random, 3);
				}
			}
			if (world instanceof ServerLevel _serverworld) {
				StructureTemplate template = _serverworld.getStructureManager().getOrCreate(new ResourceLocation("ya_fnafmod", "fnaf3_fazbearfright_big4"));
				if (template != null) {
					template.placeInWorld(_serverworld, BlockPos.containing(x + 48, y, z + 48), BlockPos.containing(x + 48, y, z + 48), new StructurePlaceSettings().setRotation(Rotation.NONE).setMirror(Mirror.NONE).setIgnoreEntities(false),
							_serverworld.random, 3);
				}
			}
		} else if ((world.getBlockState(BlockPos.containing(x, y, z))).getBlock() == YaFnafmodModBlocks.STRUCTURE_BLOCK_FNAF_4.get()) {
			if (world instanceof ServerLevel _serverworld) {
				StructureTemplate template = _serverworld.getStructureManager().getOrCreate(new ResourceLocation("ya_fnafmod", "fnaf4sl_aftonrobotics1"));
				if (template != null) {
					template.placeInWorld(_serverworld, BlockPos.containing(x, y, z), BlockPos.containing(x, y, z), new StructurePlaceSettings().setRotation(Rotation.NONE).setMirror(Mirror.NONE).setIgnoreEntities(false), _serverworld.random, 3);
				}
			}
			if (world instanceof ServerLevel _serverworld) {
				StructureTemplate template = _serverworld.getStructureManager().getOrCreate(new ResourceLocation("ya_fnafmod", "fnaf4sl_aftonrobotics2"));
				if (template != null) {
					template.placeInWorld(_serverworld, BlockPos.containing(x + 48, y, z), BlockPos.containing(x + 48, y, z), new StructurePlaceSettings().setRotation(Rotation.NONE).setMirror(Mirror.NONE).setIgnoreEntities(false),
							_serverworld.random, 3);
				}
			}
			if (world instanceof ServerLevel _serverworld) {
				StructureTemplate template = _serverworld.getStructureManager().getOrCreate(new ResourceLocation("ya_fnafmod", "fnaf4sl_aftonrobotics3"));
				if (template != null) {
					template.placeInWorld(_serverworld, BlockPos.containing(x, y, z + 48), BlockPos.containing(x, y, z + 48), new StructurePlaceSettings().setRotation(Rotation.NONE).setMirror(Mirror.NONE).setIgnoreEntities(false),
							_serverworld.random, 3);
				}
			}
			if (world instanceof ServerLevel _serverworld) {
				StructureTemplate template = _serverworld.getStructureManager().getOrCreate(new ResourceLocation("ya_fnafmod", "fnaf4sl_aftonrobotics4"));
				if (template != null) {
					template.placeInWorld(_serverworld, BlockPos.containing(x + 48, y, z + 48), BlockPos.containing(x + 48, y, z + 48), new StructurePlaceSettings().setRotation(Rotation.NONE).setMirror(Mirror.NONE).setIgnoreEntities(false),
							_serverworld.random, 3);
				}
			}
			LinkDoorToGeneratorProcedure.execute(world, x + 26, y + 3, z + 48, x + 31, y + 2, z + 62);
			LinkDoorToGeneratorProcedure.execute(world, x + 22, y + 3, z + 48, x + 31, y + 2, z + 62);
			LinkDoorToGeneratorProcedure.execute(world, x + 24, y + 4, z + 51, x + 31, y + 2, z + 62);
			{
				final Vec3 _center = new Vec3((x + 65), (y + 3), (z + 40));
				List<Entity> _entfound = world.getEntitiesOfClass(Entity.class, new AABB(_center, _center).inflate(4 / 2d), e -> true).stream().sorted(Comparator.comparingDouble(_entcnd -> _entcnd.distanceToSqr(_center))).toList();
				for (Entity entityiterator : _entfound) {
					LinkAnimatronicToShockInfuserProcedure.execute(entityiterator, x + 65, y + 2, z + 40);
				}
			}
			{
				final Vec3 _center = new Vec3((x + 32), (y + 3), (z + 40));
				List<Entity> _entfound = world.getEntitiesOfClass(Entity.class, new AABB(_center, _center).inflate(4 / 2d), e -> true).stream().sorted(Comparator.comparingDouble(_entcnd -> _entcnd.distanceToSqr(_center))).toList();
				for (Entity entityiterator : _entfound) {
					LinkAnimatronicToShockInfuserProcedure.execute(entityiterator, x + 32, y + 2, z + 40);
				}
			}
			{
				final Vec3 _center = new Vec3((x + 49), (y + 3), (z + 74));
				List<Entity> _entfound = world.getEntitiesOfClass(Entity.class, new AABB(_center, _center).inflate(8 / 2d), e -> true).stream().sorted(Comparator.comparingDouble(_entcnd -> _entcnd.distanceToSqr(_center))).toList();
				for (Entity entityiterator : _entfound) {
					LinkAnimatronicToShockInfuserProcedure.execute(entityiterator, x + 49, y + 2, z + 77);
				}
			}
			LinkControlPanelProcedure.execute(world, x + 47, y + 2, z + 64, x + 49, y + 2, z + 77);
			LinkControlPanelProcedure.execute(world, x + 50, y + 2, z + 37, x + 65, y + 2, z + 40);
			LinkControlPanelProcedure.execute(world, x + 50, y + 2, z + 37, x + 65, y + 2, z + 41);
			LinkControlPanelProcedure.execute(world, x + 46, y + 2, z + 37, x + 32, y + 2, z + 40);
			LinkControlPanelProcedure.execute(world, x + 46, y + 2, z + 37, x + 30, y + 2, z + 40);
			LinkControlPanelProcedure.execute(world, x + 46, y + 2, z + 37, x + 31, y + 2, z + 41);
		} else if ((world.getBlockState(BlockPos.containing(x, y, z))).getBlock() == YaFnafmodModBlocks.STRUCTURE_BLOCK_FNAF_6.get()) {
			if (world instanceof ServerLevel _serverworld) {
				StructureTemplate template = _serverworld.getStructureManager().getOrCreate(new ResourceLocation("ya_fnafmod", "fnaf6_freddyfazbearspizzaplace1"));
				if (template != null) {
					template.placeInWorld(_serverworld, BlockPos.containing(x, y, z), BlockPos.containing(x, y, z), new StructurePlaceSettings().setRotation(Rotation.NONE).setMirror(Mirror.NONE).setIgnoreEntities(false), _serverworld.random, 3);
				}
			}
			if (world instanceof ServerLevel _serverworld) {
				StructureTemplate template = _serverworld.getStructureManager().getOrCreate(new ResourceLocation("ya_fnafmod", "fnaf6_freddyfazbearspizzaplace2"));
				if (template != null) {
					template.placeInWorld(_serverworld, BlockPos.containing(x + 48, y, z), BlockPos.containing(x + 48, y, z), new StructurePlaceSettings().setRotation(Rotation.NONE).setMirror(Mirror.NONE).setIgnoreEntities(false),
							_serverworld.random, 3);
				}
			}
			if (world instanceof ServerLevel _serverworld) {
				StructureTemplate template = _serverworld.getStructureManager().getOrCreate(new ResourceLocation("ya_fnafmod", "fnaf6_freddyfazbearspizzaplace3"));
				if (template != null) {
					template.placeInWorld(_serverworld, BlockPos.containing(x, y, z + 48), BlockPos.containing(x, y, z + 48), new StructurePlaceSettings().setRotation(Rotation.NONE).setMirror(Mirror.NONE).setIgnoreEntities(false),
							_serverworld.random, 3);
				}
			}
			if (world instanceof ServerLevel _serverworld) {
				StructureTemplate template = _serverworld.getStructureManager().getOrCreate(new ResourceLocation("ya_fnafmod", "fnaf6_freddyfazbearspizzaplace4"));
				if (template != null) {
					template.placeInWorld(_serverworld, BlockPos.containing(x + 48, y, z + 48), BlockPos.containing(x + 48, y, z + 48), new StructurePlaceSettings().setRotation(Rotation.NONE).setMirror(Mirror.NONE).setIgnoreEntities(false),
							_serverworld.random, 3);
				}
			}
			LinkDoorToGeneratorProcedure.execute(world, x + 55, y + 3, z + 54, x + 53, y + 2, z + 45);
			LinkDoorToGeneratorProcedure.execute(world, x + 55, y + 3, z + 40, x + 53, y + 2, z + 45);
			LinkDoorToGeneratorProcedure.execute(world, x + 52, y + 4, z + 48, x + 53, y + 2, z + 45);
			repeat_x = 0;
			repeat_z = 0;
			for (int index0 = 0; index0 < 95; index0++) {
				for (int index1 = 0; index1 < 95; index1++) {
					if (!world.isClientSide() && world.getServer() != null)
						world.getServer().getPlayerList().broadcastSystemMessage(Component.literal((((x + repeat_x) + " ") + "" + ((y + 4) + " ") + (z + repeat_z))), false);
					LinkAudioLureToMonitorProcedure.execute(world, x + repeat_x, y + 4, z + repeat_z, x + 67, y + 3, z + 47);
					repeat_z = repeat_z + 1;
				}
				repeat_z = 0;
				repeat_x = repeat_x + 1;
			}
		}
	}
}
