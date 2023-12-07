package projet;

import java.util.Timer;
import java.util.TimerTask;

public class MainAlgorythm {

    public static Base base;
    public static WildFires wildfires;
    public static Interface view;


    public static final int MAXTIME = 18000;
    public static int remainingTime = 18000;
    public static final int timeToSleep = 1000;

    public static int nbExplorationRobots = 3;
    public static int nbRobots = 7;
    public static int nbExistingFires = 10;

    public static void doTasks() {
        base.next();
        wildfires.next();
        view.update();
    }

    public static void main(String[] args) {
        base = Base.getInstance(nbRobots, nbExplorationRobots);
        wildfires = WildFires.getInstance(nbExistingFires);
        view = new Interface();
        view.setVisible(true);



        Timer timer = new Timer();

        TimerTask task = new TimerTask() {
            @Override
            public void run() {
                doTasks();
                remainingTime -= timeToSleep;

                if (remainingTime <= 0 || wildfires.fires.length == 0) {
                    timer.cancel(); // Stop the timer when the condition is met
                    if (remainingTime <= 0) {
						int nbPeopleSaved = base.nbPeopleSaved;
                        System.out.println("Perdu, il reste " + wildfires.fires.length + " feux, vous avez sauvé " + nbPeopleSaved + " personnes");
                    } else {
                        double time = (MAXTIME - remainingTime) / 1000;
                        System.out.print("Feux éteints en :" + time + "s");
                    }
                }
            }
        };

        timer.scheduleAtFixedRate(task, 0, timeToSleep);
    }
}