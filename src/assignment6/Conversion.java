package assignment6;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Conversion extends JFrame {
    private JPanel panel1;
    private JTextField fahrenheit;
    private JTextField pound;
    private JTextField gallon;
    private JTextField mile;
    private JTextField liter;
    private JTextField centigrade;
    private JTextField kilogram;
    private JTextField kilometer;
    private JButton convertButton;
    public final static double MILE_2_KILOMETER = 1.6093;
    public final static double POUND_2_KILOGRAM = 0.4536;
    public final static double GALLON_2_LITER = 3.7854;


    public Conversion() {
        // Default visibility is false. You have enabled visibility true
        setVisible(true);
        // Terminates the Application when the frame is closed.
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setTitle("Metric Conversion Assistant");
        // Provide the frame width and height
        setSize(500, 400);
        // Make your screen center
        setLocationRelativeTo(null);
        setResizable(true);// If you wish
        setContentPane(panel1);
        convertButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                double mileVal = Double.parseDouble(mile.getText());
                double kilometerVal = Double.parseDouble(kilometer.getText());
                if(mileVal != 0.0){
                    //kilometer.setText(String.valueOf(mileVal * MILE_2_KILOMETER));
                    kilometer.setText(String.format("%.4f", mileVal * MILE_2_KILOMETER));
                }
                else if (kilometerVal != 0.0)
                    //mile.setText(String.valueOf(kilometerVal / MILE_2_KILOMETER));
                    mile.setText(String.format("%.2f", kilometerVal / MILE_2_KILOMETER));
                double poundVal = Double.parseDouble(pound.getText());
                double kilogramVal = Double.parseDouble(kilogram.getText());
                if(poundVal != 0.0){
                    kilogram.setText(String.format("%.2f", poundVal * POUND_2_KILOGRAM));
                }
                else if (kilogramVal != 0.0){
                    pound.setText(String.format("%.2f", kilogramVal / POUND_2_KILOGRAM));
                }
                double gallonVal = Double.parseDouble(gallon.getText());
                double literVal = Double.parseDouble(liter.getText());
                if (gallonVal != 0.0){
                    liter.setText(String.format("%.2f", gallonVal * GALLON_2_LITER));
                }
                else if (literVal != 0.0){
                    gallon.setText(String.format("%.2f", literVal / GALLON_2_LITER));
                }
                double fahrenheitVal = Double.parseDouble(fahrenheit.getText());
                double centigradeVal = Double.parseDouble(centigrade.getText());
                if (fahrenheitVal != 0.0){
                    centigrade.setText(String.format("%.6f", fahrenheitToCentigrade(fahrenheitVal)));
                }
                else if (centigradeVal != 0.0){
                    fahrenheit.setText(String.format("%.6f", CentigradeToFahrenheit(centigradeVal)));
                }

            }
            private double fahrenheitToCentigrade(double fahrenheitVal){
                return (fahrenheitVal - 32) / 1.8;
            }
            private double CentigradeToFahrenheit(double centigradeVal){
                return centigradeVal*1.8 + 32;
            }
        });
    }
    public static void main(String[] args) {
        EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Conversion();
            }
        });
    }

    private void createUIComponents() {
        // TODO: place custom component creation code here
    }
}
