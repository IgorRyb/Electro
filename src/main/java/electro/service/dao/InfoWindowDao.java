package electro.service.dao;

import electro.service.WindowDao;

import javax.swing.*;

public class InfoWindowDao implements WindowDao {
    private String creators;

    private String title;

    public InfoWindowDao(String creators, String title) {
        this.creators = creators;
        this.title = title;
    }

    public void execute() {
        JOptionPane.showMessageDialog(null, creators, title, JOptionPane.INFORMATION_MESSAGE);
    }
}
