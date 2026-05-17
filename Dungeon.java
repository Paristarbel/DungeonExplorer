import java.util.ArrayList;
import java.util.List;

public class Dungeon {

    private int width;
    private int height;
    private List<Wall> walls;
    private List<Treasure> treasures;

    public Dungeon() {
        this.width = 0;
        this.height = 0;
        this.walls = new ArrayList<>();
        this.treasures = new ArrayList<>();
    }

    public Dungeon(int width, int height,
                   List<Wall> walls,
                   List<Treasure> treasures) {

        this.width = width;
        this.height = height;
        this.walls = walls;
        this.treasures = treasures;
    }

    public int getWidth() {
        return width;
    }

    public int getHeight() {
        return height;
    }

    public List<Wall> getWalls() {
        return walls;
    }

    public List<Treasure> getTreasures() {
        return treasures;
    }

    // Checks if position is outside dungeon boundaries
    public boolean isAtEdge(Position position) {

        if (position.getX() < 0 || position.getY() < 0) {
            return true;
        }

        if (position.getX() >= width || position.getY() >= height) {
            return true;
        }

        return false;
    }

    // Checks if a wall exists at a position
    public boolean isWall(Position position) {

        for (Wall wall : walls) {

            Position wallPosition = wall.getPosition();

            if (wallPosition.getX() == position.getX()
                    && wallPosition.getY() == position.getY()) {

                return true;
            }
        }

        return false;
    }

    // Checks if movement is allowed
    public boolean canMove(Position position) {

        if (isAtEdge(position)) {
            return false;
        }

        if (isWall(position)) {
            return false;
        }

        return true;
    }
}