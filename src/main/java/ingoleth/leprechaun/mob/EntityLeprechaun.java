package ingoleth.leprechaun.mob;

import net.minecraft.entity.Entity;
import net.minecraft.entity.EntityCreature;
import net.minecraft.entity.EntityLiving;
import net.minecraft.entity.EntityLivingBase;
import net.minecraft.entity.IRangedAttackMob;
import net.minecraft.entity.SharedMonsterAttributes;
import net.minecraft.entity.ai.EntityAIAttackRanged;
import net.minecraft.entity.ai.EntityAIBase;
import net.minecraft.entity.ai.EntityAILookIdle;
import net.minecraft.entity.ai.EntityAINearestAttackableTarget;
import net.minecraft.entity.ai.EntityAIWanderAvoidWater;
import net.minecraft.entity.ai.EntityAIWatchClosest;

import javax.annotation.Nonnull;
import ingoleth.leprechaun.mob.EntityLeprechaun;
import io.netty.util.internal.ThreadLocalRandom;
import net.minecraft.entity.monster.IMob;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.init.SoundEvents;
import net.minecraft.nbt.NBTTagCompound;
import net.minecraft.util.DamageSource;
import net.minecraft.util.SoundEvent;
import net.minecraft.util.math.MathHelper;
import net.minecraft.world.World;
import ingoleth.leprechaun.ModSoundEvents;

public class EntityLeprechaun extends EntityCreature implements IRangedAttackMob {
	
	private boolean throwing = false;
    private int throwCooldown = 200;
    private int random;
    private AnimationHelper throwingAnim = new AnimationHelper(50);
	
	private final EntityAIBase attackRanged = new EntityAIAttackRanged(this, 1.25D, 20, 10.0F);

	public EntityLeprechaun(World worldIn) {
		super(worldIn);
		this.setSize(0.5F, 1.3F);
		this.experienceValue = 5;
		// TODO Auto-generated constructor stub
	}
	
	 @Override
	    protected void applyEntityAttributes() {
	        super.applyEntityAttributes();
	        this.getEntityAttribute(SharedMonsterAttributes.FOLLOW_RANGE).setBaseValue(35.0D);
	        this.getEntityAttribute(SharedMonsterAttributes.MOVEMENT_SPEED).setBaseValue(0.4D);
	        this.getEntityAttribute(SharedMonsterAttributes.ARMOR).setBaseValue(2.0D);
	        this.getEntityAttribute(SharedMonsterAttributes.MAX_HEALTH).setBaseValue(50.0D);
	        this.getEntityAttribute(SharedMonsterAttributes.KNOCKBACK_RESISTANCE).setBaseValue(0.7D);
	    }

