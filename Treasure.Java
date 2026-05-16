public class Treasure {

    private String name;
    private int value;
    private Position position;
    private boolean collected;


    public Treasure() {
        this.name = "not found";
        this.value = 0;
        this.position = new Position();
        this.collected=false;

    }

    public Treasure(String name, int value, Position position) {
        this.name = name;
        this.value = value;
        this.position = position;
        this.collected=false;

    }

    public String getName() {
        return name;

    }

    public int getValue() {
        return value;

    }

    public Position getPosition() {
        return position;

    }

    public boolean isCollected() {
        return collected;
    }

    public void collect() {

        collected=true;
    }

}