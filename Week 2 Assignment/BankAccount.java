import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class BankAccount extends JFrame {

    private JTextField initialDepositField;
    private JTextField annualInterestRateField;
    private JTextField yearsField;
    private JLabel resultLabel;

    public BankAccount() {
        setTitle("Savings Account Balance Calculator");
        setSize(400, 300);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLayout(new GridLayout(5, 2, 10, 10));

        Font font = new Font("Arial", Font.PLAIN, 16);

        JLabel initialDepositLabel = new JLabel("Initial Deposit:");
        initialDepositLabel.setFont(font);
        add(initialDepositLabel);
        initialDepositField = new JTextField();
        initialDepositField.setFont(font);
        add(initialDepositField);

        JLabel annualInterestRateLabel = new JLabel("Annual Interest Rate (%):");
        annualInterestRateLabel.setFont(font);
        add(annualInterestRateLabel);
        annualInterestRateField = new JTextField();
        annualInterestRateField.setFont(font);
        add(annualInterestRateField);

        JLabel yearsLabel = new JLabel("Number of Years:");
        yearsLabel.setFont(font);
        add(yearsLabel);
        yearsField = new JTextField();
        yearsField.setFont(font);
        add(yearsField);

        JButton calculateButton = new JButton("Calculate Balance");
        calculateButton.setFont(font);
        add(calculateButton);

        resultLabel = new JLabel("Final Balance: ");
        resultLabel.setFont(font);
        add(resultLabel);

        calculateButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                calculateBalance();
            }
        });
    }

    private void calculateBalance() {
        try {
            double initialDeposit = Double.parseDouble(initialDepositField.getText());
            double annualInterestRate = Double.parseDouble(annualInterestRateField.getText());
            int years = Integer.parseInt(yearsField.getText());

            BankAccountDetails account = new BankAccountDetails(initialDeposit, annualInterestRate, years);
            double finalBalance = account.calculateBalance();

            resultLabel.setText("Final Balance: $" + String.format("%.2f", finalBalance));
        } catch (NumberFormatException ex) {
            JOptionPane.showMessageDialog(this, "Please enter valid numbers for all fields.", "Input Error", JOptionPane.ERROR_MESSAGE);
        }
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(new Runnable() {
            @Override
            public void run() {
                new BankAccount().setVisible(true);
            }
        });
    }

    public class BankAccountDetails {
        private double initialDeposit;
        private double annualInterestRate;
        private int years;

        public BankAccountDetails(double initialDeposit, double annualInterestRate, int years) {
            this.initialDeposit = initialDeposit;
            this.annualInterestRate = annualInterestRate;
            this.years = years;
        }

        public double calculateBalance() {
            return initialDeposit * Math.pow((1 + annualInterestRate / 100), years);
        }
    }
}