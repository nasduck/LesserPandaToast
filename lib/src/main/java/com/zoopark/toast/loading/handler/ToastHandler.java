package com.zoopark.toast.loading.handler;

import android.os.Handler;
import android.os.Message;

import com.zoopark.toast.loading.builder.ILoadingToastBuilder;

import java.lang.ref.WeakReference;

public class ToastHandler extends Handler {

    public static final int MSG_HIDE = 999;

    private WeakReference<ILoadingToastBuilder> mBuilderRef;

    public ToastHandler() {}

    public void set(ILoadingToastBuilder builder) {
        this.mBuilderRef = new WeakReference<>(builder);
    }

    @Override
    public void handleMessage(Message msg) {
        switch (msg.what) {
            case MSG_HIDE:
                this.removeMessages(MSG_HIDE);
                if (mBuilderRef.get() != null) mBuilderRef.get().hide();
                break;
        }
    }
}
