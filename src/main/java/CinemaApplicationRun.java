import java.util.ArrayList;
import java.util.List;

public class CinemaApplicationRun {
    public static void main(String[] args) {
        List<Viewer> viewerList = new ArrayList<>();
        viewerList.add(new Viewer("Jane", 18, new Cinema[]{
                new Cinema("Lock, Stock and Two Smoking Barrels", "black comedy, crime", 1.78),
                new Cinema("The Truman Show", "satirical science fiction psychological comedy-drama", 1.72)}));
        viewerList.add(new Viewer("John", 23, new Cinema[]{
                new Cinema("Crazy, Stupid, Love.", "romantic comedy", 1.97),
                new Cinema("Forrest Gump", "comedy, drama", 2.37)}));
        viewerList.add(new Viewer("Jack", 19, new Cinema[]{
                new Cinema("28 Days Later...", "post-apocalyptic horror", 1.88),
                new Cinema("Arrival", "science fiction, drama", 1.93)}));
        viewerList.add(new Viewer("Jessy", 21, new Cinema[]{
                new Cinema("Akira", "adult animated cyberpunk action", 2.07),
                new Cinema("Kill Bill: Vol. 1", "martial arts", 1.85)}));
        viewerList.add(new Viewer("Joe", 22, new Cinema[]{
                new Cinema("Shutter Island", "neo-noir psychological thriller", 2.32),
                new Cinema("Cloud Atlas", "epic science fiction", 2.87)}));
        ViewerStatistics viewerStatistics = new ViewerStatistics();
        viewerStatistics.averageAge(viewerList);
    }
}
