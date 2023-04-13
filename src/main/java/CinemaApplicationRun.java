import java.util.ArrayList;
import java.util.List;

public class CinemaApplicationRun {
    public static void main(String[] args) {
        List<Viewer> viewerList = new ArrayList<>();
        viewerList.add(new Viewer("Jane", 18, new String[]{"Lock, Stock and Two Smoking Barrels",
                "The Truman Show"}));
        viewerList.add(new Viewer("John", 23, new String[]{"Crazy, Stupid, Love.", "Forrest Gump"}));
        viewerList.add(new Viewer("Jack", 19, new String[]{"28 Days Later...", "Arrival"}));
        viewerList.add(new Viewer("Jessy", 21, new String[]{"Akira", "Kill Bill: Vol. 1"}));
        viewerList.add(new Viewer("Joe", 22, new String[]{"Shutter Island", "Cloud Atlas"}));
        ViewerStatistics viewerStatistics = new ViewerStatistics();
        viewerStatistics.averageAge(viewerList);
    }
}
