package de.ryuu.painterlyadditions.init;

import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.ItemStack;

public class ModTabs {
    public static CreativeModeTab TAB_PAINTERLY_WOOD;
    public static CreativeModeTab TAB_PAINTERLY_PLANTS;

    public static void load() {
        TAB_PAINTERLY_WOOD = new CreativeModeTab("tabpainterly_wood") {
            @Override
            public ItemStack makeIcon() {
                return new ItemStack(ModBlocks.A1_PLANK_DEEPCLASSIC.get());
            }

            @Override
            public boolean hasSearchBar() {
                return false;
            }
        };
        TAB_PAINTERLY_PLANTS = new CreativeModeTab("tabpainterly_plants") {
            @Override
            public ItemStack makeIcon() {
                return new ItemStack(ModBlocks.A1_FLOWER_ALLIUM.get());
            }

            @Override
            public boolean hasSearchBar() {
                return false;
            }
        };
    }
}