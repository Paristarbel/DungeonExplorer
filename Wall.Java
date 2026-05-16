public class Wall {

    private Position position;
    
    public Wall(Position position){
        this.position=position;
    }
    
    public Position getPosition(){
        return position;
    }
    
    public boolean blocksMovement(){
        return true;
    }
    
    public boolean blocksVision(){
        return true;
    }
    
}