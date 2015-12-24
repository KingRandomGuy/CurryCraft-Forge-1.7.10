package CurryCraft1_7;

import cpw.mods.fml.common.eventhandler.EventPriority;
import cpw.mods.fml.common.eventhandler.SubscribeEvent;
import net.minecraft.entity.item.EntityItem;
import net.minecraft.entity.monster.EntityZombie;
import net.minecraft.entity.passive.EntitySheep;
import net.minecraft.init.Items;
import net.minecraft.item.ItemStack;
import net.minecraftforge.event.entity.living.LivingDropsEvent;

public class CurryCraftEventHandler {
	double rand(double min, double max)
	{
	   double range = Math.abs(max - min);     
	   return (Math.random() * range) + (min <= max ? min : max);
	}
	@SubscribeEvent(priority=EventPriority.NORMAL, receiveCanceled=true)
	public void onEvent(LivingDropsEvent event)
	{
	    if (event.entity instanceof EntityZombie)
	    {
	    	
	        
	        if(rand(0, 100)<2){
	        ItemStack itemStackToDrop = new ItemStack(currycraft.itemTurmeric, 1);
	        event.drops.add(new EntityItem(event.entity.worldObj, event.entity.posX, 
	              event.entity.posY, event.entity.posZ, itemStackToDrop));
	        //debug
	        //System.out.println("Turmeric Dropped");
	        }
	        if(rand(0, 100)<1){
		        ItemStack itemStackToDrop = new ItemStack(currycraft.itemPineappleSeed, 1);
		        event.drops.add(new EntityItem(event.entity.worldObj, event.entity.posX, 
		              event.entity.posY, event.entity.posZ, itemStackToDrop));
		    //debug
		    //System.out.println("Pineapple Dropped");
	        }
	        if(rand(0, 100)<.5){
		        ItemStack itemStackToDrop = new ItemStack(currycraft.ghostPepperSeeds, 1);
		        event.drops.add(new EntityItem(event.entity.worldObj, event.entity.posX, 
		              event.entity.posY, event.entity.posZ, itemStackToDrop));
		    //debug
		    //System.out.println("Ghost Pepper Dropped");
	        }
	}
}
}