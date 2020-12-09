package GB.Mazhaev;

public class Robot implements Move {

    private String model;
    private int canRun;
    private int canJump;

    public Robot(String model, int canRun, int canJump) {
        this.model = model;
        this.canRun = canRun;
        this.canJump = canJump;
    }

    @Override
    public String toString() {
        return "Робот модели " + model;
    }

    @Override
    public boolean moveRun(Move move) {
        if (canRun >= move.getDistanceLet()) {
            System.out.println(model + " пробежал дистанцию в " + move.getDistanceLet() + " метров.");
            return true;
        } else {
            System.out.println(model + " не смог пробежать дистанцию в " + move.getDistanceLet() + " метров.");
            return false;
        }
    }

    @Override
    public boolean moveJump(Move move) {
        if (canJump >= move.getDistanceLet()) {
            System.out.println(model + " перепрыгнул высоту " + move.getDistanceLet() + " метров.");
            return true;
        } else {
            System.out.println(model + " не может перепрыгнуть высоту в " + move.getDistanceLet() + " метров.");
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
