package electro.listeners;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class ListenerFaq implements ActionListener {

    private final String text = "���� ����������� ������������ ��� ������� ��������� ���������� �����������, ������ �� �������� ��������: \n " +
            "��������� ����������, ��������� ������, ���-�� ����������� � ���-�� ����. \n" +
            "������� �������: ((��. ���������� + ��. ������) * ����-�� ����) - (����-�� ����������� * ��. ������� * ����-�� ����)";

    @Override
    public void actionPerformed(ActionEvent e) {
        JOptionPane.showMessageDialog(null, text, "FAQ", JOptionPane.INFORMATION_MESSAGE);
    }
}
