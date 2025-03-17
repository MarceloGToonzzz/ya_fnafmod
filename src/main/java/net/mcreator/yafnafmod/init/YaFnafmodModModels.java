
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.yafnafmod.init;

import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.client.event.EntityRenderersEvent;
import net.minecraftforge.api.distmarker.Dist;

import net.mcreator.yafnafmod.client.model.Modelhazmat_suit;
import net.mcreator.yafnafmod.client.model.Modelglasses;
import net.mcreator.yafnafmod.client.model.Modelbasic_clothes;
import net.mcreator.yafnafmod.client.model.Modela;

@Mod.EventBusSubscriber(bus = Mod.EventBusSubscriber.Bus.MOD, value = {Dist.CLIENT})
public class YaFnafmodModModels {
	@SubscribeEvent
	public static void registerLayerDefinitions(EntityRenderersEvent.RegisterLayerDefinitions event) {
		event.registerLayerDefinition(Modelglasses.LAYER_LOCATION, Modelglasses::createBodyLayer);
		event.registerLayerDefinition(Modelhazmat_suit.LAYER_LOCATION, Modelhazmat_suit::createBodyLayer);
		event.registerLayerDefinition(Modelbasic_clothes.LAYER_LOCATION, Modelbasic_clothes::createBodyLayer);
		event.registerLayerDefinition(Modela.LAYER_LOCATION, Modela::createBodyLayer);
	}
}
