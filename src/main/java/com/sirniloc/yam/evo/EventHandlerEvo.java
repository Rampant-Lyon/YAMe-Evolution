package com.sirniloc.yam.evo;

import com.draco18s.reasonablerealism.SimpleCapabilityProvider;
import com.sirniloc.yam.BaseYAM;
import com.sirniloc.yam.character.capa.CharacterYAM;
import com.sirniloc.yam.character.capa.interfaces.IAbilityScores;

import net.minecraft.entity.Entity;
import net.minecraft.entity.EntityLivingBase;
import net.minecraft.entity.item.EntityArmorStand;
import net.minecraftforge.common.capabilities.ICapabilityProvider;
import net.minecraftforge.event.AttachCapabilitiesEvent;
import net.minecraftforge.fml.common.eventhandler.SubscribeEvent;

public class EventHandlerEvo {
	@SubscribeEvent
	public void onAttachCapabilityEntity(AttachCapabilitiesEvent<Entity> event) {
		if(event.getObject() instanceof EntityLivingBase && !(event.getObject() instanceof EntityArmorStand)) {
			
			final IEvolution evoCap = new CharacterEvo((EntityLivingBase) event.getObject());
			event.addCapability(BaseEvo.EVO_ID, createProvider(evoCap));
		}			
	}
	
	public static ICapabilityProvider createProvider(IEvolution evoCap) {
		return new SimpleCapabilityProvider<IEvolution>(BaseEvo.EVO_ID, null, evoCap);
	}
}
