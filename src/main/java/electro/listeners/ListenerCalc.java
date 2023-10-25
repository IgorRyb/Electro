package electro.listeners;

import electro.Main;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Arrays;
import java.util.regex.Pattern;

public class ListenerCalc implements ActionListener {

    private JTextField fieldVisitors, fieldRentPrice, fieldTicketPrice, fieldEquipmentPrice;

    private double countOfVisitors, rentPrice, ticketPrice, equipmentPrice;

    @Override
    public void actionPerformed(ActionEvent e) {
        double result = 0;
        fieldVisitors = Main.gui.getParam();
        fieldRentPrice = Main.gui.getParam2();
        fieldTicketPrice = Main.gui.getParam3();
        fieldEquipmentPrice = Main.gui.getParam4();
        mapToDouble();
        Double days = checkDays();
        result = (((equipmentPrice + rentPrice) * days) - (countOfVisitors * ticketPrice * days));
        Main.gui.getOutputResult().setText("" + result);
    }

    private double checkDays() {
        String item = (String) Main.gui.getNumberOfDays().getSelectedItem();
        double days = 1;
        if (item.equals(Main.gui.getDaysArr()[1])) {
            days = 2;
        } else if (item == Main.gui.getDaysArr()[2]) {
            days = 3;
        } else if (item == Main.gui.getDaysArr()[3]) {
            days = 4;
        } else if (item == Main.gui.getDaysArr()[4]) {
            days = 5;
        } else if (item == Main.gui.getDaysArr()[5]) {
            days = 6;
        } else if (item == Main.gui.getDaysArr()[6]) {
            days = 7;
        }
        return days;
    }

    private void mapToDouble() {
        countOfVisitors = Double.parseDouble(fieldVisitors.getText());
        rentPrice = Double.parseDouble(fieldRentPrice.getText());
        ticketPrice = Double.parseDouble(fieldTicketPrice.getText());
        equipmentPrice = Double.parseDouble(fieldEquipmentPrice.getText());
    }

}
