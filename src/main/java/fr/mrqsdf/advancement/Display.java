package fr.mrqsdf.advancement;

import org.bukkit.inventory.ItemStack;

public class Display {

    public String name, title, description, background, frame;
    public Icon icon;
    public boolean showToast = true, announceToChat = true, hidden = false;


    public Display(String name, String title, String description, Icon icon, String background, Frame frame) {
        this.name = name;
        this.title = title;
        this.description = description;
        this.icon = icon;
        this.background = background;
        this.frame = frame.getFrame();
    }

    public Display(String name, String title, String description, Icon icon, BackGround background, Frame frame) {
        this.name = name;
        this.title = title;
        this.description = description;
        this.icon = icon;
        this.background = background.getBackground();
        this.frame = frame.getFrame();
    }
    public Display(String name, String title, String description, Icon icon, BackGround background, Frame frame, boolean showToast, boolean announceToChat, boolean hidden) {
        this.name = name;
        this.title = title;
        this.description = description;
        this.icon = icon;
        this.background = background.getBackground();
        this.frame = frame.getFrame();
        this.showToast = showToast;
        this.announceToChat = announceToChat;
        this.hidden = hidden;
    }

}
