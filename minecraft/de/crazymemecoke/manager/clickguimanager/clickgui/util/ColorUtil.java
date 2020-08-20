package de.crazymemecoke.manager.clickguimanager.clickgui.util;

import java.awt.Color;

import de.crazymemecoke.Client;

/**
 * Made by HeroCode it's free to use but you have to credit me
 *
 * @author HeroCode
 */
public class ColorUtil {

    public static Color getClickGUIColor() {
        return new Color((int) Client.instance().setMgr().getSettingByName("Red", Client.instance().modManager().getByName("ClickGUI")).getNum(),
                (int) Client.instance().setMgr().getSettingByName("Green", Client.instance().modManager().getByName("ClickGUI")).getNum(),
                (int) Client.instance().setMgr().getSettingByName("Blue", Client.instance().modManager().getByName("ClickGUI")).getNum());
    }
}
