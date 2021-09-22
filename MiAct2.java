public class MiAct2 {
    public static void main(String[] args) {
        

        //A spinning tire makes 3000 revolutions per minute. 
        //Calculate How many degrees it rotate in one second.
        
        //declaration of variables
        int revs = 3000, deg = 360; 
        int dps, rps;

        //calculations
        rps = revs / 60;
        dps = rps * deg;

        System.out.printf(dps + " degree per second");//printing the degree per second
    }
    
}