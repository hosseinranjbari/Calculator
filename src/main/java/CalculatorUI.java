import javax.script.ScriptEngine;
import javax.script.ScriptEngineManager;
import javax.script.ScriptException;
import javax.swing.*;

public class CalculatorUI {
    private static JTextField indicator;
    private static String stringOfExpression = "";
    public static void main(String... args) {
        ScriptEngineManager scriptEngineManager = new ScriptEngineManager();
        ScriptEngine scriptEngine = scriptEngineManager.getEngineByName("JavaScript");

        JFrame myCalculator = new JFrame("MyCalculator");

        indicator = new JTextField();
        indicator.setEditable(false);
        indicator.setBounds(5, 5, 255, 50);

        JButton cleaner = getOperatorButton("AC", 5, 60, 60);
        cleaner.addActionListener(event -> {
             stringOfExpression = "";
            indicator.setText(stringOfExpression);
        });

        JButton division = getOperatorButton("/", 70, 60, 60);
        division.addActionListener(event -> {
            stringOfExpression += "/" + indicator.getText();
            indicator.setText(indicator.getText() + "/");
        });

        JButton multiplication = getOperatorButton("*", 135, 60, 60);
        multiplication.addActionListener(event -> {
            stringOfExpression += "*" + indicator.getText();
            indicator.setText(indicator.getText() + "*");
        });

        JButton minus = getOperatorButton("-", 200, 60, 60);
        minus.addActionListener(event -> {
            stringOfExpression += "-" + indicator.getText();
            indicator.setText(indicator.getText() + "-");
        });

        JButton seven = getPositiveIntegerNumberButton("7", 5, 125);

        JButton eight = getPositiveIntegerNumberButton("8", 70, 125);

        JButton nine = getPositiveIntegerNumberButton("9", 135, 125);

        JButton plus = getOperatorButton("+", 200, 125, 125);
        plus.addActionListener(event -> {
            stringOfExpression += "+" + indicator.getText();
            indicator.setText(indicator.getText() + "+");
        });

        JButton four = getPositiveIntegerNumberButton("4", 5, 190);

        JButton five = getPositiveIntegerNumberButton("5", 70, 190);

        JButton six = getPositiveIntegerNumberButton("6", 135, 190);

        JButton one = getPositiveIntegerNumberButton("1", 5, 255);

        JButton two = getPositiveIntegerNumberButton("2", 70, 255);

        JButton three = getPositiveIntegerNumberButton("3", 135, 255);

        JButton equal = getOperatorButton("=", 200, 255, 125);
        equal.addActionListener(event -> {
            try {
                stringOfExpression = scriptEngine.eval(indicator.getText()).toString();
                indicator.setText(stringOfExpression);
            } catch (ScriptException e) {
                throw new RuntimeException(e);
            }

        });

        JButton zero = new JButton("0");
        zero.setBounds(5, 320, 125, 60);
        zero.addActionListener(event -> indicator.setText(ZeroConditions.zeroChecker(indicator.getText())));

        JButton point = new JButton(".");
        point.setBounds(135, 320, 60, 60);
        point.addActionListener(event -> indicator.setText(PointConditions.pointChecker(indicator.getText())));

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
