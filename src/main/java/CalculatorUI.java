import javax.swing.*;

public class CalculatorUI {
    private static JTextField indicator;
    public static void main(String... args) {
        JFrame myCalculator = new JFrame("MyCalculator");

        indicator = new JTextField();
        indicator.setEditable(false);
        indicator.setBounds(5, 5, 255, 50);

        JButton cleaner = getOperatorButton("AC", 5, 60, 60);
        cleaner.addActionListener(event -> indicator.setText(""));

        JButton division = getOperatorButton("/", 70, 60, 60);

        JButton multiplication = getOperatorButton("*", 135, 60, 60);

        JButton minus = getOperatorButton("-", 200, 60, 60);

        JButton seven = getPositiveIntegerNumberButton("7", 5, 125);

        JButton eight = getPositiveIntegerNumberButton("8", 70, 125);

        JButton nine = getPositiveIntegerNumberButton("9", 135, 125);

        JButton plus = getOperatorButton("+", 200, 125, 125);

        JButton four = getPositiveIntegerNumberButton("4", 5, 190);

        JButton five = getPositiveIntegerNumberButton("5", 70, 190);

        JButton six = getPositiveIntegerNumberButton("6", 135, 190);

        JButton one = getPositiveIntegerNumberButton("1", 5, 255);

        JButton two = getPositiveIntegerNumberButton("2", 70, 255);

        JButton three = getPositiveIntegerNumberButton("3", 135, 255);

        JButton equal = getOperatorButton("=", 200, 255, 125);

        JButton zero = new JButton("0");
        zero.setBounds(5, 320, 125, 60);
        zero.addActionListener(event -> indicator.setText(ZeroConditions.pressingZero(indicator.getText())));

        JButton point = new JButton(".");
        point.setBounds(135, 320, 60, 60);
        point.addActionListener(event -> indicator.setText(PointConditions.pressingPoint(indicator.getText())));

        myCalculator.add(indicator);
        myCalculator.add(cleaner);
        myCalculator.add(division);
        myCalculator.add(multiplication);
        myCalculator.add(minus);
        myCalculator.add(seven);
        myCalculator.add(eight);
        myCalculator.add(nine);
        myCalculator.add(plus);
        myCalculator.add(four);
        myCalculator.add(five);
        myCalculator.add(six);
        myCalculator.add(one);
        myCalculator.add(two);
        myCalculator.add(three);
        myCalculator.add(equal);
        myCalculator.add(zero);
        myCalculator.add(point);

        myCalculator.setLayout(null);
        myCalculator.setSize(265, 425);
        myCalculator.setVisible(true);
    }

    private static JButton getOperatorButton(
            String labelOfOperator, int xPosition, int yPosition, int height) {
        JButton operatorButton = new JButton(labelOfOperator);
        operatorButton.setBounds(xPosition, yPosition, 60, height);
        return operatorButton;
    }

    private static JButton getPositiveIntegerNumberButton(String labelOfButton, int xPosition, int yPosition) {
        JButton button = new JButton(labelOfButton);
        button.setBounds(xPosition, yPosition, 60, 60);
        button.addActionListener(event ->
                indicator.setText(ZeroConditions.removeStartingZero(indicator.getText()) + button.getText()));
        return button;
    }
}
