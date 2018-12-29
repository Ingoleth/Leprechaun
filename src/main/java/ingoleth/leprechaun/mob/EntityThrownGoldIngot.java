package ingoleth.leprechaun.mob;

import ingoleth.leprechaun.ModItems;
import net.minecraft.entity.EntityLivingBase;
import net.minecraft.entity.projectile.EntityThrowable;
import net.minecraft.item.Item;
import net.minecraft.util.DamageSource;
import net.minecraft.util.EnumParticleTypes;
import net.minecraft.util.datafix.DataFixer;
import net.minecraft.util.math.RayTraceResult;
import net.minecraft.world.World;
import net.minecraftforge.fml.relauncher.Side;
import net.minecraftforge.fml.relauncher.SideOnly;	

public class EntityThrownGoldIngot extends EntityThrowable{
	    public EntityThrownGoldIngot(World worldIn){
	        super(worldIn);
	    }

	    public EntityThrownGoldIngot(World worldIn, EntityLivingBase throwerIn){
	        super(worldIn, throwerIn);
	    }

	    public EntityThrownGoldIngot(World worldIn, double x, double y, double z){
	        super(worldIn, x, y, z);
	    }

	    public static void registerFixesThrownIngot(DataFixer fixer){
	        EntityThrowable.registerFixesThrowable(fixer, "ThrownIngot");
	    }

	    @SideOnly(Side.CLIENT)
	    public void handleStatusUpdate(byte id){
	        if (id == 3){
	            for (int i = 0; i < 8; ++i){
	                this.world.spawnParticle(EnumParticleTypes.ITEM_CRACK, posX, posY, posZ, Math.random() * 0.2 - 0.1, Math.random() * 0.25, Math.random() * 0.2 - 0.1, Item.getIdFromItem(ModItems.leprechaun_gold));
	            }
	        }
	    }

	    /**
	     * Called when this EntityThrowable hits a block or entity.
	     */
	    protected void onImpact(RayTraceResult result)
	    {
	        if (result.entityHit != null)
	        {

	            result.entityHit.attackEntityFrom(DamageSource.causeThrownDamage(this, this.getThrower()), 5.0F);
	        }

	        if (!this.world.isRemote)
	        {
	            this.world.setEntityState(this, (byte)3);
	            this.setDead();
	        }
	    }
	}