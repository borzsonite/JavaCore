package BaseJava.Lesson9.Sandbox.Strategy;

public class Human {
    Activity activity;

    public void setActivity(Activity activity) {
        this.activity = activity;
    }

    public void makeActivity() {
        activity.activity();
    }
}
