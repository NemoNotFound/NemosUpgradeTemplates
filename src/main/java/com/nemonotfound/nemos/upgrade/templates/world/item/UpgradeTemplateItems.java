package com.nemonotfound.nemos.upgrade.templates.world.item;

import com.nemonotfound.nemos.upgrade.templates.helper.SmithingTemplateItemHelper;
import net.minecraft.core.registries.Registries;
import net.minecraft.resources.Identifier;
import net.minecraft.resources.ResourceKey;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.Items;
import net.minecraft.world.item.Rarity;

import java.util.function.Function;

import static com.nemonotfound.nemos.upgrade.templates.NemosUpgradeTemplates.MOD_ID;

public class UpgradeTemplateItems {

    public static final Item COPPER_UPGRADE_SMITHING_TEMPLATE = registerItem(
            "copper_upgrade_smithing_template",
            SmithingTemplateItemHelper::createCopperUpgradeTemplate,
            new Item.Properties()
                    .rarity(Rarity.UNCOMMON)
    );
    public static final Item IRON_UPGRADE_SMITHING_TEMPLATE = registerItem(
            "iron_upgrade_smithing_template",
            SmithingTemplateItemHelper::createIronUpgradeTemplate,
            new Item.Properties()
                    .rarity(Rarity.UNCOMMON)
    );
    public static final Item GOLD_UPGRADE_SMITHING_TEMPLATE = registerItem(
            "gold_upgrade_smithing_template",
            SmithingTemplateItemHelper::createGoldUpgradeTemplate,
            new Item.Properties()
                    .rarity(Rarity.UNCOMMON)
    );
    public static final Item DIAMOND_UPGRADE_SMITHING_TEMPLATE = registerItem(
            "diamond_upgrade_smithing_template",
            SmithingTemplateItemHelper::createDiamondUpgradeTemplate,
            new Item.Properties()
                    .rarity(Rarity.UNCOMMON)
    );

    public static void init() {}

    private static Item registerItem(String path, Function<Item.Properties, Item> function, Item.Properties properties) {
        var resourceKey = ResourceKey.create(Registries.ITEM, Identifier.fromNamespaceAndPath(MOD_ID, path));

        return Items.registerItem(resourceKey, function, properties);
    }
}
