package com.hackinroms.maritime;

/**
 * Created by USER on 7/8/2016.
 */
import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class MaritimeIntro extends BaseAppIntro{
    public void init(Bundle savedInstanceState) {
        addSlide(SampleSlide.newInstance(R.layout.intro_slide1));
        addSlide(SampleSlide.newInstance(R.layout.intro_slide2));
        addSlide(SampleSlide.newInstance(R.layout.intro_slide3));
        setFadeAnimation();
    }

    private void loadMainActivity() {
        startActivity(new Intent(this, Login.class));
        finish();
    }

    public void onSkipPressed() {
        loadMainActivity();
    }

    public void onNextPressed() {
    }

    public void onDonePressed() {
        loadMainActivity();
    }

    public void onSlideChanged() {
    }

    public void getStarted(View v) {
        loadMainActivity();
    }
}
