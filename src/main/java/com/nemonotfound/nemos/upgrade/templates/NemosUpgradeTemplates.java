package com.nemonotfound.nemos.upgrade.templates;

import com.nemonotfound.nemos.upgrade.templates.event.LootTableEventHandler;
import com.nemonotfound.nemos.upgrade.templates.world.item.UpgradeTemplateItems;
import com.nemonotfound.nemos.upgrade.templates.world.item.UpgradeTemplatesCreativeModeTabs;
import net.fabricmc.api.ModInitializer;
import net.fabricmc.fabric.api.resource.v1.ResourceLoader;
import net.fabricmc.loader.api.FabricLoader;
import net.minecraft.network.chat.Component;
import net.minecraft.resources.Identifier;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import static net.fabricmc.fabric.api.resource.v1.pack.PackActivationType.DEFAULT_ENABLED;

public class NemosUpgradeTemplates implements ModInitializer {

    public static final String MOD_ID = "nemos_upgrade_templates";
    public static final Logger LOGGER = LoggerFactory.getLogger(MOD_ID);

    @Override
    public void onInitialize() {
        LOGGER.info("So.. you think you're worth it to use Nemo's Upgrade Templates? You fool!");

        UpgradeTemplateItems.init();
        UpgradeTemplatesCreativeModeTabs.init();
        LootTableEventHandler.handleLootTableEvent();

        FabricLoader.getInstance().getModContainer(MOD_ID).ifPresent(container ->
                ResourceLoader.registerBuiltinPack(
                        Identifier.fromNamespaceAndPath(MOD_ID, "netherite_template"),
                        container,
                        Component.literal("Nemo's Netherite Template"),
                        DEFAULT_ENABLED
                )
        );
    }
}