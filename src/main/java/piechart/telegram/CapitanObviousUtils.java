package piechart.telegram;

public class CapitanObviousUtils {

    //TODO Вынести импорт словаря в проперти файл.
    public static String obvious(){
        String [] myString = new String[]{
                "Кого наказать!",
                "Мне надоело об этом говорить!",
                "Прежде чем что либо делать, согласовать...",
                "Что за вечная самодеятельность!",
                "Никаких изменений платформы!",
                "Задача должна быть сделана!",
                "Где чек-лист?",
                "Как ты определил?"
        };
        int n = (int)Math.floor(Math.random() * myString.length);
        return myString[n] ;
    }
}
