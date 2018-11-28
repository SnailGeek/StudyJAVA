package Chapter18;

public interface Competitor<T extends Competitor<T>>
{
    Outcome compete(T competitor);
}
