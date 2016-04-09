package com.you.modname;


import com.you.modname.init.Blocks;
import com.you.modname.init.Items;
import com.you.modname.proxy.CommonProxy;

import net.minecraft.creativetab.CreativeTabs;
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
	@EventHandler
	public void PreInit(FMLPreInitializationEvent event)
	{
		Blocks.initBlocks();
		Blocks.registerBlocks();
		Items.initItems();
		Items.registerItems();
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