package com.github.tamcl.gui;

import com.sun.awt.AWTUtilities;

import javax.swing.*;
import java.awt.*;

/**
 * Created by I331709 on 2/22/2017.
 * Main window JFrame
 */
public class MainWindow extends JFrame{

    private static MainWindow mainWindow = new MainWindow();

    private Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();

    private MainWindow () {
        initWindow();
        initComponent();
    }

    public static MainWindow get() {
        return MainWindow.mainWindow;
    }

    private void initWindow () {
        setTitle("TALauncher");
        setSize(new Dimension((int)(screenSize.width* 0.6), (int)(screenSize.height* 0.6)));
        setBounds((screenSize.width - getWidth())/2, (screenSize.height - getHeight())/2, getWidth(), getHeight());
        setLayout(null);
        setUndecorated(true);
        AWTUtilities.setWindowOpaque(this, false);
    }

    private void initComponent () {
        add(new WindowPane(getSize()));
    }

}
