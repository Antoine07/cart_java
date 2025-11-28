public interface Storage {
    void set(String name, int quantity);
    void reset(String name);
    void  delete();
    double total();
}
