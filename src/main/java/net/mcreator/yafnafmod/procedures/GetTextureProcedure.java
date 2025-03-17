package net.mcreator.yafnafmod.procedures;

import net.minecraft.world.entity.Entity;

import net.mcreator.yafnafmod.entity.YenndoEntity;
import net.mcreator.yafnafmod.entity.WitheredGoldenFreddyEntity;
import net.mcreator.yafnafmod.entity.WitheredFreddyEntity;
import net.mcreator.yafnafmod.entity.WitheredFreddyDayEntity;
import net.mcreator.yafnafmod.entity.WitheredFoxyEntity;
import net.mcreator.yafnafmod.entity.WitheredFoxyDayEntity;
import net.mcreator.yafnafmod.entity.WitheredChicaEntity;
import net.mcreator.yafnafmod.entity.WitheredChicaDayEntity;
import net.mcreator.yafnafmod.entity.WitheredBonnieEntity;
import net.mcreator.yafnafmod.entity.WitheredBonnieDayEntity;
import net.mcreator.yafnafmod.entity.ToyFreddyStillDayEntity;
import net.mcreator.yafnafmod.entity.ToyFreddyEntity;
import net.mcreator.yafnafmod.entity.ToyFreddyDayEntity;
import net.mcreator.yafnafmod.entity.ToyFoxyStillDayEntity;
import net.mcreator.yafnafmod.entity.ToyFoxyEntity;
import net.mcreator.yafnafmod.entity.ToyFoxyDayEntity;
import net.mcreator.yafnafmod.entity.ToyChicaStillDayEntity;
import net.mcreator.yafnafmod.entity.ToyChicaEntity;
import net.mcreator.yafnafmod.entity.ToyChicaDayEntity;
import net.mcreator.yafnafmod.entity.ToyBonnieStillDayEntity;
import net.mcreator.yafnafmod.entity.ToyBonnieEntity;
import net.mcreator.yafnafmod.entity.ToyBonnieDayEntity;
import net.mcreator.yafnafmod.entity.SpringtrapEntity;
import net.mcreator.yafnafmod.entity.SpringtrapDayEntity;
import net.mcreator.yafnafmod.entity.SpringbonnieEntity;
import net.mcreator.yafnafmod.entity.SpringbonnieDayEntity;
import net.mcreator.yafnafmod.entity.ShadowFreddyEntity;
import net.mcreator.yafnafmod.entity.ShadowBonnieEntity;
import net.mcreator.yafnafmod.entity.RockstarFreddyEntity;
import net.mcreator.yafnafmod.entity.RockstarFreddyDayEntity;
import net.mcreator.yafnafmod.entity.RetroFreddyEntity;
import net.mcreator.yafnafmod.entity.RetroFreddyDayEntity;
import net.mcreator.yafnafmod.entity.RetroFoxyEntity;
import net.mcreator.yafnafmod.entity.RetroFoxyDayEntity;
import net.mcreator.yafnafmod.entity.RetroChicaEntity;
import net.mcreator.yafnafmod.entity.RetroChicaDayEntity;
import net.mcreator.yafnafmod.entity.RetroBonnieEntity;
import net.mcreator.yafnafmod.entity.RetroBonnieDayEntity;
import net.mcreator.yafnafmod.entity.PuppetEntity;
import net.mcreator.yafnafmod.entity.PuppetDayEntity;
import net.mcreator.yafnafmod.entity.PlushtrapEntity;
import net.mcreator.yafnafmod.entity.PlushtrapDayEntity;
import net.mcreator.yafnafmod.entity.PigpatchEntity;
import net.mcreator.yafnafmod.entity.PigpatchDayEntity;
import net.mcreator.yafnafmod.entity.PhantomPuppetEntity;
import net.mcreator.yafnafmod.entity.PhantomMangleEntity;
import net.mcreator.yafnafmod.entity.PhantomFreddyEntity;
import net.mcreator.yafnafmod.entity.PhantomFoxyEntity;
import net.mcreator.yafnafmod.entity.PhantomChicaEntity;
import net.mcreator.yafnafmod.entity.PhantomBalloonBoyEntity;
import net.mcreator.yafnafmod.entity.PanStanEntity;
import net.mcreator.yafnafmod.entity.PanStanDayEntity;
import net.mcreator.yafnafmod.entity.NumberOneCrateEntity;
import net.mcreator.yafnafmod.entity.NumberOneCrateDayEntity;
import net.mcreator.yafnafmod.entity.NightmarionneEntity;
import net.mcreator.yafnafmod.entity.NightmareMangleEntity;
import net.mcreator.yafnafmod.entity.NightmareFreddyEntity;
import net.mcreator.yafnafmod.entity.NightmareFredbearEntity;
import net.mcreator.yafnafmod.entity.NightmareFoxyEntity;
import net.mcreator.yafnafmod.entity.NightmareEntity;
import net.mcreator.yafnafmod.entity.NightmareChicaEntity;
import net.mcreator.yafnafmod.entity.NightmareBonnieEntity;
import net.mcreator.yafnafmod.entity.NightmareBbEntity;
import net.mcreator.yafnafmod.entity.NightmareBbDayEntity;
import net.mcreator.yafnafmod.entity.NeddbearEntity;
import net.mcreator.yafnafmod.entity.NeddBearDayEntity;
import net.mcreator.yafnafmod.entity.MrHugsEntity;
import net.mcreator.yafnafmod.entity.MrHugsDayEntity;
import net.mcreator.yafnafmod.entity.MrHippoEntity;
import net.mcreator.yafnafmod.entity.MrHippoDayEntity;
import net.mcreator.yafnafmod.entity.MrCanDoEntity;
import net.mcreator.yafnafmod.entity.MrCanDoDayEntity;
import net.mcreator.yafnafmod.entity.MinireenaEntity;
import net.mcreator.yafnafmod.entity.MinireenaDayEntity;
import net.mcreator.yafnafmod.entity.Minireena2Entity;
import net.mcreator.yafnafmod.entity.Minireena2DayEntity;
import net.mcreator.yafnafmod.entity.MangleEntity;
import net.mcreator.yafnafmod.entity.MangleDayEntity;
import net.mcreator.yafnafmod.entity.LolbitEntity;
import net.mcreator.yafnafmod.entity.JjDayEntity;
import net.mcreator.yafnafmod.entity.JackOChicaEntity;
import net.mcreator.yafnafmod.entity.JackOBonnieEntity;
import net.mcreator.yafnafmod.entity.JJEntity;
import net.mcreator.yafnafmod.entity.HappyFrogEntity;
import net.mcreator.yafnafmod.entity.HappyFrogDayEntity;
import net.mcreator.yafnafmod.entity.GoldenFreddyEntity;
import net.mcreator.yafnafmod.entity.FuntimeFreddyEntity;
import net.mcreator.yafnafmod.entity.FuntimeFreddyDayEntity;
import net.mcreator.yafnafmod.entity.FuntimeFoxyEntity;
import net.mcreator.yafnafmod.entity.FuntimeFoxyDayEntity;
import net.mcreator.yafnafmod.entity.FreddyFazbearEntity;
import net.mcreator.yafnafmod.entity.FreddyFazbearDayEntity;
import net.mcreator.yafnafmod.entity.FredbearEntity;
import net.mcreator.yafnafmod.entity.FredbearDayEntity;
import net.mcreator.yafnafmod.entity.FoxyPirateEntity;
import net.mcreator.yafnafmod.entity.FoxyPirateDayEntity;
import net.mcreator.yafnafmod.entity.Endo02Entity;
import net.mcreator.yafnafmod.entity.Endo02DayEntity;
import net.mcreator.yafnafmod.entity.Endo01Entity;
import net.mcreator.yafnafmod.entity.Endo01DayEntity;
import net.mcreator.yafnafmod.entity.ElectrobabEntity;
import net.mcreator.yafnafmod.entity.ElectrobabDayEntity;
import net.mcreator.yafnafmod.entity.CircusBabyEntity;
import net.mcreator.yafnafmod.entity.CircusBabyDayEntity;
import net.mcreator.yafnafmod.entity.ChicaChickenEntity;
import net.mcreator.yafnafmod.entity.ChicaChickenDayEntity;
import net.mcreator.yafnafmod.entity.BucketBobEntity;
import net.mcreator.yafnafmod.entity.BucketBobDayEntity;
import net.mcreator.yafnafmod.entity.BonnieBunnyEntity;
import net.mcreator.yafnafmod.entity.BonnieBunnyDayEntity;
import net.mcreator.yafnafmod.entity.BonnetEntity;
import net.mcreator.yafnafmod.entity.BonnetDayEntity;
import net.mcreator.yafnafmod.entity.BlobFuntimeFreddyEntity;
import net.mcreator.yafnafmod.entity.BlobFuntimeFoxyEntity;
import net.mcreator.yafnafmod.entity.BlobCircusBabyEntity;
import net.mcreator.yafnafmod.entity.BlobBalloraEntity;
import net.mcreator.yafnafmod.entity.BidybabEntity;
import net.mcreator.yafnafmod.entity.BidybabDayEntity;
import net.mcreator.yafnafmod.entity.BalloraEntity;
import net.mcreator.yafnafmod.entity.BalloraDayEntity;
import net.mcreator.yafnafmod.entity.BalloonBoyEntity;
import net.mcreator.yafnafmod.entity.BalloonBoyDayEntity;

