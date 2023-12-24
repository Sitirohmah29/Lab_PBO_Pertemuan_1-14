package com.ibik.pbo.Pembelajaran;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class MovingImage extends JFrame implements KeyListener {

    private ImageIcon imageIcon;
    private JLabel imageLabel;

    public MovingImage() {
        setTitle("Moving Image");
        setSize(400, 400);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLocationRelativeTo(null);

        // Load initial image
        imageIcon = new ImageIcon("C:\\Users\\ASUS\\Pictures\\rocketregular_106310.png");
        imageLabel = new JLabel(imageIcon);
        add(imageLabel);

        addKeyListener(this);
        setFocusable(true);
    }

    public void keyPressed(KeyEvent e) {
        int keyCode = e.getKeyCode();

        int x = imageLabel.getX();
        int y = imageLabel.getY();

        int step = 10;

        switch (keyCode) {
            case KeyEvent.VK_A:
            case KeyEvent.VK_LEFT:
                if (x - step >= 0) {
                    imageLabel.setLocation(x - step, y);
                }
                break;

            case KeyEvent.VK_D:
            case KeyEvent.VK_RIGHT:
                if (x + step + imageLabel.getWidth() <= getWidth()) {
                    imageLabel.setLocation(x + step, y);
                }
                break;

            case KeyEvent.VK_W:
            case KeyEvent.VK_UP:
                if (y - step >= 0) {
                    imageLabel.setLocation(x, y - step);
                }
                break;

            case KeyEvent.VK_S:
            case KeyEvent.VK_DOWN:
                if (y + step + imageLabel.getHeight() <= getHeight()) {
                    imageLabel.setLocation(x, y + step);
                }
                break;
        }

        // Check if the image is at the edge of the frame
        if (imageLabel.getX() <= 0 || imageLabel.getX() + imageLabel.getWidth() >= getWidth()
                || imageLabel.getY() <= 0 || imageLabel.getY() + imageLabel.getHeight() >= getHeight()) {
            changeImage();
        }
    }

    private void changeImage() {
        // Change the image when it reaches the edge
        // You can modify this part to load a different image
        // For example: imageIcon = new ImageIcon("path/to/your/another_image.png");
        // Then, set the new icon to the label: imageLabel.setIcon(imageIcon);
        JOptionPane.showMessageDialog(this, "Image reached the edge. Changing image.");
    }

    // Other KeyListener methods (keyTyped, keyReleased)
    public void keyTyped(KeyEvent e) {
    }

    public void keyReleased(KeyEvent e) {
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> {
            new MovingImage().setVisible(true);
        });
    }
}
