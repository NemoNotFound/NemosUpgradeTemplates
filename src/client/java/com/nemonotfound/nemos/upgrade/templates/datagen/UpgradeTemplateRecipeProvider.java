package com.nemonotfound.nemos.upgrade.templates.datagen;

import com.nemonotfound.nemos.upgrade.templates.world.item.UpgradeTemplateItems;
import net.fabricmc.fabric.api.datagen.v1.FabricDataOutput;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricRecipeProvider;
import net.minecraft.core.HolderLookup;
import net.minecraft.data.recipes.RecipeCategory;
import net.minecraft.data.recipes.RecipeOutput;
import net.minecraft.data.recipes.RecipeProvider;
import net.minecraft.data.recipes.SmithingTransformRecipeBuilder;
import net.minecraft.tags.ItemTags;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.Items;
import net.minecraft.world.item.crafting.Ingredient;
import net.minecraft.world.level.ItemLike;
import org.jetbrains.annotations.NotNull;
import org.jspecify.annotations.NonNull;

import java.util.concurrent.CompletableFuture;

import static net.minecraft.data.recipes.SmithingTransformRecipeBuilder.smithing;

public class UpgradeTemplateRecipeProvider extends FabricRecipeProvider {

    public UpgradeTemplateRecipeProvider(FabricDataOutput output, CompletableFuture<HolderLookup.Provider> registriesFuture) {
        super(output, registriesFuture);
    }

