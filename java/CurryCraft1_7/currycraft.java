package CurryCraft1_7;

import net.minecraft.block.Block;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.init.Blocks;
import net.minecraft.init.Items;
import net.minecraft.item.Item;
import net.minecraft.item.ItemFood;
import net.minecraft.item.ItemSeedFood;
import net.minecraft.item.ItemSeeds;
import net.minecraft.item.ItemStack;
import net.minecraft.potion.Potion;
import net.minecraftforge.common.MinecraftForge;
import net.minecraftforge.oredict.OreDictionary;
import cpw.mods.fml.common.Mod;
import cpw.mods.fml.common.Mod.EventHandler;
import cpw.mods.fml.common.event.FMLPreInitializationEvent;
import cpw.mods.fml.common.registry.GameRegistry;
import cpw.mods.fml.common.registry.LanguageRegistry;

@Mod(modid = currycraft.modid, name = "CurryCraft", version = "alpha")

public class currycraft {
	public static final String modid = "kingrandomguy_currycraft";
	public static CreativeTabs currycraft;
	public static Block turmericBlock;
	public static Item itemTurmeric;
	public static Item itemPineapple;
	public static Item itemPineappleSeed;
	public static Block pineappleBlock;
	public static Item itemKnife;
	public static Item uncookedNoodles;
	public static Item wetNoodles;
	public static Item masalaPowder;
	public static Item curryFood;
	public static Item redPineapple;
	public static Item slicedPotato;
	public static Item chips;
	public static Item chipsMasala;
	public static Block ghostPepperBlock;
	public static Item ghostPepperSeeds;
	public static Item ghostPepper;
	public static ItemStack knife;
	@EventHandler
	public void preInit(FMLPreInitializationEvent e)
	{
		//Basic Setup
		knife = new ItemStack(itemKnife, 1, OreDictionary.WILDCARD_VALUE);
		currycraft = new CreativeTabsCurryCraft(CreativeTabs.getNextID(), "CurryCraft");
		pineappleBlock = new blockPineapple().setBlockName("Pineapple Block").setBlockTextureName(modid + ":" + "pineapple");
		turmericBlock = new blockTurmeric().setBlockName("Turmeric Block").setBlockTextureName(modid + ":" + "turmeric");
		itemTurmeric = new ItemSeedFood(1, 1F, turmericBlock, Blocks.farmland).setUnlocalizedName("turmeric").setTextureName(modid + ":" + "turmeric").setCreativeTab(currycraft);
		itemPineapple = new ItemFood(10, false).setUnlocalizedName("pineapple").setTextureName(modid + ":" + "pineapple").setCreativeTab(currycraft);
		itemPineappleSeed = new ItemSeeds(pineappleBlock, Blocks.farmland).setUnlocalizedName("pineappleSeed").setTextureName(modid + ":" + "pineappleSeed").setCreativeTab(currycraft);
		itemKnife = new ItemKnife().setUnlocalizedName("itemKnife").setTextureName(modid + ":" + "itemKnife").setCreativeTab(currycraft);;
		uncookedNoodles = new Item().setUnlocalizedName("uncookedNoodles").setTextureName(modid + ":" + "noodles").setCreativeTab(currycraft);;
		wetNoodles = new Item().setUnlocalizedName("wetNoodles").setTextureName(modid + ":" + "wetNoodles").setCreativeTab(currycraft);
		masalaPowder = new Item().setUnlocalizedName("masalaPowder").setTextureName(modid + ":" + "turmericPowder").setCreativeTab(currycraft);
		curryFood  = new CurryFood(10, 12, 2f, false).setPotionEffect(Potion.moveSpeed.id, 30, 0, 100).setTextureName(modid + ":" +"curryFood").setCreativeTab(currycraft).setUnlocalizedName("curryFood");
		redPineapple = new RedPineapple(2277, 20, 5F, false).setAlwaysEdible().setCreativeTab(currycraft).setUnlocalizedName("redPineapple");
		slicedPotato = new Item().setUnlocalizedName("slicedPotato").setTextureName(modid + ":" + "slicedPotato").setCreativeTab(currycraft);
		chips = new ItemFood(3, true).setUnlocalizedName("chips").setTextureName(modid + ":" + "chips").setCreativeTab(currycraft);
		chipsMasala = new ChipsMasala(10, 12, 3F, false).setPotionEffect(Potion.field_76444_x.id, 300, 2, 100).setUnlocalizedName("chipsMasala").setTextureName(modid + ":" + "chipsMasala").setCreativeTab(currycraft);
		ghostPepperBlock = new ghostPepperBlock().setBlockName("Ghost Pepper Block").setBlockTextureName(modid + ":" + "ghostPepper");
		ghostPepper = new GhostPepper(5, 5, 2f, false).setPotionEffect(Potion.moveSpeed.id, 60, 4, 100).setCreativeTab(currycraft).setUnlocalizedName("ghostPepper");
		ghostPepperSeeds = new ItemSeeds(ghostPepperBlock, Blocks.farmland).setUnlocalizedName("ghostPepperSeeds").setCreativeTab(currycraft).setTextureName(modid + ":" +  "ghostPepperSeeds");
		
		//Game Registry
		GameRegistry.registerItem(itemTurmeric, itemTurmeric.getUnlocalizedName().substring(5));
		GameRegistry.registerBlock(turmericBlock, turmericBlock.getUnlocalizedName().substring(5));
		GameRegistry.registerBlock(pineappleBlock, pineappleBlock.getUnlocalizedName().substring(5));
		GameRegistry.registerItem(itemPineapple, itemPineapple.getUnlocalizedName().substring(5));
		GameRegistry.registerItem(itemPineappleSeed, itemPineappleSeed.getUnlocalizedName().substring(5));
		GameRegistry.registerItem(itemKnife,  itemKnife.getUnlocalizedName().substring(5));
		GameRegistry.registerItem(uncookedNoodles,  uncookedNoodles.getUnlocalizedName().substring(5));
		GameRegistry.registerItem(wetNoodles,  wetNoodles.getUnlocalizedName().substring(5));
		GameRegistry.registerItem(masalaPowder,  masalaPowder.getUnlocalizedName().substring(5));
		GameRegistry.registerItem(curryFood, curryFood.getUnlocalizedName().substring(5));
		GameRegistry.registerItem(redPineapple, redPineapple.getUnlocalizedName().substring(5));
		GameRegistry.registerItem(slicedPotato, slicedPotato.getUnlocalizedName().substring(5));
		GameRegistry.registerItem(chips, chips.getUnlocalizedName().substring(5));
		GameRegistry.registerItem(chipsMasala, chipsMasala.getUnlocalizedName().substring(5));
		GameRegistry.registerBlock(ghostPepperBlock, ghostPepperBlock.getUnlocalizedName().substring(5));
		GameRegistry.registerItem(ghostPepper, ghostPepper.getUnlocalizedName().substring(5));
		GameRegistry.registerItem(ghostPepperSeeds, ghostPepperSeeds.getUnlocalizedName().substring(5));
		//Recipes
		GameRegistry.addShapelessRecipe(new ItemStack(itemPineappleSeed, 2), new ItemStack(itemKnife, 1, OreDictionary.WILDCARD_VALUE), itemPineapple);
		GameRegistry.addShapelessRecipe(new ItemStack(masalaPowder, 2), new ItemStack(itemKnife, 1, OreDictionary.WILDCARD_VALUE), new ItemStack(itemTurmeric));
		GameRegistry.addRecipe(new ItemStack(itemKnife),new Object[]{"   "," x "," z ", 'x', Blocks.cobblestone, 'z', Items.stick});
		GameRegistry.addRecipe(new ItemStack(uncookedNoodles),new Object[]{" x "," x "," x ",'x',Items.wheat});
		GameRegistry.addRecipe(new ItemStack(wetNoodles),new Object[]{"   ","xzc"," v ", 'x', masalaPowder, 'z', uncookedNoodles, 'c', Items.water_bucket,'v',Items.bowl});
		GameRegistry.addSmelting(wetNoodles, new ItemStack(curryFood), 1F);
		GameRegistry.addRecipe(new ItemStack(redPineapple, 1, 1), new Object[]{"xxx","xzx","xxx",'x', Blocks.redstone_block,'z',itemPineapple});
		GameRegistry.addRecipe(new ItemStack(redPineapple, 1, 0), new Object[]{"xxx","xzx","xxx",'x', Items.redstone,'z',itemPineapple});
		GameRegistry.addSmelting(slicedPotato, new ItemStack(chips), 1F);
		GameRegistry.addShapelessRecipe(new ItemStack(slicedPotato, 3), new ItemStack(itemKnife, 1, OreDictionary.WILDCARD_VALUE), new ItemStack(Items.potato));
		GameRegistry.addRecipe(new ItemStack(chipsMasala), new Object[]{" x ", " z ", " c ", 'x', masalaPowder, 'z', chips, 'c', Items.bowl});
		GameRegistry.addShapelessRecipe(new ItemStack(ghostPepperSeeds, 2),new ItemStack(ghostPepper), new ItemStack(itemKnife, 1, OreDictionary.WILDCARD_VALUE));
		//Language Registry
		LanguageRegistry.addName(itemPineapple, "Pineapple");
		LanguageRegistry.addName(itemPineappleSeed, "Pineapple Seeds");
		LanguageRegistry.addName(itemTurmeric, "Turmeric Root");
		LanguageRegistry.addName(uncookedNoodles, "Uncooked dry noodles");
		LanguageRegistry.addName(wetNoodles, "Uncooked wet noodles");
		LanguageRegistry.addName(masalaPowder, "Masala Powder");
		LanguageRegistry.addName(itemKnife, "Kitchen Knife");
		LanguageRegistry.addName(curryFood, "Masala Noodles");
		LanguageRegistry.addName(redPineapple, "Red Pineapple");
		LanguageRegistry.addName(slicedPotato, "Sliced Potatoes");
		LanguageRegistry.addName(chips, "Potato Chips");
		LanguageRegistry.addName(chipsMasala, "Masala Chips");
		LanguageRegistry.addName(ghostPepper, "Ghost Pepper");
		LanguageRegistry.addName(ghostPepperSeeds, "Ghost Pepper Seeds");
		//Event Registry
		MinecraftForge.EVENT_BUS.register(new CurryCraftEventHandler());
	}
}
