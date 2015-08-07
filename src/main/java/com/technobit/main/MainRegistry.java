package com.technobit.main;

import com.technobit.block.ModBlocks;
import com.technobit.item.ModItems;
import com.technobit.item.SAO_ModItems;
import com.technobit.lib.RefStrings;

import cpw.mods.fml.common.Mod;
import cpw.mods.fml.common.Mod.EventHandler;
import cpw.mods.fml.common.SidedProxy;
import cpw.mods.fml.common.event.FMLInitializationEvent;
import cpw.mods.fml.common.event.FMLPostInitializationEvent;
import cpw.mods.fml.common.event.FMLPreInitializationEvent;

@Mod(modid = RefStrings.MODID, name = RefStrings.NAME, version = RefStrings.VERSION)
public class MainRegistry {
	
	@SidedProxy(clientSide = RefStrings.CLIENTSIDE , serverSide = RefStrings.SERVERSIDE)
	public static ServerProxy proxy;
	
	@EventHandler
	public static void PreLoad(FMLPreInitializationEvent PreEvent) {
		ModItems.mainRegistry();
		ModBlocks.mainRegistry();
		SAO_ModItems.mainRegistry();
		proxy.registerRenderInfo();
	}
	
	@EventHandler
	public static void Load(FMLInitializationEvent PreEvent) {
		
	}
	
	@EventHandler
	public static void PostLoad(FMLPostInitializationEvent PreEvent) {
		
	}

}
