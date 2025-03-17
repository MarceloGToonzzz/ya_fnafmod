package net.mcreator.yafnafmod.procedures;

import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.entity.Entity;

import net.mcreator.yafnafmod.entity.Minireena2Entity;
import net.mcreator.yafnafmod.entity.Minireena2DayEntity;

public class GiveNbtsProcedure {
	public static void execute(Entity entity, Entity new_guy, double yaww) {
		if (entity == null || new_guy == null)
			return;
		double yaw = 0;
		{
			Entity _ent = new_guy;
			_ent.setYRot((float) yaww);
			_ent.setXRot(0);
			_ent.setYBodyRot(_ent.getYRot());
			_ent.setYHeadRot(_ent.getYRot());
			_ent.yRotO = _ent.getYRot();
			_ent.xRotO = _ent.getXRot();
			if (_ent instanceof LivingEntity _entity) {
				_entity.yBodyRotO = _entity.getYRot();
				_entity.yHeadRotO = _entity.getYRot();
			}
		}
		new_guy.getPersistentData().putBoolean("GotCordinates", true);
		new_guy.getPersistentData().putDouble("x", (entity.getX()));
		new_guy.getPersistentData().putDouble("y", (entity.getY()));
		new_guy.getPersistentData().putDouble("z", (entity.getZ()));
		while (!(new_guy.getPersistentData().getDouble("yaw") == yaww)) {
			new_guy.getPersistentData().putDouble("yaw", yaww);
		}
		while (!(new_guy.getYRot() == yaww)) {
			{
				Entity _ent = new_guy;
				_ent.setYRot((float) yaww);
				_ent.setXRot(0);
				_ent.setYBodyRot(_ent.getYRot());
				_ent.setYHeadRot(_ent.getYRot());
				_ent.yRotO = _ent.getYRot();
				_ent.xRotO = _ent.getXRot();
				if (_ent instanceof LivingEntity _entity) {
					_entity.yBodyRotO = _entity.getYRot();
					_entity.yHeadRotO = _entity.getYRot();
				}
			}
		}
		new_guy.getPersistentData().putBoolean("controlshock_linked", (entity.getPersistentData().getBoolean("controlshock_linked")));
		new_guy.getPersistentData().putDouble("controlshock_x", (entity.getPersistentData().getDouble("controlshock_x")));
		new_guy.getPersistentData().putDouble("controlshock_y", (entity.getPersistentData().getDouble("controlshock_y")));
		new_guy.getPersistentData().putDouble("controlshock_z", (entity.getPersistentData().getDouble("controlshock_z")));
		while (!(new_guy.getPersistentData().getString("style")).equals(entity.getPersistentData().getString("style"))) {
			new_guy.getPersistentData().putString("style", (entity.getPersistentData().getString("style")));
		}
		while (!(new_guy.getPersistentData().getString("skin")).equals(entity.getPersistentData().getString("skin"))) {
			new_guy.getPersistentData().putString("skin", (entity.getPersistentData().getString("skin")));
		}
		{
			Entity _ent = new_guy;
			_ent.setYRot((float) yaww);
			_ent.setXRot(0);
			_ent.setYBodyRot(_ent.getYRot());
			_ent.setYHeadRot(_ent.getYRot());
			_ent.yRotO = _ent.getYRot();
			_ent.xRotO = _ent.getXRot();
			if (_ent instanceof LivingEntity _entity) {
				_entity.yBodyRotO = _entity.getYRot();
				_entity.yHeadRotO = _entity.getYRot();
			}
		}
		if (entity instanceof Minireena2Entity) {
			if (new_guy instanceof Minireena2DayEntity _datEntSetL)
				_datEntSetL.getEntityData().set(Minireena2DayEntity.DATA_has_player, (entity instanceof Minireena2Entity _datEntL30 && _datEntL30.getEntityData().get(Minireena2Entity.DATA_has_player)));
			if (new_guy instanceof Minireena2DayEntity _datEntSetS)
				_datEntSetS.getEntityData().set(Minireena2DayEntity.DATA_desired_player, (entity instanceof Minireena2Entity _datEntS ? _datEntS.getEntityData().get(Minireena2Entity.DATA_desired_player) : ""));
		} else if (entity instanceof Minireena2DayEntity) {
			if (new_guy instanceof Minireena2Entity _datEntSetL)
				_datEntSetL.getEntityData().set(Minireena2Entity.DATA_has_player, (entity instanceof Minireena2DayEntity _datEntL35 && _datEntL35.getEntityData().get(Minireena2DayEntity.DATA_has_player)));
			if (new_guy instanceof Minireena2Entity _datEntSetS)
				_datEntSetS.getEntityData().set(Minireena2Entity.DATA_desired_player, (entity instanceof Minireena2DayEntity _datEntS ? _datEntS.getEntityData().get(Minireena2DayEntity.DATA_desired_player) : ""));
		}
	}
}
