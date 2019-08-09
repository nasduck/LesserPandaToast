package com.zoopark.toast.loading.builder.impl;

import android.support.v4.app.FragmentActivity;

import com.zoopark.toast.loading.builder.BaseLoadingToastBuilder;
import com.zoopark.toast.loading.config.LoadingToastConfig;
import com.zoopark.toast.loading.config.ToastStyle;


public class LoadingToastBuilder extends BaseLoadingToastBuilder {

    private FragmentActivity activity;

    private LoadingToastConfig config;

    private LoadingToastBuilder(FragmentActivity activity, LoadingToastConfig config) {
        mHandler.set(this);

        this.activity = activity;
        this.config = config;
    }

    public static LoadingToastBuilder getInstance(FragmentActivity activity, ToastStyle style) {
        return create(activity, LoadingToastConfig.newInstance(style));
    }

    // default dark style
    public static LoadingToastBuilder getInstance(FragmentActivity activity) {
        return create(activity, LoadingToastConfig.newInstance(ToastStyle.DARK));
    }

    public static LoadingToastBuilder create(FragmentActivity activity, LoadingToastConfig config) {
        return new LoadingToastBuilder(activity, config);
    }

    @Override
    public FragmentActivity getActivity() {
        return activity;
    }

    @Override
    public LoadingToastConfig getConfig() {
        return this.config;
    }

    //* Setter & Getter **************************************************************************//

    public LoadingToastBuilder setImage(Integer image) {
        this.config.setImage(image);
        return this;
    }

    public LoadingToastBuilder setText(String text) {
        this.config.setText(text);
        return this;
    }

    public LoadingToastBuilder setTextColor(Integer textColor) {
        this.config.setTextColor(textColor);
        return this;
    }

    public LoadingToastBuilder setTextSize(Integer textSize) {
        this.config.setTextSize(textSize);
        return this;
    }

    public LoadingToastBuilder setBgColor(Integer bgColor) {
        this.config.setBgColor(bgColor);
        return this;
    }

    public LoadingToastBuilder setCornerRadius(Integer cornerRadius) {
        this.config.setCornerRadius(cornerRadius);
        return this;
    }

    public LoadingToastBuilder setPaddingTop(Integer paddingTop) {
        this.config.setPaddingTop(paddingTop);
        return this;
    }

    public LoadingToastBuilder setPaddingBottom(Integer paddingBottom) {
        this.config.setPaddingBottom(paddingBottom);
        return this;
    }

    public LoadingToastBuilder setPaddingLeft(Integer paddingLeft) {
        this.config.setPaddingLeft(paddingLeft);
        return this;
    }

    public LoadingToastBuilder setPaddingRight(Integer paddingRight) {
        this.config.setPaddingRight(paddingRight);
        return this;
    }

    public LoadingToastBuilder setPaddingHorizontal(Integer paddingHorizontal) {
        this.config.setPaddingLeft(paddingHorizontal);
        this.config.setPaddingRight(paddingHorizontal);
        return this;
    }

    public LoadingToastBuilder setPaddingVertical(Integer paddingVertical) {
        this.config.setPaddingTop(paddingVertical);
        this.config.setPaddingBottom(paddingVertical);
        return this;
    }

    public LoadingToastBuilder setPadding(Integer padding) {
        this.config.setPaddingTop(padding);
        this.config.setPaddingBottom(padding);
        this.config.setPaddingLeft(padding);
        this.config.setPaddingRight(padding);
        return this;
    }

    public LoadingToastBuilder setAnimation(Integer animation) {
        this.config.setAnim(animation);
        return this;
    }
}
