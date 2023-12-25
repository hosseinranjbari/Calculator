public class ZeroConditions {

    public static String pressingZero(String indicatorString) {
        if(indicatorString.isEmpty()) {
            return "0";

        } else if((indicatorString.length() == 1) && (indicatorString.startsWith("0"))) {
            return indicatorString;

        } else {
            return indicatorString + "0";

        }
    }
    public static String removeStartingZero(String indicatorString) {
        boolean hasConditionForRemovingStartingZero = (indicatorString.length() == 1) && indicatorString.startsWith("0");
        if (!hasConditionForRemovingStartingZero)
            return indicatorString;
        return "";
    }
}
