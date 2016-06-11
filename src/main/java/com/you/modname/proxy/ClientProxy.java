package com.you.modname.proxy;

import com.you.modname.init.myBlocks;
import com.you.modname.init.myItems;

public class ClientProxy extends CommonProxy {

	@Override
	public void registerRenders()
	{
		myItems.registerRenders();
		myBlocks.registerRenders();
	}
	
}
