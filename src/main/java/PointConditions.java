public class PointConditions {
    public static String pressingPoint(String indicatorString) {
        if (!indicatorString.isEmpty()) {
            if(indicatorString.length() == 1 && indicatorString.startsWith("0")) {
                return indicatorString + ".";
            } else if(!indicatorString.contains(".")) {
                return indicatorString + ".";
            } else {
                return indicatorString;
            }
        } else {
            return "0.";
        }
    }
}
