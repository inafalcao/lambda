import static android.simulator.Toast.*;
import android.simulator.View;
import static lambda.Executor.*;
import lambda.Lambda;

/**
 * Created by inafalcao on 9/11/15.
 */
public class Main {

    public static void main(String[] args) {

        View v = new View();

        v.setOnClickListener(toast("Suck that!!!"));
        v.click();

        // Or... if you want to pass ANY FUNCTION AT ALL.

        v.setOnClickListener($(validate));
        v.click();

        v.setOnClickListener($(executeAnything));
        v.click();

        v.setOnClickListener($(() -> System.out.println("I can do like this too.")));
        v.click();

    }

    // Yes, i'm using lambdas
    static Lambda validate = () -> validate();
    static Lambda executeAnything = () -> executeAnything();

    /** Methods you'll have on your class */

    public static void validate() {
        System.out.println("Do some validation");
    }

    public static void executeAnything() {
        System.out.println("Do anything you want");
    }

}
