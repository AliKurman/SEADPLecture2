public class Player {
    String description = "5km/h";
    MoveStrategy moveStrategy;
    public Player(MoveStrategy moveStrategy) {
        this.moveStrategy = moveStrategy;
    }
    public void move(){
        moveStrategy.move();
    }
}
