package android.simulator;

/**
 * Created by inafalcao on 9/11/15.
 */
public class View {

    private static OnClickListener clickListener;
    private Context context;

    public void setOnClickListener(OnClickListener clickListener) {
        this.clickListener = clickListener;
    }

    public Context getContext() {
        return context;
    }

    public void click() {
        clickListener.onClick(this);
    }

}
