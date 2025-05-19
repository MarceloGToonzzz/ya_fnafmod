
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.yafnafmod.init;

import net.minecraftforge.registries.RegistryObject;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.fml.event.lifecycle.FMLCommonSetupEvent;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.event.entity.EntityAttributeCreationEvent;

import net.minecraft.world.entity.MobCategory;
import net.minecraft.world.entity.EntityType;
import net.minecraft.world.entity.Entity;

import net.mcreator.yafnafmod.entity.YenndoEntity;
import net.mcreator.yafnafmod.entity.WitheredJollyRatEntity;
import net.mcreator.yafnafmod.entity.WitheredJollyRatDayEntity;
import net.mcreator.yafnafmod.entity.WitheredGoldenFreddyEntity;
import net.mcreator.yafnafmod.entity.WitheredFreddyEntity;
import net.mcreator.yafnafmod.entity.WitheredFreddyDayEntity;
import net.mcreator.yafnafmod.entity.WitheredFoxyEntity;
import net.mcreator.yafnafmod.entity.WitheredFoxyDayEntity;
import net.mcreator.yafnafmod.entity.WitheredDougDogEntity;
import net.mcreator.yafnafmod.entity.WitheredDougDogDayEntity;
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
import net.mcreator.yafnafmod.entity.ToyCupcakeEntityEntity;
import net.mcreator.yafnafmod.entity.ToyChicaStillDayEntity;
import net.mcreator.yafnafmod.entity.ToyChicaEntity;
import net.mcreator.yafnafmod.entity.ToyChicaDayEntity;
import net.mcreator.yafnafmod.entity.ToyBonnieStillDayEntity;
import net.mcreator.yafnafmod.entity.ToyBonnieEntity;
import net.mcreator.yafnafmod.entity.ToyBonnieDayEntity;
import net.mcreator.yafnafmod.entity.TomatoProjectileEntity;
import net.mcreator.yafnafmod.entity.SpringtrapEntity;
import net.mcreator.yafnafmod.entity.SpringtrapDayEntity;
import net.mcreator.yafnafmod.entity.SpringbonnieSuitEntity;
import net.mcreator.yafnafmod.entity.SpringbonnieEntity;
import net.mcreator.yafnafmod.entity.SpringbonnieDayEntity;
import net.mcreator.yafnafmod.entity.SparkyDogEntity;
import net.mcreator.yafnafmod.entity.SparkyDogDayEntity;
import net.mcreator.yafnafmod.entity.ShreddyFazchairEntity;
import net.mcreator.yafnafmod.entity.ShotgunShellProjectileEntity;
import net.mcreator.yafnafmod.entity.ShadowFreddyEntity;
import net.mcreator.yafnafmod.entity.ShadowBonnieEntity;
import net.mcreator.yafnafmod.entity.SeatEntity;
import net.mcreator.yafnafmod.entity.SeabonnieEntity;
import net.mcreator.yafnafmod.entity.ScraptrapEntity;
import net.mcreator.yafnafmod.entity.ScrapSparkyDogEntity;
import net.mcreator.yafnafmod.entity.ScrapSparkyDogDayEntity;
import net.mcreator.yafnafmod.entity.ScrapBabyEntity;
import net.mcreator.yafnafmod.entity.RustyEntity;
import net.mcreator.yafnafmod.entity.RustyDayEntity;
import net.mcreator.yafnafmod.entity.RockstarFreddyEntity;
import net.mcreator.yafnafmod.entity.RockstarFreddyDayEntity;
import net.mcreator.yafnafmod.entity.RockstarFoxyEntity;
import net.mcreator.yafnafmod.entity.RockstarFoxyDayEntity;
import net.mcreator.yafnafmod.entity.RockstarChicaEntity;
import net.mcreator.yafnafmod.entity.RockstarChicaDayEntity;
import net.mcreator.yafnafmod.entity.RockstarBonnieEntity;
import net.mcreator.yafnafmod.entity.RockstarBonnieDayEntity;
import net.mcreator.yafnafmod.entity.RickyRatEntity;
import net.mcreator.yafnafmod.entity.RickyRatDayEntity;
import net.mcreator.yafnafmod.entity.RetroFreddyEntity;
import net.mcreator.yafnafmod.entity.RetroFreddyDayEntity;
import net.mcreator.yafnafmod.entity.RetroFoxyEntity;
import net.mcreator.yafnafmod.entity.RetroFoxyDayEntity;
import net.mcreator.yafnafmod.entity.RetroCupcakeFmsEntityEntity;
import net.mcreator.yafnafmod.entity.RetroCupcakeEntityEntity;
import net.mcreator.yafnafmod.entity.RetroChicaEntity;
import net.mcreator.yafnafmod.entity.RetroChicaDayEntity;
import net.mcreator.yafnafmod.entity.RetroBonnieEntity;
import net.mcreator.yafnafmod.entity.RetroBonnieDayEntity;
import net.mcreator.yafnafmod.entity.RatEntity;
import net.mcreator.yafnafmod.entity.RaccoonEntity;
import net.mcreator.yafnafmod.entity.PurpleGuyEntity;
import net.mcreator.yafnafmod.entity.PuppetFreddybearEntity;
import net.mcreator.yafnafmod.entity.PuppetFreddybearDayEntity;
import net.mcreator.yafnafmod.entity.PuppetEntity;
import net.mcreator.yafnafmod.entity.PuppetDayEntity;
import net.mcreator.yafnafmod.entity.PossumEntity;
import net.mcreator.yafnafmod.entity.PopgoesWeaselEntity;
import net.mcreator.yafnafmod.entity.PopgoesWeaselDayEntity;
import net.mcreator.yafnafmod.entity.PlushtrapEntity;
import net.mcreator.yafnafmod.entity.PlushtrapDayEntity;
import net.mcreator.yafnafmod.entity.PitbonnieEntity;
import net.mcreator.yafnafmod.entity.PitbonnieDayEntity;
import net.mcreator.yafnafmod.entity.PigpatchEntity;
import net.mcreator.yafnafmod.entity.PigpatchDayEntity;
import net.mcreator.yafnafmod.entity.PidgeonEntity;
import net.mcreator.yafnafmod.entity.PhantomPuppetEntity;
import net.mcreator.yafnafmod.entity.PhantomMangleEntity;
import net.mcreator.yafnafmod.entity.PhantomFreddyEntity;
import net.mcreator.yafnafmod.entity.PhantomFoxyEntity;
import net.mcreator.yafnafmod.entity.PhantomChicaEntity;
import net.mcreator.yafnafmod.entity.PhantomBalloonBoyEntity;
import net.mcreator.yafnafmod.entity.PanStanEntity;
import net.mcreator.yafnafmod.entity.PanStanDayEntity;
import net.mcreator.yafnafmod.entity.OrvilleElephantEntity;
import net.mcreator.yafnafmod.entity.OrvilleElephantDayEntity;
import net.mcreator.yafnafmod.entity.OfficeChairRedEntityEntity;
import net.mcreator.yafnafmod.entity.OfficeChairBlackEntityEntity;
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
import net.mcreator.yafnafmod.entity.MysteriousGiantScuttlerEntity;
import net.mcreator.yafnafmod.entity.MusicManEntity;
import net.mcreator.yafnafmod.entity.MusicManDayEntity;
import net.mcreator.yafnafmod.entity.MrHugsEntity;
import net.mcreator.yafnafmod.entity.MrHugsDayEntity;
import net.mcreator.yafnafmod.entity.MrHippoEntity;
import net.mcreator.yafnafmod.entity.MrHippoDayEntity;
import net.mcreator.yafnafmod.entity.MrCanDoEntity;
import net.mcreator.yafnafmod.entity.MrCanDoDayEntity;
import net.mcreator.yafnafmod.entity.MoltenFreddyEntity;
import net.mcreator.yafnafmod.entity.MinireenaEntity;
import net.mcreator.yafnafmod.entity.MinireenaDayEntity;
import net.mcreator.yafnafmod.entity.Minireena2Entity;
import net.mcreator.yafnafmod.entity.Minireena2DayEntity;
import net.mcreator.yafnafmod.entity.MangleEntity;
import net.mcreator.yafnafmod.entity.MangleDayEntity;
import net.mcreator.yafnafmod.entity.LolbitEntity;
import net.mcreator.yafnafmod.entity.Lolbit409Entity;
import net.mcreator.yafnafmod.entity.Lolbit409DayEntity;
import net.mcreator.yafnafmod.entity.LeftyEntity;
import net.mcreator.yafnafmod.entity.LeftyDayEntity;
import net.mcreator.yafnafmod.entity.JollyRatEntity;
import net.mcreator.yafnafmod.entity.JollyRatDayEntity;
import net.mcreator.yafnafmod.entity.JjDayEntity;
import net.mcreator.yafnafmod.entity.JackOChicaEntity;
import net.mcreator.yafnafmod.entity.JackOBonnieEntity;
import net.mcreator.yafnafmod.entity.JJEntity;
import net.mcreator.yafnafmod.entity.IndigoEntity;
import net.mcreator.yafnafmod.entity.IndigoDayEntity;
import net.mcreator.yafnafmod.entity.IgnitedChicaEntity;
import net.mcreator.yafnafmod.entity.IgnitedChicaDayEntity;
import net.mcreator.yafnafmod.entity.HelpyEntity;
import net.mcreator.yafnafmod.entity.HappyFrogEntity;
import net.mcreator.yafnafmod.entity.HappyFrogDayEntity;
import net.mcreator.yafnafmod.entity.GusThePugStillDayEntity;
import net.mcreator.yafnafmod.entity.GusThePugEntity;
import net.mcreator.yafnafmod.entity.GusThePugDayEntity;
import net.mcreator.yafnafmod.entity.GoldenFreddyEntity;
import net.mcreator.yafnafmod.entity.GhostChildEntity;
import net.mcreator.yafnafmod.entity.FuntimeFreddyEntity;
import net.mcreator.yafnafmod.entity.FuntimeFreddyDayEntity;
import net.mcreator.yafnafmod.entity.FuntimeFoxyEntity;
import net.mcreator.yafnafmod.entity.FuntimeFoxyDayEntity;
import net.mcreator.yafnafmod.entity.FuntimeDelilahEntity;
import net.mcreator.yafnafmod.entity.FuntimeDelilahDayEntity;
import net.mcreator.yafnafmod.entity.FuntimeChicaEntity;
import net.mcreator.yafnafmod.entity.FuntimeChicaDayEntity;
import net.mcreator.yafnafmod.entity.FreddyFazbearEntity;
import net.mcreator.yafnafmod.entity.FreddyFazbearDayEntity;
import net.mcreator.yafnafmod.entity.FredbearSuitHeadlessEntity;
import net.mcreator.yafnafmod.entity.FredbearSuitEntity;
import net.mcreator.yafnafmod.entity.FredbearEntity;
import net.mcreator.yafnafmod.entity.FredbearDayEntity;
import net.mcreator.yafnafmod.entity.FoxyPirateEntity;
import net.mcreator.yafnafmod.entity.FoxyPirateDayEntity;
import net.mcreator.yafnafmod.entity.EnnardEntity;
import net.mcreator.yafnafmod.entity.Endo02Entity;
import net.mcreator.yafnafmod.entity.Endo02DayEntity;
import net.mcreator.yafnafmod.entity.Endo01Entity;
import net.mcreator.yafnafmod.entity.Endo01DayEntity;
import net.mcreator.yafnafmod.entity.ElectrobabEntity;
import net.mcreator.yafnafmod.entity.ElectrobabDayEntity;
import net.mcreator.yafnafmod.entity.ElChipEntity;
import net.mcreator.yafnafmod.entity.ElChipDayEntity;
import net.mcreator.yafnafmod.entity.DrTeethEntity;
import net.mcreator.yafnafmod.entity.DrTeethDayEntity;
import net.mcreator.yafnafmod.entity.DougDogEntity;
import net.mcreator.yafnafmod.entity.DougDogDayEntity;
import net.mcreator.yafnafmod.entity.CupcakeEntityEntity;
import net.mcreator.yafnafmod.entity.CrowEntity;
import net.mcreator.yafnafmod.entity.CircusBabyEntity;
import net.mcreator.yafnafmod.entity.CircusBabyDayEntity;
import net.mcreator.yafnafmod.entity.CindyCatEntity;
import net.mcreator.yafnafmod.entity.CindyCatDayEntity;
import net.mcreator.yafnafmod.entity.ChildEntity;
import net.mcreator.yafnafmod.entity.ChicaChickenEntity;
import net.mcreator.yafnafmod.entity.ChicaChickenDayEntity;
import net.mcreator.yafnafmod.entity.CarStationWagonEntity;
import net.mcreator.yafnafmod.entity.CarSeatEntity;
import net.mcreator.yafnafmod.entity.CarPurpleChevroletImpalaEntity;
import net.mcreator.yafnafmod.entity.CarPoliceCruiserChevroletImpala1983Entity;
import net.mcreator.yafnafmod.entity.CarHarleyMotorcycleEntity;
import net.mcreator.yafnafmod.entity.CarFazvanEntity;
import net.mcreator.yafnafmod.entity.CarDodgeRam1982Entity;
import net.mcreator.yafnafmod.entity.CarDesotoEntity;
import net.mcreator.yafnafmod.entity.CandyCatEntity;
import net.mcreator.yafnafmod.entity.CandyCatDayEntity;
import net.mcreator.yafnafmod.entity.BucketBobEntity;
import net.mcreator.yafnafmod.entity.BucketBobDayEntity;
import net.mcreator.yafnafmod.entity.BonnieBunnyEntity;
import net.mcreator.yafnafmod.entity.BonnieBunnyDayEntity;
import net.mcreator.yafnafmod.entity.BonnetEntity;
import net.mcreator.yafnafmod.entity.BonnetDayEntity;
import net.mcreator.yafnafmod.entity.BonbonEntity;
import net.mcreator.yafnafmod.entity.BlobFuntimeFreddyEntity;
import net.mcreator.yafnafmod.entity.BlobFuntimeFoxyEntity;
import net.mcreator.yafnafmod.entity.BlobCircusBabyEntity;
import net.mcreator.yafnafmod.entity.BlobBalloraEntity;
import net.mcreator.yafnafmod.entity.BlakeBadgerEntity;
import net.mcreator.yafnafmod.entity.BlakeBadgerDayEntity;
import net.mcreator.yafnafmod.entity.BidybabEntity;
import net.mcreator.yafnafmod.entity.BidybabDayEntity;
import net.mcreator.yafnafmod.entity.BarryPolarEntity;
import net.mcreator.yafnafmod.entity.BarryPolarDayEntity;
import net.mcreator.yafnafmod.entity.BalloraEntity;
import net.mcreator.yafnafmod.entity.BalloraDayEntity;
import net.mcreator.yafnafmod.entity.BalloonBoyEntity;
import net.mcreator.yafnafmod.entity.BalloonBoyDayEntity;
import net.mcreator.yafnafmod.entity.BallYellowProjectileEntity;
import net.mcreator.yafnafmod.entity.BallRedProjectileEntity;
import net.mcreator.yafnafmod.entity.BallPurpleProjectileEntity;
import net.mcreator.yafnafmod.entity.BallOrangeProjectileEntity;
import net.mcreator.yafnafmod.entity.BallGreenProjectileEntity;
import net.mcreator.yafnafmod.entity.BallBlueProjectileEntity;
import net.mcreator.yafnafmod.entity.BaggieMaggieEntity;
import net.mcreator.yafnafmod.entity.BaggieMaggieDayEntity;
import net.mcreator.yafnafmod.YaFnafmodMod;

