import javax.swing.*;

public class CalculatorUI {
    public static void main(String... args) {
        JFrame myCalculator = new JFrame("MyCalculator");

        JTextField indicator = new JTextField();
        indicator.setEditable(false);
        indicator.setBounds(5, 5, 255, 50);

        JButton cleaner = new JButton("AC");
        cleaner.setBounds(5, 60, 60, 60);
        cleaner.addActionListener(event -> indicator.setText(""));

        JButton division = new JButton("/");
        division.setBounds(70, 60, 60, 60);

        JButton multiplication = new JButton("*");
        multiplication.setBounds(135, 60, 60, 60);

        JButton minus = new JButton("-");
        minus.setBounds(200, 60, 60, 60);

        JButton seven = new JButton("7");
        seven.setBounds(5, 125, 60, 60);
        seven.addActionListener(event ->
                indicator.setText(ZeroConditions.removeStartingZero(indicator.getText()) + seven.getText()));

        JButton eight = new JButton("8");
        eight.setBounds(70, 125, 60, 60);
        eight.addActionListener(event ->
                indicator.setText(ZeroConditions.removeStartingZero(indicator.getText()) + eight.getText()));

        JButton nine = new JButton("9");
        nine.setBounds(135, 125, 60, 60);
        nine.addActionListener(event ->
                indicator.setText(ZeroConditions.removeStartingZero(indicator.getText()) + nine.getText()));

        JButton plus = new JButton("+");
        plus.setBounds(200, 125, 60, 125);

        JButton four = new JButton("4");
        four.setBounds(5, 190, 60, 60);
        four.addActionListener(event ->
                indicator.setText(ZeroConditions.removeStartingZero(indicator.getText()) + four.getText()));

        JButton five = new JButton("5");
        five.setBounds(70, 190, 60, 60);
        five.addActionListener(event ->
                indicator.setText(ZeroConditions.removeStartingZero(indicator.getText()) + five.getText()));

        JButton six = new JButton("6");
        six.setBounds(135, 190, 60, 60);
        six.addActionListener(event ->
                indicator.setText(ZeroConditions.removeStartingZero(indicator.getText()) + six.getText()));

        JButton one = new JButton("1");
        one.setBounds(5, 255, 60, 60);
        one.addActionListener(event ->
                indicator.setText(ZeroConditions.removeStartingZero(indicator.getText()) + one.getText()));

        JButton two = new JButton("2");
        two.setBounds(70, 255, 60, 60);
        two.addActionListener(event ->
                indicator.setText(ZeroConditions.removeStartingZero(indicator.getText()) + two.getText()));

        JButton three = new JButton("3");
        three.setBounds(135, 255, 60, 60);
        three.addActionListener(event ->
                indicator.setText(ZeroConditions.removeStartingZero(indicator.getText()) + three.getText()));

        JButton equal = new JButton("=");
        equal.setBounds(200, 255, 60, 125);

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
}
