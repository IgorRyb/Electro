package electro.listeners;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class ListenerWebsite implements ActionListener {

    private final String PATH = "in progress...";

    @Override
    public void actionPerformed(ActionEvent e) {
        JOptionPane.showMessageDialog(null, PATH, "Website", JOptionPane.CLOSED_OPTION);
    }
}
