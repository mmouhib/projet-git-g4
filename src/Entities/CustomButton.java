package Entities;

import javax.swing.*;
import javax.swing.border.Border;
import java.awt.*;
import java.awt.event.*;

public class CustomButton extends JButton {

    // Attributes
    private String text;
    private Icon icon;
    private Color backgroundColor;
    private Color foregroundColor;
    private Font font;
    private Dimension size;
    private boolean enabled = true;
    private boolean visible = true;
    private ActionListener actionListener;

    // Constructors
    public CustomButton() {
        super();
    }

    public CustomButton(String text) {
        super(text);
        this.text = text;
    }

    public CustomButton(Icon icon) {
        super(icon);
        this.icon = icon;
    }

    public CustomButton(String text, Icon icon) {
        super(text, icon);
        this.text = text;
        this.icon = icon;
    }

    // Getters and Setters
    public String getText() {
        return text;
    }

    public void setText(String text) {
        this.text = text;
        super.setText(text);
    }

    public Icon getIcon() {
        return icon;
    }

    public void setIcon(Icon icon) {
        this.icon = icon;
        super.setIcon(icon);
    }

    public Color getBackgroundColor() {
        return backgroundColor;
    }

    public void setBackgroundColor(Color backgroundColor) {
        this.backgroundColor = backgroundColor;
        super.setBackground(backgroundColor);
    }

    public Color getForegroundColor() {
        return foregroundColor;
    }

    public void setForegroundColor(Color foregroundColor) {
        this.foregroundColor = foregroundColor;
        super.setForeground(foregroundColor);
    }

    public Font getFont() {
        return font;
    }

    public void setFont(Font font) {
        this.font = font;
        super.setFont(font);
    }

    public Dimension getSize() {
        return size;
    }

    public void setSize(Dimension size) {
        this.size = size;
        super.setSize(size);
    }

    public boolean isEnabled() {
        return enabled;
    }

    public void setEnabled(boolean enabled) {
        this.enabled = enabled;
        super.setEnabled(enabled);
    }

    public boolean isVisible() {
        return visible;
    }

    public void setVisible(boolean visible) {
        this.visible = visible;
        super.setVisible(visible);
    }

    // Event handling
    public void addActionListener(ActionListener listener) {
        actionListener = listener;
        super.addActionListener(listener);
    }

    public void removeActionListener(ActionListener listener) {
        actionListener = null;
        super.removeActionListener(listener);
    }

    // Additional methods
    public void setBorder(Border border) {
        super.setBorder(border);
    }

    public void setToolTipText(String tooltipText) {
        super.setToolTipText(tooltipText);
    }

    // Override paintComponent for custom painting
    @Override
    protected void paintComponent(Graphics g) {
        // Custom painting logic here
        super.paintComponent(g);
    }
}
