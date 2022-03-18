import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class BattleOfTheCharactersTest {

    @Test
    void should_return_BBB_when_given_AAA_and_BBB() {
        //  Given
        BattleOfTheCharacters battleOfTheCharacters = new BattleOfTheCharacters();
        String string1 = "AAA";
        String string2 = "BBB";

        //  When
        String result = battleOfTheCharacters.battle(string1,string2);

        //  Then
        Assertions.assertEquals("BBB",result);
    }

    @Test
    void should_return_CCC_when_given_CCC_and_BBB() {
        //  Given
        BattleOfTheCharacters battleOfTheCharacters = new BattleOfTheCharacters();
        String string1 = "BBB";
        String string2 = "CCC";

        //  When
        String result = battleOfTheCharacters.battle(string1,string2);

        //  Then
        Assertions.assertEquals("CCC",result);
    }

    @Test
    void should_return_DDD_when_given_CCC_and_DDD() {
        //  Given
        BattleOfTheCharacters battleOfTheCharacters = new BattleOfTheCharacters();
        String string1 = "CCC";
        String string2 = "DDD";

        //  When
        String result = battleOfTheCharacters.battle(string1,string2);

        //  Then
        Assertions.assertEquals("DDD",result);
    }

    @Test
    void should_return_Tie_when_given_AAA_and_AAA() {
        //  Given
        BattleOfTheCharacters battleOfTheCharacters = new BattleOfTheCharacters();
        String string1 = "AAA";
        String string2 = "AAA";

        //  When
        String result = battleOfTheCharacters.battle(string1,string2);

        //  Then
        Assertions.assertEquals("Tie!",result);
    }

    @Test
    void should_return_Tie_when_given_ABA_and_AAB() {
        //  Given
        BattleOfTheCharacters battleOfTheCharacters = new BattleOfTheCharacters();
        String string1 = "ABA";
        String string2 = "AAB";

        //  When
        String result = battleOfTheCharacters.battle(string1,string2);

        //  Then
        Assertions.assertEquals("Tie!",result);
    }

    @Test
    void should_return_Tie_when_given_BBA_and_ABB() {
        //  Given
        BattleOfTheCharacters battleOfTheCharacters = new BattleOfTheCharacters();
        String string1 = "BBA";
        String string2 = "ABB";

        //  When
        String result = battleOfTheCharacters.battle(string1,string2);

        //  Then
        Assertions.assertEquals("Tie!",result);
    }

    @Test
    void should_return_TWO_when_given_ONE_and_TWO() {
        //  Given
        BattleOfTheCharacters battleOfTheCharacters = new BattleOfTheCharacters();
        String string1 = "ONE";
        String string2 = "TWO";

        //  When
        String result = battleOfTheCharacters.battle(string1,string2);

        //  Then
        Assertions.assertEquals("TWO",result);
    }

    @Test
    void should_return_Tie_when_given_ONE_and_NEO() {
        //  Given
        BattleOfTheCharacters battleOfTheCharacters = new BattleOfTheCharacters();
        String string1 = "ONE";
        String string2 = "NEO";

        //  When
        String result = battleOfTheCharacters.battle(string1,string2);

        //  Then
        Assertions.assertEquals("Tie!",result);
    }

    @Test
    void should_return_Tie_when_given_AAA_and_Z() {
        //  Given
        BattleOfTheCharacters battleOfTheCharacters = new BattleOfTheCharacters();
        String string1 = "AAA";
        String string2 = "Z";

        //  When
        String result = battleOfTheCharacters.battle(string1,string2);

        //  Then
        Assertions.assertEquals("Z",result);
    }

    @Test
    void should_return_FOUR_when_given_FOUR_and_FIVE() {
        //  Given
        BattleOfTheCharacters battleOfTheCharacters = new BattleOfTheCharacters();
        String string1 = "FOUR";
        String string2 = "FIVE";

        //  When
        String result = battleOfTheCharacters.battle(string1,string2);

        //  Then
        Assertions.assertEquals("FOUR",result);
    }


}
