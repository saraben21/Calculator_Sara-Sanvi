/**
 * Calculator 2.0
 * By Sara B. and Sanvi P.
 * Current Progress: GUI for Calculator is made and Buttons are initialized with action listener
 *
 */


import java.awt.*;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import javax.swing.*;
import javax.swing.JButton;
import javax.swing.border.MatteBorder;
import Calculator.Math;
import Calculator.Math.OPERATOR;

public class CalculatorGUI extends JFrame {
    public static void main(String[] args) {
        JFrame jframe = new JFrame("CalculatorGUI");
        jframe.setContentPane(new CalculatorGUI().panel1);
        jframe.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        jframe.pack();
        jframe.setVisible(true);
    }
    private JButton a1Button;
    private JButton a2Button;
    private JButton a3Button;
    private JButton a4Button;
    private JButton a5Button;
    private JButton a6Button;
    private JButton a7Button;
    private JButton a8Button;
    private JButton a9Button;
    private JButton a0Button;
    private JButton button11;
    private JButton button12;
    private JButton button13;
    private JButton button14;
    private JButton xButton;
    private JButton x2Button;
    private JButton sinButton;
    private JButton cosButton;
    private JButton tanButton;
    private JButton cotButton;
    private JButton cscButton;
    private JButton secButton;
    private JPanel panel1;
    private final JLabel calcArea = new JLabel("");
    private boolean initialCalcAreaInputState;





    private void updateCalcArea(String string) {
        if (this.initialCalcAreaInputState) {
            this.calcArea.setText(string);
            this.initialCalcAreaInputState = false;
        } else {
            JLabel var10000 = this.calcArea;
            String var10001 = this.calcArea.getText();
            var10000.setText(var10001 + string);
        }

    }

    //initialized method
    public CalculatorGUI(){

        a1Button.addActionListener((e) -> {
            this.updateCalcArea(a1Button.getText());
        });
        a2Button.addActionListener((e) -> {
            this.updateCalcArea(a1Button.getText());
        });
        a3Button.addActionListener((e) -> {
            this.updateCalcArea(a1Button.getText());
        });
        a4Button.addActionListener((e) -> {
            this.updateCalcArea(a1Button.getText());
        });
        a4Button.addActionListener((e) -> {
            this.updateCalcArea(a1Button.getText());
        });
        a5Button.addActionListener((e) -> {
            this.updateCalcArea(a1Button.getText());
        });
        a6Button.addActionListener((e) -> {
            this.updateCalcArea(a1Button.getText());
        });
        a7Button.addActionListener((e) -> {
            this.updateCalcArea(a1Button.getText());
        });
        a8Button.addActionListener((e) -> {
            this.updateCalcArea(a1Button.getText());
        });
        a9Button.addActionListener((e) -> {
            this.updateCalcArea(a1Button.getText());
        });
        a0Button.addActionListener((e) -> {
            this.updateCalcArea(a1Button.getText());
        });
        button11.addActionListener((e) -> {
            this.updateCalcArea(a1Button.getText());
        });
        button12.addActionListener((e) -> {
            this.updateCalcArea(a1Button.getText());
        });
        button13.addActionListener((e) -> {
            this.updateCalcArea(a1Button.getText());
        });
        button14.addActionListener((e) -> {
            this.updateCalcArea(a1Button.getText());
        });
        xButton.addActionListener((e) -> {
            this.updateCalcArea(a1Button.getText());
        });
        x2Button.addActionListener((e) -> {
            this.updateCalcArea(a1Button.getText());
        });
        sinButton.addActionListener((e) -> {
            this.updateCalcArea(a1Button.getText());
        });
        cosButton.addActionListener((e) -> {
            this.updateCalcArea(a1Button.getText());
        });
        tanButton.addActionListener((e) -> {
            this.updateCalcArea(a1Button.getText());
        });
        cotButton.addActionListener((e) -> {
            this.updateCalcArea(a1Button.getText());
        });
        cscButton.addActionListener((e) -> {
            this.updateCalcArea(a1Button.getText());
        });
        secButton.addActionListener((e) -> {
            this.updateCalcArea(a1Button.getText());
        });


    }


}









