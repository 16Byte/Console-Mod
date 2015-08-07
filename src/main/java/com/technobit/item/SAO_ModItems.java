package com.technobit.item;

import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;
import net.minecraft.item.Item.ToolMaterial;
import net.minecraftforge.common.util.EnumHelper;

import com.technobit.lib.RefStrings;

import cpw.mods.fml.common.registry.GameRegistry;

public class SAO_ModItems {

	public static void mainRegistry() {
		initializeItem();
		registerItem();
	}
	
	public static ToolMaterial toolMat = EnumHelper.addToolMaterial("Tool Material", 3, 2000, 14.0f, 4.5f, 10);
	public static ToolMaterial ExcaliburMat = EnumHelper.addToolMaterial("Excalibur Material", 10, 999999999, 100.0f, 84.5f, 100);
	
	public static Item Excalibur;
	public static Item Elucidator;
	public static Item DarkRepulser;
	
	public static void initializeItem() {
		Excalibur = new Excalibur(ExcaliburMat).setUnlocalizedName("Excalibur").setCreativeTab(CreativeTabs.tabCombat).setTextureName(RefStrings.MODID + ":Excalibur");
		Elucidator = new Elucidator(toolMat).setUnlocalizedName("Elucidator").setCreativeTab(CreativeTabs.tabCombat).setTextureName(RefStrings.MODID + ":Elucidator");
		DarkRepulser = new DarkRepulser(toolMat).setUnlocalizedName("DarkRepulser").setCreativeTab(CreativeTabs.tabCombat).setTextureName(RefStrings.MODID + ":DarkRepulser");
	}
	
	public static void registerItem() {
		GameRegistry.registerItem(Excalibur, Excalibur.getUnlocalizedName());
		GameRegistry.registerItem(Elucidator, Elucidator.getUnlocalizedName());
		GameRegistry.registerItem(DarkRepulser, DarkRepulser.getUnlocalizedName());
	} 
	
}
