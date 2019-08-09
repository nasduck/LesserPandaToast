package com.zoopark.toast.lesser;

public abstract class BaseLesserToastBuilder implements ILesserToastBuilder {

    /** show **************************************************************************************/

    public void show() {
        LesserToast.getInstance(getActivity())
                .showToast(getConfig());
    }


}
