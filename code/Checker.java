package code;

public class Checker {
    private boolean king, alive;
    private int position;
    private String color;
    public Checker(int position, String color){
        king = false;
        alive = false;
        this.position = position;
        this.color = color;
    }
    public void setKing(boolean king){
        this.king = king;
    }
    public boolean getKing(){
        return king;
    }
    public void setAlive(boolean alive){
        this.alive = alive;
    }
    public boolean getAlive(){
        return alive;
    }
    public void setPosiiton(int position){
        this.position = position;
    }
    public int getPosition(){
        return position;
    }
    public void setColor(String color){
        this.color = color;
    }
    public String getColor(){
        return color;
    }
    public String toString(){
        
    }
}
