package electro.listeners;

import electro.service.dao.InfoWindowDao;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class ListenerInfo implements ActionListener {

    private final String CREATORS = String.format("Создатели: студенты группы ЭАС-412с \n %s \n %s", "Рыбченко Игорь", "Нуриахметов Артур");

    private final String TITLE = "О создателях";

    @Override
    public void actionPerformed(ActionEvent e) {
        new InfoWindowDao(CREATORS, TITLE).execute();
    }
}
