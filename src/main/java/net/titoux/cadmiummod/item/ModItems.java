package net.titoux.cadmiummod.item;

import net.fabricmc.fabric.api.itemgroup.v1.ItemGroupEvents;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroups;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.registry.RegistryKey;
import net.minecraft.registry.RegistryKeys;
import net.minecraft.util.Identifier;
import net.titoux.cadmiummod.CadmiumMod;

public class ModItems {
    public static final Item CADMIUM_INGOT = registerItem("cadmium_ingot", new Item(new Item.Settings().registryKey(RegistryKey.of(RegistryKeys.ITEM, Identifier.of(CadmiumMod.MOD_ID,"cadmium_ingot")))));
    public static final Item RAW_CADMIUM = registerItem("raw_cadmium", new Item(new Item.Settings().registryKey(RegistryKey.of(RegistryKeys.ITEM, Identifier.of(CadmiumMod.MOD_ID,"raw_cadmium")))));

    private static Item registerItem(String name, Item item) {
        return Registry.register(Registries.ITEM, Identifier.of(CadmiumMod.MOD_ID, name), item);
    }

    public static void registerModItems() {
        CadmiumMod.LOGGER.info("Registering mod items for " + CadmiumMod.MOD_ID);

        ItemGroupEvents.modifyEntriesEvent(ItemGroups.INGREDIENTS).register(fabricItemGroupEntries -> {
            fabricItemGroupEntries.add(CADMIUM_INGOT);
            fabricItemGroupEntries.add(RAW_CADMIUM);
        });
    }
}