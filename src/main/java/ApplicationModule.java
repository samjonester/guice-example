import com.google.inject.AbstractModule;
import com.google.inject.Provides;

/**
 * Created by sam on 2/8/16.
 */
public class ApplicationModule extends AbstractModule {
    @Override
    protected void configure() {
    }

    @Provides
    Communicator provideCommunicator() {
        return new Communicator(System.out);
    }
}
