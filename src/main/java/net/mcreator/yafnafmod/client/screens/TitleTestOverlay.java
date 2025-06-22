
package net.mcreator.yafnafmod.client.screens;

import com.mojang.math.Axis;
import net.mcreator.yafnafmod.YaFnafmodMod;
import net.minecraft.ChatFormatting;
import net.mcreator.yafnafmod.client.screens.component.FnafModButton;
import net.minecraft.Util;
import net.minecraft.client.gui.Font;
import net.minecraft.client.gui.GuiGraphics;

import net.minecraft.client.gui.components.AbstractWidget;
import net.minecraft.client.gui.components.Button;
import net.minecraft.client.gui.components.ImageButton;
import net.minecraft.client.gui.components.Renderable;
import net.minecraft.client.gui.components.events.GuiEventListener;
import net.minecraft.client.gui.screens.OptionsScreen;
import net.minecraft.client.gui.screens.multiplayer.JoinMultiplayerScreen;
import net.minecraft.client.gui.screens.worldselection.SelectWorldScreen;
import net.minecraft.network.chat.Component;
import net.minecraft.util.Mth;
import net.minecraftforge.client.ForgeHooksClient;
import net.minecraftforge.client.gui.ModListScreen;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.eventbus.api.EventPriority;
import net.minecraftforge.client.event.ScreenEvent;
import net.minecraftforge.api.distmarker.Dist;

import net.minecraft.world.level.Level;
import net.minecraft.world.entity.player.Player;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.client.renderer.GameRenderer;
import net.minecraft.client.gui.screens.TitleScreen;
import net.minecraft.client.Minecraft;

import com.mojang.blaze3d.systems.RenderSystem;
import com.mojang.blaze3d.platform.GlStateManager;
import org.apache.commons.lang3.tuple.Pair;
import org.jetbrains.annotations.NotNull;
import java.util.ArrayList;
import java.util.List;

public class TitleTestOverlay extends TitleScreen {
	public static final ResourceLocation splash = new ResourceLocation(YaFnafmodMod.MODID, "splashes.txt");
	private static final ResourceLocation MINECRAFT_TITLE_TEXTURES = new ResourceLocation("textures/gui/title/minecraft.png");
	private static final ResourceLocation BACKGROUND = new ResourceLocation("ya_fnafmod:block/screens/background1.png");

	private final List<Pair<ImageButton, Component>> labeledButtons = new ArrayList<>();

	private float singleplayerButton;
	private float globalAlpha = 1F;
	private String splashText;

