package com.hnu.broadcastbestpractice;

import android.app.Activity;
import android.os.Bundle;

import com.hnu.util.ActivityCollector;

/**
 * Created by LJ on 2016/4/11.
 */
public class BaseActivity extends Activity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        ActivityCollector.addActivity(this);
    }
    @Override
    protected void onDestroy() {
        super.onDestroy();
        ActivityCollector.removeActivity(this);
    }
}