@Mod.EventBusSubscriber(bus = Mod.EventBusSubscriber.Bus.MOD)
public class YaFnafmodModEntities {
	public static final DeferredRegister<EntityType<?>> REGISTRY = DeferredRegister.create(ForgeRegistries.ENTITY_TYPES, YaFnafmodMod.MODID);
	public static final RegistryObject<EntityType<FreddyFazbearEntity>> FREDDY_FAZBEAR = register("freddy_fazbear",
			EntityType.Builder.<FreddyFazbearEntity>of(FreddyFazbearEntity::new, MobCategory.MONSTER).setShouldReceiveVelocityUpdates(true).setTrackingRange(96).setUpdateInterval(3).setCustomClientFactory(FreddyFazbearEntity::new)

					.sized(0.6f, 1.8f));
	public static final RegistryObject<EntityType<FreddyFazbearDayEntity>> FREDDY_FAZBEAR_DAY = register("freddy_fazbear_day",
			EntityType.Builder.<FreddyFazbearDayEntity>of(FreddyFazbearDayEntity::new, MobCategory.MONSTER).setShouldReceiveVelocityUpdates(true).setTrackingRange(96).setUpdateInterval(3).setCustomClientFactory(FreddyFazbearDayEntity::new)

					.sized(0.6f, 1.8f));
	public static final RegistryObject<EntityType<SeatEntity>> SEAT = register("seat",
			EntityType.Builder.<SeatEntity>of(SeatEntity::new, MobCategory.MONSTER).setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(3).setCustomClientFactory(SeatEntity::new)

					.sized(0.5f, 0.5f));
	public static final RegistryObject<EntityType<BonnieBunnyEntity>> BONNIE_BUNNY = register("bonnie_bunny",
			EntityType.Builder.<BonnieBunnyEntity>of(BonnieBunnyEntity::new, MobCategory.MONSTER).setShouldReceiveVelocityUpdates(true).setTrackingRange(96).setUpdateInterval(3).setCustomClientFactory(BonnieBunnyEntity::new)

					.sized(0.6f, 1.125f));
	public static final RegistryObject<EntityType<BonnieBunnyDayEntity>> BONNIE_BUNNY_DAY = register("bonnie_bunny_day",
			EntityType.Builder.<BonnieBunnyDayEntity>of(BonnieBunnyDayEntity::new, MobCategory.MONSTER).setShouldReceiveVelocityUpdates(true).setTrackingRange(96).setUpdateInterval(3).setCustomClientFactory(BonnieBunnyDayEntity::new)

					.sized(0.6f, 1.125f));
	public static final RegistryObject<EntityType<ChicaChickenEntity>> CHICA_CHICKEN = register("chica_chicken",
			EntityType.Builder.<ChicaChickenEntity>of(ChicaChickenEntity::new, MobCategory.MONSTER).setShouldReceiveVelocityUpdates(true).setTrackingRange(96).setUpdateInterval(3).setCustomClientFactory(ChicaChickenEntity::new)

					.sized(0.6f, 0.9375f));
	public static final RegistryObject<EntityType<ChicaChickenDayEntity>> CHICA_CHICKEN_DAY = register("chica_chicken_day",
			EntityType.Builder.<ChicaChickenDayEntity>of(ChicaChickenDayEntity::new, MobCategory.MONSTER).setShouldReceiveVelocityUpdates(true).setTrackingRange(96).setUpdateInterval(3).setCustomClientFactory(ChicaChickenDayEntity::new)

					.sized(0.6f, 0.9375f));
	public static final RegistryObject<EntityType<FoxyPirateEntity>> FOXY_PIRATE = register("foxy_pirate",
			EntityType.Builder.<FoxyPirateEntity>of(FoxyPirateEntity::new, MobCategory.MONSTER).setShouldReceiveVelocityUpdates(true).setTrackingRange(96).setUpdateInterval(3).setCustomClientFactory(FoxyPirateEntity::new)

					.sized(0.6f, 1.4375f));
	public static final RegistryObject<EntityType<FoxyPirateDayEntity>> FOXY_PIRATE_DAY = register("foxy_pirate_day",
			EntityType.Builder.<FoxyPirateDayEntity>of(FoxyPirateDayEntity::new, MobCategory.MONSTER).setShouldReceiveVelocityUpdates(true).setTrackingRange(96).setUpdateInterval(3).setCustomClientFactory(FoxyPirateDayEntity::new)

					.sized(0.6f, 1.4375f));
	public static final RegistryObject<EntityType<GoldenFreddyEntity>> GOLDEN_FREDDY = register("golden_freddy",
			EntityType.Builder.<GoldenFreddyEntity>of(GoldenFreddyEntity::new, MobCategory.MONSTER).setShouldReceiveVelocityUpdates(true).setTrackingRange(96).setUpdateInterval(3).setCustomClientFactory(GoldenFreddyEntity::new)

					.sized(0.6f, 1.8f));
	public static final RegistryObject<EntityType<WitheredFreddyEntity>> WITHERED_FREDDY = register("withered_freddy",
			EntityType.Builder.<WitheredFreddyEntity>of(WitheredFreddyEntity::new, MobCategory.MONSTER).setShouldReceiveVelocityUpdates(true).setTrackingRange(96).setUpdateInterval(3).setCustomClientFactory(WitheredFreddyEntity::new)

					.sized(0.6f, 1.8f));
	public static final RegistryObject<EntityType<WitheredFreddyDayEntity>> WITHERED_FREDDY_DAY = register("withered_freddy_day",
			EntityType.Builder.<WitheredFreddyDayEntity>of(WitheredFreddyDayEntity::new, MobCategory.MONSTER).setShouldReceiveVelocityUpdates(true).setTrackingRange(96).setUpdateInterval(3).setCustomClientFactory(WitheredFreddyDayEntity::new)

					.sized(0.6f, 1.8f));
	public static final RegistryObject<EntityType<WitheredBonnieEntity>> WITHERED_BONNIE = register("withered_bonnie",
			EntityType.Builder.<WitheredBonnieEntity>of(WitheredBonnieEntity::new, MobCategory.MONSTER).setShouldReceiveVelocityUpdates(true).setTrackingRange(96).setUpdateInterval(3).setCustomClientFactory(WitheredBonnieEntity::new)

					.sized(0.6f, 0.85f));
	public static final RegistryObject<EntityType<WitheredBonnieDayEntity>> WITHERED_BONNIE_DAY = register("withered_bonnie_day",
			EntityType.Builder.<WitheredBonnieDayEntity>of(WitheredBonnieDayEntity::new, MobCategory.MONSTER).setShouldReceiveVelocityUpdates(true).setTrackingRange(96).setUpdateInterval(3).setCustomClientFactory(WitheredBonnieDayEntity::new)

					.sized(0.6f, 0.938f));
	public static final RegistryObject<EntityType<WitheredChicaEntity>> WITHERED_CHICA = register("withered_chica",
			EntityType.Builder.<WitheredChicaEntity>of(WitheredChicaEntity::new, MobCategory.MONSTER).setShouldReceiveVelocityUpdates(true).setTrackingRange(96).setUpdateInterval(3).setCustomClientFactory(WitheredChicaEntity::new)

					.sized(0.6f, 0.85f));
	public static final RegistryObject<EntityType<WitheredChicaDayEntity>> WITHERED_CHICA_DAY = register("withered_chica_day",
			EntityType.Builder.<WitheredChicaDayEntity>of(WitheredChicaDayEntity::new, MobCategory.MONSTER).setShouldReceiveVelocityUpdates(true).setTrackingRange(96).setUpdateInterval(3).setCustomClientFactory(WitheredChicaDayEntity::new)

					.sized(0.6f, 0.9375f));
	public static final RegistryObject<EntityType<WitheredFoxyEntity>> WITHERED_FOXY = register("withered_foxy",
			EntityType.Builder.<WitheredFoxyEntity>of(WitheredFoxyEntity::new, MobCategory.MONSTER).setShouldReceiveVelocityUpdates(true).setTrackingRange(96).setUpdateInterval(3).setCustomClientFactory(WitheredFoxyEntity::new)

					.sized(0.6f, 1.4375f));
	public static final RegistryObject<EntityType<WitheredFoxyDayEntity>> WITHERED_FOXY_DAY = register("withered_foxy_day",
			EntityType.Builder.<WitheredFoxyDayEntity>of(WitheredFoxyDayEntity::new, MobCategory.MONSTER).setShouldReceiveVelocityUpdates(true).setTrackingRange(96).setUpdateInterval(3).setCustomClientFactory(WitheredFoxyDayEntity::new)

					.sized(0.6f, 1.4375f));
	public static final RegistryObject<EntityType<ToyFreddyEntity>> TOY_FREDDY = register("toy_freddy",
			EntityType.Builder.<ToyFreddyEntity>of(ToyFreddyEntity::new, MobCategory.MONSTER).setShouldReceiveVelocityUpdates(true).setTrackingRange(96).setUpdateInterval(3).setCustomClientFactory(ToyFreddyEntity::new)

					.sized(0.6f, 1.8f));
	public static final RegistryObject<EntityType<ToyFreddyDayEntity>> TOY_FREDDY_DAY = register("toy_freddy_day",
			EntityType.Builder.<ToyFreddyDayEntity>of(ToyFreddyDayEntity::new, MobCategory.MONSTER).setShouldReceiveVelocityUpdates(true).setTrackingRange(96).setUpdateInterval(3).setCustomClientFactory(ToyFreddyDayEntity::new)

					.sized(0.6f, 1.8f));
	public static final RegistryObject<EntityType<ToyBonnieEntity>> TOY_BONNIE = register("toy_bonnie",
			EntityType.Builder.<ToyBonnieEntity>of(ToyBonnieEntity::new, MobCategory.MONSTER).setShouldReceiveVelocityUpdates(true).setTrackingRange(96).setUpdateInterval(3).setCustomClientFactory(ToyBonnieEntity::new)

					.sized(0.6f, 0.85f));
	public static final RegistryObject<EntityType<ToyBonnieDayEntity>> TOY_BONNIE_DAY = register("toy_bonnie_day",
			EntityType.Builder.<ToyBonnieDayEntity>of(ToyBonnieDayEntity::new, MobCategory.MONSTER).setShouldReceiveVelocityUpdates(true).setTrackingRange(96).setUpdateInterval(3).setCustomClientFactory(ToyBonnieDayEntity::new)

					.sized(0.6f, 1.125f));
	public static final RegistryObject<EntityType<ToyChicaEntity>> TOY_CHICA = register("toy_chica",
			EntityType.Builder.<ToyChicaEntity>of(ToyChicaEntity::new, MobCategory.MONSTER).setShouldReceiveVelocityUpdates(true).setTrackingRange(96).setUpdateInterval(3).setCustomClientFactory(ToyChicaEntity::new)

					.sized(0.6f, 0.85f));
	public static final RegistryObject<EntityType<ToyChicaDayEntity>> TOY_CHICA_DAY = register("toy_chica_day",
			EntityType.Builder.<ToyChicaDayEntity>of(ToyChicaDayEntity::new, MobCategory.MONSTER).setShouldReceiveVelocityUpdates(true).setTrackingRange(96).setUpdateInterval(3).setCustomClientFactory(ToyChicaDayEntity::new)

					.sized(0.6f, 1.125f));
	public static final RegistryObject<EntityType<MangleEntity>> MANGLE = register("mangle",
			EntityType.Builder.<MangleEntity>of(MangleEntity::new, MobCategory.MONSTER).setShouldReceiveVelocityUpdates(true).setTrackingRange(96).setUpdateInterval(3).setCustomClientFactory(MangleEntity::new)

					.sized(0.6f, 0.85f));
	public static final RegistryObject<EntityType<MangleDayEntity>> MANGLE_DAY = register("mangle_day",
			EntityType.Builder.<MangleDayEntity>of(MangleDayEntity::new, MobCategory.MONSTER).setShouldReceiveVelocityUpdates(true).setTrackingRange(96).setUpdateInterval(3).setCustomClientFactory(MangleDayEntity::new)

					.sized(0.6f, 1f));
	public static final RegistryObject<EntityType<BalloonBoyEntity>> BALLOON_BOY = register("balloon_boy",
			EntityType.Builder.<BalloonBoyEntity>of(BalloonBoyEntity::new, MobCategory.MONSTER).setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(3).setCustomClientFactory(BalloonBoyEntity::new)

					.sized(0.6f, 0.85f));
	public static final RegistryObject<EntityType<BalloonBoyDayEntity>> BALLOON_BOY_DAY = register("balloon_boy_day",
			EntityType.Builder.<BalloonBoyDayEntity>of(BalloonBoyDayEntity::new, MobCategory.MONSTER).setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(3).setCustomClientFactory(BalloonBoyDayEntity::new)

					.sized(0.6f, 0.95f));
	public static final RegistryObject<EntityType<PuppetEntity>> PUPPET = register("puppet",
			EntityType.Builder.<PuppetEntity>of(PuppetEntity::new, MobCategory.MONSTER).setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(3).setCustomClientFactory(PuppetEntity::new)

					.sized(0.6f, 1f));
	public static final RegistryObject<EntityType<PuppetDayEntity>> PUPPET_DAY = register("puppet_day",
			EntityType.Builder.<PuppetDayEntity>of(PuppetDayEntity::new, MobCategory.MONSTER).setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(3).setCustomClientFactory(PuppetDayEntity::new)

					.sized(0.6f, 1f));
	public static final RegistryObject<EntityType<JJEntity>> JJ = register("jj",
			EntityType.Builder.<JJEntity>of(JJEntity::new, MobCategory.MONSTER).setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(3).setCustomClientFactory(JJEntity::new)

					.sized(0.6f, 0.85f));
	public static final RegistryObject<EntityType<JjDayEntity>> JJ_DAY = register("jj_day",
			EntityType.Builder.<JjDayEntity>of(JjDayEntity::new, MobCategory.MONSTER).setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(3).setCustomClientFactory(JjDayEntity::new)

					.sized(0.6f, 0.95f));
	public static final RegistryObject<EntityType<ToyFoxyEntity>> TOY_FOXY = register("toy_foxy",
			EntityType.Builder.<ToyFoxyEntity>of(ToyFoxyEntity::new, MobCategory.MONSTER).setShouldReceiveVelocityUpdates(true).setTrackingRange(96).setUpdateInterval(3).setCustomClientFactory(ToyFoxyEntity::new)

					.sized(0.6f, 0.85f));
	public static final RegistryObject<EntityType<ToyFoxyDayEntity>> TOY_FOXY_DAY = register("toy_foxy_day",
			EntityType.Builder.<ToyFoxyDayEntity>of(ToyFoxyDayEntity::new, MobCategory.MONSTER).setShouldReceiveVelocityUpdates(true).setTrackingRange(96).setUpdateInterval(3).setCustomClientFactory(ToyFoxyDayEntity::new)

					.sized(0.6f, 1.4375f));
	public static final RegistryObject<EntityType<WitheredGoldenFreddyEntity>> WITHERED_GOLDEN_FREDDY = register("withered_golden_freddy",
			EntityType.Builder.<WitheredGoldenFreddyEntity>of(WitheredGoldenFreddyEntity::new, MobCategory.MONSTER).setShouldReceiveVelocityUpdates(true).setTrackingRange(96).setUpdateInterval(3)
					.setCustomClientFactory(WitheredGoldenFreddyEntity::new)

					.sized(0.6f, 1.8f));
	public static final RegistryObject<EntityType<ShadowBonnieEntity>> SHADOW_BONNIE = register("shadow_bonnie",
			EntityType.Builder.<ShadowBonnieEntity>of(ShadowBonnieEntity::new, MobCategory.MONSTER).setShouldReceiveVelocityUpdates(true).setTrackingRange(96).setUpdateInterval(3).setCustomClientFactory(ShadowBonnieEntity::new)

					.sized(0.6f, 0.938f));
	public static final RegistryObject<EntityType<ShadowFreddyEntity>> SHADOW_FREDDY = register("shadow_freddy",
			EntityType.Builder.<ShadowFreddyEntity>of(ShadowFreddyEntity::new, MobCategory.MONSTER).setShouldReceiveVelocityUpdates(true).setTrackingRange(96).setUpdateInterval(3).setCustomClientFactory(ShadowFreddyEntity::new)

					.sized(0.6f, 1.8f));
	public static final RegistryObject<EntityType<SpringtrapEntity>> SPRINGTRAP = register("springtrap",
			EntityType.Builder.<SpringtrapEntity>of(SpringtrapEntity::new, MobCategory.MONSTER).setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(3).setCustomClientFactory(SpringtrapEntity::new)

					.sized(0.6f, 0.85f));
	public static final RegistryObject<EntityType<SpringtrapDayEntity>> SPRINGTRAP_DAY = register("springtrap_day",
			EntityType.Builder.<SpringtrapDayEntity>of(SpringtrapDayEntity::new, MobCategory.MONSTER).setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(3).setCustomClientFactory(SpringtrapDayEntity::new)

					.sized(0.6f, 1.5f));
	public static final RegistryObject<EntityType<ToyFreddyStillDayEntity>> TOY_FREDDY_STILL_DAY = register("toy_freddy_still_day",
			EntityType.Builder.<ToyFreddyStillDayEntity>of(ToyFreddyStillDayEntity::new, MobCategory.MONSTER).setShouldReceiveVelocityUpdates(true).setTrackingRange(96).setUpdateInterval(3).setCustomClientFactory(ToyFreddyStillDayEntity::new)

					.sized(0.6f, 1.8f));
	public static final RegistryObject<EntityType<ToyBonnieStillDayEntity>> TOY_BONNIE_STILL_DAY = register("toy_bonnie_still_day",
			EntityType.Builder.<ToyBonnieStillDayEntity>of(ToyBonnieStillDayEntity::new, MobCategory.MONSTER).setShouldReceiveVelocityUpdates(true).setTrackingRange(96).setUpdateInterval(3).setCustomClientFactory(ToyBonnieStillDayEntity::new)

					.sized(0.6f, 0.938f));
	public static final RegistryObject<EntityType<ToyChicaStillDayEntity>> TOY_CHICA_STILL_DAY = register("toy_chica_still_day",
			EntityType.Builder.<ToyChicaStillDayEntity>of(ToyChicaStillDayEntity::new, MobCategory.MONSTER).setShouldReceiveVelocityUpdates(true).setTrackingRange(96).setUpdateInterval(3).setCustomClientFactory(ToyChicaStillDayEntity::new)

					.sized(0.6f, 0.9375f));
	public static final RegistryObject<EntityType<ToyFoxyStillDayEntity>> TOY_FOXY_STILL_DAY = register("toy_foxy_still_day",
			EntityType.Builder.<ToyFoxyStillDayEntity>of(ToyFoxyStillDayEntity::new, MobCategory.MONSTER).setShouldReceiveVelocityUpdates(true).setTrackingRange(96).setUpdateInterval(3).setCustomClientFactory(ToyFoxyStillDayEntity::new)

					.sized(0.6f, 1.4375f));
	public static final RegistryObject<EntityType<PhantomChicaEntity>> PHANTOM_CHICA = register("phantom_chica",
			EntityType.Builder.<PhantomChicaEntity>of(PhantomChicaEntity::new, MobCategory.MONSTER).setShouldReceiveVelocityUpdates(true).setTrackingRange(96).setUpdateInterval(3).setCustomClientFactory(PhantomChicaEntity::new)

					.sized(0.6f, 0.9375f));
	public static final RegistryObject<EntityType<PhantomFreddyEntity>> PHANTOM_FREDDY = register("phantom_freddy",
			EntityType.Builder.<PhantomFreddyEntity>of(PhantomFreddyEntity::new, MobCategory.MONSTER).setShouldReceiveVelocityUpdates(true).setTrackingRange(96).setUpdateInterval(3).setCustomClientFactory(PhantomFreddyEntity::new)

					.sized(0.6f, 1.8f));
	public static final RegistryObject<EntityType<PhantomFoxyEntity>> PHANTOM_FOXY = register("phantom_foxy",
			EntityType.Builder.<PhantomFoxyEntity>of(PhantomFoxyEntity::new, MobCategory.MONSTER).setShouldReceiveVelocityUpdates(true).setTrackingRange(96).setUpdateInterval(3).setCustomClientFactory(PhantomFoxyEntity::new)

					.sized(0.6f, 1.4375f));
	public static final RegistryObject<EntityType<PhantomMangleEntity>> PHANTOM_MANGLE = register("phantom_mangle",
			EntityType.Builder.<PhantomMangleEntity>of(PhantomMangleEntity::new, MobCategory.MONSTER).setShouldReceiveVelocityUpdates(true).setTrackingRange(96).setUpdateInterval(3).setCustomClientFactory(PhantomMangleEntity::new)

					.sized(0.6f, 0.85f));
	public static final RegistryObject<EntityType<PhantomBalloonBoyEntity>> PHANTOM_BALLOON_BOY = register("phantom_balloon_boy",
			EntityType.Builder.<PhantomBalloonBoyEntity>of(PhantomBalloonBoyEntity::new, MobCategory.MONSTER).setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(3).setCustomClientFactory(PhantomBalloonBoyEntity::new)

					.sized(0.6f, 0.85f));
	public static final RegistryObject<EntityType<PhantomPuppetEntity>> PHANTOM_PUPPET = register("phantom_puppet",
			EntityType.Builder.<PhantomPuppetEntity>of(PhantomPuppetEntity::new, MobCategory.MONSTER).setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(3).setCustomClientFactory(PhantomPuppetEntity::new)

					.sized(0.6f, 1f));
	public static final RegistryObject<EntityType<SpringbonnieSuitEntity>> SPRINGBONNIE_SUIT = register("springbonnie_suit",
			EntityType.Builder.<SpringbonnieSuitEntity>of(SpringbonnieSuitEntity::new, MobCategory.MONSTER).setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(3).setCustomClientFactory(SpringbonnieSuitEntity::new)

					.sized(0.6f, 1.5f));
	public static final RegistryObject<EntityType<Endo01Entity>> ENDO_01 = register("endo_01",
			EntityType.Builder.<Endo01Entity>of(Endo01Entity::new, MobCategory.MONSTER).setShouldReceiveVelocityUpdates(true).setTrackingRange(96).setUpdateInterval(3).setCustomClientFactory(Endo01Entity::new)

					.sized(0.6f, 1.8f));
	public static final RegistryObject<EntityType<Endo01DayEntity>> ENDO_01_DAY = register("endo_01_day",
			EntityType.Builder.<Endo01DayEntity>of(Endo01DayEntity::new, MobCategory.MONSTER).setShouldReceiveVelocityUpdates(true).setTrackingRange(96).setUpdateInterval(3).setCustomClientFactory(Endo01DayEntity::new)

					.sized(0.6f, 1.8f));
	public static final RegistryObject<EntityType<Endo02Entity>> ENDO_02 = register("endo_02",
			EntityType.Builder.<Endo02Entity>of(Endo02Entity::new, MobCategory.MONSTER).setShouldReceiveVelocityUpdates(true).setTrackingRange(96).setUpdateInterval(3).setCustomClientFactory(Endo02Entity::new)

					.sized(0.6f, 1.8f));
	public static final RegistryObject<EntityType<Endo02DayEntity>> ENDO_02_DAY = register("endo_02_day",
			EntityType.Builder.<Endo02DayEntity>of(Endo02DayEntity::new, MobCategory.MONSTER).setShouldReceiveVelocityUpdates(true).setTrackingRange(96).setUpdateInterval(3).setCustomClientFactory(Endo02DayEntity::new)

					.sized(0.6f, 1.8f));
	public static final RegistryObject<EntityType<FredbearEntity>> FREDBEAR = register("fredbear",
			EntityType.Builder.<FredbearEntity>of(FredbearEntity::new, MobCategory.MONSTER).setShouldReceiveVelocityUpdates(true).setTrackingRange(96).setUpdateInterval(3).setCustomClientFactory(FredbearEntity::new)

					.sized(0.6f, 1.8f));
	public static final RegistryObject<EntityType<FredbearDayEntity>> FREDBEAR_DAY = register("fredbear_day",
			EntityType.Builder.<FredbearDayEntity>of(FredbearDayEntity::new, MobCategory.MONSTER).setShouldReceiveVelocityUpdates(true).setTrackingRange(96).setUpdateInterval(3).setCustomClientFactory(FredbearDayEntity::new)

					.sized(0.6f, 1.8f));
	public static final RegistryObject<EntityType<NightmareFreddyEntity>> NIGHTMARE_FREDDY = register("nightmare_freddy",
			EntityType.Builder.<NightmareFreddyEntity>of(NightmareFreddyEntity::new, MobCategory.MONSTER).setShouldReceiveVelocityUpdates(true).setTrackingRange(96).setUpdateInterval(3).setCustomClientFactory(NightmareFreddyEntity::new)

					.sized(0.6f, 1.8f));
	public static final RegistryObject<EntityType<PlushtrapEntity>> PLUSHTRAP = register("plushtrap",
			EntityType.Builder.<PlushtrapEntity>of(PlushtrapEntity::new, MobCategory.MONSTER).setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(3).setCustomClientFactory(PlushtrapEntity::new)

					.sized(0.625f, 0.625f));
	public static final RegistryObject<EntityType<NightmareBonnieEntity>> NIGHTMARE_BONNIE = register("nightmare_bonnie",
			EntityType.Builder.<NightmareBonnieEntity>of(NightmareBonnieEntity::new, MobCategory.MONSTER).setShouldReceiveVelocityUpdates(true).setTrackingRange(96).setUpdateInterval(3).setCustomClientFactory(NightmareBonnieEntity::new)

					.sized(0.6f, 1.25f));
	public static final RegistryObject<EntityType<SpringbonnieEntity>> SPRINGBONNIE = register("springbonnie",
			EntityType.Builder.<SpringbonnieEntity>of(SpringbonnieEntity::new, MobCategory.MONSTER).setShouldReceiveVelocityUpdates(true).setTrackingRange(96).setUpdateInterval(3).setCustomClientFactory(SpringbonnieEntity::new)

					.sized(0.6f, 1.25f));
	public static final RegistryObject<EntityType<SpringbonnieDayEntity>> SPRINGBONNIE_DAY = register("springbonnie_day",
			EntityType.Builder.<SpringbonnieDayEntity>of(SpringbonnieDayEntity::new, MobCategory.MONSTER).setShouldReceiveVelocityUpdates(true).setTrackingRange(96).setUpdateInterval(3).setCustomClientFactory(SpringbonnieDayEntity::new)

					.sized(0.6f, 1.25f));
	public static final RegistryObject<EntityType<NightmareChicaEntity>> NIGHTMARE_CHICA = register("nightmare_chica",
			EntityType.Builder.<NightmareChicaEntity>of(NightmareChicaEntity::new, MobCategory.MONSTER).setShouldReceiveVelocityUpdates(true).setTrackingRange(96).setUpdateInterval(3).setCustomClientFactory(NightmareChicaEntity::new)

					.sized(0.6f, 0.85f));
	public static final RegistryObject<EntityType<NightmareFoxyEntity>> NIGHTMARE_FOXY = register("nightmare_foxy",
			EntityType.Builder.<NightmareFoxyEntity>of(NightmareFoxyEntity::new, MobCategory.MONSTER).setShouldReceiveVelocityUpdates(true).setTrackingRange(96).setUpdateInterval(3).setCustomClientFactory(NightmareFoxyEntity::new)

					.sized(0.6f, 1.4375f));
	public static final RegistryObject<EntityType<PlushtrapDayEntity>> PLUSHTRAP_DAY = register("plushtrap_day",
			EntityType.Builder.<PlushtrapDayEntity>of(PlushtrapDayEntity::new, MobCategory.MONSTER).setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(3).setCustomClientFactory(PlushtrapDayEntity::new)

					.sized(0.625f, 0.625f));
	public static final RegistryObject<EntityType<NightmareFredbearEntity>> NIGHTMARE_FREDBEAR = register("nightmare_fredbear",
			EntityType.Builder.<NightmareFredbearEntity>of(NightmareFredbearEntity::new, MobCategory.MONSTER).setShouldReceiveVelocityUpdates(true).setTrackingRange(96).setUpdateInterval(3).setCustomClientFactory(NightmareFredbearEntity::new)

					.sized(0.6f, 1.8f));
	public static final RegistryObject<EntityType<NightmareEntity>> NIGHTMARE = register("nightmare",
			EntityType.Builder.<NightmareEntity>of(NightmareEntity::new, MobCategory.MONSTER).setShouldReceiveVelocityUpdates(true).setTrackingRange(96).setUpdateInterval(3).setCustomClientFactory(NightmareEntity::new)

					.sized(0.6f, 1.8f));
	public static final RegistryObject<EntityType<JackOBonnieEntity>> JACK_O_BONNIE = register("jack_o_bonnie",
			EntityType.Builder.<JackOBonnieEntity>of(JackOBonnieEntity::new, MobCategory.MONSTER).setShouldReceiveVelocityUpdates(true).setTrackingRange(96).setUpdateInterval(3).setCustomClientFactory(JackOBonnieEntity::new)

					.sized(0.6f, 1.25f));
	public static final RegistryObject<EntityType<JackOChicaEntity>> JACK_O_CHICA = register("jack_o_chica",
			EntityType.Builder.<JackOChicaEntity>of(JackOChicaEntity::new, MobCategory.MONSTER).setShouldReceiveVelocityUpdates(true).setTrackingRange(96).setUpdateInterval(3).setCustomClientFactory(JackOChicaEntity::new)

					.sized(0.6f, 0.85f));
	public static final RegistryObject<EntityType<NightmarionneEntity>> NIGHTMARIONNE = register("nightmarionne",
			EntityType.Builder.<NightmarionneEntity>of(NightmarionneEntity::new, MobCategory.MONSTER).setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(3).setCustomClientFactory(NightmarionneEntity::new)

					.sized(0.6f, 1f));
	public static final RegistryObject<EntityType<NightmareMangleEntity>> NIGHTMARE_MANGLE = register("nightmare_mangle",
			EntityType.Builder.<NightmareMangleEntity>of(NightmareMangleEntity::new, MobCategory.MONSTER).setShouldReceiveVelocityUpdates(true).setTrackingRange(96).setUpdateInterval(3).setCustomClientFactory(NightmareMangleEntity::new)

					.sized(0.6f, 0.85f));
	public static final RegistryObject<EntityType<NightmareBbEntity>> NIGHTMARE_BB = register("nightmare_bb",
			EntityType.Builder.<NightmareBbEntity>of(NightmareBbEntity::new, MobCategory.MONSTER).setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(3).setCustomClientFactory(NightmareBbEntity::new)

					.sized(0.6f, 0.85f));
	public static final RegistryObject<EntityType<NightmareBbDayEntity>> NIGHTMARE_BB_DAY = register("nightmare_bb_day",
			EntityType.Builder.<NightmareBbDayEntity>of(NightmareBbDayEntity::new, MobCategory.MONSTER).setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(3).setCustomClientFactory(NightmareBbDayEntity::new)

					.sized(0.6f, 0.85f));
	public static final RegistryObject<EntityType<FredbearSuitEntity>> FREDBEAR_SUIT = register("fredbear_suit",
			EntityType.Builder.<FredbearSuitEntity>of(FredbearSuitEntity::new, MobCategory.MONSTER).setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(3).setCustomClientFactory(FredbearSuitEntity::new)

					.sized(0.6f, 1.5f));
	public static final RegistryObject<EntityType<FredbearSuitHeadlessEntity>> FREDBEAR_SUIT_HEADLESS = register("fredbear_suit_headless",
			EntityType.Builder.<FredbearSuitHeadlessEntity>of(FredbearSuitHeadlessEntity::new, MobCategory.MONSTER).setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(3)
					.setCustomClientFactory(FredbearSuitHeadlessEntity::new)

					.sized(0.6f, 1.5f));
	public static final RegistryObject<EntityType<FuntimeFreddyEntity>> FUNTIME_FREDDY = register("funtime_freddy",
			EntityType.Builder.<FuntimeFreddyEntity>of(FuntimeFreddyEntity::new, MobCategory.MONSTER).setShouldReceiveVelocityUpdates(true).setTrackingRange(96).setUpdateInterval(3).setCustomClientFactory(FuntimeFreddyEntity::new)

					.sized(0.6f, 1.8f));
	public static final RegistryObject<EntityType<FuntimeFreddyDayEntity>> FUNTIME_FREDDY_DAY = register("funtime_freddy_day",
			EntityType.Builder.<FuntimeFreddyDayEntity>of(FuntimeFreddyDayEntity::new, MobCategory.MONSTER).setShouldReceiveVelocityUpdates(true).setTrackingRange(96).setUpdateInterval(3).setCustomClientFactory(FuntimeFreddyDayEntity::new)

					.sized(0.6f, 1.8f));
	public static final RegistryObject<EntityType<BonbonEntity>> BONBON = register("bonbon",
			EntityType.Builder.<BonbonEntity>of(BonbonEntity::new, MobCategory.MONSTER).setShouldReceiveVelocityUpdates(true).setTrackingRange(96).setUpdateInterval(3).setCustomClientFactory(BonbonEntity::new)

					.sized(0.75f, 0.5f));
	public static final RegistryObject<EntityType<FuntimeFoxyEntity>> FUNTIME_FOXY = register("funtime_foxy",
			EntityType.Builder.<FuntimeFoxyEntity>of(FuntimeFoxyEntity::new, MobCategory.MONSTER).setShouldReceiveVelocityUpdates(true).setTrackingRange(96).setUpdateInterval(3).setCustomClientFactory(FuntimeFoxyEntity::new)

					.sized(0.6f, 1.4375f));
	public static final RegistryObject<EntityType<FuntimeFoxyDayEntity>> FUNTIME_FOXY_DAY = register("funtime_foxy_day",
			EntityType.Builder.<FuntimeFoxyDayEntity>of(FuntimeFoxyDayEntity::new, MobCategory.MONSTER).setShouldReceiveVelocityUpdates(true).setTrackingRange(96).setUpdateInterval(3).setCustomClientFactory(FuntimeFoxyDayEntity::new)

					.sized(0.6f, 1.4375f));
	public static final RegistryObject<EntityType<EnnardEntity>> ENNARD = register("ennard",
			EntityType.Builder.<EnnardEntity>of(EnnardEntity::new, MobCategory.MONSTER).setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(3).setCustomClientFactory(EnnardEntity::new)

					.sized(0.6f, 0.875f));
	public static final RegistryObject<EntityType<MinireenaEntity>> MINIREENA = register("minireena",
			EntityType.Builder.<MinireenaEntity>of(MinireenaEntity::new, MobCategory.MONSTER).setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(3).setCustomClientFactory(MinireenaEntity::new)

					.sized(0.6f, 0.875f));
	public static final RegistryObject<EntityType<MinireenaDayEntity>> MINIREENA_DAY = register("minireena_day",
			EntityType.Builder.<MinireenaDayEntity>of(MinireenaDayEntity::new, MobCategory.MONSTER).setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(3).setCustomClientFactory(MinireenaDayEntity::new)

					.sized(0.6f, 0.875f));
	public static final RegistryObject<EntityType<Minireena2Entity>> MINIREENA_2 = register("minireena_2",
			EntityType.Builder.<Minireena2Entity>of(Minireena2Entity::new, MobCategory.MONSTER).setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(3).setCustomClientFactory(Minireena2Entity::new)

					.sized(0.6f, 0.875f));
	public static final RegistryObject<EntityType<Minireena2DayEntity>> MINIREENA_2_DAY = register("minireena_2_day",
			EntityType.Builder.<Minireena2DayEntity>of(Minireena2DayEntity::new, MobCategory.MONSTER).setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(3).setCustomClientFactory(Minireena2DayEntity::new)

					.sized(0.6f, 0.875f));
	public static final RegistryObject<EntityType<BidybabEntity>> BIDYBAB = register("bidybab",
			EntityType.Builder.<BidybabEntity>of(BidybabEntity::new, MobCategory.MONSTER).setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(3).setCustomClientFactory(BidybabEntity::new)

					.sized(0.6f, 0.85f));
	public static final RegistryObject<EntityType<BidybabDayEntity>> BIDYBAB_DAY = register("bidybab_day",
			EntityType.Builder.<BidybabDayEntity>of(BidybabDayEntity::new, MobCategory.MONSTER).setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(3).setCustomClientFactory(BidybabDayEntity::new)

					.sized(0.6f, 1.8f));
	public static final RegistryObject<EntityType<ElectrobabEntity>> ELECTROBAB = register("electrobab",
			EntityType.Builder.<ElectrobabEntity>of(ElectrobabEntity::new, MobCategory.MONSTER).setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(3).setCustomClientFactory(ElectrobabEntity::new)

					.sized(0.6f, 0.85f));
	public static final RegistryObject<EntityType<ElectrobabDayEntity>> ELECTROBAB_DAY = register("electrobab_day",
			EntityType.Builder.<ElectrobabDayEntity>of(ElectrobabDayEntity::new, MobCategory.MONSTER).setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(3).setCustomClientFactory(ElectrobabDayEntity::new)

					.sized(0.6f, 1.8f));
	public static final RegistryObject<EntityType<BalloraEntity>> BALLORA = register("ballora",
			EntityType.Builder.<BalloraEntity>of(BalloraEntity::new, MobCategory.MONSTER).setShouldReceiveVelocityUpdates(true).setTrackingRange(96).setUpdateInterval(3).setCustomClientFactory(BalloraEntity::new)

					.sized(0.6f, 1.4375f));
	public static final RegistryObject<EntityType<BalloraDayEntity>> BALLORA_DAY = register("ballora_day",
			EntityType.Builder.<BalloraDayEntity>of(BalloraDayEntity::new, MobCategory.MONSTER).setShouldReceiveVelocityUpdates(true).setTrackingRange(96).setUpdateInterval(3).setCustomClientFactory(BalloraDayEntity::new)

					.sized(0.6f, 1.4375f));
	public static final RegistryObject<EntityType<BonnetEntity>> BONNET = register("bonnet",
			EntityType.Builder.<BonnetEntity>of(BonnetEntity::new, MobCategory.MONSTER).setShouldReceiveVelocityUpdates(true).setTrackingRange(96).setUpdateInterval(3).setCustomClientFactory(BonnetEntity::new)

					.sized(0.75f, 0.5f));
	public static final RegistryObject<EntityType<BonnetDayEntity>> BONNET_DAY = register("bonnet_day",
			EntityType.Builder.<BonnetDayEntity>of(BonnetDayEntity::new, MobCategory.MONSTER).setShouldReceiveVelocityUpdates(true).setTrackingRange(96).setUpdateInterval(3).setCustomClientFactory(BonnetDayEntity::new)

					.sized(0.75f, 0.5f));
	public static final RegistryObject<EntityType<CircusBabyEntity>> CIRCUS_BABY = register("circus_baby",
			EntityType.Builder.<CircusBabyEntity>of(CircusBabyEntity::new, MobCategory.MONSTER).setShouldReceiveVelocityUpdates(true).setTrackingRange(96).setUpdateInterval(3).setCustomClientFactory(CircusBabyEntity::new)

					.sized(0.6f, 1.8f));
	public static final RegistryObject<EntityType<CircusBabyDayEntity>> CIRCUS_BABY_DAY = register("circus_baby_day",
			EntityType.Builder.<CircusBabyDayEntity>of(CircusBabyDayEntity::new, MobCategory.MONSTER).setShouldReceiveVelocityUpdates(true).setTrackingRange(96).setUpdateInterval(3).setCustomClientFactory(CircusBabyDayEntity::new)

					.sized(0.6f, 1.8f));
	public static final RegistryObject<EntityType<LolbitEntity>> LOLBIT = register("lolbit",
			EntityType.Builder.<LolbitEntity>of(LolbitEntity::new, MobCategory.MONSTER).setShouldReceiveVelocityUpdates(true).setTrackingRange(96).setUpdateInterval(3).setCustomClientFactory(LolbitEntity::new)

					.sized(0.6f, 1.4375f));
	public static final RegistryObject<EntityType<RetroFreddyEntity>> RETRO_FREDDY = register("retro_freddy",
			EntityType.Builder.<RetroFreddyEntity>of(RetroFreddyEntity::new, MobCategory.MONSTER).setShouldReceiveVelocityUpdates(true).setTrackingRange(96).setUpdateInterval(3).setCustomClientFactory(RetroFreddyEntity::new)

					.sized(0.6f, 1.8f));
	public static final RegistryObject<EntityType<RetroFreddyDayEntity>> RETRO_FREDDY_DAY = register("retro_freddy_day",
			EntityType.Builder.<RetroFreddyDayEntity>of(RetroFreddyDayEntity::new, MobCategory.MONSTER).setShouldReceiveVelocityUpdates(true).setTrackingRange(96).setUpdateInterval(3).setCustomClientFactory(RetroFreddyDayEntity::new)

					.sized(0.6f, 1.8f));
	public static final RegistryObject<EntityType<RetroBonnieEntity>> RETRO_BONNIE = register("retro_bonnie",
			EntityType.Builder.<RetroBonnieEntity>of(RetroBonnieEntity::new, MobCategory.MONSTER).setShouldReceiveVelocityUpdates(true).setTrackingRange(96).setUpdateInterval(3).setCustomClientFactory(RetroBonnieEntity::new)

					.sized(0.6f, 0.85f));
	public static final RegistryObject<EntityType<RetroBonnieDayEntity>> RETRO_BONNIE_DAY = register("retro_bonnie_day",
			EntityType.Builder.<RetroBonnieDayEntity>of(RetroBonnieDayEntity::new, MobCategory.MONSTER).setShouldReceiveVelocityUpdates(true).setTrackingRange(96).setUpdateInterval(3).setCustomClientFactory(RetroBonnieDayEntity::new)

					.sized(0.6f, 0.85f));
	public static final RegistryObject<EntityType<RetroChicaEntity>> RETRO_CHICA = register("retro_chica",
			EntityType.Builder.<RetroChicaEntity>of(RetroChicaEntity::new, MobCategory.MONSTER).setShouldReceiveVelocityUpdates(true).setTrackingRange(96).setUpdateInterval(3).setCustomClientFactory(RetroChicaEntity::new)

					.sized(0.6f, 0.85f));
	public static final RegistryObject<EntityType<RetroChicaDayEntity>> RETRO_CHICA_DAY = register("retro_chica_day",
			EntityType.Builder.<RetroChicaDayEntity>of(RetroChicaDayEntity::new, MobCategory.MONSTER).setShouldReceiveVelocityUpdates(true).setTrackingRange(96).setUpdateInterval(3).setCustomClientFactory(RetroChicaDayEntity::new)

					.sized(0.6f, 0.85f));
	public static final RegistryObject<EntityType<RetroFoxyEntity>> RETRO_FOXY = register("retro_foxy",
			EntityType.Builder.<RetroFoxyEntity>of(RetroFoxyEntity::new, MobCategory.MONSTER).setShouldReceiveVelocityUpdates(true).setTrackingRange(96).setUpdateInterval(3).setCustomClientFactory(RetroFoxyEntity::new)

					.sized(0.6f, 1.4375f));
	public static final RegistryObject<EntityType<RetroFoxyDayEntity>> RETRO_FOXY_DAY = register("retro_foxy_day",
			EntityType.Builder.<RetroFoxyDayEntity>of(RetroFoxyDayEntity::new, MobCategory.MONSTER).setShouldReceiveVelocityUpdates(true).setTrackingRange(96).setUpdateInterval(3).setCustomClientFactory(RetroFoxyDayEntity::new)

					.sized(0.6f, 1.4375f));
	public static final RegistryObject<EntityType<YenndoEntity>> YENNDO = register("yenndo",
			EntityType.Builder.<YenndoEntity>of(YenndoEntity::new, MobCategory.MONSTER).setShouldReceiveVelocityUpdates(true).setTrackingRange(96).setUpdateInterval(3).setCustomClientFactory(YenndoEntity::new)

					.sized(0.6f, 1.8f));
	public static final RegistryObject<EntityType<BlobFuntimeFreddyEntity>> BLOB_FUNTIME_FREDDY = register("blob_funtime_freddy",
			EntityType.Builder.<BlobFuntimeFreddyEntity>of(BlobFuntimeFreddyEntity::new, MobCategory.MONSTER).setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(3).setCustomClientFactory(BlobFuntimeFreddyEntity::new)

					.sized(0.6f, 0.1875f));
	public static final RegistryObject<EntityType<BlobCircusBabyEntity>> BLOB_CIRCUS_BABY = register("blob_circus_baby",
			EntityType.Builder.<BlobCircusBabyEntity>of(BlobCircusBabyEntity::new, MobCategory.MONSTER).setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(3).setCustomClientFactory(BlobCircusBabyEntity::new)

					.sized(0.6f, 0.1875f));
	public static final RegistryObject<EntityType<BlobFuntimeFoxyEntity>> BLOB_FUNTIME_FOXY = register("blob_funtime_foxy",
			EntityType.Builder.<BlobFuntimeFoxyEntity>of(BlobFuntimeFoxyEntity::new, MobCategory.MONSTER).setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(3).setCustomClientFactory(BlobFuntimeFoxyEntity::new)

					.sized(0.6f, 0.1875f));
	public static final RegistryObject<EntityType<BlobBalloraEntity>> BLOB_BALLORA = register("blob_ballora",
			EntityType.Builder.<BlobBalloraEntity>of(BlobBalloraEntity::new, MobCategory.MONSTER).setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(3).setCustomClientFactory(BlobBalloraEntity::new)

					.sized(0.6f, 0.1875f));
	public static final RegistryObject<EntityType<MrHugsEntity>> MR_HUGS = register("mr_hugs",
			EntityType.Builder.<MrHugsEntity>of(MrHugsEntity::new, MobCategory.MONSTER).setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(3).setCustomClientFactory(MrHugsEntity::new)

					.sized(0.6f, 1.8f));
	public static final RegistryObject<EntityType<MrHugsDayEntity>> MR_HUGS_DAY = register("mr_hugs_day",
			EntityType.Builder.<MrHugsDayEntity>of(MrHugsDayEntity::new, MobCategory.MONSTER).setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(3).setCustomClientFactory(MrHugsDayEntity::new)

					.sized(0.6f, 1.8f));
	public static final RegistryObject<EntityType<BucketBobEntity>> BUCKET_BOB = register("bucket_bob",
			EntityType.Builder.<BucketBobEntity>of(BucketBobEntity::new, MobCategory.MONSTER).setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(3).setCustomClientFactory(BucketBobEntity::new)

					.sized(0.6f, 1.8f));
	public static final RegistryObject<EntityType<BucketBobDayEntity>> BUCKET_BOB_DAY = register("bucket_bob_day",
			EntityType.Builder.<BucketBobDayEntity>of(BucketBobDayEntity::new, MobCategory.MONSTER).setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(3).setCustomClientFactory(BucketBobDayEntity::new)

					.sized(0.6f, 1.8f));
	public static final RegistryObject<EntityType<MrCanDoEntity>> MR_CAN_DO = register("mr_can_do",
			EntityType.Builder.<MrCanDoEntity>of(MrCanDoEntity::new, MobCategory.MONSTER).setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(3).setCustomClientFactory(MrCanDoEntity::new)

					.sized(0.6f, 1.8f));
	public static final RegistryObject<EntityType<MrCanDoDayEntity>> MR_CAN_DO_DAY = register("mr_can_do_day",
			EntityType.Builder.<MrCanDoDayEntity>of(MrCanDoDayEntity::new, MobCategory.MONSTER).setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(3).setCustomClientFactory(MrCanDoDayEntity::new)

					.sized(0.6f, 1.8f));
	public static final RegistryObject<EntityType<NumberOneCrateEntity>> NUMBER_ONE_CRATE = register("number_one_crate",
			EntityType.Builder.<NumberOneCrateEntity>of(NumberOneCrateEntity::new, MobCategory.MONSTER).setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(3).setCustomClientFactory(NumberOneCrateEntity::new)

					.sized(0.6f, 1.8f));
	public static final RegistryObject<EntityType<NumberOneCrateDayEntity>> NUMBER_ONE_CRATE_DAY = register("number_one_crate_day",
			EntityType.Builder.<NumberOneCrateDayEntity>of(NumberOneCrateDayEntity::new, MobCategory.MONSTER).setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(3).setCustomClientFactory(NumberOneCrateDayEntity::new)

					.sized(0.6f, 1.8f));
	public static final RegistryObject<EntityType<PanStanEntity>> PAN_STAN = register("pan_stan",
			EntityType.Builder.<PanStanEntity>of(PanStanEntity::new, MobCategory.MONSTER).setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(3).setCustomClientFactory(PanStanEntity::new)

					.sized(0.6f, 1.8f));
	public static final RegistryObject<EntityType<PanStanDayEntity>> PAN_STAN_DAY = register("pan_stan_day",
			EntityType.Builder.<PanStanDayEntity>of(PanStanDayEntity::new, MobCategory.MONSTER).setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(3).setCustomClientFactory(PanStanDayEntity::new)

					.sized(0.6f, 1.8f));
	public static final RegistryObject<EntityType<MoltenFreddyEntity>> MOLTEN_FREDDY = register("molten_freddy",
			EntityType.Builder.<MoltenFreddyEntity>of(MoltenFreddyEntity::new, MobCategory.MONSTER).setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(3).setCustomClientFactory(MoltenFreddyEntity::new)

					.sized(0.85f, 0.85f));
	public static final RegistryObject<EntityType<HelpyEntity>> HELPY = register("helpy",
			EntityType.Builder.<HelpyEntity>of(HelpyEntity::new, MobCategory.MONSTER).setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(3).setCustomClientFactory(HelpyEntity::new)

					.sized(0.6f, 0.85f));
	public static final RegistryObject<EntityType<CarPurpleChevroletImpalaEntity>> CAR_PURPLE_CHEVROLET_IMPALA = register("car_purple_chevrolet_impala",
			EntityType.Builder.<CarPurpleChevroletImpalaEntity>of(CarPurpleChevroletImpalaEntity::new, MobCategory.MONSTER).setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(3)
					.setCustomClientFactory(CarPurpleChevroletImpalaEntity::new)

					.sized(1.03125f, 2f));
	public static final RegistryObject<EntityType<NeddbearEntity>> NEDDBEAR = register("neddbear",
			EntityType.Builder.<NeddbearEntity>of(NeddbearEntity::new, MobCategory.MONSTER).setShouldReceiveVelocityUpdates(true).setTrackingRange(96).setUpdateInterval(3).setCustomClientFactory(NeddbearEntity::new)

					.sized(0.6f, 0.875f));
	public static final RegistryObject<EntityType<NeddBearDayEntity>> NEDDBEAR_DAY = register("neddbear_day",
			EntityType.Builder.<NeddBearDayEntity>of(NeddBearDayEntity::new, MobCategory.MONSTER).setShouldReceiveVelocityUpdates(true).setTrackingRange(96).setUpdateInterval(3).setCustomClientFactory(NeddBearDayEntity::new)

					.sized(0.6f, 1.8f));
	public static final RegistryObject<EntityType<HappyFrogEntity>> HAPPY_FROG = register("happy_frog",
			EntityType.Builder.<HappyFrogEntity>of(HappyFrogEntity::new, MobCategory.MONSTER).setShouldReceiveVelocityUpdates(true).setTrackingRange(96).setUpdateInterval(3).setCustomClientFactory(HappyFrogEntity::new)

					.sized(0.6f, 0.5f));
	public static final RegistryObject<EntityType<HappyFrogDayEntity>> HAPPY_FROG_DAY = register("happy_frog_day",
			EntityType.Builder.<HappyFrogDayEntity>of(HappyFrogDayEntity::new, MobCategory.MONSTER).setShouldReceiveVelocityUpdates(true).setTrackingRange(96).setUpdateInterval(3).setCustomClientFactory(HappyFrogDayEntity::new)

					.sized(0.6f, 0.5f));
	public static final RegistryObject<EntityType<PigpatchEntity>> PIGPATCH = register("pigpatch",
			EntityType.Builder.<PigpatchEntity>of(PigpatchEntity::new, MobCategory.MONSTER).setShouldReceiveVelocityUpdates(true).setTrackingRange(96).setUpdateInterval(3).setCustomClientFactory(PigpatchEntity::new)

					.sized(0.6f, 0.875f));
	public static final RegistryObject<EntityType<PigpatchDayEntity>> PIGPATCH_DAY = register("pigpatch_day",
			EntityType.Builder.<PigpatchDayEntity>of(PigpatchDayEntity::new, MobCategory.MONSTER).setShouldReceiveVelocityUpdates(true).setTrackingRange(96).setUpdateInterval(3).setCustomClientFactory(PigpatchDayEntity::new)

					.sized(0.6f, 0.875f));
	public static final RegistryObject<EntityType<MrHippoEntity>> MR_HIPPO = register("mr_hippo",
			EntityType.Builder.<MrHippoEntity>of(MrHippoEntity::new, MobCategory.MONSTER).setShouldReceiveVelocityUpdates(true).setTrackingRange(96).setUpdateInterval(3).setCustomClientFactory(MrHippoEntity::new)

					.sized(0.6f, 0.875f));
	public static final RegistryObject<EntityType<MrHippoDayEntity>> MR_HIPPO_DAY = register("mr_hippo_day",
			EntityType.Builder.<MrHippoDayEntity>of(MrHippoDayEntity::new, MobCategory.MONSTER).setShouldReceiveVelocityUpdates(true).setTrackingRange(96).setUpdateInterval(3).setCustomClientFactory(MrHippoDayEntity::new)

					.sized(0.6f, 0.875f));
	public static final RegistryObject<EntityType<ScraptrapEntity>> SCRAPTRAP = register("scraptrap",
			EntityType.Builder.<ScraptrapEntity>of(ScraptrapEntity::new, MobCategory.MONSTER).setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(3).setCustomClientFactory(ScraptrapEntity::new)

					.sized(0.6f, 0.85f));
	public static final RegistryObject<EntityType<ChildEntity>> CHILD = register("child",
			EntityType.Builder.<ChildEntity>of(ChildEntity::new, MobCategory.MONSTER).setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(3).setCustomClientFactory(ChildEntity::new)

					.sized(0.6f, 1.25f));
	public static final RegistryObject<EntityType<CarDodgeRam1982Entity>> CAR_DODGE_RAM_1982 = register("car_dodge_ram_1982",
			EntityType.Builder.<CarDodgeRam1982Entity>of(CarDodgeRam1982Entity::new, MobCategory.MONSTER).setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(3).setCustomClientFactory(CarDodgeRam1982Entity::new)

					.sized(1.03125f, 2f));
	public static final RegistryObject<EntityType<CarSeatEntity>> CAR_SEAT = register("car_seat",
			EntityType.Builder.<CarSeatEntity>of(CarSeatEntity::new, MobCategory.MONSTER).setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(3).setCustomClientFactory(CarSeatEntity::new).fireImmune().sized(0.5f, 0.75f));
	public static final RegistryObject<EntityType<RockstarFreddyEntity>> ROCKSTAR_FREDDY = register("rockstar_freddy",
			EntityType.Builder.<RockstarFreddyEntity>of(RockstarFreddyEntity::new, MobCategory.MONSTER).setShouldReceiveVelocityUpdates(true).setTrackingRange(96).setUpdateInterval(3).setCustomClientFactory(RockstarFreddyEntity::new)

					.sized(0.6f, 1.8f));
	public static final RegistryObject<EntityType<RockstarFreddyDayEntity>> ROCKSTAR_FREDDY_DAY = register("rockstar_freddy_day",
			EntityType.Builder.<RockstarFreddyDayEntity>of(RockstarFreddyDayEntity::new, MobCategory.MONSTER).setShouldReceiveVelocityUpdates(true).setTrackingRange(96).setUpdateInterval(3).setCustomClientFactory(RockstarFreddyDayEntity::new)

					.sized(0.6f, 1.8f));
	public static final RegistryObject<EntityType<RockstarBonnieEntity>> ROCKSTAR_BONNIE = register("rockstar_bonnie",
			EntityType.Builder.<RockstarBonnieEntity>of(RockstarBonnieEntity::new, MobCategory.MONSTER).setShouldReceiveVelocityUpdates(true).setTrackingRange(96).setUpdateInterval(3).setCustomClientFactory(RockstarBonnieEntity::new)

					.sized(0.6f, 1.125f));
	public static final RegistryObject<EntityType<RockstarBonnieDayEntity>> ROCKSTAR_BONNIE_DAY = register("rockstar_bonnie_day",
			EntityType.Builder.<RockstarBonnieDayEntity>of(RockstarBonnieDayEntity::new, MobCategory.MONSTER).setShouldReceiveVelocityUpdates(true).setTrackingRange(96).setUpdateInterval(3).setCustomClientFactory(RockstarBonnieDayEntity::new)

					.sized(0.6f, 1.125f));
	public static final RegistryObject<EntityType<RockstarChicaEntity>> ROCKSTAR_CHICA = register("rockstar_chica",
			EntityType.Builder.<RockstarChicaEntity>of(RockstarChicaEntity::new, MobCategory.MONSTER).setShouldReceiveVelocityUpdates(true).setTrackingRange(96).setUpdateInterval(3).setCustomClientFactory(RockstarChicaEntity::new)

					.sized(0.6f, 0.9375f));
	public static final RegistryObject<EntityType<RockstarChicaDayEntity>> ROCKSTAR_CHICA_DAY = register("rockstar_chica_day",
			EntityType.Builder.<RockstarChicaDayEntity>of(RockstarChicaDayEntity::new, MobCategory.MONSTER).setShouldReceiveVelocityUpdates(true).setTrackingRange(96).setUpdateInterval(3).setCustomClientFactory(RockstarChicaDayEntity::new)

					.sized(0.6f, 0.9375f));
	public static final RegistryObject<EntityType<RockstarFoxyEntity>> ROCKSTAR_FOXY = register("rockstar_foxy",
			EntityType.Builder.<RockstarFoxyEntity>of(RockstarFoxyEntity::new, MobCategory.MONSTER).setShouldReceiveVelocityUpdates(true).setTrackingRange(96).setUpdateInterval(3).setCustomClientFactory(RockstarFoxyEntity::new)

					.sized(0.6f, 1.4375f));
	public static final RegistryObject<EntityType<RockstarFoxyDayEntity>> ROCKSTAR_FOXY_DAY = register("rockstar_foxy_day",
			EntityType.Builder.<RockstarFoxyDayEntity>of(RockstarFoxyDayEntity::new, MobCategory.MONSTER).setShouldReceiveVelocityUpdates(true).setTrackingRange(96).setUpdateInterval(3).setCustomClientFactory(RockstarFoxyDayEntity::new)

					.sized(0.6f, 1.4375f));
	public static final RegistryObject<EntityType<ScrapBabyEntity>> SCRAP_BABY = register("scrap_baby",
			EntityType.Builder.<ScrapBabyEntity>of(ScrapBabyEntity::new, MobCategory.MONSTER).setShouldReceiveVelocityUpdates(true).setTrackingRange(96).setUpdateInterval(3).setCustomClientFactory(ScrapBabyEntity::new)

					.sized(0.6f, 0.85f));
	public static final RegistryObject<EntityType<OrvilleElephantEntity>> ORVILLE_ELEPHANT = register("orville_elephant",
			EntityType.Builder.<OrvilleElephantEntity>of(OrvilleElephantEntity::new, MobCategory.MONSTER).setShouldReceiveVelocityUpdates(true).setTrackingRange(96).setUpdateInterval(3).setCustomClientFactory(OrvilleElephantEntity::new)

					.sized(0.875f, 0.8f));
	public static final RegistryObject<EntityType<OrvilleElephantDayEntity>> ORVILLE_ELEPHANT_DAY = register("orville_elephant_day",
			EntityType.Builder.<OrvilleElephantDayEntity>of(OrvilleElephantDayEntity::new, MobCategory.MONSTER).setShouldReceiveVelocityUpdates(true).setTrackingRange(96).setUpdateInterval(3).setCustomClientFactory(OrvilleElephantDayEntity::new)

					.sized(0.875f, 0.875f));
	public static final RegistryObject<EntityType<LeftyEntity>> LEFTY = register("lefty",
			EntityType.Builder.<LeftyEntity>of(LeftyEntity::new, MobCategory.MONSTER).setShouldReceiveVelocityUpdates(true).setTrackingRange(96).setUpdateInterval(3).setCustomClientFactory(LeftyEntity::new)

					.sized(0.6f, 0.85f));
	public static final RegistryObject<EntityType<LeftyDayEntity>> LEFTY_DAY = register("lefty_day",
			EntityType.Builder.<LeftyDayEntity>of(LeftyDayEntity::new, MobCategory.MONSTER).setShouldReceiveVelocityUpdates(true).setTrackingRange(96).setUpdateInterval(3).setCustomClientFactory(LeftyDayEntity::new)

					.sized(0.6f, 0.85f));
	public static final RegistryObject<EntityType<IndigoEntity>> INDIGO = register("indigo",
			EntityType.Builder.<IndigoEntity>of(IndigoEntity::new, MobCategory.MONSTER).setShouldReceiveVelocityUpdates(true).setTrackingRange(96).setUpdateInterval(3).setCustomClientFactory(IndigoEntity::new)

					.sized(0.6f, 1.4375f));
	public static final RegistryObject<EntityType<IndigoDayEntity>> INDIGO_DAY = register("indigo_day",
			EntityType.Builder.<IndigoDayEntity>of(IndigoDayEntity::new, MobCategory.MONSTER).setShouldReceiveVelocityUpdates(true).setTrackingRange(96).setUpdateInterval(3).setCustomClientFactory(IndigoDayEntity::new)

					.sized(0.6f, 1.4375f));
	public static final RegistryObject<EntityType<BarryPolarEntity>> BARRY_POLAR = register("barry_polar",
			EntityType.Builder.<BarryPolarEntity>of(BarryPolarEntity::new, MobCategory.MONSTER).setShouldReceiveVelocityUpdates(true).setTrackingRange(96).setUpdateInterval(3).setCustomClientFactory(BarryPolarEntity::new)

					.sized(0.6f, 1.8f));
	public static final RegistryObject<EntityType<BarryPolarDayEntity>> BARRY_POLAR_DAY = register("barry_polar_day",
			EntityType.Builder.<BarryPolarDayEntity>of(BarryPolarDayEntity::new, MobCategory.MONSTER).setShouldReceiveVelocityUpdates(true).setTrackingRange(96).setUpdateInterval(3).setCustomClientFactory(BarryPolarDayEntity::new)

					.sized(0.6f, 1.8f));
	public static final RegistryObject<EntityType<GhostChildEntity>> GHOST_CHILD = register("ghost_child",
			EntityType.Builder.<GhostChildEntity>of(GhostChildEntity::new, MobCategory.MONSTER).setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(3).setCustomClientFactory(GhostChildEntity::new)

					.sized(0.6f, 1.25f));
	public static final RegistryObject<EntityType<FuntimeChicaEntity>> FUNTIME_CHICA = register("funtime_chica",
			EntityType.Builder.<FuntimeChicaEntity>of(FuntimeChicaEntity::new, MobCategory.MONSTER).setShouldReceiveVelocityUpdates(true).setTrackingRange(96).setUpdateInterval(3).setCustomClientFactory(FuntimeChicaEntity::new)

					.sized(0.6f, 0.9375f));
	public static final RegistryObject<EntityType<FuntimeChicaDayEntity>> FUNTIME_CHICA_DAY = register("funtime_chica_day",
			EntityType.Builder.<FuntimeChicaDayEntity>of(FuntimeChicaDayEntity::new, MobCategory.MONSTER).setShouldReceiveVelocityUpdates(true).setTrackingRange(96).setUpdateInterval(3).setCustomClientFactory(FuntimeChicaDayEntity::new)

					.sized(0.6f, 0.9375f));
	public static final RegistryObject<EntityType<MusicManEntity>> MUSIC_MAN = register("music_man",
			EntityType.Builder.<MusicManEntity>of(MusicManEntity::new, MobCategory.MONSTER).setShouldReceiveVelocityUpdates(true).setTrackingRange(96).setUpdateInterval(3).setCustomClientFactory(MusicManEntity::new)

					.sized(0.6f, 0.9375f));
	public static final RegistryObject<EntityType<MusicManDayEntity>> MUSIC_MAN_DAY = register("music_man_day",
			EntityType.Builder.<MusicManDayEntity>of(MusicManDayEntity::new, MobCategory.MONSTER).setShouldReceiveVelocityUpdates(true).setTrackingRange(96).setUpdateInterval(3).setCustomClientFactory(MusicManDayEntity::new)

					.sized(0.6f, 0.9375f));
	public static final RegistryObject<EntityType<ElChipEntity>> EL_CHIP = register("el_chip",
			EntityType.Builder.<ElChipEntity>of(ElChipEntity::new, MobCategory.MONSTER).setShouldReceiveVelocityUpdates(true).setTrackingRange(96).setUpdateInterval(3).setCustomClientFactory(ElChipEntity::new)

					.sized(0.6f, 1.125f));
	public static final RegistryObject<EntityType<ElChipDayEntity>> EL_CHIP_DAY = register("el_chip_day",
			EntityType.Builder.<ElChipDayEntity>of(ElChipDayEntity::new, MobCategory.MONSTER).setShouldReceiveVelocityUpdates(true).setTrackingRange(96).setUpdateInterval(3).setCustomClientFactory(ElChipDayEntity::new)

					.sized(0.6f, 1.125f));
	public static final RegistryObject<EntityType<PurpleGuyEntity>> PURPLE_GUY = register("purple_guy",
			EntityType.Builder.<PurpleGuyEntity>of(PurpleGuyEntity::new, MobCategory.MONSTER).setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(3).setCustomClientFactory(PurpleGuyEntity::new)

					.sized(0.6f, 1.8f));
	public static final RegistryObject<EntityType<CarFazvanEntity>> CAR_FAZVAN = register("car_fazvan",
			EntityType.Builder.<CarFazvanEntity>of(CarFazvanEntity::new, MobCategory.MONSTER).setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(3).setCustomClientFactory(CarFazvanEntity::new)

					.sized(1.03125f, 2.75f));
	public static final RegistryObject<EntityType<CarStationWagonEntity>> CAR_STATION_WAGON = register("car_station_wagon",
			EntityType.Builder.<CarStationWagonEntity>of(CarStationWagonEntity::new, MobCategory.MONSTER).setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(3).setCustomClientFactory(CarStationWagonEntity::new)

					.sized(1.03125f, 2f));
	public static final RegistryObject<EntityType<OfficeChairRedEntityEntity>> OFFICE_CHAIR_RED_ENTITY = register("office_chair_red_entity",
			EntityType.Builder.<OfficeChairRedEntityEntity>of(OfficeChairRedEntityEntity::new, MobCategory.MONSTER).setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(3)
					.setCustomClientFactory(OfficeChairRedEntityEntity::new)

					.sized(0.6f, 0.625f));
	public static final RegistryObject<EntityType<OfficeChairBlackEntityEntity>> OFFICE_CHAIR_BLACK_ENTITY = register("office_chair_black_entity",
			EntityType.Builder.<OfficeChairBlackEntityEntity>of(OfficeChairBlackEntityEntity::new, MobCategory.MONSTER).setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(3)
					.setCustomClientFactory(OfficeChairBlackEntityEntity::new)

					.sized(0.6f, 0.625f));
	public static final RegistryObject<EntityType<RustyEntity>> RUSTY = register("rusty",
			EntityType.Builder.<RustyEntity>of(RustyEntity::new, MobCategory.MONSTER).setShouldReceiveVelocityUpdates(true).setTrackingRange(96).setUpdateInterval(3).setCustomClientFactory(RustyEntity::new)

					.sized(0.6f, 1.8f));
	public static final RegistryObject<EntityType<RustyDayEntity>> RUSTY_DAY = register("rusty_day",
			EntityType.Builder.<RustyDayEntity>of(RustyDayEntity::new, MobCategory.MONSTER).setShouldReceiveVelocityUpdates(true).setTrackingRange(96).setUpdateInterval(3).setCustomClientFactory(RustyDayEntity::new)

					.sized(0.6f, 1.8f));
	public static final RegistryObject<EntityType<DrTeethEntity>> DR_TEETH = register("dr_teeth",
			EntityType.Builder.<DrTeethEntity>of(DrTeethEntity::new, MobCategory.MONSTER).setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(3).setCustomClientFactory(DrTeethEntity::new)

					.sized(0.6f, 0.85f));
	public static final RegistryObject<EntityType<DrTeethDayEntity>> DR_TEETH_DAY = register("dr_teeth_day",
			EntityType.Builder.<DrTeethDayEntity>of(DrTeethDayEntity::new, MobCategory.MONSTER).setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(3).setCustomClientFactory(DrTeethDayEntity::new)

					.sized(0.6f, 0.85f));
	public static final RegistryObject<EntityType<CarHarleyMotorcycleEntity>> CAR_HARLEY_MOTORCYCLE = register("car_harley_motorcycle",
			EntityType.Builder.<CarHarleyMotorcycleEntity>of(CarHarleyMotorcycleEntity::new, MobCategory.MONSTER).setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(3).setCustomClientFactory(CarHarleyMotorcycleEntity::new)

					.sized(1.03125f, 0.875f));
	public static final RegistryObject<EntityType<SparkyDogEntity>> SPARKY_DOG = register("sparky_dog",
			EntityType.Builder.<SparkyDogEntity>of(SparkyDogEntity::new, MobCategory.MONSTER).setShouldReceiveVelocityUpdates(true).setTrackingRange(96).setUpdateInterval(3).setCustomClientFactory(SparkyDogEntity::new)

					.sized(0.6f, 1.8f));
	public static final RegistryObject<EntityType<SparkyDogDayEntity>> SPARKY_DOG_DAY = register("sparky_dog_day",
			EntityType.Builder.<SparkyDogDayEntity>of(SparkyDogDayEntity::new, MobCategory.MONSTER).setShouldReceiveVelocityUpdates(true).setTrackingRange(96).setUpdateInterval(3).setCustomClientFactory(SparkyDogDayEntity::new)

					.sized(0.6f, 1.8f));
	public static final RegistryObject<EntityType<CarPoliceCruiserChevroletImpala1983Entity>> CAR_POLICE_CRUISER_CHEVROLET_IMPALA_1983 = register("car_police_cruiser_chevrolet_impala_1983",
			EntityType.Builder.<CarPoliceCruiserChevroletImpala1983Entity>of(CarPoliceCruiserChevroletImpala1983Entity::new, MobCategory.MONSTER).setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(3)
					.setCustomClientFactory(CarPoliceCruiserChevroletImpala1983Entity::new)

					.sized(1.03125f, 2f));
	public static final RegistryObject<EntityType<FuntimeDelilahEntity>> FUNTIME_DELILAH = register("funtime_delilah",
			EntityType.Builder.<FuntimeDelilahEntity>of(FuntimeDelilahEntity::new, MobCategory.MONSTER).setShouldReceiveVelocityUpdates(true).setTrackingRange(96).setUpdateInterval(3).setCustomClientFactory(FuntimeDelilahEntity::new)

					.sized(0.6f, 1.8f));
	public static final RegistryObject<EntityType<FuntimeDelilahDayEntity>> FUNTIME_DELILAH_DAY = register("funtime_delilah_day",
			EntityType.Builder.<FuntimeDelilahDayEntity>of(FuntimeDelilahDayEntity::new, MobCategory.MONSTER).setShouldReceiveVelocityUpdates(true).setTrackingRange(96).setUpdateInterval(3).setCustomClientFactory(FuntimeDelilahDayEntity::new)

					.sized(0.6f, 1.8f));
	public static final RegistryObject<EntityType<RaccoonEntity>> RACCOON = register("raccoon",
			EntityType.Builder.<RaccoonEntity>of(RaccoonEntity::new, MobCategory.CREATURE).setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(3).setCustomClientFactory(RaccoonEntity::new)

					.sized(0.6f, 0.6875f));
	public static final RegistryObject<EntityType<GusThePugEntity>> GUS_THE_PUG = register("gus_the_pug",
			EntityType.Builder.<GusThePugEntity>of(GusThePugEntity::new, MobCategory.MONSTER).setShouldReceiveVelocityUpdates(true).setTrackingRange(96).setUpdateInterval(3).setCustomClientFactory(GusThePugEntity::new)

					.sized(0.6f, 1.8f));
	public static final RegistryObject<EntityType<GusThePugDayEntity>> GUS_THE_PUG_DAY = register("gus_the_pug_day",
			EntityType.Builder.<GusThePugDayEntity>of(GusThePugDayEntity::new, MobCategory.MONSTER).setShouldReceiveVelocityUpdates(true).setTrackingRange(96).setUpdateInterval(3).setCustomClientFactory(GusThePugDayEntity::new)

					.sized(0.6f, 1.8f));
	public static final RegistryObject<EntityType<GusThePugStillDayEntity>> GUS_THE_PUG_STILL_DAY = register("gus_the_pug_still_day",
			EntityType.Builder.<GusThePugStillDayEntity>of(GusThePugStillDayEntity::new, MobCategory.MONSTER).setShouldReceiveVelocityUpdates(true).setTrackingRange(96).setUpdateInterval(3).setCustomClientFactory(GusThePugStillDayEntity::new)

					.sized(0.6f, 1.8f));
	public static final RegistryObject<EntityType<DougDogEntity>> DOUG_DOG = register("doug_dog",
			EntityType.Builder.<DougDogEntity>of(DougDogEntity::new, MobCategory.MONSTER).setShouldReceiveVelocityUpdates(true).setTrackingRange(96).setUpdateInterval(3).setCustomClientFactory(DougDogEntity::new)

					.sized(0.6f, 1.8f));
	public static final RegistryObject<EntityType<DougDogDayEntity>> DOUG_DOG_DAY = register("doug_dog_day",
			EntityType.Builder.<DougDogDayEntity>of(DougDogDayEntity::new, MobCategory.MONSTER).setShouldReceiveVelocityUpdates(true).setTrackingRange(96).setUpdateInterval(3).setCustomClientFactory(DougDogDayEntity::new)

					.sized(0.6f, 1.8f));
	public static final RegistryObject<EntityType<JollyRatEntity>> JOLLY_RAT = register("jolly_rat",
			EntityType.Builder.<JollyRatEntity>of(JollyRatEntity::new, MobCategory.MONSTER).setShouldReceiveVelocityUpdates(true).setTrackingRange(96).setUpdateInterval(3).setCustomClientFactory(JollyRatEntity::new)

					.sized(0.6f, 1.8f));
	public static final RegistryObject<EntityType<JollyRatDayEntity>> JOLLY_RAT_DAY = register("jolly_rat_day",
			EntityType.Builder.<JollyRatDayEntity>of(JollyRatDayEntity::new, MobCategory.MONSTER).setShouldReceiveVelocityUpdates(true).setTrackingRange(96).setUpdateInterval(3).setCustomClientFactory(JollyRatDayEntity::new)

					.sized(0.6f, 1.8f));
	public static final RegistryObject<EntityType<WitheredJollyRatEntity>> WITHERED_JOLLY_RAT = register("withered_jolly_rat",
			EntityType.Builder.<WitheredJollyRatEntity>of(WitheredJollyRatEntity::new, MobCategory.MONSTER).setShouldReceiveVelocityUpdates(true).setTrackingRange(96).setUpdateInterval(3).setCustomClientFactory(WitheredJollyRatEntity::new)

					.sized(0.6f, 1.8f));
	public static final RegistryObject<EntityType<WitheredJollyRatDayEntity>> WITHERED_JOLLY_RAT_DAY = register("withered_jolly_rat_day",
			EntityType.Builder.<WitheredJollyRatDayEntity>of(WitheredJollyRatDayEntity::new, MobCategory.MONSTER).setShouldReceiveVelocityUpdates(true).setTrackingRange(96).setUpdateInterval(3).setCustomClientFactory(WitheredJollyRatDayEntity::new)

					.sized(0.6f, 1.8f));
	public static final RegistryObject<EntityType<WitheredDougDogEntity>> WITHERED_DOUG_DOG = register("withered_doug_dog",
			EntityType.Builder.<WitheredDougDogEntity>of(WitheredDougDogEntity::new, MobCategory.MONSTER).setShouldReceiveVelocityUpdates(true).setTrackingRange(96).setUpdateInterval(3).setCustomClientFactory(WitheredDougDogEntity::new)

					.sized(0.6f, 1.8f));
	public static final RegistryObject<EntityType<WitheredDougDogDayEntity>> WITHERED_DOUG_DOG_DAY = register("withered_doug_dog_day",
			EntityType.Builder.<WitheredDougDogDayEntity>of(WitheredDougDogDayEntity::new, MobCategory.MONSTER).setShouldReceiveVelocityUpdates(true).setTrackingRange(96).setUpdateInterval(3).setCustomClientFactory(WitheredDougDogDayEntity::new)

					.sized(0.6f, 1.8f));
	public static final RegistryObject<EntityType<IgnitedChicaEntity>> IGNITED_CHICA = register("ignited_chica",
			EntityType.Builder.<IgnitedChicaEntity>of(IgnitedChicaEntity::new, MobCategory.MONSTER).setShouldReceiveVelocityUpdates(true).setTrackingRange(96).setUpdateInterval(3).setCustomClientFactory(IgnitedChicaEntity::new)

					.sized(0.6f, 0.9375f));
	public static final RegistryObject<EntityType<IgnitedChicaDayEntity>> IGNITED_CHICA_DAY = register("ignited_chica_day",
			EntityType.Builder.<IgnitedChicaDayEntity>of(IgnitedChicaDayEntity::new, MobCategory.MONSTER).setShouldReceiveVelocityUpdates(true).setTrackingRange(96).setUpdateInterval(3).setCustomClientFactory(IgnitedChicaDayEntity::new)

					.sized(0.6f, 0.9375f));
	public static final RegistryObject<EntityType<BaggieMaggieEntity>> BAGGIE_MAGGIE = register("baggie_maggie",
			EntityType.Builder.<BaggieMaggieEntity>of(BaggieMaggieEntity::new, MobCategory.MONSTER).setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(3).setCustomClientFactory(BaggieMaggieEntity::new)

					.sized(0.6f, 0.875f));
	public static final RegistryObject<EntityType<BaggieMaggieDayEntity>> BAGGIE_MAGGIE_DAY = register("baggie_maggie_day",
			EntityType.Builder.<BaggieMaggieDayEntity>of(BaggieMaggieDayEntity::new, MobCategory.MONSTER).setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(3).setCustomClientFactory(BaggieMaggieDayEntity::new)

					.sized(0.6f, 0.875f));
	public static final RegistryObject<EntityType<PidgeonEntity>> PIDGEON = register("pidgeon",
			EntityType.Builder.<PidgeonEntity>of(PidgeonEntity::new, MobCategory.CREATURE).setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(3).setCustomClientFactory(PidgeonEntity::new)

					.sized(0.6f, 0.675f));
	public static final RegistryObject<EntityType<CrowEntity>> CROW = register("crow",
			EntityType.Builder.<CrowEntity>of(CrowEntity::new, MobCategory.CREATURE).setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(3).setCustomClientFactory(CrowEntity::new)

					.sized(0.6f, 0.675f));
	public static final RegistryObject<EntityType<PossumEntity>> POSSUM = register("possum",
			EntityType.Builder.<PossumEntity>of(PossumEntity::new, MobCategory.CREATURE).setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(3).setCustomClientFactory(PossumEntity::new)

					.sized(0.6f, 0.6875f));
	public static final RegistryObject<EntityType<PitbonnieEntity>> PITBONNIE = register("pitbonnie",
			EntityType.Builder.<PitbonnieEntity>of(PitbonnieEntity::new, MobCategory.MONSTER).setShouldReceiveVelocityUpdates(true).setTrackingRange(96).setUpdateInterval(3).setCustomClientFactory(PitbonnieEntity::new)

					.sized(0.6f, 1.8f));
	public static final RegistryObject<EntityType<PitbonnieDayEntity>> PITBONNIE_DAY = register("pitbonnie_day",
			EntityType.Builder.<PitbonnieDayEntity>of(PitbonnieDayEntity::new, MobCategory.MONSTER).setShouldReceiveVelocityUpdates(true).setTrackingRange(96).setUpdateInterval(3).setCustomClientFactory(PitbonnieDayEntity::new)

					.sized(0.6f, 1.8f));
	public static final RegistryObject<EntityType<Lolbit409Entity>> LOLBIT_409 = register("lolbit_409",
			EntityType.Builder.<Lolbit409Entity>of(Lolbit409Entity::new, MobCategory.MONSTER).setShouldReceiveVelocityUpdates(true).setTrackingRange(96).setUpdateInterval(3).setCustomClientFactory(Lolbit409Entity::new)

					.sized(0.6f, 1.4375f));
	public static final RegistryObject<EntityType<Lolbit409DayEntity>> LOLBIT_409_DAY = register("lolbit_409_day",
			EntityType.Builder.<Lolbit409DayEntity>of(Lolbit409DayEntity::new, MobCategory.MONSTER).setShouldReceiveVelocityUpdates(true).setTrackingRange(96).setUpdateInterval(3).setCustomClientFactory(Lolbit409DayEntity::new)

					.sized(0.6f, 1.4375f));
	public static final RegistryObject<EntityType<RatEntity>> RAT = register("rat",
			EntityType.Builder.<RatEntity>of(RatEntity::new, MobCategory.CREATURE).setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(3).setCustomClientFactory(RatEntity::new)

					.sized(0.45f, 0.45f));
	public static final RegistryObject<EntityType<MysteriousGiantScuttlerEntity>> MYSTERIOUS_GIANT_SCUTTLER = register("mysterious_giant_scuttler",
			EntityType.Builder.<MysteriousGiantScuttlerEntity>of(MysteriousGiantScuttlerEntity::new, MobCategory.WATER_CREATURE).setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(3)
					.setCustomClientFactory(MysteriousGiantScuttlerEntity::new)

					.sized(0.6f, 0.25f));
	public static final RegistryObject<EntityType<CandyCatEntity>> CANDY_CAT = register("candy_cat",
			EntityType.Builder.<CandyCatEntity>of(CandyCatEntity::new, MobCategory.MONSTER).setShouldReceiveVelocityUpdates(true).setTrackingRange(96).setUpdateInterval(3).setCustomClientFactory(CandyCatEntity::new)

					.sized(0.6f, 1.8f));
	public static final RegistryObject<EntityType<CandyCatDayEntity>> CANDY_CAT_DAY = register("candy_cat_day",
			EntityType.Builder.<CandyCatDayEntity>of(CandyCatDayEntity::new, MobCategory.MONSTER).setShouldReceiveVelocityUpdates(true).setTrackingRange(96).setUpdateInterval(3).setCustomClientFactory(CandyCatDayEntity::new)

					.sized(0.6f, 1.8f));
	public static final RegistryObject<EntityType<CindyCatEntity>> CINDY_CAT = register("cindy_cat",
			EntityType.Builder.<CindyCatEntity>of(CindyCatEntity::new, MobCategory.MONSTER).setShouldReceiveVelocityUpdates(true).setTrackingRange(96).setUpdateInterval(3).setCustomClientFactory(CindyCatEntity::new)

					.sized(0.6f, 1.8f));
	public static final RegistryObject<EntityType<CindyCatDayEntity>> CINDY_CAT_DAY = register("cindy_cat_day",
			EntityType.Builder.<CindyCatDayEntity>of(CindyCatDayEntity::new, MobCategory.MONSTER).setShouldReceiveVelocityUpdates(true).setTrackingRange(96).setUpdateInterval(3).setCustomClientFactory(CindyCatDayEntity::new)

					.sized(0.6f, 1.8f));
	public static final RegistryObject<EntityType<TomatoProjectileEntity>> TOMATO_PROJECTILE = register("tomato_projectile", EntityType.Builder.<TomatoProjectileEntity>of(TomatoProjectileEntity::new, MobCategory.MISC)
			.setCustomClientFactory(TomatoProjectileEntity::new).setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(1).sized(0.5f, 0.5f));
	public static final RegistryObject<EntityType<CarDesotoEntity>> CAR_DESOTO = register("car_desoto",
			EntityType.Builder.<CarDesotoEntity>of(CarDesotoEntity::new, MobCategory.MONSTER).setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(3).setCustomClientFactory(CarDesotoEntity::new)

					.sized(1.03125f, 2f));
	public static final RegistryObject<EntityType<PopgoesWeaselEntity>> POPGOES_WEASEL = register("popgoes_weasel",
			EntityType.Builder.<PopgoesWeaselEntity>of(PopgoesWeaselEntity::new, MobCategory.MONSTER).setShouldReceiveVelocityUpdates(true).setTrackingRange(96).setUpdateInterval(3).setCustomClientFactory(PopgoesWeaselEntity::new)

					.sized(0.6f, 1.8f));
	public static final RegistryObject<EntityType<PopgoesWeaselDayEntity>> POPGOES_WEASEL_DAY = register("popgoes_weasel_day",
			EntityType.Builder.<PopgoesWeaselDayEntity>of(PopgoesWeaselDayEntity::new, MobCategory.MONSTER).setShouldReceiveVelocityUpdates(true).setTrackingRange(96).setUpdateInterval(3).setCustomClientFactory(PopgoesWeaselDayEntity::new)

					.sized(0.6f, 1.8f));
	public static final RegistryObject<EntityType<BlakeBadgerEntity>> BLAKE_BADGER = register("blake_badger",
			EntityType.Builder.<BlakeBadgerEntity>of(BlakeBadgerEntity::new, MobCategory.MONSTER).setShouldReceiveVelocityUpdates(true).setTrackingRange(96).setUpdateInterval(3).setCustomClientFactory(BlakeBadgerEntity::new)

					.sized(0.6f, 1.8f));
	public static final RegistryObject<EntityType<BlakeBadgerDayEntity>> BLAKE_BADGER_DAY = register("blake_badger_day",
			EntityType.Builder.<BlakeBadgerDayEntity>of(BlakeBadgerDayEntity::new, MobCategory.MONSTER).setShouldReceiveVelocityUpdates(true).setTrackingRange(96).setUpdateInterval(3).setCustomClientFactory(BlakeBadgerDayEntity::new)

					.sized(0.6f, 1.8f));
	public static final RegistryObject<EntityType<RickyRatEntity>> RICKY_RAT = register("ricky_rat",
			EntityType.Builder.<RickyRatEntity>of(RickyRatEntity::new, MobCategory.MONSTER).setShouldReceiveVelocityUpdates(true).setTrackingRange(96).setUpdateInterval(3).setCustomClientFactory(RickyRatEntity::new)

					.sized(0.6f, 1.8f));
	public static final RegistryObject<EntityType<RickyRatDayEntity>> RICKY_RAT_DAY = register("ricky_rat_day",
			EntityType.Builder.<RickyRatDayEntity>of(RickyRatDayEntity::new, MobCategory.MONSTER).setShouldReceiveVelocityUpdates(true).setTrackingRange(96).setUpdateInterval(3).setCustomClientFactory(RickyRatDayEntity::new)

					.sized(0.6f, 1.8f));
	public static final RegistryObject<EntityType<BallRedProjectileEntity>> BALL_RED_PROJECTILE = register("ball_red_projectile", EntityType.Builder.<BallRedProjectileEntity>of(BallRedProjectileEntity::new, MobCategory.MISC)
			.setCustomClientFactory(BallRedProjectileEntity::new).setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(1).sized(0.5f, 0.5f));
	public static final RegistryObject<EntityType<BallOrangeProjectileEntity>> BALL_ORANGE_PROJECTILE = register("ball_orange_projectile", EntityType.Builder.<BallOrangeProjectileEntity>of(BallOrangeProjectileEntity::new, MobCategory.MISC)
			.setCustomClientFactory(BallOrangeProjectileEntity::new).setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(1).sized(0.5f, 0.5f));
	public static final RegistryObject<EntityType<BallYellowProjectileEntity>> BALL_YELLOW_PROJECTILE = register("ball_yellow_projectile", EntityType.Builder.<BallYellowProjectileEntity>of(BallYellowProjectileEntity::new, MobCategory.MISC)
			.setCustomClientFactory(BallYellowProjectileEntity::new).setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(1).sized(0.5f, 0.5f));
	public static final RegistryObject<EntityType<BallGreenProjectileEntity>> BALL_GREEN_PROJECTILE = register("ball_green_projectile", EntityType.Builder.<BallGreenProjectileEntity>of(BallGreenProjectileEntity::new, MobCategory.MISC)
			.setCustomClientFactory(BallGreenProjectileEntity::new).setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(1).sized(0.5f, 0.5f));
	public static final RegistryObject<EntityType<BallBlueProjectileEntity>> BALL_BLUE_PROJECTILE = register("ball_blue_projectile", EntityType.Builder.<BallBlueProjectileEntity>of(BallBlueProjectileEntity::new, MobCategory.MISC)
			.setCustomClientFactory(BallBlueProjectileEntity::new).setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(1).sized(0.5f, 0.5f));
	public static final RegistryObject<EntityType<BallPurpleProjectileEntity>> BALL_PURPLE_PROJECTILE = register("ball_purple_projectile", EntityType.Builder.<BallPurpleProjectileEntity>of(BallPurpleProjectileEntity::new, MobCategory.MISC)
			.setCustomClientFactory(BallPurpleProjectileEntity::new).setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(1).sized(0.5f, 0.5f));
	public static final RegistryObject<EntityType<ShotgunShellProjectileEntity>> SHOTGUN_SHELL_PROJECTILE = register("shotgun_shell_projectile", EntityType.Builder.<ShotgunShellProjectileEntity>of(ShotgunShellProjectileEntity::new, MobCategory.MISC)
			.setCustomClientFactory(ShotgunShellProjectileEntity::new).setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(1).sized(0.5f, 0.5f));
	public static final RegistryObject<EntityType<SeabonnieEntity>> SEABONNIE = register("seabonnie",
			EntityType.Builder.<SeabonnieEntity>of(SeabonnieEntity::new, MobCategory.WATER_CREATURE).setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(3).setCustomClientFactory(SeabonnieEntity::new)

					.sized(0.125f, 0.125f));
	public static final RegistryObject<EntityType<CupcakeEntityEntity>> CUPCAKE_ENTITY = register("cupcake_entity",
			EntityType.Builder.<CupcakeEntityEntity>of(CupcakeEntityEntity::new, MobCategory.MONSTER).setShouldReceiveVelocityUpdates(true).setTrackingRange(96).setUpdateInterval(3).setCustomClientFactory(CupcakeEntityEntity::new)

					.sized(0.6f, 0.9375f));
	public static final RegistryObject<EntityType<ToyCupcakeEntityEntity>> TOY_CUPCAKE_ENTITY = register("toy_cupcake_entity",
			EntityType.Builder.<ToyCupcakeEntityEntity>of(ToyCupcakeEntityEntity::new, MobCategory.MONSTER).setShouldReceiveVelocityUpdates(true).setTrackingRange(96).setUpdateInterval(3).setCustomClientFactory(ToyCupcakeEntityEntity::new)

					.sized(0.6f, 0.9375f));
	public static final RegistryObject<EntityType<RetroCupcakeEntityEntity>> RETRO_CUPCAKE_ENTITY = register("retro_cupcake_entity",
			EntityType.Builder.<RetroCupcakeEntityEntity>of(RetroCupcakeEntityEntity::new, MobCategory.MONSTER).setShouldReceiveVelocityUpdates(true).setTrackingRange(96).setUpdateInterval(3).setCustomClientFactory(RetroCupcakeEntityEntity::new)

					.sized(0.6f, 0.9375f));
	public static final RegistryObject<EntityType<RetroCupcakeFmsEntityEntity>> RETRO_CUPCAKE_FMS_ENTITY = register("retro_cupcake_fms_entity",
			EntityType.Builder.<RetroCupcakeFmsEntityEntity>of(RetroCupcakeFmsEntityEntity::new, MobCategory.MONSTER).setShouldReceiveVelocityUpdates(true).setTrackingRange(96).setUpdateInterval(3)
					.setCustomClientFactory(RetroCupcakeFmsEntityEntity::new)

					.sized(0.6f, 0.9375f));
	public static final RegistryObject<EntityType<ScrapSparkyDogEntity>> SCRAP_SPARKY_DOG = register("scrap_sparky_dog",
			EntityType.Builder.<ScrapSparkyDogEntity>of(ScrapSparkyDogEntity::new, MobCategory.MONSTER).setShouldReceiveVelocityUpdates(true).setTrackingRange(96).setUpdateInterval(3).setCustomClientFactory(ScrapSparkyDogEntity::new)

					.sized(0.6f, 1.8f));
	public static final RegistryObject<EntityType<ScrapSparkyDogDayEntity>> SCRAP_SPARKY_DOG_DAY = register("scrap_sparky_dog_day",
			EntityType.Builder.<ScrapSparkyDogDayEntity>of(ScrapSparkyDogDayEntity::new, MobCategory.MONSTER).setShouldReceiveVelocityUpdates(true).setTrackingRange(96).setUpdateInterval(3).setCustomClientFactory(ScrapSparkyDogDayEntity::new)

					.sized(0.6f, 1.8f));
	public static final RegistryObject<EntityType<PuppetFreddybearEntity>> PUPPET_FREDDYBEAR = register("puppet_freddybear",
			EntityType.Builder.<PuppetFreddybearEntity>of(PuppetFreddybearEntity::new, MobCategory.MONSTER).setShouldReceiveVelocityUpdates(true).setTrackingRange(96).setUpdateInterval(3).setCustomClientFactory(PuppetFreddybearEntity::new)

					.sized(0.6f, 1.8f));
	public static final RegistryObject<EntityType<PuppetFreddybearDayEntity>> PUPPET_FREDDYBEAR_DAY = register("puppet_freddybear_day",
			EntityType.Builder.<PuppetFreddybearDayEntity>of(PuppetFreddybearDayEntity::new, MobCategory.MONSTER).setShouldReceiveVelocityUpdates(true).setTrackingRange(96).setUpdateInterval(3).setCustomClientFactory(PuppetFreddybearDayEntity::new)

					.sized(0.6f, 1.8f));
	public static final RegistryObject<EntityType<ShreddyFazchairEntity>> SHREDDY_FAZCHAIR = register("shreddy_fazchair",
			EntityType.Builder.<ShreddyFazchairEntity>of(ShreddyFazchairEntity::new, MobCategory.MONSTER).setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(3).setCustomClientFactory(ShreddyFazchairEntity::new)

					.sized(0.6f, 1.8f));

