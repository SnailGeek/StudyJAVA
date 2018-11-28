package Reusing;

public class NewDetergent extends Detergent
{
    @Override
    public void scrub()
    {
        append(" NewDetergent.scrub()");
        super.scrub();
    }
    public void sterilize()
    {
        append(" sterilize()");
    }
    public static void main(String[] args)
    {
        NewDetergent nd = new NewDetergent();
        nd.dilute();
        nd.apply();
        nd.scrub();
        nd.foam();
        System.out.println(nd);
    }
}
