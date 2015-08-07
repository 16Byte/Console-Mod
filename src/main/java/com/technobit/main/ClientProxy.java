package com.technobit.main;

import net.minecraft.world.IBlockAccess;

public class ClientProxy extends ServerProxy {
	public void registerRenderInfo() {
		
	}
	
	//This will tell minecraft not to render any side of our cube.
	public boolean shouldSideBeRendered(IBlockAccess iblockaccess, int i, int j, int k, int l)
	{
	   return false;
	}

	//And this tell it that you can see through this block, and neighbor blocks should be rendered.
	public boolean isOpaqueCube()
	{
	   return false;
	}
}