    @Override
    protected @NotNull RecipeProvider createRecipeProvider(HolderLookup.@NonNull Provider provider, @NonNull RecipeOutput recipeOutput) {
        return new RecipeProvider(provider, recipeOutput) {

            @Override
            public void buildRecipes() {
                copySmithingUpgradeTemplate(UpgradeTemplateItems.COPPER_UPGRADE_SMITHING_TEMPLATE, Items.COBBLESTONE);
                copySmithingUpgradeTemplate(UpgradeTemplateItems.IRON_UPGRADE_SMITHING_TEMPLATE, Items.COPPER_INGOT);
                copySmithingUpgradeTemplate(UpgradeTemplateItems.GOLD_UPGRADE_SMITHING_TEMPLATE, Items.IRON_INGOT);
                copySmithingUpgradeTemplate(UpgradeTemplateItems.DIAMOND_UPGRADE_SMITHING_TEMPLATE, Items.GOLD_INGOT);

                this.copperSmithing(Items.LEATHER_CHESTPLATE, RecipeCategory.COMBAT, Items.COPPER_CHESTPLATE);
                this.copperSmithing(Items.LEATHER_LEGGINGS, RecipeCategory.COMBAT, Items.COPPER_LEGGINGS);
                this.copperSmithing(Items.LEATHER_HELMET, RecipeCategory.COMBAT, Items.COPPER_HELMET);
                this.copperSmithing(Items.LEATHER_BOOTS, RecipeCategory.COMBAT, Items.COPPER_BOOTS);
                this.copperSmithing(Items.STONE_SWORD, RecipeCategory.COMBAT, Items.COPPER_SWORD);
                this.copperSmithing(Items.STONE_SPEAR, RecipeCategory.COMBAT, Items.COPPER_SPEAR);
                this.copperSmithing(Items.STONE_AXE, RecipeCategory.TOOLS, Items.COPPER_AXE);
                this.copperSmithing(Items.STONE_PICKAXE, RecipeCategory.TOOLS, Items.COPPER_PICKAXE);
                this.copperSmithing(Items.STONE_HOE, RecipeCategory.TOOLS, Items.COPPER_HOE);
                this.copperSmithing(Items.STONE_SHOVEL, RecipeCategory.TOOLS, Items.COPPER_SHOVEL);

                this.ironSmithing(Items.COPPER_CHESTPLATE, RecipeCategory.COMBAT, Items.IRON_CHESTPLATE);
                this.ironSmithing(Items.COPPER_LEGGINGS, RecipeCategory.COMBAT, Items.IRON_LEGGINGS);
                this.ironSmithing(Items.COPPER_HELMET, RecipeCategory.COMBAT, Items.IRON_HELMET);
                this.ironSmithing(Items.COPPER_BOOTS, RecipeCategory.COMBAT, Items.IRON_BOOTS);
                this.ironSmithing(Items.COPPER_NAUTILUS_ARMOR, RecipeCategory.COMBAT, Items.IRON_NAUTILUS_ARMOR);
                this.ironSmithing(Items.COPPER_HORSE_ARMOR, RecipeCategory.COMBAT, Items.IRON_HORSE_ARMOR);
                this.ironSmithing(Items.COPPER_SWORD, RecipeCategory.COMBAT, Items.IRON_SWORD);
                this.ironSmithing(Items.COPPER_SPEAR, RecipeCategory.COMBAT, Items.IRON_SPEAR);
                this.ironSmithing(Items.COPPER_AXE, RecipeCategory.TOOLS, Items.IRON_AXE);
                this.ironSmithing(Items.COPPER_PICKAXE, RecipeCategory.TOOLS, Items.IRON_PICKAXE);
                this.ironSmithing(Items.COPPER_HOE, RecipeCategory.TOOLS, Items.IRON_HOE);
                this.ironSmithing(Items.COPPER_SHOVEL, RecipeCategory.TOOLS, Items.IRON_SHOVEL);

                this.goldSmithing(Items.IRON_CHESTPLATE, RecipeCategory.COMBAT, Items.GOLDEN_CHESTPLATE);
                this.goldSmithing(Items.IRON_LEGGINGS, RecipeCategory.COMBAT, Items.GOLDEN_LEGGINGS);
                this.goldSmithing(Items.IRON_HELMET, RecipeCategory.COMBAT, Items.GOLDEN_HELMET);
                this.goldSmithing(Items.IRON_BOOTS, RecipeCategory.COMBAT, Items.GOLDEN_BOOTS);
                this.goldSmithing(Items.IRON_NAUTILUS_ARMOR, RecipeCategory.COMBAT, Items.GOLDEN_NAUTILUS_ARMOR);
                this.goldSmithing(Items.IRON_HORSE_ARMOR, RecipeCategory.COMBAT, Items.GOLDEN_HORSE_ARMOR);
                this.goldSmithing(Items.IRON_SWORD, RecipeCategory.COMBAT, Items.GOLDEN_SWORD);
                this.goldSmithing(Items.IRON_SPEAR, RecipeCategory.COMBAT, Items.GOLDEN_SPEAR);
                this.goldSmithing(Items.IRON_AXE, RecipeCategory.TOOLS, Items.GOLDEN_AXE);
                this.goldSmithing(Items.IRON_PICKAXE, RecipeCategory.TOOLS, Items.GOLDEN_PICKAXE);
                this.goldSmithing(Items.IRON_HOE, RecipeCategory.TOOLS, Items.GOLDEN_HOE);
                this.goldSmithing(Items.IRON_SHOVEL, RecipeCategory.TOOLS, Items.GOLDEN_SHOVEL);

                this.diamondSmithing(Items.GOLDEN_CHESTPLATE, RecipeCategory.COMBAT, Items.DIAMOND_CHESTPLATE);
                this.diamondSmithing(Items.GOLDEN_LEGGINGS, RecipeCategory.COMBAT, Items.DIAMOND_LEGGINGS);
                this.diamondSmithing(Items.GOLDEN_HELMET, RecipeCategory.COMBAT, Items.DIAMOND_HELMET);
                this.diamondSmithing(Items.GOLDEN_BOOTS, RecipeCategory.COMBAT, Items.DIAMOND_BOOTS);
                this.diamondSmithing(Items.GOLDEN_NAUTILUS_ARMOR, RecipeCategory.COMBAT, Items.DIAMOND_NAUTILUS_ARMOR);
                this.diamondSmithing(Items.GOLDEN_HORSE_ARMOR, RecipeCategory.COMBAT, Items.DIAMOND_HORSE_ARMOR);
                this.diamondSmithing(Items.GOLDEN_SWORD, RecipeCategory.COMBAT, Items.DIAMOND_SWORD);
                this.diamondSmithing(Items.GOLDEN_SPEAR, RecipeCategory.COMBAT, Items.DIAMOND_SPEAR);
                this.diamondSmithing(Items.GOLDEN_AXE, RecipeCategory.TOOLS, Items.DIAMOND_AXE);
                this.diamondSmithing(Items.GOLDEN_PICKAXE, RecipeCategory.TOOLS, Items.DIAMOND_PICKAXE);
                this.diamondSmithing(Items.GOLDEN_HOE, RecipeCategory.TOOLS, Items.DIAMOND_HOE);
                this.diamondSmithing(Items.GOLDEN_SHOVEL, RecipeCategory.TOOLS, Items.DIAMOND_SHOVEL);
            }

            private void copySmithingUpgradeTemplate(ItemLike template, ItemLike baseItem) {
                shaped(RecipeCategory.MISC, template, 2)
                        .define('#', baseItem)
                        .define('C', template)
                        .pattern("###")
                        .pattern("#C#")
                        .pattern("###")
                        .unlockedBy(getHasName(template), this.has(template))
                        .save(this.output);
            }

            public void copperSmithing(Item input, RecipeCategory recipeCategory, Item output) {
                SmithingTransformRecipeBuilder.smithing(
                                Ingredient.of(UpgradeTemplateItems.COPPER_UPGRADE_SMITHING_TEMPLATE),
                                Ingredient.of(input),
                                this.tag(ItemTags.COPPER_TOOL_MATERIALS),
                                recipeCategory,
                                output
                        )
                        .unlocks("has_copper_ingot", this.has(ItemTags.COPPER_TOOL_MATERIALS))
                        .save(this.output, getItemName(output) + "_smithing");
            }

            public void ironSmithing(Item input, RecipeCategory recipeCategory, Item output) {
                SmithingTransformRecipeBuilder.smithing(
                                Ingredient.of(UpgradeTemplateItems.IRON_UPGRADE_SMITHING_TEMPLATE),
                                Ingredient.of(input),
                                this.tag(ItemTags.IRON_TOOL_MATERIALS),
                                recipeCategory,
                                output
                        )
                        .unlocks("has_iron_ingot", this.has(ItemTags.IRON_TOOL_MATERIALS))
                        .save(this.output, getItemName(output) + "_smithing");
            }

            public void goldSmithing(Item input, RecipeCategory recipeCategory, Item output) {
                SmithingTransformRecipeBuilder.smithing(
                                Ingredient.of(UpgradeTemplateItems.GOLD_UPGRADE_SMITHING_TEMPLATE),
                                Ingredient.of(input),
                                this.tag(ItemTags.GOLD_TOOL_MATERIALS),
                                recipeCategory,
                                output
                        )
                        .unlocks("has_gold_ingot", this.has(ItemTags.GOLD_TOOL_MATERIALS))
                        .save(this.output, getItemName(output) + "_smithing");
            }

            public void diamondSmithing(Item input, RecipeCategory recipeCategory, Item output) {
                SmithingTransformRecipeBuilder.smithing(
                                Ingredient.of(UpgradeTemplateItems.DIAMOND_UPGRADE_SMITHING_TEMPLATE),
                                Ingredient.of(input),
                                this.tag(ItemTags.DIAMOND_TOOL_MATERIALS),
                                recipeCategory,
                                output
                        )
                        .unlocks("has_diamond_ingot", this.has(ItemTags.DIAMOND_TOOL_MATERIALS))
                        .save(this.output, getItemName(output) + "_smithing");
            }
        };
    }

    @Override
    public @NotNull String getName() {
        return "Nemo's Upgrade Templates Recipes";
    }
}
