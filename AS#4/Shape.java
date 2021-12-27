import java.util.ArrayList;

public abstract class Shape {

    protected String color;
    //define color constants
    public static final String RESET = "\033[0m";
    protected ArrayList<String> lines = new ArrayList<String>();

    public abstract void draw();

    public abstract void drawStage(int index);

}
