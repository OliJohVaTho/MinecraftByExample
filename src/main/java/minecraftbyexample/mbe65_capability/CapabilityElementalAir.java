package minecraftbyexample.mbe65_capability;

import net.minecraftforge.common.capabilities.Capability;
import net.minecraftforge.common.capabilities.CapabilityInject;
import net.minecraftforge.common.capabilities.CapabilityManager;

/**
 * Created by TGG on 17/06/2020.
 *
 * This class doesn't do much!
 * It's really just a marker for the capability.
 * register() should be called during FMLCommonSetupEvent, and forge comes back later and stores the
 *   CapabilityElementalFire instance into the @CapabilityInject field.
 *
 * Note that, although I've used concrete implementations of the interface, you can register using interfaces instead
 * eg
 *   ElementalFireInterfaceInstance1 implements ElementalFireInterface
 *
 *       CapabilityManager.INSTANCE.register(
 *               ElementalFireInterface.class,
 *               new ElementalFireInterface.nbt,  // write to NBT or read from NBT
 *               ElementalFireInterfaceInstance::createADefaultInstance);
 *
 */
public class CapabilityElementalAir {
    @CapabilityInject(ElementalAirInterfaceInstance.class)
    public static Capability<ElementalAirInterfaceInstance> CAPABILITY_ELEMENTAL_AIR = null;

    public static void register() {
      CapabilityManager.INSTANCE.register(
              ElementalAirInterfaceInstance.class,
              new ElementalAirInterfaceInstance.ElementalAirNBTStorage(),
              ElementalAirInterfaceInstance::createADefaultInstance);
    }
}
