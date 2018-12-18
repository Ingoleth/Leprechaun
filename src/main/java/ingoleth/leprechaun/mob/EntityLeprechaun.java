package ingoleth.leprechaun.mob;

import net.minecraft.entity.Entity;
import net.minecraft.entity.EntityCreature;
import net.minecraft.entity.EntityLiving;
import net.minecraft.entity.EntityLivingBase;
import net.minecraft.entity.SharedMonsterAttributes;
import net.minecraft.entity.ai.EntityAIAttackMelee;
import net.minecraft.entity.ai.EntityAILookIdle;
import net.minecraft.entity.ai.EntityAINearestAttackableTarget;
import net.minecraft.entity.ai.EntityAISwimming;
import net.minecraft.entity.ai.EntityAIWander;
import net.minecraft.entity.ai.EntityAIWatchClosest;
import net.minecraft.entity.ai.EntityMoveHelper;

import javax.annotation.Nonnull;

import ingoleth.leprechaun.mob.EntityLeprechaun;
import net.minecraft.entity.monster.IMob;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.init.SoundEvents;
import net.minecraft.util.DamageSource;
import net.minecraft.util.EnumParticleTypes;
import net.minecraft.util.math.MathHelper;
import net.minecraft.world.World;

public class EntityLeprechaun extends EntityCreature {

	public EntityLeprechaun(World worldIn) {
		super(worldIn);
		this.setSize(0.5F, 1.3F);
		this.experienceValue = 5;
		// TODO Auto-generated constructor stub
	}
	
	 @Override
	    protected void applyEntityAttributes() {
	        super.applyEntityAttributes();
	        // Here we set various attributes for our mob. Like maximum health, armor, speed, ...
	        this.getEntityAttribute(SharedMonsterAttributes.FOLLOW_RANGE).setBaseValue(35.0D);
	        this.getEntityAttribute(SharedMonsterAttributes.MOVEMENT_SPEED).setBaseValue(0.4D);
	        this.getEntityAttribute(SharedMonsterAttributes.ARMOR).setBaseValue(2.0D);
	        this.getEntityAttribute(SharedMonsterAttributes.MAX_HEALTH).setBaseValue(50.0D);
	    }

	    @Override
	    protected void initEntityAI() {
	        this.tasks.addTask(0, new EntityAISwimming(this));
	        this.tasks.addTask(2, new EntityAIAttackMelee(this, 1.0D, false));
	        this.tasks.addTask(7, new EntityAIWander(this, 1.0D));
	        this.tasks.addTask(1, new EntityAIWatchClosest(this, EntityPlayer.class, 8.0F));
	        this.tasks.addTask(8, new EntityAILookIdle(this));
	        this.targetTasks.addTask(3, new EntityAINearestAttackableTarget<>(this, EntityLiving.class, 4, false, true,
	                entity -> entity != null && IMob.VISIBLE_MOB_SELECTOR.apply(entity)));
	    }
	    
	    @Override
	    public float getEyeHeight() {
	        return 0.75F;
	    }
	    
	    @Override
	    public boolean attackEntityAsMob(Entity entityIn) {
	        this.playSound(SoundEvents.ENTITY_PLAYER_ATTACK_STRONG, 1.0F, 1.0F);
	        return entityIn.attackEntityFrom(DamageSource.causeMobDamage(this), (float)(7 + this.rand.nextInt(15)));
	    }
	    
	    @Override
		public void fall(float distance, float damageMultiplier) {
		}
	    
	 
	    
	    public void onUpdate()
	    {//Lift off the ground & stay there
	        this.noClip = false;
	        super.onUpdate();
	        this.noClip = false;
	        this.setNoGravity(true);
	        if (this.onGround) {
	        	this.motionY = 0.06;
	        }

	    }
	    
	    public boolean attackEntityFrom(@Nonnull DamageSource source, float par2) {
			//Damage cap
				int cap = 5;
				return super.attackEntityFrom(source, Math.min(cap, par2));
			}


	    
	    
}
