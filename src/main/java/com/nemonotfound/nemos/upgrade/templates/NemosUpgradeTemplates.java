package com.nemonotfound.nemos.upgrade.templates;

import com.nemonotfound.nemos.upgrade.templates.event.LootTableEventHandler;
import com.nemonotfound.nemos.upgrade.templates.world.item.UpgradeTemplateItems;
import com.nemonotfound.nemos.upgrade.templates.world.item.UpgradeTemplatesCreativeModeTabs;
import net.fabricmc.api.ModInitializer;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class NemosUpgradeTemplates implements ModInitializer {

	public static final String MOD_ID = "nemos_upgrade_templates";
	public static final Logger LOGGER = LoggerFactory.getLogger(MOD_ID);

	@Override
	public void onInitialize() {
		LOGGER.info("So.. you think your worth it to use Nemo's Upgrade Templates? You fool!");

		UpgradeTemplateItems.init();
		UpgradeTemplatesCreativeModeTabs.init();
		LootTableEventHandler.handleLootTableEvent();
	}
}