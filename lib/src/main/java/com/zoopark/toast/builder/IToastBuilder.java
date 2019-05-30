package com.zoopark.toast.builder;

import android.support.v4.app.FragmentActivity;

import com.zoopark.toast.config.ToastConfig;

public interface IToastBuilder {

    FragmentActivity getActivity();

    ToastConfig getConfig();

    void hide();

}
