package com.nemonotfound.nemos.upgrade.templates.world.item;

import net.fabricmc.fabric.api.itemgroup.v1.FabricItemGroup;
import net.minecraft.core.Registry;
import net.minecraft.core.registries.BuiltInRegistries;
import net.minecraft.network.chat.Component;
import net.minecraft.resources.Identifier;
import net.minecraft.world.item.ItemStack;

import static com.nemonotfound.nemos.upgrade.templates.NemosUpgradeTemplates.MOD_ID;

public class UpgradeTemplatesCreativeModeTabs {

    public static void init() {
        var creativeModeTab = FabricItemGroup.builder()
                .title(Component.translatable("itemGroup." + MOD_ID))
                .icon(() -> new ItemStack(UpgradeTemplateItems.DIAMOND_UPGRADE_SMITHING_TEMPLATE))
                .displayItems((parameters, output) -> {
                    output.accept(UpgradeTemplateItems.COPPER_UPGRADE_SMITHING_TEMPLATE);
                    output.accept(UpgradeTemplateItems.IRON_UPGRADE_SMITHING_TEMPLATE);
                    output.accept(UpgradeTemplateItems.GOLD_UPGRADE_SMITHING_TEMPLATE);
                    output.accept(UpgradeTemplateItems.DIAMOND_UPGRADE_SMITHING_TEMPLATE);
                })
                .build();

        Registry.register(BuiltInRegistries.CREATIVE_MODE_TAB, Identifier.fromNamespaceAndPath(MOD_ID, MOD_ID), creativeModeTab);
    }
}
