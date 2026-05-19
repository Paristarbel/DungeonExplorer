import java.util.Scanner;

public class Movement {

    private Player player;
    private Dungeon dungeon;

    public Movement(Player player, Dungeon dungeon) {
        this.player = player;
        this.dungeon = dungeon;
    }

    public void movePlayer() {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter movement:");
        String playerMovement = scanner.nextLine().toUpperCase();

        Position current = player.getPosition();

        Position nextPosition =
                new Position(current.getX(), current.getY());

        switch (playerMovement) {

            case "NORTH":
                nextPosition.moveNorth();
                break;

            case "SOUTH":
                nextPosition.moveSouth();
                break;

            case "EAST":
                nextPosition.moveEast();
                break;

            case "WEST":
                nextPosition.moveWest();
                break;

            default:
                System.out.println("Invalid direction");
                return;
        }

        if (dungeon.canMove(nextPosition)) {

            switch (playerMovement) {

                case "NORTH":
                    player.moveNorth();
                    break;

                case "SOUTH":
                    player.moveSouth();
                    break;

                case "EAST":
                    player.moveEast();
                    break;

                case "WEST":
                    player.moveWest();
                    break;
            }

            System.out.println("Player moved to: "
                    + player.getPosition().getX()
                    + ", "
                    + player.getPosition().getY());

        } else {
            System.out.println("Movement blocked!");
        }
    }
}