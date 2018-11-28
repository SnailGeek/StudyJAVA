package Chapter18;

import javax.servlet.Servlet;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import java.math.BigInteger;
import java.util.concurrent.atomic.AtomicReference;

public class UnsafeCachingFactorizer implements Servlet
{
    private final AtomicReference<BigInteger> lastNumber =
            new AtomicReference<>();
    private final AtomicReference<BigInteger> lastFactors =
            new AtomicReference<>();

    public void service(ServletRequest req, ServletResponse resp)
    {
        BigInteger i = extractFromRequest(req);
    }
}
