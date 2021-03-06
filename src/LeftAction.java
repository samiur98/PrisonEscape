public class LeftAction extends Action {
    //Method that moves the player/user to the left in the world/reduces the x value of the Player's position by 1.
    public LeftAction(Handler handler){
        super("LeftAction", handler);
    }
    @Override
    public void action(){
        World world = this.getHandler().getWorld();
        Player player = world.getPlayer();
        Position position = player.getPosition();
        Position newPosition = new Position(position.getX()-1, position.getY());
        if(world.isValid(newPosition)) {
            player.setPosition(newPosition);
            this.getHandler().genericOutput();
        }
        else{
            System.out.println("Out of bounds");
        }
    }
}
