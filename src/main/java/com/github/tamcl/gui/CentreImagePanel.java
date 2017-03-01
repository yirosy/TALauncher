package com.github.tamcl.gui;

import javax.swing.*;
import java.awt.*;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.event.MouseMotionAdapter;

/**
 * Created by I331709 on 3/1/2017.
 * Panel of centre
 */
class CentreImagePanel extends JPanel {

    private Dimension parentSize = null;
    private int x;
    private int y;

    CentreImagePanel (Dimension parentSize) {
        super();
        this.parentSize = parentSize;
        initCentreImagePanel();
        initComponent();
    }

    private void initCentreImagePanel() {
        setSize(new Dimension((int)(parentSize.width* 0.6), (int)(parentSize.height* 0.6)));
        setBounds((parentSize.width - getWidth())/2, (parentSize.height - getHeight())/2, getWidth(), getHeight());
        setOpaque(false);
    }

    private void initComponent () {
        add(new ResourceImageLabel("/images/bkg.png", getSize()));
        addMouseListener(new MouseAdapter() {
            @Override
            public void mousePressed(MouseEvent mouseEvent) {
                super.mousePressed(mouseEvent);
                x= mouseEvent.getX();
                y= mouseEvent.getY();
            }
        });
        addMouseMotionListener(new MouseMotionAdapter() {
            @Override
            public void mouseDragged(MouseEvent mouseEvent) {
                super.mouseDragged(mouseEvent);
                Point windowLocation = MainWindow.get().getLocation();
                MainWindow.get().setLocation((int) (windowLocation.getX()+ mouseEvent.getX()- x),
                        (int) (windowLocation.getY()+ mouseEvent.getY()- y));
            }
        });
    }
}
