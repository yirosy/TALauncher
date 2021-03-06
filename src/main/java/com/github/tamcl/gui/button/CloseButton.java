package com.github.tamcl.gui.button;

import com.github.tamcl.gui.image.ResourceImageLabel;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

/**
 * Created by I331709 on 3/2/2017.
 * Close Button
 */
public class CloseButton extends JButton {

    private Dimension parentSize = null;

    public CloseButton (Dimension parentSize) {
        super(new ResourceImageLabel("/images/close.png",
                new Dimension((int)(parentSize.height*0.05), (int)(parentSize.height*0.05)))
                .getIcon());
        this.parentSize = parentSize;
        initCloseButton();
        initListener();
    }

    private void initCloseButton () {
        setSize(new Dimension((int)(parentSize.height*0.05), (int)(parentSize.height*0.05)));
        setBounds((int)(parentSize.width*0.767),
                (int)(parentSize.height*0.268),
                getWidth(), getHeight());
        setOpaque(false);
        setBorder(null);
        setContentAreaFilled(false);
        setPressedIcon(new ResourceImageLabel("/images/close_press.png",
                new Dimension((int)(parentSize.height*0.05), (int)(parentSize.height*0.05)))
                .getIcon());
        setRolloverIcon(new ResourceImageLabel("/images/close_roll.png",
                new Dimension((int)(parentSize.height*0.05), (int)(parentSize.height*0.05)))
                .getIcon());
    }

    private void initListener () {
        addActionListener(e -> System.exit(0));
    }
}
