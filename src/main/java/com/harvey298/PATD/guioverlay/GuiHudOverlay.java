package com.harvey298.PATD.guioverlay;

import com.harvey298.PATD.Main;
import com.harvey298.PATD.util.Reference;
import net.minecraft.client.Minecraft;
import net.minecraft.client.gui.Gui;
import net.minecraft.util.ResourceLocation;
import net.minecraftforge.client.event.RenderGameOverlayEvent;
import net.minecraftforge.fml.common.eventhandler.SubscribeEvent;

public class GuiHudOverlay extends Gui {

    //public void renderOverlay extends Gui {

        private final ResourceLocation backoverlay = new ResourceLocation(Reference.MOD_ID, "texture/darknessflamegrey.png");
        private final int overlayW = 100, OverlayH = 10;

        @SubscribeEvent
        public void renderOverlay(RenderGameOverlayEvent event) {
           if (event.getType() == RenderGameOverlayEvent.ElementType.TEXT) {
               Minecraft mc = Minecraft.getMinecraft();
               mc.renderEngine.bindTexture(backoverlay);
               drawTexturedModalRect(0, 0, 0, 0, overlayW, OverlayH);
               //int userhealth = mc.player.getMaxhealth();

           }
        }

    //}

}