	// Start of user code block custom entities
	// End of user code block custom entities
	private static <T extends Entity> RegistryObject<EntityType<T>> register(String registryname, EntityType.Builder<T> entityTypeBuilder) {
		return REGISTRY.register(registryname, () -> (EntityType<T>) entityTypeBuilder.build(registryname));
	}

	@SubscribeEvent
	public static void init(FMLCommonSetupEvent event) {
		event.enqueueWork(() -> {
			FreddyFazbearEntity.init();
			FreddyFazbearDayEntity.init();
			SeatEntity.init();
			BonnieBunnyEntity.init();
			BonnieBunnyDayEntity.init();
			ChicaChickenEntity.init();
			ChicaChickenDayEntity.init();
			FoxyPirateEntity.init();
			FoxyPirateDayEntity.init();
			GoldenFreddyEntity.init();
			WitheredFreddyEntity.init();
			WitheredFreddyDayEntity.init();
			WitheredBonnieEntity.init();
			WitheredBonnieDayEntity.init();
			WitheredChicaEntity.init();
			WitheredChicaDayEntity.init();
			WitheredFoxyEntity.init();
			WitheredFoxyDayEntity.init();
			ToyFreddyEntity.init();
			ToyFreddyDayEntity.init();
			ToyBonnieEntity.init();
			ToyBonnieDayEntity.init();
			ToyChicaEntity.init();
			ToyChicaDayEntity.init();
			MangleEntity.init();
			MangleDayEntity.init();
			BalloonBoyEntity.init();
			BalloonBoyDayEntity.init();
			PuppetEntity.init();
			PuppetDayEntity.init();
			JJEntity.init();
			JjDayEntity.init();
			ToyFoxyEntity.init();
			ToyFoxyDayEntity.init();
			WitheredGoldenFreddyEntity.init();
			ShadowBonnieEntity.init();
			ShadowFreddyEntity.init();
			SpringtrapEntity.init();
			SpringtrapDayEntity.init();
			ToyFreddyStillDayEntity.init();
			ToyBonnieStillDayEntity.init();
			ToyChicaStillDayEntity.init();
			ToyFoxyStillDayEntity.init();
			PhantomChicaEntity.init();
			PhantomFreddyEntity.init();
			PhantomFoxyEntity.init();
			PhantomMangleEntity.init();
			PhantomBalloonBoyEntity.init();
			PhantomPuppetEntity.init();
			SpringbonnieSuitEntity.init();
			Endo01Entity.init();
			Endo01DayEntity.init();
			Endo02Entity.init();
			Endo02DayEntity.init();
			FredbearEntity.init();
			FredbearDayEntity.init();
			NightmareFreddyEntity.init();
			PlushtrapEntity.init();
			NightmareBonnieEntity.init();
			SpringbonnieEntity.init();
			SpringbonnieDayEntity.init();
			NightmareChicaEntity.init();
			NightmareFoxyEntity.init();
			PlushtrapDayEntity.init();
			NightmareFredbearEntity.init();
			NightmareEntity.init();
			JackOBonnieEntity.init();
			JackOChicaEntity.init();
			NightmarionneEntity.init();
			NightmareMangleEntity.init();
			NightmareBbEntity.init();
			NightmareBbDayEntity.init();
			FredbearSuitEntity.init();
			FredbearSuitHeadlessEntity.init();
			FuntimeFreddyEntity.init();
			FuntimeFreddyDayEntity.init();
			BonbonEntity.init();
			FuntimeFoxyEntity.init();
			FuntimeFoxyDayEntity.init();
			EnnardEntity.init();
			MinireenaEntity.init();
			MinireenaDayEntity.init();
			Minireena2Entity.init();
			Minireena2DayEntity.init();
			BidybabEntity.init();
			BidybabDayEntity.init();
			ElectrobabEntity.init();
			ElectrobabDayEntity.init();
			BalloraEntity.init();
			BalloraDayEntity.init();
			BonnetEntity.init();
			BonnetDayEntity.init();
			CircusBabyEntity.init();
			CircusBabyDayEntity.init();
			LolbitEntity.init();
			RetroFreddyEntity.init();
			RetroFreddyDayEntity.init();
			RetroBonnieEntity.init();
			RetroBonnieDayEntity.init();
			RetroChicaEntity.init();
			RetroChicaDayEntity.init();
			RetroFoxyEntity.init();
			RetroFoxyDayEntity.init();
			YenndoEntity.init();
			BlobFuntimeFreddyEntity.init();
			BlobCircusBabyEntity.init();
			BlobFuntimeFoxyEntity.init();
			BlobBalloraEntity.init();
			MrHugsEntity.init();
			MrHugsDayEntity.init();
			BucketBobEntity.init();
			BucketBobDayEntity.init();
			MrCanDoEntity.init();
			MrCanDoDayEntity.init();
			NumberOneCrateEntity.init();
			NumberOneCrateDayEntity.init();
			PanStanEntity.init();
			PanStanDayEntity.init();
			MoltenFreddyEntity.init();
			HelpyEntity.init();
			CarPurpleChevroletImpalaEntity.init();
			NeddbearEntity.init();
			NeddBearDayEntity.init();
			HappyFrogEntity.init();
			HappyFrogDayEntity.init();
			PigpatchEntity.init();
			PigpatchDayEntity.init();
			MrHippoEntity.init();
			MrHippoDayEntity.init();
			ScraptrapEntity.init();
			ChildEntity.init();
			CarDodgeRam1982Entity.init();
			CarSeatEntity.init();
			RockstarFreddyEntity.init();
			RockstarFreddyDayEntity.init();
			RockstarBonnieEntity.init();
			RockstarBonnieDayEntity.init();
			RockstarChicaEntity.init();
			RockstarChicaDayEntity.init();
			RockstarFoxyEntity.init();
			RockstarFoxyDayEntity.init();
			ScrapBabyEntity.init();
			OrvilleElephantEntity.init();
			OrvilleElephantDayEntity.init();
			LeftyEntity.init();
			LeftyDayEntity.init();
			IndigoEntity.init();
			IndigoDayEntity.init();
			BarryPolarEntity.init();
			BarryPolarDayEntity.init();
			GhostChildEntity.init();
			FuntimeChicaEntity.init();
			FuntimeChicaDayEntity.init();
			MusicManEntity.init();
			MusicManDayEntity.init();
			ElChipEntity.init();
			ElChipDayEntity.init();
			PurpleGuyEntity.init();
			CarFazvanEntity.init();
			CarStationWagonEntity.init();
			OfficeChairRedEntityEntity.init();
			OfficeChairBlackEntityEntity.init();
			RustyEntity.init();
			RustyDayEntity.init();
			DrTeethEntity.init();
			DrTeethDayEntity.init();
			CarHarleyMotorcycleEntity.init();
			SparkyDogEntity.init();
			SparkyDogDayEntity.init();
			CarPoliceCruiserChevroletImpala1983Entity.init();
			FuntimeDelilahEntity.init();
			FuntimeDelilahDayEntity.init();
			RaccoonEntity.init();
			GusThePugEntity.init();
			GusThePugDayEntity.init();
			GusThePugStillDayEntity.init();
			DougDogEntity.init();
			DougDogDayEntity.init();
			JollyRatEntity.init();
			JollyRatDayEntity.init();
			WitheredJollyRatEntity.init();
			WitheredJollyRatDayEntity.init();
			WitheredDougDogEntity.init();
			WitheredDougDogDayEntity.init();
			IgnitedChicaEntity.init();
			IgnitedChicaDayEntity.init();
			BaggieMaggieEntity.init();
			BaggieMaggieDayEntity.init();
			PidgeonEntity.init();
			CrowEntity.init();
			PossumEntity.init();
			PitbonnieEntity.init();
			PitbonnieDayEntity.init();
			Lolbit409Entity.init();
			Lolbit409DayEntity.init();
			RatEntity.init();
			MysteriousGiantScuttlerEntity.init();
			CandyCatEntity.init();
			CandyCatDayEntity.init();
			CindyCatEntity.init();
			CindyCatDayEntity.init();
			CarDesotoEntity.init();
			PopgoesWeaselEntity.init();
			PopgoesWeaselDayEntity.init();
			BlakeBadgerEntity.init();
			BlakeBadgerDayEntity.init();
			RickyRatEntity.init();
			RickyRatDayEntity.init();
			SeabonnieEntity.init();
			CupcakeEntityEntity.init();
			ToyCupcakeEntityEntity.init();
			RetroCupcakeEntityEntity.init();
			RetroCupcakeFmsEntityEntity.init();
			ScrapSparkyDogEntity.init();
			ScrapSparkyDogDayEntity.init();
			PuppetFreddybearEntity.init();
			PuppetFreddybearDayEntity.init();
			ShreddyFazchairEntity.init();
		});
	}

