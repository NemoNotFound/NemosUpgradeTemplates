package com.nemonotfound.nemos.upgrade.templates;

import com.nemonotfound.nemos.upgrade.templates.datagen.UpgradeTemplateModelProvider;
import com.nemonotfound.nemos.upgrade.templates.datagen.UpgradeTemplateRecipeProvider;
import com.nemonotfound.nemos.upgrade.templates.datagen.lang.EnglishLanguageProvider;
import net.fabricmc.fabric.api.datagen.v1.DataGeneratorEntrypoint;
import net.fabricmc.fabric.api.datagen.v1.FabricDataGenerator;

public class DataGenerator implements DataGeneratorEntrypoint {

    @Override
    public void onInitializeDataGenerator(FabricDataGenerator fabricDataGenerator) {
        FabricDataGenerator.Pack pack = fabricDataGenerator.createPack();

        pack.addProvider(UpgradeTemplateModelProvider::new);
        pack.addProvider(EnglishLanguageProvider::new);
        pack.addProvider(UpgradeTemplateRecipeProvider::new);
    }
}
