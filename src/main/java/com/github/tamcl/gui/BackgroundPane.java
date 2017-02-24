package com.github.tamcl.gui;

import javax.swing.*;
import java.awt.*;

/**
 * Created by I331709 on 2/23/2017.
 * Background pane
 */
public class BackgroundPane extends JLayeredPane {

    public BackgroundPane() {
        super();
        this.initBackgroundPane();
    }

    private void initBackgroundPane () {
        this.setBounds(0 , 0, 1200, 1000);
        this.setLayout(null);
        JPanel bgPanel = new JPanel();
        bgPanel.setBounds(200, 200, 900, 500);
        bgPanel.setOpaque(false);
        this.add(bgPanel);

        JLabel bgLabel = new JLabel(new ImageIcon(Toolkit.getDefaultToolkit().getImage(
                getClass().getResource("/images/bkg.png"))));
        bgPanel.setBorder(null);
        bgLabel.setVisible(true);
        bgPanel.add(bgLabel);
        this.setBackground(Color.black);
    }
}
