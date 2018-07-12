package prisma.mageslayer.items;

import net.minecraft.item.Item;
import net.minecraftforge.event.RegistryEvent;
import net.minecraftforge.fml.common.eventhandler.SubscribeEvent;
import prisma.mageslayer.MaterialHandler;

public class Registry {

	@SubscribeEvent
	public void RegistryEvent(RegistryEvent.Register<Item> event) {
		 HarbringerSword sword = new HarbringerSword(MaterialHandler.ANTIMAGIC);
		event.getRegistry().registerAll(sword);
	}
	
}
