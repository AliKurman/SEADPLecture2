public class Walking implements MoveStrategy {
    String name = "5km/h";
    @Override
    public void move() {
        System.out.println("5km/h");
    }
}
