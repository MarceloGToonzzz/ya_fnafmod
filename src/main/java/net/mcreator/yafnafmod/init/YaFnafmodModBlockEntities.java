
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.yafnafmod.init;

import net.minecraftforge.registries.RegistryObject;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.DeferredRegister;

import net.minecraft.world.level.block.entity.BlockEntityType;
import net.minecraft.world.level.block.Block;

import net.mcreator.yafnafmod.block.entity.WitheredJollyRatBlockTileEntity;
import net.mcreator.yafnafmod.block.entity.WitheredFreddyBlockTileEntity;
import net.mcreator.yafnafmod.block.entity.WitheredFoxyBlockTileEntity;
import net.mcreator.yafnafmod.block.entity.WitheredDougDogBlockTileEntity;
import net.mcreator.yafnafmod.block.entity.WitheredChicaBlockTileEntity;
import net.mcreator.yafnafmod.block.entity.WitheredBonnieBlockTileEntity;
import net.mcreator.yafnafmod.block.entity.WitheredBonbonBlockTileEntity;
import net.mcreator.yafnafmod.block.entity.WideFanTileEntity;
import net.mcreator.yafnafmod.block.entity.WallMakerBlockEntity;
import net.mcreator.yafnafmod.block.entity.VanRideTileEntity;
import net.mcreator.yafnafmod.block.entity.TvTubeBlockEntity;
import net.mcreator.yafnafmod.block.entity.TrashTileEntity;
import net.mcreator.yafnafmod.block.entity.TrashCanMeshTileEntity;
import net.mcreator.yafnafmod.block.entity.TrashCanFreddyTileEntity;
import net.mcreator.yafnafmod.block.entity.TrashCanFoxyTileEntity;
import net.mcreator.yafnafmod.block.entity.TrashCanCupcakeTileEntity;
import net.mcreator.yafnafmod.block.entity.TrashCanChicaTileEntity;
import net.mcreator.yafnafmod.block.entity.TrashCanBonnieTileEntity;
import net.mcreator.yafnafmod.block.entity.TrashBagGreenTileEntity;
import net.mcreator.yafnafmod.block.entity.TrashBagBlackTileEntity;
import net.mcreator.yafnafmod.block.entity.ToypugTileEntity;
import net.mcreator.yafnafmod.block.entity.ToyFreddyHeadTileEntity;
import net.mcreator.yafnafmod.block.entity.ToyFreddyBlockTileEntity;
import net.mcreator.yafnafmod.block.entity.ToyFoxyHeadTileEntity;
import net.mcreator.yafnafmod.block.entity.ToyFoxyBlockTileEntity;
import net.mcreator.yafnafmod.block.entity.ToyChicaHeadTileEntity;
import net.mcreator.yafnafmod.block.entity.ToyChicaChickenBlockTileEntity;
import net.mcreator.yafnafmod.block.entity.ToyBonnieHeadTileEntity;
import net.mcreator.yafnafmod.block.entity.ToyBonnieBlockTileEntity;
import net.mcreator.yafnafmod.block.entity.StarArchTileEntity;
import net.mcreator.yafnafmod.block.entity.StageSunCreepTileEntity;
import net.mcreator.yafnafmod.block.entity.StageMoonCreepTileEntity;
import net.mcreator.yafnafmod.block.entity.StageLightYellowTileEntity;
import net.mcreator.yafnafmod.block.entity.StageLightRedTileEntity;
import net.mcreator.yafnafmod.block.entity.StageLightPurpleTileEntity;
import net.mcreator.yafnafmod.block.entity.StageLightPinkTileEntity;
import net.mcreator.yafnafmod.block.entity.StageLightOrangeTileEntity;
import net.mcreator.yafnafmod.block.entity.StageLightGreenTileEntity;
import net.mcreator.yafnafmod.block.entity.StageLightBlueTileEntity;
import net.mcreator.yafnafmod.block.entity.SpringbonnieHeadTileEntity;
import net.mcreator.yafnafmod.block.entity.SpringbonnieBlockTileEntity;
import net.mcreator.yafnafmod.block.entity.SpringbonnieBlock01TileEntity;
import net.mcreator.yafnafmod.block.entity.SparkyDogBlockTileEntity;
import net.mcreator.yafnafmod.block.entity.SkeeballPizzarollerTileEntity;
import net.mcreator.yafnafmod.block.entity.SkeeballGenericTileEntity;
import net.mcreator.yafnafmod.block.entity.SinkKitchenTileEntity;
import net.mcreator.yafnafmod.block.entity.ShreddyFazchairBlockTileEntity;
import net.mcreator.yafnafmod.block.entity.ShopSignStansBudgetTechTileEntity;
import net.mcreator.yafnafmod.block.entity.ShopSignSmilesAndServosTileEntity;
import net.mcreator.yafnafmod.block.entity.ShopSignRareFindsAuctionTileEntity;
import net.mcreator.yafnafmod.block.entity.ShopSignDumpsterDiverTileEntity;
import net.mcreator.yafnafmod.block.entity.ShockInfuserBlockEntity;
import net.mcreator.yafnafmod.block.entity.SecurityVentBlockEntity;
import net.mcreator.yafnafmod.block.entity.SecurityPuppetPropTileEntity;
import net.mcreator.yafnafmod.block.entity.SecurityGateTileEntity;
import net.mcreator.yafnafmod.block.entity.SecurityDoorWindowBlockEntity;
import net.mcreator.yafnafmod.block.entity.SecurityDoorBlockEntity;
import net.mcreator.yafnafmod.block.entity.ScraptrapBlockTileEntity;
import net.mcreator.yafnafmod.block.entity.ScrapSparkyDogBlockTileEntity;
import net.mcreator.yafnafmod.block.entity.ScrapLolaChicaBlockTileEntity;
import net.mcreator.yafnafmod.block.entity.ScrapBabyBlockTileEntity;
import net.mcreator.yafnafmod.block.entity.ScooperTileEntity;
import net.mcreator.yafnafmod.block.entity.SanitationStationTileEntity;
import net.mcreator.yafnafmod.block.entity.RosieTileEntity;
import net.mcreator.yafnafmod.block.entity.RockstarFreddyBlockTileEntity;
import net.mcreator.yafnafmod.block.entity.RockstarFoxyBlockTileEntity;
import net.mcreator.yafnafmod.block.entity.RockstarChicaBlockTileEntity;
import net.mcreator.yafnafmod.block.entity.RockstarBonnieBlockTileEntity;
import net.mcreator.yafnafmod.block.entity.RidingRocketRedTileEntity;
import net.mcreator.yafnafmod.block.entity.RidingRocketPurpleTileEntity;
import net.mcreator.yafnafmod.block.entity.RickyRatBlockTileEntity;
import net.mcreator.yafnafmod.block.entity.RetroFreddyHeadTileEntity;
import net.mcreator.yafnafmod.block.entity.RetroFreddyBlockTileEntity;
import net.mcreator.yafnafmod.block.entity.RetroFoxyHeadTileEntity;
import net.mcreator.yafnafmod.block.entity.RetroFoxyBlockTileEntity;
import net.mcreator.yafnafmod.block.entity.RetroChicaHeadTileEntity;
import net.mcreator.yafnafmod.block.entity.RetroChicaBlockTileEntity;
import net.mcreator.yafnafmod.block.entity.RetroBonnieHeadTileEntity;
import net.mcreator.yafnafmod.block.entity.RetroBonnieBlockTileEntity;
import net.mcreator.yafnafmod.block.entity.RascBlockTileEntity;
import net.mcreator.yafnafmod.block.entity.PuppetBlockTileEntity;
import net.mcreator.yafnafmod.block.entity.ProjectorTileEntity;
import net.mcreator.yafnafmod.block.entity.PrizeKingTileEntity;
import net.mcreator.yafnafmod.block.entity.PotTileEntity;
import net.mcreator.yafnafmod.block.entity.PopgoesWeaselBlockTileEntity;
import net.mcreator.yafnafmod.block.entity.PlushFingertrapTileEntity;
import net.mcreator.yafnafmod.block.entity.PizzeriaStandingSignMovie2TileEntity;
import net.mcreator.yafnafmod.block.entity.PizzeriaSignMovieTileEntity;
import net.mcreator.yafnafmod.block.entity.PizzeriaSignMovieLargeTileEntity;
import net.mcreator.yafnafmod.block.entity.PizzeriaSignMovie2TileEntity;
import net.mcreator.yafnafmod.block.entity.PizzeriaSignJrsTileEntity;
import net.mcreator.yafnafmod.block.entity.PizzeriaSignJrs2TileEntity;
import net.mcreator.yafnafmod.block.entity.PizzeriaSignFrightsTileEntity;
import net.mcreator.yafnafmod.block.entity.PizzeriaSignFredbearsTileEntity;
import net.mcreator.yafnafmod.block.entity.PizzeriaSignFredbearsAltTileEntity;
import net.mcreator.yafnafmod.block.entity.PizzeriaSignFfpsTileEntity;
import net.mcreator.yafnafmod.block.entity.PizzeriaSignFfps2TileEntity;
import net.mcreator.yafnafmod.block.entity.PizzeriaSignChicasTileEntity;
import net.mcreator.yafnafmod.block.entity.PizzeriaSignBabysTileEntity;
import net.mcreator.yafnafmod.block.entity.PizzeriaSignBabysAltTileEntity;
import net.mcreator.yafnafmod.block.entity.PizzeriaSign1988TileEntity;
import net.mcreator.yafnafmod.block.entity.PizzeriaSign1987TileEntity;
import net.mcreator.yafnafmod.block.entity.PizzaOvenBlockEntity;
import net.mcreator.yafnafmod.block.entity.PizzaBoxStack2023TileEntity;
import net.mcreator.yafnafmod.block.entity.PizzaBoxStack1988TileEntity;
import net.mcreator.yafnafmod.block.entity.PizzaBoxStack1987TileEntity;
import net.mcreator.yafnafmod.block.entity.PizzaBoxStack1987AltTileEntity;
import net.mcreator.yafnafmod.block.entity.PizzaBoxStack1985TileEntity;
import net.mcreator.yafnafmod.block.entity.PizzaBoxStack1979TileEntity;
import net.mcreator.yafnafmod.block.entity.PizzaBox2023TileEntity;
import net.mcreator.yafnafmod.block.entity.PizzaBox2023EmptyTileEntity;
import net.mcreator.yafnafmod.block.entity.PizzaBox1988TileEntity;
import net.mcreator.yafnafmod.block.entity.PizzaBox1988EmptyTileEntity;
import net.mcreator.yafnafmod.block.entity.PizzaBox1987TileEntity;
import net.mcreator.yafnafmod.block.entity.PizzaBox1987EmptyTileEntity;
import net.mcreator.yafnafmod.block.entity.PizzaBox1987AltTileEntity;
import net.mcreator.yafnafmod.block.entity.PizzaBox1987AltEmptyTileEntity;
import net.mcreator.yafnafmod.block.entity.PizzaBox1985TileEntity;
import net.mcreator.yafnafmod.block.entity.PizzaBox1985EmptyTileEntity;
import net.mcreator.yafnafmod.block.entity.PizzaBox1979TileEntity;
import net.mcreator.yafnafmod.block.entity.PizzaBox1979EmptyTileEntity;
import net.mcreator.yafnafmod.block.entity.PinballToyFreddyTileEntity;
import net.mcreator.yafnafmod.block.entity.PinballToyFoxyTileEntity;
import net.mcreator.yafnafmod.block.entity.PinballToyChicaTileEntity;
import net.mcreator.yafnafmod.block.entity.PinballToyBonnieTileEntity;
import net.mcreator.yafnafmod.block.entity.PinTheBowtieToyFreddyTileEntity;
import net.mcreator.yafnafmod.block.entity.PinTheBowtieFreddyTileEntity;
import net.mcreator.yafnafmod.block.entity.PigpatchBlockTileEntity;
import net.mcreator.yafnafmod.block.entity.PiecesFuntimeFreddyTileEntity;
import net.mcreator.yafnafmod.block.entity.PiecesFuntimeFoxyTileEntity;
import net.mcreator.yafnafmod.block.entity.PiecesBalloraTileEntity;
import net.mcreator.yafnafmod.block.entity.PartsBoxTileEntity;
import net.mcreator.yafnafmod.block.entity.PanStanBlockTileEntity;
import net.mcreator.yafnafmod.block.entity.OrvilleElephantBlockTileEntity;
import net.mcreator.yafnafmod.block.entity.OldManConsequencesBlockTileEntity;
import net.mcreator.yafnafmod.block.entity.OfficeChairRedTileEntity;
import net.mcreator.yafnafmod.block.entity.OfficeChairBlackTileEntity;
import net.mcreator.yafnafmod.block.entity.NumberOneCrateBlockTileEntity;
import net.mcreator.yafnafmod.block.entity.NoveltyTrafficLightTileEntity;
import net.mcreator.yafnafmod.block.entity.NeonStageLightPinkTileEntity;
import net.mcreator.yafnafmod.block.entity.NeonStageLightOrangeTileEntity;
import net.mcreator.yafnafmod.block.entity.NeonStageLightGreenTileEntity;
import net.mcreator.yafnafmod.block.entity.NeonStageLightBlueTileEntity;
import net.mcreator.yafnafmod.block.entity.NeonSignRestroomTileEntity;
import net.mcreator.yafnafmod.block.entity.NeonSignPartyRoomTileEntity;
import net.mcreator.yafnafmod.block.entity.NeonSignKitchenTileEntity;
import net.mcreator.yafnafmod.block.entity.NeonSignArcadeTileEntity;
import net.mcreator.yafnafmod.block.entity.NeonJukeboxTileEntity;
import net.mcreator.yafnafmod.block.entity.NeddbearBlockTileEntity;
import net.mcreator.yafnafmod.block.entity.MusicManBlockTileEntity;
import net.mcreator.yafnafmod.block.entity.MusicBoxRedDecorationTileEntity;
import net.mcreator.yafnafmod.block.entity.MusicBoxPurpleDecorationTileEntity;
import net.mcreator.yafnafmod.block.entity.MusicBoxDecorationTileEntity;
import net.mcreator.yafnafmod.block.entity.MusicBoxBlockEntity;
import net.mcreator.yafnafmod.block.entity.MrHugsBlockTileEntity;
import net.mcreator.yafnafmod.block.entity.MrHippoBlockTileEntity;
import net.mcreator.yafnafmod.block.entity.MrCanDoBlockTileEntity;
import net.mcreator.yafnafmod.block.entity.MonitorWorkBlockEntity;
import net.mcreator.yafnafmod.block.entity.MoltenFreddyBlockTileEntity;
import net.mcreator.yafnafmod.block.entity.MedicalStationTileEntity;
import net.mcreator.yafnafmod.block.entity.MangleBlockTileEntity;
import net.mcreator.yafnafmod.block.entity.LolbitBlockTileEntity;
import net.mcreator.yafnafmod.block.entity.Lolbit409BlockTileEntity;
import net.mcreator.yafnafmod.block.entity.LolaChicaBlockTileEntity;
import net.mcreator.yafnafmod.block.entity.LockerYellowOpenBlockEntity;
import net.mcreator.yafnafmod.block.entity.LockerYellowBlockEntity;
import net.mcreator.yafnafmod.block.entity.LockerSilverBlockEntity;
import net.mcreator.yafnafmod.block.entity.LinkedLampBlockEntity;
import net.mcreator.yafnafmod.block.entity.LeftyBlockTileEntity;
import net.mcreator.yafnafmod.block.entity.LargeFanTileEntity;
import net.mcreator.yafnafmod.block.entity.LaptopTileEntity;
import net.mcreator.yafnafmod.block.entity.LaptopOldTileEntity;
import net.mcreator.yafnafmod.block.entity.LadderTowerTileEntity;
import net.mcreator.yafnafmod.block.entity.JollyRatBlockTileEntity;
import net.mcreator.yafnafmod.block.entity.JjBlockTileEntity;
import net.mcreator.yafnafmod.block.entity.IndigoBlockTileEntity;
import net.mcreator.yafnafmod.block.entity.IgnitedChicaBlockTileEntity;
import net.mcreator.yafnafmod.block.entity.HappyFrogBlockTileEntity;
import net.mcreator.yafnafmod.block.entity.GusThePugBlockTileEntity;
import net.mcreator.yafnafmod.block.entity.GravityVortexTileEntity;
import net.mcreator.yafnafmod.block.entity.GrandfatherClockTileEntity;
import net.mcreator.yafnafmod.block.entity.GeneratorBlockBlockEntity;
import net.mcreator.yafnafmod.block.entity.GarfeldTileEntity;
import net.mcreator.yafnafmod.block.entity.FuseboxBlockEntity;
import net.mcreator.yafnafmod.block.entity.FuntimeFreddyBlockTileEntity;
import net.mcreator.yafnafmod.block.entity.FuntimeFoxyBlockTileEntity;
import net.mcreator.yafnafmod.block.entity.FuntimeChicaBlockTileEntity;
import net.mcreator.yafnafmod.block.entity.FryingPanTileEntity;
import net.mcreator.yafnafmod.block.entity.FryerTileEntity;
import net.mcreator.yafnafmod.block.entity.FridgeWhiteTileEntity;
import net.mcreator.yafnafmod.block.entity.FridgeIndustrialTileEntity;
import net.mcreator.yafnafmod.block.entity.FridgeGrayTileEntity;
import net.mcreator.yafnafmod.block.entity.FreddyStandTileEntity;
import net.mcreator.yafnafmod.block.entity.FreddyHeadTileEntity;
import net.mcreator.yafnafmod.block.entity.FreddyFazbearBlockTileEntity;
import net.mcreator.yafnafmod.block.entity.FredbearHeadTileEntity;
import net.mcreator.yafnafmod.block.entity.FredbearBloodyWrapBlockTileEntity;
import net.mcreator.yafnafmod.block.entity.FredbearBloodyBlockTileEntity;
import net.mcreator.yafnafmod.block.entity.FredbearBlockTileEntity;
import net.mcreator.yafnafmod.block.entity.Fredbear01BlockTileEntity;
import net.mcreator.yafnafmod.block.entity.FoxyStandTileEntity;
import net.mcreator.yafnafmod.block.entity.FoxyPirateFixedBlockTileEntity;
import net.mcreator.yafnafmod.block.entity.FoxyPirateBlockTileEntity;
import net.mcreator.yafnafmod.block.entity.FoxyHeadTileEntity;
import net.mcreator.yafnafmod.block.entity.Fazcoins5TileEntity;
import net.mcreator.yafnafmod.block.entity.Fazcoins25TileEntity;
import net.mcreator.yafnafmod.block.entity.Fazcoins100TileEntity;
import net.mcreator.yafnafmod.block.entity.Fazcoins1000TileEntity;
import net.mcreator.yafnafmod.block.entity.Fazcoins10000TileEntity;
import net.mcreator.yafnafmod.block.entity.FazOvenTileEntity;
import net.mcreator.yafnafmod.block.entity.ExoticButterBasketTileEntity;
import net.mcreator.yafnafmod.block.entity.EnhancedSpeakerTileEntity;
import net.mcreator.yafnafmod.block.entity.Endo02PileTileEntity;
import net.mcreator.yafnafmod.block.entity.Endo02BlockTileEntity;
import net.mcreator.yafnafmod.block.entity.Endo01PropTileEntity;
import net.mcreator.yafnafmod.block.entity.Endo01PileTileEntity;
import net.mcreator.yafnafmod.block.entity.Endo01BlockTileEntity;
import net.mcreator.yafnafmod.block.entity.EmptyExoticButterBasketTileEntity;
import net.mcreator.yafnafmod.block.entity.ElevatorButtonBlockEntity;
import net.mcreator.yafnafmod.block.entity.ElChipBlockTileEntity;
import net.mcreator.yafnafmod.block.entity.EggBabyTileEntity;
import net.mcreator.yafnafmod.block.entity.DumpsterGreenTileEntity;
import net.mcreator.yafnafmod.block.entity.DumpsterBlueTileEntity;
import net.mcreator.yafnafmod.block.entity.DuckPondTileEntity;
import net.mcreator.yafnafmod.block.entity.DougDogBlockTileEntity;
import net.mcreator.yafnafmod.block.entity.DittophobiaFreddyBlockTileEntity;
import net.mcreator.yafnafmod.block.entity.DittophobiaFoxyBlockTileEntity;
import net.mcreator.yafnafmod.block.entity.DittophobiaChicaBlockTileEntity;
import net.mcreator.yafnafmod.block.entity.DittophobiaBonnieBlockTileEntity;
import net.mcreator.yafnafmod.block.entity.DittophobiaBbBlockTileEntity;
import net.mcreator.yafnafmod.block.entity.DiscountCoolingUnitTileEntity;
import net.mcreator.yafnafmod.block.entity.DiscountBallpitTileEntity;
import net.mcreator.yafnafmod.block.entity.DeluxeSpeakerTileEntity;
import net.mcreator.yafnafmod.block.entity.DeluxeBallpitTileEntity;
import net.mcreator.yafnafmod.block.entity.DeactivatedFuntimeFreddyTileEntity;
import net.mcreator.yafnafmod.block.entity.DeactivatedBalloraTileEntity;
import net.mcreator.yafnafmod.block.entity.DeactivatedBabyTileEntity;
import net.mcreator.yafnafmod.block.entity.CutoutTreePineTileEntity;
import net.mcreator.yafnafmod.block.entity.CutoutTreePalmTileEntity;
import net.mcreator.yafnafmod.block.entity.CutoutTreeOakTileEntity;
import net.mcreator.yafnafmod.block.entity.CutoutSpringbonnieTileEntity;
import net.mcreator.yafnafmod.block.entity.CutoutSpringbonnieRottenTileEntity;
import net.mcreator.yafnafmod.block.entity.CutoutHelpyTileEntity;
import net.mcreator.yafnafmod.block.entity.CutoutFreddyToyTileEntity;
import net.mcreator.yafnafmod.block.entity.CutoutFreddyRetroTileEntity;
import net.mcreator.yafnafmod.block.entity.CutoutFreddyFuntimeTileEntity;
import net.mcreator.yafnafmod.block.entity.CutoutFredbearTileEntity;
import net.mcreator.yafnafmod.block.entity.CutoutFredbearIcecreamTileEntity;
import net.mcreator.yafnafmod.block.entity.CutoutFredbearBittenTileEntity;
import net.mcreator.yafnafmod.block.entity.CutoutFoxyToyTileEntity;
import net.mcreator.yafnafmod.block.entity.CutoutFoxyRetroTileEntity;
import net.mcreator.yafnafmod.block.entity.CutoutFoxyFuntimeTileEntity;
import net.mcreator.yafnafmod.block.entity.CutoutFazvanTileEntity;
import net.mcreator.yafnafmod.block.entity.CutoutChicaToyTileEntity;
import net.mcreator.yafnafmod.block.entity.CutoutChicaRetroTileEntity;
import net.mcreator.yafnafmod.block.entity.CutoutBonnieToyTileEntity;
import net.mcreator.yafnafmod.block.entity.CutoutBonnieRetroTileEntity;
import net.mcreator.yafnafmod.block.entity.CutoutBalloraTileEntity;
import net.mcreator.yafnafmod.block.entity.CutoutBabyTileEntity;
import net.mcreator.yafnafmod.block.entity.CustomPizzeriaSignTileEntity;
import net.mcreator.yafnafmod.block.entity.CreativeGeneratorBlockBlockEntity;
import net.mcreator.yafnafmod.block.entity.ControlPanelTileEntity;
import net.mcreator.yafnafmod.block.entity.ConcertSpeakerTileEntity;
import net.mcreator.yafnafmod.block.entity.ClownLemonadeTileEntity;
import net.mcreator.yafnafmod.block.entity.ClownFruitPunchTileEntity;
import net.mcreator.yafnafmod.block.entity.ClockWallToyFreddyTileEntity;
import net.mcreator.yafnafmod.block.entity.ClockWallToyFoxyTileEntity;
import net.mcreator.yafnafmod.block.entity.ClockWallToyChicaTileEntity;
import net.mcreator.yafnafmod.block.entity.ClockWallToyBonnieTileEntity;
import net.mcreator.yafnafmod.block.entity.ClockWallTileEntity;
import net.mcreator.yafnafmod.block.entity.ClockWallSpringbonnieTileEntity;
import net.mcreator.yafnafmod.block.entity.ClockWallFreddyTileEntity;
import net.mcreator.yafnafmod.block.entity.ClockWallFredbearTileEntity;
import net.mcreator.yafnafmod.block.entity.ClockWallFoxyTileEntity;
import net.mcreator.yafnafmod.block.entity.ClockWallChicaTileEntity;
import net.mcreator.yafnafmod.block.entity.ClockWallBonnieTileEntity;
import net.mcreator.yafnafmod.block.entity.ClawMachinePizzaPartyTileEntity;
import net.mcreator.yafnafmod.block.entity.ClawMachineCupcakeBonanzaTileEntity;
import net.mcreator.yafnafmod.block.entity.CircusBabyClockTileEntity;
import net.mcreator.yafnafmod.block.entity.CircusBabyBlockTileEntity;
import net.mcreator.yafnafmod.block.entity.CindyCatBlockTileEntity;
import net.mcreator.yafnafmod.block.entity.ChicaStandTileEntity;
import net.mcreator.yafnafmod.block.entity.ChicaHeadTileEntity;
import net.mcreator.yafnafmod.block.entity.ChicaChickenBlockTileEntity;
import net.mcreator.yafnafmod.block.entity.ChairTortureBlockEntity;
import net.mcreator.yafnafmod.block.entity.CarouselTileEntity;
import net.mcreator.yafnafmod.block.entity.CarouselFreddyToyTileEntity;
import net.mcreator.yafnafmod.block.entity.CarouselFreddyTileEntity;
import net.mcreator.yafnafmod.block.entity.CarouselFreddyRetroTileEntity;
import net.mcreator.yafnafmod.block.entity.CarouselFredbearTileEntity;
import net.mcreator.yafnafmod.block.entity.CarnivalHoopsTileEntity;
import net.mcreator.yafnafmod.block.entity.CarStationWagonBlockTileEntity;
import net.mcreator.yafnafmod.block.entity.CarPurpleChevroletImpalaBlockTileEntity;
import net.mcreator.yafnafmod.block.entity.CarPoliceCruiserChevroletImpala1983BlockTileEntity;
import net.mcreator.yafnafmod.block.entity.CarHarleyMotorcycleBlockTileEntity;
import net.mcreator.yafnafmod.block.entity.CarFazvanPropTileEntity;
import net.mcreator.yafnafmod.block.entity.CarFazvanBlockTileEntity;
import net.mcreator.yafnafmod.block.entity.CarDodgeRam1982BlockTileEntity;
import net.mcreator.yafnafmod.block.entity.CarDesotoBlockTileEntity;
import net.mcreator.yafnafmod.block.entity.CandyCatBlockTileEntity;
import net.mcreator.yafnafmod.block.entity.CandyCadetTileEntity;
import net.mcreator.yafnafmod.block.entity.CameraTileEntity;
import net.mcreator.yafnafmod.block.entity.CabinetGrayBlockEntity;
import net.mcreator.yafnafmod.block.entity.BulletinBoardTileEntity;
import net.mcreator.yafnafmod.block.entity.BucketBobBlockTileEntity;
import net.mcreator.yafnafmod.block.entity.BrokenFreddyTileEntity;
import net.mcreator.yafnafmod.block.entity.BrokenFoxyTileEntity;
import net.mcreator.yafnafmod.block.entity.BrokenChicaTileEntity;
import net.mcreator.yafnafmod.block.entity.BrokenBonnieTileEntity;
import net.mcreator.yafnafmod.block.entity.BreakerControlTileEntity;
import net.mcreator.yafnafmod.block.entity.BoxPlush6TileEntity;
import net.mcreator.yafnafmod.block.entity.BoxPlush5TileEntity;
import net.mcreator.yafnafmod.block.entity.BoxPlush4TileEntity;
import net.mcreator.yafnafmod.block.entity.BoxPlush3TileEntity;
import net.mcreator.yafnafmod.block.entity.BoxPlush2TileEntity;
import net.mcreator.yafnafmod.block.entity.BoxPlush1TileEntity;
import net.mcreator.yafnafmod.block.entity.BoxPlatesTileEntity;
import net.mcreator.yafnafmod.block.entity.BoxEndoTileEntity;
import net.mcreator.yafnafmod.block.entity.BonnieStandTileEntity;
import net.mcreator.yafnafmod.block.entity.BonnieHeadTileEntity;
import net.mcreator.yafnafmod.block.entity.BonnieBunnyBlockTileEntity;
import net.mcreator.yafnafmod.block.entity.BonnetBlockTileEntity;
import net.mcreator.yafnafmod.block.entity.BonkABonTileEntity;
import net.mcreator.yafnafmod.block.entity.BonbonBlockTileEntity;
import net.mcreator.yafnafmod.block.entity.Bobbleheads3TileEntity;
import net.mcreator.yafnafmod.block.entity.Bobbleheads2TileEntity;
import net.mcreator.yafnafmod.block.entity.Bobbleheads1TileEntity;
import net.mcreator.yafnafmod.block.entity.BlastSecurityDoorTileEntity;
import net.mcreator.yafnafmod.block.entity.BlakeBadgerBlockTileEntity;
import net.mcreator.yafnafmod.block.entity.BigTrashBinMovieTileEntity;
import net.mcreator.yafnafmod.block.entity.BigSecurityDoorTileEntity;
import net.mcreator.yafnafmod.block.entity.BigRentalWindowedDoorTileEntity;
import net.mcreator.yafnafmod.block.entity.BigRentalDoorTileEntity;
import net.mcreator.yafnafmod.block.entity.BigOfficeDoorWindowed2TileEntity;
import net.mcreator.yafnafmod.block.entity.BigOfficeDoorWindowed1TileEntity;
import net.mcreator.yafnafmod.block.entity.BigKitchenWhiteDoorWideTileEntity;
import net.mcreator.yafnafmod.block.entity.BigKitchenWhiteDoorTileEntity;
import net.mcreator.yafnafmod.block.entity.BigKitchenDoorWideTileEntity;
import net.mcreator.yafnafmod.block.entity.BigKitchenDoorTileEntity;
import net.mcreator.yafnafmod.block.entity.BigFanTileEntity;
import net.mcreator.yafnafmod.block.entity.BigExitDoorTileEntity;
import net.mcreator.yafnafmod.block.entity.BigEntranceRedGlassDoorWideTileEntity;
import net.mcreator.yafnafmod.block.entity.BigEntranceRedGlassDoorTileEntity;
import net.mcreator.yafnafmod.block.entity.BigEntranceRedDoorWideTileEntity;
import net.mcreator.yafnafmod.block.entity.BigEntranceRedDoorTileEntity;
import net.mcreator.yafnafmod.block.entity.BigEntranceDoorWideTileEntity;
import net.mcreator.yafnafmod.block.entity.BigEntranceDoorTileEntity;
import net.mcreator.yafnafmod.block.entity.BigEntraceFancyRedWideTileEntity;
import net.mcreator.yafnafmod.block.entity.BigElevatorDoorTileEntity;
import net.mcreator.yafnafmod.block.entity.BigDecoratedGlassEntranceDoorWideTileEntity;
import net.mcreator.yafnafmod.block.entity.BigClosetTileEntity;
import net.mcreator.yafnafmod.block.entity.BigBedroomDoorTileEntity;
import net.mcreator.yafnafmod.block.entity.BigBackstageRedDoorWideTileEntity;
import net.mcreator.yafnafmod.block.entity.BigBackstageDoorTileEntity;
import net.mcreator.yafnafmod.block.entity.BigBackstageDoorRedTileEntity;
import net.mcreator.yafnafmod.block.entity.BigBackstageDoorGrayTileEntity;
import net.mcreator.yafnafmod.block.entity.BigBackstageDoorGray2TileEntity;
import net.mcreator.yafnafmod.block.entity.BigBackstageDoorBlackTileEntity;
import net.mcreator.yafnafmod.block.entity.BigBackstageDoorBlack2TileEntity;
import net.mcreator.yafnafmod.block.entity.BigBackstageDoor2TileEntity;
import net.mcreator.yafnafmod.block.entity.BathroomStallTileEntity;
import net.mcreator.yafnafmod.block.entity.BarryPolarBlockTileEntity;
import net.mcreator.yafnafmod.block.entity.BallpitVintageTileEntity;
import net.mcreator.yafnafmod.block.entity.BallpitTowerTileEntity;
import net.mcreator.yafnafmod.block.entity.BallpitRottenTileEntity;
import net.mcreator.yafnafmod.block.entity.BalloraBlockTileEntity;
import net.mcreator.yafnafmod.block.entity.BalloonCartTileEntity;
import net.mcreator.yafnafmod.block.entity.BalloonBoyBlockTileEntity;
import net.mcreator.yafnafmod.block.entity.BalloonBarrelTileEntity;
import net.mcreator.yafnafmod.block.entity.ArcadeTicketMuncherCupcakeTileEntity;
import net.mcreator.yafnafmod.block.entity.ArcadeRacingPinkTileEntity;
import net.mcreator.yafnafmod.block.entity.ArcadeRacingBlueTileEntity;
import net.mcreator.yafnafmod.block.entity.ArcadeMidnightMotoristTileEntity;
import net.mcreator.yafnafmod.block.entity.ArcadeLilHoopsTileEntity;
import net.mcreator.yafnafmod.block.entity.ArcadeFruityMazeTileEntity;
import net.mcreator.yafnafmod.block.entity.ArcadeFoosballTileEntity;
import net.mcreator.yafnafmod.block.entity.ArcadeCandyCraneMachineTileEntity;
import net.mcreator.yafnafmod.block.entity.ArcadeBigTreatPounderTileEntity;
import net.mcreator.yafnafmod.block.entity.AlarmClockOldBlockEntity;
import net.mcreator.yafnafmod.block.entity.AlarmClockBlockEntity;
import net.mcreator.yafnafmod.YaFnafmodMod;

