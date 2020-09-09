package piechart.telegram;

import io.qameta.allure.Feature;
import org.junit.Assert;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;

import java.io.UnsupportedEncodingException;

@Feature("Чтение ценных мыслей Капитана Очевидности из словаря")
@Tag("UnitTest")
public class CapitanObviousTest {

    @Test
    @DisplayName("Проверяем импорт Кириллической строки из тестового файла")
    public  void capitanObviousTest() throws UnsupportedEncodingException {
        String expection = "Кого наказать!";
        String actual = Utils.obvious("src/test/resources/capitanObviousDict.txt");
        Assert.assertEquals(expection, actual);
    }

    @Test
    @DisplayName("Проверяем импорт Латинской строки из тестового файла")
    public  void capitanObviousNotKirilicTest() throws UnsupportedEncodingException {
        String expection = "someText!!!";
        String actual = Utils.obvious("src/test/resources/capitanOviousNotUtf8.txt");
        Assert.assertEquals(expection, actual);
    }

    @Test
    @DisplayName("Проверяем импорт Кириллической строки из продового Файла с вводом номера")
    public  void capitanObviousWithIntTest() throws UnsupportedEncodingException {
        String expection = "Кого наказать!";
        String actual = Utils.obvious("capitanObviousDictionary.txt", 0);
        Assert.assertEquals(expection, actual);
    }

    @Test
    @DisplayName("Проверяем наличие эксепшена при невалидном вводе пути к файлу")
    public  void capitanObviousFileReadingErrorTest() throws UnsupportedEncodingException {
        String expection = "File reading error";
        String actual = Utils.obvious("src/test/ыщьуКуыщгксуы/someFile.txt");
        Assert.assertEquals(expection, actual);
    }
}
