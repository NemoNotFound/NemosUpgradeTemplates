package com.nemonotfound.nemos.upgrade.templates.datagen.lang;

import com.nemonotfound.nemos.upgrade.templates.world.item.UpgradeTemplateItems;
import net.fabricmc.fabric.api.datagen.v1.FabricDataOutput;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricLanguageProvider;
import net.minecraft.core.HolderLookup;
import org.jspecify.annotations.NonNull;

import java.util.concurrent.CompletableFuture;

import static com.nemonotfound.nemos.upgrade.templates.NemosUpgradeTemplates.MOD_ID;

public class EnglishLanguageProvider extends FabricLanguageProvider {

    public EnglishLanguageProvider(FabricDataOutput dataOutput, CompletableFuture<HolderLookup.Provider> registryLookup) {
        super(dataOutput, registryLookup);
    }

    @Override
    public void generateTranslations(HolderLookup.@NonNull Provider provider, TranslationBuilder translationBuilder) {
        translationBuilder.add(UpgradeTemplateItems.COPPER_UPGRADE_SMITHING_TEMPLATE, "Copper Upgrade");
        translationBuilder.add("item.nemos_upgrade_templates.smithing_template.copper_upgrade.applies_to", "Stone Equipment");
        translationBuilder.add("item.nemos_upgrade_templates.smithing_template.copper_upgrade.additions_slot_description", "Add Copper Ingot");
        translationBuilder.add("item.nemos_upgrade_templates.smithing_template.copper_upgrade.base_slot_description", "Add leather armor, stone weapon, or tool");
        translationBuilder.add("item.nemos_upgrade_templates.smithing_template.copper_upgrade.ingredients", "Copper Ingot");
        translationBuilder.add(UpgradeTemplateItems.IRON_UPGRADE_SMITHING_TEMPLATE, "Iron Upgrade");
        translationBuilder.add("item.nemos_upgrade_templates.smithing_template.iron_upgrade.applies_to", "Copper Equipment");
        translationBuilder.add("item.nemos_upgrade_templates.smithing_template.iron_upgrade.additions_slot_description", "Add Iron Ingot");
        translationBuilder.add("item.nemos_upgrade_templates.smithing_template.iron_upgrade.base_slot_description", "Add copper armor, weapon, or tool");
        translationBuilder.add("item.nemos_upgrade_templates.smithing_template.iron_upgrade.ingredients", "Iron Ingot");
        translationBuilder.add(UpgradeTemplateItems.GOLD_UPGRADE_SMITHING_TEMPLATE, "Gold Upgrade");
        translationBuilder.add("item.nemos_upgrade_templates.smithing_template.gold_upgrade.applies_to", "Iron Equipment");
        translationBuilder.add("item.nemos_upgrade_templates.smithing_template.gold_upgrade.additions_slot_description", "Add Gold Ingot");
        translationBuilder.add("item.nemos_upgrade_templates.smithing_template.gold_upgrade.base_slot_description", "Add iron armor, weapon, or tool");
        translationBuilder.add("item.nemos_upgrade_templates.smithing_template.gold_upgrade.ingredients", "Gold Ingot");
        translationBuilder.add(UpgradeTemplateItems.DIAMOND_UPGRADE_SMITHING_TEMPLATE, "Diamond Upgrade");
        translationBuilder.add("item.nemos_upgrade_templates.smithing_template.diamond_upgrade.applies_to", "Gold Equipment");
        translationBuilder.add("item.nemos_upgrade_templates.smithing_template.diamond_upgrade.additions_slot_description", "Add Diamond Ingot");
        translationBuilder.add("item.nemos_upgrade_templates.smithing_template.diamond_upgrade.base_slot_description", "Add gold armor, weapon, or tool");
        translationBuilder.add("item.nemos_upgrade_templates.smithing_template.diamond_upgrade.ingredients", "Diamond Ingot");

        translationBuilder.add("itemGroup." + MOD_ID, "Nemo's Upgrade Templates");
    }
}
