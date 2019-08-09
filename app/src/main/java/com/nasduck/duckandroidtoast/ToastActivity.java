package com.nasduck.duckandroidtoast;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

import com.zoopark.toast.LesserPandaToast;
import com.zoopark.toast.loading.builder.impl.LoadingToastBuilder;
import com.zoopark.toast.loading.config.ToastStyle;

public class ToastActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_toast);
    }

    public void onDarkToastClick(View view) {
        Intent intent = new Intent(ToastActivity.this, DarkToastActivity.class);
        startActivity(intent);
    }

    public void onLightToastClick(View view) {
        Intent intent = new Intent(ToastActivity.this, LightToastActivity.class);
        startActivity(intent);
    }

    public void onLoadingToastClick(View view) {
        Intent intent = new Intent(ToastActivity.this, LoadingToastActivity.class);
        startActivity(intent);
    }


}
