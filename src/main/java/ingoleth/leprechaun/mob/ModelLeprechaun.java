package ingoleth.leprechaun.mob;

import net.minecraft.client.model.ModelBase;
import net.minecraft.client.model.ModelRenderer;
import net.minecraft.entity.Entity;
import net.minecraft.entity.EntityLivingBase;
import net.minecraft.util.math.MathHelper;
import net.minecraftforge.fml.relauncher.Side;
import net.minecraftforge.fml.relauncher.SideOnly;

/**
 * Leprechaun - Ingoleth
 * Created using Tabula 5.1.0
 */

@SideOnly(Side.CLIENT)
public class ModelLeprechaun extends ModelBase {
    public ModelRenderer body;
    public ModelRenderer head;
    public ModelRenderer armRight;
    public ModelRenderer armLeft;
    public ModelRenderer legLeft1;
    public ModelRenderer legRight1;
    public ModelRenderer chestCoin;
    public ModelRenderer tailLeft;
    public ModelRenderer tailRight1;
    public ModelRenderer hat2;
    public ModelRenderer hat1;
    public ModelRenderer hatWing;
    public ModelRenderer beardFront;
    public ModelRenderer hatCoin;
    public ModelRenderer beardCheekRight;
    public ModelRenderer beardCheekLeft;
    public ModelRenderer earLeft1;
    public ModelRenderer earLeft;
    public ModelRenderer Cuboid6;
    public ModelRenderer earLeft2;
    public ModelRenderer earLeft_1;
    public ModelRenderer cauldronHandle;
    public ModelRenderer cauldronLid;
    public ModelRenderer cauldronBody;
    public ModelRenderer cauldronNeck;
    public ModelRenderer cauldronBottom;
    public ModelRenderer legLeft2;
    public ModelRenderer shoeLeft;
    public ModelRenderer shoeLeft2;
    public ModelRenderer shoeLeft3;
    public ModelRenderer legRight2;
    public ModelRenderer shoeRight1;
    public ModelRenderer soeRight2;
    public ModelRenderer shoeRight3;
    public ModelRenderer tailLeft2;
    public ModelRenderer tailRight2;
    	    
    protected float degToRad(float degrees){
    	        return degrees * (float)Math.PI / 180 ;
    	    }
    	    
