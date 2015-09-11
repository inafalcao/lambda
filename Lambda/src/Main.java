import static android.simulator.Toast.*;
import android.simulator.View;

/**
 * Created by inafalcao on 9/11/15.
 */
public class Main {

    public static void main(String[] args) {

        View v = new View();
        v.setOnClickListener(toast("Suck that!!!"));
        v.click();

    }

}
