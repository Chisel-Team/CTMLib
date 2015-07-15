package com.cricketcraft.ctmlib;

import net.minecraft.world.IBlockAccess;

public interface ICTMBlock {

	/**
	 * Gets the {@link ISubmapManager} for this block in the world.
	 */
	ISubmapManager getManager(IBlockAccess world, int x, int y, int z, int meta);

	/**
	 * Gets the {@link ISubmapManager} for this block in item form.
	 * 
	 * @param meta
	 *            The meta (damage) of the stack.
	 */
	ISubmapManager getManager(int meta);

}
