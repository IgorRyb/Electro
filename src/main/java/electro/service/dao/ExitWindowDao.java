package electro.service.dao;

import electro.service.WindowDao;

import javax.swing.JOptionPane;

public class ExitWindowDao implements WindowDao {

    private int exit;

    private String exitHat;

    private String exitLow;

    public ExitWindowDao(String exitHat, String exitLow) {
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
