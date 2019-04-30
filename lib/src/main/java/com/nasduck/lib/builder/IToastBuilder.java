package com.nasduck.lib.builder;

import android.support.v4.app.FragmentActivity;

import com.nasduck.lib.config.ToastConfig;

public interface IToastBuilder {

    FragmentActivity getActivity();

    ToastConfig getConfig();

    void hide();

}