public class GetTextureProcedure {
	public static String execute(Entity entity) {
		if (entity == null)
			return "";
		String thing = "";
		if (entity instanceof FreddyFazbearEntity) {
			thing = entity instanceof FreddyFazbearEntity animatable ? animatable.getTexture() : "null";
		} else if (entity instanceof FreddyFazbearDayEntity) {
			thing = entity instanceof FreddyFazbearDayEntity animatable ? animatable.getTexture() : "null";
		}
		if (entity instanceof BonnieBunnyEntity) {
			thing = entity instanceof BonnieBunnyEntity animatable ? animatable.getTexture() : "null";
		} else if (entity instanceof BonnieBunnyDayEntity) {
			thing = entity instanceof BonnieBunnyDayEntity animatable ? animatable.getTexture() : "null";
		}
		if (entity instanceof ChicaChickenEntity) {
			thing = entity instanceof ChicaChickenEntity animatable ? animatable.getTexture() : "null";
		} else if (entity instanceof ChicaChickenDayEntity) {
			thing = entity instanceof ChicaChickenDayEntity animatable ? animatable.getTexture() : "null";
		}
		if (entity instanceof FoxyPirateEntity) {
			thing = entity instanceof FoxyPirateEntity animatable ? animatable.getTexture() : "null";
		} else if (entity instanceof FoxyPirateDayEntity) {
			thing = entity instanceof FoxyPirateDayEntity animatable ? animatable.getTexture() : "null";
		}
		if (entity instanceof GoldenFreddyEntity) {
			thing = entity instanceof GoldenFreddyEntity animatable ? animatable.getTexture() : "null";
		}
		if (entity instanceof Endo01Entity) {
			thing = entity instanceof Endo01Entity animatable ? animatable.getTexture() : "null";
		} else if (entity instanceof Endo01DayEntity) {
			thing = entity instanceof Endo01DayEntity animatable ? animatable.getTexture() : "null";
		}
		if (entity instanceof ToyFreddyEntity) {
			thing = entity instanceof ToyFreddyEntity animatable ? animatable.getTexture() : "null";
		} else if (entity instanceof ToyFreddyDayEntity) {
			thing = entity instanceof ToyFreddyDayEntity animatable ? animatable.getTexture() : "null";
		} else if (entity instanceof ToyFreddyStillDayEntity) {
			thing = entity instanceof ToyFreddyStillDayEntity animatable ? animatable.getTexture() : "null";
		}
		if (entity instanceof ToyBonnieEntity) {
			thing = entity instanceof ToyBonnieEntity animatable ? animatable.getTexture() : "null";
		} else if (entity instanceof ToyBonnieDayEntity) {
			thing = entity instanceof ToyBonnieDayEntity animatable ? animatable.getTexture() : "null";
		} else if (entity instanceof ToyBonnieStillDayEntity) {
			thing = entity instanceof ToyBonnieStillDayEntity animatable ? animatable.getTexture() : "null";
		}
		if (entity instanceof ToyChicaEntity) {
			thing = entity instanceof ToyChicaEntity animatable ? animatable.getTexture() : "null";
		} else if (entity instanceof ToyChicaDayEntity) {
			thing = entity instanceof ToyChicaDayEntity animatable ? animatable.getTexture() : "null";
		} else if (entity instanceof ToyChicaStillDayEntity) {
			thing = entity instanceof ToyChicaStillDayEntity animatable ? animatable.getTexture() : "null";
		}
		if (entity instanceof ToyFoxyEntity) {
			thing = entity instanceof ToyFoxyEntity animatable ? animatable.getTexture() : "null";
		} else if (entity instanceof ToyFoxyDayEntity) {
			thing = entity instanceof ToyFoxyDayEntity animatable ? animatable.getTexture() : "null";
		} else if (entity instanceof ToyFoxyStillDayEntity) {
			thing = entity instanceof ToyFoxyStillDayEntity animatable ? animatable.getTexture() : "null";
		}
		if (entity instanceof MangleEntity) {
			thing = entity instanceof MangleEntity animatable ? animatable.getTexture() : "null";
		} else if (entity instanceof MangleDayEntity) {
			thing = entity instanceof MangleDayEntity animatable ? animatable.getTexture() : "null";
		}
		if (entity instanceof BalloonBoyEntity) {
			thing = entity instanceof BalloonBoyEntity animatable ? animatable.getTexture() : "null";
		} else if (entity instanceof BalloonBoyDayEntity) {
			thing = entity instanceof BalloonBoyDayEntity animatable ? animatable.getTexture() : "null";
		}
		if (entity instanceof JJEntity) {
			thing = entity instanceof JJEntity animatable ? animatable.getTexture() : "null";
		} else if (entity instanceof JjDayEntity) {
			thing = entity instanceof JjDayEntity animatable ? animatable.getTexture() : "null";
		}
		if (entity instanceof PuppetEntity) {
			thing = entity instanceof PuppetEntity animatable ? animatable.getTexture() : "null";
		} else if (entity instanceof PuppetDayEntity) {
			thing = entity instanceof PuppetDayEntity animatable ? animatable.getTexture() : "null";
		}
		if (entity instanceof WitheredFreddyEntity) {
			thing = entity instanceof WitheredFreddyEntity animatable ? animatable.getTexture() : "null";
		} else if (entity instanceof WitheredFreddyDayEntity) {
			thing = entity instanceof WitheredFreddyDayEntity animatable ? animatable.getTexture() : "null";
		}
		if (entity instanceof WitheredBonnieEntity) {
			thing = entity instanceof WitheredBonnieEntity animatable ? animatable.getTexture() : "null";
		} else if (entity instanceof WitheredBonnieDayEntity) {
			thing = entity instanceof WitheredBonnieDayEntity animatable ? animatable.getTexture() : "null";
		}
		if (entity instanceof WitheredChicaEntity) {
			thing = entity instanceof WitheredChicaEntity animatable ? animatable.getTexture() : "null";
		} else if (entity instanceof WitheredChicaDayEntity) {
			thing = entity instanceof WitheredChicaDayEntity animatable ? animatable.getTexture() : "null";
		}
		if (entity instanceof WitheredFoxyEntity) {
			thing = entity instanceof WitheredFoxyEntity animatable ? animatable.getTexture() : "null";
		} else if (entity instanceof WitheredFoxyDayEntity) {
			thing = entity instanceof WitheredFoxyDayEntity animatable ? animatable.getTexture() : "null";
		}
		if (entity instanceof WitheredGoldenFreddyEntity) {
			thing = entity instanceof WitheredGoldenFreddyEntity animatable ? animatable.getTexture() : "null";
		}
		if (entity instanceof Endo02Entity) {
			thing = entity instanceof Endo02Entity animatable ? animatable.getTexture() : "null";
		} else if (entity instanceof Endo02DayEntity) {
			thing = entity instanceof Endo02DayEntity animatable ? animatable.getTexture() : "null";
		}
		if (entity instanceof ShadowFreddyEntity) {
			thing = entity instanceof ShadowFreddyEntity animatable ? animatable.getTexture() : "null";
		} else if (entity instanceof ShadowBonnieEntity) {
			thing = entity instanceof ShadowBonnieEntity animatable ? animatable.getTexture() : "null";
		}
		if (entity instanceof RetroFreddyEntity) {
			thing = entity instanceof RetroFreddyEntity animatable ? animatable.getTexture() : "null";
		} else if (entity instanceof RetroFreddyDayEntity) {
			thing = entity instanceof RetroFreddyDayEntity animatable ? animatable.getTexture() : "null";
		}
		if (entity instanceof RetroBonnieEntity) {
			thing = entity instanceof RetroBonnieEntity animatable ? animatable.getTexture() : "null";
		} else if (entity instanceof RetroBonnieDayEntity) {
			thing = entity instanceof RetroBonnieDayEntity animatable ? animatable.getTexture() : "null";
		}
		if (entity instanceof RetroChicaEntity) {
			thing = entity instanceof RetroChicaEntity animatable ? animatable.getTexture() : "null";
		} else if (entity instanceof RetroChicaDayEntity) {
			thing = entity instanceof RetroChicaDayEntity animatable ? animatable.getTexture() : "null";
		}
		if (entity instanceof RetroFoxyEntity) {
			thing = entity instanceof RetroFoxyEntity animatable ? animatable.getTexture() : "null";
		} else if (entity instanceof RetroFoxyDayEntity) {
			thing = entity instanceof RetroFoxyDayEntity animatable ? animatable.getTexture() : "null";
		}
		if (entity instanceof FredbearEntity) {
			thing = entity instanceof FredbearEntity animatable ? animatable.getTexture() : "null";
		} else if (entity instanceof FredbearDayEntity) {
			thing = entity instanceof FredbearDayEntity animatable ? animatable.getTexture() : "null";
		}
		if (entity instanceof SpringbonnieEntity) {
			thing = entity instanceof SpringbonnieEntity animatable ? animatable.getTexture() : "null";
		} else if (entity instanceof SpringbonnieDayEntity) {
			thing = entity instanceof SpringbonnieDayEntity animatable ? animatable.getTexture() : "null";
		}
		if (entity instanceof SpringtrapEntity) {
			thing = entity instanceof SpringtrapEntity animatable ? animatable.getTexture() : "null";
		} else if (entity instanceof SpringtrapDayEntity) {
			thing = entity instanceof SpringtrapDayEntity animatable ? animatable.getTexture() : "null";
		}
		if (entity instanceof PhantomFreddyEntity) {
			thing = entity instanceof PhantomFreddyEntity animatable ? animatable.getTexture() : "null";
		}
		if (entity instanceof PhantomChicaEntity) {
			thing = entity instanceof PhantomChicaEntity animatable ? animatable.getTexture() : "null";
		}
		if (entity instanceof PhantomFoxyEntity) {
			thing = entity instanceof PhantomFoxyEntity animatable ? animatable.getTexture() : "null";
		}
		if (entity instanceof PhantomBalloonBoyEntity) {
			thing = entity instanceof PhantomBalloonBoyEntity animatable ? animatable.getTexture() : "null";
		}
		if (entity instanceof PhantomMangleEntity) {
			thing = entity instanceof PhantomMangleEntity animatable ? animatable.getTexture() : "null";
		}
		if (entity instanceof PhantomPuppetEntity) {
			thing = entity instanceof PhantomPuppetEntity animatable ? animatable.getTexture() : "null";
		}
		if (entity instanceof NightmareFreddyEntity) {
			thing = entity instanceof NightmareFreddyEntity animatable ? animatable.getTexture() : "null";
		}
		if (entity instanceof NightmareBonnieEntity) {
			thing = entity instanceof NightmareBonnieEntity animatable ? animatable.getTexture() : "null";
		}
		if (entity instanceof NightmareChicaEntity) {
			thing = entity instanceof NightmareChicaEntity animatable ? animatable.getTexture() : "null";
		}
		if (entity instanceof NightmareFoxyEntity) {
			thing = entity instanceof NightmareFoxyEntity animatable ? animatable.getTexture() : "null";
		}
		if (entity instanceof NightmareFredbearEntity) {
			thing = entity instanceof NightmareFredbearEntity animatable ? animatable.getTexture() : "null";
		}
		if (entity instanceof NightmareEntity) {
			thing = entity instanceof NightmareEntity animatable ? animatable.getTexture() : "null";
		}
		if (entity instanceof PlushtrapEntity) {
			thing = entity instanceof PlushtrapEntity animatable ? animatable.getTexture() : "null";
		} else if (entity instanceof PlushtrapDayEntity) {
			thing = entity instanceof PlushtrapDayEntity animatable ? animatable.getTexture() : "null";
		}
		if (entity instanceof JackOBonnieEntity) {
			thing = entity instanceof JackOBonnieEntity animatable ? animatable.getTexture() : "null";
		}
		if (entity instanceof JackOChicaEntity) {
			thing = entity instanceof JackOChicaEntity animatable ? animatable.getTexture() : "null";
		}
		if (entity instanceof NightmareMangleEntity) {
			thing = entity instanceof NightmareMangleEntity animatable ? animatable.getTexture() : "null";
		}
		if (entity instanceof NightmarionneEntity) {
			thing = entity instanceof NightmarionneEntity animatable ? animatable.getTexture() : "null";
		}
		if (entity instanceof NightmareBbEntity) {
			thing = entity instanceof NightmareBbEntity animatable ? animatable.getTexture() : "null";
		} else if (entity instanceof NightmareBbDayEntity) {
			thing = entity instanceof NightmareBbDayEntity animatable ? animatable.getTexture() : "null";
		}
		if (entity instanceof BlobBalloraEntity) {
			thing = entity instanceof BlobBalloraEntity animatable ? animatable.getTexture() : "null";
		} else if (entity instanceof BlobCircusBabyEntity) {
			thing = entity instanceof BlobCircusBabyEntity animatable ? animatable.getTexture() : "null";
		} else if (entity instanceof BlobFuntimeFoxyEntity) {
			thing = entity instanceof BlobFuntimeFoxyEntity animatable ? animatable.getTexture() : "null";
		} else if (entity instanceof BlobFuntimeFreddyEntity) {
			thing = entity instanceof BlobFuntimeFreddyEntity animatable ? animatable.getTexture() : "null";
		}
		if (entity instanceof CircusBabyEntity) {
			thing = entity instanceof CircusBabyEntity animatable ? animatable.getTexture() : "null";
		} else if (entity instanceof CircusBabyDayEntity) {
			thing = entity instanceof CircusBabyDayEntity animatable ? animatable.getTexture() : "null";
		}
		if (entity instanceof BalloraEntity) {
			thing = entity instanceof BalloraEntity animatable ? animatable.getTexture() : "null";
		} else if (entity instanceof BalloraDayEntity) {
			thing = entity instanceof BalloraDayEntity animatable ? animatable.getTexture() : "null";
		}
		if (entity instanceof FuntimeFreddyEntity) {
			thing = entity instanceof FuntimeFreddyEntity animatable ? animatable.getTexture() : "null";
		} else if (entity instanceof FuntimeFreddyDayEntity) {
			thing = entity instanceof FuntimeFreddyDayEntity animatable ? animatable.getTexture() : "null";
		}
		if (entity instanceof FuntimeFoxyEntity) {
			thing = entity instanceof FuntimeFoxyEntity animatable ? animatable.getTexture() : "null";
		} else if (entity instanceof FuntimeFoxyDayEntity) {
			thing = entity instanceof FuntimeFoxyDayEntity animatable ? animatable.getTexture() : "null";
		}
		if (entity instanceof BidybabEntity) {
			thing = entity instanceof BidybabEntity animatable ? animatable.getTexture() : "null";
		} else if (entity instanceof BidybabDayEntity) {
			thing = entity instanceof BidybabDayEntity animatable ? animatable.getTexture() : "null";
		}
		if (entity instanceof ElectrobabEntity) {
			thing = entity instanceof ElectrobabEntity animatable ? animatable.getTexture() : "null";
		} else if (entity instanceof ElectrobabDayEntity) {
			thing = entity instanceof ElectrobabDayEntity animatable ? animatable.getTexture() : "null";
		}
		if (entity instanceof MinireenaEntity) {
			thing = entity instanceof MinireenaEntity animatable ? animatable.getTexture() : "null";
		} else if (entity instanceof MinireenaDayEntity) {
			thing = entity instanceof MinireenaDayEntity animatable ? animatable.getTexture() : "null";
		}
		if (entity instanceof Minireena2Entity) {
			thing = entity instanceof Minireena2Entity animatable ? animatable.getTexture() : "null";
		} else if (entity instanceof Minireena2DayEntity) {
			thing = entity instanceof Minireena2DayEntity animatable ? animatable.getTexture() : "null";
		}
		if (entity instanceof BonnetEntity) {
			thing = entity instanceof BonnetEntity animatable ? animatable.getTexture() : "null";
		} else if (entity instanceof BonnetDayEntity) {
			thing = entity instanceof BonnetDayEntity animatable ? animatable.getTexture() : "null";
		}
		if (entity instanceof YenndoEntity) {
			thing = entity instanceof YenndoEntity animatable ? animatable.getTexture() : "null";
		}
		if (entity instanceof LolbitEntity) {
			thing = entity instanceof LolbitEntity animatable ? animatable.getTexture() : "null";
		}
		if (entity instanceof BucketBobEntity) {
			thing = entity instanceof BucketBobEntity animatable ? animatable.getTexture() : "null";
		} else if (entity instanceof BucketBobDayEntity) {
			thing = entity instanceof BucketBobDayEntity animatable ? animatable.getTexture() : "null";
		}
		if (entity instanceof PanStanEntity) {
			thing = entity instanceof PanStanEntity animatable ? animatable.getTexture() : "null";
		} else if (entity instanceof PanStanDayEntity) {
			thing = entity instanceof PanStanDayEntity animatable ? animatable.getTexture() : "null";
		}
		if (entity instanceof MrCanDoEntity) {
			thing = entity instanceof MrCanDoEntity animatable ? animatable.getTexture() : "null";
		} else if (entity instanceof MrCanDoDayEntity) {
			thing = entity instanceof MrCanDoDayEntity animatable ? animatable.getTexture() : "null";
		}
		if (entity instanceof MrHugsEntity) {
			thing = entity instanceof MrHugsEntity animatable ? animatable.getTexture() : "null";
		} else if (entity instanceof MrHugsDayEntity) {
			thing = entity instanceof MrHugsDayEntity animatable ? animatable.getTexture() : "null";
		}
		if (entity instanceof NumberOneCrateEntity) {
			thing = entity instanceof NumberOneCrateEntity animatable ? animatable.getTexture() : "null";
		} else if (entity instanceof NumberOneCrateDayEntity) {
			thing = entity instanceof NumberOneCrateDayEntity animatable ? animatable.getTexture() : "null";
		}
		if (entity instanceof HappyFrogEntity) {
			thing = entity instanceof HappyFrogEntity animatable ? animatable.getTexture() : "null";
		} else if (entity instanceof HappyFrogDayEntity) {
			thing = entity instanceof HappyFrogDayEntity animatable ? animatable.getTexture() : "null";
		}
		if (entity instanceof PigpatchEntity) {
			thing = entity instanceof PigpatchEntity animatable ? animatable.getTexture() : "null";
		} else if (entity instanceof PigpatchDayEntity) {
			thing = entity instanceof PigpatchDayEntity animatable ? animatable.getTexture() : "null";
		}
		if (entity instanceof NeddbearEntity) {
			thing = entity instanceof NeddbearEntity animatable ? animatable.getTexture() : "null";
		} else if (entity instanceof NeddBearDayEntity) {
			thing = entity instanceof NeddBearDayEntity animatable ? animatable.getTexture() : "null";
		}
		if (entity instanceof MrHippoEntity) {
			thing = entity instanceof MrHippoEntity animatable ? animatable.getTexture() : "null";
		} else if (entity instanceof MrHippoDayEntity) {
			thing = entity instanceof MrHippoDayEntity animatable ? animatable.getTexture() : "null";
		}
		if (entity instanceof RockstarFreddyEntity) {
			thing = entity instanceof RockstarFreddyEntity animatable ? animatable.getTexture() : "null";
		} else if (entity instanceof RockstarFreddyDayEntity) {
			thing = entity instanceof RockstarFreddyDayEntity animatable ? animatable.getTexture() : "null";
		}
		return thing;
	}
}
