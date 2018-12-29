package ingoleth.leprechaun;

import net.minecraft.util.ResourceLocation;
import net.minecraft.util.SoundEvent;
import net.minecraftforge.event.RegistryEvent;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.eventhandler.SubscribeEvent;
import net.minecraftforge.fml.common.registry.GameRegistry.ObjectHolder;

@SuppressWarnings("WeakerAccess")
@ObjectHolder(leprechaun.MODID)
public class ModSoundEvents {

	@ObjectHolder("leprechaun.throw")
	public static final SoundEvent LEPRECHAUN_THROW = createSoundEvent("leprechaun.throw");
	@ObjectHolder("leprechaun.ambient")
	public static final SoundEvent LEPRECHAUN_AMBIENT = createSoundEvent("leprechaun.ambient");	
	@ObjectHolder("leprechaun.death")
	public static final SoundEvent LEPRECHAUN_DEATH = createSoundEvent("leprechaun.death");
	@ObjectHolder("leprechaun.hurt")
	public static final SoundEvent LEPRECHAUN_HURT = createSoundEvent("leprechaun.hurt");
	
	private static SoundEvent createSoundEvent(String soundName) {
		final ResourceLocation soundID = new ResourceLocation(leprechaun.MODID, soundName);
		return new SoundEvent(soundID).setRegistryName(soundID);
	}

	@Mod.EventBusSubscriber
	public static class RegistrationHandler {
		@SubscribeEvent
		public static void registerSoundEvents(RegistryEvent.Register<SoundEvent> event) {
			event.getRegistry().registerAll(
					LEPRECHAUN_THROW,
					LEPRECHAUN_AMBIENT,
					LEPRECHAUN_DEATH,
					LEPRECHAUN_HURT
			);
		}
	}
}