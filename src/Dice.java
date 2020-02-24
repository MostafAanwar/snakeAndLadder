public class Dice {
    private int rollCount = 0;
    public int totalRollCount = 0;
    public double averageRollCount = 0.0;
    // function that rolls the die
    public int rollDie(){
        int SIDES = 6;   // how many sides on the die?

        // roll should be 1 through SIDES
        int roll = (int) (Math.random() * SIDES) + 1;
        rollCount++;
        // print result
        System.out.println(roll);
        return  roll;
    }
    public void count(){
        totalRollCount++;
    }
    int getRollCount(){
        return this.rollCount;
    }
    void setRollCount(int count){
        rollCount = count;
    }

    public void avgRollCount(double n){
        averageRollCount = totalRollCount / n;
    }

}
