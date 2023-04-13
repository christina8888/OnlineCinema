import java.util.ArrayList;
import java.util.List;

public class ViewerStatistics {
    public void averageAge(List<Viewer> viewers) {
        List<Integer> ages = new ArrayList<>();
        for (Viewer viewer : viewers) {
            ages.add(viewer.getAge());
        }
        System.out.println((int) ages.stream().mapToInt(x -> x).average().getAsDouble());
    }
}
