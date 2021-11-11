import java.util.HashMap;

class MultiSet {
    private HashMap<String, Integer> data;

    public MultiSet() {
        data = new HashMap<>();
    }

    public MultiSet(HashMap<String, Integer> other) {
        data = new HashMap<>(other);
    }

    public HashMap<String, Integer> getData() {
        return new HashMap<>(data);
    }

    public void put(String item) {
        if (data.containsKey(item)) {
            int mult = data.get(item) + 1;
            data.replace(item, mult);
        } else {
            data.put(item, 1);
        }
    }

    public MultiSet intersect(MultiSet other) {
        HashMap<String, Integer> result = new HashMap<>();
        for (String key : data.keySet()) {
            if (other.data.containsKey(key)) {
                result.put(key, Math.min(data.get(key), other.data.get(key)));
            }
        }
        return new MultiSet(result);
    }
}