    public ModelLeprechaun() {
        this.textureWidth = 64;
        this.textureHeight = 64;
        this.tailLeft = new ModelRenderer(this, 7, 43);
        this.tailLeft.setRotationPoint(0.0F, 5.0F, 1.5F);
        this.tailLeft.addBox(-2.0F, 0.0F, 0.0F, 2, 1, 1, 0.0F);
        this.setRotateAngle(tailLeft, -0.5235987755982988F, -0.08726646259971647F, 0.17453292519943295F);
        this.hat1 = new ModelRenderer(this, 33, 17);
        this.hat1.setRotationPoint(0.0F, -2.0F, 0.0F);
        this.hat1.addBox(-2.5F, -5.0F, -2.5F, 5, 3, 5, 0.0F);
        this.head = new ModelRenderer(this, 6, 6);
        this.head.setRotationPoint(0.0F, 0.0F, 0.0F);
        this.head.addBox(-2.5F, -4.0F, -2.5F, 5, 4, 5, 0.0F);
        this.shoeRight3 = new ModelRenderer(this, 18, 40);
        this.shoeRight3.setRotationPoint(0.5F, -1.0F, 0.0F);
        this.shoeRight3.addBox(0.0F, -1.0F, 0.0F, 1, 1, 1, 0.0F);
        this.setRotateAngle(shoeRight3, -0.6981317007977318F, 0.0F, 0.0F);
        this.beardCheekLeft = new ModelRenderer(this, 26, 33);
        this.beardCheekLeft.mirror = true;
        this.beardCheekLeft.setRotationPoint(-2.5F, -1.0F, -2.0F);
        this.beardCheekLeft.addBox(0.0F, 0.0F, 0.0F, 0, 2, 4, 0.0F);
        this.setRotateAngle(beardCheekLeft, 0.17453292519943295F, -0.12217304763960307F, 0.3490658503988659F);
        this.shoeRight1 = new ModelRenderer(this, 7, 38);
        this.shoeRight1.setRotationPoint(0.0F, 0.5000002980232239F, 0.0F);
        this.shoeRight1.addBox(-1.0F, 0.0F, -3.0F, 2, 1, 3, 0.0F);
        this.setRotateAngle(shoeRight1, 0.5235987755982988F, -0.5235987755982988F, 0.0F);
        this.tailLeft2 = new ModelRenderer(this, 14, 43);
        this.tailLeft2.setRotationPoint(0.0F, 0.0F, 1.0F);
        this.tailLeft2.addBox(-2.0F, 0.0F, -1.0F, 2, 6, 1, 0.0F);
        this.setRotateAngle(tailLeft2, 0.6981317007977318F, 0.0F, 0.0F);
        this.armRight = new ModelRenderer(this, 22, 27);
        this.armRight.setRotationPoint(2.5F, 1.5F, 0.0F);
        this.armRight.addBox(0.0F, -1.0F, -1.0F, 2, 4, 2, 0.0F);
        this.setRotateAngle(armRight, -0.08726646259971647F, 0.0F, -0.08726646259971647F);
        this.cauldronBody = new ModelRenderer(this, 33, 49);
        this.cauldronBody.setRotationPoint(-2.0F, 1.5F, -2.0F);
        this.cauldronBody.addBox(0.0F, 0.0F, 0.0F, 4, 2, 4, 0.0F);
        this.earLeft1 = new ModelRenderer(this, 27, 10);
        this.earLeft1.setRotationPoint(-1.7999999523162842F, -0.952616810798645F, 0.585253119468689F);
        this.earLeft1.addBox(-1.0F, -2.0F, 0.0F, 1, 2, 2, 0.0F);
        this.setRotateAngle(earLeft1, 0.08169706039106102F, -0.34768120636910643F, 0.03171146376384783F);
        this.tailRight2 = new ModelRenderer(this, 14, 43);
        this.tailRight2.setRotationPoint(2.0F, 0.0F, 1.0F);
        this.tailRight2.addBox(-2.0F, 0.0F, -1.0F, 2, 6, 1, 0.0F);
        this.setRotateAngle(tailRight2, 0.6981317007977318F, 0.0F, 0.0F);
        this.shoeLeft3 = new ModelRenderer(this, 18, 40);
        this.shoeLeft3.setRotationPoint(0.5F, -1.0F, 0.0F);
        this.shoeLeft3.addBox(0.0F, -1.0F, 0.0F, 1, 1, 1, 0.0F);
        this.setRotateAngle(shoeLeft3, -0.6981317007977318F, 0.0F, 0.0F);
        this.legRight2 = new ModelRenderer(this, 7, 34);
        this.legRight2.setRotationPoint(1.0F, 3.0F, 0.0F);
        this.legRight2.addBox(-1.0F, 0.0F, -1.0F, 2, 1, 2, 0.0F);
        this.earLeft = new ModelRenderer(this, 27, 10);
        this.earLeft.setRotationPoint(1.7999999523162842F, -0.952616810798645F, 0.585253119468689F);
        this.earLeft.addBox(0.0F, -2.0F, 0.0F, 1, 2, 2, 0.0F);
        this.setRotateAngle(earLeft, 0.08169706039106102F, 0.34768120636910643F, -0.03171146376384783F);
        this.shoeLeft2 = new ModelRenderer(this, 15, 37);
        this.shoeLeft2.setRotationPoint(-1.0F, 1.0F, -3.0F);
        this.shoeLeft2.addBox(0.0F, -1.0F, 0.0F, 2, 1, 1, 0.0F);
        this.setRotateAngle(shoeLeft2, 0.4363323129985824F, 0.0F, 0.0F);
        this.body = new ModelRenderer(this, 8, 17);
        this.body.setRotationPoint(0.0F, 14.0F, 0.0F);
        this.body.addBox(-2.5F, 0.0F, -1.5F, 5, 5, 3, 0.0F);
        this.setRotateAngle(body, 0.08726646259971647F, 0.0F, 0.0F);
        this.hatCoin = new ModelRenderer(this, 31, 18);
        this.hatCoin.setRotationPoint(0.0F, -5.0F, -2.0F);
        this.hatCoin.addBox(-1.0F, -1.5F, -1.0F, 2, 2, 1, 0.0F);
        this.setRotateAngle(hatCoin, 0.0F, 0.05235987755982988F, 0.06981317007977318F);
        this.beardCheekRight = new ModelRenderer(this, 26, 33);
        this.beardCheekRight.mirror = true;
        this.beardCheekRight.setRotationPoint(2.5F, -1.0F, -2.0F);
        this.beardCheekRight.addBox(0.0F, 0.0F, 0.0F, 0, 2, 4, 0.0F);
        this.setRotateAngle(beardCheekRight, 0.17453292519943295F, 0.12217304763960307F, -0.3490658503988659F);
        this.earLeft2 = new ModelRenderer(this, 28, 7);
        this.earLeft2.setRotationPoint(-1.0F, -1.0F, 2.0F);
        this.earLeft2.addBox(0.0F, -1.0F, 0.0F, 1, 1, 1, 0.0F);
        this.setRotateAngle(earLeft2, 0.3490658503988659F, 0.0F, 0.0F);
        this.armLeft = new ModelRenderer(this, 22, 27);
        this.armLeft.setRotationPoint(-2.5F, 1.5F, 0.0F);
        this.armLeft.addBox(-2.0F, -1.0F, -1.0F, 2, 4, 2, 0.0F);
        this.setRotateAngle(armLeft, -0.08726646259971647F, 0.0F, 0.08726646259971647F);
        this.cauldronHandle = new ModelRenderer(this, 26, 43);
        this.cauldronHandle.setRotationPoint(-1.0F, 3.0F, 0.0F);
        this.cauldronHandle.addBox(-3.0F, 0.0F, 0.0F, 4, 2, 1, 0.0F);
        this.setRotateAngle(cauldronHandle, 0.13962634015954636F, 0.0F, 0.13962634015954636F);
        this.soeRight2 = new ModelRenderer(this, 15, 37);
        this.soeRight2.setRotationPoint(-1.0F, 1.0F, -3.0F);
        this.soeRight2.addBox(0.0F, -1.0F, 0.0F, 2, 1, 1, 0.0F);
        this.setRotateAngle(soeRight2, 0.4363323129985824F, 0.0F, 0.0F);
        this.legLeft1 = new ModelRenderer(this, 7, 26);
        this.legLeft1.setRotationPoint(0.0F, 5.0F, 0.0F);
        this.legLeft1.addBox(-3.0F, 0.0F, -2.0F, 3, 3, 4, 0.0F);
        this.setRotateAngle(legLeft1, -0.17453292519943295F, 0.0F, 0.08726646259971647F);
        this.shoeLeft = new ModelRenderer(this, 7, 38);
        this.shoeLeft.setRotationPoint(0.0F, 0.5F, 0.0F);
        this.shoeLeft.addBox(-1.0F, 0.0F, -3.0F, 2, 1, 3, 0.0F);
        this.setRotateAngle(shoeLeft, 0.5235987755982988F, 0.5235987755982988F, 0.0F);
        this.tailRight1 = new ModelRenderer(this, 7, 43);
        this.tailRight1.setRotationPoint(0.0F, 5.0F, 1.5F);
        this.tailRight1.addBox(0.0F, 0.0F, 0.0F, 2, 1, 1, 0.0F);
        this.setRotateAngle(tailRight1, -0.5235987755982988F, -0.08726646259971647F, -0.17453292519943295F);
        this.hat2 = new ModelRenderer(this, 31, 26);
        this.hat2.setRotationPoint(-2.5F, -7.0F, -2.5F);
        this.hat2.addBox(-0.5F, -4.0F, -0.5F, 6, 4, 6, 0.0F);
        this.setRotateAngle(hat2, -0.03490658503988659F, 0.0F, 0.03490658503988659F);
        this.chestCoin = new ModelRenderer(this, 31, 18);
        this.chestCoin.setRotationPoint(0.0F, 4.0F, -1.0F);
        this.chestCoin.addBox(-1.0F, -1.5F, -1.0F, 2, 2, 1, 0.0F);
        this.setRotateAngle(chestCoin, 0.0F, -0.05235987755982988F, -0.06981317007977318F);
        this.cauldronBottom = new ModelRenderer(this, 20, 52);
        this.cauldronBottom.setRotationPoint(0.0F, 2.0F, 0.0F);
        this.cauldronBottom.addBox(0.0F, 0.0F, 0.0F, 3, 1, 3, 0.0F);
        this.hatWing = new ModelRenderer(this, 27, 7);
        this.hatWing.setRotationPoint(0.0F, -4.300000190734863F, 0.0F);
        this.hatWing.addBox(-4.0F, 0.0F, -4.0F, 8, 1, 8, 0.0F);
        this.setRotateAngle(hatWing, 0.03490658503988659F, 0.0F, -0.03490658503988659F);
        this.Cuboid6 = new ModelRenderer(this, 26, 40);
        this.Cuboid6.setRotationPoint(1.0F, 3.0F, -1.0F);
        this.Cuboid6.addBox(-3.0F, 0.0F, 0.0F, 4, 2, 0, 0.0F);
        this.setRotateAngle(Cuboid6, -0.17453292519943295F, 0.0F, 0.0F);
        this.cauldronNeck = new ModelRenderer(this, 23, 47);
        this.cauldronNeck.setRotationPoint(0.5F, -0.5F, 0.5F);
        this.cauldronNeck.addBox(0.0F, 0.0F, 0.0F, 3, 1, 3, 0.0F);
        this.legRight1 = new ModelRenderer(this, 7, 26);
        this.legRight1.setRotationPoint(0.0F, 5.0F, 0.0F);
        this.legRight1.addBox(0.0F, 0.0F, -2.0F, 3, 3, 4, 0.0F);
        this.setRotateAngle(legRight1, -0.17453292519943295F, 0.0F, -0.08726646259971647F);
        this.earLeft_1 = new ModelRenderer(this, 28, 7);
        this.earLeft_1.setRotationPoint(0.0F, -1.0F, 2.0F);
        this.earLeft_1.addBox(0.0F, -1.0F, 0.0F, 1, 1, 1, 0.0F);
        this.setRotateAngle(earLeft_1, 0.3490658503988659F, 0.0F, 0.0F);
        this.cauldronLid = new ModelRenderer(this, 33, 43);
        this.cauldronLid.setRotationPoint(-1.0F, 1.7000000476837158F, 0.5F);
        this.cauldronLid.addBox(-2.0F, 0.0F, -2.0F, 4, 1, 4, 0.0F);
        this.beardFront = new ModelRenderer(this, 35, 37);
        this.beardFront.setRotationPoint(0.0F, -0.5F, -1.0F);
        this.beardFront.addBox(-3.0F, 0.0F, -2.0F, 6, 3, 2, 0.0F);
        this.setRotateAngle(beardFront, -0.3490658503988659F, 0.0F, 0.0F);
        this.legLeft2 = new ModelRenderer(this, 7, 34);
        this.legLeft2.setRotationPoint(-1.0F, 3.0F, 0.0F);
        this.legLeft2.addBox(-1.0F, 0.0F, -1.0F, 2, 1, 2, 0.0F);
        this.body.addChild(this.tailLeft);
        this.head.addChild(this.hat1);
        this.body.addChild(this.head);
        this.soeRight2.addChild(this.shoeRight3);
        this.head.addChild(this.beardCheekLeft);
        this.legRight2.addChild(this.shoeRight1);
        this.tailLeft.addChild(this.tailLeft2);
        this.body.addChild(this.armRight);
        this.cauldronLid.addChild(this.cauldronBody);
        this.head.addChild(this.earLeft1);
        this.tailRight1.addChild(this.tailRight2);
        this.shoeLeft2.addChild(this.shoeLeft3);
        this.legRight1.addChild(this.legRight2);
        this.head.addChild(this.earLeft);
        this.shoeLeft.addChild(this.shoeLeft2);
        this.head.addChild(this.hatCoin);
        this.head.addChild(this.beardCheekRight);
        this.earLeft1.addChild(this.earLeft2);
        this.body.addChild(this.armLeft);
        this.armLeft.addChild(this.cauldronHandle);
        this.shoeRight1.addChild(this.soeRight2);
        this.body.addChild(this.legLeft1);
        this.legLeft2.addChild(this.shoeLeft);
        this.body.addChild(this.tailRight1);
        this.head.addChild(this.hat2);
        this.body.addChild(this.chestCoin);
        this.cauldronNeck.addChild(this.cauldronBottom);
        this.head.addChild(this.hatWing);
        this.beardFront.addChild(this.Cuboid6);
        this.cauldronBody.addChild(this.cauldronNeck);
        this.body.addChild(this.legRight1);
        this.earLeft.addChild(this.earLeft_1);
        this.cauldronHandle.addChild(this.cauldronLid);
        this.head.addChild(this.beardFront);
        this.legLeft1.addChild(this.legLeft2);
    }

