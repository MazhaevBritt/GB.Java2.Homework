package GB.Mazhaev;

public interface Move {

    boolean moveRun(Move move); // прошел или не прошел дистанцию бега
    boolean moveJump(Move move); // прошел или не прошел дистанцию прыжка
    int getDistanceLet(); // возвращет значение дистанции препядствия
    int getCodeOfLet(); // возвращает числовой код препядствия

}
