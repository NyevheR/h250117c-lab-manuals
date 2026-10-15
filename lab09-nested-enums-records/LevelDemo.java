// Lab 9 - Basic 1: a switch that prints advice for each Level
public class LevelDemo {

    static void advice(Level level) {
        switch (level) {
            case LOW:
                System.out.println("LOW: relax, nothing to do.");
                break;
            case MEDIUM:
                System.out.println("MEDIUM: keep an eye on it.");
                break;
            case HIGH:
                System.out.println("HIGH: act now!");
                break;
        }
    }

    public static void main(String[] args) {
        for (Level level : Level.values()) {
            advice(level);
        }
    }
}
