package oop;

public class MyStringClass {
    private char[] characters = {'A','B','C','D','E','F','G','H','I','J','K','L','M','N'
            ,'O','P','Q','R','S','T','U','V','W','X','W','Z','Y','Z'};

    private String strValue;

    public MyStringClass(String strValue) {
        this.strValue = strValue;
    }

    public int getTotalPower() {
        int totalPower = 0;
        for (int index = 0; index < strValue.length(); index++) {
            totalPower += getPowerOfEachChar(strValue, index);
        }
        return totalPower;
    }

    public String getStrValue() {
        return strValue;
    }

    private int getPowerOfEachChar(String str, int index) {
        int result = 0;
        for (int power = 1; power <= characters.length; power++) {
            if (isTheStringConsistOfThisChar(str.charAt(index), characters[power - 1])) {
                result = power;
            }
        }
        return result;
    }

    private boolean isTheStringConsistOfThisChar(char strChar, char expectCharacters) {
        return strChar == expectCharacters;
    }
}
