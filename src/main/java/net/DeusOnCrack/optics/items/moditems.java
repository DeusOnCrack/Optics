package net.DeusOnCrack.optics.items;

import net.DeusOnCrack.optics.Optics;
import net.fabricmc.fabric.api.item.v1.FabricItemSettings;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroup;
import net.minecraft.util.Identifier;
import net.minecraft.util.registry.Registry;

public class moditems {

    public static final Item SCOPE_BASE = registerItem("scope_base",
            new Item(new FabricItemSettings().group(ModItemGroup.ATTACHMENTS)));

    public static final Item SCOPE_1X = registerItem("scope_1x",
            new Item(new FabricItemSettings().group(ModItemGroup.ATTACHMENTS)));

    private static Item registerItem (String name, Item item) {
        return Registry.register(Registry.ITEM, new Identifier(Optics.MOD_ID, name), item);
    }

public static void registerModItems() {

    Optics.LOGGER.debug("Registering Mod Items for " + Optics.MOD_ID);



}

}
