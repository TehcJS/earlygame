package jayceecreates.earlygame.init;

import jayceecreates.earlygame.armor.BaseArmor;
import jayceecreates.earlygame.armor.CopperArmorBase;
import jayceecreates.earlygame.item.*;
import jayceecreates.earlygame.item.tool.base_tools.*;
import jayceecreates.earlygame.item.tool.flint_tier.*;
import net.minecraft.entity.EquipmentSlot;
import net.minecraft.item.ArmorMaterial;
import net.minecraft.item.Item;
import net.minecraft.item.ToolMaterials;
import net.minecraft.util.Identifier;
import net.minecraft.util.registry.Registry;

public class ItemsInit {

    // plant
    public static final Item PLANT_FIBER = new Item(new Item.Settings().group(ModItemGroup.EARLYGAME));
    public static final Item LASHING = new Item(new Item.Settings().group(ModItemGroup.EARLYGAME));

    // flint
    public static final Item FLINT_SHARD = new Item(new Item.Settings().group(ModItemGroup.EARLYGAME));
    public static final Item FLINT_KNIFE = new FlintKnife(new FlintToolBase());
    public static final Item FLINT_PICKAXE = new FlintPickaxe(new FlintToolBase());
    public static final Item FLINT_AXE = new FlintAxe(new FlintToolBase());
    public static final Item FLINT_SAW = new FlintSaw(new FlintToolBase());

    // copper
    public static final Item COPPER_INGOT = new Item(new Item.Settings().group(ModItemGroup.EARLYGAME));
    public static final Item COPPER_NUGGET = new Item(new Item.Settings().group(ModItemGroup.EARLYGAME));
    public static final ArmorMaterial COPPER_ARMOR = new CopperArmorBase();
    public static final Item COPPER_SWORD = new SwordBase(new CopperToolBase());
    public static final Item COPPER_KNIFE = new KnifeBase(new CopperToolBase());
    public static final Item COPPER_SHOVEL = new ShovelBase(new CopperToolBase());
    public static final Item COPPER_PICKAXE = new PickaxeBase(new CopperToolBase());
    public static final Item COPPER_AXE = new AxeBase(new CopperToolBase());
    public static final Item COPPER_SAW = new SawBase(new CopperToolBase());
    public static final Item COPPER_HOE = new HoeBase(new CopperToolBase());

    // iron
    public static final Item IRON_KNIFE = new KnifeBase(ToolMaterials.IRON);
    public static final Item IRON_SAW = new SawBase(ToolMaterials.IRON);

    // gold
    public static final Item GOLDEN_KNIFE = new KnifeBase(ToolMaterials.GOLD);
    public static final Item GOLDEN_SAW = new SawBase(ToolMaterials.GOLD);

    // diamond
    public static final Item DIAMOND_KNIFE = new KnifeBase(ToolMaterials.DIAMOND);
    public static final Item DIAMOND_SAW = new SawBase(ToolMaterials.DIAMOND);

    // netherite
    public static final Item NETHERITE_KNIFE = new KnifeBase(ToolMaterials.NETHERITE);
    public static final Item NETHERITE_SAW = new SawBase(ToolMaterials.NETHERITE);

    public static void init() {

        // plant
        Registry.register(Registry.ITEM, new Identifier("earlygame", "plant_fiber"), PLANT_FIBER);
        Registry.register(Registry.ITEM, new Identifier("earlygame", "lashing"), LASHING);

        // flint
        Registry.register(Registry.ITEM, new Identifier("earlygame", "flint_shard"), FLINT_SHARD);
        Registry.register(Registry.ITEM, new Identifier("earlygame", "flint_pickaxe"), FLINT_PICKAXE);
        Registry.register(Registry.ITEM, new Identifier("earlygame", "flint_axe"), FLINT_AXE);
        Registry.register(Registry.ITEM, new Identifier("earlygame", "flint_knife"), FLINT_KNIFE);
        Registry.register(Registry.ITEM, new Identifier("earlygame", "flint_saw"), FLINT_SAW);

        // copper
        Registry.register(Registry.ITEM, new Identifier("earlygame", "copper_ingot"), COPPER_INGOT);
        Registry.register(Registry.ITEM, new Identifier("earlygame", "copper_nugget"), COPPER_NUGGET);
        Registry.register(Registry.ITEM, new Identifier("earlygame", "copper_helmet"), new BaseArmor(COPPER_ARMOR, EquipmentSlot.HEAD));
        Registry.register(Registry.ITEM, new Identifier("earlygame", "copper_chestplate"), new BaseArmor(COPPER_ARMOR, EquipmentSlot.CHEST));
        Registry.register(Registry.ITEM, new Identifier("earlygame", "copper_leggings"), new BaseArmor(COPPER_ARMOR, EquipmentSlot.LEGS));
        Registry.register(Registry.ITEM, new Identifier("earlygame", "copper_boots"), new BaseArmor(COPPER_ARMOR, EquipmentSlot.FEET));
        Registry.register(Registry.ITEM, new Identifier("earlygame", "copper_sword"), COPPER_SWORD);
        Registry.register(Registry.ITEM, new Identifier("earlygame", "copper_knife"), COPPER_KNIFE);
        Registry.register(Registry.ITEM, new Identifier("earlygame", "copper_shovel"), COPPER_SHOVEL);
        Registry.register(Registry.ITEM, new Identifier("earlygame", "copper_pickaxe"), COPPER_PICKAXE);
        Registry.register(Registry.ITEM, new Identifier("earlygame", "copper_axe"), COPPER_AXE);
        Registry.register(Registry.ITEM, new Identifier("earlygame", "copper_saw"), COPPER_SAW);
        Registry.register(Registry.ITEM, new Identifier("earlygame", "copper_hoe"), COPPER_HOE);

        // iron
        Registry.register(Registry.ITEM, new Identifier("earlygame", "iron_knife"), IRON_KNIFE);
        Registry.register(Registry.ITEM, new Identifier("earlygame", "iron_saw"), IRON_SAW);

        // gold
        Registry.register(Registry.ITEM, new Identifier("earlygame", "golden_knife"), GOLDEN_KNIFE);
        Registry.register(Registry.ITEM, new Identifier("earlygame", "golden_saw"), GOLDEN_SAW);

        // diamond
        Registry.register(Registry.ITEM, new Identifier("earlygame", "diamond_knife"), DIAMOND_KNIFE);
        Registry.register(Registry.ITEM, new Identifier("earlygame", "diamond_saw"), DIAMOND_SAW);

        // netherite (prefix is dumb please replace it with ancient prefix)
        Registry.register(Registry.ITEM, new Identifier("earlygame", "netherite_knife"), NETHERITE_KNIFE);
        Registry.register(Registry.ITEM, new Identifier("earlygame", "netherite_saw"), NETHERITE_SAW);

    }

    
}