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
		if(evolutionIndex<0 && !(e instanceof EntityPlayer))evolutionIndex=Evolution.getRandomIndex(Evolution.EVOLUTION_COUNT);
	}
	

	@Override
	public NBTTagCompound serializeNBT() {
		return (NBTTagCompound) NBTHelper.writeNBT(null, this, null);
		
	}
	@Override
	public void deserializeNBT(NBTTagCompound nbt) {

		NBTHelper.readNBT(null, this, null, nbt);
	
		
	}


	@Override
	public void setMind(int integer) {
		// TODO Auto-generated method stub
		
	}


	@Override
	public void setBody(int integer) {
		// TODO Auto-generated method stub
		
	}


	@Override
	public void setSpirit(int integer) {
		// TODO Auto-generated method stub
		
	}


	@Override
	public void setRaceInt(int integer) {
		// TODO Auto-generated method stub
		
	}


	@Override
	public int getMind() {
		// TODO Auto-generated method stub
		return 0;
	}


	@Override
	public int getBody() {
		// TODO Auto-generated method stub
		return 0;
	}


	@Override
	public int getSpirit() {
		// TODO Auto-generated method stub
		return 0;
	}


	@Override
	public int getRaceInt() {
		// TODO Auto-generated method stub
		return 0;
	}

}
