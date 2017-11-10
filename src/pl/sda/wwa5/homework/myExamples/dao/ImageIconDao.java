package pl.sda.wwa5.homework.myExamples.dao;

import javax.swing.*;
import java.awt.*;
import java.io.File;
import java.io.FileNotFoundException;

public class ImageIconDao {

    private ImageIcon imageIcon;
    private String iconFilename;
    int resizeFactor;

    public ImageIconDao(String iconFilename, int resizeFactor) {
        this.imageIcon = imageIcon;
        this.iconFilename = iconFilename;
        this.resizeFactor = resizeFactor;
        try {
            this.imageIcon = readImageFile(iconFilename);
        } catch (FileNotFoundException e) {
            this.imageIcon = null;
        }
    }

    private ImageIcon readImageFile(String iconFilename) throws FileNotFoundException {
        ImageIcon icon;

        File imageFile = new File(iconFilename);
        if (imageFile.isFile()) {
            icon = new ImageIcon(iconFilename);
            icon = resizeIcon(icon,this.resizeFactor);
            return icon;
        } else throw new FileNotFoundException();
    }

    private ImageIcon resizeIcon(ImageIcon icon, int resizeFactor) {
        Image img = icon.getImage();
        Image resizedImage = img.getScaledInstance(resizeFactor, resizeFactor,  java.awt.Image.SCALE_SMOOTH);
        return new ImageIcon(resizedImage);
    }

    public ImageIcon getImageIcon() {
        return imageIcon;
    }
}
