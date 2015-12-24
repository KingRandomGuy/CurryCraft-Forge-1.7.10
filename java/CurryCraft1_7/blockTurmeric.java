package CurryCraft1_7;

import java.util.Random;

import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;
import net.minecraft.block.Block;
import net.minecraft.block.BlockCrops;
import net.minecraft.client.renderer.texture.IIconRegister;
import net.minecraft.init.Items;
import net.minecraft.item.Item;
import net.minecraft.util.IIcon;
import net.minecraft.world.World;


public class blockTurmeric extends CurryBlockCrops {

	  @Override
	    public int quantityDropped(int parMetadata, int parFortune, Random parRand)
	    {
	        return (parMetadata/2);
	    }

	    @Override
	    public Item getItemDropped(int parMetadata, Random parRand, int parFortune)  
	    {
	     // DEBUG
	     //System.out.println("blockTurmeric getItemDropped()");
	        return (currycraft.itemTurmeric);
	    }
	
	@Override
    @SideOnly(Side.CLIENT)
    public void registerBlockIcons(IIconRegister parIIconRegister)
    {
          iIcon = new IIcon[maxGrowthStage+1];
          // seems that crops like to have 8 growth icons, but okay to repeat actual texture if you want
          // to make generic should loop to maxGrowthStage
          iIcon[0] = parIIconRegister.registerIcon(currycraft.modid + ":" + "turmeric_0");
          iIcon[1] = parIIconRegister.registerIcon(currycraft.modid + ":" + "turmeric_0");
          iIcon[2] = parIIconRegister.registerIcon(currycraft.modid + ":" + "turmeric_1");
          iIcon[3] = parIIconRegister.registerIcon(currycraft.modid + ":" + "turmeric_1");
          iIcon[4] = parIIconRegister.registerIcon(currycraft.modid + ":" + "turmeric_2");
          iIcon[5] = parIIconRegister.registerIcon(currycraft.modid + ":" + "turmeric_2");
          iIcon[6] = parIIconRegister.registerIcon(currycraft.modid + ":" + "turmeric_2");
          iIcon[7] = parIIconRegister.registerIcon(currycraft.modid + ":" + "turmeric_3");
    }
}

