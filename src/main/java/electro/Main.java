package electro;

import electro.model.GuiMain;

public class Main {

    public static GuiMain gui;

    private static final String NAME = "����������� ������� ��������� �����������. ��������";

    private static final String LABEL = "������� ������ ��� �������";

    public static void main(String[] args) {
        gui = new GuiMain(NAME, LABEL);
    }
}