    @Override
    public void render(Entity entity, float f, float f1, float f2, float f3, float f4, float f5) { 
        this.body.render(f5);
    }

    
    public void setRotationAngles(float limbSwing, float limbSwingAmount, float ageInTicks, float netHeadYaw, float headPitch, float scaleFactor, Entity entityIn){
    	setRotateAngle(head, (float) (headPitch * Math.PI / 360), (float) (netHeadYaw * Math.PI / 360), 0);	
    }
    int test = 0;
    public void setLivingAnimations(EntityLivingBase entitylivingbaseIn, float limbSwing, float limbSwingAmount, float partialTickTime){
    	super.setLivingAnimations(entitylivingbaseIn, limbSwing, limbSwingAmount, partialTickTime);
		EntityLeprechaun leprechaun = (EntityLeprechaun) entitylivingbaseIn;
    	
    	float time = entitylivingbaseIn.ticksExisted*0.15F;
    	float throwProgress = leprechaun.getThrowProgress(partialTickTime);
		 
		
		
		if (!leprechaun.isThrowing()) {
		body.rotateAngleX = degToRad(5) + degToRad(1)*MathHelper.sin(time);
		armRight.rotateAngleZ = -body.rotateAngleX;
		armLeft.rotateAngleZ = body.rotateAngleX;
		legRight1.rotateAngleZ = armRight.rotateAngleZ;
		legLeft1.rotateAngleZ = armLeft.rotateAngleZ;
		body.rotateAngleY = 0;
		
		}else {
			//body.rotateAngleY = time;
			
			//System.out.println("I am here!" + " Throw duration: " + throwProgress);
			if (throwProgress <= 0.2) {
				this.armLeft.rotateAngleX += degToRad(-75)*throwProgress*0.5F;
				this.armLeft.rotateAngleY += degToRad(-20)*throwProgress*0.5F;
				this.armRight.rotateAngleX += degToRad(-70)*throwProgress*0.5F;
				this.armRight.rotateAngleY += degToRad(30)*throwProgress*0.5F;
				this.armLeft.rotateAngleZ += degToRad(5)*throwProgress*0.5F;
				this.cauldronHandle.rotateAngleX += degToRad(30)*throwProgress*0.5F;
				this.cauldronHandle.rotateAngleY += degToRad(5)*throwProgress*0.5F;
				this.cauldronLid.rotateAngleX += degToRad(40)*throwProgress*0.5F;

				//System.out.println("Look!, I went through the first phase!");
			}else if (throwProgress <= 0.3) {//Gold search
				//TODO
			}else if (throwProgress <= 0.5) {//throw pose
				body.rotateAngleX += degToRad(-5)*(throwProgress-0.3)*0.5F;
				body.rotateAngleY += degToRad(-20)*(throwProgress-0.3)*0.5F;
				legRight1.rotateAngleX += degToRad(10)*(throwProgress-0.3)*0.5F;
				legLeft1.rotateAngleX = legRight1.rotateAngleX;
				armRight.rotateAngleX += degToRad(-220)*(throwProgress-0.3F)*0.5F;
				armRight.rotateAngleY += degToRad(30)*(throwProgress-0.3F)*0.5F;
				armLeft.rotateAngleX += degToRad(-60)*(throwProgress-0.3F)*0.5F;
				armLeft.rotateAngleY += degToRad(-30)*(throwProgress-0.3F)*0.5F;
				cauldronLid.rotateAngleX = degToRad(60)*(throwProgress-0.3F)*0.5F;
				//System.out.println("Look!, I went through the third phase!");
			}else if (throwProgress <= 0.6){//Launch arm swirl;
				//TODO
			}else if (throwProgress <= 0.8) {//Launch pose + gold throw;
				body.rotateAngleX += degToRad(10)*(throwProgress-0.6)*0.5F;
				body.rotateAngleY += degToRad(20)*(throwProgress-0.6)*0.5F;
				legRight1.rotateAngleX += degToRad(-10)*(throwProgress-0.6)*0.5F;
				legLeft1.rotateAngleX = legRight1.rotateAngleX;
				armRight.rotateAngleX += degToRad(-100)*(throwProgress-0.6)*0.5F;
				armRight.rotateAngleY += degToRad(10)*(throwProgress-0.6)*0.5F;
				armLeft.rotateAngleX += degToRad(-60)*(throwProgress-0.6)*0.5F;
				armLeft.rotateAngleY += degToRad(30)*(throwProgress-0.6)*0.5F;
				cauldronLid.rotateAngleX += degToRad(-30)*(throwProgress-0.6)*0.5F;
				//System.out.println("Look!, I went through the fifth phase!");

				
			}else if (throwProgress <= 1) {// Return to base position;
				body.rotateAngleX += degToRad(5)*(throwProgress-0.8)*0.5F;
				body.rotateAngleY += degToRad(0)*(throwProgress-0.8)*0.5F;
				armRight.rotateAngleX += degToRad(-5)*(throwProgress-0.8)*0.5F;
				armRight.rotateAngleY += degToRad(0)*(throwProgress-0.8)*0.5F;
				armLeft.rotateAngleX += degToRad(-5)*(throwProgress-0.8)*0.5F;
				armLeft.rotateAngleY += degToRad(0)*(throwProgress-0.8)*0.5F;
				cauldronLid.rotateAngleX += degToRad(0)*(throwProgress-0.8)*0.5F;				
				cauldronHandle.rotateAngleX += degToRad(8)*(throwProgress-0.8)*0.5F;				
				cauldronHandle.rotateAngleY += degToRad(0)*(throwProgress-0.8)*0.5F;	
				//System.out.println("Look!, I went through the last phase!");
				

			}
			
			
		}


    }
    
    
    
    /**
     * This is a helper function from Tabula to set the rotation of model parts
     */
    public void setRotateAngle(ModelRenderer modelRenderer, float x, float y, float z) {
        modelRenderer.rotateAngleX = x;
        modelRenderer.rotateAngleY = y;
        modelRenderer.rotateAngleZ = z;
    }
}
