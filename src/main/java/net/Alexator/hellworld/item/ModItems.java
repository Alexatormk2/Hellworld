package net.Alexator.hellworld.item;

import net.Alexator.hellworld.Hellworld;
import net.minecraft.world.item.Item;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

public class ModItems {
    public static final DeferredRegister<Item> ITEMS = DeferredRegister.create(ForgeRegistries.ITEMS, Hellworld.MOD_ID);

public  static  final RegistryObject<Item> SAKURITA = ITEMS.register("sakurita",()-> new Item(new Item.Properties().tab(ModCreativeModeTab.HELLWORD_TAB_ITEM)));
public  static  final RegistryObject<Item> SAKURAFLOWER = ITEMS.register("sakura_flower",()-> new Item(new Item.Properties().tab(ModCreativeModeTab.HELLWORD_TAB_ITEM)));
public  static  final RegistryObject<Item> ICON = ITEMS.register("icon",()-> new Item(new Item.Properties().tab(ModCreativeModeTab.HELLWORD_TAB_ITEM)));
    public static void  register(IEventBus eventBus){

        ITEMS.register(eventBus);
    }
}
