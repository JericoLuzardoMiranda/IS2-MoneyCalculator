package software.ulpgc.MoneyCalculator.swing;

import software.ulpgc.MoneyCalculator.CurrencyDialog;
import software.ulpgc.MoneyCalculator.MoneyDialog;
import software.ulpgc.MoneyCalculator.MoneyDisplay;
import software.ulpgc.MoneyCalculator.control.Command;
import software.ulpgc.MoneyCalculator.control.ExchangeMoneyCommand;
import software.ulpgc.MoneyCalculator.fixerws.FixerCurrencyLoader;
import software.ulpgc.MoneyCalculator.mock.MockExchangeRateLoader;
import software.ulpgc.MoneyCalculator.model.Currency;

import javax.swing.*;
import java.awt.*;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class SwingMain extends JFrame {
    private MoneyDialog moneyDialog;
    private CurrencyDialog currencyDialog;
    private MoneyDisplay moneyDisplay;
    private Map<String, Command> commands = new HashMap<>();

    public static void main(String[] args) {
        SwingMain main = new SwingMain();
        List<Currency> currencies = new FixerCurrencyLoader().load();
        System.out.println("Currencies: " + currencies);
        Command command = new ExchangeMoneyCommand(
                main.moneyDialog().define(currencies),
                main.currencyDialog().define(currencies),
                new MockExchangeRateLoader(),
                main.moneyDisplay()
        );
        main.add("Exchange Money", command);
        main.setVisible(true);
    }

    public void add(String name, Command command) {
        commands.put(name, command);
    }

    public SwingMain() throws HeadlessException {
        this.setTitle("Money Calculator");
        this.setSize(1000, 600);
        this.setLocationRelativeTo(null);
        this.setDefaultCloseOperation(EXIT_ON_CLOSE);
        this.setLayout(new FlowLayout());

        JLabel titleLabel = new JLabel("Money Calculator", JLabel.CENTER);
        titleLabel.setFont(new Font("Kaushan Script", Font.BOLD, 115));
        this.add(titleLabel, BorderLayout.NORTH);

        this.add(createMoneyDialog());
        this.add(createCurrencyDialog());
        this.add(createMoneyDisplay());
        this.add(createCalculateButton());

        this.getContentPane().setBackground(Color.lightGray);

        this.setVisible(true);

    }

    private Component createCalculateButton() {
        JButton button = new JButton("Calculate");
        button.setPreferredSize(new Dimension(130, 25));
        button.addActionListener(e -> commands.get("Exchange Money").execute());
        return button;
    }

    private Component createMoneyDisplay() {
        SwingMoneyDisplay display = new SwingMoneyDisplay();
        this.moneyDisplay = display;
        return display;
    }

    private Component createCurrencyDialog() {
        SwingCurrencyDialog dialog = new SwingCurrencyDialog();
        this.currencyDialog = dialog;
        return dialog;
    }

    private Component createMoneyDialog() {
        SwingMoneyDialog dialog = new SwingMoneyDialog();
        this.moneyDialog = dialog;
        return dialog;
    }

    // ---------- x ---------- x ----------

    private MoneyDisplay moneyDisplay() {
        return moneyDisplay;
    }

    private CurrencyDialog currencyDialog() {
        return currencyDialog;
    }

    private MoneyDialog moneyDialog() {
        return moneyDialog;
    }

    // ---------- x ---------- x ----------

    public MoneyDialog getMoneyDialog() {
        return moneyDialog;
    }

    public CurrencyDialog getCurrencyDialog() {
        return currencyDialog;
    }

    public MoneyDisplay getMoneyDisplay() {
        return moneyDisplay;
    }

    public Map<String, Command> getCommands() {
        return commands;
    }

}