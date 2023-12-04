package electro.model;

import electro.listeners.*;

import java.awt.*;
import java.awt.event.ActionListener;
import java.util.regex.Pattern;

import javax.swing.*;


public class GuiMain {

    private JLabel textInfo = new JLabel("Предполагаемое коль-во посетителей (в день):");
    private JLabel textInfo2 = new JLabel("Стоимость аренды (в день):");
    private JLabel textInfo3 = new JLabel("Стоимость входного билета:");
    private JLabel textInfo4 = new JLabel("Стоимость аренды аппаратуры: (в день)");
    private JLabel textInfo5 = new JLabel("Коль-во рабочих дней");
    private JLabel outputResult;

    private JTextField param = new JTextField("");
    private JTextField param2 = new JTextField("");
    private JTextField param3 = new JTextField("");
    private JTextField param4 = new JTextField("");

    private String[] daysArr = {"1 день", "2 дня", "3 дня"
            , "4 дня", "5 дней", "6 дней", "7 дней"};
    private JComboBox numberOfDays = new JComboBox(daysArr);

    private JFrame main_GUI;
    private JPanel main_panel;
    private final String TITLE = "ourElectro";

    public GuiMain(String name, String label) {
        this.main_GUI = new JFrame(TITLE);
        this.main_GUI.setTitle(name);
        this.main_GUI.setBounds(500, 400, 800, 600);
        this.main_GUI.setResizable(false);

        main_panel = new JPanel();
        main_panel.setLayout(null);
        main_panel.setBackground(Color.CYAN);
        main_GUI.add(main_panel);

        addTextInfoLabelsOnPanel();
        addTextFieldsOnPanelAndSetLimit();

        JLabel jLabel = createLabelOnPanel(label, main_panel);
        setBoundsForLabel(jLabel, 60,0,300,30);

        JLabel labelOutput = createLabelOnPanel("Стоимость мероприятия за неделю: ", main_panel);
        setBoundsForLabel(labelOutput, 220,360,300,30);

        outputResult = createLabelOnPanel("", main_panel);
        outputResult.setEnabled(false);
        setBoundsForLabel(outputResult, 450,360, 250,30);

        JButton button = createButtonOnPanel("Расчет оплаты", new ListenerCalc(), main_panel);
        setBoundsForButton(button,50, 350,130,50);

        JButton buttonExit = createButtonOnPanel("Выход", new ListenerButton(), main_panel);
        setBoundsForButton(buttonExit, 420,480,130,50);

        JButton infoButton = createButtonOnPanel("О создателях", new ListenerInfo(), main_panel);
        setBoundsForButton(infoButton, 600, 480, 130, 50);

        JButton website = createButtonOnPanel("Ссылка на сайт", new ListenerWebsite(), main_panel);
        setBoundsForButton(website, 30, 480, 130, 50);

        JButton faq = createButtonOnPanel("FAQ", new ListenerFaq(), main_panel);
        setBoundsForButton(faq, 220, 480, 130, 50);

        main_GUI.setVisible(true);
        main_GUI.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }

    private InputVerifier limit() {
        InputVerifier inputVerifier = new InputVerifier() {
            @Override
            public boolean verify(JComponent input) {
                JTextField textField = (JTextField) input;
                return Pattern.matches("[^a-zA-Z]+", textField.getText());
            }
            public boolean shouldYieldFocus(JComponent source, JComponent target) {
                return verify(source);
            }
        };
        return inputVerifier;
    }

    private void addTextFieldsOnPanelAndSetLimit() {
        main_panel.add(param).setBounds(400, 60, 150, 30);
        main_panel.add(param2).setBounds(400, 120, 150, 30);
        main_panel.add(param3).setBounds(400, 180, 150, 30);
        main_panel.add(param4).setBounds(400, 240, 150 ,30);
        main_panel.add(numberOfDays).setBounds(400, 300, 150, 30);
        param.setInputVerifier(limit());
        param2.setInputVerifier(limit());
        param3.setInputVerifier(limit());
        param4.setInputVerifier(limit());
    }

    private void addTextInfoLabelsOnPanel() {
        main_panel.add(textInfo).setBounds(50, 50, 290, 50);
        main_panel.add(textInfo2).setBounds(50, 110, 270, 50);
        main_panel.add(textInfo3).setBounds(50, 170, 270, 50);
        main_panel.add(textInfo4).setBounds(50, 230, 270, 50);
        main_panel.add(textInfo5).setBounds(50, 290, 270, 50);
    }

    private JLabel createLabelOnPanel(String title, JPanel panel) {
        JLabel label = new JLabel(title);
        panel.add(label);
        return label;
    }

    private void setBoundsForLabel(JLabel jLabel, int x, int y, int width, int height) {
        jLabel.setBounds(x, y, width, height);
    }

    private JButton createButtonOnPanel(String title, ActionListener actionListener, JPanel jPanel) {
        JButton button = new JButton(title);
        jPanel.add(button);
        button.addActionListener(actionListener);
        return button;
    }

    private void setBoundsForButton(JButton button, int x, int y, int width, int height) {
        button.setBounds(x, y, width, height);
    }

    public JLabel getOutputResult() {
        return outputResult;
    }

    public void setOutputResult(JLabel outputResult) {
        this.outputResult = outputResult;
    }

    public JComboBox getNumberOfDays() {
        return numberOfDays;
    }

    public void setNumberOfDays(JComboBox numberOfDays) {
        this.numberOfDays = numberOfDays;
    }

    public JTextField getParam() {
        return param;
    }

    public JTextField getParam2() {
        return param2;
    }

    public JTextField getParam3() {
        return param3;
    }

    public JTextField getParam4() {
        return param4;
    }

    public String[] getDaysArr() {
        return daysArr;
    }

}
