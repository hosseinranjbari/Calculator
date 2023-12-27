import java.util.regex.Pattern;

public class PointConditions {
    public static String pointChecker(String indicatorString) {
        String regexOfOperatorsAtTheEnd = ".*[-+*/%]$";
        boolean doesFindOperatorsInTheEndOfString = Pattern.matches(regexOfOperatorsAtTheEnd, indicatorString);

        if (doesFindOperatorsInTheEndOfString){
            return indicatorString + ".";
        } else {
            String[] numbers = indicatorString.split("[/*+-]");
            String lastNumber = numbers[numbers.length - 1];

            if (lastNumber.contains("."))
                return indicatorString;
            return indicatorString + ".";
        }
    }
}
