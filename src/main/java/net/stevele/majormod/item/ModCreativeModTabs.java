package net.stevele.majormod.item;

import net.minecraft.core.registries.Registries;
import net.minecraft.network.chat.Component;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.ItemStack;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.RegistryObject;
import net.stevele.majormod.MajorMod;
import net.stevele.majormod.block.ModBlocks;

public class ModCreativeModTabs {
    public static final DeferredRegister<CreativeModeTab> CREATIVE_MODE_TAB =
            DeferredRegister.create(Registries.CREATIVE_MODE_TAB, MajorMod.MOD_ID);

    public static final RegistryObject<CreativeModeTab> MAJOR_TAB = CREATIVE_MODE_TAB.register("major_tab",
            () -> CreativeModeTab.builder().icon(() -> new ItemStack(ModItems.TITANIUM.get()))
                    .title(Component.translatable("creativetab.major_tab"))
                    .displayItems((pParameters, pOutput) -> {
                        pOutput.accept(ModItems.TITANIUM.get());
                        pOutput.accept(ModItems.RAW_TITANIUM.get());
                        pOutput.accept(ModBlocks.TITANIUM_BLOCK.get());
                        pOutput.accept(ModBlocks.RAW_TITANIUM_BLOCK.get());

                        pOutput.accept(ModBlocks.TITANIUM_ORE.get());
                        pOutput.accept(ModBlocks.DEEPSLATE_TITANIUM_ORE.get());
                        pOutput.accept(ModBlocks.END_STONE_TITANIUM_ORE.get());


                    })
                    .build());

    public static void register(IEventBus eventBus) {
        CREATIVE_MODE_TAB.register(eventBus);
    }
}
