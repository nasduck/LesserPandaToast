package com.nasduck.duckandroidtoast;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

import com.zoopark.toast.LesserPandaToast;
import com.zoopark.toast.builder.impl.ToastBuilder;
import com.zoopark.toast.config.ToastStyle;

public class ToastActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_toast);
    }

    public void onDefaultClick(View view) {
        LesserPandaToast.show(this, String.valueOf(getResources().getText(R.string.default_toast)), ToastStyle.LIGHT);
    }

    public void onSuccessClick(View view) {
        LesserPandaToast.showSuccess(this, ToastStyle.LIGHT);
    }

    public void onFailureClick(View view) {
        LesserPandaToast.showFailure(this, ToastStyle.LIGHT);
    }

    public void onWarningClick(View view) {
        LesserPandaToast.showWarning(this, ToastStyle.LIGHT);
    }

    public void onLoadingClick(View view) {
        LesserPandaToast.showLoading(this, ToastStyle.LIGHT);
    }

    public void onSuccessTextClick(View view) {
        LesserPandaToast.showSuccess(this, String.valueOf(getResources().getText(R.string.success)), ToastStyle.LIGHT);
    }

    public void onFailureTextClick(View view) {
        LesserPandaToast.showFailure(this, String.valueOf(getResources().getText(R.string.failure)), ToastStyle.LIGHT);
    }

    public void onWarningTextClick(View view) {
        LesserPandaToast.showWarning(this, String.valueOf(getResources().getText(R.string.warning)), ToastStyle.LIGHT);
    }

    public void onLoadingTextClick(View view) {
        LesserPandaToast.showLoading(this, String.valueOf(getResources().getText(R.string.loading)), ToastStyle.LIGHT);
    }

    public void onHideToastClick(View view) {
        LesserPandaToast.dismiss();
    }

    public void onToastCustomClick(View view) {
        ToastBuilder.getInstance(this)
                .setText("hello world!")
                .setTextSize(20)
                .setTextColor(android.R.color.holo_red_light)
                .setBgColor(android.R.color.holo_green_light)
                .setCornerRadius(10)
                .setPaddingHorizontal(22)
                .setPaddingVertical(22)
                .show();
        ToastBuilder.dismiss(1500);
    }
}
