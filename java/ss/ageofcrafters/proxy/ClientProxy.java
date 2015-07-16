package ss.ageofcrafters.proxy;

import net.minecraft.client.model.ModelBiped;
import net.minecraftforge.client.MinecraftForgeClient;
import ss.ageofcrafters.blocks.tileentities.TileEntityAlloyingTable;
import ss.ageofcrafters.blocks.tileentities.TileEntityAltar;
import ss.ageofcrafters.blocks.tileentities.TileEntityAmphora;
import ss.ageofcrafters.blocks.tileentities.TileEntityCrater;
import ss.ageofcrafters.blocks.tileentities.TileEntityGoblet;
import ss.ageofcrafters.blocks.tileentities.TileEntityWineGoblet;
import ss.ageofcrafters.main.AgeOfCraftersTools;
import ss.ageofcrafters.render.RenderAlloyingTable;
import ss.ageofcrafters.render.RenderAltar;
import ss.ageofcrafters.render.RenderAmphora;
import ss.ageofcrafters.render.RenderCrater;
import ss.ageofcrafters.render.RenderGoblet;
import ss.ageofcrafters.render.RenderHopliteSpear;
import ss.ageofcrafters.render.RenderWineGoblet;
import ss.ageofcrafters.units.EntityBowman;
import ss.ageofcrafters.units.EntityClubman;
import ss.ageofcrafters.units.EntityWarrior;
import ss.ageofcrafters.units.render.RenderBowman;
import ss.ageofcrafters.units.render.RenderClubman;
import ss.ageofcrafters.units.render.RenderWarrior;
import cpw.mods.fml.client.registry.ClientRegistry;
import cpw.mods.fml.client.registry.RenderingRegistry;
import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;

public class ClientProxy extends CommonProxy {

	
	@SideOnly(Side.CLIENT)
	public void registerRenderers(){
	
		ClientRegistry.bindTileEntitySpecialRenderer(TileEntityAlloyingTable.class, new RenderAlloyingTable());
		ClientRegistry.bindTileEntitySpecialRenderer(TileEntityGoblet.class, new RenderGoblet());
		ClientRegistry.bindTileEntitySpecialRenderer(TileEntityWineGoblet.class, new RenderWineGoblet());
		ClientRegistry.bindTileEntitySpecialRenderer(TileEntityAltar.class, new RenderAltar());
		ClientRegistry.bindTileEntitySpecialRenderer(TileEntityAmphora.class, new RenderAmphora());
		ClientRegistry.bindTileEntitySpecialRenderer(TileEntityCrater.class, new RenderCrater());
		
	}
	
	public void registerEntityRenderers(){
		RenderingRegistry.registerEntityRenderingHandler(EntityClubman.class, new RenderClubman(new ModelBiped(), 0.6F));
		RenderingRegistry.registerEntityRenderingHandler(EntityBowman.class, new RenderBowman(new ModelBiped(), 0.6F));
		RenderingRegistry.registerEntityRenderingHandler(EntityWarrior.class, new RenderWarrior(new ModelBiped(), 0.6F));

	}
	public void bindItemRenderers(){
		MinecraftForgeClient.registerItemRenderer(AgeOfCraftersTools.HopliteSpear, new RenderHopliteSpear());
	}
}
