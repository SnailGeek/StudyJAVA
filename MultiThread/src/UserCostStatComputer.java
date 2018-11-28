import java.math.BigInteger;
import java.util.concurrent.TimeUnit;

public class UserCostStatComputer implements Computable<String, BigInteger>
{
    public BigInteger compute(String userId) throws Exception
    {
        TimeUnit.SECONDS.sleep(3);
        return new BigInteger(userId);
    }

}
