package com.github.tamcl.gui;

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
    }
}
