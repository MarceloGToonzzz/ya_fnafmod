package net.mcreator.yafnafmod.procedures;

import net.minecraftforge.registries.ForgeRegistries;

import net.minecraft.world.entity.Entity;

public class GetSkinAmmountProcedure {
	public static double execute(Entity entity) {
		if (entity == null)
			return 0;
		double res = 0;
		String baseAnimatronic = "";
		res = 0;
		baseAnimatronic = ((ForgeRegistries.ENTITY_TYPES.getKey(entity.getType()).toString()).replace("_day", "")).replace("ya_fnafmod:", "");
		if ((baseAnimatronic).equals("freddy_fazbear")) {
			res = 2;
		} else if ((baseAnimatronic).equals("bonnie_bunny")) {
			res = 1;
		} else if ((baseAnimatronic).equals("chica_chicken")) {
			res = 1;
		} else if ((baseAnimatronic).equals("cupcake_entity")) {
			res = 0;
		} else if ((baseAnimatronic).equals("foxy_pirate")) {
			res = 2;
		} else if ((baseAnimatronic).equals("golden_freddy")) {
			res = 1;
		} else if ((baseAnimatronic).equals("sparky_dog")) {
			res = 2;
		}
		if ((baseAnimatronic).equals("toy_freddy")) {
			res = 1;
		} else if ((baseAnimatronic).equals("toy_bonnie")) {
			res = 1;
		} else if ((baseAnimatronic).equals("toy_chica")) {
			res = 1;
		} else if ((baseAnimatronic).equals("toy_cupcake")) {
			res = 1;
		} else if ((baseAnimatronic).equals("mangle")) {
			res = 1;
		} else if ((baseAnimatronic).equals("toy_foxy")) {
			res = 1;
		} else if ((baseAnimatronic).equals("balloon_boy")) {
			res = 2;
		} else if ((baseAnimatronic).equals("jj")) {
			res = 0;
		}
		if ((baseAnimatronic).equals("withered_freddy")) {
			res = 1;
		} else if ((baseAnimatronic).equals("withered_bonnie")) {
			res = 1;
		} else if ((baseAnimatronic).equals("withered_chica")) {
			res = 1;
		} else if ((baseAnimatronic).equals("withered_foxy")) {
			res = 1;
		} else if ((baseAnimatronic).equals("withered_golden_freddy")) {
			res = 0;
		} else if ((baseAnimatronic).equals("puppet")) {
			res = 1;
		}
		if ((baseAnimatronic).equals("retro_freddy")) {
			res = 3;
		} else if ((baseAnimatronic).equals("retro_bonnie")) {
			res = 1;
		} else if ((baseAnimatronic).equals("retro_chica")) {
			res = 1;
		} else if ((baseAnimatronic).equals("retro_cupcake")) {
			res = 1;
		} else if ((baseAnimatronic).equals("retro_foxy")) {
			res = 1;
		}
		if ((baseAnimatronic).equals("shadow_freddy")) {
			res = 2;
		} else if ((baseAnimatronic).equals("shadow_bonnie")) {
			res = 1;
		}
		if ((baseAnimatronic).equals("springtrap")) {
			res = 2;
		} else if ((baseAnimatronic).equals("phantom_freddy")) {
			res = 0;
		} else if ((baseAnimatronic).equals("phantom_chica")) {
			res = 0;
		} else if ((baseAnimatronic).equals("phantom_foxy")) {
			res = 0;
		} else if ((baseAnimatronic).equals("phantom_bb")) {
			res = 0;
		} else if ((baseAnimatronic).equals("phantom_puppet")) {
			res = 0;
		} else if ((baseAnimatronic).equals("phantom_mangle")) {
			res = 1;
		} else if ((baseAnimatronic).equals("fredbear")) {
			res = 2;
		} else if ((baseAnimatronic).equals("springbonnie")) {
			res = 3;
		}
		if ((baseAnimatronic).equals("springbonnie_suit")) {
			res = 2;
		} else if ((baseAnimatronic).equals("shadow_freddy_suit")) {
			res = 1;
		} else if ((baseAnimatronic).equals("fredbear_suit")) {
			res = 1;
		} else if ((baseAnimatronic).equals("fredbear_suit_headless")) {
			res = 1;
		}
		if ((baseAnimatronic).equals("nightmare_freddy")) {
			res = 2;
		} else if ((baseAnimatronic).equals("nightmare_bonnie")) {
			res = 0;
		} else if ((baseAnimatronic).equals("nightmare_chica")) {
			res = 0;
		} else if ((baseAnimatronic).equals("nightmare_foxy")) {
			res = 0;
		} else if ((baseAnimatronic).equals("nightmare_fredbear")) {
			res = 2;
		} else if ((baseAnimatronic).equals("nightmare")) {
			res = 1;
		} else if ((baseAnimatronic).equals("nightmare_bb")) {
			res = 0;
		} else if ((baseAnimatronic).equals("nightmare_mangle")) {
			res = 0;
		} else if ((baseAnimatronic).equals("nightmare_puppet")) {
			res = 0;
		}
		if ((baseAnimatronic).equals("funtime_freddy")) {
			res = 2;
		} else if ((baseAnimatronic).equals("funtime_foxy")) {
			res = 1;
		}
		if ((baseAnimatronic).equals("lefty")) {
			res = 1;
		}
		if ((baseAnimatronic).equals("yellow_rabbit")) {
			res = 2;
		}
		if ((baseAnimatronic).equals("yellow_rabbit")) {
			res = 2;
		}
		if ((baseAnimatronic).equals("candy_the_cat")) {
			res = 1;
		}
		if (res == 0) {
			entity.getPersistentData().putDouble("skin", 0);
		}
		return res;
	}
}
