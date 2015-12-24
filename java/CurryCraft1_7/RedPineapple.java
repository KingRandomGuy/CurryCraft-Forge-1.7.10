package CurryCraft1_7;

import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;

import java.util.List;

import net.minecraft.block.Block;
import net.minecraft.client.renderer.texture.IIconRegister;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.EnumRarity;
import net.minecraft.item.ItemFood;
import net.minecraft.item.ItemStack;
import net.minecraft.potion.Potion;
import net.minecraft.potion.PotionEffect;
import net.minecraft.world.World;

	public class RedPineapple extends ItemFood
	{
	    public RedPineapple(int par1, int par2, float par3, boolean par4)
	    {
	        super(par1, par2, par4);
	        this.setHasSubtypes(true);
	    }

	    @SideOnly(Side.CLIENT)
	    public boolean hasEffect(ItemStack par1ItemStack)
	    {
	        return par1ItemStack.getItemDamage() > 0;
	    }

	    @SideOnly(Side.CLIENT)
	    
	    
	    /**
	     * Return an item rarity from EnumRarity
	     */
	    public EnumRarity getRarity(ItemStack par1ItemStack)
	    {
	        return par1ItemStack.getItemDamage() == 0 ? EnumRarity.rare : EnumRarity.epic;
	    }

	    protected void onFoodEaten(ItemStack par1ItemStack, World par2World, EntityPlayer par3EntityPlayer)
	    {
	        if (!par2World.isRemote)
	        {
	            par3EntityPlayer.addPotionEffect(new PotionEffect(Potion.field_76444_x.id, 2400, 0));
	        }

	        if (par1ItemStack.getItemDamage() > 0)
	        {
	            if (!par2World.isRemote)
	            {
	                par3EntityPlayer.addPotionEffect(new PotionEffect(Potion.regeneration.id, 600, 4));
	                par3EntityPlayer.addPotionEffect(new PotionEffect(Potion.damageBoost.id, 1200, 2));
	            }
	        }
	        else
	        {
	            super.onFoodEaten(par1ItemStack, par2World, par3EntityPlayer);
	        }
	    }
	    @SideOnly(Side.CLIENT)
	    public void getSubItems(net.minecraft.item.Item p_150895_1_, CreativeTabs p_150895_2_, List p_150895_3_)
	    {
	        p_150895_3_.add(new ItemStack(p_150895_1_, 1, 0));
	        p_150895_3_.add(new ItemStack(p_150895_1_, 1, 1));
	    }

	    @SideOnly(Side.CLIENT)
		public void registerIcons(IIconRegister par1IconRegister)
		{
			this.itemIcon = par1IconRegister.registerIcon(currycraft.modid + ":" + (this.getUnlocalizedName().substring(5)));
		}
	}

	

