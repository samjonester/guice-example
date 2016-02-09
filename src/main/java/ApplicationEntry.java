import com.google.inject.Inject;

/**
 * Created by sam on 2/8/16.
 */
public class ApplicationEntry {
    private final Messenger messenger;
    private final Communicator communicator;

    @Inject
    public ApplicationEntry(Messenger messenger, Communicator communicator) {
        this.messenger = messenger;
        this.communicator = communicator;
    }

    public void speak() {
        String message = messenger.getMessage();
        communicator.communicate(message);
    }
}
