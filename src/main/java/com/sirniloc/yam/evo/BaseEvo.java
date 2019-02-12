package com.sirniloc.yam.evo;

import net.minecraft.util.ResourceLocation;
import net.minecraftforge.common.capabilities.Capability;
import net.minecraftforge.common.capabilities.CapabilityInject;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.Mod.EventHandler;
import net.minecraftforge.fml.common.event.FMLInitializationEvent;

@Mod(modid = BaseEvo.MODID, version = BaseEvo.VERSION)
public class BaseEvo
{
    public static final String MODID = "yam.evo";
    public static final String VERSION = "0.1";
    
    
    @CapabilityInject(IEvolution.class)
	public static Capability<IEvolution> EVO_CAP = null;	
	
	public static final ResourceLocation EVO_ID = new ResourceLocation(BaseEvo.MODID, "CAPABILITY_EVO");
    
    @EventHandler
    public void preInit(FMLInitializationEvent event)    {
    	
    }
    
    @EventHandler
    public void init(FMLInitializationEvent event)
    {
    }
    @EventHandler
    public void postInit(FMLInitializationEvent event)    {
    }
    
}
