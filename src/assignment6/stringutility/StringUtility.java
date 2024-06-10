package assignment6.stringutility;
import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Arrays;

public class StringUtility extends JFrame{
    private JPanel JStringUtility;
    private JButton btnCountLtr;
    private JButton btnRevLtr;
    private JButton btnRemoveDup;
    private JTextField textInput;
    private JTextField textOutput;
    ConvertEvent cv;
    public StringUtility(){
        setContentPane(JStringUtility);
        // Default visibility is false. You have enabled visibility true
        setVisible(true);
        // Terminates the Application when the frame is closed.
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setTitle("String Utility");
        // Provide the frame width and height
        setSize(500, 200);
        // Make your screen center
        setLocationRelativeTo(null);
        setResizable(true);// If you wish

       // cv = new ConvertEvent();

        btnCountLtr.addActionListener(new ActionListener() {
            Integer output = 0;
            @Override
            public void actionPerformed(ActionEvent e) {
                cv = new ConvertEvent();
                output = cv.CountLetter();
                textOutput.setText(output.toString());
            }
        });
        btnRevLtr.addActionListener(new ActionListener() {
            String output = null;
            @Override
            public void actionPerformed(ActionEvent e) {
                cv = new ConvertEvent();
                output = cv.ReverseLetters();
                textOutput.setText(output);
            }
        });
        btnRemoveDup.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                cv = new ConvertEvent();
                String outStr = cv.returnString();
                textOutput.setText(outStr);
            }
        });
    }

    public static void main(String[] args) { /*
        While it is not mandatory to use EventQueue.invokeLater, it is a best practice for all Swing applications to ensure thread safety and avoid potential concurrency issues.
        */
        EventQueue.invokeLater(new Runnable() { public void run() {
            StringUtility cn = new StringUtility(); }
        }); }

    public class ConvertEvent{
        private String input;
        private static String inputfld;
        private StringBuilder sb ;//= new StringBuilder();
        public ConvertEvent(){
            input = textInput.getText();
            //sb.append(input);
        }

        private int CountLetter(){
            if (! this.input.isEmpty()) return this.input.length();
            return 0;
        }

        private String ReverseLetters(){
            sb = new StringBuilder(input);
            if (! this.input.isEmpty()) return sb.reverse().toString();

            return "";
        }

        private String returnString(){

            return removeDuplicates (this.input );
        }

        public static String removeDuplicates(String str) {
            return removeDuplicatesHelper(str, "");
        }

        private static String removeDuplicatesHelper(String str, String result) {
            if (str.isEmpty()) {
                return result;
            }
            char firstChar = str.charAt(0);

            if (result.indexOf(firstChar) == -1) {
                result += firstChar;
            }

            return removeDuplicatesHelper(str.substring(1), result);
        }
    }
}