	@SubscribeEvent
	public static void registerAttributes(EntityAttributeCreationEvent event) {
		event.put(FREDDY_FAZBEAR.get(), FreddyFazbearEntity.createAttributes().build());
		event.put(FREDDY_FAZBEAR_DAY.get(), FreddyFazbearDayEntity.createAttributes().build());
		event.put(SEAT.get(), SeatEntity.createAttributes().build());
		event.put(BONNIE_BUNNY.get(), BonnieBunnyEntity.createAttributes().build());
		event.put(BONNIE_BUNNY_DAY.get(), BonnieBunnyDayEntity.createAttributes().build());
		event.put(CHICA_CHICKEN.get(), ChicaChickenEntity.createAttributes().build());
		event.put(CHICA_CHICKEN_DAY.get(), ChicaChickenDayEntity.createAttributes().build());
		event.put(FOXY_PIRATE.get(), FoxyPirateEntity.createAttributes().build());
		event.put(FOXY_PIRATE_DAY.get(), FoxyPirateDayEntity.createAttributes().build());
		event.put(GOLDEN_FREDDY.get(), GoldenFreddyEntity.createAttributes().build());
		event.put(WITHERED_FREDDY.get(), WitheredFreddyEntity.createAttributes().build());
		event.put(WITHERED_FREDDY_DAY.get(), WitheredFreddyDayEntity.createAttributes().build());
		event.put(WITHERED_BONNIE.get(), WitheredBonnieEntity.createAttributes().build());
		event.put(WITHERED_BONNIE_DAY.get(), WitheredBonnieDayEntity.createAttributes().build());
		event.put(WITHERED_CHICA.get(), WitheredChicaEntity.createAttributes().build());
		event.put(WITHERED_CHICA_DAY.get(), WitheredChicaDayEntity.createAttributes().build());
		event.put(WITHERED_FOXY.get(), WitheredFoxyEntity.createAttributes().build());
		event.put(WITHERED_FOXY_DAY.get(), WitheredFoxyDayEntity.createAttributes().build());
		event.put(TOY_FREDDY.get(), ToyFreddyEntity.createAttributes().build());
		event.put(TOY_FREDDY_DAY.get(), ToyFreddyDayEntity.createAttributes().build());
		event.put(TOY_BONNIE.get(), ToyBonnieEntity.createAttributes().build());
		event.put(TOY_BONNIE_DAY.get(), ToyBonnieDayEntity.createAttributes().build());
		event.put(TOY_CHICA.get(), ToyChicaEntity.createAttributes().build());
		event.put(TOY_CHICA_DAY.get(), ToyChicaDayEntity.createAttributes().build());
		event.put(MANGLE.get(), MangleEntity.createAttributes().build());
		event.put(MANGLE_DAY.get(), MangleDayEntity.createAttributes().build());
		event.put(BALLOON_BOY.get(), BalloonBoyEntity.createAttributes().build());
		event.put(BALLOON_BOY_DAY.get(), BalloonBoyDayEntity.createAttributes().build());
		event.put(PUPPET.get(), PuppetEntity.createAttributes().build());
		event.put(PUPPET_DAY.get(), PuppetDayEntity.createAttributes().build());
		event.put(JJ.get(), JJEntity.createAttributes().build());
		event.put(JJ_DAY.get(), JjDayEntity.createAttributes().build());
		event.put(TOY_FOXY.get(), ToyFoxyEntity.createAttributes().build());
		event.put(TOY_FOXY_DAY.get(), ToyFoxyDayEntity.createAttributes().build());
		event.put(WITHERED_GOLDEN_FREDDY.get(), WitheredGoldenFreddyEntity.createAttributes().build());
		event.put(SHADOW_BONNIE.get(), ShadowBonnieEntity.createAttributes().build());
		event.put(SHADOW_FREDDY.get(), ShadowFreddyEntity.createAttributes().build());
		event.put(SPRINGTRAP.get(), SpringtrapEntity.createAttributes().build());
		event.put(SPRINGTRAP_DAY.get(), SpringtrapDayEntity.createAttributes().build());
		event.put(TOY_FREDDY_STILL_DAY.get(), ToyFreddyStillDayEntity.createAttributes().build());
		event.put(TOY_BONNIE_STILL_DAY.get(), ToyBonnieStillDayEntity.createAttributes().build());
		event.put(TOY_CHICA_STILL_DAY.get(), ToyChicaStillDayEntity.createAttributes().build());
		event.put(TOY_FOXY_STILL_DAY.get(), ToyFoxyStillDayEntity.createAttributes().build());
		event.put(PHANTOM_CHICA.get(), PhantomChicaEntity.createAttributes().build());
		event.put(PHANTOM_FREDDY.get(), PhantomFreddyEntity.createAttributes().build());
		event.put(PHANTOM_FOXY.get(), PhantomFoxyEntity.createAttributes().build());
		event.put(PHANTOM_MANGLE.get(), PhantomMangleEntity.createAttributes().build());
		event.put(PHANTOM_BALLOON_BOY.get(), PhantomBalloonBoyEntity.createAttributes().build());
		event.put(PHANTOM_PUPPET.get(), PhantomPuppetEntity.createAttributes().build());
		event.put(SPRINGBONNIE_SUIT.get(), SpringbonnieSuitEntity.createAttributes().build());
		event.put(ENDO_01.get(), Endo01Entity.createAttributes().build());
		event.put(ENDO_01_DAY.get(), Endo01DayEntity.createAttributes().build());
		event.put(ENDO_02.get(), Endo02Entity.createAttributes().build());
		event.put(ENDO_02_DAY.get(), Endo02DayEntity.createAttributes().build());
		event.put(FREDBEAR.get(), FredbearEntity.createAttributes().build());
		event.put(FREDBEAR_DAY.get(), FredbearDayEntity.createAttributes().build());
		event.put(NIGHTMARE_FREDDY.get(), NightmareFreddyEntity.createAttributes().build());
		event.put(PLUSHTRAP.get(), PlushtrapEntity.createAttributes().build());
		event.put(NIGHTMARE_BONNIE.get(), NightmareBonnieEntity.createAttributes().build());
		event.put(SPRINGBONNIE.get(), SpringbonnieEntity.createAttributes().build());
		event.put(SPRINGBONNIE_DAY.get(), SpringbonnieDayEntity.createAttributes().build());
		event.put(NIGHTMARE_CHICA.get(), NightmareChicaEntity.createAttributes().build());
		event.put(NIGHTMARE_FOXY.get(), NightmareFoxyEntity.createAttributes().build());
		event.put(PLUSHTRAP_DAY.get(), PlushtrapDayEntity.createAttributes().build());
		event.put(NIGHTMARE_FREDBEAR.get(), NightmareFredbearEntity.createAttributes().build());
		event.put(NIGHTMARE.get(), NightmareEntity.createAttributes().build());
		event.put(JACK_O_BONNIE.get(), JackOBonnieEntity.createAttributes().build());
		event.put(JACK_O_CHICA.get(), JackOChicaEntity.createAttributes().build());
		event.put(NIGHTMARIONNE.get(), NightmarionneEntity.createAttributes().build());
		event.put(NIGHTMARE_MANGLE.get(), NightmareMangleEntity.createAttributes().build());
		event.put(NIGHTMARE_BB.get(), NightmareBbEntity.createAttributes().build());
		event.put(NIGHTMARE_BB_DAY.get(), NightmareBbDayEntity.createAttributes().build());
		event.put(FREDBEAR_SUIT.get(), FredbearSuitEntity.createAttributes().build());
		event.put(FREDBEAR_SUIT_HEADLESS.get(), FredbearSuitHeadlessEntity.createAttributes().build());
		event.put(FUNTIME_FREDDY.get(), FuntimeFreddyEntity.createAttributes().build());
		event.put(FUNTIME_FREDDY_DAY.get(), FuntimeFreddyDayEntity.createAttributes().build());
		event.put(BONBON.get(), BonbonEntity.createAttributes().build());
		event.put(FUNTIME_FOXY.get(), FuntimeFoxyEntity.createAttributes().build());
		event.put(FUNTIME_FOXY_DAY.get(), FuntimeFoxyDayEntity.createAttributes().build());
		event.put(ENNARD.get(), EnnardEntity.createAttributes().build());
		event.put(MINIREENA.get(), MinireenaEntity.createAttributes().build());
		event.put(MINIREENA_DAY.get(), MinireenaDayEntity.createAttributes().build());
		event.put(MINIREENA_2.get(), Minireena2Entity.createAttributes().build());
		event.put(MINIREENA_2_DAY.get(), Minireena2DayEntity.createAttributes().build());
		event.put(BIDYBAB.get(), BidybabEntity.createAttributes().build());
		event.put(BIDYBAB_DAY.get(), BidybabDayEntity.createAttributes().build());
		event.put(ELECTROBAB.get(), ElectrobabEntity.createAttributes().build());
		event.put(ELECTROBAB_DAY.get(), ElectrobabDayEntity.createAttributes().build());
		event.put(BALLORA.get(), BalloraEntity.createAttributes().build());
		event.put(BALLORA_DAY.get(), BalloraDayEntity.createAttributes().build());
		event.put(BONNET.get(), BonnetEntity.createAttributes().build());
		event.put(BONNET_DAY.get(), BonnetDayEntity.createAttributes().build());
		event.put(CIRCUS_BABY.get(), CircusBabyEntity.createAttributes().build());
		event.put(CIRCUS_BABY_DAY.get(), CircusBabyDayEntity.createAttributes().build());
		event.put(LOLBIT.get(), LolbitEntity.createAttributes().build());
		event.put(RETRO_FREDDY.get(), RetroFreddyEntity.createAttributes().build());
		event.put(RETRO_FREDDY_DAY.get(), RetroFreddyDayEntity.createAttributes().build());
		event.put(RETRO_BONNIE.get(), RetroBonnieEntity.createAttributes().build());
		event.put(RETRO_BONNIE_DAY.get(), RetroBonnieDayEntity.createAttributes().build());
		event.put(RETRO_CHICA.get(), RetroChicaEntity.createAttributes().build());
		event.put(RETRO_CHICA_DAY.get(), RetroChicaDayEntity.createAttributes().build());
		event.put(RETRO_FOXY.get(), RetroFoxyEntity.createAttributes().build());
		event.put(RETRO_FOXY_DAY.get(), RetroFoxyDayEntity.createAttributes().build());
		event.put(YENNDO.get(), YenndoEntity.createAttributes().build());
		event.put(BLOB_FUNTIME_FREDDY.get(), BlobFuntimeFreddyEntity.createAttributes().build());
		event.put(BLOB_CIRCUS_BABY.get(), BlobCircusBabyEntity.createAttributes().build());
		event.put(BLOB_FUNTIME_FOXY.get(), BlobFuntimeFoxyEntity.createAttributes().build());
		event.put(BLOB_BALLORA.get(), BlobBalloraEntity.createAttributes().build());
		event.put(MR_HUGS.get(), MrHugsEntity.createAttributes().build());
		event.put(MR_HUGS_DAY.get(), MrHugsDayEntity.createAttributes().build());
		event.put(BUCKET_BOB.get(), BucketBobEntity.createAttributes().build());
		event.put(BUCKET_BOB_DAY.get(), BucketBobDayEntity.createAttributes().build());
		event.put(MR_CAN_DO.get(), MrCanDoEntity.createAttributes().build());
		event.put(MR_CAN_DO_DAY.get(), MrCanDoDayEntity.createAttributes().build());
		event.put(NUMBER_ONE_CRATE.get(), NumberOneCrateEntity.createAttributes().build());
		event.put(NUMBER_ONE_CRATE_DAY.get(), NumberOneCrateDayEntity.createAttributes().build());
		event.put(PAN_STAN.get(), PanStanEntity.createAttributes().build());
		event.put(PAN_STAN_DAY.get(), PanStanDayEntity.createAttributes().build());
		event.put(MOLTEN_FREDDY.get(), MoltenFreddyEntity.createAttributes().build());
		event.put(HELPY.get(), HelpyEntity.createAttributes().build());
		event.put(CAR_PURPLE_CHEVROLET_IMPALA.get(), CarPurpleChevroletImpalaEntity.createAttributes().build());
		event.put(NEDDBEAR.get(), NeddbearEntity.createAttributes().build());
		event.put(NEDDBEAR_DAY.get(), NeddBearDayEntity.createAttributes().build());
		event.put(HAPPY_FROG.get(), HappyFrogEntity.createAttributes().build());
		event.put(HAPPY_FROG_DAY.get(), HappyFrogDayEntity.createAttributes().build());
		event.put(PIGPATCH.get(), PigpatchEntity.createAttributes().build());
		event.put(PIGPATCH_DAY.get(), PigpatchDayEntity.createAttributes().build());
		event.put(MR_HIPPO.get(), MrHippoEntity.createAttributes().build());
		event.put(MR_HIPPO_DAY.get(), MrHippoDayEntity.createAttributes().build());
		event.put(SCRAPTRAP.get(), ScraptrapEntity.createAttributes().build());
		event.put(CHILD.get(), ChildEntity.createAttributes().build());
		event.put(CAR_DODGE_RAM_1982.get(), CarDodgeRam1982Entity.createAttributes().build());
		event.put(CAR_SEAT.get(), CarSeatEntity.createAttributes().build());
		event.put(ROCKSTAR_FREDDY.get(), RockstarFreddyEntity.createAttributes().build());
		event.put(ROCKSTAR_FREDDY_DAY.get(), RockstarFreddyDayEntity.createAttributes().build());
		event.put(ROCKSTAR_BONNIE.get(), RockstarBonnieEntity.createAttributes().build());
		event.put(ROCKSTAR_BONNIE_DAY.get(), RockstarBonnieDayEntity.createAttributes().build());
		event.put(ROCKSTAR_CHICA.get(), RockstarChicaEntity.createAttributes().build());
		event.put(ROCKSTAR_CHICA_DAY.get(), RockstarChicaDayEntity.createAttributes().build());
		event.put(ROCKSTAR_FOXY.get(), RockstarFoxyEntity.createAttributes().build());
		event.put(ROCKSTAR_FOXY_DAY.get(), RockstarFoxyDayEntity.createAttributes().build());
		event.put(SCRAP_BABY.get(), ScrapBabyEntity.createAttributes().build());
		event.put(ORVILLE_ELEPHANT.get(), OrvilleElephantEntity.createAttributes().build());
		event.put(ORVILLE_ELEPHANT_DAY.get(), OrvilleElephantDayEntity.createAttributes().build());
		event.put(LEFTY.get(), LeftyEntity.createAttributes().build());
		event.put(LEFTY_DAY.get(), LeftyDayEntity.createAttributes().build());
		event.put(INDIGO.get(), IndigoEntity.createAttributes().build());
		event.put(INDIGO_DAY.get(), IndigoDayEntity.createAttributes().build());
		event.put(BARRY_POLAR.get(), BarryPolarEntity.createAttributes().build());
		event.put(BARRY_POLAR_DAY.get(), BarryPolarDayEntity.createAttributes().build());
		event.put(GHOST_CHILD.get(), GhostChildEntity.createAttributes().build());
		event.put(FUNTIME_CHICA.get(), FuntimeChicaEntity.createAttributes().build());
		event.put(FUNTIME_CHICA_DAY.get(), FuntimeChicaDayEntity.createAttributes().build());
		event.put(MUSIC_MAN.get(), MusicManEntity.createAttributes().build());
		event.put(MUSIC_MAN_DAY.get(), MusicManDayEntity.createAttributes().build());
		event.put(EL_CHIP.get(), ElChipEntity.createAttributes().build());
		event.put(EL_CHIP_DAY.get(), ElChipDayEntity.createAttributes().build());
		event.put(PURPLE_GUY.get(), PurpleGuyEntity.createAttributes().build());
		event.put(CAR_FAZVAN.get(), CarFazvanEntity.createAttributes().build());
		event.put(CAR_STATION_WAGON.get(), CarStationWagonEntity.createAttributes().build());
		event.put(OFFICE_CHAIR_RED_ENTITY.get(), OfficeChairRedEntityEntity.createAttributes().build());
		event.put(OFFICE_CHAIR_BLACK_ENTITY.get(), OfficeChairBlackEntityEntity.createAttributes().build());
		event.put(RUSTY.get(), RustyEntity.createAttributes().build());
		event.put(RUSTY_DAY.get(), RustyDayEntity.createAttributes().build());
		event.put(DR_TEETH.get(), DrTeethEntity.createAttributes().build());
		event.put(DR_TEETH_DAY.get(), DrTeethDayEntity.createAttributes().build());
		event.put(CAR_HARLEY_MOTORCYCLE.get(), CarHarleyMotorcycleEntity.createAttributes().build());
		event.put(SPARKY_DOG.get(), SparkyDogEntity.createAttributes().build());
		event.put(SPARKY_DOG_DAY.get(), SparkyDogDayEntity.createAttributes().build());
		event.put(CAR_POLICE_CRUISER_CHEVROLET_IMPALA_1983.get(), CarPoliceCruiserChevroletImpala1983Entity.createAttributes().build());
		event.put(FUNTIME_DELILAH.get(), FuntimeDelilahEntity.createAttributes().build());
		event.put(FUNTIME_DELILAH_DAY.get(), FuntimeDelilahDayEntity.createAttributes().build());
		event.put(RACCOON.get(), RaccoonEntity.createAttributes().build());
		event.put(GUS_THE_PUG.get(), GusThePugEntity.createAttributes().build());
		event.put(GUS_THE_PUG_DAY.get(), GusThePugDayEntity.createAttributes().build());
		event.put(GUS_THE_PUG_STILL_DAY.get(), GusThePugStillDayEntity.createAttributes().build());
		event.put(DOUG_DOG.get(), DougDogEntity.createAttributes().build());
		event.put(DOUG_DOG_DAY.get(), DougDogDayEntity.createAttributes().build());
		event.put(JOLLY_RAT.get(), JollyRatEntity.createAttributes().build());
		event.put(JOLLY_RAT_DAY.get(), JollyRatDayEntity.createAttributes().build());
		event.put(WITHERED_JOLLY_RAT.get(), WitheredJollyRatEntity.createAttributes().build());
		event.put(WITHERED_JOLLY_RAT_DAY.get(), WitheredJollyRatDayEntity.createAttributes().build());
		event.put(WITHERED_DOUG_DOG.get(), WitheredDougDogEntity.createAttributes().build());
		event.put(WITHERED_DOUG_DOG_DAY.get(), WitheredDougDogDayEntity.createAttributes().build());
		event.put(IGNITED_CHICA.get(), IgnitedChicaEntity.createAttributes().build());
		event.put(IGNITED_CHICA_DAY.get(), IgnitedChicaDayEntity.createAttributes().build());
		event.put(BAGGIE_MAGGIE.get(), BaggieMaggieEntity.createAttributes().build());
		event.put(BAGGIE_MAGGIE_DAY.get(), BaggieMaggieDayEntity.createAttributes().build());
		event.put(PIDGEON.get(), PidgeonEntity.createAttributes().build());
		event.put(CROW.get(), CrowEntity.createAttributes().build());
		event.put(POSSUM.get(), PossumEntity.createAttributes().build());
		event.put(PITBONNIE.get(), PitbonnieEntity.createAttributes().build());
		event.put(PITBONNIE_DAY.get(), PitbonnieDayEntity.createAttributes().build());
		event.put(LOLBIT_409.get(), Lolbit409Entity.createAttributes().build());
		event.put(LOLBIT_409_DAY.get(), Lolbit409DayEntity.createAttributes().build());
		event.put(RAT.get(), RatEntity.createAttributes().build());
		event.put(MYSTERIOUS_GIANT_SCUTTLER.get(), MysteriousGiantScuttlerEntity.createAttributes().build());
		event.put(CANDY_CAT.get(), CandyCatEntity.createAttributes().build());
		event.put(CANDY_CAT_DAY.get(), CandyCatDayEntity.createAttributes().build());
		event.put(CINDY_CAT.get(), CindyCatEntity.createAttributes().build());
		event.put(CINDY_CAT_DAY.get(), CindyCatDayEntity.createAttributes().build());
		event.put(CAR_DESOTO.get(), CarDesotoEntity.createAttributes().build());
		event.put(POPGOES_WEASEL.get(), PopgoesWeaselEntity.createAttributes().build());
		event.put(POPGOES_WEASEL_DAY.get(), PopgoesWeaselDayEntity.createAttributes().build());
		event.put(BLAKE_BADGER.get(), BlakeBadgerEntity.createAttributes().build());
		event.put(BLAKE_BADGER_DAY.get(), BlakeBadgerDayEntity.createAttributes().build());
		event.put(RICKY_RAT.get(), RickyRatEntity.createAttributes().build());
		event.put(RICKY_RAT_DAY.get(), RickyRatDayEntity.createAttributes().build());
		event.put(SEABONNIE.get(), SeabonnieEntity.createAttributes().build());
		event.put(CUPCAKE_ENTITY.get(), CupcakeEntityEntity.createAttributes().build());
		event.put(TOY_CUPCAKE_ENTITY.get(), ToyCupcakeEntityEntity.createAttributes().build());
		event.put(RETRO_CUPCAKE_ENTITY.get(), RetroCupcakeEntityEntity.createAttributes().build());
		event.put(RETRO_CUPCAKE_FMS_ENTITY.get(), RetroCupcakeFmsEntityEntity.createAttributes().build());
		event.put(SCRAP_SPARKY_DOG.get(), ScrapSparkyDogEntity.createAttributes().build());
		event.put(SCRAP_SPARKY_DOG_DAY.get(), ScrapSparkyDogDayEntity.createAttributes().build());
		event.put(PUPPET_FREDDYBEAR.get(), PuppetFreddybearEntity.createAttributes().build());
		event.put(PUPPET_FREDDYBEAR_DAY.get(), PuppetFreddybearDayEntity.createAttributes().build());
		event.put(SHREDDY_FAZCHAIR.get(), ShreddyFazchairEntity.createAttributes().build());
	}
}
