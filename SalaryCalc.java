import javax.swing.JLabel;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JTextField;
import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.awt.Insets;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class SalaryCalc extends JFrame implements ActionListener{

    private JLabel wageLabel;
    private JLabel salaryLabel;
    private JTextField wageField;
    private JTextField salaryField;
    private JButton calcButton;

    SalaryCalc(){
        GridBagConstraints positionConst = null;

        setTitle("Salary Calculator");
        wageLabel = new JLabel("Hourly Wage:");
        salaryLabel = new JLabel("Annuaul Salary: ");

        wageField = new JTextField(15);
        wageField.setEditable(true);
        wageField.setText("0");

        salaryField = new JTextField(15);
        salaryField.setEditable(false);

        calcButton = new JButton("Calculate");
        calcButton.addActionListener(this);


        setLayout(new GridBagLayout());
        positionConst = new GridBagConstraints();

        positionConst.gridx = 0;
        positionConst.gridy = 0;
        positionConst.insets = new Insets(10,10,10,10);
        add(wageLabel, positionConst); 
        
        positionConst.gridx = 0;
        positionConst.gridy = 1;
        positionConst.insets = new Insets(10,10,10,10);
        add(salaryLabel, positionConst);

        positionConst.gridx = 2;
        positionConst.gridy = 0;
        positionConst.insets = new Insets(10,10,10,10);
        add(wageField, positionConst);

        positionConst.gridx = 2;
        positionConst.gridy = 1;
        positionConst.insets = new Insets(10,10,10,10);
        add(salaryField, positionConst);

        positionConst.gridx = 1;
        positionConst.gridy = 2;
        positionConst.insets = new Insets(10,10,10,10);
        add(calcButton, positionConst);

    }

    @Override
    public void actionPerformed(ActionEvent event){//what will happend when we click the button
        String userInput;
        int hourlyWage;

        userInput = wageField.getText();
        hourlyWage = Integer.parseInt(userInput);

        salaryField.setText(Integer.toString(hourlyWage * 40 * 50));
    }

    public static void main(String[] args) {
        SalaryCalc myFrame = new SalaryCalc();

        myFrame.setDefaultCloseOperation(JFrame.HIDE_ON_CLOSE);
        myFrame.setLocationRelativeTo(null);
        myFrame.pack();
        myFrame.setVisible(true);

        SalaryCalc myFrame2 = new SalaryCalc();

        myFrame2.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        myFrame2.pack();
        myFrame2.setVisible(true);
    }
    
}