package com.you.modname.proxy;

import com.you.modname.init.Blocks;
import com.you.modname.init.Items;

public class ClientProxy extends CommonProxy {

	@Override
	public void registerRenders()
	{
		Items.registerRenders();
		Blocks.registerRenders();
	}
	
}
