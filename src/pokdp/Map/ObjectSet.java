package Map;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.List;

public class ObjectSet {
    private List<List<String>> set = new ArrayList<List<String>>();
    private List<Double> probaList = new ArrayList<Double>();

    public void load(List<String> pathList, double proba) {
        set.add(pathList);
        probaList.add(proba);
    }

    public void load(String path, double proba) {
        ArrayList<String> converted = new ArrayList<>();

        converted.add(path);

        load(converted, proba);
    }

    public List<String> getPathObject(int i) {
        return set.get(i);
    }

    public double getProbability(int i) {
        return probaList.get(i);
    }

    public int size() {
        return set.size();
    }
}
