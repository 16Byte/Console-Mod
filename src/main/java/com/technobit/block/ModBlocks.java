package com.technobit.block;

import com.technobit.lib.RefStrings;

import cpw.mods.fml.common.registry.GameRegistry;
import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.creativetab.CreativeTabs;



public class ModBlocks {

		public static void mainRegistry() {
			initializeBlock();
			registerBlock();
		}
		
		
		
		public static Block PS4;
		
		public static void initializeBlock() {
			PS4 = new PS4(Material.anvil).setBlockName("PS4").setCreativeTab(CreativeTabs.tabDecorations).setBlockTextureName(RefStrings.MODID + ":PS4");
		}
		
		public static void registerBlock() {
			GameRegistry.registerBlock(PS4, PS4.getUnlocalizedName());
		}

}
