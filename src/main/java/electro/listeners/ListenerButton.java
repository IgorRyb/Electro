package electro.listeners;

import electro.service.dao.ExitWindowDao;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class ListenerButton implements ActionListener {

    @Override
    public void actionPerformed(ActionEvent e) {
        String exitHat = "�� ������ ����� �� ���������?";
        String exitLow = "���������� ������ ����������";
        new ExitWindowDao(exitHat, exitLow).execute();
    }

}