public class YaFnafmodModBlockEntities {
	public static final DeferredRegister<BlockEntityType<?>> REGISTRY = DeferredRegister.create(ForgeRegistries.BLOCK_ENTITY_TYPES, YaFnafmodMod.MODID);
	public static final RegistryObject<BlockEntityType<?>> LOCKER_YELLOW = register("locker_yellow", YaFnafmodModBlocks.LOCKER_YELLOW, LockerYellowBlockEntity::new);
	public static final RegistryObject<BlockEntityType<?>> LOCKER_SILVER = register("locker_silver", YaFnafmodModBlocks.LOCKER_SILVER, LockerSilverBlockEntity::new);
	public static final RegistryObject<BlockEntityType<FreddyHeadTileEntity>> FREDDY_HEAD = REGISTRY.register("freddy_head", () -> BlockEntityType.Builder.of(FreddyHeadTileEntity::new, YaFnafmodModBlocks.FREDDY_HEAD.get()).build(null));
	public static final RegistryObject<BlockEntityType<?>> SECURITY_DOOR = register("security_door", YaFnafmodModBlocks.SECURITY_DOOR, SecurityDoorBlockEntity::new);
	public static final RegistryObject<BlockEntityType<?>> GENERATOR_BLOCK = register("generator_block", YaFnafmodModBlocks.GENERATOR_BLOCK, GeneratorBlockBlockEntity::new);
	public static final RegistryObject<BlockEntityType<?>> MUSIC_BOX = register("music_box", YaFnafmodModBlocks.MUSIC_BOX, MusicBoxBlockEntity::new);
	public static final RegistryObject<BlockEntityType<MusicBoxDecorationTileEntity>> MUSIC_BOX_DECORATION = REGISTRY.register("music_box_decoration",
			() -> BlockEntityType.Builder.of(MusicBoxDecorationTileEntity::new, YaFnafmodModBlocks.MUSIC_BOX_DECORATION.get()).build(null));
	public static final RegistryObject<BlockEntityType<CarouselTileEntity>> CAROUSEL = REGISTRY.register("carousel", () -> BlockEntityType.Builder.of(CarouselTileEntity::new, YaFnafmodModBlocks.CAROUSEL.get()).build(null));
	public static final RegistryObject<BlockEntityType<?>> WALL_MAKER = register("wall_maker", YaFnafmodModBlocks.WALL_MAKER, WallMakerBlockEntity::new);
	public static final RegistryObject<BlockEntityType<FreddyStandTileEntity>> FREDDY_STAND = REGISTRY.register("freddy_stand", () -> BlockEntityType.Builder.of(FreddyStandTileEntity::new, YaFnafmodModBlocks.FREDDY_STAND.get()).build(null));
	public static final RegistryObject<BlockEntityType<BonnieStandTileEntity>> BONNIE_STAND = REGISTRY.register("bonnie_stand", () -> BlockEntityType.Builder.of(BonnieStandTileEntity::new, YaFnafmodModBlocks.BONNIE_STAND.get()).build(null));
	public static final RegistryObject<BlockEntityType<ChicaStandTileEntity>> CHICA_STAND = REGISTRY.register("chica_stand", () -> BlockEntityType.Builder.of(ChicaStandTileEntity::new, YaFnafmodModBlocks.CHICA_STAND.get()).build(null));
	public static final RegistryObject<BlockEntityType<FoxyStandTileEntity>> FOXY_STAND = REGISTRY.register("foxy_stand", () -> BlockEntityType.Builder.of(FoxyStandTileEntity::new, YaFnafmodModBlocks.FOXY_STAND.get()).build(null));
	public static final RegistryObject<BlockEntityType<?>> LOCKER_YELLOW_OPEN = register("locker_yellow_open", YaFnafmodModBlocks.LOCKER_YELLOW_OPEN, LockerYellowOpenBlockEntity::new);
	public static final RegistryObject<BlockEntityType<PizzeriaSign1988TileEntity>> PIZZERIA_SIGN_1988 = REGISTRY.register("pizzeria_sign_1988",
			() -> BlockEntityType.Builder.of(PizzeriaSign1988TileEntity::new, YaFnafmodModBlocks.PIZZERIA_SIGN_1988.get()).build(null));
	public static final RegistryObject<BlockEntityType<PartsBoxTileEntity>> PARTS_BOX = REGISTRY.register("parts_box", () -> BlockEntityType.Builder.of(PartsBoxTileEntity::new, YaFnafmodModBlocks.PARTS_BOX.get()).build(null));
	public static final RegistryObject<BlockEntityType<Bobbleheads1TileEntity>> BOBBLEHEADS_1 = REGISTRY.register("bobbleheads_1", () -> BlockEntityType.Builder.of(Bobbleheads1TileEntity::new, YaFnafmodModBlocks.BOBBLEHEADS_1.get()).build(null));
	public static final RegistryObject<BlockEntityType<Endo01PropTileEntity>> ENDO_01_PROP = REGISTRY.register("endo_01_prop", () -> BlockEntityType.Builder.of(Endo01PropTileEntity::new, YaFnafmodModBlocks.ENDO_01_PROP.get()).build(null));
	public static final RegistryObject<BlockEntityType<PizzaBox1988TileEntity>> PIZZA_BOX_1988 = REGISTRY.register("pizza_box_1988", () -> BlockEntityType.Builder.of(PizzaBox1988TileEntity::new, YaFnafmodModBlocks.PIZZA_BOX_1988.get()).build(null));
	public static final RegistryObject<BlockEntityType<GrandfatherClockTileEntity>> GRANDFATHER_CLOCK = REGISTRY.register("grandfather_clock",
			() -> BlockEntityType.Builder.of(GrandfatherClockTileEntity::new, YaFnafmodModBlocks.GRANDFATHER_CLOCK.get()).build(null));
	public static final RegistryObject<BlockEntityType<?>> ALARM_CLOCK = register("alarm_clock", YaFnafmodModBlocks.ALARM_CLOCK, AlarmClockBlockEntity::new);
	public static final RegistryObject<BlockEntityType<CutoutFredbearTileEntity>> CUTOUT_FREDBEAR = REGISTRY.register("cutout_fredbear",
			() -> BlockEntityType.Builder.of(CutoutFredbearTileEntity::new, YaFnafmodModBlocks.CUTOUT_FREDBEAR.get()).build(null));
	public static final RegistryObject<BlockEntityType<CutoutSpringbonnieTileEntity>> CUTOUT_SPRINGBONNIE = REGISTRY.register("cutout_springbonnie",
			() -> BlockEntityType.Builder.of(CutoutSpringbonnieTileEntity::new, YaFnafmodModBlocks.CUTOUT_SPRINGBONNIE.get()).build(null));
	public static final RegistryObject<BlockEntityType<PizzeriaSignFredbearsAltTileEntity>> PIZZERIA_SIGN_FREDBEARS_ALT = REGISTRY.register("pizzeria_sign_fredbears_alt",
			() -> BlockEntityType.Builder.of(PizzeriaSignFredbearsAltTileEntity::new, YaFnafmodModBlocks.PIZZERIA_SIGN_FREDBEARS_ALT.get()).build(null));
	public static final RegistryObject<BlockEntityType<PlushFingertrapTileEntity>> PLUSH_FINGERTRAP = REGISTRY.register("plush_fingertrap",
			() -> BlockEntityType.Builder.of(PlushFingertrapTileEntity::new, YaFnafmodModBlocks.PLUSH_FINGERTRAP.get()).build(null));
	public static final RegistryObject<BlockEntityType<PizzaBox1979TileEntity>> PIZZA_BOX_1979 = REGISTRY.register("pizza_box_1979", () -> BlockEntityType.Builder.of(PizzaBox1979TileEntity::new, YaFnafmodModBlocks.PIZZA_BOX_1979.get()).build(null));
	public static final RegistryObject<BlockEntityType<?>> CABINET_GRAY = register("cabinet_gray", YaFnafmodModBlocks.CABINET_GRAY, CabinetGrayBlockEntity::new);
	public static final RegistryObject<BlockEntityType<?>> FUSEBOX = register("fusebox", YaFnafmodModBlocks.FUSEBOX, FuseboxBlockEntity::new);
	public static final RegistryObject<BlockEntityType<PizzaBox1988EmptyTileEntity>> PIZZA_BOX_1988_EMPTY = REGISTRY.register("pizza_box_1988_empty",
			() -> BlockEntityType.Builder.of(PizzaBox1988EmptyTileEntity::new, YaFnafmodModBlocks.PIZZA_BOX_1988_EMPTY.get()).build(null));
	public static final RegistryObject<BlockEntityType<PizzaBox1979EmptyTileEntity>> PIZZA_BOX_1979_EMPTY = REGISTRY.register("pizza_box_1979_empty",
			() -> BlockEntityType.Builder.of(PizzaBox1979EmptyTileEntity::new, YaFnafmodModBlocks.PIZZA_BOX_1979_EMPTY.get()).build(null));
	public static final RegistryObject<BlockEntityType<BigFanTileEntity>> BIG_FAN = REGISTRY.register("big_fan", () -> BlockEntityType.Builder.of(BigFanTileEntity::new, YaFnafmodModBlocks.BIG_FAN.get()).build(null));
	public static final RegistryObject<BlockEntityType<FreddyFazbearBlockTileEntity>> FREDDY_FAZBEAR_BLOCK = REGISTRY.register("freddy_fazbear_block",
			() -> BlockEntityType.Builder.of(FreddyFazbearBlockTileEntity::new, YaFnafmodModBlocks.FREDDY_FAZBEAR_BLOCK.get()).build(null));
	public static final RegistryObject<BlockEntityType<BarryPolarBlockTileEntity>> BARRY_POLAR_BLOCK = REGISTRY.register("barry_polar_block",
			() -> BlockEntityType.Builder.of(BarryPolarBlockTileEntity::new, YaFnafmodModBlocks.BARRY_POLAR_BLOCK.get()).build(null));
	public static final RegistryObject<BlockEntityType<BonnieBunnyBlockTileEntity>> BONNIE_BUNNY_BLOCK = REGISTRY.register("bonnie_bunny_block",
			() -> BlockEntityType.Builder.of(BonnieBunnyBlockTileEntity::new, YaFnafmodModBlocks.BONNIE_BUNNY_BLOCK.get()).build(null));
	public static final RegistryObject<BlockEntityType<FoxyPirateBlockTileEntity>> FOXY_PIRATE_BLOCK = REGISTRY.register("foxy_pirate_block",
			() -> BlockEntityType.Builder.of(FoxyPirateBlockTileEntity::new, YaFnafmodModBlocks.FOXY_PIRATE_BLOCK.get()).build(null));
	public static final RegistryObject<BlockEntityType<FoxyPirateFixedBlockTileEntity>> FOXY_PIRATE_FIXED_BLOCK = REGISTRY.register("foxy_pirate_fixed_block",
			() -> BlockEntityType.Builder.of(FoxyPirateFixedBlockTileEntity::new, YaFnafmodModBlocks.FOXY_PIRATE_FIXED_BLOCK.get()).build(null));
	public static final RegistryObject<BlockEntityType<ToyFreddyBlockTileEntity>> TOY_FREDDY_BLOCK = REGISTRY.register("toy_freddy_block",
			() -> BlockEntityType.Builder.of(ToyFreddyBlockTileEntity::new, YaFnafmodModBlocks.TOY_FREDDY_BLOCK.get()).build(null));
	public static final RegistryObject<BlockEntityType<ToyBonnieBlockTileEntity>> TOY_BONNIE_BLOCK = REGISTRY.register("toy_bonnie_block",
			() -> BlockEntityType.Builder.of(ToyBonnieBlockTileEntity::new, YaFnafmodModBlocks.TOY_BONNIE_BLOCK.get()).build(null));
	public static final RegistryObject<BlockEntityType<MangleBlockTileEntity>> MANGLE_BLOCK = REGISTRY.register("mangle_block", () -> BlockEntityType.Builder.of(MangleBlockTileEntity::new, YaFnafmodModBlocks.MANGLE_BLOCK.get()).build(null));
	public static final RegistryObject<BlockEntityType<ChicaChickenBlockTileEntity>> CHICA_CHICKEN_BLOCK = REGISTRY.register("chica_chicken_block",
			() -> BlockEntityType.Builder.of(ChicaChickenBlockTileEntity::new, YaFnafmodModBlocks.CHICA_CHICKEN_BLOCK.get()).build(null));
	public static final RegistryObject<BlockEntityType<ToyChicaChickenBlockTileEntity>> TOY_CHICA_CHICKEN_BLOCK = REGISTRY.register("toy_chica_chicken_block",
			() -> BlockEntityType.Builder.of(ToyChicaChickenBlockTileEntity::new, YaFnafmodModBlocks.TOY_CHICA_CHICKEN_BLOCK.get()).build(null));
	public static final RegistryObject<BlockEntityType<WitheredFreddyBlockTileEntity>> WITHERED_FREDDY_BLOCK = REGISTRY.register("withered_freddy_block",
			() -> BlockEntityType.Builder.of(WitheredFreddyBlockTileEntity::new, YaFnafmodModBlocks.WITHERED_FREDDY_BLOCK.get()).build(null));
	public static final RegistryObject<BlockEntityType<RetroFreddyBlockTileEntity>> RETRO_FREDDY_BLOCK = REGISTRY.register("retro_freddy_block",
			() -> BlockEntityType.Builder.of(RetroFreddyBlockTileEntity::new, YaFnafmodModBlocks.RETRO_FREDDY_BLOCK.get()).build(null));
	public static final RegistryObject<BlockEntityType<WitheredBonnieBlockTileEntity>> WITHERED_BONNIE_BLOCK = REGISTRY.register("withered_bonnie_block",
			() -> BlockEntityType.Builder.of(WitheredBonnieBlockTileEntity::new, YaFnafmodModBlocks.WITHERED_BONNIE_BLOCK.get()).build(null));
	public static final RegistryObject<BlockEntityType<RetroBonnieBlockTileEntity>> RETRO_BONNIE_BLOCK = REGISTRY.register("retro_bonnie_block",
			() -> BlockEntityType.Builder.of(RetroBonnieBlockTileEntity::new, YaFnafmodModBlocks.RETRO_BONNIE_BLOCK.get()).build(null));
	public static final RegistryObject<BlockEntityType<FredbearBlockTileEntity>> FREDBEAR_BLOCK = REGISTRY.register("fredbear_block",
			() -> BlockEntityType.Builder.of(FredbearBlockTileEntity::new, YaFnafmodModBlocks.FREDBEAR_BLOCK.get()).build(null));
	public static final RegistryObject<BlockEntityType<Fredbear01BlockTileEntity>> FREDBEAR_01_BLOCK = REGISTRY.register("fredbear_01_block",
			() -> BlockEntityType.Builder.of(Fredbear01BlockTileEntity::new, YaFnafmodModBlocks.FREDBEAR_01_BLOCK.get()).build(null));
	public static final RegistryObject<BlockEntityType<?>> LINKED_LAMP = register("linked_lamp", YaFnafmodModBlocks.LINKED_LAMP, LinkedLampBlockEntity::new);
	public static final RegistryObject<BlockEntityType<ControlPanelTileEntity>> CONTROL_PANEL = REGISTRY.register("control_panel", () -> BlockEntityType.Builder.of(ControlPanelTileEntity::new, YaFnafmodModBlocks.CONTROL_PANEL.get()).build(null));
	public static final RegistryObject<BlockEntityType<?>> SHOCK_INFUSER = register("shock_infuser", YaFnafmodModBlocks.SHOCK_INFUSER, ShockInfuserBlockEntity::new);
	public static final RegistryObject<BlockEntityType<BreakerControlTileEntity>> BREAKER_CONTROL = REGISTRY.register("breaker_control",
			() -> BlockEntityType.Builder.of(BreakerControlTileEntity::new, YaFnafmodModBlocks.BREAKER_CONTROL.get()).build(null));
	public static final RegistryObject<BlockEntityType<LargeFanTileEntity>> LARGE_FAN = REGISTRY.register("large_fan", () -> BlockEntityType.Builder.of(LargeFanTileEntity::new, YaFnafmodModBlocks.LARGE_FAN.get()).build(null));
	public static final RegistryObject<BlockEntityType<ScooperTileEntity>> SCOOPER = REGISTRY.register("scooper", () -> BlockEntityType.Builder.of(ScooperTileEntity::new, YaFnafmodModBlocks.SCOOPER.get()).build(null));
	public static final RegistryObject<BlockEntityType<?>> SECURITY_VENT = register("security_vent", YaFnafmodModBlocks.SECURITY_VENT, SecurityVentBlockEntity::new);
	public static final RegistryObject<BlockEntityType<DeactivatedBabyTileEntity>> DEACTIVATED_BABY = REGISTRY.register("deactivated_baby",
			() -> BlockEntityType.Builder.of(DeactivatedBabyTileEntity::new, YaFnafmodModBlocks.DEACTIVATED_BABY.get()).build(null));
	public static final RegistryObject<BlockEntityType<DeactivatedFuntimeFreddyTileEntity>> DEACTIVATED_FUNTIME_FREDDY = REGISTRY.register("deactivated_funtime_freddy",
			() -> BlockEntityType.Builder.of(DeactivatedFuntimeFreddyTileEntity::new, YaFnafmodModBlocks.DEACTIVATED_FUNTIME_FREDDY.get()).build(null));
	public static final RegistryObject<BlockEntityType<DeactivatedBalloraTileEntity>> DEACTIVATED_BALLORA = REGISTRY.register("deactivated_ballora",
			() -> BlockEntityType.Builder.of(DeactivatedBalloraTileEntity::new, YaFnafmodModBlocks.DEACTIVATED_BALLORA.get()).build(null));
	public static final RegistryObject<BlockEntityType<PiecesFuntimeFreddyTileEntity>> PIECES_FUNTIME_FREDDY = REGISTRY.register("pieces_funtime_freddy",
			() -> BlockEntityType.Builder.of(PiecesFuntimeFreddyTileEntity::new, YaFnafmodModBlocks.PIECES_FUNTIME_FREDDY.get()).build(null));
	public static final RegistryObject<BlockEntityType<PiecesFuntimeFoxyTileEntity>> PIECES_FUNTIME_FOXY = REGISTRY.register("pieces_funtime_foxy",
			() -> BlockEntityType.Builder.of(PiecesFuntimeFoxyTileEntity::new, YaFnafmodModBlocks.PIECES_FUNTIME_FOXY.get()).build(null));
	public static final RegistryObject<BlockEntityType<PiecesBalloraTileEntity>> PIECES_BALLORA = REGISTRY.register("pieces_ballora",
			() -> BlockEntityType.Builder.of(PiecesBalloraTileEntity::new, YaFnafmodModBlocks.PIECES_BALLORA.get()).build(null));
	public static final RegistryObject<BlockEntityType<ExoticButterBasketTileEntity>> EXOTIC_BUTTER_BASKET = REGISTRY.register("exotic_butter_basket",
			() -> BlockEntityType.Builder.of(ExoticButterBasketTileEntity::new, YaFnafmodModBlocks.EXOTIC_BUTTER_BASKET.get()).build(null));
	public static final RegistryObject<BlockEntityType<EmptyExoticButterBasketTileEntity>> EMPTY_EXOTIC_BUTTER_BASKET = REGISTRY.register("empty_exotic_butter_basket",
			() -> BlockEntityType.Builder.of(EmptyExoticButterBasketTileEntity::new, YaFnafmodModBlocks.EMPTY_EXOTIC_BUTTER_BASKET.get()).build(null));
	public static final RegistryObject<BlockEntityType<PizzeriaSignBabysTileEntity>> PIZZERIA_SIGN_BABYS = REGISTRY.register("pizzeria_sign_babys",
			() -> BlockEntityType.Builder.of(PizzeriaSignBabysTileEntity::new, YaFnafmodModBlocks.PIZZERIA_SIGN_BABYS.get()).build(null));
	public static final RegistryObject<BlockEntityType<PizzeriaSignBabysAltTileEntity>> PIZZERIA_SIGN_BABYS_ALT = REGISTRY.register("pizzeria_sign_babys_alt",
			() -> BlockEntityType.Builder.of(PizzeriaSignBabysAltTileEntity::new, YaFnafmodModBlocks.PIZZERIA_SIGN_BABYS_ALT.get()).build(null));
	public static final RegistryObject<BlockEntityType<PizzeriaSignChicasTileEntity>> PIZZERIA_SIGN_CHICAS = REGISTRY.register("pizzeria_sign_chicas",
			() -> BlockEntityType.Builder.of(PizzeriaSignChicasTileEntity::new, YaFnafmodModBlocks.PIZZERIA_SIGN_CHICAS.get()).build(null));
	public static final RegistryObject<BlockEntityType<PuppetBlockTileEntity>> PUPPET_BLOCK = REGISTRY.register("puppet_block", () -> BlockEntityType.Builder.of(PuppetBlockTileEntity::new, YaFnafmodModBlocks.PUPPET_BLOCK.get()).build(null));
	public static final RegistryObject<BlockEntityType<ToyFoxyBlockTileEntity>> TOY_FOXY_BLOCK = REGISTRY.register("toy_foxy_block", () -> BlockEntityType.Builder.of(ToyFoxyBlockTileEntity::new, YaFnafmodModBlocks.TOY_FOXY_BLOCK.get()).build(null));
	public static final RegistryObject<BlockEntityType<WitheredChicaBlockTileEntity>> WITHERED_CHICA_BLOCK = REGISTRY.register("withered_chica_block",
			() -> BlockEntityType.Builder.of(WitheredChicaBlockTileEntity::new, YaFnafmodModBlocks.WITHERED_CHICA_BLOCK.get()).build(null));
	public static final RegistryObject<BlockEntityType<RetroChicaBlockTileEntity>> RETRO_CHICA_BLOCK = REGISTRY.register("retro_chica_block",
			() -> BlockEntityType.Builder.of(RetroChicaBlockTileEntity::new, YaFnafmodModBlocks.RETRO_CHICA_BLOCK.get()).build(null));
	public static final RegistryObject<BlockEntityType<CutoutFredbearIcecreamTileEntity>> CUTOUT_FREDBEAR_ICECREAM = REGISTRY.register("cutout_fredbear_icecream",
			() -> BlockEntityType.Builder.of(CutoutFredbearIcecreamTileEntity::new, YaFnafmodModBlocks.CUTOUT_FREDBEAR_ICECREAM.get()).build(null));
	public static final RegistryObject<BlockEntityType<BalloonBarrelTileEntity>> BALLOON_BARREL = REGISTRY.register("balloon_barrel",
			() -> BlockEntityType.Builder.of(BalloonBarrelTileEntity::new, YaFnafmodModBlocks.BALLOON_BARREL.get()).build(null));
	public static final RegistryObject<BlockEntityType<DiscountBallpitTileEntity>> DISCOUNT_BALLPIT = REGISTRY.register("discount_ballpit",
			() -> BlockEntityType.Builder.of(DiscountBallpitTileEntity::new, YaFnafmodModBlocks.DISCOUNT_BALLPIT.get()).build(null));
	public static final RegistryObject<BlockEntityType<SanitationStationTileEntity>> SANITATION_STATION = REGISTRY.register("sanitation_station",
			() -> BlockEntityType.Builder.of(SanitationStationTileEntity::new, YaFnafmodModBlocks.SANITATION_STATION.get()).build(null));
	public static final RegistryObject<BlockEntityType<DiscountCoolingUnitTileEntity>> DISCOUNT_COOLING_UNIT = REGISTRY.register("discount_cooling_unit",
			() -> BlockEntityType.Builder.of(DiscountCoolingUnitTileEntity::new, YaFnafmodModBlocks.DISCOUNT_COOLING_UNIT.get()).build(null));
	public static final RegistryObject<BlockEntityType<DuckPondTileEntity>> DUCK_POND = REGISTRY.register("duck_pond", () -> BlockEntityType.Builder.of(DuckPondTileEntity::new, YaFnafmodModBlocks.DUCK_POND.get()).build(null));
	public static final RegistryObject<BlockEntityType<PinTheBowtieFreddyTileEntity>> PIN_THE_BOWTIE_FREDDY = REGISTRY.register("pin_the_bowtie_freddy",
			() -> BlockEntityType.Builder.of(PinTheBowtieFreddyTileEntity::new, YaFnafmodModBlocks.PIN_THE_BOWTIE_FREDDY.get()).build(null));
	public static final RegistryObject<BlockEntityType<PinTheBowtieToyFreddyTileEntity>> PIN_THE_BOWTIE_TOY_FREDDY = REGISTRY.register("pin_the_bowtie_toy_freddy",
			() -> BlockEntityType.Builder.of(PinTheBowtieToyFreddyTileEntity::new, YaFnafmodModBlocks.PIN_THE_BOWTIE_TOY_FREDDY.get()).build(null));
	public static final RegistryObject<BlockEntityType<CarPurpleChevroletImpalaBlockTileEntity>> CAR_PURPLE_CHEVROLET_IMPALA_BLOCK = REGISTRY.register("car_purple_chevrolet_impala_block",
			() -> BlockEntityType.Builder.of(CarPurpleChevroletImpalaBlockTileEntity::new, YaFnafmodModBlocks.CAR_PURPLE_CHEVROLET_IMPALA_BLOCK.get()).build(null));
	public static final RegistryObject<BlockEntityType<EnhancedSpeakerTileEntity>> ENHANCED_SPEAKER = REGISTRY.register("enhanced_speaker",
			() -> BlockEntityType.Builder.of(EnhancedSpeakerTileEntity::new, YaFnafmodModBlocks.ENHANCED_SPEAKER.get()).build(null));
	public static final RegistryObject<BlockEntityType<DeluxeSpeakerTileEntity>> DELUXE_SPEAKER = REGISTRY.register("deluxe_speaker",
			() -> BlockEntityType.Builder.of(DeluxeSpeakerTileEntity::new, YaFnafmodModBlocks.DELUXE_SPEAKER.get()).build(null));
	public static final RegistryObject<BlockEntityType<ArcadeFruityMazeTileEntity>> ARCADE_FRUITY_MAZE = REGISTRY.register("arcade_fruity_maze",
			() -> BlockEntityType.Builder.of(ArcadeFruityMazeTileEntity::new, YaFnafmodModBlocks.ARCADE_FRUITY_MAZE.get()).build(null));
	public static final RegistryObject<BlockEntityType<ArcadeMidnightMotoristTileEntity>> ARCADE_MIDNIGHT_MOTORIST = REGISTRY.register("arcade_midnight_motorist",
			() -> BlockEntityType.Builder.of(ArcadeMidnightMotoristTileEntity::new, YaFnafmodModBlocks.ARCADE_MIDNIGHT_MOTORIST.get()).build(null));
	public static final RegistryObject<BlockEntityType<StarArchTileEntity>> STAR_ARCH = REGISTRY.register("star_arch", () -> BlockEntityType.Builder.of(StarArchTileEntity::new, YaFnafmodModBlocks.STAR_ARCH.get()).build(null));
	public static final RegistryObject<BlockEntityType<NoveltyTrafficLightTileEntity>> NOVELTY_TRAFFIC_LIGHT = REGISTRY.register("novelty_traffic_light",
			() -> BlockEntityType.Builder.of(NoveltyTrafficLightTileEntity::new, YaFnafmodModBlocks.NOVELTY_TRAFFIC_LIGHT.get()).build(null));
	public static final RegistryObject<BlockEntityType<CandyCadetTileEntity>> CANDY_CADET = REGISTRY.register("candy_cadet", () -> BlockEntityType.Builder.of(CandyCadetTileEntity::new, YaFnafmodModBlocks.CANDY_CADET.get()).build(null));
	public static final RegistryObject<BlockEntityType<ShopSignDumpsterDiverTileEntity>> SHOP_SIGN_DUMPSTER_DIVER = REGISTRY.register("shop_sign_dumpster_diver",
			() -> BlockEntityType.Builder.of(ShopSignDumpsterDiverTileEntity::new, YaFnafmodModBlocks.SHOP_SIGN_DUMPSTER_DIVER.get()).build(null));
	public static final RegistryObject<BlockEntityType<ConcertSpeakerTileEntity>> CONCERT_SPEAKER = REGISTRY.register("concert_speaker",
			() -> BlockEntityType.Builder.of(ConcertSpeakerTileEntity::new, YaFnafmodModBlocks.CONCERT_SPEAKER.get()).build(null));
	public static final RegistryObject<BlockEntityType<NeonStageLightGreenTileEntity>> NEON_STAGE_LIGHT_GREEN = REGISTRY.register("neon_stage_light_green",
			() -> BlockEntityType.Builder.of(NeonStageLightGreenTileEntity::new, YaFnafmodModBlocks.NEON_STAGE_LIGHT_GREEN.get()).build(null));
	public static final RegistryObject<BlockEntityType<NeonStageLightBlueTileEntity>> NEON_STAGE_LIGHT_BLUE = REGISTRY.register("neon_stage_light_blue",
			() -> BlockEntityType.Builder.of(NeonStageLightBlueTileEntity::new, YaFnafmodModBlocks.NEON_STAGE_LIGHT_BLUE.get()).build(null));
	public static final RegistryObject<BlockEntityType<NeonStageLightPinkTileEntity>> NEON_STAGE_LIGHT_PINK = REGISTRY.register("neon_stage_light_pink",
			() -> BlockEntityType.Builder.of(NeonStageLightPinkTileEntity::new, YaFnafmodModBlocks.NEON_STAGE_LIGHT_PINK.get()).build(null));
	public static final RegistryObject<BlockEntityType<NeonStageLightOrangeTileEntity>> NEON_STAGE_LIGHT_ORANGE = REGISTRY.register("neon_stage_light_orange",
			() -> BlockEntityType.Builder.of(NeonStageLightOrangeTileEntity::new, YaFnafmodModBlocks.NEON_STAGE_LIGHT_ORANGE.get()).build(null));
	public static final RegistryObject<BlockEntityType<CarDodgeRam1982BlockTileEntity>> CAR_DODGE_RAM_1982_BLOCK = REGISTRY.register("car_dodge_ram_1982_block",
			() -> BlockEntityType.Builder.of(CarDodgeRam1982BlockTileEntity::new, YaFnafmodModBlocks.CAR_DODGE_RAM_1982_BLOCK.get()).build(null));
	public static final RegistryObject<BlockEntityType<BallpitTowerTileEntity>> BALLPIT_TOWER = REGISTRY.register("ballpit_tower", () -> BlockEntityType.Builder.of(BallpitTowerTileEntity::new, YaFnafmodModBlocks.BALLPIT_TOWER.get()).build(null));
	public static final RegistryObject<BlockEntityType<RetroFoxyBlockTileEntity>> RETRO_FOXY_BLOCK = REGISTRY.register("retro_foxy_block",
			() -> BlockEntityType.Builder.of(RetroFoxyBlockTileEntity::new, YaFnafmodModBlocks.RETRO_FOXY_BLOCK.get()).build(null));
	public static final RegistryObject<BlockEntityType<WitheredFoxyBlockTileEntity>> WITHERED_FOXY_BLOCK = REGISTRY.register("withered_foxy_block",
			() -> BlockEntityType.Builder.of(WitheredFoxyBlockTileEntity::new, YaFnafmodModBlocks.WITHERED_FOXY_BLOCK.get()).build(null));
	public static final RegistryObject<BlockEntityType<CarnivalHoopsTileEntity>> CARNIVAL_HOOPS = REGISTRY.register("carnival_hoops",
			() -> BlockEntityType.Builder.of(CarnivalHoopsTileEntity::new, YaFnafmodModBlocks.CARNIVAL_HOOPS.get()).build(null));
	public static final RegistryObject<BlockEntityType<LadderTowerTileEntity>> LADDER_TOWER = REGISTRY.register("ladder_tower", () -> BlockEntityType.Builder.of(LadderTowerTileEntity::new, YaFnafmodModBlocks.LADDER_TOWER.get()).build(null));
	public static final RegistryObject<BlockEntityType<RidingRocketRedTileEntity>> RIDING_ROCKET_RED = REGISTRY.register("riding_rocket_red",
			() -> BlockEntityType.Builder.of(RidingRocketRedTileEntity::new, YaFnafmodModBlocks.RIDING_ROCKET_RED.get()).build(null));
	public static final RegistryObject<BlockEntityType<RidingRocketPurpleTileEntity>> RIDING_ROCKET_PURPLE = REGISTRY.register("riding_rocket_purple",
			() -> BlockEntityType.Builder.of(RidingRocketPurpleTileEntity::new, YaFnafmodModBlocks.RIDING_ROCKET_PURPLE.get()).build(null));
	public static final RegistryObject<BlockEntityType<ClownLemonadeTileEntity>> CLOWN_LEMONADE = REGISTRY.register("clown_lemonade",
			() -> BlockEntityType.Builder.of(ClownLemonadeTileEntity::new, YaFnafmodModBlocks.CLOWN_LEMONADE.get()).build(null));
	public static final RegistryObject<BlockEntityType<ClownFruitPunchTileEntity>> CLOWN_FRUIT_PUNCH = REGISTRY.register("clown_fruit_punch",
			() -> BlockEntityType.Builder.of(ClownFruitPunchTileEntity::new, YaFnafmodModBlocks.CLOWN_FRUIT_PUNCH.get()).build(null));
	public static final RegistryObject<BlockEntityType<NeonJukeboxTileEntity>> NEON_JUKEBOX = REGISTRY.register("neon_jukebox", () -> BlockEntityType.Builder.of(NeonJukeboxTileEntity::new, YaFnafmodModBlocks.NEON_JUKEBOX.get()).build(null));
	public static final RegistryObject<BlockEntityType<MedicalStationTileEntity>> MEDICAL_STATION = REGISTRY.register("medical_station",
			() -> BlockEntityType.Builder.of(MedicalStationTileEntity::new, YaFnafmodModBlocks.MEDICAL_STATION.get()).build(null));
	public static final RegistryObject<BlockEntityType<BlastSecurityDoorTileEntity>> BLAST_SECURITY_DOOR = REGISTRY.register("blast_security_door",
			() -> BlockEntityType.Builder.of(BlastSecurityDoorTileEntity::new, YaFnafmodModBlocks.BLAST_SECURITY_DOOR.get()).build(null));
	public static final RegistryObject<BlockEntityType<?>> CREATIVE_GENERATOR_BLOCK = register("creative_generator_block", YaFnafmodModBlocks.CREATIVE_GENERATOR_BLOCK, CreativeGeneratorBlockBlockEntity::new);
	public static final RegistryObject<BlockEntityType<PizzeriaSignFfpsTileEntity>> PIZZERIA_SIGN_FFPS = REGISTRY.register("pizzeria_sign_ffps",
			() -> BlockEntityType.Builder.of(PizzeriaSignFfpsTileEntity::new, YaFnafmodModBlocks.PIZZERIA_SIGN_FFPS.get()).build(null));
	public static final RegistryObject<BlockEntityType<PizzeriaSignMovieTileEntity>> PIZZERIA_SIGN_MOVIE = REGISTRY.register("pizzeria_sign_movie",
			() -> BlockEntityType.Builder.of(PizzeriaSignMovieTileEntity::new, YaFnafmodModBlocks.PIZZERIA_SIGN_MOVIE.get()).build(null));
	public static final RegistryObject<BlockEntityType<PizzeriaSignMovie2TileEntity>> PIZZERIA_SIGN_MOVIE_2 = REGISTRY.register("pizzeria_sign_movie_2",
			() -> BlockEntityType.Builder.of(PizzeriaSignMovie2TileEntity::new, YaFnafmodModBlocks.PIZZERIA_SIGN_MOVIE_2.get()).build(null));
	public static final RegistryObject<BlockEntityType<BalloonCartTileEntity>> BALLOON_CART = REGISTRY.register("balloon_cart", () -> BlockEntityType.Builder.of(BalloonCartTileEntity::new, YaFnafmodModBlocks.BALLOON_CART.get()).build(null));
	public static final RegistryObject<BlockEntityType<DeluxeBallpitTileEntity>> DELUXE_BALLPIT = REGISTRY.register("deluxe_ballpit",
			() -> BlockEntityType.Builder.of(DeluxeBallpitTileEntity::new, YaFnafmodModBlocks.DELUXE_BALLPIT.get()).build(null));
	public static final RegistryObject<BlockEntityType<EggBabyTileEntity>> EGG_BABY = REGISTRY.register("egg_baby", () -> BlockEntityType.Builder.of(EggBabyTileEntity::new, YaFnafmodModBlocks.EGG_BABY.get()).build(null));
	public static final RegistryObject<BlockEntityType<GravityVortexTileEntity>> GRAVITY_VORTEX = REGISTRY.register("gravity_vortex",
			() -> BlockEntityType.Builder.of(GravityVortexTileEntity::new, YaFnafmodModBlocks.GRAVITY_VORTEX.get()).build(null));
	public static final RegistryObject<BlockEntityType<PrizeKingTileEntity>> PRIZE_KING = REGISTRY.register("prize_king", () -> BlockEntityType.Builder.of(PrizeKingTileEntity::new, YaFnafmodModBlocks.PRIZE_KING.get()).build(null));
	public static final RegistryObject<BlockEntityType<SecurityPuppetPropTileEntity>> SECURITY_PUPPET_PROP = REGISTRY.register("security_puppet_prop",
			() -> BlockEntityType.Builder.of(SecurityPuppetPropTileEntity::new, YaFnafmodModBlocks.SECURITY_PUPPET_PROP.get()).build(null));
	public static final RegistryObject<BlockEntityType<CircusBabyClockTileEntity>> CIRCUS_BABY_CLOCK = REGISTRY.register("circus_baby_clock",
			() -> BlockEntityType.Builder.of(CircusBabyClockTileEntity::new, YaFnafmodModBlocks.CIRCUS_BABY_CLOCK.get()).build(null));
	public static final RegistryObject<BlockEntityType<?>> MONITOR_WORK = register("monitor_work", YaFnafmodModBlocks.MONITOR_WORK, MonitorWorkBlockEntity::new);
	public static final RegistryObject<BlockEntityType<BallpitRottenTileEntity>> BALLPIT_ROTTEN = REGISTRY.register("ballpit_rotten",
			() -> BlockEntityType.Builder.of(BallpitRottenTileEntity::new, YaFnafmodModBlocks.BALLPIT_ROTTEN.get()).build(null));
	public static final RegistryObject<BlockEntityType<BallpitVintageTileEntity>> BALLPIT_VINTAGE = REGISTRY.register("ballpit_vintage",
			() -> BlockEntityType.Builder.of(BallpitVintageTileEntity::new, YaFnafmodModBlocks.BALLPIT_VINTAGE.get()).build(null));
	public static final RegistryObject<BlockEntityType<CutoutFreddyRetroTileEntity>> CUTOUT_FREDDY_RETRO = REGISTRY.register("cutout_freddy_retro",
			() -> BlockEntityType.Builder.of(CutoutFreddyRetroTileEntity::new, YaFnafmodModBlocks.CUTOUT_FREDDY_RETRO.get()).build(null));
	public static final RegistryObject<BlockEntityType<Fazcoins5TileEntity>> FAZCOINS_5 = REGISTRY.register("fazcoins_5", () -> BlockEntityType.Builder.of(Fazcoins5TileEntity::new, YaFnafmodModBlocks.FAZCOINS_5.get()).build(null));
	public static final RegistryObject<BlockEntityType<Fazcoins25TileEntity>> FAZCOINS_25 = REGISTRY.register("fazcoins_25", () -> BlockEntityType.Builder.of(Fazcoins25TileEntity::new, YaFnafmodModBlocks.FAZCOINS_25.get()).build(null));
	public static final RegistryObject<BlockEntityType<Fazcoins100TileEntity>> FAZCOINS_100 = REGISTRY.register("fazcoins_100", () -> BlockEntityType.Builder.of(Fazcoins100TileEntity::new, YaFnafmodModBlocks.FAZCOINS_100.get()).build(null));
	public static final RegistryObject<BlockEntityType<Fazcoins1000TileEntity>> FAZCOINS_1000 = REGISTRY.register("fazcoins_1000", () -> BlockEntityType.Builder.of(Fazcoins1000TileEntity::new, YaFnafmodModBlocks.FAZCOINS_1000.get()).build(null));
	public static final RegistryObject<BlockEntityType<Fazcoins10000TileEntity>> FAZCOINS_10000 = REGISTRY.register("fazcoins_10000",
			() -> BlockEntityType.Builder.of(Fazcoins10000TileEntity::new, YaFnafmodModBlocks.FAZCOINS_10000.get()).build(null));
	public static final RegistryObject<BlockEntityType<CameraTileEntity>> CAMERA = REGISTRY.register("camera", () -> BlockEntityType.Builder.of(CameraTileEntity::new, YaFnafmodModBlocks.CAMERA.get()).build(null));
	public static final RegistryObject<BlockEntityType<BrokenFreddyTileEntity>> BROKEN_FREDDY = REGISTRY.register("broken_freddy", () -> BlockEntityType.Builder.of(BrokenFreddyTileEntity::new, YaFnafmodModBlocks.BROKEN_FREDDY.get()).build(null));
	public static final RegistryObject<BlockEntityType<BrokenBonnieTileEntity>> BROKEN_BONNIE = REGISTRY.register("broken_bonnie", () -> BlockEntityType.Builder.of(BrokenBonnieTileEntity::new, YaFnafmodModBlocks.BROKEN_BONNIE.get()).build(null));
	public static final RegistryObject<BlockEntityType<BrokenChicaTileEntity>> BROKEN_CHICA = REGISTRY.register("broken_chica", () -> BlockEntityType.Builder.of(BrokenChicaTileEntity::new, YaFnafmodModBlocks.BROKEN_CHICA.get()).build(null));
	public static final RegistryObject<BlockEntityType<BrokenFoxyTileEntity>> BROKEN_FOXY = REGISTRY.register("broken_foxy", () -> BlockEntityType.Builder.of(BrokenFoxyTileEntity::new, YaFnafmodModBlocks.BROKEN_FOXY.get()).build(null));
	public static final RegistryObject<BlockEntityType<CutoutFredbearBittenTileEntity>> CUTOUT_FREDBEAR_BITTEN = REGISTRY.register("cutout_fredbear_bitten",
			() -> BlockEntityType.Builder.of(CutoutFredbearBittenTileEntity::new, YaFnafmodModBlocks.CUTOUT_FREDBEAR_BITTEN.get()).build(null));
	public static final RegistryObject<BlockEntityType<CutoutSpringbonnieRottenTileEntity>> CUTOUT_SPRINGBONNIE_ROTTEN = REGISTRY.register("cutout_springbonnie_rotten",
			() -> BlockEntityType.Builder.of(CutoutSpringbonnieRottenTileEntity::new, YaFnafmodModBlocks.CUTOUT_SPRINGBONNIE_ROTTEN.get()).build(null));
	public static final RegistryObject<BlockEntityType<NeonSignKitchenTileEntity>> NEON_SIGN_KITCHEN = REGISTRY.register("neon_sign_kitchen",
			() -> BlockEntityType.Builder.of(NeonSignKitchenTileEntity::new, YaFnafmodModBlocks.NEON_SIGN_KITCHEN.get()).build(null));
	public static final RegistryObject<BlockEntityType<NeonSignArcadeTileEntity>> NEON_SIGN_ARCADE = REGISTRY.register("neon_sign_arcade",
			() -> BlockEntityType.Builder.of(NeonSignArcadeTileEntity::new, YaFnafmodModBlocks.NEON_SIGN_ARCADE.get()).build(null));
	public static final RegistryObject<BlockEntityType<PizzaBox1985TileEntity>> PIZZA_BOX_1985 = REGISTRY.register("pizza_box_1985", () -> BlockEntityType.Builder.of(PizzaBox1985TileEntity::new, YaFnafmodModBlocks.PIZZA_BOX_1985.get()).build(null));
	public static final RegistryObject<BlockEntityType<PizzaBox1985EmptyTileEntity>> PIZZA_BOX_1985_EMPTY = REGISTRY.register("pizza_box_1985_empty",
			() -> BlockEntityType.Builder.of(PizzaBox1985EmptyTileEntity::new, YaFnafmodModBlocks.PIZZA_BOX_1985_EMPTY.get()).build(null));
	public static final RegistryObject<BlockEntityType<PizzaBox1987TileEntity>> PIZZA_BOX_1987 = REGISTRY.register("pizza_box_1987", () -> BlockEntityType.Builder.of(PizzaBox1987TileEntity::new, YaFnafmodModBlocks.PIZZA_BOX_1987.get()).build(null));
	public static final RegistryObject<BlockEntityType<PizzaBox1987EmptyTileEntity>> PIZZA_BOX_1987_EMPTY = REGISTRY.register("pizza_box_1987_empty",
			() -> BlockEntityType.Builder.of(PizzaBox1987EmptyTileEntity::new, YaFnafmodModBlocks.PIZZA_BOX_1987_EMPTY.get()).build(null));
	public static final RegistryObject<BlockEntityType<PizzaBox1987AltTileEntity>> PIZZA_BOX_1987_ALT = REGISTRY.register("pizza_box_1987_alt",
			() -> BlockEntityType.Builder.of(PizzaBox1987AltTileEntity::new, YaFnafmodModBlocks.PIZZA_BOX_1987_ALT.get()).build(null));
	public static final RegistryObject<BlockEntityType<PizzaBox1987AltEmptyTileEntity>> PIZZA_BOX_1987_ALT_EMPTY = REGISTRY.register("pizza_box_1987_alt_empty",
			() -> BlockEntityType.Builder.of(PizzaBox1987AltEmptyTileEntity::new, YaFnafmodModBlocks.PIZZA_BOX_1987_ALT_EMPTY.get()).build(null));
	public static final RegistryObject<BlockEntityType<PizzaBox2023TileEntity>> PIZZA_BOX_2023 = REGISTRY.register("pizza_box_2023", () -> BlockEntityType.Builder.of(PizzaBox2023TileEntity::new, YaFnafmodModBlocks.PIZZA_BOX_2023.get()).build(null));
	public static final RegistryObject<BlockEntityType<PizzaBox2023EmptyTileEntity>> PIZZA_BOX_2023_EMPTY = REGISTRY.register("pizza_box_2023_empty",
			() -> BlockEntityType.Builder.of(PizzaBox2023EmptyTileEntity::new, YaFnafmodModBlocks.PIZZA_BOX_2023_EMPTY.get()).build(null));
	public static final RegistryObject<BlockEntityType<NeonSignPartyRoomTileEntity>> NEON_SIGN_PARTY_ROOM = REGISTRY.register("neon_sign_party_room",
			() -> BlockEntityType.Builder.of(NeonSignPartyRoomTileEntity::new, YaFnafmodModBlocks.NEON_SIGN_PARTY_ROOM.get()).build(null));
	public static final RegistryObject<BlockEntityType<NeonSignRestroomTileEntity>> NEON_SIGN_RESTROOM = REGISTRY.register("neon_sign_restroom",
			() -> BlockEntityType.Builder.of(NeonSignRestroomTileEntity::new, YaFnafmodModBlocks.NEON_SIGN_RESTROOM.get()).build(null));
	public static final RegistryObject<BlockEntityType<?>> TV_TUBE = register("tv_tube", YaFnafmodModBlocks.TV_TUBE, TvTubeBlockEntity::new);
	public static final RegistryObject<BlockEntityType<SpringbonnieBlockTileEntity>> SPRINGBONNIE_BLOCK = REGISTRY.register("springbonnie_block",
			() -> BlockEntityType.Builder.of(SpringbonnieBlockTileEntity::new, YaFnafmodModBlocks.SPRINGBONNIE_BLOCK.get()).build(null));
	public static final RegistryObject<BlockEntityType<SpringbonnieBlock01TileEntity>> SPRINGBONNIE_BLOCK_01 = REGISTRY.register("springbonnie_block_01",
			() -> BlockEntityType.Builder.of(SpringbonnieBlock01TileEntity::new, YaFnafmodModBlocks.SPRINGBONNIE_BLOCK_01.get()).build(null));
	public static final RegistryObject<BlockEntityType<ProjectorTileEntity>> PROJECTOR = REGISTRY.register("projector", () -> BlockEntityType.Builder.of(ProjectorTileEntity::new, YaFnafmodModBlocks.PROJECTOR.get()).build(null));
	public static final RegistryObject<BlockEntityType<CutoutBonnieRetroTileEntity>> CUTOUT_BONNIE_RETRO = REGISTRY.register("cutout_bonnie_retro",
			() -> BlockEntityType.Builder.of(CutoutBonnieRetroTileEntity::new, YaFnafmodModBlocks.CUTOUT_BONNIE_RETRO.get()).build(null));
	public static final RegistryObject<BlockEntityType<CutoutChicaRetroTileEntity>> CUTOUT_CHICA_RETRO = REGISTRY.register("cutout_chica_retro",
			() -> BlockEntityType.Builder.of(CutoutChicaRetroTileEntity::new, YaFnafmodModBlocks.CUTOUT_CHICA_RETRO.get()).build(null));
	public static final RegistryObject<BlockEntityType<CutoutFoxyRetroTileEntity>> CUTOUT_FOXY_RETRO = REGISTRY.register("cutout_foxy_retro",
			() -> BlockEntityType.Builder.of(CutoutFoxyRetroTileEntity::new, YaFnafmodModBlocks.CUTOUT_FOXY_RETRO.get()).build(null));
	public static final RegistryObject<BlockEntityType<CutoutHelpyTileEntity>> CUTOUT_HELPY = REGISTRY.register("cutout_helpy", () -> BlockEntityType.Builder.of(CutoutHelpyTileEntity::new, YaFnafmodModBlocks.CUTOUT_HELPY.get()).build(null));
	public static final RegistryObject<BlockEntityType<BonkABonTileEntity>> BONK_A_BON = REGISTRY.register("bonk_a_bon", () -> BlockEntityType.Builder.of(BonkABonTileEntity::new, YaFnafmodModBlocks.BONK_A_BON.get()).build(null));
	public static final RegistryObject<BlockEntityType<PinballToyFreddyTileEntity>> PINBALL_TOY_FREDDY = REGISTRY.register("pinball_toy_freddy",
			() -> BlockEntityType.Builder.of(PinballToyFreddyTileEntity::new, YaFnafmodModBlocks.PINBALL_TOY_FREDDY.get()).build(null));
	public static final RegistryObject<BlockEntityType<PinballToyBonnieTileEntity>> PINBALL_TOY_BONNIE = REGISTRY.register("pinball_toy_bonnie",
			() -> BlockEntityType.Builder.of(PinballToyBonnieTileEntity::new, YaFnafmodModBlocks.PINBALL_TOY_BONNIE.get()).build(null));
	public static final RegistryObject<BlockEntityType<PinballToyChicaTileEntity>> PINBALL_TOY_CHICA = REGISTRY.register("pinball_toy_chica",
			() -> BlockEntityType.Builder.of(PinballToyChicaTileEntity::new, YaFnafmodModBlocks.PINBALL_TOY_CHICA.get()).build(null));
	public static final RegistryObject<BlockEntityType<PinballToyFoxyTileEntity>> PINBALL_TOY_FOXY = REGISTRY.register("pinball_toy_foxy",
			() -> BlockEntityType.Builder.of(PinballToyFoxyTileEntity::new, YaFnafmodModBlocks.PINBALL_TOY_FOXY.get()).build(null));
	public static final RegistryObject<BlockEntityType<RascBlockTileEntity>> RASC_BLOCK = REGISTRY.register("rasc_block", () -> BlockEntityType.Builder.of(RascBlockTileEntity::new, YaFnafmodModBlocks.RASC_BLOCK.get()).build(null));
	public static final RegistryObject<BlockEntityType<GarfeldTileEntity>> GARFELD = REGISTRY.register("garfeld", () -> BlockEntityType.Builder.of(GarfeldTileEntity::new, YaFnafmodModBlocks.GARFELD.get()).build(null));
	public static final RegistryObject<BlockEntityType<ToypugTileEntity>> TOYPUG = REGISTRY.register("toypug", () -> BlockEntityType.Builder.of(ToypugTileEntity::new, YaFnafmodModBlocks.TOYPUG.get()).build(null));
	public static final RegistryObject<BlockEntityType<RosieTileEntity>> ROSIE = REGISTRY.register("rosie", () -> BlockEntityType.Builder.of(RosieTileEntity::new, YaFnafmodModBlocks.ROSIE.get()).build(null));
	public static final RegistryObject<BlockEntityType<CarFazvanBlockTileEntity>> CAR_FAZVAN_BLOCK = REGISTRY.register("car_fazvan_block",
			() -> BlockEntityType.Builder.of(CarFazvanBlockTileEntity::new, YaFnafmodModBlocks.CAR_FAZVAN_BLOCK.get()).build(null));
	public static final RegistryObject<BlockEntityType<FryerTileEntity>> FRYER = REGISTRY.register("fryer", () -> BlockEntityType.Builder.of(FryerTileEntity::new, YaFnafmodModBlocks.FRYER.get()).build(null));
	public static final RegistryObject<BlockEntityType<FryingPanTileEntity>> FRYING_PAN = REGISTRY.register("frying_pan", () -> BlockEntityType.Builder.of(FryingPanTileEntity::new, YaFnafmodModBlocks.FRYING_PAN.get()).build(null));
	public static final RegistryObject<BlockEntityType<PotTileEntity>> POT = REGISTRY.register("pot", () -> BlockEntityType.Builder.of(PotTileEntity::new, YaFnafmodModBlocks.POT.get()).build(null));
	public static final RegistryObject<BlockEntityType<FazOvenTileEntity>> FAZ_OVEN = REGISTRY.register("faz_oven", () -> BlockEntityType.Builder.of(FazOvenTileEntity::new, YaFnafmodModBlocks.FAZ_OVEN.get()).build(null));
	public static final RegistryObject<BlockEntityType<BoxPlatesTileEntity>> BOX_PLATES = REGISTRY.register("box_plates", () -> BlockEntityType.Builder.of(BoxPlatesTileEntity::new, YaFnafmodModBlocks.BOX_PLATES.get()).build(null));
	public static final RegistryObject<BlockEntityType<BoxEndoTileEntity>> BOX_ENDO = REGISTRY.register("box_endo", () -> BlockEntityType.Builder.of(BoxEndoTileEntity::new, YaFnafmodModBlocks.BOX_ENDO.get()).build(null));
	public static final RegistryObject<BlockEntityType<BoxPlush1TileEntity>> BOX_PLUSH_1 = REGISTRY.register("box_plush_1", () -> BlockEntityType.Builder.of(BoxPlush1TileEntity::new, YaFnafmodModBlocks.BOX_PLUSH_1.get()).build(null));
	public static final RegistryObject<BlockEntityType<BoxPlush2TileEntity>> BOX_PLUSH_2 = REGISTRY.register("box_plush_2", () -> BlockEntityType.Builder.of(BoxPlush2TileEntity::new, YaFnafmodModBlocks.BOX_PLUSH_2.get()).build(null));
	public static final RegistryObject<BlockEntityType<BoxPlush3TileEntity>> BOX_PLUSH_3 = REGISTRY.register("box_plush_3", () -> BlockEntityType.Builder.of(BoxPlush3TileEntity::new, YaFnafmodModBlocks.BOX_PLUSH_3.get()).build(null));
	public static final RegistryObject<BlockEntityType<BoxPlush4TileEntity>> BOX_PLUSH_4 = REGISTRY.register("box_plush_4", () -> BlockEntityType.Builder.of(BoxPlush4TileEntity::new, YaFnafmodModBlocks.BOX_PLUSH_4.get()).build(null));
	public static final RegistryObject<BlockEntityType<PizzeriaSign1987TileEntity>> PIZZERIA_SIGN_1987 = REGISTRY.register("pizzeria_sign_1987",
			() -> BlockEntityType.Builder.of(PizzeriaSign1987TileEntity::new, YaFnafmodModBlocks.PIZZERIA_SIGN_1987.get()).build(null));
	public static final RegistryObject<BlockEntityType<PizzeriaSignFrightsTileEntity>> PIZZERIA_SIGN_FRIGHTS = REGISTRY.register("pizzeria_sign_frights",
			() -> BlockEntityType.Builder.of(PizzeriaSignFrightsTileEntity::new, YaFnafmodModBlocks.PIZZERIA_SIGN_FRIGHTS.get()).build(null));
	public static final RegistryObject<BlockEntityType<PizzeriaSignFredbearsTileEntity>> PIZZERIA_SIGN_FREDBEARS = REGISTRY.register("pizzeria_sign_fredbears",
			() -> BlockEntityType.Builder.of(PizzeriaSignFredbearsTileEntity::new, YaFnafmodModBlocks.PIZZERIA_SIGN_FREDBEARS.get()).build(null));
	public static final RegistryObject<BlockEntityType<ShopSignStansBudgetTechTileEntity>> SHOP_SIGN_STANS_BUDGET_TECH = REGISTRY.register("shop_sign_stans_budget_tech",
			() -> BlockEntityType.Builder.of(ShopSignStansBudgetTechTileEntity::new, YaFnafmodModBlocks.SHOP_SIGN_STANS_BUDGET_TECH.get()).build(null));
	public static final RegistryObject<BlockEntityType<ShopSignSmilesAndServosTileEntity>> SHOP_SIGN_SMILES_AND_SERVOS = REGISTRY.register("shop_sign_smiles_and_servos",
			() -> BlockEntityType.Builder.of(ShopSignSmilesAndServosTileEntity::new, YaFnafmodModBlocks.SHOP_SIGN_SMILES_AND_SERVOS.get()).build(null));
	public static final RegistryObject<BlockEntityType<ShopSignRareFindsAuctionTileEntity>> SHOP_SIGN_RARE_FINDS_AUCTION = REGISTRY.register("shop_sign_rare_finds_auction",
			() -> BlockEntityType.Builder.of(ShopSignRareFindsAuctionTileEntity::new, YaFnafmodModBlocks.SHOP_SIGN_RARE_FINDS_AUCTION.get()).build(null));
	public static final RegistryObject<BlockEntityType<BigSecurityDoorTileEntity>> BIG_SECURITY_DOOR = REGISTRY.register("big_security_door",
			() -> BlockEntityType.Builder.of(BigSecurityDoorTileEntity::new, YaFnafmodModBlocks.BIG_SECURITY_DOOR.get()).build(null));
	public static final RegistryObject<BlockEntityType<?>> SECURITY_DOOR_WINDOW = register("security_door_window", YaFnafmodModBlocks.SECURITY_DOOR_WINDOW, SecurityDoorWindowBlockEntity::new);
	public static final RegistryObject<BlockEntityType<CarouselFreddyTileEntity>> CAROUSEL_FREDDY = REGISTRY.register("carousel_freddy",
			() -> BlockEntityType.Builder.of(CarouselFreddyTileEntity::new, YaFnafmodModBlocks.CAROUSEL_FREDDY.get()).build(null));
	public static final RegistryObject<BlockEntityType<CarouselFreddyToyTileEntity>> CAROUSEL_FREDDY_TOY = REGISTRY.register("carousel_freddy_toy",
			() -> BlockEntityType.Builder.of(CarouselFreddyToyTileEntity::new, YaFnafmodModBlocks.CAROUSEL_FREDDY_TOY.get()).build(null));
	public static final RegistryObject<BlockEntityType<CarouselFreddyRetroTileEntity>> CAROUSEL_FREDDY_RETRO = REGISTRY.register("carousel_freddy_retro",
			() -> BlockEntityType.Builder.of(CarouselFreddyRetroTileEntity::new, YaFnafmodModBlocks.CAROUSEL_FREDDY_RETRO.get()).build(null));
	public static final RegistryObject<BlockEntityType<CarouselFredbearTileEntity>> CAROUSEL_FREDBEAR = REGISTRY.register("carousel_fredbear",
			() -> BlockEntityType.Builder.of(CarouselFredbearTileEntity::new, YaFnafmodModBlocks.CAROUSEL_FREDBEAR.get()).build(null));
	public static final RegistryObject<BlockEntityType<DumpsterGreenTileEntity>> DUMPSTER_GREEN = REGISTRY.register("dumpster_green",
			() -> BlockEntityType.Builder.of(DumpsterGreenTileEntity::new, YaFnafmodModBlocks.DUMPSTER_GREEN.get()).build(null));
	public static final RegistryObject<BlockEntityType<DumpsterBlueTileEntity>> DUMPSTER_BLUE = REGISTRY.register("dumpster_blue", () -> BlockEntityType.Builder.of(DumpsterBlueTileEntity::new, YaFnafmodModBlocks.DUMPSTER_BLUE.get()).build(null));
	public static final RegistryObject<BlockEntityType<StageSunCreepTileEntity>> STAGE_SUN_CREEP = REGISTRY.register("stage_sun_creep",
			() -> BlockEntityType.Builder.of(StageSunCreepTileEntity::new, YaFnafmodModBlocks.STAGE_SUN_CREEP.get()).build(null));
	public static final RegistryObject<BlockEntityType<StageMoonCreepTileEntity>> STAGE_MOON_CREEP = REGISTRY.register("stage_moon_creep",
			() -> BlockEntityType.Builder.of(StageMoonCreepTileEntity::new, YaFnafmodModBlocks.STAGE_MOON_CREEP.get()).build(null));
	public static final RegistryObject<BlockEntityType<TrashCanFreddyTileEntity>> TRASH_CAN_FREDDY = REGISTRY.register("trash_can_freddy",
			() -> BlockEntityType.Builder.of(TrashCanFreddyTileEntity::new, YaFnafmodModBlocks.TRASH_CAN_FREDDY.get()).build(null));
	public static final RegistryObject<BlockEntityType<TrashCanBonnieTileEntity>> TRASH_CAN_BONNIE = REGISTRY.register("trash_can_bonnie",
			() -> BlockEntityType.Builder.of(TrashCanBonnieTileEntity::new, YaFnafmodModBlocks.TRASH_CAN_BONNIE.get()).build(null));
	public static final RegistryObject<BlockEntityType<TrashCanChicaTileEntity>> TRASH_CAN_CHICA = REGISTRY.register("trash_can_chica",
			() -> BlockEntityType.Builder.of(TrashCanChicaTileEntity::new, YaFnafmodModBlocks.TRASH_CAN_CHICA.get()).build(null));
	public static final RegistryObject<BlockEntityType<TrashCanFoxyTileEntity>> TRASH_CAN_FOXY = REGISTRY.register("trash_can_foxy", () -> BlockEntityType.Builder.of(TrashCanFoxyTileEntity::new, YaFnafmodModBlocks.TRASH_CAN_FOXY.get()).build(null));
	public static final RegistryObject<BlockEntityType<TrashCanCupcakeTileEntity>> TRASH_CAN_CUPCAKE = REGISTRY.register("trash_can_cupcake",
			() -> BlockEntityType.Builder.of(TrashCanCupcakeTileEntity::new, YaFnafmodModBlocks.TRASH_CAN_CUPCAKE.get()).build(null));
	public static final RegistryObject<BlockEntityType<CarFazvanPropTileEntity>> CAR_FAZVAN_PROP = REGISTRY.register("car_fazvan_prop",
			() -> BlockEntityType.Builder.of(CarFazvanPropTileEntity::new, YaFnafmodModBlocks.CAR_FAZVAN_PROP.get()).build(null));
	public static final RegistryObject<BlockEntityType<CarStationWagonBlockTileEntity>> CAR_STATION_WAGON_BLOCK = REGISTRY.register("car_station_wagon_block",
			() -> BlockEntityType.Builder.of(CarStationWagonBlockTileEntity::new, YaFnafmodModBlocks.CAR_STATION_WAGON_BLOCK.get()).build(null));
	public static final RegistryObject<BlockEntityType<TrashBagGreenTileEntity>> TRASH_BAG_GREEN = REGISTRY.register("trash_bag_green",
			() -> BlockEntityType.Builder.of(TrashBagGreenTileEntity::new, YaFnafmodModBlocks.TRASH_BAG_GREEN.get()).build(null));
	public static final RegistryObject<BlockEntityType<TrashBagBlackTileEntity>> TRASH_BAG_BLACK = REGISTRY.register("trash_bag_black",
			() -> BlockEntityType.Builder.of(TrashBagBlackTileEntity::new, YaFnafmodModBlocks.TRASH_BAG_BLACK.get()).build(null));
	public static final RegistryObject<BlockEntityType<TrashTileEntity>> TRASH = REGISTRY.register("trash", () -> BlockEntityType.Builder.of(TrashTileEntity::new, YaFnafmodModBlocks.TRASH.get()).build(null));
	public static final RegistryObject<BlockEntityType<BulletinBoardTileEntity>> BULLETIN_BOARD = REGISTRY.register("bulletin_board",
			() -> BlockEntityType.Builder.of(BulletinBoardTileEntity::new, YaFnafmodModBlocks.BULLETIN_BOARD.get()).build(null));
	public static final RegistryObject<BlockEntityType<LaptopOldTileEntity>> LAPTOP_OLD = REGISTRY.register("laptop_old", () -> BlockEntityType.Builder.of(LaptopOldTileEntity::new, YaFnafmodModBlocks.LAPTOP_OLD.get()).build(null));
	public static final RegistryObject<BlockEntityType<LaptopTileEntity>> LAPTOP = REGISTRY.register("laptop", () -> BlockEntityType.Builder.of(LaptopTileEntity::new, YaFnafmodModBlocks.LAPTOP.get()).build(null));
	public static final RegistryObject<BlockEntityType<OldManConsequencesBlockTileEntity>> OLD_MAN_CONSEQUENCES_BLOCK = REGISTRY.register("old_man_consequences_block",
			() -> BlockEntityType.Builder.of(OldManConsequencesBlockTileEntity::new, YaFnafmodModBlocks.OLD_MAN_CONSEQUENCES_BLOCK.get()).build(null));
	public static final RegistryObject<BlockEntityType<FridgeWhiteTileEntity>> FRIDGE_WHITE = REGISTRY.register("fridge_white", () -> BlockEntityType.Builder.of(FridgeWhiteTileEntity::new, YaFnafmodModBlocks.FRIDGE_WHITE.get()).build(null));
	public static final RegistryObject<BlockEntityType<FridgeGrayTileEntity>> FRIDGE_GRAY = REGISTRY.register("fridge_gray", () -> BlockEntityType.Builder.of(FridgeGrayTileEntity::new, YaFnafmodModBlocks.FRIDGE_GRAY.get()).build(null));
	public static final RegistryObject<BlockEntityType<VanRideTileEntity>> VAN_RIDE = REGISTRY.register("van_ride", () -> BlockEntityType.Builder.of(VanRideTileEntity::new, YaFnafmodModBlocks.VAN_RIDE.get()).build(null));
	public static final RegistryObject<BlockEntityType<OfficeChairRedTileEntity>> OFFICE_CHAIR_RED = REGISTRY.register("office_chair_red",
			() -> BlockEntityType.Builder.of(OfficeChairRedTileEntity::new, YaFnafmodModBlocks.OFFICE_CHAIR_RED.get()).build(null));
	public static final RegistryObject<BlockEntityType<OfficeChairBlackTileEntity>> OFFICE_CHAIR_BLACK = REGISTRY.register("office_chair_black",
			() -> BlockEntityType.Builder.of(OfficeChairBlackTileEntity::new, YaFnafmodModBlocks.OFFICE_CHAIR_BLACK.get()).build(null));
	public static final RegistryObject<BlockEntityType<PizzaBoxStack1988TileEntity>> PIZZA_BOX_STACK_1988 = REGISTRY.register("pizza_box_stack_1988",
			() -> BlockEntityType.Builder.of(PizzaBoxStack1988TileEntity::new, YaFnafmodModBlocks.PIZZA_BOX_STACK_1988.get()).build(null));
	public static final RegistryObject<BlockEntityType<PizzaBoxStack1979TileEntity>> PIZZA_BOX_STACK_1979 = REGISTRY.register("pizza_box_stack_1979",
			() -> BlockEntityType.Builder.of(PizzaBoxStack1979TileEntity::new, YaFnafmodModBlocks.PIZZA_BOX_STACK_1979.get()).build(null));
	public static final RegistryObject<BlockEntityType<PizzaBoxStack1985TileEntity>> PIZZA_BOX_STACK_1985 = REGISTRY.register("pizza_box_stack_1985",
			() -> BlockEntityType.Builder.of(PizzaBoxStack1985TileEntity::new, YaFnafmodModBlocks.PIZZA_BOX_STACK_1985.get()).build(null));
	public static final RegistryObject<BlockEntityType<PizzaBoxStack1987TileEntity>> PIZZA_BOX_STACK_1987 = REGISTRY.register("pizza_box_stack_1987",
			() -> BlockEntityType.Builder.of(PizzaBoxStack1987TileEntity::new, YaFnafmodModBlocks.PIZZA_BOX_STACK_1987.get()).build(null));
	public static final RegistryObject<BlockEntityType<PizzaBoxStack1987AltTileEntity>> PIZZA_BOX_STACK_1987_ALT = REGISTRY.register("pizza_box_stack_1987_alt",
			() -> BlockEntityType.Builder.of(PizzaBoxStack1987AltTileEntity::new, YaFnafmodModBlocks.PIZZA_BOX_STACK_1987_ALT.get()).build(null));
	public static final RegistryObject<BlockEntityType<PizzaBoxStack2023TileEntity>> PIZZA_BOX_STACK_2023 = REGISTRY.register("pizza_box_stack_2023",
			() -> BlockEntityType.Builder.of(PizzaBoxStack2023TileEntity::new, YaFnafmodModBlocks.PIZZA_BOX_STACK_2023.get()).build(null));
	public static final RegistryObject<BlockEntityType<SkeeballGenericTileEntity>> SKEEBALL_GENERIC = REGISTRY.register("skeeball_generic",
			() -> BlockEntityType.Builder.of(SkeeballGenericTileEntity::new, YaFnafmodModBlocks.SKEEBALL_GENERIC.get()).build(null));
	public static final RegistryObject<BlockEntityType<SkeeballPizzarollerTileEntity>> SKEEBALL_PIZZAROLLER = REGISTRY.register("skeeball_pizzaroller",
			() -> BlockEntityType.Builder.of(SkeeballPizzarollerTileEntity::new, YaFnafmodModBlocks.SKEEBALL_PIZZAROLLER.get()).build(null));
	public static final RegistryObject<BlockEntityType<BathroomStallTileEntity>> BATHROOM_STALL = REGISTRY.register("bathroom_stall",
			() -> BlockEntityType.Builder.of(BathroomStallTileEntity::new, YaFnafmodModBlocks.BATHROOM_STALL.get()).build(null));
	public static final RegistryObject<BlockEntityType<ClockWallTileEntity>> CLOCK_WALL = REGISTRY.register("clock_wall", () -> BlockEntityType.Builder.of(ClockWallTileEntity::new, YaFnafmodModBlocks.CLOCK_WALL.get()).build(null));
	public static final RegistryObject<BlockEntityType<ClockWallFreddyTileEntity>> CLOCK_WALL_FREDDY = REGISTRY.register("clock_wall_freddy",
			() -> BlockEntityType.Builder.of(ClockWallFreddyTileEntity::new, YaFnafmodModBlocks.CLOCK_WALL_FREDDY.get()).build(null));
	public static final RegistryObject<BlockEntityType<ClockWallBonnieTileEntity>> CLOCK_WALL_BONNIE = REGISTRY.register("clock_wall_bonnie",
			() -> BlockEntityType.Builder.of(ClockWallBonnieTileEntity::new, YaFnafmodModBlocks.CLOCK_WALL_BONNIE.get()).build(null));
	public static final RegistryObject<BlockEntityType<ClockWallChicaTileEntity>> CLOCK_WALL_CHICA = REGISTRY.register("clock_wall_chica",
			() -> BlockEntityType.Builder.of(ClockWallChicaTileEntity::new, YaFnafmodModBlocks.CLOCK_WALL_CHICA.get()).build(null));
	public static final RegistryObject<BlockEntityType<ClockWallFoxyTileEntity>> CLOCK_WALL_FOXY = REGISTRY.register("clock_wall_foxy",
			() -> BlockEntityType.Builder.of(ClockWallFoxyTileEntity::new, YaFnafmodModBlocks.CLOCK_WALL_FOXY.get()).build(null));
	public static final RegistryObject<BlockEntityType<ClockWallToyFreddyTileEntity>> CLOCK_WALL_TOY_FREDDY = REGISTRY.register("clock_wall_toy_freddy",
			() -> BlockEntityType.Builder.of(ClockWallToyFreddyTileEntity::new, YaFnafmodModBlocks.CLOCK_WALL_TOY_FREDDY.get()).build(null));
	public static final RegistryObject<BlockEntityType<ClockWallToyBonnieTileEntity>> CLOCK_WALL_TOY_BONNIE = REGISTRY.register("clock_wall_toy_bonnie",
			() -> BlockEntityType.Builder.of(ClockWallToyBonnieTileEntity::new, YaFnafmodModBlocks.CLOCK_WALL_TOY_BONNIE.get()).build(null));
	public static final RegistryObject<BlockEntityType<ClockWallToyChicaTileEntity>> CLOCK_WALL_TOY_CHICA = REGISTRY.register("clock_wall_toy_chica",
			() -> BlockEntityType.Builder.of(ClockWallToyChicaTileEntity::new, YaFnafmodModBlocks.CLOCK_WALL_TOY_CHICA.get()).build(null));
	public static final RegistryObject<BlockEntityType<ClockWallToyFoxyTileEntity>> CLOCK_WALL_TOY_FOXY = REGISTRY.register("clock_wall_toy_foxy",
			() -> BlockEntityType.Builder.of(ClockWallToyFoxyTileEntity::new, YaFnafmodModBlocks.CLOCK_WALL_TOY_FOXY.get()).build(null));
	public static final RegistryObject<BlockEntityType<ClockWallFredbearTileEntity>> CLOCK_WALL_FREDBEAR = REGISTRY.register("clock_wall_fredbear",
			() -> BlockEntityType.Builder.of(ClockWallFredbearTileEntity::new, YaFnafmodModBlocks.CLOCK_WALL_FREDBEAR.get()).build(null));
	public static final RegistryObject<BlockEntityType<ClockWallSpringbonnieTileEntity>> CLOCK_WALL_SPRINGBONNIE = REGISTRY.register("clock_wall_springbonnie",
			() -> BlockEntityType.Builder.of(ClockWallSpringbonnieTileEntity::new, YaFnafmodModBlocks.CLOCK_WALL_SPRINGBONNIE.get()).build(null));
	public static final RegistryObject<BlockEntityType<TrashCanMeshTileEntity>> TRASH_CAN_MESH = REGISTRY.register("trash_can_mesh", () -> BlockEntityType.Builder.of(TrashCanMeshTileEntity::new, YaFnafmodModBlocks.TRASH_CAN_MESH.get()).build(null));
	public static final RegistryObject<BlockEntityType<ClawMachinePizzaPartyTileEntity>> CLAW_MACHINE_PIZZA_PARTY = REGISTRY.register("claw_machine_pizza_party",
			() -> BlockEntityType.Builder.of(ClawMachinePizzaPartyTileEntity::new, YaFnafmodModBlocks.CLAW_MACHINE_PIZZA_PARTY.get()).build(null));
	public static final RegistryObject<BlockEntityType<ClawMachineCupcakeBonanzaTileEntity>> CLAW_MACHINE_CUPCAKE_BONANZA = REGISTRY.register("claw_machine_cupcake_bonanza",
			() -> BlockEntityType.Builder.of(ClawMachineCupcakeBonanzaTileEntity::new, YaFnafmodModBlocks.CLAW_MACHINE_CUPCAKE_BONANZA.get()).build(null));
	public static final RegistryObject<BlockEntityType<SinkKitchenTileEntity>> SINK_KITCHEN = REGISTRY.register("sink_kitchen", () -> BlockEntityType.Builder.of(SinkKitchenTileEntity::new, YaFnafmodModBlocks.SINK_KITCHEN.get()).build(null));
	public static final RegistryObject<BlockEntityType<CutoutTreeOakTileEntity>> CUTOUT_TREE_OAK = REGISTRY.register("cutout_tree_oak",
			() -> BlockEntityType.Builder.of(CutoutTreeOakTileEntity::new, YaFnafmodModBlocks.CUTOUT_TREE_OAK.get()).build(null));
	public static final RegistryObject<BlockEntityType<CutoutTreePineTileEntity>> CUTOUT_TREE_PINE = REGISTRY.register("cutout_tree_pine",
			() -> BlockEntityType.Builder.of(CutoutTreePineTileEntity::new, YaFnafmodModBlocks.CUTOUT_TREE_PINE.get()).build(null));
	public static final RegistryObject<BlockEntityType<CutoutTreePalmTileEntity>> CUTOUT_TREE_PALM = REGISTRY.register("cutout_tree_palm",
			() -> BlockEntityType.Builder.of(CutoutTreePalmTileEntity::new, YaFnafmodModBlocks.CUTOUT_TREE_PALM.get()).build(null));
	public static final RegistryObject<BlockEntityType<StageLightRedTileEntity>> STAGE_LIGHT_RED = REGISTRY.register("stage_light_red",
			() -> BlockEntityType.Builder.of(StageLightRedTileEntity::new, YaFnafmodModBlocks.STAGE_LIGHT_RED.get()).build(null));
	public static final RegistryObject<BlockEntityType<StageLightOrangeTileEntity>> STAGE_LIGHT_ORANGE = REGISTRY.register("stage_light_orange",
			() -> BlockEntityType.Builder.of(StageLightOrangeTileEntity::new, YaFnafmodModBlocks.STAGE_LIGHT_ORANGE.get()).build(null));
	public static final RegistryObject<BlockEntityType<StageLightYellowTileEntity>> STAGE_LIGHT_YELLOW = REGISTRY.register("stage_light_yellow",
			() -> BlockEntityType.Builder.of(StageLightYellowTileEntity::new, YaFnafmodModBlocks.STAGE_LIGHT_YELLOW.get()).build(null));
	public static final RegistryObject<BlockEntityType<StageLightGreenTileEntity>> STAGE_LIGHT_GREEN = REGISTRY.register("stage_light_green",
			() -> BlockEntityType.Builder.of(StageLightGreenTileEntity::new, YaFnafmodModBlocks.STAGE_LIGHT_GREEN.get()).build(null));
	public static final RegistryObject<BlockEntityType<StageLightBlueTileEntity>> STAGE_LIGHT_BLUE = REGISTRY.register("stage_light_blue",
			() -> BlockEntityType.Builder.of(StageLightBlueTileEntity::new, YaFnafmodModBlocks.STAGE_LIGHT_BLUE.get()).build(null));
	public static final RegistryObject<BlockEntityType<StageLightPurpleTileEntity>> STAGE_LIGHT_PURPLE = REGISTRY.register("stage_light_purple",
			() -> BlockEntityType.Builder.of(StageLightPurpleTileEntity::new, YaFnafmodModBlocks.STAGE_LIGHT_PURPLE.get()).build(null));
	public static final RegistryObject<BlockEntityType<StageLightPinkTileEntity>> STAGE_LIGHT_PINK = REGISTRY.register("stage_light_pink",
			() -> BlockEntityType.Builder.of(StageLightPinkTileEntity::new, YaFnafmodModBlocks.STAGE_LIGHT_PINK.get()).build(null));
	public static final RegistryObject<BlockEntityType<FridgeIndustrialTileEntity>> FRIDGE_INDUSTRIAL = REGISTRY.register("fridge_industrial",
			() -> BlockEntityType.Builder.of(FridgeIndustrialTileEntity::new, YaFnafmodModBlocks.FRIDGE_INDUSTRIAL.get()).build(null));
	public static final RegistryObject<BlockEntityType<FredbearBloodyBlockTileEntity>> FREDBEAR_BLOODY_BLOCK = REGISTRY.register("fredbear_bloody_block",
			() -> BlockEntityType.Builder.of(FredbearBloodyBlockTileEntity::new, YaFnafmodModBlocks.FREDBEAR_BLOODY_BLOCK.get()).build(null));
	public static final RegistryObject<BlockEntityType<FredbearBloodyWrapBlockTileEntity>> FREDBEAR_BLOODY_WRAP_BLOCK = REGISTRY.register("fredbear_bloody_wrap_block",
			() -> BlockEntityType.Builder.of(FredbearBloodyWrapBlockTileEntity::new, YaFnafmodModBlocks.FREDBEAR_BLOODY_WRAP_BLOCK.get()).build(null));
	public static final RegistryObject<BlockEntityType<BigBackstageDoorTileEntity>> BIG_BACKSTAGE_DOOR = REGISTRY.register("big_backstage_door",
			() -> BlockEntityType.Builder.of(BigBackstageDoorTileEntity::new, YaFnafmodModBlocks.BIG_BACKSTAGE_DOOR.get()).build(null));
	public static final RegistryObject<BlockEntityType<BigBackstageDoor2TileEntity>> BIG_BACKSTAGE_DOOR_2 = REGISTRY.register("big_backstage_door_2",
			() -> BlockEntityType.Builder.of(BigBackstageDoor2TileEntity::new, YaFnafmodModBlocks.BIG_BACKSTAGE_DOOR_2.get()).build(null));
	public static final RegistryObject<BlockEntityType<BigKitchenDoorTileEntity>> BIG_KITCHEN_DOOR = REGISTRY.register("big_kitchen_door",
			() -> BlockEntityType.Builder.of(BigKitchenDoorTileEntity::new, YaFnafmodModBlocks.BIG_KITCHEN_DOOR.get()).build(null));
	public static final RegistryObject<BlockEntityType<BigKitchenWhiteDoorTileEntity>> BIG_KITCHEN_WHITE_DOOR = REGISTRY.register("big_kitchen_white_door",
			() -> BlockEntityType.Builder.of(BigKitchenWhiteDoorTileEntity::new, YaFnafmodModBlocks.BIG_KITCHEN_WHITE_DOOR.get()).build(null));
	public static final RegistryObject<BlockEntityType<BigBedroomDoorTileEntity>> BIG_BEDROOM_DOOR = REGISTRY.register("big_bedroom_door",
			() -> BlockEntityType.Builder.of(BigBedroomDoorTileEntity::new, YaFnafmodModBlocks.BIG_BEDROOM_DOOR.get()).build(null));
	public static final RegistryObject<BlockEntityType<BigRentalDoorTileEntity>> BIG_RENTAL_DOOR = REGISTRY.register("big_rental_door",
			() -> BlockEntityType.Builder.of(BigRentalDoorTileEntity::new, YaFnafmodModBlocks.BIG_RENTAL_DOOR.get()).build(null));
	public static final RegistryObject<BlockEntityType<BigRentalWindowedDoorTileEntity>> BIG_RENTAL_WINDOWED_DOOR = REGISTRY.register("big_rental_windowed_door",
			() -> BlockEntityType.Builder.of(BigRentalWindowedDoorTileEntity::new, YaFnafmodModBlocks.BIG_RENTAL_WINDOWED_DOOR.get()).build(null));
	public static final RegistryObject<BlockEntityType<BigEntranceRedDoorTileEntity>> BIG_ENTRANCE_RED_DOOR = REGISTRY.register("big_entrance_red_door",
			() -> BlockEntityType.Builder.of(BigEntranceRedDoorTileEntity::new, YaFnafmodModBlocks.BIG_ENTRANCE_RED_DOOR.get()).build(null));
	public static final RegistryObject<BlockEntityType<BigBackstageDoorRedTileEntity>> BIG_BACKSTAGE_DOOR_RED = REGISTRY.register("big_backstage_door_red",
			() -> BlockEntityType.Builder.of(BigBackstageDoorRedTileEntity::new, YaFnafmodModBlocks.BIG_BACKSTAGE_DOOR_RED.get()).build(null));
	public static final RegistryObject<BlockEntityType<BigEntranceDoorTileEntity>> BIG_ENTRANCE_DOOR = REGISTRY.register("big_entrance_door",
			() -> BlockEntityType.Builder.of(BigEntranceDoorTileEntity::new, YaFnafmodModBlocks.BIG_ENTRANCE_DOOR.get()).build(null));
	public static final RegistryObject<BlockEntityType<BigEntranceRedGlassDoorTileEntity>> BIG_ENTRANCE_RED_GLASS_DOOR = REGISTRY.register("big_entrance_red_glass_door",
			() -> BlockEntityType.Builder.of(BigEntranceRedGlassDoorTileEntity::new, YaFnafmodModBlocks.BIG_ENTRANCE_RED_GLASS_DOOR.get()).build(null));
	public static final RegistryObject<BlockEntityType<BigExitDoorTileEntity>> BIG_EXIT_DOOR = REGISTRY.register("big_exit_door", () -> BlockEntityType.Builder.of(BigExitDoorTileEntity::new, YaFnafmodModBlocks.BIG_EXIT_DOOR.get()).build(null));
	public static final RegistryObject<BlockEntityType<BigKitchenDoorWideTileEntity>> BIG_KITCHEN_DOOR_WIDE = REGISTRY.register("big_kitchen_door_wide",
			() -> BlockEntityType.Builder.of(BigKitchenDoorWideTileEntity::new, YaFnafmodModBlocks.BIG_KITCHEN_DOOR_WIDE.get()).build(null));
	public static final RegistryObject<BlockEntityType<BigKitchenWhiteDoorWideTileEntity>> BIG_KITCHEN_WHITE_DOOR_WIDE = REGISTRY.register("big_kitchen_white_door_wide",
			() -> BlockEntityType.Builder.of(BigKitchenWhiteDoorWideTileEntity::new, YaFnafmodModBlocks.BIG_KITCHEN_WHITE_DOOR_WIDE.get()).build(null));
	public static final RegistryObject<BlockEntityType<BigEntranceDoorWideTileEntity>> BIG_ENTRANCE_DOOR_WIDE = REGISTRY.register("big_entrance_door_wide",
			() -> BlockEntityType.Builder.of(BigEntranceDoorWideTileEntity::new, YaFnafmodModBlocks.BIG_ENTRANCE_DOOR_WIDE.get()).build(null));
	public static final RegistryObject<BlockEntityType<BigEntranceRedGlassDoorWideTileEntity>> BIG_ENTRANCE_RED_GLASS_DOOR_WIDE = REGISTRY.register("big_entrance_red_glass_door_wide",
			() -> BlockEntityType.Builder.of(BigEntranceRedGlassDoorWideTileEntity::new, YaFnafmodModBlocks.BIG_ENTRANCE_RED_GLASS_DOOR_WIDE.get()).build(null));
	public static final RegistryObject<BlockEntityType<BigEntranceRedDoorWideTileEntity>> BIG_ENTRANCE_RED_DOOR_WIDE = REGISTRY.register("big_entrance_red_door_wide",
			() -> BlockEntityType.Builder.of(BigEntranceRedDoorWideTileEntity::new, YaFnafmodModBlocks.BIG_ENTRANCE_RED_DOOR_WIDE.get()).build(null));
	public static final RegistryObject<BlockEntityType<BigBackstageRedDoorWideTileEntity>> BIG_BACKSTAGE_RED_DOOR_WIDE = REGISTRY.register("big_backstage_red_door_wide",
			() -> BlockEntityType.Builder.of(BigBackstageRedDoorWideTileEntity::new, YaFnafmodModBlocks.BIG_BACKSTAGE_RED_DOOR_WIDE.get()).build(null));
	public static final RegistryObject<BlockEntityType<BigOfficeDoorWindowed1TileEntity>> BIG_OFFICE_DOOR_WINDOWED_1 = REGISTRY.register("big_office_door_windowed_1",
			() -> BlockEntityType.Builder.of(BigOfficeDoorWindowed1TileEntity::new, YaFnafmodModBlocks.BIG_OFFICE_DOOR_WINDOWED_1.get()).build(null));
	public static final RegistryObject<BlockEntityType<BigOfficeDoorWindowed2TileEntity>> BIG_OFFICE_DOOR_WINDOWED_2 = REGISTRY.register("big_office_door_windowed_2",
			() -> BlockEntityType.Builder.of(BigOfficeDoorWindowed2TileEntity::new, YaFnafmodModBlocks.BIG_OFFICE_DOOR_WINDOWED_2.get()).build(null));
	public static final RegistryObject<BlockEntityType<BigClosetTileEntity>> BIG_CLOSET = REGISTRY.register("big_closet", () -> BlockEntityType.Builder.of(BigClosetTileEntity::new, YaFnafmodModBlocks.BIG_CLOSET.get()).build(null));
	public static final RegistryObject<BlockEntityType<HappyFrogBlockTileEntity>> HAPPY_FROG_BLOCK = REGISTRY.register("happy_frog_block",
			() -> BlockEntityType.Builder.of(HappyFrogBlockTileEntity::new, YaFnafmodModBlocks.HAPPY_FROG_BLOCK.get()).build(null));
	public static final RegistryObject<BlockEntityType<MrHippoBlockTileEntity>> MR_HIPPO_BLOCK = REGISTRY.register("mr_hippo_block", () -> BlockEntityType.Builder.of(MrHippoBlockTileEntity::new, YaFnafmodModBlocks.MR_HIPPO_BLOCK.get()).build(null));
	public static final RegistryObject<BlockEntityType<NeddbearBlockTileEntity>> NEDDBEAR_BLOCK = REGISTRY.register("neddbear_block",
			() -> BlockEntityType.Builder.of(NeddbearBlockTileEntity::new, YaFnafmodModBlocks.NEDDBEAR_BLOCK.get()).build(null));
	public static final RegistryObject<BlockEntityType<PigpatchBlockTileEntity>> PIGPATCH_BLOCK = REGISTRY.register("pigpatch_block",
			() -> BlockEntityType.Builder.of(PigpatchBlockTileEntity::new, YaFnafmodModBlocks.PIGPATCH_BLOCK.get()).build(null));
	public static final RegistryObject<BlockEntityType<OrvilleElephantBlockTileEntity>> ORVILLE_ELEPHANT_BLOCK = REGISTRY.register("orville_elephant_block",
			() -> BlockEntityType.Builder.of(OrvilleElephantBlockTileEntity::new, YaFnafmodModBlocks.ORVILLE_ELEPHANT_BLOCK.get()).build(null));
	public static final RegistryObject<BlockEntityType<CarHarleyMotorcycleBlockTileEntity>> CAR_HARLEY_MOTORCYCLE_BLOCK = REGISTRY.register("car_harley_motorcycle_block",
			() -> BlockEntityType.Builder.of(CarHarleyMotorcycleBlockTileEntity::new, YaFnafmodModBlocks.CAR_HARLEY_MOTORCYCLE_BLOCK.get()).build(null));
	public static final RegistryObject<BlockEntityType<RockstarFreddyBlockTileEntity>> ROCKSTAR_FREDDY_BLOCK = REGISTRY.register("rockstar_freddy_block",
			() -> BlockEntityType.Builder.of(RockstarFreddyBlockTileEntity::new, YaFnafmodModBlocks.ROCKSTAR_FREDDY_BLOCK.get()).build(null));
	public static final RegistryObject<BlockEntityType<RockstarBonnieBlockTileEntity>> ROCKSTAR_BONNIE_BLOCK = REGISTRY.register("rockstar_bonnie_block",
			() -> BlockEntityType.Builder.of(RockstarBonnieBlockTileEntity::new, YaFnafmodModBlocks.ROCKSTAR_BONNIE_BLOCK.get()).build(null));
	public static final RegistryObject<BlockEntityType<RockstarChicaBlockTileEntity>> ROCKSTAR_CHICA_BLOCK = REGISTRY.register("rockstar_chica_block",
			() -> BlockEntityType.Builder.of(RockstarChicaBlockTileEntity::new, YaFnafmodModBlocks.ROCKSTAR_CHICA_BLOCK.get()).build(null));
	public static final RegistryObject<BlockEntityType<RockstarFoxyBlockTileEntity>> ROCKSTAR_FOXY_BLOCK = REGISTRY.register("rockstar_foxy_block",
			() -> BlockEntityType.Builder.of(RockstarFoxyBlockTileEntity::new, YaFnafmodModBlocks.ROCKSTAR_FOXY_BLOCK.get()).build(null));
	public static final RegistryObject<BlockEntityType<LeftyBlockTileEntity>> LEFTY_BLOCK = REGISTRY.register("lefty_block", () -> BlockEntityType.Builder.of(LeftyBlockTileEntity::new, YaFnafmodModBlocks.LEFTY_BLOCK.get()).build(null));
	public static final RegistryObject<BlockEntityType<CutoutFreddyToyTileEntity>> CUTOUT_FREDDY_TOY = REGISTRY.register("cutout_freddy_toy",
			() -> BlockEntityType.Builder.of(CutoutFreddyToyTileEntity::new, YaFnafmodModBlocks.CUTOUT_FREDDY_TOY.get()).build(null));
	public static final RegistryObject<BlockEntityType<CutoutBonnieToyTileEntity>> CUTOUT_BONNIE_TOY = REGISTRY.register("cutout_bonnie_toy",
			() -> BlockEntityType.Builder.of(CutoutBonnieToyTileEntity::new, YaFnafmodModBlocks.CUTOUT_BONNIE_TOY.get()).build(null));
	public static final RegistryObject<BlockEntityType<CutoutChicaToyTileEntity>> CUTOUT_CHICA_TOY = REGISTRY.register("cutout_chica_toy",
			() -> BlockEntityType.Builder.of(CutoutChicaToyTileEntity::new, YaFnafmodModBlocks.CUTOUT_CHICA_TOY.get()).build(null));
	public static final RegistryObject<BlockEntityType<CutoutFoxyFuntimeTileEntity>> CUTOUT_FOXY_FUNTIME = REGISTRY.register("cutout_foxy_funtime",
			() -> BlockEntityType.Builder.of(CutoutFoxyFuntimeTileEntity::new, YaFnafmodModBlocks.CUTOUT_FOXY_FUNTIME.get()).build(null));
	public static final RegistryObject<BlockEntityType<CutoutFreddyFuntimeTileEntity>> CUTOUT_FREDDY_FUNTIME = REGISTRY.register("cutout_freddy_funtime",
			() -> BlockEntityType.Builder.of(CutoutFreddyFuntimeTileEntity::new, YaFnafmodModBlocks.CUTOUT_FREDDY_FUNTIME.get()).build(null));
	public static final RegistryObject<BlockEntityType<CutoutBabyTileEntity>> CUTOUT_BABY = REGISTRY.register("cutout_baby", () -> BlockEntityType.Builder.of(CutoutBabyTileEntity::new, YaFnafmodModBlocks.CUTOUT_BABY.get()).build(null));
	public static final RegistryObject<BlockEntityType<CutoutBalloraTileEntity>> CUTOUT_BALLORA = REGISTRY.register("cutout_ballora",
			() -> BlockEntityType.Builder.of(CutoutBalloraTileEntity::new, YaFnafmodModBlocks.CUTOUT_BALLORA.get()).build(null));
	public static final RegistryObject<BlockEntityType<BigElevatorDoorTileEntity>> BIG_ELEVATOR_DOOR = REGISTRY.register("big_elevator_door",
			() -> BlockEntityType.Builder.of(BigElevatorDoorTileEntity::new, YaFnafmodModBlocks.BIG_ELEVATOR_DOOR.get()).build(null));
	public static final RegistryObject<BlockEntityType<?>> ELEVATOR_BUTTON = register("elevator_button", YaFnafmodModBlocks.ELEVATOR_BUTTON, ElevatorButtonBlockEntity::new);
	public static final RegistryObject<BlockEntityType<DittophobiaFreddyBlockTileEntity>> DITTOPHOBIA_FREDDY_BLOCK = REGISTRY.register("dittophobia_freddy_block",
			() -> BlockEntityType.Builder.of(DittophobiaFreddyBlockTileEntity::new, YaFnafmodModBlocks.DITTOPHOBIA_FREDDY_BLOCK.get()).build(null));
	public static final RegistryObject<BlockEntityType<DittophobiaBonnieBlockTileEntity>> DITTOPHOBIA_BONNIE_BLOCK = REGISTRY.register("dittophobia_bonnie_block",
			() -> BlockEntityType.Builder.of(DittophobiaBonnieBlockTileEntity::new, YaFnafmodModBlocks.DITTOPHOBIA_BONNIE_BLOCK.get()).build(null));
	public static final RegistryObject<BlockEntityType<DittophobiaChicaBlockTileEntity>> DITTOPHOBIA_CHICA_BLOCK = REGISTRY.register("dittophobia_chica_block",
			() -> BlockEntityType.Builder.of(DittophobiaChicaBlockTileEntity::new, YaFnafmodModBlocks.DITTOPHOBIA_CHICA_BLOCK.get()).build(null));
	public static final RegistryObject<BlockEntityType<DittophobiaFoxyBlockTileEntity>> DITTOPHOBIA_FOXY_BLOCK = REGISTRY.register("dittophobia_foxy_block",
			() -> BlockEntityType.Builder.of(DittophobiaFoxyBlockTileEntity::new, YaFnafmodModBlocks.DITTOPHOBIA_FOXY_BLOCK.get()).build(null));
	public static final RegistryObject<BlockEntityType<Endo01BlockTileEntity>> ENDO_01_BLOCK = REGISTRY.register("endo_01_block", () -> BlockEntityType.Builder.of(Endo01BlockTileEntity::new, YaFnafmodModBlocks.ENDO_01_BLOCK.get()).build(null));
	public static final RegistryObject<BlockEntityType<Endo02BlockTileEntity>> ENDO_02_BLOCK = REGISTRY.register("endo_02_block", () -> BlockEntityType.Builder.of(Endo02BlockTileEntity::new, YaFnafmodModBlocks.ENDO_02_BLOCK.get()).build(null));
	public static final RegistryObject<BlockEntityType<CarPoliceCruiserChevroletImpala1983BlockTileEntity>> CAR_POLICE_CRUISER_CHEVROLET_IMPALA_1983_BLOCK = REGISTRY.register("car_police_cruiser_chevrolet_impala_1983_block",
			() -> BlockEntityType.Builder.of(CarPoliceCruiserChevroletImpala1983BlockTileEntity::new, YaFnafmodModBlocks.CAR_POLICE_CRUISER_CHEVROLET_IMPALA_1983_BLOCK.get()).build(null));
	public static final RegistryObject<BlockEntityType<FuntimeFreddyBlockTileEntity>> FUNTIME_FREDDY_BLOCK = REGISTRY.register("funtime_freddy_block",
			() -> BlockEntityType.Builder.of(FuntimeFreddyBlockTileEntity::new, YaFnafmodModBlocks.FUNTIME_FREDDY_BLOCK.get()).build(null));
	public static final RegistryObject<BlockEntityType<CircusBabyBlockTileEntity>> CIRCUS_BABY_BLOCK = REGISTRY.register("circus_baby_block",
			() -> BlockEntityType.Builder.of(CircusBabyBlockTileEntity::new, YaFnafmodModBlocks.CIRCUS_BABY_BLOCK.get()).build(null));
	public static final RegistryObject<BlockEntityType<BalloraBlockTileEntity>> BALLORA_BLOCK = REGISTRY.register("ballora_block", () -> BlockEntityType.Builder.of(BalloraBlockTileEntity::new, YaFnafmodModBlocks.BALLORA_BLOCK.get()).build(null));
	public static final RegistryObject<BlockEntityType<BonbonBlockTileEntity>> BONBON_BLOCK = REGISTRY.register("bonbon_block", () -> BlockEntityType.Builder.of(BonbonBlockTileEntity::new, YaFnafmodModBlocks.BONBON_BLOCK.get()).build(null));
	public static final RegistryObject<BlockEntityType<WitheredBonbonBlockTileEntity>> WITHERED_BONBON_BLOCK = REGISTRY.register("withered_bonbon_block",
			() -> BlockEntityType.Builder.of(WitheredBonbonBlockTileEntity::new, YaFnafmodModBlocks.WITHERED_BONBON_BLOCK.get()).build(null));
	public static final RegistryObject<BlockEntityType<BonnetBlockTileEntity>> BONNET_BLOCK = REGISTRY.register("bonnet_block", () -> BlockEntityType.Builder.of(BonnetBlockTileEntity::new, YaFnafmodModBlocks.BONNET_BLOCK.get()).build(null));
	public static final RegistryObject<BlockEntityType<FuntimeFoxyBlockTileEntity>> FUNTIME_FOXY_BLOCK = REGISTRY.register("funtime_foxy_block",
			() -> BlockEntityType.Builder.of(FuntimeFoxyBlockTileEntity::new, YaFnafmodModBlocks.FUNTIME_FOXY_BLOCK.get()).build(null));
	public static final RegistryObject<BlockEntityType<LolbitBlockTileEntity>> LOLBIT_BLOCK = REGISTRY.register("lolbit_block", () -> BlockEntityType.Builder.of(LolbitBlockTileEntity::new, YaFnafmodModBlocks.LOLBIT_BLOCK.get()).build(null));
	public static final RegistryObject<BlockEntityType<Lolbit409BlockTileEntity>> LOLBIT_409_BLOCK = REGISTRY.register("lolbit_409_block",
			() -> BlockEntityType.Builder.of(Lolbit409BlockTileEntity::new, YaFnafmodModBlocks.LOLBIT_409_BLOCK.get()).build(null));
	public static final RegistryObject<BlockEntityType<IndigoBlockTileEntity>> INDIGO_BLOCK = REGISTRY.register("indigo_block", () -> BlockEntityType.Builder.of(IndigoBlockTileEntity::new, YaFnafmodModBlocks.INDIGO_BLOCK.get()).build(null));
	public static final RegistryObject<BlockEntityType<MrHugsBlockTileEntity>> MR_HUGS_BLOCK = REGISTRY.register("mr_hugs_block", () -> BlockEntityType.Builder.of(MrHugsBlockTileEntity::new, YaFnafmodModBlocks.MR_HUGS_BLOCK.get()).build(null));
	public static final RegistryObject<BlockEntityType<MrCanDoBlockTileEntity>> MR_CAN_DO_BLOCK = REGISTRY.register("mr_can_do_block",
			() -> BlockEntityType.Builder.of(MrCanDoBlockTileEntity::new, YaFnafmodModBlocks.MR_CAN_DO_BLOCK.get()).build(null));
	public static final RegistryObject<BlockEntityType<NumberOneCrateBlockTileEntity>> NUMBER_ONE_CRATE_BLOCK = REGISTRY.register("number_one_crate_block",
			() -> BlockEntityType.Builder.of(NumberOneCrateBlockTileEntity::new, YaFnafmodModBlocks.NUMBER_ONE_CRATE_BLOCK.get()).build(null));
	public static final RegistryObject<BlockEntityType<PanStanBlockTileEntity>> PAN_STAN_BLOCK = REGISTRY.register("pan_stan_block", () -> BlockEntityType.Builder.of(PanStanBlockTileEntity::new, YaFnafmodModBlocks.PAN_STAN_BLOCK.get()).build(null));
	public static final RegistryObject<BlockEntityType<BucketBobBlockTileEntity>> BUCKET_BOB_BLOCK = REGISTRY.register("bucket_bob_block",
			() -> BlockEntityType.Builder.of(BucketBobBlockTileEntity::new, YaFnafmodModBlocks.BUCKET_BOB_BLOCK.get()).build(null));
	public static final RegistryObject<BlockEntityType<ScraptrapBlockTileEntity>> SCRAPTRAP_BLOCK = REGISTRY.register("scraptrap_block",
			() -> BlockEntityType.Builder.of(ScraptrapBlockTileEntity::new, YaFnafmodModBlocks.SCRAPTRAP_BLOCK.get()).build(null));
	public static final RegistryObject<BlockEntityType<MoltenFreddyBlockTileEntity>> MOLTEN_FREDDY_BLOCK = REGISTRY.register("molten_freddy_block",
			() -> BlockEntityType.Builder.of(MoltenFreddyBlockTileEntity::new, YaFnafmodModBlocks.MOLTEN_FREDDY_BLOCK.get()).build(null));
	public static final RegistryObject<BlockEntityType<GusThePugBlockTileEntity>> GUS_THE_PUG_BLOCK = REGISTRY.register("gus_the_pug_block",
			() -> BlockEntityType.Builder.of(GusThePugBlockTileEntity::new, YaFnafmodModBlocks.GUS_THE_PUG_BLOCK.get()).build(null));
	public static final RegistryObject<BlockEntityType<ScrapBabyBlockTileEntity>> SCRAP_BABY_BLOCK = REGISTRY.register("scrap_baby_block",
			() -> BlockEntityType.Builder.of(ScrapBabyBlockTileEntity::new, YaFnafmodModBlocks.SCRAP_BABY_BLOCK.get()).build(null));
	public static final RegistryObject<BlockEntityType<DougDogBlockTileEntity>> DOUG_DOG_BLOCK = REGISTRY.register("doug_dog_block", () -> BlockEntityType.Builder.of(DougDogBlockTileEntity::new, YaFnafmodModBlocks.DOUG_DOG_BLOCK.get()).build(null));
	public static final RegistryObject<BlockEntityType<WitheredDougDogBlockTileEntity>> WITHERED_DOUG_DOG_BLOCK = REGISTRY.register("withered_doug_dog_block",
			() -> BlockEntityType.Builder.of(WitheredDougDogBlockTileEntity::new, YaFnafmodModBlocks.WITHERED_DOUG_DOG_BLOCK.get()).build(null));
	public static final RegistryObject<BlockEntityType<JollyRatBlockTileEntity>> JOLLY_RAT_BLOCK = REGISTRY.register("jolly_rat_block",
			() -> BlockEntityType.Builder.of(JollyRatBlockTileEntity::new, YaFnafmodModBlocks.JOLLY_RAT_BLOCK.get()).build(null));
	public static final RegistryObject<BlockEntityType<WitheredJollyRatBlockTileEntity>> WITHERED_JOLLY_RAT_BLOCK = REGISTRY.register("withered_jolly_rat_block",
			() -> BlockEntityType.Builder.of(WitheredJollyRatBlockTileEntity::new, YaFnafmodModBlocks.WITHERED_JOLLY_RAT_BLOCK.get()).build(null));
	public static final RegistryObject<BlockEntityType<BalloonBoyBlockTileEntity>> BALLOON_BOY_BLOCK = REGISTRY.register("balloon_boy_block",
			() -> BlockEntityType.Builder.of(BalloonBoyBlockTileEntity::new, YaFnafmodModBlocks.BALLOON_BOY_BLOCK.get()).build(null));
	public static final RegistryObject<BlockEntityType<JjBlockTileEntity>> JJ_BLOCK = REGISTRY.register("jj_block", () -> BlockEntityType.Builder.of(JjBlockTileEntity::new, YaFnafmodModBlocks.JJ_BLOCK.get()).build(null));
	public static final RegistryObject<BlockEntityType<IgnitedChicaBlockTileEntity>> IGNITED_CHICA_BLOCK = REGISTRY.register("ignited_chica_block",
			() -> BlockEntityType.Builder.of(IgnitedChicaBlockTileEntity::new, YaFnafmodModBlocks.IGNITED_CHICA_BLOCK.get()).build(null));
	public static final RegistryObject<BlockEntityType<BigBackstageDoorBlackTileEntity>> BIG_BACKSTAGE_DOOR_BLACK = REGISTRY.register("big_backstage_door_black",
			() -> BlockEntityType.Builder.of(BigBackstageDoorBlackTileEntity::new, YaFnafmodModBlocks.BIG_BACKSTAGE_DOOR_BLACK.get()).build(null));
	public static final RegistryObject<BlockEntityType<BigBackstageDoorBlack2TileEntity>> BIG_BACKSTAGE_DOOR_BLACK_2 = REGISTRY.register("big_backstage_door_black_2",
			() -> BlockEntityType.Builder.of(BigBackstageDoorBlack2TileEntity::new, YaFnafmodModBlocks.BIG_BACKSTAGE_DOOR_BLACK_2.get()).build(null));
	public static final RegistryObject<BlockEntityType<BigBackstageDoorGrayTileEntity>> BIG_BACKSTAGE_DOOR_GRAY = REGISTRY.register("big_backstage_door_gray",
			() -> BlockEntityType.Builder.of(BigBackstageDoorGrayTileEntity::new, YaFnafmodModBlocks.BIG_BACKSTAGE_DOOR_GRAY.get()).build(null));
	public static final RegistryObject<BlockEntityType<BigBackstageDoorGray2TileEntity>> BIG_BACKSTAGE_DOOR_GRAY_2 = REGISTRY.register("big_backstage_door_gray_2",
			() -> BlockEntityType.Builder.of(BigBackstageDoorGray2TileEntity::new, YaFnafmodModBlocks.BIG_BACKSTAGE_DOOR_GRAY_2.get()).build(null));
	public static final RegistryObject<BlockEntityType<CutoutFazvanTileEntity>> CUTOUT_FAZVAN = REGISTRY.register("cutout_fazvan", () -> BlockEntityType.Builder.of(CutoutFazvanTileEntity::new, YaFnafmodModBlocks.CUTOUT_FAZVAN.get()).build(null));
	public static final RegistryObject<BlockEntityType<PizzeriaSignFfps2TileEntity>> PIZZERIA_SIGN_FFPS_2 = REGISTRY.register("pizzeria_sign_ffps_2",
			() -> BlockEntityType.Builder.of(PizzeriaSignFfps2TileEntity::new, YaFnafmodModBlocks.PIZZERIA_SIGN_FFPS_2.get()).build(null));
	public static final RegistryObject<BlockEntityType<PizzeriaSignJrsTileEntity>> PIZZERIA_SIGN_JRS = REGISTRY.register("pizzeria_sign_jrs",
			() -> BlockEntityType.Builder.of(PizzeriaSignJrsTileEntity::new, YaFnafmodModBlocks.PIZZERIA_SIGN_JRS.get()).build(null));
	public static final RegistryObject<BlockEntityType<PizzeriaSignJrs2TileEntity>> PIZZERIA_SIGN_JRS_2 = REGISTRY.register("pizzeria_sign_jrs_2",
			() -> BlockEntityType.Builder.of(PizzeriaSignJrs2TileEntity::new, YaFnafmodModBlocks.PIZZERIA_SIGN_JRS_2.get()).build(null));
	public static final RegistryObject<BlockEntityType<RickyRatBlockTileEntity>> RICKY_RAT_BLOCK = REGISTRY.register("ricky_rat_block",
			() -> BlockEntityType.Builder.of(RickyRatBlockTileEntity::new, YaFnafmodModBlocks.RICKY_RAT_BLOCK.get()).build(null));
	public static final RegistryObject<BlockEntityType<CandyCatBlockTileEntity>> CANDY_CAT_BLOCK = REGISTRY.register("candy_cat_block",
			() -> BlockEntityType.Builder.of(CandyCatBlockTileEntity::new, YaFnafmodModBlocks.CANDY_CAT_BLOCK.get()).build(null));
	public static final RegistryObject<BlockEntityType<CindyCatBlockTileEntity>> CINDY_CAT_BLOCK = REGISTRY.register("cindy_cat_block",
			() -> BlockEntityType.Builder.of(CindyCatBlockTileEntity::new, YaFnafmodModBlocks.CINDY_CAT_BLOCK.get()).build(null));
	public static final RegistryObject<BlockEntityType<PopgoesWeaselBlockTileEntity>> POPGOES_WEASEL_BLOCK = REGISTRY.register("popgoes_weasel_block",
			() -> BlockEntityType.Builder.of(PopgoesWeaselBlockTileEntity::new, YaFnafmodModBlocks.POPGOES_WEASEL_BLOCK.get()).build(null));
	public static final RegistryObject<BlockEntityType<BlakeBadgerBlockTileEntity>> BLAKE_BADGER_BLOCK = REGISTRY.register("blake_badger_block",
			() -> BlockEntityType.Builder.of(BlakeBadgerBlockTileEntity::new, YaFnafmodModBlocks.BLAKE_BADGER_BLOCK.get()).build(null));
	public static final RegistryObject<BlockEntityType<FuntimeChicaBlockTileEntity>> FUNTIME_CHICA_BLOCK = REGISTRY.register("funtime_chica_block",
			() -> BlockEntityType.Builder.of(FuntimeChicaBlockTileEntity::new, YaFnafmodModBlocks.FUNTIME_CHICA_BLOCK.get()).build(null));
	public static final RegistryObject<BlockEntityType<ElChipBlockTileEntity>> EL_CHIP_BLOCK = REGISTRY.register("el_chip_block", () -> BlockEntityType.Builder.of(ElChipBlockTileEntity::new, YaFnafmodModBlocks.EL_CHIP_BLOCK.get()).build(null));
	public static final RegistryObject<BlockEntityType<MusicManBlockTileEntity>> MUSIC_MAN_BLOCK = REGISTRY.register("music_man_block",
			() -> BlockEntityType.Builder.of(MusicManBlockTileEntity::new, YaFnafmodModBlocks.MUSIC_MAN_BLOCK.get()).build(null));
	public static final RegistryObject<BlockEntityType<BigTrashBinMovieTileEntity>> BIG_TRASH_BIN_MOVIE = REGISTRY.register("big_trash_bin_movie",
			() -> BlockEntityType.Builder.of(BigTrashBinMovieTileEntity::new, YaFnafmodModBlocks.BIG_TRASH_BIN_MOVIE.get()).build(null));
	public static final RegistryObject<BlockEntityType<CarDesotoBlockTileEntity>> CAR_DESOTO_BLOCK = REGISTRY.register("car_desoto_block",
			() -> BlockEntityType.Builder.of(CarDesotoBlockTileEntity::new, YaFnafmodModBlocks.CAR_DESOTO_BLOCK.get()).build(null));
	public static final RegistryObject<BlockEntityType<DittophobiaBbBlockTileEntity>> DITTOPHOBIA_BB_BLOCK = REGISTRY.register("dittophobia_bb_block",
			() -> BlockEntityType.Builder.of(DittophobiaBbBlockTileEntity::new, YaFnafmodModBlocks.DITTOPHOBIA_BB_BLOCK.get()).build(null));
	public static final RegistryObject<BlockEntityType<LolaChicaBlockTileEntity>> LOLA_CHICA_BLOCK = REGISTRY.register("lola_chica_block",
			() -> BlockEntityType.Builder.of(LolaChicaBlockTileEntity::new, YaFnafmodModBlocks.LOLA_CHICA_BLOCK.get()).build(null));
	public static final RegistryObject<BlockEntityType<ScrapLolaChicaBlockTileEntity>> SCRAP_LOLA_CHICA_BLOCK = REGISTRY.register("scrap_lola_chica_block",
			() -> BlockEntityType.Builder.of(ScrapLolaChicaBlockTileEntity::new, YaFnafmodModBlocks.SCRAP_LOLA_CHICA_BLOCK.get()).build(null));
	public static final RegistryObject<BlockEntityType<PizzeriaStandingSignMovie2TileEntity>> PIZZERIA_STANDING_SIGN_MOVIE_2 = REGISTRY.register("pizzeria_standing_sign_movie_2",
			() -> BlockEntityType.Builder.of(PizzeriaStandingSignMovie2TileEntity::new, YaFnafmodModBlocks.PIZZERIA_STANDING_SIGN_MOVIE_2.get()).build(null));
	public static final RegistryObject<BlockEntityType<BonnieHeadTileEntity>> BONNIE_HEAD = REGISTRY.register("bonnie_head", () -> BlockEntityType.Builder.of(BonnieHeadTileEntity::new, YaFnafmodModBlocks.BONNIE_HEAD.get()).build(null));
	public static final RegistryObject<BlockEntityType<ChicaHeadTileEntity>> CHICA_HEAD = REGISTRY.register("chica_head", () -> BlockEntityType.Builder.of(ChicaHeadTileEntity::new, YaFnafmodModBlocks.CHICA_HEAD.get()).build(null));
	public static final RegistryObject<BlockEntityType<FoxyHeadTileEntity>> FOXY_HEAD = REGISTRY.register("foxy_head", () -> BlockEntityType.Builder.of(FoxyHeadTileEntity::new, YaFnafmodModBlocks.FOXY_HEAD.get()).build(null));
	public static final RegistryObject<BlockEntityType<FredbearHeadTileEntity>> FREDBEAR_HEAD = REGISTRY.register("fredbear_head", () -> BlockEntityType.Builder.of(FredbearHeadTileEntity::new, YaFnafmodModBlocks.FREDBEAR_HEAD.get()).build(null));
	public static final RegistryObject<BlockEntityType<SpringbonnieHeadTileEntity>> SPRINGBONNIE_HEAD = REGISTRY.register("springbonnie_head",
			() -> BlockEntityType.Builder.of(SpringbonnieHeadTileEntity::new, YaFnafmodModBlocks.SPRINGBONNIE_HEAD.get()).build(null));
	public static final RegistryObject<BlockEntityType<RetroFreddyHeadTileEntity>> RETRO_FREDDY_HEAD = REGISTRY.register("retro_freddy_head",
			() -> BlockEntityType.Builder.of(RetroFreddyHeadTileEntity::new, YaFnafmodModBlocks.RETRO_FREDDY_HEAD.get()).build(null));
	public static final RegistryObject<BlockEntityType<RetroBonnieHeadTileEntity>> RETRO_BONNIE_HEAD = REGISTRY.register("retro_bonnie_head",
			() -> BlockEntityType.Builder.of(RetroBonnieHeadTileEntity::new, YaFnafmodModBlocks.RETRO_BONNIE_HEAD.get()).build(null));
	public static final RegistryObject<BlockEntityType<RetroChicaHeadTileEntity>> RETRO_CHICA_HEAD = REGISTRY.register("retro_chica_head",
			() -> BlockEntityType.Builder.of(RetroChicaHeadTileEntity::new, YaFnafmodModBlocks.RETRO_CHICA_HEAD.get()).build(null));
	public static final RegistryObject<BlockEntityType<RetroFoxyHeadTileEntity>> RETRO_FOXY_HEAD = REGISTRY.register("retro_foxy_head",
			() -> BlockEntityType.Builder.of(RetroFoxyHeadTileEntity::new, YaFnafmodModBlocks.RETRO_FOXY_HEAD.get()).build(null));
	public static final RegistryObject<BlockEntityType<MusicBoxRedDecorationTileEntity>> MUSIC_BOX_RED_DECORATION = REGISTRY.register("music_box_red_decoration",
			() -> BlockEntityType.Builder.of(MusicBoxRedDecorationTileEntity::new, YaFnafmodModBlocks.MUSIC_BOX_RED_DECORATION.get()).build(null));
	public static final RegistryObject<BlockEntityType<?>> PIZZA_OVEN = register("pizza_oven", YaFnafmodModBlocks.PIZZA_OVEN, PizzaOvenBlockEntity::new);
	public static final RegistryObject<BlockEntityType<BoxPlush5TileEntity>> BOX_PLUSH_5 = REGISTRY.register("box_plush_5", () -> BlockEntityType.Builder.of(BoxPlush5TileEntity::new, YaFnafmodModBlocks.BOX_PLUSH_5.get()).build(null));
	public static final RegistryObject<BlockEntityType<BoxPlush6TileEntity>> BOX_PLUSH_6 = REGISTRY.register("box_plush_6", () -> BlockEntityType.Builder.of(BoxPlush6TileEntity::new, YaFnafmodModBlocks.BOX_PLUSH_6.get()).build(null));
	public static final RegistryObject<BlockEntityType<SparkyDogBlockTileEntity>> SPARKY_DOG_BLOCK = REGISTRY.register("sparky_dog_block",
			() -> BlockEntityType.Builder.of(SparkyDogBlockTileEntity::new, YaFnafmodModBlocks.SPARKY_DOG_BLOCK.get()).build(null));
	public static final RegistryObject<BlockEntityType<ScrapSparkyDogBlockTileEntity>> SCRAP_SPARKY_DOG_BLOCK = REGISTRY.register("scrap_sparky_dog_block",
			() -> BlockEntityType.Builder.of(ScrapSparkyDogBlockTileEntity::new, YaFnafmodModBlocks.SCRAP_SPARKY_DOG_BLOCK.get()).build(null));
	public static final RegistryObject<BlockEntityType<?>> ALARM_CLOCK_OLD = register("alarm_clock_old", YaFnafmodModBlocks.ALARM_CLOCK_OLD, AlarmClockOldBlockEntity::new);
	public static final RegistryObject<BlockEntityType<?>> CHAIR_TORTURE = register("chair_torture", YaFnafmodModBlocks.CHAIR_TORTURE, ChairTortureBlockEntity::new);
	public static final RegistryObject<BlockEntityType<ShreddyFazchairBlockTileEntity>> SHREDDY_FAZCHAIR_BLOCK = REGISTRY.register("shreddy_fazchair_block",
			() -> BlockEntityType.Builder.of(ShreddyFazchairBlockTileEntity::new, YaFnafmodModBlocks.SHREDDY_FAZCHAIR_BLOCK.get()).build(null));
	public static final RegistryObject<BlockEntityType<Endo01PileTileEntity>> ENDO_01_PILE = REGISTRY.register("endo_01_pile", () -> BlockEntityType.Builder.of(Endo01PileTileEntity::new, YaFnafmodModBlocks.ENDO_01_PILE.get()).build(null));
	public static final RegistryObject<BlockEntityType<Endo02PileTileEntity>> ENDO_02_PILE = REGISTRY.register("endo_02_pile", () -> BlockEntityType.Builder.of(Endo02PileTileEntity::new, YaFnafmodModBlocks.ENDO_02_PILE.get()).build(null));
	public static final RegistryObject<BlockEntityType<CustomPizzeriaSignTileEntity>> CUSTOM_PIZZERIA_SIGN = REGISTRY.register("custom_pizzeria_sign",
			() -> BlockEntityType.Builder.of(CustomPizzeriaSignTileEntity::new, YaFnafmodModBlocks.CUSTOM_PIZZERIA_SIGN.get()).build(null));
	public static final RegistryObject<BlockEntityType<ArcadeBigTreatPounderTileEntity>> ARCADE_BIG_TREAT_POUNDER = REGISTRY.register("arcade_big_treat_pounder",
			() -> BlockEntityType.Builder.of(ArcadeBigTreatPounderTileEntity::new, YaFnafmodModBlocks.ARCADE_BIG_TREAT_POUNDER.get()).build(null));
	public static final RegistryObject<BlockEntityType<ArcadeFoosballTileEntity>> ARCADE_FOOSBALL = REGISTRY.register("arcade_foosball",
			() -> BlockEntityType.Builder.of(ArcadeFoosballTileEntity::new, YaFnafmodModBlocks.ARCADE_FOOSBALL.get()).build(null));
	public static final RegistryObject<BlockEntityType<ArcadeLilHoopsTileEntity>> ARCADE_LIL_HOOPS = REGISTRY.register("arcade_lil_hoops",
			() -> BlockEntityType.Builder.of(ArcadeLilHoopsTileEntity::new, YaFnafmodModBlocks.ARCADE_LIL_HOOPS.get()).build(null));
	public static final RegistryObject<BlockEntityType<ArcadeTicketMuncherCupcakeTileEntity>> ARCADE_TICKET_MUNCHER_CUPCAKE = REGISTRY.register("arcade_ticket_muncher_cupcake",
			() -> BlockEntityType.Builder.of(ArcadeTicketMuncherCupcakeTileEntity::new, YaFnafmodModBlocks.ARCADE_TICKET_MUNCHER_CUPCAKE.get()).build(null));
	public static final RegistryObject<BlockEntityType<ArcadeCandyCraneMachineTileEntity>> ARCADE_CANDY_CRANE_MACHINE = REGISTRY.register("arcade_candy_crane_machine",
			() -> BlockEntityType.Builder.of(ArcadeCandyCraneMachineTileEntity::new, YaFnafmodModBlocks.ARCADE_CANDY_CRANE_MACHINE.get()).build(null));
	public static final RegistryObject<BlockEntityType<BigEntraceFancyRedWideTileEntity>> BIG_ENTRACE_FANCY_RED_WIDE = REGISTRY.register("big_entrace_fancy_red_wide",
			() -> BlockEntityType.Builder.of(BigEntraceFancyRedWideTileEntity::new, YaFnafmodModBlocks.BIG_ENTRACE_FANCY_RED_WIDE.get()).build(null));
	public static final RegistryObject<BlockEntityType<Bobbleheads3TileEntity>> BOBBLEHEADS_3 = REGISTRY.register("bobbleheads_3", () -> BlockEntityType.Builder.of(Bobbleheads3TileEntity::new, YaFnafmodModBlocks.BOBBLEHEADS_3.get()).build(null));
	public static final RegistryObject<BlockEntityType<Bobbleheads2TileEntity>> BOBBLEHEADS_2 = REGISTRY.register("bobbleheads_2", () -> BlockEntityType.Builder.of(Bobbleheads2TileEntity::new, YaFnafmodModBlocks.BOBBLEHEADS_2.get()).build(null));
	public static final RegistryObject<BlockEntityType<MusicBoxPurpleDecorationTileEntity>> MUSIC_BOX_PURPLE_DECORATION = REGISTRY.register("music_box_purple_decoration",
			() -> BlockEntityType.Builder.of(MusicBoxPurpleDecorationTileEntity::new, YaFnafmodModBlocks.MUSIC_BOX_PURPLE_DECORATION.get()).build(null));
	public static final RegistryObject<BlockEntityType<WideFanTileEntity>> WIDE_FAN = REGISTRY.register("wide_fan", () -> BlockEntityType.Builder.of(WideFanTileEntity::new, YaFnafmodModBlocks.WIDE_FAN.get()).build(null));
	public static final RegistryObject<BlockEntityType<SecurityGateTileEntity>> SECURITY_GATE = REGISTRY.register("security_gate", () -> BlockEntityType.Builder.of(SecurityGateTileEntity::new, YaFnafmodModBlocks.SECURITY_GATE.get()).build(null));
	public static final RegistryObject<BlockEntityType<ArcadeRacingPinkTileEntity>> ARCADE_RACING_PINK = REGISTRY.register("arcade_racing_pink",
			() -> BlockEntityType.Builder.of(ArcadeRacingPinkTileEntity::new, YaFnafmodModBlocks.ARCADE_RACING_PINK.get()).build(null));
	public static final RegistryObject<BlockEntityType<ArcadeRacingBlueTileEntity>> ARCADE_RACING_BLUE = REGISTRY.register("arcade_racing_blue",
			() -> BlockEntityType.Builder.of(ArcadeRacingBlueTileEntity::new, YaFnafmodModBlocks.ARCADE_RACING_BLUE.get()).build(null));
	public static final RegistryObject<BlockEntityType<ToyFreddyHeadTileEntity>> TOY_FREDDY_HEAD = REGISTRY.register("toy_freddy_head",
			() -> BlockEntityType.Builder.of(ToyFreddyHeadTileEntity::new, YaFnafmodModBlocks.TOY_FREDDY_HEAD.get()).build(null));
	public static final RegistryObject<BlockEntityType<ToyBonnieHeadTileEntity>> TOY_BONNIE_HEAD = REGISTRY.register("toy_bonnie_head",
			() -> BlockEntityType.Builder.of(ToyBonnieHeadTileEntity::new, YaFnafmodModBlocks.TOY_BONNIE_HEAD.get()).build(null));
	public static final RegistryObject<BlockEntityType<ToyChicaHeadTileEntity>> TOY_CHICA_HEAD = REGISTRY.register("toy_chica_head", () -> BlockEntityType.Builder.of(ToyChicaHeadTileEntity::new, YaFnafmodModBlocks.TOY_CHICA_HEAD.get()).build(null));
	public static final RegistryObject<BlockEntityType<ToyFoxyHeadTileEntity>> TOY_FOXY_HEAD = REGISTRY.register("toy_foxy_head", () -> BlockEntityType.Builder.of(ToyFoxyHeadTileEntity::new, YaFnafmodModBlocks.TOY_FOXY_HEAD.get()).build(null));
	public static final RegistryObject<BlockEntityType<CutoutFoxyToyTileEntity>> CUTOUT_FOXY_TOY = REGISTRY.register("cutout_foxy_toy",
			() -> BlockEntityType.Builder.of(CutoutFoxyToyTileEntity::new, YaFnafmodModBlocks.CUTOUT_FOXY_TOY.get()).build(null));
	public static final RegistryObject<BlockEntityType<PizzeriaSignMovieLargeTileEntity>> PIZZERIA_SIGN_MOVIE_LARGE = REGISTRY.register("pizzeria_sign_movie_large",
			() -> BlockEntityType.Builder.of(PizzeriaSignMovieLargeTileEntity::new, YaFnafmodModBlocks.PIZZERIA_SIGN_MOVIE_LARGE.get()).build(null));
	public static final RegistryObject<BlockEntityType<BigDecoratedGlassEntranceDoorWideTileEntity>> BIG_DECORATED_GLASS_ENTRANCE_DOOR_WIDE = REGISTRY.register("big_decorated_glass_entrance_door_wide",
			() -> BlockEntityType.Builder.of(BigDecoratedGlassEntranceDoorWideTileEntity::new, YaFnafmodModBlocks.BIG_DECORATED_GLASS_ENTRANCE_DOOR_WIDE.get()).build(null));

	// Start of user code block custom block entities
	// End of user code block custom block entities
	private static RegistryObject<BlockEntityType<?>> register(String registryname, RegistryObject<Block> block, BlockEntityType.BlockEntitySupplier<?> supplier) {
		return REGISTRY.register(registryname, () -> BlockEntityType.Builder.of(supplier, block.get()).build(null));
	}
}
