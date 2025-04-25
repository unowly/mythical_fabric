package dev.unowly.tab;

import dev.unowly.Mythical;
import dev.unowly.item.ModItems;
import net.fabricmc.fabric.api.itemgroup.v1.FabricItemGroup;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.ItemStack;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.text.Text;
import net.minecraft.util.Identifier;

public class MythicalItemsTabGroup {
    public static final ItemGroup MYTHICAL_ITEMS = Registry.register(Registries.ITEM_GROUP, Identifier.of(
            Mythical.MOD_ID, "mythical_items_tab_group"), FabricItemGroup.builder()
            .icon(() -> new ItemStack(ModItems.STAR_FRAGMENT))
            .displayName(Text.translatable("itemGroup.mythical_items_tab_group"))
            .entries((context, entries) ->{
                entries.add(ModItems.STAR_FRAGMENT);
            })
            .build());

    public static void initialise() {}
}
