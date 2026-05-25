package com.nemonotfound.nemos.upgrade.templates.event;

import com.nemonotfound.nemos.upgrade.templates.world.item.UpgradeTemplateItems;
import net.fabricmc.fabric.api.loot.v3.LootTableEvents;
import net.minecraft.world.level.storage.loot.BuiltInLootTables;
import net.minecraft.world.level.storage.loot.LootPool;
import net.minecraft.world.level.storage.loot.entries.EmptyLootItem;
import net.minecraft.world.level.storage.loot.entries.LootItem;
import net.minecraft.world.level.storage.loot.providers.number.ConstantValue;

import static net.minecraft.world.level.storage.loot.BuiltInLootTables.TOOLSMITH_GIFT;
import static net.minecraft.world.level.storage.loot.BuiltInLootTables.WEAPONSMITH_GIFT;

public class LootTableEventHandler {

    public static void handleLootTableEvent() {
        LootTableEvents.MODIFY.register(
                (resourceKey, builder, lootTableSource, provider) -> {
                    if (
                            resourceKey == BuiltInLootTables.ABANDONED_MINESHAFT ||
                                    resourceKey == BuiltInLootTables.SHIPWRECK_TREASURE ||
                                    resourceKey == BuiltInLootTables.SIMPLE_DUNGEON ||
                                    resourceKey == BuiltInLootTables.UNDERWATER_RUIN_BIG
                    ) {
                        builder.pool(createUpgradeTemplateLootPool(7, 5, 3, 2));
                    }

                    if (resourceKey == BuiltInLootTables.BURIED_TREASURE) {
                        builder.pool(createUpgradeTemplateLootPool(2, 3,7, 5));
                    }

                    if (resourceKey == BuiltInLootTables.ANCIENT_CITY) {
                        builder.pool(createUpgradeTemplateLootPool(4, 5, 10, 13));
                    }

                    if (
                            resourceKey == BuiltInLootTables.DESERT_PYRAMID ||
                                    resourceKey == BuiltInLootTables.JUNGLE_TEMPLE ||
                                    resourceKey == BuiltInLootTables.PILLAGER_OUTPOST
                    ) {
                        builder.pool(createUpgradeTemplateLootPool(4, 4, 2, 1));
                    }

                    if (resourceKey == BuiltInLootTables.UNDERWATER_RUIN_SMALL) {
                        builder.pool(createCommonUpgradeTemplateLootPool(3, 3));
                    }

                    if (
                            resourceKey == BuiltInLootTables.VILLAGE_WEAPONSMITH ||
                                    resourceKey == BuiltInLootTables.VILLAGE_TOOLSMITH
                    ) {
                        builder.pool(createCommonUpgradeTemplateLootPool(4, 3));
                    }

                    if (resourceKey == WEAPONSMITH_GIFT || resourceKey == TOOLSMITH_GIFT) {
                        builder.pool(createUpgradeTemplateLootPool(4, 6, 7, 9));
                    }

                    if (resourceKey == BuiltInLootTables.WOODLAND_MANSION) {
                        builder.pool(createUpgradeTemplateLootPool(4, 5, 9, 10));
                    }

                    if (resourceKey == BuiltInLootTables.TRIAL_CHAMBERS_REWARD_RARE) {
                        builder.pool(createRareUpgradeTemplateLootPool(5, 5));
                    }

                    if (resourceKey == BuiltInLootTables.TRIAL_CHAMBERS_REWARD_COMMON) {
                        builder.pool(createCommonUpgradeTemplateLootPool(4, 4));
                    }

                    if (resourceKey == BuiltInLootTables.TRIAL_CHAMBERS_REWARD_UNIQUE) {
                        builder.pool(createRareUpgradeTemplateLootPool(7, 7));
                    }

                    if (resourceKey == BuiltInLootTables.TRIAL_CHAMBERS_REWARD_OMINOUS_RARE) {
                        builder.pool(createRareUpgradeTemplateLootPool(6, 6));
                    }

                    if (resourceKey == BuiltInLootTables.TRIAL_CHAMBERS_REWARD_OMINOUS_COMMON) {
                        builder.pool(createCommonUpgradeTemplateLootPool(5, 5));
                    }

                    if (resourceKey == BuiltInLootTables.TRIAL_CHAMBERS_REWARD_OMINOUS_UNIQUE) {
                        builder.pool(createRareUpgradeTemplateLootPool(8, 8));
                    }
                }
        );
    }

    private static LootPool createCommonUpgradeTemplateLootPool(int copperWeight, int ironWeight) {
        var fullWeight = 100;
        var emptyItemWeight = fullWeight - copperWeight - ironWeight;

        return LootPool.lootPool()
                .setRolls(ConstantValue.exactly(1.0F))
                .add(LootItem.lootTableItem(UpgradeTemplateItems.COPPER_UPGRADE_SMITHING_TEMPLATE).setWeight(copperWeight))
                .add(LootItem.lootTableItem(UpgradeTemplateItems.IRON_UPGRADE_SMITHING_TEMPLATE).setWeight(ironWeight))
                .add(EmptyLootItem.emptyItem().setWeight(emptyItemWeight))
                .build();
    }

    private static LootPool createRareUpgradeTemplateLootPool(int goldWeight, int diamondWeight) {
        var fullWeight = 100;
        var emptyItemWeight = fullWeight - goldWeight - diamondWeight;

        return LootPool.lootPool()
                .setRolls(ConstantValue.exactly(1.0F))
                .add(LootItem.lootTableItem(UpgradeTemplateItems.GOLD_UPGRADE_SMITHING_TEMPLATE).setWeight(goldWeight))
                .add(LootItem.lootTableItem(UpgradeTemplateItems.DIAMOND_UPGRADE_SMITHING_TEMPLATE).setWeight(diamondWeight))
                .add(EmptyLootItem.emptyItem().setWeight(emptyItemWeight))
                .build();
    }

    private static LootPool createUpgradeTemplateLootPool(int copperWeight, int ironWeight, int goldWeight, int diamondWeight) {
        var fullWeight = 100;
        var emptyItemWeight = fullWeight - copperWeight - ironWeight - goldWeight - diamondWeight;

        return LootPool.lootPool()
                .setRolls(ConstantValue.exactly(1.0F))
                .add(LootItem.lootTableItem(UpgradeTemplateItems.COPPER_UPGRADE_SMITHING_TEMPLATE).setWeight(copperWeight))
                .add(LootItem.lootTableItem(UpgradeTemplateItems.IRON_UPGRADE_SMITHING_TEMPLATE).setWeight(ironWeight))
                .add(LootItem.lootTableItem(UpgradeTemplateItems.GOLD_UPGRADE_SMITHING_TEMPLATE).setWeight(goldWeight))
                .add(LootItem.lootTableItem(UpgradeTemplateItems.DIAMOND_UPGRADE_SMITHING_TEMPLATE).setWeight(diamondWeight))
                .add(EmptyLootItem.emptyItem().setWeight(emptyItemWeight))
                .build();
    }
}
