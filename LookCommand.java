import java.util.ArrayList;
import java.util.List;

public class LookCommand {

    private Player player;
    private Dungeon dungeon;

    public LookCommand(Player player, Dungeon dungeon) {
        this.player = player;
        this.dungeon = dungeon;
    }

    public void look() {

        List<Direction> directions = new ArrayList<>();

        directions.add(Direction.NORTH);
        directions.add(Direction.SOUTH);
        directions.add(Direction.EAST);
        directions.add(Direction.WEST);

        for (Direction direction : directions) {

            Position playerPosition = player.getPosition();

            Position scanPosition =
                    new Position(playerPosition.getX(),
                                 playerPosition.getY());

            switch (direction) {

                case NORTH:
                    scanPosition.moveNorth();
                    break;

                case SOUTH:
                    scanPosition.moveSouth();
                    break;

                case EAST:
                    scanPosition.moveEast();
                    break;

                case WEST:
                    scanPosition.moveWest();
                    break;
            }

            System.out.println("Checking " + direction);

            if (dungeon.isAtEdge(scanPosition)) {

                System.out.println("Edge detected");

            } else if (dungeon.isWall(scanPosition)) {

                System.out.println("Wall detected");

            } else {

                System.out.println("Nothing found");
            }
        }
    }
}