public class Main {

    public static void main(String[] args) {
        //instance of the board
        Board board = new Board();

        //player instance
        Player p1 = new Player();

        //dice instance
        Dice d6 = new Dice();
        double numberOfRuns = 10000;

        //loop on number of runs
        for (int i = 0; i < numberOfRuns; i++){
            while(p1.getPosition() < 30){
                p1.setPosition(d6.rollDie());
                d6.count();
            }
            p1.resetPosition();
            System.out.println("total roll count so far: " + d6.totalRollCount);
        }
        d6.avgRollCount(numberOfRuns);
        System.out.println("average roll count is " + d6.averageRollCount);
    }
}
