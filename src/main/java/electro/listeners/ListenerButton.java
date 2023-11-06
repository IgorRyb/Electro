package electro.listeners;

import electro.service.dao.ExitWindowService;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class ListenerButton implements ActionListener {

    @Override
    public void actionPerformed(ActionEvent e) {
        String exitHat = "Вы хотите выйти из программы?";
        String exitLow = "Завершение работы пррограммы";
        new ExitWindowService(exitHat, exitLow).execute();
    }

}
