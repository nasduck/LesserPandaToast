package com.zoopark.toast.lesser;

import android.support.v4.app.FragmentActivity;

import com.zoopark.toast.loading.config.ToastStyle;

public class LesserToastBuilder extends BaseLesserToastBuilder {

    private FragmentActivity activity;

    private LesserToastConfig config;

    private LesserToastBuilder(FragmentActivity activity, LesserToastConfig config) {
        this.activity = activity;
        this.config = config;
    }

    public static LesserToastBuilder getInstance(FragmentActivity activity, ToastStyle style) {
        return create(activity, LesserToastConfig.newInstance(style));
    }

    // default dark style
    public static LesserToastBuilder getInstance(FragmentActivity activity) {
        return create(activity, LesserToastConfig.newInstance(ToastStyle.DARK));
    }

    public static LesserToastBuilder create(FragmentActivity activity, LesserToastConfig config) {
        return new LesserToastBuilder(activity, config);
    }

    @Override
    public LesserToastConfig getConfig() {
        return config;
    }

    @Override
    public FragmentActivity getActivity() {
        return activity;
    }

    /** setter ************************************************************************************/

    public LesserToastBuilder setImage(Integer image) {
        this.config.setImage(image);
        return this;
    }

    public LesserToastBuilder setText(String text) {
        this.config.setText(text);
        return this;
    }

    public LesserToastBuilder setTextColor(Integer textColor) {
        this.config.setTextColor(textColor);
        return this;
    }

    public LesserToastBuilder setTextSize(Integer textSize) {
        this.config.setTextSize(textSize);
        return this;
    }

    public LesserToastBuilder setBgColor(Integer bgColor) {
        this.config.setBgColor(bgColor);
        return this;
    }

    public LesserToastBuilder setCornerRadius(Integer cornerRadius) {
        this.config.setCornerRadius(cornerRadius);
        return this;
    }

    public LesserToastBuilder setPaddingTop(Integer paddingTop) {
        this.config.setPaddingTop(paddingTop);
        return this;
    }

    public LesserToastBuilder setPaddingBottom(Integer paddingBottom) {
        this.config.setPaddingBottom(paddingBottom);
        return this;
    }

    public LesserToastBuilder setPaddingLeft(Integer paddingLeft) {
        this.config.setPaddingLeft(paddingLeft);
        return this;
    }

    public LesserToastBuilder setPaddingRight(Integer paddingRight) {
        this.config.setPaddingRight(paddingRight);
        return this;
    }

    public LesserToastBuilder setPaddingHorizontal(Integer paddingHorizontal) {
        this.config.setPaddingLeft(paddingHorizontal);
        this.config.setPaddingRight(paddingHorizontal);
        return this;
    }

    public LesserToastBuilder setPaddingVertical(Integer paddingVertical) {
        this.config.setPaddingTop(paddingVertical);
        this.config.setPaddingBottom(paddingVertical);
        return this;
    }

    public LesserToastBuilder setPadding(Integer padding) {
        this.config.setPaddingLeft(padding);
        this.config.setPaddingRight(padding);
        this.config.setPaddingTop(padding);
        this.config.setPaddingBottom(padding);
        return this;
    }

    public LesserToastBuilder setAnimation(Integer animation) {
        this.config.setAnim(animation);
        return this;
    }

    public LesserToastBuilder setGravity(Integer gravity) {
        this.config.setGravity(gravity);
        return this;
    }

    public LesserToastBuilder setXOffset(Integer xOffset) {
        this.config.setxOffset(xOffset);
        return this;
    }

    public LesserToastBuilder setYOffset(Integer yOffset) {
        this.config.setyOffset(yOffset);
        return this;
    }

    public LesserToastBuilder setDuration(Integer duration) {
        this.config.setDuration(duration);
        return this;
    }
}
