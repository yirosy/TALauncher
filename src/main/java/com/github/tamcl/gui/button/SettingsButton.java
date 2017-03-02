package com.github.tamcl.gui.button;

import com.github.tamcl.gui.image.ResourceImageLabel;

import javax.swing.*;
import java.awt.*;

/**
 * Created by I331709 on 3/2/2017.
 * Settings Button
 */
public class SettingsButton extends JButton{

    private Dimension parentSize = null;

    public SettingsButton(Dimension parentSize) {
        super(new ResourceImageLabel("/images/settings.png",
                new Dimension((int)(parentSize.height*0.053), (int)(parentSize.height*0.053)))
                .getIcon());
        this.parentSize = parentSize;
        initSettingsButton();
    }

    private void initSettingsButton () {
        setSize(new Dimension((int)(parentSize.height*0.053), (int)(parentSize.height*0.053)));
        setBounds((int)(parentSize.width*0.729),
                (int)(parentSize.height*0.265),
                getWidth(), getHeight());
        setOpaque(false);
        setBorder(null);
        setContentAreaFilled(false);
        setPressedIcon(new ResourceImageLabel("/images/settings_press.png",
                new Dimension((int)(parentSize.height*0.053), (int)(parentSize.height*0.053)))
                .getIcon());
        setRolloverIcon(new ResourceImageLabel("/images/settings_roll.png",
                new Dimension((int)(parentSize.height*0.053), (int)(parentSize.height*0.053)))
                .getIcon());
    }
}
