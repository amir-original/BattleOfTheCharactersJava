import oop.BattleOfTheCharacters;
import oop.MyStringClass;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class BattleOfTheCharactersOOPTest {

    @Test
    void should_return_Bigger_Number() {
        //  Given
        MyStringClass string1 = new MyStringClass("ONE");;
        MyStringClass string2 = new MyStringClass("ENO");
        MyStringClass string3 = new MyStringClass("A");
        MyStringClass string4 = new MyStringClass("NEO");
        MyStringClass[] strings = {string1,string2,string3,string4};
        BattleOfTheCharacters groupTotalPower = new BattleOfTheCharacters(strings);
        //  When
        String result = groupTotalPower.execute();

        //  Then
        Assertions.assertEquals("ONE-ENO-NEO",result);
    }

    @Test
    void should_return_Bigger_Number_Else_Return_TIE() {
        //  Given
        MyStringClass string1 = new MyStringClass("AAA");;
        MyStringClass string2 = new MyStringClass("Z");
        MyStringClass[] strings = {string1,string2};
        BattleOfTheCharacters groupTotalPower = new BattleOfTheCharacters(strings);
        //  When
        String result = groupTotalPower.execute();

        //  Then
        Assertions.assertEquals("Z",result);
    }

    @Test
    void should_return_Tie_When_Given_ONE_NEO() {
        //  Given
        MyStringClass string1 = new MyStringClass("ONE");;
        MyStringClass string2 = new MyStringClass("NEO");
        MyStringClass[] strings = {string1,string2};
        BattleOfTheCharacters groupTotalPower = new BattleOfTheCharacters(strings);
        //  When
        String result = groupTotalPower.execute();

        //  Then
        Assertions.assertEquals("Tie!",result);
    }

    @Test
    void should_return_FOUR_When_Given_FOUR_FIVE_SIX() {
        //  Given
        MyStringClass string1 = new MyStringClass("FOUR");;
        MyStringClass string2 = new MyStringClass("FIVE");
        MyStringClass string3 = new MyStringClass("SIX");
        MyStringClass[] strings = {string1,string2,string3};
        BattleOfTheCharacters groupTotalPower = new BattleOfTheCharacters(strings);
        //  When
        String result = groupTotalPower.execute();

        //  Then
        Assertions.assertEquals("FOUR",result);
    }

}
