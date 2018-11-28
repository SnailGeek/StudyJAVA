package Chapter2;
import util.Tools;
public class RaceCondionDemo
{
    public static void main(String[] args)
    {
        int numberOfThreads = args.length > 0 ? Short.valueOf(args[0]) : Runtime.getRuntime().availableProcessors();
        Thread[] workerThreads = new Thread[numberOfThreads];
        for (int i = 0; i < numberOfThreads; i++)
        {
            workerThreads[i] = new WorkerThread(i, 10);
        }
        for (Thread ct : workerThreads)
            ct.start();
    }
    static class WorkerThread extends Thread
    {
        private final int requesetCount;

        public WorkerThread(int id, int requesetCount)
        {
            super("worker-" + id);
            this.requesetCount = requesetCount;
        }

        @Override
        public void run() {
            int i = requesetCount;
            String requesetID;
            RequestIDGenerator requestIDGen = RequestIDGenerator.getInstance();
            while(i-- > 0)
            {
                requesetID = requestIDGen.nextID();
                processRequest(requesetID);
            }
        }
        private void processRequest(String requestID)
        {
//            Tools.randomPause(5);
            System.out.printf("%s got requestID: %s %n",
                    Thread.currentThread().getName(), requestID);

        }
    }
}
