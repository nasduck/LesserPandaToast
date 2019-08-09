package com.zoopark.toast.lesser;

import android.view.Gravity;
import android.widget.Toast;

import com.nasduck.lib.R;
import com.zoopark.toast.loading.config.ToastStyle;

public class LesserToastConfig {

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

    private Integer duration;
    private Integer gravity;
    private Integer xOffset;
    private Integer yOffset;

    private LesserToastConfig(ToastStyle style) {
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
        this.duration = Toast.LENGTH_SHORT;
        this.gravity = Gravity.CENTER;
        this.xOffset = 0;
        this.yOffset = 0;
    }

    public static LesserToastConfig newInstance(ToastStyle style) {
        return new LesserToastConfig(style);
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

    public Integer getDuration() {
        return duration;
    }

    public void setDuration(Integer duration) {
        this.duration = duration;
    }

    public Integer getGravity() {
        return gravity;
    }

    public void setGravity(Integer gravity) {
        this.gravity = gravity;
    }

    public Integer getxOffset() {
        return xOffset;
    }

    public void setxOffset(Integer xOffset) {
        this.xOffset = xOffset;
    }

    public Integer getyOffset() {
        return yOffset;
    }

    public void setyOffset(Integer yOffset) {
        this.yOffset = yOffset;
    }
}
