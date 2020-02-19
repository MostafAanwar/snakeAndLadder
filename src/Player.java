public class Player {
    private int position = 0;

    int getPosition(){
        return this.position;
    }

    void setPosition(int pos){
        position += pos;
    }
    // method to reset the player position back to the start after each run
    void resetPosition(){
        position = 0;
    }
}
