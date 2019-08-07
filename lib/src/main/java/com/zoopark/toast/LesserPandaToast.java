package com.zoopark.toast;

import android.support.v4.app.FragmentActivity;

import com.nasduck.lib.R;
import com.zoopark.toast.builder.impl.ToastBuilder;
import com.zoopark.toast.config.ToastStyle;

public class LesserPandaToast {

    public static void dismiss() {
        ToastBuilder.dismiss();
    }

    public static void dismiss(long delay) {
        ToastBuilder.dismiss(delay);
    }

    public static void show(FragmentActivity activity, String text) {
        ToastBuilder.getInstance(activity)
                .setText(text)
                .show();
    }

    public static void show(FragmentActivity activity, String text, ToastStyle style) {
        ToastBuilder.getInstance(activity, style)
                .setText(text)
                .show();
    }

    public static void showSuccess(FragmentActivity activity) {
        ToastBuilder.getInstance(activity)
                .setImage(R.drawable.ic_success)
                .setPadding(24)
                .show();
    }

    public static void showSuccess(FragmentActivity activity, ToastStyle style) {
        ToastBuilder.getInstance(activity, style)
                .setImage(R.drawable.ic_success)
                .setPadding(24)
                .show();
    }

    public static void showSuccess(FragmentActivity activity, String text) {
        ToastBuilder.getInstance(activity)
                .setImage(R.drawable.ic_success)
                .setText(text)
                .setPaddingTop(20)
                .setPaddingBottom(12)
                .show();
    }

    public static void showSuccess(FragmentActivity activity, String text, ToastStyle style) {
        ToastBuilder.getInstance(activity, style)
                .setImage(R.drawable.ic_success)
                .setText(text)
                .setPaddingTop(20)
                .setPaddingBottom(12)
                .show();
    }

    public static void showWarning(FragmentActivity activity) {
        ToastBuilder.getInstance(activity)
                .setImage(R.drawable.ic_warning)
                .setPadding(24)
                .show();
    }

    public static void showWarning(FragmentActivity activity, ToastStyle style) {
        switch (style) {
            case DARK:
                ToastBuilder.getInstance(activity, style)
                        .setImage(R.drawable.ic_warning)
                        .setPadding(24)
                        .show();
                break;
            case LIGHT:
                ToastBuilder.getInstance(activity, style)
                        .setImage(R.drawable.ic_warning_dark)
                        .setPadding(24)
                        .show();
                break;
        }

    }

    public static void showWarning(FragmentActivity activity, String text) {
        ToastBuilder.getInstance(activity)
                .setImage(R.drawable.ic_warning)
                .setText(text)
                .setPaddingTop(20)
                .setPaddingBottom(12)
                .show();
    }

    public static void showWarning(FragmentActivity activity, String text, ToastStyle style) {
        switch (style) {
            case DARK:
                ToastBuilder.getInstance(activity, style)
                        .setImage(R.drawable.ic_warning)
                        .setText(text)
                        .setPaddingTop(20)
                        .setPaddingBottom(12)
                        .show();
                break;
            case LIGHT:
                ToastBuilder.getInstance(activity, style)
                        .setImage(R.drawable.ic_warning_dark)
                        .setText(text)
                        .setPaddingTop(20)
                        .setPaddingBottom(12)
                        .show();
                break;
        }

    }

    public static void showFailure(FragmentActivity activity) {
        ToastBuilder.getInstance(activity)
                .setImage(R.drawable.ic_failure)
                .setPadding(24)
                .show();
    }

    public static void showFailure(FragmentActivity activity, ToastStyle style) {
        ToastBuilder.getInstance(activity, style)
                .setImage(R.drawable.ic_failure)
                .setPadding(24)
                .show();
    }

    public static void showFailure(FragmentActivity activity, String text) {
        ToastBuilder.getInstance(activity)
                .setImage(R.drawable.ic_failure)
                .setText(text)
                .setPaddingTop(20)
                .setPaddingBottom(12)
                .show();
    }

    public static void showFailure(FragmentActivity activity, String text, ToastStyle style) {
        ToastBuilder.getInstance(activity, style)
                .setImage(R.drawable.ic_failure)
                .setText(text)
                .setPaddingTop(20)
                .setPaddingBottom(12)
                .show();
    }

    public static void showLoading(FragmentActivity activity) {
        ToastBuilder.getInstance(activity)
                .setImage(R.drawable.ic_loading)
                .setAnimation(R.anim.anim_loading_rotate)
                .setPadding(24)
                .show();
    }

    public static void showLoading(FragmentActivity activity, ToastStyle style) {
        ToastBuilder.getInstance(activity, style)
                .setImage(R.drawable.ic_loading)
                .setAnimation(R.anim.anim_loading_rotate)
                .setPadding(24)
                .show();
    }

    public static void showLoading(FragmentActivity activity, String text) {
        ToastBuilder.getInstance(activity)
                .setImage(R.drawable.ic_loading)
                .setAnimation(R.anim.anim_loading_rotate)
                .setText(text)
                .setPaddingTop(20)
                .setPaddingBottom(12)
                .show();
    }

    public static void showLoading(FragmentActivity activity, String text, ToastStyle style) {
        ToastBuilder.getInstance(activity, style)
                .setImage(R.drawable.ic_loading)
                .setAnimation(R.anim.anim_loading_rotate)
                .setText(text)
                .setPaddingTop(20)
                .setPaddingBottom(12)
                .show();
    }
}
