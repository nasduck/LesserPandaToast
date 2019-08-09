package com.zoopark.toast.lesser;

import android.content.Context;
import android.graphics.drawable.GradientDrawable;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import android.widget.Toast;

import com.nasduck.lib.R;
import com.zoopark.toast.loading.config.ToastStyle;
import com.zoopark.toast.utils.LesserDensityUtils;

public class LesserToast {

    private Context mContext;

    private FrameLayout mTopView;
    private LinearLayout mLayoutContainer;
    private TextView mTvTitle;
    private ImageView mIvImage;

    private static LesserToast instance;

    private Toast mToast;

    public static LesserToast getInstance(Context context) {
        if (instance == null) {
            instance = new LesserToast(context);
        }
        return instance;
    }

    private LesserToast(Context context) {
        if (context == null || context.getApplicationContext() == null) {
            throw new NullPointerException("context can't be null");
        }
        mContext = context.getApplicationContext();
        initView();
    }

    // 初始化视图
    private void initView() {
        View view = LayoutInflater.from(mContext).inflate(R.layout.toast_text_image, null);
        mTvTitle = view.findViewById(R.id.tv_title);
        mIvImage = view.findViewById(R.id.iv_image);
        mLayoutContainer = view.findViewById(R.id.container);

        ViewGroup.LayoutParams layoutParams = new ViewGroup.LayoutParams(ViewGroup.LayoutParams.WRAP_CONTENT, ViewGroup.LayoutParams.WRAP_CONTENT);
        mTopView = new FrameLayout(mContext);
        mTopView.setLayoutParams(layoutParams);
        mTopView.addView(view);

        mToast = new Toast(mContext);
        mToast.setView(mTopView);
    }

    public void showToast(LesserToastConfig config) {
        if (config == null) {
            config = LesserToastConfig.newInstance(ToastStyle.DARK);
        }

        // Title
        mTvTitle.setTextSize(config.getTextSize());
        mTvTitle.setTextColor(mContext.getResources().getColor(config.getTextColor()));
        if (TextUtils.isEmpty(config.getText())) {
            mTvTitle.setText("");
            mTvTitle.setVisibility(View.GONE);
        } else {
            mTvTitle.setText(config.getText());
            mTvTitle.setVisibility(View.VISIBLE);
        }

        // Image
        mIvImage.clearAnimation();
        if (config.getImage() != null) {
            mIvImage.setVisibility(View.VISIBLE);
            mIvImage.setImageResource(config.getImage());
        } else {
            mIvImage.setVisibility(View.GONE);
            mIvImage.setImageDrawable(null);
        }

        if (config.getImage() != null && !TextUtils.isEmpty(config.getText())) {
            ViewGroup.MarginLayoutParams lp = (ViewGroup.MarginLayoutParams) mTvTitle.getLayoutParams();
            lp.topMargin = LesserDensityUtils.dp2px(mContext, 6);
            mTvTitle.setLayoutParams(lp);
        } else {
            ViewGroup.MarginLayoutParams lp = (ViewGroup.MarginLayoutParams) mTvTitle.getLayoutParams();
            lp.topMargin = 0;
            mTvTitle.setLayoutParams(lp);
        }

        if (config.getAnim() != null) { // Set Animation
            Animation animation = AnimationUtils.loadAnimation(mContext, config.getAnim());
            mIvImage.setAnimation(animation);
        }

        // Padding
        mLayoutContainer.setPadding(LesserDensityUtils.dp2px(mContext, config.getPaddingLeft()),
                LesserDensityUtils.dp2px(mContext, config.getPaddingTop()),
                LesserDensityUtils.dp2px(mContext, config.getPaddingRight()),
                LesserDensityUtils.dp2px(mContext, config.getPaddingBottom()));

        // Corner Radius && Background Color
        GradientDrawable drawable = new GradientDrawable();
        drawable.setCornerRadius(LesserDensityUtils.dp2px(mContext, config.getCornerRadius()));
        drawable.setColor(mContext.getResources().getColor(config.getBgColor()));
        mLayoutContainer.setBackground(drawable);
        
        mToast.setDuration(config.getDuration());
        mToast.setGravity(config.getGravity(), config.getxOffset(), config.getyOffset());
        mToast.show();
    }
}
