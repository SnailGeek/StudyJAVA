public class Game
{
    public static void main(String[] args) throws InterruptedException
    {
        GoalNotifier goalNotifier = new GoalNotifier();
        Thread goalNotfierThread = new Thread(goalNotifier);
        goalNotfierThread.start();
        Thread.sleep(300);
        goalNotifier.setGoal(true);

    }
}
