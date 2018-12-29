package ingoleth.leprechaun.ai;
import ingoleth.leprechaun.mob.EntityLeprechaun;
import net.minecraft.entity.ai.EntityAIBase;

public class EntityAICauldronSwing extends EntityAIBase {

	protected boolean isAIEnabled(){
		return true;
	}
	
	private final EntityLeprechaun theEntity;

	public EntityAICauldronSwing(EntityLeprechaun par1Entity)
	{
	   theEntity = par1Entity;
	   setMutexBits(1);

	}

	@Override
	public boolean shouldExecute() {
		// TODO Auto-generated method stub
		return false;
	}

}