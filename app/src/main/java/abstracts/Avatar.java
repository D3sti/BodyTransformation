package abstracts;

import entities.BodyInfo;

/**
 * Created by AntiHacker on 27.07.2015.
 */
public abstract class Avatar {


    //Fields
    private BodyInfo _bodyInfo;


    /* Properties */

    public void set_bodyInfo(BodyInfo _bodyInfo) {
        this._bodyInfo = _bodyInfo;
    }

    public BodyInfo get_bodyInfo() {
        return _bodyInfo;
    }


    //Methods


}
