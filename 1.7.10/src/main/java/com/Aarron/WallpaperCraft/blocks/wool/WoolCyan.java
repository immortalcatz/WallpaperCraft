package com.Aarron.WallpaperCraft.blocks.wool;

import java.util.List;

import com.Aarron.WallpaperCraft.Main;
import com.Aarron.WallpaperCraft.creativeTab.Tab;

import net.minecraft.block.material.Material;
import net.minecraft.client.renderer.texture.IIconRegister;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.util.IIcon;
import net.minecraft.block.Block;

public class WoolCyan extends Block {

public IIcon[] icons = new IIcon[10];

	public WoolCyan(String unlocalizedName, Material material) {
		super(material);
		this.setBlockName("WoolCyan");
		this.setHardness(0.4F);
		this.setResistance(6.0F);
		this.setHarvestLevel("pickaxe", 0);
		this.setStepSound(soundTypeCloth);
		this.setCreativeTab(Tab.WPtab);
	}

	@Override //Sets how many variations there are
	public IIcon getIcon(int side, int meta) {
		if (meta > 11)
			meta = 0;
		return this.icons[meta];

	}

	@Override //Registers the textures for each block. This is where I set the texture name.
	public void registerBlockIcons(IIconRegister reg) {
		for (int i = 0; i < 10; i ++) {
			this.icons[i] = reg.registerIcon("wp:WoolCyan-" + i);
		}
}

	@Override //Makes it so that the block dropped has a meta value equal to the block broken
	public int damageDropped(int meta) {
		return meta;
}

	@Override //Tells Minecraft to assign a creative tab for each meta value of the block
	public void getSubBlocks(Item item, CreativeTabs tab, List list) {
		for (int i = 0; i < 10; i ++) {
			list.add(new ItemStack(item, 1, i));
		}
} 
}