public class GoalNotifier implements Runnable
{
    public boolean goal = false;
    public boolean isGoal()
    {
        return goal;
    }
    public void setGoal(boolean goal)
    {
        this.goal = goal;
    }

    @Override
    public void run()
    {
        while(true)
        {
            if (isGoal())
            {
                System.out.println("Goall !!!");
                setGoal(false);
            }
        }
    }
}
