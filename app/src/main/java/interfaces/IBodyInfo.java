package interfaces;

/**
 * Created by AntiHacker on 27.07.2015 at 13:28.
 */
public interface IBodyInfo {

    //GETTER
    double get_height();

    double get_weight();

    int get_age();

    //SETTER
    void set_age(int _age);

    void set_height(double _height);

    void set_weight(double _weight);
}
