package com.github.tamcl.gui;

import javax.swing.*;
import java.awt.*;

/**
 * Created by I331709 on 2/23/2017.
 */
public class BackgroundPane extends JLayeredPane {

    public BackgroundPane() {
        super();
        this.initBackgroundPane();
    }

    private void initBackgroundPane () {
        this.setBounds(0 , 0, 200, 200);
        this.setLayout(null);
        JPanel bgPanel = new JPanel();
        bgPanel.setBounds(0, 0, 200, 200);
        this.add(bgPanel);
        JLabel bgLabel = new JLabel(new ImageIcon(Toolkit.getDefaultToolkit().getImage(
                getClass().getResource("/images/bkg.png"))));
        bgLabel.setSize(200,200);
        bgLabel.setBackground(Color.black);
        //bgPanel.setBackground(Color.black);
        bgLabel.setVisible(true);
        bgPanel.add(bgLabel);
        this.setBackground(Color.black);
    }
}
