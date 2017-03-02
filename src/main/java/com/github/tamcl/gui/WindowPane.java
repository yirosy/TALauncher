package com.github.tamcl.gui;

import com.github.tamcl.gui.button.CloseButton;
import com.github.tamcl.gui.button.SettingsButton;
import com.github.tamcl.gui.image.CentreImagePanel;
import com.github.tamcl.gui.image.LeftUpImagePanel;
import com.github.tamcl.gui.image.TitleImagePanel;

import javax.swing.*;
import java.awt.*;

/**
 * Created by I331709 on 2/23/2017.
 * Background pane
 */
class WindowPane extends JLayeredPane {

    private Dimension parentSize = null;

    WindowPane(Dimension parentSize) {
        super();
        this.parentSize = parentSize;
        initBackgroundPane();
        initComponent();
    }

    private void initBackgroundPane () {
        setBounds(0, 0, parentSize.width, parentSize.height);
        setLayout(null);
        setOpaque(false);
    }

    private void initComponent () {
        add(new CentreImagePanel(getSize()), new Integer(10));
        add(new LeftUpImagePanel(getSize()), new Integer(20));
        add(new TitleImagePanel(getSize()), new Integer(30));
        add(new CloseButton(getSize()), new Integer(25));
        add(new SettingsButton(getSize()),new Integer(24));
    }
}
