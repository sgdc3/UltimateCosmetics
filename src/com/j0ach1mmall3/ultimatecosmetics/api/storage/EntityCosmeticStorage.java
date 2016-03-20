package com.j0ach1mmall3.ultimatecosmetics.api.storage;

import com.j0ach1mmall3.jlib.inventory.GuiItem;
import com.j0ach1mmall3.ultimatecosmetics.Main;
import org.bukkit.entity.Creature;

import java.util.Arrays;
import java.util.EnumSet;

/**
 * @author j0ach1mmall3 (business.j0ach1mmall3@gmail.com)
 * @since 29/02/2016
 */
public final class EntityCosmeticStorage extends CosmeticStorage {
    private final EntityType type;
    private final EnumSet<EntityData> data;

    public EntityCosmeticStorage(Main plugin, String identifier, String permission, GuiItem guiItem, EntityType type, EnumSet<EntityData> data) {
        super(plugin, identifier, permission, guiItem);
        this.type = type;
        this.data = data;
    }

    public EntityType getType() {
        return this.type;
    }

    public EnumSet<EntityData> getData() {
        return this.data;
    }

    public enum EntityType {
        CREEPER("org.bukkit.entity.Creeper"),
        SKELETON("org.bukkit.entity.Skeleton"),
        SPIDER("org.bukkit.entity.Spider"),
        GIANT("org.bukkit.entity.Giant"),
        ZOMBIE("org.bukkit.entity.Zombie"),
        PIG_ZOMBIE("org.bukkit.entity.PigZombie"),
        ENDERMAN("org.bukkit.entity.Enderman"),
        CAVE_SPIDER("org.bukkit.entity.CaveSpider"),
        SILVERFISH("org.bukkit.entity.Silverfish"),
        BLAZE("org.bukkit.entity.Blaze"),
        WITHER("org.bukkit.entity.Wither"),
        WITCH("org.bukkit.entity.Witch"),
        ENDERMITE("org.bukkit.entity.Endermite"),
        GUARDIAN("org.bukkit.entity.Guardian"),
        SHULKER("org.bukkit.entity.Shulker"),
        PIG("org.bukkit.entity.Pig"),
        SHEEP("org.bukkit.entity.Sheep"),
        COW("org.bukkit.entity.Cow"),
        CHICKEN("org.bukkit.entity.Chicken"),
        WOLF("org.bukkit.entity.Wolf"),
        MUSHROOM_COW("org.bukkit.entity.MushroomCow"),
        SNOWMAN("org.bukkit.entity.Snowman"),
        OCELOT("org.bukkit.entity.Ocelot"),
        IRON_GOLEM("org.bukkit.entity.IronGolem"),
        HORSE("org.bukkit.entity.Horse"),
        RABBIT("org.bukkit.entity.Rabbit"),
        VILLAGER("org.bukkit.entity.Villager");
        private final String clazz;

        EntityType(String clazz) {
            this.clazz = clazz;
        }

        public Class<? extends Creature> getClazz() {
            try {
                return (Class<? extends Creature>) Class.forName(this.clazz);
            } catch (Exception e) {
                return null;
            }
        }
    }

    public enum EntityData {
        BABY(Type.BOOLEAN),
        BLACK(Type.COLOR, Type.CAT, Type.HORSE_COLOR, Type.RABBIT),
        BLACK_AND_WHITE(Type.RABBIT),
        BLACKSMITH(Type.PROFESSION),
        BLACK_DOTS(Type.HORSE_STYLE),
        BLUE(Type.COLOR),
        BROWN(Type.COLOR, Type.HORSE_COLOR, Type.RABBIT),
        BUTCHER(Type.PROFESSION),
        CHESTED(Type.BOOLEAN),
        CHESTNUT(Type.HORSE_COLOR),
        CREAMY(Type.HORSE_COLOR),
        CYAN(Type.COLOR),
        DARK_BROWN(Type.HORSE_COLOR),
        DIAMOND(Type.HORSE_ARMOR),
        DONKEY(Type.HORSE_VARIANT),
        FARMER(Type.PROFESSION),
        FIRE(Type.BOOLEAN),
        GRAY(Type.COLOR, Type.HORSE_COLOR),
        GREEN(Type.COLOR),
        GOLD(Type.HORSE_ARMOR, Type.RABBIT),
        HORSE(Type.HORSE_VARIANT),
        IRON(Type.HORSE_ARMOR),
        LIBRARIAN(Type.PROFESSION),
        LIGHT_BLUE(Type.COLOR),
        LIME(Type.COLOR),
        MAGENTA(Type.COLOR),
        MULE(Type.HORSE_VARIANT),
        NONE(Type.HORSE_STYLE),
        ORANGE(Type.COLOR),
        PINK(Type.COLOR),
        POWER(Type.BOOLEAN),
        PRIEST(Type.PROFESSION),
        PURPLE(Type.COLOR),
        RED(Type.CAT, Type.COLOR),
        SADDLE(Type.BOOLEAN),
        SALT_AND_PEPPER(Type.RABBIT),
        SHEARED(Type.BOOLEAN),
        SIAMESE(Type.CAT),
        SILVER(Type.COLOR),
        SKELETON_HORSE(Type.HORSE_VARIANT),
        TAMED(Type.BOOLEAN),
        THE_KILLER_BUNNY(Type.RABBIT),
        VILLAGER(Type.BOOLEAN),
        WHITEFIELD(Type.HORSE_STYLE),
        WHITE_DOTS(Type.HORSE_STYLE),
        WHITE(Type.COLOR, Type.HORSE_COLOR, Type.HORSE_STYLE, Type.RABBIT),
        WILD(Type.CAT),
        WITHER(Type.BOOLEAN),
        YELLOW(Type.COLOR),
        UNDEAD_HORSE(Type.HORSE_VARIANT);
        private final EnumSet<Type> types = EnumSet.noneOf(Type.class);

        EntityData(Type... types) {
            this.types.addAll(Arrays.asList(types));
        }

        public boolean isType(Type type) {
            return this.types.contains(type);
        }

        public enum Type {
            BOOLEAN,
            COLOR,
            CAT,
            PROFESSION,
            HORSE_ARMOR,
            HORSE_COLOR,
            HORSE_VARIANT,
            HORSE_STYLE,
            RABBIT
        }
    }
}
