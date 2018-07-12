package prisma.mageslayer.items;

import net.minecraft.block.material.Material;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.entity.Entity;
import net.minecraft.entity.EntityLivingBase;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.item.ItemSword;
import prisma.mageslayer.MaterialHandler;

public class HarbringerSword extends ItemSword {

	
	
	
	
	
	public HarbringerSword(ToolMaterial material) {
		super(material);
		material =  MaterialHandler.ANTIMAGIC;
		this.setCreativeTab(CreativeTabs.COMBAT);
				}


	@Override
	public boolean hasEffect (ItemStack stack) {
		return true;
		
	}
	
	@Override 
	public boolean onLeftClickEntity(ItemStack stack, EntityPlayer player, Entity entity) {
		if (entity instanceof EntityPlayer) {
			EntityPlayer victim = (EntityPlayer) entity;
				if (victim.inventory.armorInventory != null) {
					for(int slot = 1; slot < 5; slot++) {
						if (victim.inventory.armorItemInSlot(slot) != null) {
							if (victim.inventory.armorItemInSlot(slot).isItemEnchanted()) {
								victim.inventory.armorItemInSlot(slot).removeSubCompound("ench");
							}
						}
						
					}
				}
			
		}
		
		return false;
		
		
	}



}