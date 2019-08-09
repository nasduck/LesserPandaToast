package com.nasduck.duckandroidtoast;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.Toolbar;
import android.view.MenuItem;
import android.view.View;

import com.zoopark.toast.LesserPandaToast;
import com.zoopark.toast.loading.builder.impl.LoadingToastBuilder;
import com.zoopark.toast.loading.config.ToastStyle;

public class LightToastActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_light_toast);

        Toolbar toolbar = findViewById(R.id.toolbar);
        toolbar.setTitle("");
        setSupportActionBar(toolbar);
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        switch (item.getItemId()) {
            case android.R.id.home:
                finish();
                break;
        }
        return true;
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


}
