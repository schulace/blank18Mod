package com.you.modname;


import com.you.modname.init.myBlocks;
import com.you.modname.init.myItems;
import com.you.modname.proxy.CommonProxy;

import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item.ToolMaterial;
import net.minecraftforge.common.util.EnumHelper;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.Mod.EventHandler;
import net.minecraftforge.fml.common.SidedProxy;
import net.minecraftforge.fml.common.event.FMLInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPostInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPreInitializationEvent;


@Mod(modid = Reference.MODID, version = Reference.VERSION, name = Reference.NAME)
public class MainClass
{
	@Mod.Instance(Reference.MODID)
	public static MainClass instance;
	@SidedProxy(clientSide="com.you.modname.proxy.ClientProxy", serverSide="com.you.modname.proxy.ServerProxy")
	public static CommonProxy proxy;
	public static ToolMaterial toolMat = EnumHelper.addToolMaterial("newMat", 3, 100, 2, 1, 5);
	@EventHandler
	public void PreInit(FMLPreInitializationEvent event)
	{
		myBlocks.initBlocks();
		myBlocks.registerBlocks();
		myItems.initItems();
		myItems.registerItems();
	}
	@EventHandler
	public void Init (FMLInitializationEvent event)
	{
		proxy.registerRenders();
	}
	@EventHandler
	public void PostInit(FMLPostInitializationEvent event)
	{
		
	}
}