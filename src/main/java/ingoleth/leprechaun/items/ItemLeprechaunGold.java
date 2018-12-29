package ingoleth.leprechaun.items;

import java.util.List;

import javax.annotation.Nullable;

import ingoleth.leprechaun.mob.EntityThrownGoldIngot;
import net.minecraft.client.resources.I18n;
import net.minecraft.client.util.ITooltipFlag;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.entity.projectile.EntitySnowball;
import net.minecraft.init.SoundEvents;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.stats.StatList;
import net.minecraft.util.ActionResult;
import net.minecraft.util.EnumActionResult;
import net.minecraft.util.EnumHand;
import net.minecraft.util.SoundCategory;
import net.minecraft.util.text.TextFormatting;
import net.minecraft.world.World;
import net.minecraftforge.fml.relauncher.Side;
import net.minecraftforge.fml.relauncher.SideOnly;

public class ItemLeprechaunGold extends Item {
	
	public ItemLeprechaunGold(String leprechaun_gold) {
		setUnlocalizedName(leprechaun_gold);
		setRegistryName(leprechaun_gold);
		 this.maxStackSize = 64;
	     this.setCreativeTab(CreativeTabs.MISC);
	}
	
	public String getNameInefficiently(ItemStack stack) {
		return getUnlocalizedName().substring(5);
	}
	
	@Override
	@SideOnly(Side.CLIENT)
	public void addInformation(ItemStack stack, @Nullable World player, List<String> tooltip, ITooltipFlag advanced) {
		tooltip.add(TextFormatting.LIGHT_PURPLE + I18n.format("leprechaun.tooltip." + getNameInefficiently(stack) + "_description.name"));
	}
	
	 public ActionResult<ItemStack> onItemRightClick(World worldIn, EntityPlayer playerIn, EnumHand handIn)
	    {
	        ItemStack itemstack = playerIn.getHeldItem(handIn);

	        if (!playerIn.capabilities.isCreativeMode)
	        {
	            itemstack.shrink(1);
	        }

	        worldIn.playSound((EntityPlayer)null, playerIn.posX, playerIn.posY, playerIn.posZ, SoundEvents.ENTITY_SNOWBALL_THROW, SoundCategory.NEUTRAL, 0.5F, 0.4F / (itemRand.nextFloat() * 0.4F + 0.8F));

	        if (!worldIn.isRemote)
	        {
	            EntityThrownGoldIngot entitythrowningot = new EntityThrownGoldIngot(worldIn, playerIn);
	            entitythrowningot.shoot(playerIn, playerIn.rotationPitch, playerIn.rotationYaw, 0.0F, 1.5F, 1.0F);
	            worldIn.spawnEntity(entitythrowningot);
	        }

	        playerIn.addStat(StatList.getObjectUseStats(this));
	        return new ActionResult<ItemStack>(EnumActionResult.SUCCESS, itemstack);
	    }
	
	
}	

