package net.Alexator.hellworld.block;

import net.Alexator.hellworld.Hellworld;
import net.Alexator.hellworld.block.custom.HealingBlock;
import net.Alexator.hellworld.item.ModCreativeModeTab;
import net.Alexator.hellworld.item.ModItems;
import net.minecraft.client.tutorial.Tutorial;
import net.minecraft.util.valueproviders.UniformInt;
import net.minecraft.world.item.BlockItem;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.Item;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.DropExperienceBlock;
import net.minecraft.world.level.block.SoundType;
import net.minecraft.world.level.block.state.BlockBehaviour;
import net.minecraft.world.level.material.Material;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

import java.util.function.Supplier;

public class ModBlocks {

    public static final DeferredRegister<Block> BLOCKS =
            DeferredRegister.create(ForgeRegistries.BLOCKS, Hellworld.MOD_ID);

    public static final RegistryObject<Block> SAKURA_LOG = registerBlock("sakura_log",
            () -> new Block(BlockBehaviour.Properties.of(Material.WOOD).strength(6f).sound(SoundType.WOOD)), ModCreativeModeTab.HELLWORD_TAB_BLOCK);
    public static final RegistryObject<Block> HEALING_BLOCK= registerBlock("healing_block",
            () -> new HealingBlock(BlockBehaviour.Properties.of(Material.STONE).sound(SoundType.WOOD).requiresCorrectToolForDrops()), ModCreativeModeTab.HELLWORD_TAB_BLOCK);
    public static final RegistryObject<Block> SAKURA_LEAVES = registerBlock("sakura_leaves",
            () -> new Block(BlockBehaviour.Properties.of(Material.LEAVES).strength(2f).requiresCorrectToolForDrops().sound(SoundType.GRASS)), ModCreativeModeTab.HELLWORD_TAB_BLOCK);
    public static final RegistryObject<Block> SAKURA_PLANKS = registerBlock("sakura_planks",
            () -> new Block(BlockBehaviour.Properties.of(Material.WOOD).strength(4f).sound(SoundType.WOOD)), ModCreativeModeTab.HELLWORD_TAB_BLOCK);
    public static final RegistryObject<Block> SAKURA_SAPLING = registerBlock("sakura_sapling",
            () -> new Block(BlockBehaviour.Properties.of(Material.PLANT).strength(1f).sound(SoundType.GRASS)), ModCreativeModeTab.HELLWORD_TAB_BLOCK);

    public static final RegistryObject<Block> SAKURA_FLOWER = registerBlock("sakura_flower",
            () -> new Block(BlockBehaviour.Properties.of(Material.PLANT).strength(1f).sound(SoundType.GRASS)), ModCreativeModeTab.HELLWORD_TAB_BLOCK);

    private static <T extends Block> RegistryObject<T> registerBlock(String name, Supplier<T> block, CreativeModeTab tab) {
        RegistryObject<T> toReturn = BLOCKS.register(name, block);
        registerBlockItem(name, toReturn, tab);
        return toReturn;
    }

    private static <T extends Block> RegistryObject<Item> registerBlockItem(String name, RegistryObject<T> block,
                                                                            CreativeModeTab tab) {
        return ModItems.ITEMS.register(name, () -> new BlockItem(block.get(), new Item.Properties().tab(tab)));
    }

    public static void register(IEventBus eventBus) {
        BLOCKS.register(eventBus);
    }
}
