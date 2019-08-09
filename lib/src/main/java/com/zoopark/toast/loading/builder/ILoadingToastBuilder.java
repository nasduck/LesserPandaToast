package com.zoopark.toast.loading.builder;

import android.support.v4.app.FragmentActivity;

import com.zoopark.toast.loading.config.LoadingToastConfig;

public interface ILoadingToastBuilder {

    FragmentActivity getActivity();

    LoadingToastConfig getConfig();

    void hide();

}
