package com.github.tamcl.gui.image;


import javax.swing.*;
import java.awt.*;

/**
 * Created by I331709 on 3/1/2017.
 * Panel of centre
 */
public class CentreImagePanel extends JPanel {

    private Dimension parentSize = null;
    private int x;
    private int y;

    public CentreImagePanel(Dimension parentSize) {
        super();
        this.parentSize = parentSize;
        initCentreImagePanel();
        initComponent();
    }

    private void initCentreImagePanel() {
        setSize(new Dimension((int)(parentSize.width* 0.6), (int)(parentSize.height* 0.6)));
        setBounds((parentSize.width - getWidth())/2,
                (int) ((parentSize.height - getHeight())/2 + parentSize.getHeight() * 0.05),
                getWidth(), getHeight());
        setOpaque(false);
    }

    private void initComponent () {
        add(new ResourceImageLabel("/images/bkg.png", getSize()));
    }
}
