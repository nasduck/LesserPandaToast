package com.zoopark.toast.loading.builder;

import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;

import com.zoopark.toast.loading.handler.ToastHandler;
import com.zoopark.toast.loading.toast.impl.LoadingToast;

public abstract class BaseLoadingToastBuilder implements ILoadingToastBuilder {

    private final static String TOAST_TAG = "toast_tag";

    protected static ToastHandler mHandler = new ToastHandler();

    /**
     * show toast
     */
    public void show() {
        mHandler.removeMessages(ToastHandler.MSG_HIDE);
        FragmentManager manager = getActivity().getSupportFragmentManager();
        LoadingToast loadingToast = (LoadingToast)manager.findFragmentByTag(TOAST_TAG);
        if (loadingToast != null) {
            loadingToast.updateUI(getConfig());
        } else {
            // Show LoadingToast
            LoadingToast.newInstance(getConfig())
                    .showNow(manager, TOAST_TAG);
        }
    }

    /**
     * toast dismiss immediately
     */
    public static void dismiss() {
        mHandler.removeMessages(ToastHandler.MSG_HIDE);
        mHandler.sendEmptyMessage(ToastHandler.MSG_HIDE);
    }

    /**
     * toast dismiss with delay
     * @param delay
     */
    public static void dismiss(long delay) {
        mHandler.removeMessages(ToastHandler.MSG_HIDE);
        mHandler.sendEmptyMessageDelayed(ToastHandler.MSG_HIDE, delay);
    }

    /**
     * hide toast
     */
    public void hide() {
        FragmentManager manager = getActivity().getSupportFragmentManager();
        Fragment frag = manager.findFragmentByTag(TOAST_TAG);
        if (frag != null) {

            /**FragmentTransaction t = manager.beginTransaction();
            t.remove(frag);
            t.commitAllowingStateLoss();**/

            ((LoadingToast)frag).dismiss();
        }
    }

}
