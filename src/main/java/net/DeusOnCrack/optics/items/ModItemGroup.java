package net.DeusOnCrack.optics.items;

import net.DeusOnCrack.optics.Optics;
import net.fabricmc.fabric.api.client.itemgroup.FabricItemGroupBuilder;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.ItemStack;
import net.minecraft.util.Identifier;

public class ModItemGroup {
    public static final ItemGroup ATTACHMENTS = FabricItemGroupBuilder.build(new Identifier(Optics.MOD_ID, "attachments"), new ItemStack(moditems.SCOPE_BASE));
    public static final ItemGroup ATTACHMENTS = FabricItemGroupBuilder.build(new Identifier(Optics.MOD_ID, "attachments"), new ItemStack(moditems.SCOPE_1X));
}
