package electro.service.dao;

import electro.service.WindowService;

import javax.swing.JOptionPane;

public class ExitWindowService implements WindowService {

    private int exit;

    private String exitHat;

    private String exitLow;

    public ExitWindowService(String exitHat, String exitLow) {
        this.exitHat = exitHat;
        this.exitLow = exitLow;
    }

    public void execute() {
        exit = JOptionPane.showConfirmDialog(null,
                exitHat,
                exitLow,
                JOptionPane.YES_NO_OPTION,
                JOptionPane.WARNING_MESSAGE);

        if (JOptionPane.YES_OPTION == exit) {
            System.exit(1);
        }
    }
}
