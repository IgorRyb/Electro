package electro.listeners;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class ListenerFaq implements ActionListener {

    private final String text = "Этот калькулятор предназначен для расчета стоимости проведения мероприятия, исходя из следущий факторов: \n " +
            "стоимость аппаратуры, стоимость аренды, кол-во посетителей и кол-во дней. \n" +
            "Формула расчета: ((ст. аппаратуры + ст. аренды) * коль-во дней) - (коль-во посетителей * ст. билетов * коль-во дней)";

    @Override
    public void actionPerformed(ActionEvent e) {
        JOptionPane.showMessageDialog(null, text, "FAQ", JOptionPane.INFORMATION_MESSAGE);
    }
}
