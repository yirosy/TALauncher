package com.github.tamcl.gui.button;

import com.github.tamcl.gui.image.ResourceImageLabel;

import javax.swing.*;
import java.awt.*;

/**
 * Created by I331709 on 3/2/2017.
 */
public class CloseButton extends JButton {

    private Dimension parentSize = null;

    public CloseButton (Dimension parentSize) {
        super(new ResourceImageLabel("/images/close.png",
                new Dimension((int)(parentSize.height*0.05), (int)(parentSize.height*0.05)))
                .getIcon());
        this.parentSize = parentSize;
        initCloseButton();
    }

    private void initCloseButton () {
        setSize(new Dimension((int)(parentSize.height*0.05), (int)(parentSize.height*0.05)));
        setBounds((int)(parentSize.width*0.77),
                (int)(parentSize.height*0.268),
                getWidth(), getHeight());
        setOpaque(false);
        setBorder(null);
        setContentAreaFilled(false);
    }
}
