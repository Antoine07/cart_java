package storage;

import java.util.*;
import domain.Storage;

public class ListStorage implements Storage {
    // Entry name total
    private List<Entry> items = new ArrayList<>();

    @Override
    public void set(String name, double total) {

        for (Entry entry : items) {
            if (entry.name == name) {
                entry.total += total;
                return; // void
            }
        }

        items.add(new Entry(name, total));
    }

    @Override
    public void delete(String name) {
        int i = 0;
        for (Entry entry : items) {
            if (entry.name == name) {
                items.remove(i);
                return; // void
            }
            i++;
        }
    }

    @Override
    public void reset() {
        items.clear();
    }

    @Override
    public double total() {
        double s = 0;

        for (int i = 0; i < items.size(); i++) {
            s += items.get(i).total;
        }

        return s;
    }
}
