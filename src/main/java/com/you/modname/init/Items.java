package com.you.modname.init;

import com.you.modname.Reference;

import net.minecraft.client.Minecraft;
import net.minecraft.client.resources.model.ModelResourceLocation;
import net.minecraft.item.Item;

public class Items {
	
	
	
	public static void initItems()
	{

	}
	public static void registerItems()
	{
		
	}
	public static void registerRenders()
	{
		
	}
	public static void registerRender(Item item)
	{
		Minecraft.getMinecraft().getRenderItem().getItemModelMesher().register(item, 0, new ModelResourceLocation(Reference.MODID + ":" + item.getUnlocalizedName().substring(5), "inventory"));
	}

}
