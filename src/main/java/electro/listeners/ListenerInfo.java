package electro.listeners;

import electro.service.impl.InfoWindowService;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class ListenerInfo implements ActionListener {

    private final String CREATORS = String.format("���������: �������� ������ ���-412� \n %s \n %s", "�������� �����", "����������� �����");

    private final String TITLE = "� ����������";

    @Override
    public void actionPerformed(ActionEvent e) {
        new InfoWindowService(CREATORS, TITLE).execute();
    }
}
