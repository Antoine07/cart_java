package domain;
public interface Storage {
    void set(String name, double total);
    void  delete(String name);
    void reset();
    double total();
}
