package CurryCraft1_7;

import net.minecraft.creativetab.CreativeTabs;

import net.minecraft.item.Item;
import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;

public class CreativeTabsCurryCraft extends CreativeTabs {

	public CreativeTabsCurryCraft(int par1, String tabLabel)
	{
	super ("CurryCraft");
	}

	@Override
	@SideOnly(Side.CLIENT)
	public Item getTabIconItem()
	{
	return currycraft.curryFood;
	}
	
	public String getTranslatedTabLabel()
	{
		return "CurryCraft";
	}
}
