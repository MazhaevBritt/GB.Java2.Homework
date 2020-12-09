package GB.Mazhaev;

public class Cat implements Move {

    private String name;
    private int canRun;
    private int canJump;

    public Cat(String name, int canRun, int canJump) {
        this.name = name;
        this.canRun = canRun;
        this.canJump = canJump;
    }

    @Override
    public String toString() {
        return "Кот по кличке " + name;
    }

    @Override
    public boolean moveRun(Move move) {
        if (canRun >= move.getDistanceLet()) {
            System.out.println(name + " пробежал дистанцию в " + move.getDistanceLet() + " метров." );
            return true;
        } else {
            System.out.println(name + " не смог пробежать дистанцию в " + move.getDistanceLet() + " метров.");
            return false;
        }
    }

    @Override
    public boolean moveJump(Move move) {
        if (canJump >= move.getDistanceLet()) {
            System.out.println(name + " перепрыгнул высоту " + move.getDistanceLet() + " метров.");
            return true;
        } else {
            System.out.println(name + " не может перепрыгнуть высоту в " + move.getDistanceLet() + " метров.");
            return false;
        }
    }

    @Override
    public int getDistanceLet() {
        return 0;
    }

    @Override
    public int getCodeOfLet() {
        return 0;
    }

}
