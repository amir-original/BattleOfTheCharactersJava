package oop;

import java.util.Arrays;

public class BattleOfTheCharacters {
    private MyStringClass[] strings;

    public BattleOfTheCharacters(MyStringClass[] strings) {
        this.strings = strings;
    }

    public String execute() {
        String result = "";
        int repeat = 0;
        int maxTotalPower = getMaxTotalPower();

        for (int index = 0; index < strings.length; index++){
            MyStringClass str = strings[index];
            if(isMaxTotalPoint(str,maxTotalPower)){
                if (isThereMoreThanOneMaxTotalPower(repeat)) {
                    result +="-";
                }
                result += str.getStrValue();
                repeat++;
            }
        }

        if (areThePowersEqual(repeat)){
            result = "Tie!";
        }
        
        return result;
    }

    private boolean isThereMoreThanOneMaxTotalPower(int repeat) {
        return repeat >= 1;
    }

    private boolean areThePowersEqual(int repeat) {
        return repeat == strings.length;
    }

    private int  getMaxTotalPower() {
        int[] groupsTotalPower = new int[strings.length];
        for (int index = 0; index < strings.length ; index++){
           MyStringClass str = strings[index];
           groupsTotalPower[index] = str.getTotalPower();
        }

        return Arrays.stream(groupsTotalPower).max().getAsInt();
    }

    private boolean isMaxTotalPoint(MyStringClass str, int maxTotalPower) {
        return maxTotalPower == str.getTotalPower();
    }

}
