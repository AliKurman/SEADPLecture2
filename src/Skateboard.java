public class Skateboard implements MoveStrategy {
    String name = "15km/h";
    @Override
    public void move() {
        System.out.println("15km/h");
    }
}
