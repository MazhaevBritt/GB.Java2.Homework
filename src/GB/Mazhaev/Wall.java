package GB.Mazhaev;

public class Wall implements Move {
    private int distance;
    private int codeOfLet;

    @Override
    public int getCodeOfLet() {
        codeOfLet = 1;
        return codeOfLet;
    }

    public Wall(int distance) {
        this.distance = distance;
        this.codeOfLet = getCodeOfLet();
    }

    @Override
    public boolean moveRun(Move move) {
        return false;
    }

    @Override
    public boolean moveJump(Move move) {
        return false;
    }

    @Override
    public int getDistanceLet() {
        return distance;
    }

}
