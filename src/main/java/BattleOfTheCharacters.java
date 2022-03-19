public class BattleOfTheCharacters {

    private char[] characters = {'A','B','C','D','E','F','G','H','I','J','K','L','M','N'
                               ,'O','P','Q','R','S','T','U','V','W','X','Y','Z'};

    public String battle(String string1, String string2) {
        int totalPowerStr1 = totalPower(string1);
        int totalPowerStr2 = totalPower(string2);
        String result = "";

        if (isFirstGroupTotalPowerBigger(totalPowerStr1,totalPowerStr2)){
            result = string1;
        }else if (isSecondGroupTotalPowerBigger(totalPowerStr2,totalPowerStr1)){
            result = string2;
        }else{
            result = "Tie!";
        }
        return result;
    }

    private boolean isFirstGroupTotalPowerBigger(int totalPowerStr1, int totalPowerStr2) {
        return totalPowerStr1 > totalPowerStr2;
    }

    private boolean isSecondGroupTotalPowerBigger(int totalPowerStr2, int totalPowerStr1) {
        return totalPowerStr2 > totalPowerStr1;
    }

    private int totalPower(String str) {
        int totalPower = 0;
        for (int index = 0; index < str.length(); index++) {
            totalPower += getPowerOfEachChar(str, index);
        }
        return totalPower;
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
