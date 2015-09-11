package lambda;

import android.simulator.OnClickListener;
import android.simulator.View;

/**
 * Created by inafalcao on 9/11/15.
 */
public class Executor {

    public static OnClickListener $(Lambda lambda) {
        return (View v) -> lambda.doIt();
    }

}
