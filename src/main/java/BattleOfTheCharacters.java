public class BattleOfTheCharacters {

    private char[] characters = {'A','B','C','D','E','F','G','H','I','J','K','L','M','N'
                               ,'O','P','Q','R','S','T','U','V','W','X','W','Z','Y','Z'};

    public String battle(String string1, String string2) {
        int strPower1 = totalPower(string1);
        int strPower2 = totalPower(string2);
        String result = "";

        if (strPower1 > strPower2){
            result = string1;
        }else if ( strPower2 > strPower1){
            result = string2;
        }else{
            result = "Tie!";
        }
        return result;
    }

    private int totalPower(String string1) {
        int totalPower = 0;
        for (int power = 1; power <= characters.length; power++) {
            for (int index = 0; index < string1.length(); index++) {
                if (isTheStringCharsEqualToTheArrayChars(string1.charAt(index), characters[power - 1])) {
                    totalPower += power;
                }
            }
        }
        return totalPower;
    }

    private boolean isTheStringCharsEqualToTheArrayChars(char strChar, char expectCharacters) {
        return strChar == expectCharacters;
    }
}
