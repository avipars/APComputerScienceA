import info.gridworld.actor.Bug;
public class DancingBug extends Bug
{
    private int[] turnList;
    private int currentStep;
    public DancingBug(int[] turns)
    {
        turnList = turns;
        currentStep = 0;
    }
    public void turn(int times)
    {
        for(int i = 1; i <= times; i++)
        {
            turn();
        }
    }
    public void act()
    {
        if(currentStep == turnList.length)
        currentStep = 0;
        turn (turnList[currentStep]);
        currentStep++;
        super.act();
    }
}