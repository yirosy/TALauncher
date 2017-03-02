package com.github.tamcl.gui.image;

import com.github.tamcl.gui.MainWindow;

import javax.swing.*;
import java.awt.*;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.event.MouseMotionAdapter;

/**
 * Created by I331709 on 3/1/2017.
 * Title panel
 */
public class TitleImagePanel extends JPanel {

    private Dimension parentSize = null;
    private int x= 0;
    private int y= 0;

    public TitleImagePanel(Dimension parentSize) {
        super();
        this.parentSize = parentSize;
        initTitleImagePanel();
        initComponent();
    }

    private void initTitleImagePanel () {
        setSize(new Dimension((int)(parentSize.width * 0.43), (int)(parentSize.height* 0.15)));
        setBounds((parentSize.width - getWidth())/2, (int) (parentSize.height*0.2),getWidth(),getHeight());
        setOpaque(false);
    }

    private void initComponent () {
        JLabel title = new ResourceImageLabel("/images/title.png", getSize());
        title.addMouseListener(new MouseAdapter() {
            @Override
            public void mousePressed(MouseEvent mouseEvent) {
                super.mousePressed(mouseEvent);
                x= mouseEvent.getX();
                y= mouseEvent.getY();
            }
        });
        title.addMouseMotionListener(new MouseMotionAdapter() {
            @Override
            public void mouseDragged(MouseEvent mouseEvent) {
                super.mouseDragged(mouseEvent);
                Point windowLocation = MainWindow.get().getLocation();
                MainWindow.get().setLocation((int) (windowLocation.getX()+ mouseEvent.getX()- x),
                        (int) (windowLocation.getY()+ mouseEvent.getY()- y));
            }
        });
        add(title);
    }
}
