public class DecimalComparator {
    public static boolean areEqualByThreeDecimalPlaces (double numOne, double numTwo) {
        String stringNumOne = Double.toString(numOne);
        String stringNumTwo = Double.toString(numTwo);
        String[] arrayStringNumOne = stringNumOne.split("\\.");
        String[] arrayStringNumTwo = stringNumTwo.split("\\.");
        int lenOne = arrayStringNumOne[1].length();
        int lenTwo = arrayStringNumTwo[1].length();
        if (lenOne > 3) {
            arrayStringNumOne[1] = arrayStringNumOne[1].substring(0, lenOne - 1);
        }

        if (lenTwo > 3) {
            arrayStringNumTwo[1] = arrayStringNumTwo[1].substring(0, lenTwo - 1);
        }

        if (arrayStringNumOne[1].equals(arrayStringNumTwo[1]) && arrayStringNumOne[0].equals(arrayStringNumTwo[0])) {
            return true;
        }
        return false;
    }
}
