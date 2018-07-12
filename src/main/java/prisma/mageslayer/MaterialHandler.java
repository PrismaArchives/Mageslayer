package prisma.mageslayer;

import net.minecraft.init.SoundEvents;
import net.minecraft.item.Item.ToolMaterial;
import net.minecraft.item.ItemArmor.ArmorMaterial;
import net.minecraftforge.common.util.EnumHelper;

public class MaterialHandler {
public static ToolMaterial ANTIMAGIC = EnumHelper.addToolMaterial("antimagic", 3, 3000, 7.0F, 3.0F, 0);
//public static ArmorMaterial ANTIMAGIC_ARMOUR = EnumHelper.addArmorMaterial("antimagic", "antimagic", 3000, null, 0, SoundEvents.ITEM_ARMOR_EQUIP_IRON, 2);
}
