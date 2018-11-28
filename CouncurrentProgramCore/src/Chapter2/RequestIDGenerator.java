package Chapter2;

import java.text.DecimalFormat;
import java.text.SimpleDateFormat;
import java.util.Date;

interface CircularSeqGenerator
{
    public short nextSequence();
}

public class RequestIDGenerator implements CircularSeqGenerator
{
    private final static RequestIDGenerator INSTANCE = new RequestIDGenerator();
    private final static short SEQ_UPPER_LIMIT = 999;
    private short sequence = -1;

    private RequestIDGenerator()
    {}

    @Override
    public short nextSequence() {
        synchronized (this)
        {
            if (sequence > SEQ_UPPER_LIMIT)
            {
                sequence = 0;
            }
            else
                sequence++;
        }
        return sequence;
    }

    public String nextID()
    {
        SimpleDateFormat sdf = new SimpleDateFormat("yyMMddHHmmss");
        String timeStamp = sdf.format(new Date());
        DecimalFormat df = new DecimalFormat("000");

        short sequenceNo = nextSequence();
        return "0049" + timeStamp + df.format(sequenceNo);
    }
    public static RequestIDGenerator getInstance()
    {
        return INSTANCE;
    }
}
