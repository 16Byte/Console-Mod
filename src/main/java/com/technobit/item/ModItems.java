package com.technobit.item;

import com.technobit.lib.RefStrings;

import cpw.mods.fml.common.registry.GameRegistry;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;
import net.minecraft.item.Item.ToolMaterial;
import net.minecraftforge.common.util.EnumHelper;

public class ModItems {

	public static void mainRegistry() {
		initializeItem();
		registerItem();
	}
	
	public static ToolMaterial toolMat = EnumHelper.addToolMaterial("Tool Material", 3, 2000, 14.0f, 4.5f, 10);
	
	public static Item PS4Controller;
	public static Item PS4;
	public static Item PS3Controller;
	public static Item XboxOneController;
	public static Item Xbox360Controller;
	public static Item WiiUController;
	public static Item WiiController; 
	
	public static void initializeItem() {
		PS4Controller = new Item().setUnlocalizedName("PS4Controller").setCreativeTab(CreativeTabs.tabMisc).setTextureName(RefStrings.MODID + ":PS4Controller");
		WiiController = new WiiController(toolMat).setCreativeTab(CreativeTabs.tabMisc).setUnlocalizedName("WiiController").setTextureName(RefStrings.MODID + ":WiiRemote");
		PS4 = new Item().setUnlocalizedName("PS4Item").setCreativeTab(CreativeTabs.tabMisc).setFull3D().setTextureName(RefStrings.MODID + ":PS4");
	}
	
	public static void registerItem() {
		GameRegistry.registerItem(PS4Controller, PS4Controller.getUnlocalizedName());
		GameRegistry.registerItem(WiiController, WiiController.getUnlocalizedName());
		GameRegistry.registerItem(PS4, PS4.getUnlocalizedName());
	}
}
