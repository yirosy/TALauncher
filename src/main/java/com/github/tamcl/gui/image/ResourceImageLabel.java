package com.github.tamcl.gui.image;

import javax.swing.*;
import java.awt.*;

/**
 * Created by I331709 on 3/1/2017.
 * Label used to display image in resource
 */
public class ResourceImageLabel extends JLabel {

    public ResourceImageLabel(String url, Dimension size) {
        super(new ImageIcon(Toolkit.getDefaultToolkit().getImage(
                ResourceImageLabel.class.getResource(url)).getScaledInstance(size.width, size.height, Image.SCALE_DEFAULT)));
    }
}
