package com.nasduck.duckandroidtoast;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.Toolbar;
import android.view.MenuItem;
import android.view.View;

import com.zoopark.toast.LesserPandaToast;
import com.zoopark.toast.loading.config.ToastStyle;

public class LoadingToastActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_loading_toast);

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

    public void onDarkLoadingToastClick(View view) {
        LesserPandaToast.showLoading(this);
    }

    public void onDarkLoadingTextToastClick(View view) {
        LesserPandaToast.showLoading(this, String.valueOf(getResources().getText(R.string.loading)));
    }

    public void onLightLoadingToastClick(View view) {
        LesserPandaToast.showLoading(this, ToastStyle.LIGHT);
    }

    public void onLightLoadingTextToastClick(View view) {
        LesserPandaToast.showLoading(this, String.valueOf(getResources().getText(R.string.loading)), ToastStyle.LIGHT);
    }

    public void onHideToastClick(View view) {
        LesserPandaToast.dismiss();
    }
}
