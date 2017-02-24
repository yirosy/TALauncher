package com.github.tamcl.gui;

import com.sun.awt.AWTUtilities;

import javax.swing.*;

/**
 * Created by I331709 on 2/22/2017.
 * Main window JFrame
 */
public class MainWindow extends JFrame{
    public MainWindow () {
        initWindow();
    }

    private void initWindow () {
        this.setTitle("test");
        this.setBounds(0, 0, 1200, 1000);
        this.setLayout(null);
        this.setUndecorated(true);
        AWTUtilities.setWindowOpaque(this, false);
    }

}
