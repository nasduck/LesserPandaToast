package com.nasduck.duckandroidtoast;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

import com.nasduck.lib.LesserPandaToast;
import com.nasduck.lib.builder.impl.ToastBuilder;

public class ToastActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_toast);
    }

    public void onDefaultClick(View view) {
        LesserPandaToast.show(this, "Toast Default");
    }

    public void onSuccessClick(View view) {
        LesserPandaToast.showSuccess(this);
    }

    public void onFailureClick(View view) {
        LesserPandaToast.showFailure(this);
    }

    public void onWarningClick(View view) {
        LesserPandaToast.showWarning(this);
    }

    public void onLoadingClick(View view) {
        LesserPandaToast.showLoading(this);
    }

    public void onSuccessTextClick(View view) {
        LesserPandaToast.showSuccess(this, "success");
    }

    public void onFailureTextClick(View view) {
        LesserPandaToast.showFailure(this, "failure");
    }

    public void onWarningTextClick(View view) {
        LesserPandaToast.showWarning(this, "warning");
    }

    public void onLoadingTextClick(View view) {
        LesserPandaToast.showLoading(this, "loading");
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
