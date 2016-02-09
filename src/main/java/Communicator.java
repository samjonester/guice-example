import java.io.PrintStream;

/**
 * Created by sam on 2/8/16.
 */
public class Communicator {

    private final PrintStream outputStream;

    public Communicator(PrintStream outputStream) {
        this.outputStream = outputStream;
    }

    public void communicate(String message) {
        outputStream.println(message);
    }
}
