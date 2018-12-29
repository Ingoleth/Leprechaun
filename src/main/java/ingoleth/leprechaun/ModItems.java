package ingoleth.leprechaun;

import ingoleth.leprechaun.items.ItemLeprechaunGold;
import net.minecraft.client.renderer.block.model.ModelResourceLocation;
import net.minecraft.init.Items;
import net.minecraft.item.Item;
import net.minecraftforge.client.event.ModelRegistryEvent;
import net.minecraftforge.client.model.ModelLoader;
import net.minecraftforge.event.RegistryEvent;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.eventhandler.SubscribeEvent;

@Mod.EventBusSubscriber(modid=leprechaun.MODID)
public class ModItems {
	
	public static ItemLeprechaunGold leprechaun_gold;
	
	public static void init() {
		leprechaun_gold = new ItemLeprechaunGold("leprechaun_gold");
	}
	
	@SubscribeEvent
	public static void registerItems(RegistryEvent.Register<Item> event) {
		event.getRegistry().registerAll(leprechaun_gold);
	}
	
	@SubscribeEvent
	public static void registerRenders(ModelRegistryEvent event) {
		registerRender(leprechaun_gold);
	}
	
	private static void registerRender(Item item) {
		ModelResourceLocation modelResourceLocation = new ModelResourceLocation(Items.GOLD_INGOT.getRegistryName(), "inventory");
		ModelLoader.setCustomModelResourceLocation(leprechaun_gold, 0, modelResourceLocation);
	}
	
}
