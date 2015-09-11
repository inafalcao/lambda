package android.simulator;

/**
 * Created by inafalcao on 9/11/15.
 */
public class Toast {

    /** This method should be Android's default toaster. */
    public static void showMessage(Context context, String message) {
        System.out.println(message); // Just simulating ;)
    }

    public static OnClickListener toast(String message) {
        return (View v) -> Toast.showMessage(v.getContext(), message);
    }

}
