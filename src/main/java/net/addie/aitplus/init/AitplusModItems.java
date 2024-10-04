/*
 *	MCreator note: This file will be REGENERATED on each build.
 */
package net.addie.aitplus.init;

import net.minecraft.world.item.SpawnEggItem;
import net.minecraft.world.item.Items;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.BlockItem;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.core.registries.BuiltInRegistries;
import net.minecraft.core.Registry;
import net.minecraft.client.renderer.item.ItemProperties;
import net.minecraft.client.renderer.item.ClampedItemPropertyFunction;

import net.fabricmc.fabric.api.itemgroup.v1.ItemGroupEvents;

import net.addie.aitplus.item.YellowJellyBabiesItem;
import net.addie.aitplus.item.TheMightyJellyBabiesItem;
import net.addie.aitplus.item.TakeMeToTrenzalorItem;
import net.addie.aitplus.item.TakeMeToSkaroItem;
import net.addie.aitplus.item.TakeMeToGallifreyItem;
import net.addie.aitplus.item.RedJellyBabiesItem;
import net.addie.aitplus.item.PurpleJellyBabiesItem;
import net.addie.aitplus.item.PinkJellyBabiesItem;
import net.addie.aitplus.item.OrangeJellyBabiesItem;
import net.addie.aitplus.item.MagentaJellyBabiesItem;
import net.addie.aitplus.item.LimejellyBabiesItem;
import net.addie.aitplus.item.LightBlueJellyBabiesItem;
import net.addie.aitplus.item.GreenJellyBabiesItem;
import net.addie.aitplus.item.FishFingersItem;
import net.addie.aitplus.item.FishFingersAndCustardItem;
import net.addie.aitplus.item.CyanJellyBabiesItem;
import net.addie.aitplus.item.CustardItem;
import net.addie.aitplus.item.CreativeTabItemItem;
import net.addie.aitplus.item.BlueJellyBabiesItem;
import net.addie.aitplus.item.BlackJellyBabiesItem;
import net.addie.aitplus.AitplusMod;

public class AitplusModItems {
	public static Item TRENZALORIAN_STONE;
	public static Item TRENZALORIAN_STONE_STAIRS;
	public static Item TRENZALORIAN_STONE_SLAB;
	public static Item TRENZALORIAN_STONE_WALL;
	public static Item CADONWOOD_LOG;
	public static Item CADON_WOOD;
	public static Item STRIPPED_CADONWOOD_LOG;
	public static Item STRIPPED_CADON_WOOD;
	public static Item CADONWOOD_PLANKS;
	public static Item CADONWOOD_STAIRS;
	public static Item CADONWOOD_SLAB;
	public static Item CADONWOOD_FENCE;
	public static Item CADONWOOD_FENCE_GATE;
	public static Item CADONWOOD_DOOR;
	public static Item CADONWOOD_TRAPDOOR;
	public static Item CANDONWOOD_BUTTON;
	public static Item CANDONWOOD_PRESSURE_PLATE;
	public static Item CANDONWOOD_LEAVES;
	public static Item THALMA_LOG;
	public static Item THALMA_WOOD;
	public static Item STRIPPED_THALMA_LOG;
	public static Item STRIPPED_THALMA_WOOD;
	public static Item THALMA_PLANKS;
	public static Item THALMA_STAIRS;
	public static Item THALMA_SLAB;
	public static Item THALMA_FENCE;
	public static Item THALMA_FENCE_GATE;
	public static Item THALMA_DOOR;
	public static Item THALMA_TRAPDOOR;
	public static Item THALMA_BUTTON;
	public static Item THALMA_PRESSURE_PLATE;
	public static Item THALMA_LEAVES;
	public static Item LED_ROUNDEL;
	public static Item ARKYTIOR;
	public static Item FLOWER_OF_REMEBERANCE;
	public static Item IRIDESCENT_VELVET_RED_MADEVINIA_ARIDOSA;
	public static Item MOONLIGHT_BLOOM;
	public static Item RED_PETALED_ORCHID;
	public static Item SCHLENK_BLOSSOMS;
	public static Item YELLOW_JELLY_BABIES;
	public static Item RED_JELLY_BABIES;
	public static Item PURPLE_JELLY_BABIES;
	public static Item PINK_JELLY_BABIES;
	public static Item ORANGE_JELLY_BABIES;
	public static Item MAGENTA_JELLY_BABIES;
	public static Item LIMEJELLY_BABIES;
	public static Item LIGHT_BLUE_JELLY_BABIES;
	public static Item GREEN_JELLY_BABIES;
	public static Item CYAN_JELLY_BABIES;
	public static Item BLUE_JELLY_BABIES;
	public static Item BLACK_JELLY_BABIES;
	public static Item THE_MIGHTY_JELLY_BABIES;
	public static Item FISH_FINGERS;
	public static Item CUSTARD;
	public static Item FISH_FINGERS_AND_CUSTARD;
	public static Item FLUTTERWING_SPAWN_EGG;
	public static Item FLY_SPAWN_EGG;
	public static Item FLUBBLE_SPAWN_EGG;
	public static Item TAKE_ME_TO_GALLIFREY;
	public static Item TAKE_ME_TO_TRENZALOR;
	public static Item TAKE_ME_TO_SKARO;
	public static Item CREATIVE_TAB_ITEM;
	public static Item LED_ROUNDEL_BLACK;
	public static Item LED_ROUNDEL_BLUE;
	public static Item LED_ROUNDEL_CYAN;
	public static Item LED_ROUNDEL_GRAY;
	public static Item LED_ROUNDEL_GREEN;
	public static Item LED_ROUNDEL_ORANGE;
	public static Item LED_ROUNDEL_PINK;
	public static Item LED_ROUNDEL_PURPLE;
	public static Item LED_ROUNDEL_RED;
	public static Item LED_ROUNDEL_YELLOW;
	public static Item CLASSIC_DALEK_SPAWN_EGG;
	public static Item BRONZE_DALEK_SPAWN_EGG;

