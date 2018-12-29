package ingoleth.leprechaun;


import ingoleth.leprechaun.mob.EntityLeprechaun;
import ingoleth.leprechaun.mob.EntityThrownGoldIngot;
import ingoleth.leprechaun.mob.RenderLeprechaun;
import net.minecraft.util.ResourceLocation;
import net.minecraftforge.fml.client.registry.RenderingRegistry;
import net.minecraftforge.fml.common.registry.EntityRegistry;
import net.minecraftforge.fml.relauncher.Side;
import net.minecraftforge.fml.relauncher.SideOnly;

public class ModEntities {

    public static void init() {
        int id = 1;

        EntityRegistry.registerModEntity(new ResourceLocation(leprechaun.MODID, "leprechaun_mob"), EntityLeprechaun.class, "leprechaun", id++, leprechaun.instance, 64, 3, false, 0x1f6337, 0xe0c112);
        EntityRegistry.registerModEntity(new ResourceLocation(leprechaun.MODID, "thrown_ingot"), EntityThrownGoldIngot.class, "thrown_ingot", id++, leprechaun.instance, 64, 1, true);
    }

    @SideOnly(Side.CLIENT)
    public static void initModels() {
        RenderingRegistry.registerEntityRenderingHandler(EntityLeprechaun.class, RenderLeprechaun.FACTORY);
    }
}