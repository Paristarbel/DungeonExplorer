public class Player {

    private String name;
    private double  health;
    private Position position;
    private Direction direction=Direction.NORTH;;

    public Player(){
        this.name="not found";
        this.health=0.0;
        this.position = new Position();
        this.direction=Direction.NORTH;

    }
    public Player(String name,double  health,Position position){
        this.name=name;
        this.health=health;
        this.position=position;
        this.direction=Direction.NORTH;
    }
    public String getName(){
        return name;
    }
    public double getHealth(){
        return health;
    }
    public  Position getPosition(){
        return position;
    }
    public Direction getDirection(){
        return direction;
    }

// move north/south/west/east
    public void moveNorth(){
//        Position newPosition= new Position(x,y);
        getPosition().moveNorth();

    }
    public void moveSouth(){
//            Position newPosition = new Position(x, y);
            getPosition().moveSouth();
    }
    public void moveWest(){
//        Position newPosition= new Position(x,y);
        getPosition().moveWest();

    }
    public void moveEast(){

        getPosition().moveEast();

    }

    public void turnNorth(){
        this.direction=Direction.NORTH;
    }
    public void turnSouth(){
        this.direction=Direction.SOUTH;
    }
    public void turnWest(){
        this.direction=Direction.WEST;
    }
    public void turnEast(){
        this.direction=Direction.EAST;
    }



}