	public static void load() {
		TRENZALORIAN_STONE = register("trenzalorian_stone", new BlockItem(AitplusModBlocks.TRENZALORIAN_STONE, new Item.Properties()));
		ItemGroupEvents.modifyEntriesEvent(AitplusModTabs.TAB_AI_T_PLUS).register(content -> content.accept(TRENZALORIAN_STONE));
		TRENZALORIAN_STONE_STAIRS = register("trenzalorian_stone_stairs", new BlockItem(AitplusModBlocks.TRENZALORIAN_STONE_STAIRS, new Item.Properties()));
		ItemGroupEvents.modifyEntriesEvent(AitplusModTabs.TAB_AI_T_PLUS).register(content -> content.accept(TRENZALORIAN_STONE_STAIRS));
		TRENZALORIAN_STONE_SLAB = register("trenzalorian_stone_slab", new BlockItem(AitplusModBlocks.TRENZALORIAN_STONE_SLAB, new Item.Properties()));
		ItemGroupEvents.modifyEntriesEvent(AitplusModTabs.TAB_AI_T_PLUS).register(content -> content.accept(TRENZALORIAN_STONE_SLAB));
		TRENZALORIAN_STONE_WALL = register("trenzalorian_stone_wall", new BlockItem(AitplusModBlocks.TRENZALORIAN_STONE_WALL, new Item.Properties()));
		ItemGroupEvents.modifyEntriesEvent(AitplusModTabs.TAB_AI_T_PLUS).register(content -> content.accept(TRENZALORIAN_STONE_WALL));
		CADONWOOD_LOG = register("cadonwood_log", new BlockItem(AitplusModBlocks.CADONWOOD_LOG, new Item.Properties()));
		ItemGroupEvents.modifyEntriesEvent(AitplusModTabs.TAB_AI_T_PLUS).register(content -> content.accept(CADONWOOD_LOG));
		CADON_WOOD = register("cadon_wood", new BlockItem(AitplusModBlocks.CADON_WOOD, new Item.Properties()));
		ItemGroupEvents.modifyEntriesEvent(AitplusModTabs.TAB_AI_T_PLUS).register(content -> content.accept(CADON_WOOD));
		STRIPPED_CADONWOOD_LOG = register("stripped_cadonwood_log", new BlockItem(AitplusModBlocks.STRIPPED_CADONWOOD_LOG, new Item.Properties()));
		ItemGroupEvents.modifyEntriesEvent(AitplusModTabs.TAB_AI_T_PLUS).register(content -> content.accept(STRIPPED_CADONWOOD_LOG));
		STRIPPED_CADON_WOOD = register("stripped_cadon_wood", new BlockItem(AitplusModBlocks.STRIPPED_CADON_WOOD, new Item.Properties()));
		ItemGroupEvents.modifyEntriesEvent(AitplusModTabs.TAB_AI_T_PLUS).register(content -> content.accept(STRIPPED_CADON_WOOD));
		CADONWOOD_PLANKS = register("cadonwood_planks", new BlockItem(AitplusModBlocks.CADONWOOD_PLANKS, new Item.Properties()));
		ItemGroupEvents.modifyEntriesEvent(AitplusModTabs.TAB_AI_T_PLUS).register(content -> content.accept(CADONWOOD_PLANKS));
		CADONWOOD_STAIRS = register("cadonwood_stairs", new BlockItem(AitplusModBlocks.CADONWOOD_STAIRS, new Item.Properties()));
		ItemGroupEvents.modifyEntriesEvent(AitplusModTabs.TAB_AI_T_PLUS).register(content -> content.accept(CADONWOOD_STAIRS));
		CADONWOOD_SLAB = register("cadonwood_slab", new BlockItem(AitplusModBlocks.CADONWOOD_SLAB, new Item.Properties()));
		ItemGroupEvents.modifyEntriesEvent(AitplusModTabs.TAB_AI_T_PLUS).register(content -> content.accept(CADONWOOD_SLAB));
		CADONWOOD_FENCE = register("cadonwood_fence", new BlockItem(AitplusModBlocks.CADONWOOD_FENCE, new Item.Properties()));
		ItemGroupEvents.modifyEntriesEvent(AitplusModTabs.TAB_AI_T_PLUS).register(content -> content.accept(CADONWOOD_FENCE));
		CADONWOOD_FENCE_GATE = register("cadonwood_fence_gate", new BlockItem(AitplusModBlocks.CADONWOOD_FENCE_GATE, new Item.Properties()));
		ItemGroupEvents.modifyEntriesEvent(AitplusModTabs.TAB_AI_T_PLUS).register(content -> content.accept(CADONWOOD_FENCE_GATE));
		CADONWOOD_DOOR = register("cadonwood_door", new BlockItem(AitplusModBlocks.CADONWOOD_DOOR, new Item.Properties()));
		ItemGroupEvents.modifyEntriesEvent(AitplusModTabs.TAB_AI_T_PLUS).register(content -> content.accept(CADONWOOD_DOOR));
		CADONWOOD_TRAPDOOR = register("cadonwood_trapdoor", new BlockItem(AitplusModBlocks.CADONWOOD_TRAPDOOR, new Item.Properties()));
		ItemGroupEvents.modifyEntriesEvent(AitplusModTabs.TAB_AI_T_PLUS).register(content -> content.accept(CADONWOOD_TRAPDOOR));
		CANDONWOOD_BUTTON = register("candonwood_button", new BlockItem(AitplusModBlocks.CANDONWOOD_BUTTON, new Item.Properties()));
		ItemGroupEvents.modifyEntriesEvent(AitplusModTabs.TAB_AI_T_PLUS).register(content -> content.accept(CANDONWOOD_BUTTON));
		CANDONWOOD_PRESSURE_PLATE = register("candonwood_pressure_plate", new BlockItem(AitplusModBlocks.CANDONWOOD_PRESSURE_PLATE, new Item.Properties()));
		ItemGroupEvents.modifyEntriesEvent(AitplusModTabs.TAB_AI_T_PLUS).register(content -> content.accept(CANDONWOOD_PRESSURE_PLATE));
		CANDONWOOD_LEAVES = register("candonwood_leaves", new BlockItem(AitplusModBlocks.CANDONWOOD_LEAVES, new Item.Properties()));
		ItemGroupEvents.modifyEntriesEvent(AitplusModTabs.TAB_AI_T_PLUS).register(content -> content.accept(CANDONWOOD_LEAVES));
		THALMA_LOG = register("thalma_log", new BlockItem(AitplusModBlocks.THALMA_LOG, new Item.Properties()));
		ItemGroupEvents.modifyEntriesEvent(AitplusModTabs.TAB_AI_T_PLUS).register(content -> content.accept(THALMA_LOG));
		THALMA_WOOD = register("thalma_wood", new BlockItem(AitplusModBlocks.THALMA_WOOD, new Item.Properties()));
		ItemGroupEvents.modifyEntriesEvent(AitplusModTabs.TAB_AI_T_PLUS).register(content -> content.accept(THALMA_WOOD));
		STRIPPED_THALMA_LOG = register("stripped_thalma_log", new BlockItem(AitplusModBlocks.STRIPPED_THALMA_LOG, new Item.Properties()));
		ItemGroupEvents.modifyEntriesEvent(AitplusModTabs.TAB_AI_T_PLUS).register(content -> content.accept(STRIPPED_THALMA_LOG));
		STRIPPED_THALMA_WOOD = register("stripped_thalma_wood", new BlockItem(AitplusModBlocks.STRIPPED_THALMA_WOOD, new Item.Properties()));
		ItemGroupEvents.modifyEntriesEvent(AitplusModTabs.TAB_AI_T_PLUS).register(content -> content.accept(STRIPPED_THALMA_WOOD));
		THALMA_PLANKS = register("thalma_planks", new BlockItem(AitplusModBlocks.THALMA_PLANKS, new Item.Properties()));
		ItemGroupEvents.modifyEntriesEvent(AitplusModTabs.TAB_AI_T_PLUS).register(content -> content.accept(THALMA_PLANKS));
		THALMA_STAIRS = register("thalma_stairs", new BlockItem(AitplusModBlocks.THALMA_STAIRS, new Item.Properties()));
		ItemGroupEvents.modifyEntriesEvent(AitplusModTabs.TAB_AI_T_PLUS).register(content -> content.accept(THALMA_STAIRS));
		THALMA_SLAB = register("thalma_slab", new BlockItem(AitplusModBlocks.THALMA_SLAB, new Item.Properties()));
		ItemGroupEvents.modifyEntriesEvent(AitplusModTabs.TAB_AI_T_PLUS).register(content -> content.accept(THALMA_SLAB));
		THALMA_FENCE = register("thalma_fence", new BlockItem(AitplusModBlocks.THALMA_FENCE, new Item.Properties()));
		ItemGroupEvents.modifyEntriesEvent(AitplusModTabs.TAB_AI_T_PLUS).register(content -> content.accept(THALMA_FENCE));
		THALMA_FENCE_GATE = register("thalma_fence_gate", new BlockItem(AitplusModBlocks.THALMA_FENCE_GATE, new Item.Properties()));
		ItemGroupEvents.modifyEntriesEvent(AitplusModTabs.TAB_AI_T_PLUS).register(content -> content.accept(THALMA_FENCE_GATE));
		THALMA_DOOR = register("thalma_door", new BlockItem(AitplusModBlocks.THALMA_DOOR, new Item.Properties()));
		ItemGroupEvents.modifyEntriesEvent(AitplusModTabs.TAB_AI_T_PLUS).register(content -> content.accept(THALMA_DOOR));
		THALMA_TRAPDOOR = register("thalma_trapdoor", new BlockItem(AitplusModBlocks.THALMA_TRAPDOOR, new Item.Properties()));
		ItemGroupEvents.modifyEntriesEvent(AitplusModTabs.TAB_AI_T_PLUS).register(content -> content.accept(THALMA_TRAPDOOR));
		THALMA_BUTTON = register("thalma_button", new BlockItem(AitplusModBlocks.THALMA_BUTTON, new Item.Properties()));
		ItemGroupEvents.modifyEntriesEvent(AitplusModTabs.TAB_AI_T_PLUS).register(content -> content.accept(THALMA_BUTTON));
		THALMA_PRESSURE_PLATE = register("thalma_pressure_plate", new BlockItem(AitplusModBlocks.THALMA_PRESSURE_PLATE, new Item.Properties()));
		ItemGroupEvents.modifyEntriesEvent(AitplusModTabs.TAB_AI_T_PLUS).register(content -> content.accept(THALMA_PRESSURE_PLATE));
		THALMA_LEAVES = register("thalma_leaves", new BlockItem(AitplusModBlocks.THALMA_LEAVES, new Item.Properties()));
		ItemGroupEvents.modifyEntriesEvent(AitplusModTabs.TAB_AI_T_PLUS).register(content -> content.accept(THALMA_LEAVES));
		LED_ROUNDEL = register("led_roundel", new BlockItem(AitplusModBlocks.LED_ROUNDEL, new Item.Properties()));
		ItemGroupEvents.modifyEntriesEvent(AitplusModTabs.TAB_AI_T_PLUS).register(content -> content.accept(LED_ROUNDEL));
		ARKYTIOR = register("arkytior", new BlockItem(AitplusModBlocks.ARKYTIOR, new Item.Properties()));
		ItemGroupEvents.modifyEntriesEvent(AitplusModTabs.TAB_AI_T_PLUS).register(content -> content.accept(ARKYTIOR));
		FLOWER_OF_REMEBERANCE = register("flower_of_remeberance", new BlockItem(AitplusModBlocks.FLOWER_OF_REMEBERANCE, new Item.Properties()));
		ItemGroupEvents.modifyEntriesEvent(AitplusModTabs.TAB_AI_T_PLUS).register(content -> content.accept(FLOWER_OF_REMEBERANCE));
		IRIDESCENT_VELVET_RED_MADEVINIA_ARIDOSA = register("iridescent_velvet_red_madevinia_aridosa", new BlockItem(AitplusModBlocks.IRIDESCENT_VELVET_RED_MADEVINIA_ARIDOSA, new Item.Properties()));
		ItemGroupEvents.modifyEntriesEvent(AitplusModTabs.TAB_AI_T_PLUS).register(content -> content.accept(IRIDESCENT_VELVET_RED_MADEVINIA_ARIDOSA));
		MOONLIGHT_BLOOM = register("moonlight_bloom", new BlockItem(AitplusModBlocks.MOONLIGHT_BLOOM, new Item.Properties()));
		ItemGroupEvents.modifyEntriesEvent(AitplusModTabs.TAB_AI_T_PLUS).register(content -> content.accept(MOONLIGHT_BLOOM));
		RED_PETALED_ORCHID = register("red_petaled_orchid", new BlockItem(AitplusModBlocks.RED_PETALED_ORCHID, new Item.Properties()));
		ItemGroupEvents.modifyEntriesEvent(AitplusModTabs.TAB_AI_T_PLUS).register(content -> content.accept(RED_PETALED_ORCHID));
		SCHLENK_BLOSSOMS = register("schlenk_blossoms", new BlockItem(AitplusModBlocks.SCHLENK_BLOSSOMS, new Item.Properties()));
		ItemGroupEvents.modifyEntriesEvent(AitplusModTabs.TAB_AI_T_PLUS).register(content -> content.accept(SCHLENK_BLOSSOMS));
		YELLOW_JELLY_BABIES = register("yellow_jelly_babies", new YellowJellyBabiesItem());
		RED_JELLY_BABIES = register("red_jelly_babies", new RedJellyBabiesItem());
		PURPLE_JELLY_BABIES = register("purple_jelly_babies", new PurpleJellyBabiesItem());
		PINK_JELLY_BABIES = register("pink_jelly_babies", new PinkJellyBabiesItem());
		ORANGE_JELLY_BABIES = register("orange_jelly_babies", new OrangeJellyBabiesItem());
		MAGENTA_JELLY_BABIES = register("magenta_jelly_babies", new MagentaJellyBabiesItem());
		LIMEJELLY_BABIES = register("limejelly_babies", new LimejellyBabiesItem());
		LIGHT_BLUE_JELLY_BABIES = register("light_blue_jelly_babies", new LightBlueJellyBabiesItem());
		GREEN_JELLY_BABIES = register("green_jelly_babies", new GreenJellyBabiesItem());
		CYAN_JELLY_BABIES = register("cyan_jelly_babies", new CyanJellyBabiesItem());
		BLUE_JELLY_BABIES = register("blue_jelly_babies", new BlueJellyBabiesItem());
		BLACK_JELLY_BABIES = register("black_jelly_babies", new BlackJellyBabiesItem());
		THE_MIGHTY_JELLY_BABIES = register("the_mighty_jelly_babies", new TheMightyJellyBabiesItem());
		FISH_FINGERS = register("fish_fingers", new FishFingersItem());
		CUSTARD = register("custard", new CustardItem());
		FISH_FINGERS_AND_CUSTARD = register("fish_fingers_and_custard", new FishFingersAndCustardItem());
		FLUTTERWING_SPAWN_EGG = register("flutterwing_spawn_egg", new SpawnEggItem(AitplusModEntities.FLUTTERWING, -16764007, -15987700, new Item.Properties()));
		ItemGroupEvents.modifyEntriesEvent(AitplusModTabs.TAB_AI_T_PLUS).register(content -> content.accept(FLUTTERWING_SPAWN_EGG));
		FLY_SPAWN_EGG = register("fly_spawn_egg", new SpawnEggItem(AitplusModEntities.FLY, -16448251, -9435899, new Item.Properties()));
		ItemGroupEvents.modifyEntriesEvent(AitplusModTabs.TAB_AI_T_PLUS).register(content -> content.accept(FLY_SPAWN_EGG));
		FLUBBLE_SPAWN_EGG = register("flubble_spawn_egg", new SpawnEggItem(AitplusModEntities.FLUBBLE, -9268588, -7876402, new Item.Properties()));
		ItemGroupEvents.modifyEntriesEvent(AitplusModTabs.TAB_AI_T_PLUS).register(content -> content.accept(FLUBBLE_SPAWN_EGG));
		TAKE_ME_TO_GALLIFREY = register("take_me_to_gallifrey", new TakeMeToGallifreyItem());
		TAKE_ME_TO_TRENZALOR = register("take_me_to_trenzalor", new TakeMeToTrenzalorItem());
		TAKE_ME_TO_SKARO = register("take_me_to_skaro", new TakeMeToSkaroItem());
		CREATIVE_TAB_ITEM = register("creative_tab_item", new CreativeTabItemItem());
		LED_ROUNDEL_BLACK = register("led_roundel_black", new BlockItem(AitplusModBlocks.LED_ROUNDEL_BLACK, new Item.Properties()));
		LED_ROUNDEL_BLUE = register("led_roundel_blue", new BlockItem(AitplusModBlocks.LED_ROUNDEL_BLUE, new Item.Properties()));
		LED_ROUNDEL_CYAN = register("led_roundel_cyan", new BlockItem(AitplusModBlocks.LED_ROUNDEL_CYAN, new Item.Properties()));
		LED_ROUNDEL_GRAY = register("led_roundel_gray", new BlockItem(AitplusModBlocks.LED_ROUNDEL_GRAY, new Item.Properties()));
		LED_ROUNDEL_GREEN = register("led_roundel_green", new BlockItem(AitplusModBlocks.LED_ROUNDEL_GREEN, new Item.Properties()));
		LED_ROUNDEL_ORANGE = register("led_roundel_orange", new BlockItem(AitplusModBlocks.LED_ROUNDEL_ORANGE, new Item.Properties()));
		LED_ROUNDEL_PINK = register("led_roundel_pink", new BlockItem(AitplusModBlocks.LED_ROUNDEL_PINK, new Item.Properties()));
		LED_ROUNDEL_PURPLE = register("led_roundel_purple", new BlockItem(AitplusModBlocks.LED_ROUNDEL_PURPLE, new Item.Properties()));
		LED_ROUNDEL_RED = register("led_roundel_red", new BlockItem(AitplusModBlocks.LED_ROUNDEL_RED, new Item.Properties()));
		LED_ROUNDEL_YELLOW = register("led_roundel_yellow", new BlockItem(AitplusModBlocks.LED_ROUNDEL_YELLOW, new Item.Properties()));
		CLASSIC_DALEK_SPAWN_EGG = register("classic_dalek_spawn_egg", new SpawnEggItem(AitplusModEntities.CLASSIC_DALEK, -2171945, -10704427, new Item.Properties()));
		ItemGroupEvents.modifyEntriesEvent(AitplusModTabs.TAB_AI_T_PLUS).register(content -> content.accept(CLASSIC_DALEK_SPAWN_EGG));
		BRONZE_DALEK_SPAWN_EGG = register("bronze_dalek_spawn_egg", new SpawnEggItem(AitplusModEntities.BRONZE_DALEK, -6325437, -2640283, new Item.Properties()));
		ItemGroupEvents.modifyEntriesEvent(AitplusModTabs.TAB_AI_T_PLUS).register(content -> content.accept(BRONZE_DALEK_SPAWN_EGG));
	}

	public static void clientLoad() {
	}

	private static Item register(String registryName, Item item) {
		return Registry.register(BuiltInRegistries.ITEM, new ResourceLocation(AitplusMod.MODID, registryName), item);
	}

	private static void registerBlockingProperty(Item item) {
		ItemProperties.register(item, new ResourceLocation("blocking"), (ClampedItemPropertyFunction) ItemProperties.getProperty(Items.SHIELD, new ResourceLocation("blocking")));
	}
}
