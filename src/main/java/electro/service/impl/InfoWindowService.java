package electro.service.impl;

import electro.service.WindowService;

import javax.swing.*;

public class InfoWindowService implements WindowService {
    private String creators;

    private String title;

    public InfoWindowService(String creators, String title) {
        this.creators = creators;
        this.title = title;
    }

    public void execute() {
        JOptionPane.showMessageDialog(null, creators, title, JOptionPane.INFORMATION_MESSAGE);
    }
}
