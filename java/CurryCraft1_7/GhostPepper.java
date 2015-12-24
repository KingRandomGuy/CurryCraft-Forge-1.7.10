package CurryCraft1_7;

import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;
import net.minecraft.client.renderer.texture.IIconRegister;
import net.minecraft.item.ItemFood;

public class GhostPepper extends ItemFood {

	public GhostPepper(int par1, int par2, float par3, boolean par4) {
		super(par1, par2, par4);
	}
	

	@SideOnly(Side.CLIENT)
	public void registerIcons(IIconRegister par1IconRegister)
	{
		this.itemIcon = par1IconRegister.registerIcon(currycraft.modid + ":" + (this.getUnlocalizedName().substring(5)));
	}
}
