package electro;

import electro.model.GuiMain;

public class Main {

    public static GuiMain gui;

    private static final String NAME = "Калькулятор расчета стоимости мероприятия. Выставка";

    private static final String LABEL = "Введите данные для расчета";

    public static void main(String[] args) {
        gui = new GuiMain(NAME, LABEL);
    }
}
