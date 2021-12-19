//
// This class handles the bottom left side of the in-game mod hud.
// Author(s): TJ20201
//

package io.github.tj20201.mcfabricutilities.features;

import static io.github.tj20201.mcfabricutilities.MCFabricUtilities.CLIENT;
import io.github.tj20201.mcfabricutilities.MCFabricUtilities;

import net.minecraft.client.font.TextRenderer;
import net.minecraft.client.util.Window;
import net.minecraft.text.Text;
import net.minecraft.util.Formatting;

public class BottomLeftScreen {
    private static final TextRenderer textRenderer = CLIENT.textRenderer;
    private static final Window mainWindow = MCFabricUtilities.getWindow();
    
    public static void onRender() {
        renderText("§fFacing: §7YEET", 2);
        renderText("§fLocation: §7TEEY", 1);
    }
    
    private static void renderText(String text, int line) {
        textRenderer.draw(text, 5, (int) (mainWindow.getScaledHeight() - (textRenderer.fontHeight * line)), 0xffffff);
    }
}
