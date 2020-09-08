package piechart.telegram;

import org.junit.Assert;
import org.junit.jupiter.api.Test;

import java.io.UnsupportedEncodingException;

public class CapitanObviousTest {

    @Test
    public  void capitanObviousTest() throws UnsupportedEncodingException {
        String expection = "Кого наказать!";
        String actual = Utils.obvious("src/test/resources/capitanObviousDict.txt");
        Assert.assertEquals(expection, actual);
        System.out.println(expection);
        System.out.println(actual);
    }
}