	public TitleTestOverlay() {
		super();
		this.splashText = "(static crackles)\n" +
				"\n" +
				"♪ ♪\n" +
				"\n" +
				"(static crackling)\n" +
				"\n" +
				"(quiet metallic squeaking)\n" +
				"\n" +
				"(man breathing rapidly)\n" +
				"\n" +
				"(whimpers)\n" +
				"\n" +
				"(grunting quietly)\n" +
				"\n" +
				"(breathing heavily)\n" +
				"\n" +
				"(loud crashing)\n" +
				"\n" +
				"(gasps)\n" +
				"\n" +
				"(pounding on door)\n" +
				"\n" +
				"(whimpering)\n" +
				"\n" +
				"(whimpering)\n" +
				"\n" +
				"(breathing rapidly)\n" +
				"\n" +
				"(grunts)\n" +
				"\n" +
				"(metal scrapes)\n" +
				"\n" +
				"(gasps)\n" +
				"\n" +
				"(door creaks)\n" +
				"\n" +
				"(muffled pop music playing in distance)\n" +
				"\n" +
				"(whimpers)\n" +
				"\n" +
				"♪ ♪\n" +
				"\n" +
				"(whimpering)\n" +
				"\n" +
				"(lights buzzing)\n" +
				"\n" +
				"(rattling)\n" +
				"\n" +
				"(male voice humming)\n" +
				"\n" +
				"(breathing rapidly, whimpering)\n" +
				"\n" +
				"(male voice scatting nearby)\n" +
				"\n" +
				"(heavy footsteps approaching)\n" +
				"\n" +
				"(screams)\n" +
				"\n" +
				"(breathing rapidly)\n" +
				"\n" +
				"(whirring, rattling)\n" +
				"\n" +
				"(breathing rapidly)\n" +
				"\n" +
				"(low growling)\n" +
				"\n" +
				"(straining, whimpering)\n" +
				"\n" +
				"(whirring and rattling intensify)\n" +
				"\n" +
				"(whimpering)\n" +
				"\n" +
				"(whimpering loudly)\n" +
				"\n" +
				"(crying out)\n" +
				"\n" +
				"(screaming)\n" +
				"\n" +
				"(screaming echoes, fades)\n" +
				"\n" +
				"♪ ♪\n" +
				"\n" +
				"♪ ♪\n" +
				"\n" +
				"(alarm clock beeping)\n" +
				"\n" +
				"(beeping stops)\n" +
				"\n" +
				"\n" +
				"♪ ♪\n" +
				"\n" +
				"(sighs)\n" +
				"\n" +
				"(tape rewinding)\n" +
				"\n" +
				"MIKE: Abs, you ready?\n" +
				"\n" +
				"Abby…\n" +
				"\n" +
				"MIKE: Abs.\n" +
				"\n" +
				"Come on. I know you’re in there. Let’s go.\n" +
				"\n" +
				"Abby, come on.\n" +
				"\n" +
				"Okay, okay.\n" +
				"\n" +
				"You’re being a jerk.\n" +
				"\n" +
				"You know I have somewhere I have to be.\n" +
				"\n" +
				"Come on, let’s go. Five minutes.\n" +
				"\n" +
				"I need you dressed.\n" +
				"\n" +
				"(toy squeaks)\n" +
				"\n" +
				"Five minutes.\n" +
				"\n" +
				"(crowd chatter)\n" +
				"\n" +
				"JEREMIAH: “And though the dreamer remains asleep, he walks through memory as if experiencing it for the first time anew, no longer a passenger but an active participant.”\n" +
				"\n" +
				"(chuckles)\n" +
				"\n" +
				"This stuff for real?\n" +
				"\n" +
				"Some people think so.\n" +
				"\n" +
				"Guess it depends on what you believe.\n" +
				"\n" +
				"Summer of ’82, I traded a mint condition Cal Ripken Jr. rookie for a used copy of “Missile Command.”\n" +
				"\n" +
				"That card’s probably worth 800 bucks now.\n" +
				"\n" +
				"I wish I could participate in that memory and actively kick my own ass.\n" +
				"\n" +
				"Can I keep it?\n" +
				"\n" +
				"No.\n" +
				"\n" +
				"WOMAN: I would like the walnut fudge, but I want the fudge on the side because I don’t want it to melt the ice cream.\n" +
				"\n" +
				"And can I get some whipped cream on top and three cherries?\n" +
				"\n" +
				"CINDY: Coming right up.\n" +
				"\n" +
				"Hey.\n" +
				"\n" +
				"You want your usual, right?\n" +
				"\n" +
				"Uh, yeah.\n" +
				"\n" +
				"So, when are you gonna bring your sister by?\n" +
				"\n" +
				"We got this new flavor, Rainbow Explosion.\n" +
				"\n" +
				"I bet she’ll go crazy for it.\n" +
				"\n" +
				"Mike?\n" +
				"\n" +
				"Hey!\n" +
				"\n" +
				"Hey!\n" +
				"\n" +
				"Hey!\n" +
				"\n" +
				"(grunts)\n" +
				"\n" +
				"(crowd gasping, murmuring)\n" +
				"\n" +
				"(grunting)\n" +
				"\n" +
				"WOMAN (distantly): Number 27?\n" +
				"\n" +
				"(echoing): Number 27?\n" +
				"\n" +
				"(normal): Number 27?\n" +
				"\n" +
				"Follow me.\n" +
				"\n" +
				"(humming a tune quietly)\n" +
				"\n" +
				"Mm.\n" +
				"\n" +
				"What is your deal, Mike?\n" +
				"\n" +
				"What are you, some kind of… head case?\n" +
				"\n" +
				"\n" +
				"You beat up a man in broad daylight.\n" +
				"\n" +
				"In front of his child.\n" +
				"\n" +
				"Daddy!\n" +
				"\n" +
				"(people screaming)\n" +
				"\n" +
				"(panting)\n" +
				"\n" +
				"That was a mistake. Um…\n" +
				"\n" +
				"It was a misunderstanding. I-I thought…\n" +
				"\n" +
				"Just look at your employment record.\n" +
				"\n" +
				"Tire Zone, sales associate, two months, terminated.\n" +
				"\n" +
				"Insubordination.\n" +
				"\n" +
				"Media World, custodial staff, one week.\n" +
				"\n" +
				"It’s like you’re not even trying here, yet you sit before me asking for help.\n" +
				"\n" +
				"I am just trying to figure out who you are, Mr. Michael Sh…\n" +
				"\n" +
				"Hmm.\n" +
				"\n" +
				"Coffee?\n" +
				"\n" +
				"Sorry?\n" +
				"\n" +
				"Uh, would you, would you like some… some coffee? I made some coffee.\n" +
				"\n" +
				"No.\n" +
				"\n" +
				"I’m-I’m gonna be brutally honest with you here, Mike.\n" +
				"\n" +
				"Given your track record, your options… are gonna be extremely limited.\n" +
				"\n" +
				"I’ll take anything, okay? Any-any job you got.\n" +
				"\n" +
				"No. No.\n" +
				"\n" +
				"Look, I-I-I get that part. Um, it’s just…\n" +
				"\n" +
				"You know, it’s not that easy.\n" +
				"\n" +
				"Yeah. Thank you.\n" +
				"\n" +
				"I have a job for you.\n" +
				"\n" +
				"Come on, sit down.\n" +
				"\n" +
				"Sit, sit, sit, sit, sit.\n" +
				"\n" +
				"Okay, uh, well, what is it?\n" +
				"\n" +
				"It’s a security gig.\n" +
				"\n" +
				"Full disclosure: it’s not great.\n" +
				"\n" +
				"Right? High turnover.\n" +
				"\n" +
				"That’s what we call it in the business, but you get to be your own boss. Sort of.\n" +
				"\n" +
				"And you only have to worry about one thing.\n" +
				"\n" +
				"Keeping people out.\n" +
				"\n" +
				"And-and, you know, and keep the place tidy.\n" +
				"\n" +
				"That’s two things.\n" +
				"\n" +
				"You want the job or not?\n" +
				"\n" +
				"How’s the pay?\n" +
				"\n" +
				"Not great.\n" +
				"\n" +
				"But the hours are worse.\n" +
				"\n" +
				"(quietly): I can’t do nights.\n" +
				"\n" +
				"Excuse me?\n" +
				"\n" +
				"I can’t do nights.\n" +
				"\n" +
				"(chuckles)\n" +
				"\n" +
				"That’s such a shame.\n" +
				"\n" +
				"Yeah.\n" +
				"\n" +
				"Thank you.\n" +
				"\n" +
				"Wait, uh…\n" +
				"\n" +
				"In case you have a change of heart.\n" +
				"\n" +
				"\n" +
				"♪ ♪\n" +
				"\n" +
				"(TV playing quietly)\n" +
				"\n" +
				"MIKE: Hey, Max.\n" +
				"\n" +
				"Thanks for babysitting.\n" +
				"\n" +
				"There’s Stouffer’s.\n" +
				"\n" +
				"Should still be warm if you’re hungry.\n" +
				"\n" +
				"WOMAN (on TV): I have to tell you, there is something magical about these rings, and you can have it within…\n" +
				"\n" +
				"I wish someone would buy me a ring.\n" +
				"\n" +
				"Did Abby eat?\n" +
				"\n" +
				"What do you think?\n" +
				"\n" +
				"(humming a tune)\n" +
				"\n" +
				"MAX: Same time tomorrow?\n" +
				"\n" +
				"MIKE: Yep.\n" +
				"\n" +
				"(continues humming)\n" +
				"\n" +
				"What do we got?\n" +
				"\n" +
				"Okay.\n" +
				"\n" +
				"Well, that good-looking guy I recognize.\n" +
				"\n" +
				"Who are all these other punks?\n" +
				"\n" +
				"My friends. It’s not done yet.\n" +
				"\n" +
				"Well, look, you can finish up after we eat, all right?\n" +
				"\n" +
				"Come get some food.\n" +
				"\n" +
				"I’m not hungry.\n" +
				"\n" +
				"Abby, please, come eat.\n" +
				"\n" +
				"Come on. Here. Please come.\n" +
				"\n" +
				"No!\n" +
				"\n" +
				"Come and…\n" +
				"\n" +
				"Abs, with the day that I’m having, can you just eat some food?\n" +
				"\n" +
				"You’re sitting on my friend.\n" +
				"\n" +
				"You know what? I don’t care.\n" +
				"\n" +
				"Do whatever you want.\n" +
				"\n" +
				"But you should know what happens to little kids who don’t eat their dinners.\n" +
				"\n" +
				"Their bodies stay the same size forever.\n" +
				"\n" +
				"And they never get to ride the adult rides at the amusement park.\n" +
				"\n" +
				"My friend says you’re an idiot.\n" +
				"\n" +
				"Mm.\n" +
				"\n" +
				"At least I’m real.\n" +
				"\n" +
				"(sighs)\n" +
				"\n" +
				"(tape whirring)\n" +
				"\n" +
				"(birds chirping on tape)\n" +
				"\n" +
				"(sighs)\n" +
				"\n" +
				"♪ ♪\n" +
				"\n" +
				"(imitating airplane)\n" +
				"\n" +
				"MAN: How about some burger with that ketchup, hon?\n" +
				"\n" +
				"(woman laughs)\n" +
				"\n" +
				"Everything’s better swimming in ketchup.\n" +
				"\n" +
				"Right, Mike? Whoop.\n" +
				"\n" +
				"I’m gonna go grab a towel.\n" +
				"\n" +
				"Go watch your brother, okay?\n" +
				"\n" +
				"Okay.\n" +
				"\n" +
				"MIKE: Garrett.\n" +
				"\n" +
				"\n" +
				"(car engine starts)\n" +
				"\n" +
				"(engine revving)\n" +
				"\n" +
				"Garrett?\n" +
				"\n" +
				"♪ ♪\n" +
				"\n" +
				"(heart beating rapidly)\n" +
				"\n" +
				"(panting)\n" +
				"\n" +
				"Garrett! Garrett!\n" +
				"\n" +
				"(shouting echoes, fades)\n" +
				"\n" +
				"(tape rewinding)\n" +
				"\n" +
				"(playful chatter)\n" +
				"\n" +
				"♪ ♪\n" +
				"\n" +
				"JANE: Just look at my nephew.\n" +
				"\n" +
				"It’s not even 10:00\n" +
				"\n" +
				"and he-he can barely keep his eyes open.\n" +
				"\n" +
				"And this degenerate is who they entrust with the well-being of a mentally ill child.\n" +
				"\n" +
				"Jane, like I’ve said before, Abby is not mentally ill.\n" +
				"\n" +
				"Oh, right.\n" +
				"\n" +
				"Perfectly normal to sit around drawing pictures all day and-and talking to magical creatures who do not exist.\n" +
				"\n" +
				"Listen, I think we all just need to calm…\n" +
				"\n" +
				"Don’t tell me to calm down.\n" +
				"\n" +
				"You’re the doctor, and you’re making me feel like I’m the crazy one?\n" +
				"\n" +
				"And after… after what he did to that poor man…\n" +
				"\n" +
				"(crying): I just…\n" +
				"\n" +
				"(Jane sobbing)\n" +
				"\n" +
				"I have really tried to play nice. I have.\n" +
				"\n" +
				"But I have to think about Abby now.\n" +
				"\n" +
				"Enough is enough. Doug?\n" +
				"\n" +
				"Doug.\n" +
				"\n" +
				"(gasps) Oh.\n" +
				"\n" +
				"JANE: In your heart, you know that this is the right thing to do.\n" +
				"\n" +
				"I hope that you will sign.\n" +
				"\n" +
				"And if I don’t?\n" +
				"\n" +
				"Well, then, my lawyer and I will have to take you to court, where any judge with an ounce of sanity will see to it that you never see your sister again.\n" +
				"\n" +
				"That what you want?\n" +
				"\n" +
				"She-she doesn’t even care about Abby.\n" +
				"\n" +
				"All she wants is the monthly check from the state.\n" +
				"\n" +
				"(breathes deeply)\n" +
				"\n" +
				"But, I mean, she-she has some good points, though.\n" +
				"\n" +
				"I’m hardly fit to be raising a kid.\n" +
				"\n" +
				"LILLIAN: I know a little girl who would strongly disagree.\n" +
				"\n" +
				"MIKE: Come on.\n" +
				"\n" +
				"She talks to air more than she talks to me.\n" +
				"\n" +
				"I could drop dead tomorrow, and she’d be too busy drawing to even notice.\n" +
				"\n" +
				"You know, pictures hold tremendous power for children.\n" +
				"\n" +
				"Before we learn to speak, images are the most important tool we have for understanding the world around us.\n" +
				"\n" +
				"What’s real, what matters to us most.\n" +
				"\n" +
				"These are things children learn to communicate almost exclusively through pictures.\n" +
				"\n" +
				"Yeah, her pictures mean something.\n" +
				"\n" +
				"And who is at the center of nine out of ten of them?\n" +
				"\n" +
				"Me.\n" +
				"\n" +
				"\n" +
				"Mm-hmm.\n" +
				"\n" +
				"Like it or not, you’re her world.\n" +
				"\n" +
				"MIKE: But what if it’s not up to me?\n" +
				"\n" +
				"My aunt, she’s an idiot, but she’s right.\n" +
				"\n" +
				"No judge in their right mind is ever gonna side with me.\n" +
				"\n" +
				"Did you find a job yet?\n" +
				"\n" +
				"Okay.\n" +
				"\n" +
				"That would be a good place to start.\n" +
				"\n" +
				"(whimsical music playing over TV)\n" +
				"\n" +
				"(Mike sighs)\n" +
				"\n" +
				"(pressing phone keys)\n" +
				"\n" +
				"(line ringing)\n" +
				"\n" +
				"STEVE (over phone): Hello.\n" +
				"\n" +
				"Uh, hi.\n" +
				"\n" +
				"Mr. Raglan, this is Mike.\n" +
				"\n" +
				"Mr. “I can’t work nights.”\n" +
				"\n" +
				"Right.\n" +
				"\n" +
				"Uh, yeah, I was just calling to see if that job that you offered was, uh, was still available.\n" +
				"\n" +
				"Oh, it absolutely is.\n" +
				"\n" +
				"Why? Have you had a change of heart?\n" +
				"\n" +
				"(TV continues playing quietly)\n" +
				"\n" +
				"MIKE: How soon could I start?\n" +
				"\n" +
				"♪ ♪\n" +
				"\n" +
				"STEVE: Let me give you a little backstory.\n" +
				"\n" +
				"This place was huge in the ’80s with the kids.\n" +
				"\n" +
				"It’s been shut down for years.\n" +
				"\n" +
				"The only reason they haven’t given it the old wrecking ball treatment is the owner’s a bit of a…\n" +
				"\n" +
				"Well, he’s kind of a sentimental guy, I guess.\n" +
				"\n" +
				"Just can’t bring himself to let it go yet.\n" +
				"\n" +
				"(laughs)\n" +
				"\n" +
				"Yeah.\n" +
				"\n" +
				"Had some trouble with break-ins over the years.\n" +
				"\n" +
				"Drunks and vagrants, mostly. Not ideal.\n" +
				"\n" +
				"Security system’s dated but fully functional.\n" +
				"\n" +
				"Floodlights on the outside, cameras inside and outside.\n" +
				"\n" +
				"Fair warning: the electricity is a bit… iffy.\n" +
				"\n" +
				"(glass crunching)\n" +
				"\n" +
				"♪ ♪\n" +
				"\n" +
				"Anything happens, there is a breaker in the main office.\n" +
				"\n" +
				"Just flip it.\n" +
				"\n" +
				"(machines powering up)\n" +
				"\n" +
				"(lights clinking, buzzing)\n" +
				"\n" +
				"Uh, I guess that’s about it.\n" +
				"\n" +
				"You know… the rest is pretty easy.\n" +
				"\n" +
				"Just keep your eyes on the monitors and… and keep people out.\n" +
				"\n" +
				"Piece of cake.\n" +
				"\n" +
				"♪ ♪\n" +
				"\n" +
				"(sighs)\n" +
				"\n" +
				"STEVE: So, I will catch you on the flip side.\n" +
				"\n" +
				"Hopefully.\n" +
				"\n" +
				"\n" +
				"♪ ♪\n" +
				"\n" +
				"The hell?\n" +
				"\n" +
				"(upbeat music playing over TV)\n" +
				"\n" +
				"Welcome to Freddy Fazbear’s Pizzeria, a magical place for kids and grown-ups alike, where fantasy and fun come to life.\n" +
				"\n" +
				"If you’re watching this video, it means you’ve been selected as Freddy’s newest security guard.\n" +
				"\n" +
				"Congratulations.\n" +
				"\n" +
				"We’re going to have so much fun together.\n" +
				"\n" +
				"The genius who created Fazbear Entertainment opened Freddy Fazbear’s Pizzeria to indulge in his two greatest passions: family-friendly fun and cutting-edge animatronic technology.\n" +
				"\n" +
				"(scoffs) -State-of-the-art robotic engineering enables our characters to interact with guests in truly lifelike fashion, while cleverly concealed rechargeable lithium cells give them limited range to roam free.\n" +
				"\n" +
				"Let’s introduce you to the stars of the show.\n" +
				"\n" +
				"(static crackling)\n" +
				"\n" +
				"(laughs) Adorable, aren’t they?\n" +
				"\n" +
				"Protecting these cuddly critters, and the proprietary technology that brings them to life, is now your sacred duty.\n" +
				"\n" +
				"Keep them safe, and help ensure that Freddy Fazbear’s Pizzeria is here to delight, dazzle and entertain\n" +
				"\n" +
				"(distorted): for years to…\n" +
				"\n" +
				"(static crackling)\n" +
				"\n" +
				"All right.\n" +
				"\n" +
				"(sighs)\n" +
				"\n" +
				"(gasps)\n" +
				"\n" +
				"♪ ♪\n" +
				"\n" +
				"♪ ♪\n" +
				"\n" +
				"(object thuds, clatters)\n" +
				"\n" +
				"Hello?\n" +
				"\n" +
				"♪ ♪\n" +
				"\n" +
				"(gasps)\n" +
				"\n" +
				"(quiet electronic warbling)\n" +
				"\n" +
				"♪ ♪\n" +
				"\n" +
				"(clock ticking)\n" +
				"\n" +
				"(static crackling softly over speaker)\n" +
				"\n" +
				"(static continues)\n" +
				"\n" +
				"(imitating airplane)\n" +
				"\n" +
				"MOTHER: Everything’s better swimming in ketchup.\n" +
				"\n" +
				"Right, Mike?\n" +
				"\n" +
				"(chuckles)\n" +
				"\n" +
				"Go watch your brother, okay?\n" +
				"\n" +
				"♪ ♪\n" +
				"\n" +
				"Garrett?\n" +
				"\n" +
				"Garrett!\n" +
				"\n" +
				"(footstep crunches softly)\n" +
				"\n" +
				"♪ ♪\n" +
				"\n" +
				"What is this?\n" +
				"\n" +
				"Who are you?\n" +
				"\n" +
				"That car.\n" +
				"\n" +
				"Did you see that car? You see what happened?\n" +
				"\n" +
				"(static continues)\n" +
				"\n" +
				"Did you see who took my brother?\n" +
				"\n" +
				"Wait! No.\n" +
				"\n" +
				"♪ ♪\n" +
				"\n" +
				"(grunts)\n" +
				"\n" +
				"(watch alarm beeping)\n" +
				"\n" +
				"\n" +
				"(panting, groans)\n" +
				"\n" +
				"(beeping stops)\n" +
				"\n" +
				"(panting)\n" +
				"\n" +
				"(TV playing quietly)\n" +
				"\n" +
				"Hey.\n" +
				"\n" +
				"Hey, Max.\n" +
				"\n" +
				"(exhales)\n" +
				"\n" +
				"So? How’d it go?\n" +
				"\n" +
				"Uh… it was interesting.\n" +
				"\n" +
				"I should probably get out of here.\n" +
				"\n" +
				"Hey, by the way, I-I do intend on-on paying you, eventually.\n" +
				"\n" +
				"It’s okay.\n" +
				"\n" +
				"I know where you live.\n" +
				"\n" +
				"(chuckles softly)\n" +
				"\n" +
				"(vehicle approaching)\n" +
				"\n" +
				"(truck horn honking)\n" +
				"\n" +
				"(entry bell jingles)\n" +
				"\n" +
				"WAITER: Hey. Welcome to Sparky’s.\n" +
				"\n" +
				"Could I set you folks up with some appetizers?\n" +
				"\n" +
				"JEFF: Yes.\n" +
				"\n" +
				"JANE: Oh.\n" +
				"\n" +
				"We are not eating.\n" +
				"\n" +
				"WAITER: (chuckles) Well, that’s no fun.\n" +
				"\n" +
				"You do realize that lunch is the most important meal of the day?\n" +
				"\n" +
				"JEFF: I thought it was breakfast.\n" +
				"\n" +
				"Some people say that, but, you know, it’s just a theory. -Are you being paid by the word, or could we have a minute?\n" +
				"\n" +
				"All right.\n" +
				"\n" +
				"Thank you.\n" +
				"\n" +
				"JANE: Ah, where were we?\n" +
				"\n" +
				"Oh, you were about to tell me what a miserable failure you are.\n" +
				"\n" +
				"JEFF: Hey, screw you, lady.\n" +
				"\n" +
				"My sister went over every inch of that dump a thousand times.\n" +
				"\n" +
				"If there was something to find, she would have found it.\n" +
				"\n" +
				"Now pay up.\n" +
				"\n" +
				"Uh, I’m sorry? (laughing)\n" +
				"\n" +
				"JEFF: You said 200.\n" +
				"\n" +
				"We had a deal.\n" +
				"\n" +
				"Yeah, that you were gonna find me hard proof of criminal endangerment.\n" +
				"\n" +
				"Instead, you’ve told me what a nice kid my niece is and that my nephew sleeps a lot.\n" +
				"\n" +
				"He really does, though.\n" +
				"\n" +
				"Sleeping is not a crime.\n" +
				"\n" +
				"Is that guy okay?\n" +
				"\n" +
				"I just realized I shouldn’t be hearing any of this.\n" +
				"\n" +
				"As a matter of fact, I shouldn’t be here at all.\n" +
				"\n" +
				"Sit down, Doug.\n" +
				"\n" +
				"So, I guess we’re finished here, unless either one of you has a brilliant idea, which I realize is highly unlikely.\n" +
				"\n" +
				"Why don’t we just kill him?\n" +
				"\n" +
				"(Doug sighs)\n" +
				"\n" +
				"Tempting. But no.\n" +
				"\n" +
				"What else?\n" +
				"\n" +
				"\n" +
				"Mike was saying that… he really needs this new job to, like, look good on paper for the judge or something.\n" +
				"\n" +
				"Well, that’s all very fascinating, honey, but I am not hearing a plan.\n" +
				"\n" +
				"We toss the place.\n" +
				"\n" +
				"Go on. -Well, he’s a security guard, right?\n" +
				"\n" +
				"His job is to make sure nobody gets in.\n" +
				"\n" +
				"So, we get in, and we mess up the place good.\n" +
				"\n" +
				"We help ourselves to whatever we find along the way.\n" +
				"\n" +
				"Your nephew gets canned.\n" +
				"\n" +
				"Judge gives you the kid, and you give us…\n" +
				"\n" +
				"$2,000.\n" +
				"\n" +
				"One thousand.\n" +
				"\n" +
				"But do it fast, and don’t mess it up.\n" +
				"\n" +
				"I mean, you know, mess it up, but don’t… don’t mess this up.\n" +
				"\n" +
				"(thunder crashing)\n" +
				"\n" +
				"(grunting)\n" +
				"\n" +
				"Come on. (grunting)\n" +
				"\n" +
				"ABBY: What are you doing?\n" +
				"\n" +
				"(grunts)\n" +
				"\n" +
				"Abby, do you need something?\n" +
				"\n" +
				"No. -All right, quit playing and take that off.\n" +
				"\n" +
				"I have to go to work.\n" +
				"\n" +
				"I know. I’m coming with you.\n" +
				"\n" +
				"No, you’re not.\n" +
				"\n" +
				"Give me the vest.\n" +
				"\n" +
				"No.\n" +
				"\n" +
				"Give me the vest now.\n" +
				"\n" +
				"I’m coming with you.\n" +
				"\n" +
				"ABBY: I want to go with you.\n" +
				"\n" +
				"MIKE: Abby.\n" +
				"\n" +
				"I don’t want to stay here with Max. -Abby, stop.\n" +
				"\n" +
				"Hello? -Abby, stop.\n" +
				"\n" +
				"No! You can’t make me.\n" +
				"\n" +
				"MIKE: Yes, I can.\n" +
				"\n" +
				"No, it’s mine.\n" +
				"\n" +
				"MAX: Hello?\n" +
				"\n" +
				"(Abby screams)\n" +
				"\n" +
				"Let go! (screams)\n" +
				"\n" +
				"Let go. No, no.\n" +
				"\n" +
				"MIKE: Abby, stop. Abby.\n" +
				"\n" +
				"He’s taking my vest!\n" +
				"\n" +
				"Abby.\n" +
				"\n" +
				"ABBY: I’m keeping it.\n" +
				"\n" +
				"No.\n" +
				"\n" +
				"(door closes)\n" +
				"\n" +
				"(exhales)\n" +
				"\n" +
				"She’s all yours.\n" +
				"\n" +
				"(thunder rumbling)\n" +
				"\n" +
				"♪ ♪\n" +
				"\n" +
				"(thunder crashing)\n" +
				"\n" +
				"(thunder rumbling)\n" +
				"\n" +
				"(thunder crashing)\n" +
				"\n" +
				"(static crackling softly)\n" +
				"\n" +
				"(birds chirping over headphones)\n" +
				"\n" +
				"(thunder rumbling)\n" +
				"\n" +
				"(panting)\n" +
				"\n" +
				"MIKE: Garrett!\n" +
				"\n" +
				"(footstep crunches softly)\n" +
				"\n" +
				"Wait, please.\n" +
				"\n" +
				"Please don’t-don’t… don’t run.\n" +
				"\n" +
				"Okay? I-I just want to know what you saw.\n" +
				"\n" +
				"Please. I’m begging you.\n" +
				"\n" +
				"Help me.\n" +
				"\n" +
				"Who took Garrett?!\n" +
				"\n" +
				"♪ ♪\n" +
				"\n" +
				"(panting)\n" +
				"\n" +
				"(panting)\n" +
				"\n" +
				"(screams)\n" +
				"\n" +
				"(distorted warbling, crackling)\n" +
				"\n" +
				"(warbling, crackling continues)\n" +
				"\n" +
				"(“Talking in Your Sleep” by The Romantics playing loudly)\n" +
				"\n" +
				"(over speaker): ♪ The secrets that you just can’t hide… ♪\n" +
				"\n" +
				"(grunting)\n" +
				"\n" +
				"♪ You tell me that you want me… ♪\n" +
				"\n" +
				"(music stops)\n" +
				"\n" +
				"(machines powering up)\n" +
				"\n" +
				"(buzzer sounding)\n" +
				"\n" +
				"(thunder rumbling)\n" +
				"\n" +
				"(buzzer continues)\n" +
				"\n" +
				"♪ ♪\n" +
				"\n" +
				"(thunder rumbling)\n" +
				"\n" +
				"About time.\n" +
				"\n" +
				"Starting to think maybe you fell asleep on the job.\n" +
				"\n" +
				"Um…\n" +
				"\n" +
				"Can I, uh, help you, Officer?\n" +
				"\n" +
				"Please, my name’s Vanessa.\n" +
				"\n" +
				"And you must be?\n" +
				"\n" +
				"Um…\n" +
				"\n" +
				"The new security guard.\n" +
				"\n" +
				"Yeah.\n" +
				"\n" +
				"You’re bleeding, by the way.\n" +
				"\n" +
				"Looks nasty.\n" +
				"\n" +
				"Come on. I know where they keep the first aid kit.\n" +
				"\n" +
				"(thunder rumbling)\n" +
				"\n" +
				"(chuckles): Love what you’ve done with the place.\n" +
				"\n" +
				"Why Nebraska?\n" +
				"\n" +
				"Oh, you need a hand?\n" +
				"\n" +
				"I’m fine.\n" +
				"\n" +
				"You sure?\n" +
				"\n" +
				"Here.\n" +
				"\n" +
				"I’m a certified EMT.\n" +
				"\n" +
				"So if your heart ever goes out, I’m the one you want to call.\n" +
				"\n" +
				"You seem to really know your way around the place.\n" +
				"\n" +
				"Well, Freddy’s is on my beat.\n" +
				"\n" +
				"I like to stay well-informed.\n" +
				"\n" +
				"Also, I really loved this place as a kid.\n" +
				"\n" +
				"There.\n" +
				"\n" +
				"That should do it. (sighs)\n" +
				"\n" +
				"Vanessa Shelly.\n" +
				"\n" +
				"Mike.\n" +
				"\n" +
				"Pleasure to meet you, Mike.\n" +
				"\n" +
				"(drawer closes)\n" +
				"\n" +
				"You doing all right this evening, Mike?\n" +
				"\n" +
				"What?\n" +
				"\n" +
				"Are you good? Are you okay?\n" +
				"\n" +
				"Is everything copacetic?\n" +
				"\n" +
				"Yeah, I know what “all right” means.\n" +
				"\n" +
				"Do you also know that your eyes are bloodshot and your heart rate’s through the roof?\n" +
				"\n" +
				"And aside from that gash on your arm, which… (chuckles) let’s be honest, is pretty frickin’ bizarre, you’ve been acting suspicious since the moment you opened the door.\n" +
				"\n" +
				"Yeah, look, it’s been a weird night.\n" +
				"\n" +
				"Sounds like Freddy’s.\n" +
				"\n" +
				"This place, it gets to people.\n" +
				"\n" +
				"It’s one of the reasons why you’re gonna quit.\n" +
				"\n" +
				"I’m sorry?\n" +
				"\n" +
				"Oh, yeah.\n" +
				"\n" +
				"You security hires, you never last.\n" +
				"\n" +
				"Have you met them yet?\n" +
				"\n" +
				"Met who?\n" +
				"\n" +
				"(lights buzzing)\n" +
				"\n" +
				"(games beeping, whirring)\n" +
				"\n" +
				"So, what are the other reasons?\n" +
				"\n" +
				"Huh?\n" +
				"\n" +
				"Why you think I’m gonna quit my job.\n" +
				"\n" +
				"Well, you tell me.\n" +
				"\n" +
				"Is this somewhere you see yourself ten, 20 years from now?\n" +
				"\n" +
				"I mean, what do I know? Maybe the benefits are great.\n" +
				"\n" +
				"(scoffs)\n" +
				"\n" +
				"I didn’t think so.\n" +
				"\n" +
				"Add to that the thing with those kids going missing.\n" +
				"\n" +
				"Wh-What did you just say?\n" +
				"\n" +
				"Prepare to have your mind blown.\n" +
				"\n" +
				"(chimes)\n" +
				"\n" +
				"(whirring)\n" +
				"\n" +
				"(“Talking in Your Sleep” by The Romantics playing)\n" +
				"\n" +
				"♪ ♪\n" +
				"\n" +
				"♪ When you close your eyes ♪\n" +
				"\n" +
				"♪ And you go to sleep ♪\n" +
				"\n" +
				"(echoing): ♪ Sleep, sleep, sleep ♪\n" +
				"\n" +
				"♪ And it’s down to the sound of a heartbeat ♪\n" +
				"\n" +
				"This… this is…\n" +
				"\n" +
				"The best thing you’ve seen in your entire life?\n" +
				"\n" +
				"♪ I can hear the things that you’re dreaming about ♪\n" +
				"\n" +
				"(echoing): ♪ About, about, about ♪\n" +
				"\n" +
				"♪ When you open up your… ♪\n" +
				"\n" +
				"Want to dance?\n" +
				"\n" +
				"(electrical crackling)\n" +
				"\n" +
				"(music distorts, stops)\n" +
				"\n" +
				"(mechanical whirring)\n" +
				"\n" +
				"Maybe some other time.\n" +
				"\n" +
				"Wait, y-you said some kids went missing?\n" +
				"\n" +
				"Sure. Back in the ’80s.\n" +
				"\n" +
				"What happened to them?\n" +
				"\n" +
				"It was big news.\n" +
				"\n" +
				"That’s why the place shut down.\n" +
				"\n" +
				"Wow.\n" +
				"\n" +
				"You really didn’t do your homework, did you?\n" +
				"\n" +
				"And you’re not even wearing your badge.\n" +
				"\n" +
				"Got it.\n" +
				"\n" +
				"There.\n" +
				"\n" +
				"Now you’re official.\n" +
				"\n" +
				"(gate rattling)\n" +
				"\n" +
				"VANESSA: Hey.\n" +
				"\n" +
				"Some friendly advice?\n" +
				"\n" +
				"Don’t let this place get to you.\n" +
				"\n" +
				"Just do your job, and you’ll be fine.\n" +
				"\n" +
				"(indistinct police radio chatter)\n" +
				"\n" +
				"Yeah, sounds good.\n" +
				"\n" +
				"♪ ♪\n" +
				"\n" +
				"(cell phone keys beeping)\n" +
				"\n" +
				"(car engine starts)\n" +
				"\n" +
				"(phone line ringing)\n" +
				"\n" +
				"(phone vibrating)\n" +
				"\n" +
				"(beeps)\n" +
				"\n" +
				"JEFF (over phone): It’s showtime.\n" +
				"\n" +
				"As soon as he gets back, get the guys and meet me here.\n" +
				"\n" +
				"I think I see a way in.\n" +
				"\n" +
				"(soft electronic whirring)\n" +
				"\n" +
				"All right.\n" +
				"\n" +
				"Now, be quick but thorough.\n" +
				"\n" +
				"Maximum damage, minimum time.\n" +
				"\n" +
				"You see anything valuable, grab it, and we’ll, uh, settle up after.\n" +
				"\n" +
				"Good?\n" +
				"\n" +
				"Yeah. Golden.\n" +
				"\n" +
				"Whoo!\n" +
				"\n" +
				"Yeah! (laughs)\n" +
				"\n" +
				"Let’s go, boys!\n" +
				"\n" +
				"Come on!\n" +
				"\n" +
				"♪ ♪\n" +
				"\n" +
				"(clattering in distance)\n" +
				"\n" +
				"(heavy scraping)\n" +
				"\n" +
				"(doors rattle)\n" +
				"\n" +
				"(clattering continues in distance)\n" +
				"\n" +
				"♪ ♪\n" +
				"\n" +
				"(loud rattling)\n" +
				"\n" +
				"(scoffs)\n" +
				"\n" +
				"(pans rattling)\n" +
				"\n" +
				"(exhales sharply)\n" +
				"\n" +
				"(quiet mechanical click)\n" +
				"\n" +
				"(Carl gasps)\n" +
				"\n" +
				"(electronic whirring)\n" +
				"\n" +
				"(flashlight clatters)\n" +
				"\n" +
				"(electronic rattling)\n" +
				"\n" +
				"(screaming in distance)\n" +
				"\n" +
				"(electronic chittering)\n" +
				"\n" +
				"(screaming continues)\n" +
				"\n" +
				"(muffled grunting)\n" +
				"\n" +
				"HANK: Carl?\n" +
				"\n" +
				"(gasps)\n" +
				"\n" +
				"(bag thuds)\n" +
				"\n" +
				"(screaming in distance)\n" +
				"\n" +
				"(screaming continues)\n" +
				"\n" +
				"JEFF: Hank?\n" +
				"\n" +
				"What the hell are you doing?\n" +
				"\n" +
				"♪ ♪\n" +
				"\n" +
				"(breathing heavily)\n" +
				"\n" +
				"JEFF: Hank?\n" +
				"\n" +
				"Hank!\n" +
				"\n" +
				"Jeff?\n" +
				"\n" +
				"(door rattling)\n" +
				"\n" +
				"Jeff!\n" +
				"\n" +
				"(straining)\n" +
				"\n" +
				"Come on, you stupid…\n" +
				"\n" +
				"(whispers): Hank?\n" +
				"\n" +
				"Come on. Come on.\n" +
				"\n" +
				"(electronic whirring)\n" +
				"\n" +
				"(screaming)\n" +
				"\n" +
				"(heavy thudding)\n" +
				"\n" +
				"(screaming and heavy thudding continue)\n" +
				"\n" +
				"(bones cracking)\n" +
				"\n" +
				"(glass squeaking)\n" +
				"\n" +
				"(body thudding)\n" +
				"\n" +
				"Hank?\n" +
				"\n" +
				"(heavy mechanical footsteps)\n" +
				"\n" +
				"(low growling)\n" +
				"\n" +
				"(crowbar clatters)\n" +
				"\n" +
				"♪ ♪\n" +
				"\n" +
				"(coins clattering)\n" +
				"\n" +
				"(kids screaming and laughing loudly over phone)\n" +
				"\n" +
				"(groans)\n" +
				"\n" +
				"♪ ♪\n" +
				"\n" +
				"Shit.\n" +
				"\n" +
				"(rattling in vent)\n" +
				"\n" +
				"(whirring)\n" +
				"\n" +
				"(grunting): No! No! No!\n" +
				"\n" +
				"(grunting)\n" +
				"\n" +
				"(grunts)\n" +
				"\n" +
				"(whirring stops)\n" +
				"\n" +
				"(door creaking)\n" +
				"\n" +
				"(male voice scatting nearby)\n" +
				"\n" +
				"(scatting)\n" +
				"\n" +
				"(scatting stops)\n" +
				"\n" +
				"(electrical crackling)\n" +
				"\n" +
				"(jaws chomping rapidly)\n" +
				"\n" +
				"(screams)\n" +
				"\n" +
				"Jeff?\n" +
				"\n" +
				"Carl?\n" +
				"\n" +
				"(fan creaking)\n" +
				"\n" +
				"(door creaks)\n" +
				"\n" +
				"(boy giggles)\n" +
				"\n" +
				"Hey.\n" +
				"\n" +
				"BOY: Follow me.\n" +
				"\n" +
				"Hey!\n" +
				"\n" +
				"Hey, wait!\n" +
				"\n" +
				"BOY: Come on.\n" +
				"\n" +
				"MAX: Hello?\n" +
				"\n" +
				"BOY: This way.\n" +
				"\n" +
				"(door closes)\n" +
				"\n" +
				"♪ ♪\n" +
				"\n" +
				"(breath trembling)\n" +
				"\n" +
				"(door closes)\n" +
				"\n" +
				"BOY: Warmer.\n" +
				"\n" +
				"(gasps)\n" +
				"\n" +
				"(soft mechanical creaking)\n" +
				"\n" +
				"How in the heck?\n" +
				"\n" +
				"BOY: Warmer.\n" +
				"\n" +
				"(screams)\n" +
				"\n" +
				"(jaws chomp)\n" +
				"\n" +
				"NARRATOR (on TV): It’s feeding time for the giraffe.\n" +
				"\n" +
				"(whimsical music playing on TV)\n" +
				"\n" +
				"(TV continues playing quietly)\n" +
				"\n" +
				"Hey, Abs, what you working on?\n" +
				"\n" +
				"All right.\n" +
				"\n" +
				"I guess you don’t want this, then.\n" +
				"\n" +
				"It’s cool, huh?\n" +
				"\n" +
				"(softly): Okay.\n" +
				"\n" +
				"I’m trying my best, Abby, okay?\n" +
				"\n" +
				"(objects clatter)\n" +
				"\n" +
				"(on TV): Can’t you read?\n" +
				"\n" +
				"You okay?\n" +
				"\n" +
				"I made a mess.\n" +
				"\n" +
				"I’m sorry.\n" +
				"\n" +
				"They’re just… they’re just papers, all right?\n" +
				"\n" +
				"They don’t… they don’t mean anything.\n" +
				"\n" +
				"Then why do you have them?\n" +
				"\n" +
				"Well, that’s complicated. Aunt Jane…\n" +
				"\n" +
				"I hate her.\n" +
				"\n" +
				"She’s mean and she smells like cigarettes.\n" +
				"\n" +
				"(chuckles)\n" +
				"\n" +
				"It’s not funny.\n" +
				"\n" +
				"You’re right, it’s not. It’s just, uh…\n" +
				"\n" +
				"I don’t know, it’s nice that we can finally agree about something.\n" +
				"\n" +
				"(softly): Are you gonna give me away?\n" +
				"\n" +
				"Abs, no, I…\n" +
				"\n" +
				"(knocking at door)\n" +
				"\n" +
				"Hey. Vanessa.\n" +
				"\n" +
				"Hey, Mike.\n" +
				"\n" +
				"And hello.\n" +
				"\n" +
				"Vanessa, this is Abby. Abby, Vanessa.\n" +
				"\n" +
				"Hi, Abby.\n" +
				"\n" +
				"Mike didn’t tell me he had a daughter.\n" +
				"\n" +
				"Gross.\n" +
				"\n" +
				"No, uh, Abby’s my sister.\n" +
				"\n" +
				"Ah. Well, he didn’t tell me he had a sister either.\n" +
				"\n" +
				"Are you here to arrest Mike?\n" +
				"\n" +
				"MIKE: Okay, uh, can you go play in your room so me and Vanessa can talk?\n" +
				"\n" +
				"It’s nice to meet you.\n" +
				"\n" +
				"What, um… what are you doing here?\n" +
				"\n" +
				"Somebody broke into Freddy’s.\n" +
				"\n" +
				"What?\n" +
				"\n" +
				"Wh-What-what happened?\n" +
				"\n" +
				"Recognize these?\n" +
				"\n" +
				"Look, it’s not what you think, okay?\n" +
				"\n" +
				"Th-Those are… They’re sleeping pills.\n" +
				"\n" +
				"They help me sleep.\n" +
				"\n" +
				"I know what they are, Mike.\n" +
				"\n" +
				"It’s written on the bottle.\n" +
				"\n" +
				"News flash: If you’re too whacked out to remember to lock a friggin’ door, accident or not, you’re liable.\n" +
				"\n" +
				"It’s called criminal negligence.\n" +
				"\n" +
				"(scoffs) You wouldn’t understand.\n" +
				"\n" +
				"Well, then help me.\n" +
				"\n" +
				"‘Cause the moment I file that report, it’s out of my hands.\n" +
				"\n" +
				"You want to take a walk?\n" +
				"\n" +
				"So I used to have a brother.\n" +
				"\n" +
				"His name was Garrett.\n" +
				"\n" +
				"(sighs) And when I was… about 12, he was, uh, he was taken.\n" +
				"\n" +
				"And I was there when it happened.\n" +
				"\n" +
				"They never found the guy who did it, and they never found my brother.\n" +
				"\n" +
				"So there’s this theory that, uh, we can’t forget things.\n" +
				"\n" +
				"Basically, it says that every single thing that you see in your entire life, down to the tiniest of details, gets stored inside of you.\n" +
				"\n" +
				"You just have to know how to look.\n" +
				"\n" +
				"Your brother…\n" +
				"\n" +
				"You think you saw who took him?\n" +
				"\n" +
				"I know I did.\n" +
				"\n" +
				"And I know that he’s in here, but he’s just… he’s…\n" +
				"\n" +
				"It’s buried.\n" +
				"\n" +
				"So every night, I dream, and I go back to that same memory, and I-I search for details.\n" +
				"\n" +
				"For any little thing that got overlooked.\n" +
				"\n" +
				"Yeah.\n" +
				"\n" +
				"And that’s usually the part where people tell me I’m crazy.\n" +
				"\n" +
				"I know what crazy looks like, Mike.\n" +
				"\n" +
				"This isn’t it.\n" +
				"\n" +
				"Not even close.\n" +
				"\n" +
				"And these?\n" +
				"\n" +
				"I mean, going back to the same dream, the same place night after night, it’s not easy, so the-the pills help.\n" +
				"\n" +
				"Some other things, like familiar sights, familiar sounds.\n" +
				"\n" +
				"“Pining for fun?”\n" +
				"\n" +
				"(chuckles)\n" +
				"\n" +
				"“Visit Nebraska.”\n" +
				"\n" +
				"(laughs)\n" +
				"\n" +
				"Your sister seems cool.\n" +
				"\n" +
				"So it’s just the two of you?\n" +
				"\n" +
				"Yeah.\n" +
				"\n" +
				"Yeah, it’s just us.\n" +
				"\n" +
				"Our mom died a little while back.\n" +
				"\n" +
				"And Dad, he couldn’t handle it, so…\n" +
				"\n" +
				"You know what’s crazy is, uh, when… when Garrett and I were kids, they were like those perfect parents you’d see on old TV shows.\n" +
				"\n" +
				"Yeah, ev-every night, we would sit down together, we’d have family dinner, and we’d hold hands and say grace, and…\n" +
				"\n" +
				"That actually sounds really nice.\n" +
				"\n" +
				"Yeah, at the time, I thought it was really cheesy.\n" +
				"\n" +
				"But then it’s gone.\n" +
				"\n" +
				"You and Abby, you still have each other.\n" +
				"\n" +
				"From where I sit, I’d say you’re lucky.\n" +
				"\n" +
				"(indistinct police radio chatter)\n" +
				"\n" +
				"(sighs) I should go.\n" +
				"\n" +
				"No more sleeping on the job.\n" +
				"\n" +
				"When you’re at Freddy’s, you stay alert.\n" +
				"\n" +
				"MAX (recorded): Hey, it’s Max.\n" +
				"\n" +
				"(chuckles) Leave a message. Or don’t.\n" +
				"\n" +
				"(touch tones sounding)\n" +
				"\n" +
				"(line ringing)\n" +
				"\n" +
				"Come on, Max. Come on.\n" +
				"\n" +
				"MAX (recorded): Hey, it’s Max. Leave a mes…\n" +
				"\n" +
				"(sighs)\n" +
				"\n" +
				"MIKE: I will work, and you will sleep, and under no circumstances are you gonna come out of my office.\n" +
				"\n" +
				"Do you understand?\n" +
				"\n" +
				"I understand.\n" +
				"\n" +
				"This is not a vacation, okay? You’re not here to have fun.\n" +
				"\n" +
				"Okay.\n" +
				"\n" +
				"Whoa, slow down, slow down, slow down.\n" +
				"\n" +
				"No, no, no.\n" +
				"\n" +
				"Abby?\n" +
				"\n" +
				"(soft creaking)\n" +
				"\n" +
				"Whoa.\n" +
				"\n" +
				"What happened?\n" +
				"\n" +
				"Give me your hand.\n" +
				"\n" +
				"Watch out.\n" +
				"\n" +
				"(glass crunching)\n" +
				"\n" +
				"Do you want me to turn the light off?\n" +
				"\n" +
				"(softly): Okay.\n" +
				"\n" +
				"Good night.\n" +
				"\n" +
				"It’s like camping.\n" +
				"\n" +
				"(sighs heavily)\n" +
				"\n" +
				"(gasps)\n" +
				"\n" +
				"♪ ♪\n" +
				"\n" +
				"♪ ♪\n" +
				"\n" +
				"(exhales sharply)\n" +
				"\n" +
				"(birds chirping over headphones)\n" +
				"\n" +
				"(clock ticking)\n" +
				"\n" +
				"(static crackling, warbling)\n" +
				"\n" +
				"(chirping continues over headphones)\n" +
				"\n" +
				"♪ ♪\n" +
				"\n" +
				"(door creaks)\n" +
				"\n" +
				"BOY (whispers): Abby?\n" +
				"\n" +
				"(whispers): I’ll be right back.\n" +
				"\n" +
				"(toilet flushing)\n" +
				"\n" +
				"(door creaking)\n" +
				"\n" +
				"(metallic clattering)\n" +
				"\n" +
				"Hello?\n" +
				"\n" +
				"I know you’re back there.\n" +
				"\n" +
				"Might as well come out.\n" +
				"\n" +
				"(low growling)\n" +
				"\n" +
				"(heavy mechanical footsteps)\n" +
				"\n" +
				"♪ ♪\n" +
				"\n" +
				"(car driving off in distance)\n" +
				"\n" +
				"You’re those kids, right?\n" +
				"\n" +
				"The ones who disappeared?\n" +
				"\n" +
				"Look.\n" +
				"\n" +
				"I don’t know how it’s possible that you’re here like this in my dream, but…\n" +
				"\n" +
				"I need your help.\n" +
				"\n" +
				"Please.\n" +
				"\n" +
				"Help me remember the man who took my brother.\n" +
				"\n" +
				"If we show you, what will you give us?\n" +
				"\n" +
				"Anything.\n" +
				"\n" +
				"I’ll give you anything you want.\n" +
				"\n" +
				"(girl screams in distance)\n" +
				"\n" +
				"(girl screams)\n" +
				"\n" +
				"(sniffs)\n" +
				"\n" +
				"Abby?\n" +
				"\n" +
				"(Abby screaming)\n" +
				"\n" +
				"ABBY: Stop! Stop! Stop! (screaming)\n" +
				"\n" +
				"Abby?\n" +
				"\n" +
				"(mechanical clicking)\n" +
				"\n" +
				"(heavy footsteps approaching)\n" +
				"\n" +
				"(low growling)\n" +
				"\n" +
				"ABBY: Mike.\n" +
				"\n" +
				"(laughing)\n" +
				"\n" +
				"They wouldn’t stop tickling me.\n" +
				"\n" +
				"I thought I was gonna die.\n" +
				"\n" +
				"Freddy, this is my brother, Mike.\n" +
				"\n" +
				"(mechanical whirring and clicking)\n" +
				"\n" +
				"Abby, what is this?\n" +
				"\n" +
				"ABBY: Come on.\n" +
				"\n" +
				"I want you to meet the others.\n" +
				"\n" +
				"(electronic warbling)\n" +
				"\n" +
				"Mike, this is Bonnie, Foxy and Chica.\n" +
				"\n" +
				"Everyone,\n" +
				"\n" +
				"this is Mike.\n" +
				"\n" +
				"(mechanical whirring and clicking)\n" +
				"\n" +
				"This-this is a joke, right?\n" +
				"\n" +
				"I mean, th-there’s someone here.\n" +
				"\n" +
				"There’s probably somebody controlling them, right?\n" +
				"\n" +
				"I mean…\n" +
				"\n" +
				"Okay, good joke!\n" +
				"\n" +
				"Congratulations! You got me!\n" +
				"\n" +
				"You can come out now!\n" +
				"\n" +
				"Hello?\n" +
				"\n" +
				"It’s okay, Mike.\n" +
				"\n" +
				"They just want to play.\n" +
				"\n" +
				"(laughs softly)\n" +
				"\n" +
				"We have to go home now. Come on.\n" +
				"\n" +
				"Hold on.\n" +
				"\n" +
				"They really like pictures.\n" +
				"\n" +
				"(drawing on paper)\n" +
				"\n" +
				"(mechanical whirring)\n" +
				"\n" +
				"I had a lot of fun tonight.\n" +
				"\n" +
				"Thank you for playing with me.\n" +
				"\n" +
				"Okay, okay, Abby, come on.\n" +
				"\n" +
				"Okay.\n" +
				"\n" +
				"Bye!\n" +
				"\n" +
				"♪ ♪\n" +
				"\n" +
				"(engine shuts off)\n" +
				"\n" +
				"(quietly): There you go.\n" +
				"\n" +
				"(sighs)\n" +
				"\n" +
				"♪ ♪\n" +
				"\n" +
				"(metal scrapes)\n" +
				"\n" +
				"It’s them.\n" +
				"\n" +
				"Hey, Abby, um, we need to talk about last night, okay?\n" +
				"\n" +
				"Um…\n" +
				"\n" +
				"So those, uh, those… machines…\n" +
				"\n" +
				"My friends?\n" +
				"\n" +
				"Your friends?\n" +
				"\n" +
				"Um…\n" +
				"\n" +
				"are they…?\n" +
				"\n" +
				"Ghosts?\n" +
				"\n" +
				"Yeah.\n" +
				"\n" +
				"Of course.\n" +
				"\n" +
				"How else could they make the robots move?\n" +
				"\n" +
				"Right.\n" +
				"\n" +
				"Can I have some more soup?\n" +
				"\n" +
				"Yeah, sure.\n" +
				"\n" +
				"Hey, Abs.\n" +
				"\n" +
				"You know we used to have a brother, right?\n" +
				"\n" +
				"Garrett.\n" +
				"\n" +
				"I don’t… I don’t really talk about him very much.\n" +
				"\n" +
				"Neither did Mom or Dad.\n" +
				"\n" +
				"Yeah, it was hard for them.\n" +
				"\n" +
				"It’s hard for me, too.\n" +
				"\n" +
				"C-Can you explain this to me?\n" +
				"\n" +
				"You-you drew that, right?\n" +
				"\n" +
				"Okay, and… and-and you know what that is?\n" +
				"\n" +
				"Hey, hey, it’s okay.\n" +
				"\n" +
				"Okay, I’m not, I’m not mad.\n" +
				"\n" +
				"I won’t get angry at you.\n" +
				"\n" +
				"But I really need you to help me understand, please.\n" +
				"\n" +
				"That’s when Garrett got taken.\n" +
				"\n" +
				"Abby, who told you about that?\n" +
				"\n" +
				"W-Was it a-a boy with blonde hair?\n" +
				"\n" +
				"Did that boy ever tell you anything about the man driving that car?\n" +
				"\n" +
				"Anything at all?\n" +
				"\n" +
				"Okay, just think, think really hard, okay?\n" +
				"\n" +
				"No.\n" +
				"\n" +
				"All they talk about is a yellow rabbit.\n" +
				"\n" +
				"Okay.\n" +
				"\n" +
				"But…\n" +
				"\n" +
				"I can ask.\n" +
				"\n" +
				"I would really appreciate that.\n" +
				"\n" +
				"♪ ♪\n" +
				"\n" +
				"(kids’ laughter echoing)\n" +
				"\n" +
				"KIDS: ♪ We love the yellow rabbit ♪\n" +
				"\n" +
				"♪ We love the yellow rabbit ♪\n" +
				"\n" +
				"(girl screaming)\n" +
				"\n" +
				"(kids’ screams echoing)\n" +
				"\n" +
				"(car doors closing)\n" +
				"\n" +
				"ABBY: Vanessa’s here.\n" +
				"\n" +
				"Yeah.\n" +
				"\n" +
				"My friends talk about her sometimes.\n" +
				"\n" +
				"What do they say?\n" +
				"\n" +
				"That she’s nice.\n" +
				"\n" +
				"Abby, if I asked you to wait in the car, would you?\n" +
				"\n" +
				"No.\n" +
				"\n" +
				"Abby, wait.\n" +
				"\n" +
				"ABBY: Guys, I’m back.\n" +
				"\n" +
				"Abby.\n" +
				"\n" +
				"Hey, Vanessa.\n" +
				"\n" +
				"MIKE: Abby.\n" +
				"\n" +
				"(Abby giggling)\n" +
				"\n" +
				"Mike.\n" +
				"\n" +
				"Vanessa.\n" +
				"\n" +
				"(chuckles) I missed you guys.\n" +
				"\n" +
				"MIKE: You knew about this.\n" +
				"\n" +
				"Guess you figured it out.\n" +
				"\n" +
				"Ghost children possessing giant robots?\n" +
				"\n" +
				"Thanks for the heads-up.\n" +
				"\n" +
				"Guys, we need help.\n" +
				"\n" +
				"It needs to be big so we can all fit inside.\n" +
				"\n" +
				"Abby, look.\n" +
				"\n" +
				"Now, this is all really fun and exciting, but these things are big, and they could be dangerous, so I think we need to lay some ground rules, all right?\n" +
				"\n" +
				"Vanessa, what do you think?\n" +
				"\n" +
				"I think we could use the tables for the fort.\n" +
				"\n" +
				"ABBY: Everyone, follow me.\n" +
				"\n" +
				"(giggles): Come on.\n" +
				"\n" +
				"(“Connection” by Elastica playing)\n" +
				"\n" +
				"♪ Riding on any wave ♪\n" +
				"\n" +
				"♪ That is the luck you crave ♪\n" +
				"\n" +
				"♪ They don’t believe it now ♪\n" +
				"\n" +
				"♪ They just think it’s stupid ♪\n" +
				"\n" +
				"♪ So got anything? ♪\n" +
				"\n" +
				"♪ Anyone could have done ♪\n" +
				"\n" +
				"♪ Who would’ve cared at all… ♪\n" +
				"\n" +
				"It needs to be higher.\n" +
				"\n" +
				"♪ I don’t understand ♪\n" +
				"\n" +
				"♪ How a heart is a spade ♪\n" +
				"\n" +
				"♪ But somehow the vital ♪\n" +
				"\n" +
				"You did it!\n" +
				"\n" +
				"♪ Connection is made… ♪\n" +
				"\n" +
				"(song stops)\n" +
				"\n" +
				"(heavy thump)\n" +
				"\n" +
				"Are you okay?\n" +
				"\n" +
				"(song resumes)\n" +
				"\n" +
				"VANESSA: I like it in here.\n" +
				"\n" +
				"ABBY: Me, too.\n" +
				"\n" +
				"But I think it’s gonna rain soon.\n" +
				"\n" +
				"Sounds like we need a roof.\n" +
				"\n" +
				"I’ll go see what I can find.\n" +
				"\n" +
				"I’ll, uh… I’ll-I’ll come with you.\n" +
				"\n" +
				"(whispering): Abby, don’t forget to ask.\n" +
				"\n" +
				"Okay.\n" +
				"\n" +
				"Yeah.\n" +
				"\n" +
				"(song ends)\n" +
				"\n" +
				"What are you looking for exactly?\n" +
				"\n" +
				"Tablecloths.\n" +
				"\n" +
				"They used to keep ’em back here for big events.\n" +
				"\n" +
				"Right. And remind me how you know that.\n" +
				"\n" +
				"Found ’em.\n" +
				"\n" +
				"(soft mechanical rattling)\n" +
				"\n" +
				"VANESSA: Don’t.\n" +
				"\n" +
				"I wouldn’t do that.\n" +
				"\n" +
				"They’re spring locks.\n" +
				"\n" +
				"They’re on all the older models.\n" +
				"\n" +
				"They were designed to keep the animatronic parts in place so that, uh, a person could safely wear the suit.\n" +
				"\n" +
				"They tend to be pretty unstable.\n" +
				"\n" +
				"Let’s see.\n" +
				"\n" +
				"Ooh.\n" +
				"\n" +
				"Like I said, unstable.\n" +
				"\n" +
				"Is there anything else that you want to tell me about, Vanessa?\n" +
				"\n" +
				"‘Cause you seem to know everything about this place.\n" +
				"\n" +
				"And what if Abby’d come in here?\n" +
				"\n" +
				"What if she’d found that thing?\n" +
				"\n" +
				"You’re the one who brought her, Mike, not me.\n" +
				"\n" +
				"What I can’t wrap my head around is why.\n" +
				"\n" +
				"All right, look.\n" +
				"\n" +
				"I think that they know who took my little brother.\n" +
				"\n" +
				"I can’t explain it, but when I’m here, I feel closer to Garrett.\n" +
				"\n" +
				"My dreams are more vivid, and it… it’s like I can almost…\n" +
				"\n" +
				"Change what happened?\n" +
				"\n" +
				"Did you ask them about this?\n" +
				"\n" +
				"Yeah, I tried.\n" +
				"\n" +
				"I don’t think they like me very much.\n" +
				"\n" +
				"But… they do like Abby.\n" +
				"\n" +
				"Mike, you need to drop this.\n" +
				"\n" +
				"I don’t really see how that’s any of your business.\n" +
				"\n" +
				"I’m telling you, you need to let it go.\n" +
				"\n" +
				"Who the hell are you?\n" +
				"\n" +
				"Just someone who’s trying to help.\n" +
				"\n" +
				"(over speakers): ♪ Well, I’m just out of school ♪\n" +
				"\n" +
				"♪ Like I’m real, real cool ♪\n" +
				"\n" +
				"♪ Got to dance like a fool ♪\n" +
				"\n" +
				"♪ Got the message that I got to be a wild one ♪\n" +
				"\n" +
				"♪ Ooh, yeah, I’m a wild one ♪\n" +
				"\n" +
				"Vanessa, wait.\n" +
				"\n" +
				"♪ Gonna break it loose… ♪\n" +
				"\n" +
				"Talk to me.\n" +
				"\n" +
				"I’m trying.\n" +
				"\n" +
				"You’re not listening.\n" +
				"\n" +
				"Please. Finding the guy that did this is the only thing that matters to me.\n" +
				"\n" +
				"(song continues)\n" +
				"\n" +
				"(electronic humming)\n" +
				"\n" +
				"Abby?\n" +
				"\n" +
				"Wait. Abby, don’t!\n" +
				"\n" +
				"(loud, discordant note plays)\n" +
				"\n" +
				"(song stops)\n" +
				"\n" +
				"(ears ringing)\n" +
				"\n" +
				"♪ ♪\n" +
				"\n" +
				"MIKE (muffled): Abby?\n" +
				"\n" +
				"Abby? Abby!\n" +
				"\n" +
				"(coughing)\n" +
				"\n" +
				"(Vanessa sighs)\n" +
				"\n" +
				"(Abby whimpers)\n" +
				"\n" +
				"What happened?\n" +
				"\n" +
				"VANESSA: It’s okay, Abby.\n" +
				"\n" +
				"You just had an accident.\n" +
				"\n" +
				"You’re okay.\n" +
				"\n" +
				"I’m so sorry.\n" +
				"\n" +
				"(mechanical clicking)\n" +
				"\n" +
				"I don’t know what to say.\n" +
				"\n" +
				"Just go home, Mike.\n" +
				"\n" +
				"Take care of your sister.\n" +
				"\n" +
				"What are you so afraid of?\n" +
				"\n" +
				"In the storage room…\n" +
				"\n" +
				"I saw your eyes. You were terrified.\n" +
				"\n" +
				"You can do whatever you want with your own life, but if you ever bring Abby back here again, I will shoot you.\n" +
				"\n" +
				"(engine starts in distance)\n" +
				"\n" +
				"(car door opens)\n" +
				"\n" +
				"ABBY: She looked so angry.\n" +
				"\n" +
				"Why does everyone always look at you that way?\n" +
				"\n" +
				"♪ ♪\n" +
				"\n" +
				"(clears throat)\n" +
				"\n" +
				"(sniffs)\n" +
				"\n" +
				"(line ringing)\n" +
				"\n" +
				"(sighs)\n" +
				"\n" +
				"(line clicks)\n" +
				"\n" +
				"Hey, it’s Mike.\n" +
				"\n" +
				"I need your help.\n" +
				"\n" +
				"(dog barking in distance)\n" +
				"\n" +
				"(sizzling)\n" +
				"\n" +
				"Abby.\n" +
				"\n" +
				"Is that bacon?\n" +
				"\n" +
				"Hey, why don’t you, uh, get dressed and then come to the kitchen, okay?\n" +
				"\n" +
				"I want to talk to you about something.\n" +
				"\n" +
				"Okay.\n" +
				"\n" +
				"Wow, there’s my favorite little girl.\n" +
				"\n" +
				"MIKE: Come have a seat, all right?\n" +
				"\n" +
				"What did you do?\n" +
				"\n" +
				"Abby, look, I think if you just sit down, we can explain it to you, okay?\n" +
				"\n" +
				"No.\n" +
				"\n" +
				"I promise you, this is not what you think it is.\n" +
				"\n" +
				"I hate you.\n" +
				"\n" +
				"I hate you, Mike!\n" +
				"\n" +
				"(door slams)\n" +
				"\n" +
				"Well, I-I think that went well.\n" +
				"\n" +
				"(breathing heavily)\n" +
				"\n" +
				"♪ ♪\n" +
				"\n" +
				"She reminds me of you, you know.\n" +
				"\n" +
				"Always with the temper.\n" +
				"\n" +
				"Well, look, when she calms down, can you, um, tell her that I’m sorry and that I’ll-I’ll be back soon?\n" +
				"\n" +
				"Well, Mike, there’s a larger conversation that needs to happen here.\n" +
				"\n" +
				"So when you do get back, you and me are gonna have a little chat.\n" +
				"\n" +
				"Okay.\n" +
				"\n" +
				"(playing softly): ♪ Celebrate good times, come on ♪\n" +
				"\n" +
				"(papers rustling)\n" +
				"\n" +
				"♪ Let’s celebrate ♪\n" +
				"\n" +
				"♪ Celebrate good times… ♪\n" +
				"\n" +
				"You know what works for me?\n" +
				"\n" +
				"A warm glass of milk with chamomile and honey.\n" +
				"\n" +
				"I tell you…\n" +
				"\n" +
				"What an asshole.\n" +
				"\n" +
				"♪ ♪\n" +
				"\n" +
				"(birds cawing)\n" +
				"\n" +
				"(birds chirping over headphones)\n" +
				"\n" +
				"♪ ♪\n" +
				"\n" +
				"♪ ♪\n" +
				"\n" +
				"(Garrett imitating airplane)\n" +
				"\n" +
				"MOTHER: Okay, enough games, you two.\n" +
				"\n" +
				"(straining): Emergency landing.\n" +
				"\n" +
				"GARRETT: Coming in.\n" +
				"\n" +
				"(Mother chuckles)\n" +
				"\n" +
				"Hey, buddy.\n" +
				"\n" +
				"Well, don’t just stand there. Dig in.\n" +
				"\n" +
				"♪ ♪\n" +
				"\n" +
				"Sweetheart, what’s wrong?\n" +
				"\n" +
				"This… this isn’t…\n" +
				"\n" +
				"this isn’t how it happened.\n" +
				"\n" +
				"This isn’t real.\n" +
				"\n" +
				"BOY: But it could be.\n" +
				"\n" +
				"What is this?\n" +
				"\n" +
				"This isn’t what I asked for.\n" +
				"\n" +
				"But it’s what you want.\n" +
				"\n" +
				"No. I just, I just want to find the man that…\n" +
				"\n" +
				"You’re lying.\n" +
				"\n" +
				"You want to save Garrett.\n" +
				"\n" +
				"That’s why you’re really here.\n" +
				"\n" +
				"To change what happened.\n" +
				"\n" +
				"To go back.\n" +
				"\n" +
				"But I can’t.\n" +
				"\n" +
				"He’s gone. They’re all gone.\n" +
				"\n" +
				"Really?\n" +
				"\n" +
				"You can have this dream every night.\n" +
				"\n" +
				"You can be together with him again.\n" +
				"\n" +
				"Like before.\n" +
				"\n" +
				"How?\n" +
				"\n" +
				"BOY: You said we could have anything we wanted.\n" +
				"\n" +
				"We want Abby.\n" +
				"\n" +
				"Abby?\n" +
				"\n" +
				"They love her, Mike, and she loves them.\n" +
				"\n" +
				"You’ve seen her with them.\n" +
				"\n" +
				"You’ve seen how happy she is.\n" +
				"\n" +
				"It’s time to let her go, sweetheart.\n" +
				"\n" +
				"You were never the right person to take care of her.\n" +
				"\n" +
				"(breathing shakily)\n" +
				"\n" +
				"Okay. (sniffles)\n" +
				"\n" +
				"(voice breaking): Yes.\n" +
				"\n" +
				"You’re home.\n" +
				"\n" +
				"♪ ♪\n" +
				"\n" +
				"No.\n" +
				"\n" +
				"No, this is wrong.\n" +
				"\n" +
				"I don’t, I don’t want this. Listen…\n" +
				"\n" +
				"(heavy mechanical footsteps)\n" +
				"\n" +
				"I made a mistake!\n" +
				"\n" +
				"Please, I don’t want this!\n" +
				"\n" +
				"Do you hear me?!\n" +
				"\n" +
				"(breathing heavily)\n" +
				"\n" +
				"You leave Abby alone!\n" +
				"\n" +
				"(heavy mechanical footsteps continue)\n" +
				"\n" +
				"(gasps)\n" +
				"\n" +
				"KIDS (whispering): Abby.\n" +
				"\n" +
				"Abby.\n" +
				"\n" +
				"(gasps)\n" +
				"\n" +
				"Stay away from my sister!\n" +
				"\n" +
				"(sharp slice)\n" +
				"\n" +
				"(grunts)\n" +
				"\n" +
				"(groans)\n" +
				"\n" +
				"(breathing heavily)\n" +
				"\n" +
				"(whispering): Abby.\n" +
				"\n" +
				"(grunting)\n" +
				"\n" +
				"Abby.\n" +
				"\n" +
				"Abby.\n" +
				"\n" +
				"(breathing heavily)\n" +
				"\n" +
				"Abby.\n" +
				"\n" +
				"(groaning)\n" +
				"\n" +
				"(panting)\n" +
				"\n" +
				"KIDS (whispering): Abby. Abby.\n" +
				"\n" +
				"Abby. Abby. Abby.\n" +
				"\n" +
				"(whispering continues)\n" +
				"\n" +
				"(mechanical whirring)\n" +
				"\n" +
				"BOY (whispers): Abby.\n" +
				"\n" +
				"(mechanical whirring)\n" +
				"\n" +
				"(low growling, rattling)\n" +
				"\n" +
				"(panting)\n" +
				"\n" +
				"(straining)\n" +
				"\n" +
				"(grunting)\n" +
				"\n" +
				"(sparks crackling)\n" +
				"\n" +
				"(whirring stops)\n" +
				"\n" +
				"(panting)\n" +
				"\n" +
				"♪ ♪\n" +
				"\n" +
				"(gasping)\n" +
				"\n" +
				"(pained grunting)\n" +
				"\n" +
				"♪ ♪\n" +
				"\n" +
				"(Foxy scatting nearby)\n" +
				"\n" +
				"(grunting)\n" +
				"\n" +
				"(scatting continues)\n" +
				"\n" +
				"(jaws chomping rapidly)\n" +
				"\n" +
				"No!\n" +
				"\n" +
				"(crickets chirping)\n" +
				"\n" +
				"(dogs barking in distance)\n" +
				"\n" +
				"(knocking)\n" +
				"\n" +
				"JANE: Abby?\n" +
				"\n" +
				"You can’t stay in there forever, you know.\n" +
				"\n" +
				"Suit yourself.\n" +
				"\n" +
				"(sighs)\n" +
				"\n" +
				"(groans)\n" +
				"\n" +
				"ANNOUNCER (on TV): The pottery that grows.\n" +
				"\n" +
				"It’s easy.\n" +
				"\n" +
				"Soak your Chia overnight, spread the seeds…\n" +
				"\n" +
				"(channel changes)\n" +
				"\n" +
				"(audience laughter)\n" +
				"\n" +
				"Oh.\n" +
				"\n" +
				"(woman speaking indistinctly)\n" +
				"\n" +
				"(low mechanical whirring)\n" +
				"\n" +
				"(laughter and chatter continues on TV)\n" +
				"\n" +
				"(thudding in distance)\n" +
				"\n" +
				"Freddy?\n" +
				"\n" +
				"♪ ♪\n" +
				"\n" +
				"Not Freddy.\n" +
				"\n" +
				"They’re all waiting for you.\n" +
				"\n" +
				"It’s time to go play.\n" +
				"\n" +
				"♪ ♪\n" +
				"\n" +
				"Silly Aunt Jane. (chuckles softly)\n" +
				"\n" +
				"She fell asleep.\n" +
				"\n" +
				"How do we get there?\n" +
				"\n" +
				"(“I Wanna Be Down” by Brandy playing in taxi)\n" +
				"\n" +
				"♪ I wanna be down ♪\n" +
				"\n" +
				"♪ With what you’re going through ♪\n" +
				"\n" +
				"♪ I wanna be down… ♪\n" +
				"\n" +
				"Where to, little lady?\n" +
				"\n" +
				"(taxi door opens, closes)\n" +
				"\n" +
				"(taxi rattling)\n" +
				"\n" +
				"What the…?\n" +
				"\n" +
				"Oh, my goodness!\n" +
				"\n" +
				"(giggling)\n" +
				"\n" +
				"Not cool. (sighs)\n" +
				"\n" +
				"Why do I always get the weirdos?\n" +
				"\n" +
				"(groaning, panting)\n" +
				"\n" +
				"Careful.\n" +
				"\n" +
				"I managed to stop the bleeding, but you’re probably gonna need stitches.\n" +
				"\n" +
				"Where are we?\n" +
				"\n" +
				"Police supply outpost.\n" +
				"\n" +
				"I found you, and, uh, you were… you were badly hurt.\n" +
				"\n" +
				"They tried to kill me, Vanessa.\n" +
				"\n" +
				"But I’m guessing you already knew that.\n" +
				"\n" +
				"Max.\n" +
				"\n" +
				"Her brother.\n" +
				"\n" +
				"You knew about them, too, right?\n" +
				"\n" +
				"It’s complicated.\n" +
				"\n" +
				"Yeah.\n" +
				"\n" +
				"(scoffs) Yeah.\n" +
				"\n" +
				"More complicated than possessed robots murdering innocent people?\n" +
				"\n" +
				"They weren’t innocent.\n" +
				"\n" +
				"Yeah, Abby is!\n" +
				"\n" +
				"Mike… -You saw Abby playing with them.\n" +
				"\n" +
				"And you knew what they were capable of, and you didn’t say anything!\n" +
				"\n" +
				"Mike, please just…\n" +
				"\n" +
				"Abby is in danger!\n" +
				"\n" +
				"Tell me what happened.\n" +
				"\n" +
				"In my dream… they asked me for Abby.\n" +
				"\n" +
				"And I said yes.\n" +
				"\n" +
				"It was a mistake, and I-I tried to fix it, but…\n" +
				"\n" +
				"What do they want with my sister?\n" +
				"\n" +
				"They want to make her like them.\n" +
				"\n" +
				"♪ ♪\n" +
				"\n" +
				"Come on, let’s go.\n" +
				"\n" +
				"Where’d you go?\n" +
				"\n" +
				"(lights buzzing softly)\n" +
				"\n" +
				"VANESSA: In the ’80s, when those kids went missing… the police searched Freddy’s from top to bottom.\n" +
				"\n" +
				"Every inch was accounted for.\n" +
				"\n" +
				"But they never found them.\n" +
				"\n" +
				"Hello?\n" +
				"\n" +
				"VANESSA: The man who took them, he was a…\n" +
				"\n" +
				"He was a very bad man.\n" +
				"\n" +
				"A very cruel man.\n" +
				"\n" +
				"Also a very clever man.\n" +
				"\n" +
				"He knew that parents would cry, and the police would come looking.\n" +
				"\n" +
				"And he knew there’s one place they’d never think to check because…\n" +
				"\n" +
				"(lights clanking)\n" +
				"\n" +
				"…why would they?\n" +
				"\n" +
				"I mean, why would anyone?\n" +
				"\n" +
				"It’s not just their ghosts that are inside of those machines.\n" +
				"\n" +
				"It’s their bodies.\n" +
				"\n" +
				"You have to understand, the… the kids, they don’t want to hurt anyone.\n" +
				"\n" +
				"It’s-it’s him.\n" +
				"\n" +
				"He influences them somehow.\n" +
				"\n" +
				"He took everything from them, but they don’t remember.\n" +
				"\n" +
				"Who, Vanessa?\n" +
				"\n" +
				"I tried to warn you.\n" +
				"\n" +
				"I really did try in my own way.\n" +
				"\n" +
				"But it’s too late now.\n" +
				"\n" +
				"He knows that you’re looking for him.\n" +
				"\n" +
				"He’ll be coming.\n" +
				"\n" +
				"You need to tell me who he is.\n" +
				"\n" +
				"VANESSA: His name is William Afton.\n" +
				"\n" +
				"He’s my father.\n" +
				"\n" +
				"♪ ♪\n" +
				"\n" +
				"(Garrett imitating airplane)\n" +
				"\n" +
				"You knew?\n" +
				"\n" +
				"(crying): Mike…\n" +
				"\n" +
				"This whole time.\n" +
				"\n" +
				"My brother, you knew.\n" +
				"\n" +
				"Not about Garrett, no.\n" +
				"\n" +
				"A-At least… not when we met.\n" +
				"\n" +
				"I’m so, so sorry.\n" +
				"\n" +
				"Tell me how to stop them.\n" +
				"\n" +
				"Tell me how to save my sister!\n" +
				"\n" +
				"(electronic whirring)\n" +
				"\n" +
				"(“Talking in Your Sleep” by The Romantics playing loudly)\n" +
				"\n" +
				"VANESSA: Electricity. Electricity is the key.\n" +
				"\n" +
				"We use these for animal control.\n" +
				"\n" +
				"(crackles)\n" +
				"\n" +
				"There’s a Taser on your belt.\n" +
				"\n" +
				"It won’t do permanent damage, but it’ll mess with the animatronic circuitry.\n" +
				"\n" +
				"Hopefully buy you some time.\n" +
				"\n" +
				"Come with me.\n" +
				"\n" +
				"No.\n" +
				"\n" +
				"Vanessa, you owe it to me, and you owe it to them.\n" +
				"\n" +
				"No, I can’t.\n" +
				"\n" +
				"If he’s there, I…\n" +
				"\n" +
				"I won’t be any use to you, believe me.\n" +
				"\n" +
				"He really messed you up, didn’t he?\n" +
				"\n" +
				"(girl screaming faintly)\n" +
				"\n" +
				"Take these.\n" +
				"\n" +
				"(engine revving)\n" +
				"\n" +
				"(tires squealing)\n" +
				"\n" +
				"♪ ♪\n" +
				"\n" +
				"VANESSA: You need to avoid the front entrance.\n" +
				"\n" +
				"(“Talking in Your Sleep” continues playing faintly)\n" +
				"\n" +
				"(mechanical whirring)\n" +
				"\n" +
				"There’s an outlet vent on the east side of the building.\n" +
				"\n" +
				"That’s the best way inside.\n" +
				"\n" +
				"(rats squeaking)\n" +
				"\n" +
				"(panting softly)\n" +
				"\n" +
				"♪ You tell me that you want me ♪\n" +
				"\n" +
				"MIKE (hushed): No.\n" +
				"\n" +
				"♪ You tell me that you need me ♪\n" +
				"\n" +
				"(grunts)\n" +
				"\n" +
				"♪ You tell me that you love me ♪\n" +
				"\n" +
				"♪ And I know that I’m right ♪\n" +
				"\n" +
				"♪ ‘Cause I hear it in the night ♪\n" +
				"\n" +
				"♪ I hear the secrets that you keep… ♪\n" +
				"\n" +
				"(panting)\n" +
				"\n" +
				"♪ I hear the secrets that you keep… ♪\n" +
				"\n" +
				"(song continues faintly)\n" +
				"\n" +
				"♪ ♪\n" +
				"\n" +
				"(mechanical clanking)\n" +
				"\n" +
				"(song continues loudly)\n" +
				"\n" +
				"♪ Don’t you know you’re sleeping… ♪\n" +
				"\n" +
				"(song continues faintly in distance)\n" +
				"\n" +
				"(doors creaking)\n" +
				"\n" +
				"(whispers): Abby.\n" +
				"\n" +
				"Chica, where are we going?\n" +
				"\n" +
				"♪ ♪\n" +
				"\n" +
				"(doors close)\n" +
				"\n" +
				"♪ And I know that I’m right ♪\n" +
				"\n" +
				"♪ ‘Cause I hear it in the night ♪\n" +
				"\n" +
				"♪ I hear the secrets that you keep ♪\n" +
				"\n" +
				"♪ When you’re talking in your sleep ♪\n" +
				"\n" +
				"(electricity crackling)\n" +
				"\n" +
				"(song distorting, fading)\n" +
				"\n" +
				"Chica, I don’t like this.\n" +
				"\n" +
				"(screams) Let go of me!\n" +
				"\n" +
				"Abby?!\n" +
				"\n" +
				"(screaming continues)\n" +
				"\n" +
				"(whimpering): Chica, let me go.\n" +
				"\n" +
				"(screams)\n" +
				"\n" +
				"MIKE: Hey!\n" +
				"\n" +
				"Leave her alone!\n" +
				"\n" +
				"(electricity crackling)\n" +
				"\n" +
				"ABBY: Mike.\n" +
				"\n" +
				"Hey.\n" +
				"\n" +
				"Are you okay? Are you hurt?\n" +
				"\n" +
				"I don’t know what’s wrong with her.\n" +
				"\n" +
				"I don’t know why she was trying to hurt me.\n" +
				"\n" +
				"I know. I know.\n" +
				"\n" +
				"Hey, Abby, listen to me.\n" +
				"\n" +
				"I’ve been an idiot about so many things.\n" +
				"\n" +
				"I’ve been stuck trying to fix the past, but you are the most important thing in the world to me, and I promise you I’m gonna do better.\n" +
				"\n" +
				"I love you, too, Mike.\n" +
				"\n" +
				"But we should probably go now.\n" +
				"\n" +
				"Right, okay. Come on.\n" +
				"\n" +
				"(electronic whirring)\n" +
				"\n" +
				"♪ ♪\n" +
				"\n" +
				"(grunts)\n" +
				"\n" +
				"(grunting)\n" +
				"\n" +
				"Mike!\n" +
				"\n" +
				"(grunting)\n" +
				"\n" +
				"Run! Hide! Abby, go!\n" +
				"\n" +
				"(Mike grunting)\n" +
				"\n" +
				"(Mike screaming in distance)\n" +
				"\n" +
				"(heavy mechanical footsteps)\n" +
				"\n" +
				"(electronic whirring)\n" +
				"\n" +
				"(grunting)\n" +
				"\n" +
				"(electricity crackling)\n" +
				"\n" +
				"(heavy mechanical footsteps)\n" +
				"\n" +
				"(games beeping and chiming)\n" +
				"\n" +
				"(gasps)\n" +
				"\n" +
				"(soft growling)\n" +
				"\n" +
				"(breathing heavily)\n" +
				"\n" +
				"♪ ♪\n" +
				"\n" +
				"(heavy mechanical footsteps)\n" +
				"\n" +
				"(shudders)\n" +
				"\n" +
				"Abby?\n" +
				"\n" +
				"Abby, where are you?\n" +
				"\n" +
				"Abby?\n" +
				"\n" +
				"(low growling)\n" +
				"\n" +
				"(heavy mechanical footsteps)\n" +
				"\n" +
				"♪ ♪\n" +
				"\n" +
				"(low growling)\n" +
				"\n" +
				"(growls)\n" +
				"\n" +
				"(electricity crackling)\n" +
				"\n" +
				"(distorted laugh)\n" +
				"\n" +
				"(yells)\n" +
				"\n" +
				"(grunts)\n" +
				"\n" +
				"(heavy mechanical footsteps)\n" +
				"\n" +
				"(electronic whirring)\n" +
				"\n" +
				"(electricity crackling)\n" +
				"\n" +
				"(Abby screams)\n" +
				"\n" +
				"(yelps)\n" +
				"\n" +
				"Vanessa.\n" +
				"\n" +
				"It’s okay.\n" +
				"\n" +
				"Foxy.\n" +
				"\n" +
				"I need to get you somewhere safe so I can go help your brother, okay?\n" +
				"\n" +
				"(distorted): You couldn’t just leave it alone, could you?\n" +
				"\n" +
				"(chuckles): Lucky me.\n" +
				"\n" +
				"This is perfect.\n" +
				"\n" +
				"First I killed your brother.\n" +
				"\n" +
				"Now I kill you.\n" +
				"\n" +
				"Symmetry, my friend.\n" +
				"\n" +
				"Go to hell.\n" +
				"\n" +
				"(laughing)\n" +
				"\n" +
				"(grunts)\n" +
				"\n" +
				"YELLOW RABBIT: Wake up, children.\n" +
				"\n" +
				"I have something for you to play with.\n" +
				"\n" +
				"This is gonna be so much fun.\n" +
				"\n" +
				"Little ones tell me you have a sister.\n" +
				"\n" +
				"She will love it here.\n" +
				"\n" +
				"You, however, are finished.\n" +
				"\n" +
				"Farewell, Michael Schmidt.\n" +
				"\n" +
				"VANESSA: That’s enough!\n" +
				"\n" +
				"Drop the knife.\n" +
				"\n" +
				"(Yellow Rabbit laughs)\n" +
				"\n" +
				"A little old for temper tantrums, aren’t we, Vanessa?\n" +
				"\n" +
				"I’m not kidding, Dad.\n" +
				"\n" +
				"You may have forgotten your loyalties, but I assure you, they have not.\n" +
				"\n" +
				"ABBY: Mike!\n" +
				"\n" +
				"Please wake up.\n" +
				"\n" +
				"WILLIAM: Now, put that thing away and help me clean up the mess that you created!\n" +
				"\n" +
				"ABBY: Please.\n" +
				"\n" +
				"Please, Mike. Please. No!\n" +
				"\n" +
				"Come on.\n" +
				"\n" +
				"(chuckles)\n" +
				"\n" +
				"We both know you’re not gonna use a…\n" +
				"\n" +
				"(screams)\n" +
				"\n" +
				"(growling)\n" +
				"\n" +
				"(panting)\n" +
				"\n" +
				"(grunts softly)\n" +
				"\n" +
				"Mike. Mike.\n" +
				"\n" +
				"Abby. Abby.\n" +
				"\n" +
				"VANESSA: The Yellow Rabbit, he controls them.\n" +
				"\n" +
				"The drawings.\n" +
				"\n" +
				"The Yellow Rabbit hurt your friends.\n" +
				"\n" +
				"Show them what really happened.\n" +
				"\n" +
				"(William yells)\n" +
				"\n" +
				"(Vanessa screams)\n" +
				"\n" +
				"(gun clatters)\n" +
				"\n" +
				"You had one job.\n" +
				"\n" +
				"One.\n" +
				"\n" +
				"Keep him in the dark and kill him if he got too close.\n" +
				"\n" +
				"That’s two jobs.\n" +
				"\n" +
				"(choking)\n" +
				"\n" +
				"(grunts)\n" +
				"\n" +
				"(gasping)\n" +
				"\n" +
				"(exclaims)\n" +
				"\n" +
				"No!\n" +
				"\n" +
				"Let go!\n" +
				"\n" +
				"I won’t let you hurt her, too.\n" +
				"\n" +
				"(blade stabs)\n" +
				"\n" +
				"Dad.\n" +
				"\n" +
				"(panting)\n" +
				"\n" +
				"WILLIAM: Hey.\n" +
				"\n" +
				"Hey.\n" +
				"\n" +
				"(lights clank)\n" +
				"\n" +
				"(rumbling)\n" +
				"\n" +
				"(rattling)\n" +
				"\n" +
				"(lights crackling)\n" +
				"\n" +
				"What have you done?\n" +
				"\n" +
				"(panting)\n" +
				"\n" +
				"(Mike grunts)\n" +
				"\n" +
				"♪ ♪\n" +
				"\n" +
				"(kids screaming faintly)\n" +
				"\n" +
				"(screaming continues)\n" +
				"\n" +
				"(growling)\n" +
				"\n" +
				"They can see you now.\n" +
				"\n" +
				"They know what you did.\n" +
				"\n" +
				"WILLIAM: Move.\n" +
				"\n" +
				"Move!\n" +
				"\n" +
				"(lights clanking)\n" +
				"\n" +
				"(grunting)\n" +
				"\n" +
				"Mike!\n" +
				"\n" +
				"Look at you.\n" +
				"\n" +
				"Look at the nasty things that you have become.\n" +
				"\n" +
				"Look how small you are, how worthless you are.\n" +
				"\n" +
				"You are wretched, rotten little beasts.\n" +
				"\n" +
				"I made you!\n" +
				"\n" +
				"(grunting)\n" +
				"\n" +
				"(pained whimpering)\n" +
				"\n" +
				"(pained grunting)\n" +
				"\n" +
				"(sharp mechanical clanking)\n" +
				"\n" +
				"(pained panting)\n" +
				"\n" +
				"(sharp mechanical clanking)\n" +
				"\n" +
				"(sharp mechanical clanking)\n" +
				"\n" +
				"(bones crunching)\n" +
				"\n" +
				"(pained panting)\n" +
				"\n" +
				"I always come back.\n" +
				"\n" +
				"(grunting)\n" +
				"\n" +
				"(electronic whirring)\n" +
				"\n" +
				"ABBY: What is happening?\n" +
				"\n" +
				"MIKE: The spring locks.\n" +
				"\n" +
				"(William grunting in pain)\n" +
				"\n" +
				"MIKE: Okay. (grunts)\n" +
				"\n" +
				"(straining): Come on. Come on.\n" +
				"\n" +
				"Come on.\n" +
				"\n" +
				"(growling)\n" +
				"\n" +
				"(electronic roaring)\n" +
				"\n" +
				"(pained groaning)\n" +
				"\n" +
				"♪ ♪\n" +
				"\n" +
				"(playful chatter)\n" +
				"\n" +
				"Okay, one more.\n" +
				"\n" +
				"Oh, wait, one more?\n" +
				"\n" +
				"Put one more? One more block?\n" +
				"\n" +
				"Yeah.\n" +
				"\n" +
				"One more block? -Yeah. Yeah.\n" +
				"\n" +
				"Yeah. Yeah. Let’s do one more.\n" +
				"\n" +
				"LILLIAN: It’s really extraordinary, the turn she’s taken these past few weeks.\n" +
				"\n" +
				"Whatever you’re doing, keep doing it.\n" +
				"\n" +
				"Yeah, I will.\n" +
				"\n" +
				"MIKE: It’s not that hard.\n" +
				"\n" +
				"What do you want for dinner?\n" +
				"\n" +
				"Pizza or spaghetti?\n" +
				"\n" +
				"Both.\n" +
				"\n" +
				"(chuckles)\n" +
				"\n" +
				"You got to choose. Which is it?\n" +
				"\n" +
				"But I want both.\n" +
				"\n" +
				"You can’t have both.\n" +
				"\n" +
				"Spaghetti with meatballs.\n" +
				"\n" +
				"All right, with meatballs.\n" +
				"\n" +
				"Um, we’re gonna make a quick stop, okay?\n" +
				"\n" +
				"(siren wails in distance)\n" +
				"\n" +
				"(air pumping slowly)\n" +
				"\n" +
				"(monitor beeping steadily)\n" +
				"\n" +
				"(indistinct announcements over P.A.)\n" +
				"\n" +
				"Vanessa, I don’t know if… you can hear any of this, but, um… I’m having a hard time just processing everything that happened.\n" +
				"\n" +
				"But you were there for me and Abby when it mattered the most.\n" +
				"\n" +
				"And I don’t think that either of us would be here today if it weren’t for you.\n" +
				"\n" +
				"So… So get better.\n" +
				"\n" +
				"And we’ll be here when you wake up.\n" +
				"\n" +
				"ABBY: Did you tell her I said hi?\n" +
				"\n" +
				"I did.\n" +
				"\n" +
				"All right, let’s get out of here.\n" +
				"\n" +
				"MIKE: You okay?\n" +
				"\n" +
				"ABBY: I was just thinking about my friends.\n" +
				"\n" +
				"MIKE: Hmm.\n" +
				"\n" +
				"They’re all alone.\n" +
				"\n" +
				"Right.\n" +
				"\n" +
				"No one takes care of them anymore.\n" +
				"\n" +
				"Can we visit them sometime?\n" +
				"\n" +
				"Um…\n" +
				"\n" +
				"You know what?\n" +
				"\n" +
				"You never know what can happen.\n" +
				"\n" +
				"Do you think if you drink enough milk, you just turn into a cow?\n" +
				"\n" +
				"(laughs): No.\n" +
				"\n" +
				"Would you start, like, getting, like, spots on you like a cow?\n" +
				"\n" +
				"(chuckles): No.\n" +
				"\n" +
				"What would happen? Just…\n" +
				"\n" +
				"♪ ♪\n" +
				"\n" +
				"(lights crackling softly)\n" +
				"\n" +
				"(William groaning in pain)\n" +
				"\n" +
				"(pained groaning continues)\n" +
				"\n" +
				"(strained grunting)\n" +
				"\n" +
				"(“Five Nights at Freddy’s” by The Living Tombstone playing)\n" +
				"\n" +
				"♪ We’re waiting every night ♪\n" +
				"\n" +
				"♪ To finally roam and invite ♪\n" +
				"\n" +
				"♪ Newcomers to play with us ♪\n" +
				"\n" +
				"♪ For many years, we’ve been all alone ♪\n" +
				"\n" +
				"♪ We’re forced to be still and play ♪\n" +
				"\n" +
				"♪ The same songs we’ve known since that day ♪\n" +
				"\n" +
				"♪ An impostor took our life away ♪\n" +
				"\n" +
				"♪ Now we’re stuck here to decay ♪\n" +
				"\n" +
				"♪ Please let us get in, don’t lock us away ♪\n" +
				"\n" +
				"♪ We’re not like what you’re thinking ♪\n" +
				"\n" +
				"♪ We’re poor little souls who have lost all control ♪\n" +
				"\n" +
				"♪ And we’re forced here to take that role ♪\n" +
				"\n" +
				"♪ We’ve been all alone, stuck in our little zone ♪\n" +
				"\n" +
				"♪ Since 1987 ♪\n" +
				"\n" +
				"♪ Join us, be our friend or just be stuck and defend ♪\n" +
				"\n" +
				"♪ After all, you only got five nights at… ♪\n" +
				"\n" +
				"(song stops)\n" +
				"\n" +
				"(snoring)\n" +
				"\n" +
				"(knock on window)\n" +
				"\n" +
				"Uh-uh. No, not today. Sorry.\n" +
				"\n" +
				"(door opens, closes)\n" +
				"\n" +
				"I said, read the s…\n" +
				"\n" +
				"(screams)\n" +
				"\n" +
				"♪ Five nights at Freddy’s ♪\n" +
				"\n" +
				"♪ Oh ♪\n" +
				"\n" +
				"♪ ♪\n" +
				"\n" +
				"♪ We’re really quite surprised ♪\n" +
				"\n" +
				"♪ We get to see you another night ♪\n" +
				"\n" +
				"♪ You should have looked for another job ♪\n" +
				"\n" +
				"♪ You should have said to this place goodbye ♪\n" +
				"\n" +
				"♪ It’s like there’s so much more ♪\n" +
				"\n" +
				"♪ Maybe you’ve been in this place before ♪\n" +
				"\n" +
				"♪ We remember a face like yours ♪\n" +
				"\n" +
				"♪ You seem acquainted with those doors ♪\n" +
				"\n" +
				"♪ Please let us get in, don’t lock us away ♪\n" +
				"\n" +
				"♪ We’re not like what you’re thinking ♪\n" +
				"\n" +
				"♪ We’re poor little souls who have lost all control ♪\n" +
				"\n" +
				"♪ And we’re forced here to take that role ♪\n" +
				"\n" +
				"♪ We’ve been all alone, stuck in our little zone ♪\n" +
				"\n" +
				"♪ Since 1987 ♪\n" +
				"\n" +
				"♪ Join us, be our friend or just be stuck and defend ♪\n" +
				"\n" +
				"♪ After all, you only got five nights at Freddy’s ♪\n" +
				"\n" +
				"♪ Is this where you want to be? ♪\n" +
				"\n" +
				"♪ I just don’t get it ♪\n" +
				"\n" +
				"♪ Why do you want to stay? ♪\n" +
				"\n" +
				"♪ Five nights at Freddy’s ♪\n" +
				"\n" +
				"♪ Is this where you want to be? ♪\n" +
				"\n" +
				"♪ I just don’t get it ♪\n" +
				"\n" +
				"♪ Why do you want to stay? ♪\n" +
				"\n" +
				"♪ Five nights at Freddy’s ♪\n" +
				"\n" +
				"♪ Oh. ♪\n" +
				"\n" +
				"♪ ♪\n" +
				"\n" +
				"(song ends)\n" +
				"\n" +
				"♪ ♪\n" +
				"\n" +
				"♪ ♪\n" +
				"\n" +
				"DISTORTED ELECTRONIC VOICE: C… O…\n" +
				"\n" +
				"M… E…\n" +
				"\n" +
				"F… I…\n" +
				"\n" +
				"N… D…\n" +
				"\n" +
				"M… E.\n" +
				"\n" +
				"(music ends)";
	}

