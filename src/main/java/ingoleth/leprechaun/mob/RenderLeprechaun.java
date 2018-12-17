package ingoleth.leprechaun.mob;

import net.minecraft.client.renderer.entity.Render;
import net.minecraft.client.renderer.entity.RenderLiving;
import net.minecraft.client.renderer.entity.RenderManager;
import net.minecraft.util.ResourceLocation;
import net.minecraftforge.fml.client.registry.IRenderFactory;
import net.minecraftforge.fml.relauncher.Side;
import net.minecraftforge.fml.relauncher.SideOnly;

@SideOnly(Side.CLIENT)
public class RenderLeprechaun extends RenderLiving<EntityLeprechaun> {

    private ResourceLocation mobTexture = new ResourceLocation("leprechaun:textures/entity/leprechaun.png");

    public RenderLeprechaun(RenderManager renderManagerIn) {
        super(renderManagerIn, new ModelLeprechaun(), 0.5F);
    }


    @Override
    protected ResourceLocation getEntityTexture(EntityLeprechaun entity) {
        return mobTexture;
    }

    public static final RenderLeprechaun.Factory FACTORY = new RenderLeprechaun.Factory();

    public static class Factory implements IRenderFactory<EntityLeprechaun> {

        @Override
        public Render<? super EntityLeprechaun> createRenderFor(RenderManager manager) {
            return new RenderLeprechaun(manager);
        }

    }

}