	    @Override
	    protected void initEntityAI() {
	        //this.tasks.addTask(1, new EntityAIAttackRanged(this, 1.25D, 20, 10.0F));
	        this.tasks.addTask(2, new EntityAIWanderAvoidWater(this, 1.0D, 1.0000001E-5F));
	        this.tasks.addTask(3, new EntityAIWatchClosest(this, EntityPlayer.class, 6.0F));
	        this.tasks.addTask(4, new EntityAILookIdle(this));
	        this.targetTasks.addTask(1, new EntityAINearestAttackableTarget(this, EntityLiving.class, 10, true, false, IMob.MOB_SELECTOR));
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
	    
		@Override
		protected SoundEvent getAmbientSound() {
			return ModSoundEvents.LEPRECHAUN_AMBIENT;
		}
		
	    protected SoundEvent getHurtSound(DamageSource damageSourceIn)
	    {
	        return ModSoundEvents.LEPRECHAUN_HURT;
	    }

	    protected SoundEvent getDeathSound()
	    {
	        return ModSoundEvents.LEPRECHAUN_DEATH;
	    }
		
		@Override
		protected float getSoundVolume() {
			return 0.5f;
		}
		
		
	 
	    
	public void onUpdate(){//Lift off the ground & stay there
	        this.noClip = false;
	        super.onUpdate();
	        this.noClip = false;
	        this.setNoGravity(true);
	        if (this.onGround) {
	        	this.motionY = 0.06;
	        }
	        
			
	        if (this.world.isRemote) {
	        	throwingAnim.updateTimer();
	        	if (isThrowing()) {
	        		throwingAnim.increaseTimer();
	        		}else {
	        			throwingAnim.setTimer(0);
	        		}
	        }
	        	if (this.throwCooldown == 0) {
			    	 random = ThreadLocalRandom.current().nextInt(0, 11);//Generates random number
			     } 
		
			     if ((throwCooldown == 0 && random == 10) || isThrowing()) {//If no cooldown, increase throw duration (which plays the throwing animation) and add the throw task;
			    	 
			    	 if (!isThrowing()) {
			    	 throwing = true;
			    	 }
			    	 if(tasks.taskEntries.size() == 3) {
			    		 tasks.addTask(1, attackRanged);
			    	 }
			    	 if(isSilent())
			            {
			                setSilent(false);
			            }	 
			     }
			     
			     if (throwingAnim.getTimer()>=50 && throwingAnim.getTimer() != 0) {	 //If the animation is finished, reset the counters and remove the AItasks;
			    	 throwCooldown = 200 + random*10;
			    	 throwing = false;
			     }
			     
				 if (throwCooldown != 0) {
				    	 throwCooldown--;
				     
				     if(tasks.taskEntries.size() == 4){
			             tasks.removeTask(this.attackRanged);
			         }
			         if(!isSilent()){
			             setSilent(true);
			         }
			
			         getNavigator().clearPath();
			     }
	        
			     
	     System.out.println("Cooldown: " + throwCooldown + "; Throwing Duration: " + throwingAnim.getTimer() + "; Is throwing: " + throwing);//Remove when done
     }
	
	public float getThrowProgress(float partialRenderTicks) {
		return throwingAnim.getAnimationProgressSin(partialRenderTicks);
	}
	 
	 @Override
	    public void writeEntityToNBT(NBTTagCompound compound)
	    {
	        super.writeEntityToNBT(compound);
	        compound.setInteger("throwCooldown", this.throwCooldown);
	        compound.setBoolean("throwing", this.throwing);
	    }

	    @Override
	    public void readEntityFromNBT(NBTTagCompound compound)
	    {
	        super.readEntityFromNBT(compound);
	        this.throwCooldown = compound.getInteger("throwCooldown");
	        this.throwing = compound.getBoolean("throwing");
	    }
	    

	    
	    public boolean attackEntityFrom(@Nonnull DamageSource source, float par2) {
			//Damage cap
				int cap = 5;
				return super.attackEntityFrom(source, Math.min(cap, par2));
			}
	    
	    public boolean isThrowing() {
	    	return throwing;
	    }
	    

		@Override
		public void attackEntityWithRangedAttack(EntityLivingBase target, float distanceFactor) {
			 EntityThrownGoldIngot entityThrownIngot = new EntityThrownGoldIngot(this.world, this);
		        double d0 = target.posY + (double)target.getEyeHeight() - 1.100000023841858D;
		        double d1 = target.posX - this.posX;
		        double d2 = d0 - entityThrownIngot.posY;
		        double d3 = target.posZ - this.posZ;
		        float f = MathHelper.sqrt(d1 * d1 + d3 * d3) * 0.2F;
		        entityThrownIngot.shoot(d1, d2 + (double)f, d3, 1.6F, 12.0F);
		        this.playSound(ModSoundEvents.LEPRECHAUN_THROW, 1.0F, 1.0F / (this.getRNG().nextFloat() * 0.4F + 0.8F));
		        for (int i = 0; i < 8; ++i){
		        this.world.spawnEntity(entityThrownIngot);
		        }
		}
		
		

		@Override
		public void setSwingingArms(boolean swingingArms) {
		}


	    
	    
}
