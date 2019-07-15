package com.zoopark.toast.config;

import android.os.Parcel;
import android.os.Parcelable;

import com.nasduck.lib.R;

public final class ToastConfig implements Parcelable {

//    private ToastStyle style;

    private String text;
    private Integer image;
    private Integer anim;
    private Integer textColor;
    private Integer textSize;
    private Integer bgColor;
    private Integer cornerRadius;
    private Integer paddingTop;
    private Integer paddingBottom;
    private Integer paddingLeft;
    private Integer paddingRight;

    private ToastConfig(ToastStyle style) {
        switch (style) {
            case DARK:
                this.textColor = android.R.color.white;
                this.bgColor = R.color.black_alpha_70;
                break;
            case LIGHT:
                this.textColor = R.color.text_black;
                this.bgColor = android.R.color.white;
                break;
        }
        this.textSize = 14;
        this.cornerRadius = 6;
        this.paddingTop = 12;
        this.paddingBottom = 12;
        this.paddingLeft = 24;
        this.paddingRight = 24;
    }

    public static ToastConfig newInstance(ToastStyle style) {
        return new ToastConfig(style);
    }

    public String getText() {
        return text;
    }

    public void setText(String text) {
        this.text = text;
    }

    public Integer getImage() {
        return image;
    }

    public void setImage(Integer image) {
        this.image = image;
    }

    public Integer getAnim() {
        return anim;
    }

    public void setAnim(Integer anim) {
        this.anim = anim;
    }

    public Integer getTextColor() {
        return textColor;
    }

    public void setTextColor(Integer textColor) {
        this.textColor = textColor;
    }

    public Integer getTextSize() {
        return textSize;
    }

    public void setTextSize(Integer textSize) {
        this.textSize = textSize;
    }

    public Integer getBgColor() {
        return bgColor;
    }

    public void setBgColor(Integer bgColor) {
        this.bgColor = bgColor;
    }

    public Integer getCornerRadius() {
        return cornerRadius;
    }

    public void setCornerRadius(Integer cornerRadius) {
        this.cornerRadius = cornerRadius;
    }

    public Integer getPaddingTop() {
        return paddingTop;
    }

    public void setPaddingTop(Integer paddingTop) {
        this.paddingTop = paddingTop;
    }

    public Integer getPaddingBottom() {
        return paddingBottom;
    }

    public void setPaddingBottom(Integer paddingBottom) {
        this.paddingBottom = paddingBottom;
    }

    public Integer getPaddingLeft() {
        return paddingLeft;
    }

    public void setPaddingLeft(Integer paddingLeft) {
        this.paddingLeft = paddingLeft;
    }

    public Integer getPaddingRight() {
        return paddingRight;
    }

    public void setPaddingRight(Integer paddingRight) {
        this.paddingRight = paddingRight;
    }

    @Override
    public int describeContents() {
        return 0;
    }

    @Override
    public void writeToParcel(Parcel dest, int flags) {
        dest.writeString(this.text);
        dest.writeValue(this.image);
        dest.writeValue(this.anim);
        dest.writeValue(this.textColor);
        dest.writeValue(this.textSize);
        dest.writeValue(this.bgColor);
        dest.writeValue(this.cornerRadius);
        dest.writeValue(this.paddingTop);
        dest.writeValue(this.paddingBottom);
        dest.writeValue(this.paddingLeft);
        dest.writeValue(this.paddingRight);
    }

    protected ToastConfig(Parcel in) {
        this.text = in.readString();
        this.image = (Integer) in.readValue(Integer.class.getClassLoader());
        this.anim = (Integer) in.readValue(Integer.class.getClassLoader());
        this.textColor = (Integer) in.readValue(Integer.class.getClassLoader());
        this.textSize = (Integer) in.readValue(Integer.class.getClassLoader());
        this.bgColor = (Integer) in.readValue(Integer.class.getClassLoader());
        this.cornerRadius = (Integer) in.readValue(Integer.class.getClassLoader());
        this.paddingTop = (Integer) in.readValue(Integer.class.getClassLoader());
        this.paddingBottom = (Integer) in.readValue(Integer.class.getClassLoader());
        this.paddingLeft = (Integer) in.readValue(Integer.class.getClassLoader());
        this.paddingRight = (Integer) in.readValue(Integer.class.getClassLoader());
    }

    public static final Creator<ToastConfig> CREATOR = new Creator<ToastConfig>() {
        @Override
        public ToastConfig createFromParcel(Parcel source) {
            return new ToastConfig(source);
        }

        @Override
        public ToastConfig[] newArray(int size) {
            return new ToastConfig[size];
        }
    };
}
