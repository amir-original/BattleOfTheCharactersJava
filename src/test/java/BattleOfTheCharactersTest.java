import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class BattleOfTheCharactersTest {

    @Test
    void should_return_B_when_given_A_and_B() {
        //  Given
        BattleOfTheCharacters battleOfTheCharacters = new BattleOfTheCharacters();
        String string1 = "A";
        String string2 = "B";

        //  When
        String result = battleOfTheCharacters.battle(string1,string2);

        //  Then
        Assertions.assertEquals("B",result);
    }

    @Test
    void should_return_AA_when_given_A_and_AA() {
        //  Given
        BattleOfTheCharacters battleOfTheCharacters = new BattleOfTheCharacters();
        String string1 = "A";
        String string2 = "AA";

        //  When
        String result = battleOfTheCharacters.battle(string1,string2);

        //  Then
        Assertions.assertEquals("AA",result);
    }

    @Test
    void should_return_AB_when_given_AA_and_AB() {
        //  Given
        BattleOfTheCharacters battleOfTheCharacters = new BattleOfTheCharacters();
        String string1 = "AA";
        String string2 = "AB";

        //  When
        String result = battleOfTheCharacters.battle(string1,string2);

        //  Then
        Assertions.assertEquals("AB",result);
    }

    @Test
    void should_return_Tie_when_given_AAA_and_AB() {
        //  Given
        BattleOfTheCharacters battleOfTheCharacters = new BattleOfTheCharacters();
        String string1 = "AAA";
        String string2 = "AB";

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

    @Test
    void should_return_SIX_when_given_SIX_and_FIVE() {
        //  Given
        BattleOfTheCharacters battleOfTheCharacters = new BattleOfTheCharacters();
        String string1 = "SIX";
        String string2 = "FIVE";
        String[] strings = {string1,string2};
        //  When
        String result = battleOfTheCharacters.battle(string1,string2);

        //  Then
        Assertions.assertEquals("SIX",result);
    }


}