	@Override
	public void render(@NotNull GuiGraphics ms, int mouseX, int mouseY, float partialTicks) {
		int width = this.width;
		int height = this.height;
		Level world = null;
		double x = 0;
		double y = 0;
		double z = 0;
		float f11 = 1.0F;
		int l = Mth.ceil(f11 * 255.0F) << 24;
		Player entity = Minecraft.getInstance().player;
		if (entity != null) {
			world = entity.level();
			x = entity.getX();
			y = entity.getY();
			z = entity.getZ();
		}
		RenderSystem.disableDepthTest();
		RenderSystem.depthMask(false);
		RenderSystem.enableBlend();
		RenderSystem.setShader(GameRenderer::getPositionTexShader);
		RenderSystem.blendFuncSeparate(GlStateManager.SourceFactor.SRC_ALPHA, GlStateManager.DestFactor.ONE_MINUS_SRC_ALPHA, GlStateManager.SourceFactor.ONE, GlStateManager.DestFactor.ZERO);
		RenderSystem.setShaderColor(1, 1, 1, 1);
		ms.blit(BACKGROUND, 0, 0, 0, 0, width, height, width, height);
		RenderSystem.depthMask(true);int middleX = width / 2;
		int middleY = height / 5;
		float widthScale = width / 427F;
		float heightScale = height / 427F;
		float imageScale = Math.min(widthScale, heightScale) * 192;

		GlStateManager._enableBlend();
		RenderSystem.setShaderColor(1.0F, 1.0F, 1.0F, 1.0F);
		ms.blit(MINECRAFT_TITLE_TEXTURES, width / 2 - 256 / 2, 10, 0, 0, 256, 64, 256, 64);

		ForgeHooksClient.renderMainMenu(this, ms, this.getMinecraft().font, width, height, l);
		if (this.splashText != null) {
			ms.pose().pushPose();
			ms.pose().translate((this.width / 2 + 90), 70.0D, 0.0D);
			ms.pose().mulPose(Axis.ZP.rotationDegrees(-20.0F));
			float f2 = 1.8F - Mth.abs(Mth.sin((float) (Util.getMillis() % 1000L) / 1000.0F * ((float) Math.PI * 2F)) * 0.1F);
			f2 = f2 * 100.0F / (float) (this.font.width(this.splashText) + 32);
			ms.pose().scale(f2, f2, f2);
			ms.drawCenteredString(this.font, this.splashText, 0, -8, 16776960 | l);
			ms.pose().popPose();
		}
		String s1 = "Copyright Mojang AB. Do not distribute!";
		Font font = this.getMinecraft().font;

		ms.drawString(font, s1, width - this.getMinecraft().font.width(s1) - 2,
				height - 10, 0xFFFFFFFF);
		for (int i = 0; i < this.renderables.size(); ++i) {
			this.renderables.get(i).render(ms, mouseX, mouseY, partialTicks);
		}
		for (int i = 0; i < this.renderables.size(); i++) {
			renderables.get(i).render(ms, mouseX, mouseY, getMinecraft().getFrameTime());
		}

	}
	@Override
	protected void init() {
		this.clearWidgets();
		this.addRenderableWidget(new FnafModButton(
				this.width / 2 - 200, 120,
				Component.literal("Singleplayer"),
				btn -> Minecraft.getInstance().setScreen(new SelectWorldScreen(this))
		));
		this.addRenderableWidget(new FnafModButton(
				this.width / 2 - 200, 140,
				Component.literal("Multiplayer"),
				btn -> Minecraft.getInstance().setScreen(new JoinMultiplayerScreen(this))
		));
		this.addRenderableWidget(new FnafModButton(
				this.width / 2 - 200, 160,
				Component.literal("Settings..."),
				btn -> Minecraft.getInstance().setScreen(new OptionsScreen(this, this.minecraft.options))
		));
		this.addRenderableWidget(new FnafModButton(
				this.width / 2 - 200, 180,
				Component.literal("Mods"),
				btn -> Minecraft.getInstance().setScreen(new ModListScreen(this))
		));
		this.addRenderableWidget(new FnafModButton(
				this.width / 2 - 200, 200,
				Component.literal("Quit"),
				btn -> Minecraft.getInstance().stop(
				)));
	}





}



