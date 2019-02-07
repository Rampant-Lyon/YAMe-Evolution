package com.sirniloc.yam.evo;

import net.minecraft.entity.EntityLivingBase;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.nbt.NBTTagCompound;
import net.minecraftforge.common.util.INBTSerializable;

public class CharacterEvo implements IEvolution, INBTSerializable<NBTTagCompound> {

	private EntityLivingBase theEntity;
	private int evolutionIndex = -1;

	public CharacterEvo(EntityLivingBase e) {
		theEntity = e;
		if(evolutionIndex<0 && !(e instanceof EntityPlayer))evolutionIndex=Evolution.getRandomRaceIndex(Evolution.EVOLUTION_COUNT);
	}
	

	@Override
	public NBTTagCompound serializeNBT() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void deserializeNBT(NBTTagCompound nbt) {
		// TODO Auto-generated method stub
		
	}

}
