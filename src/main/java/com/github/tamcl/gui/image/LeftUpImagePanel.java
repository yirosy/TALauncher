package com.github.tamcl.gui.image;


import javax.swing.*;
import java.awt.*;

/**
 * Created by I331709 on 3/1/2017.
 * Left up image panel
 */
public class LeftUpImagePanel extends JPanel {

    private Dimension parentSize = null;

    public LeftUpImagePanel(Dimension parentSize) {
        super();
        this.parentSize = parentSize;
        initLeftUpImagePanel();
        initComponent();
    }

    private void initLeftUpImagePanel () {
        setSize(new Dimension((int)(parentSize.width* 0.53), (int)(parentSize.height* 0.53)));
        setBounds(0, 0, getWidth(), getHeight());
        setOpaque(false);
    }

    private void initComponent() {
        add(new ResourceImageLabel("/images/left_up.png", getSize()));
    }
}
