package com.hackinroms.maritime;

/**
 * Created by Jaymoh on 7/8/2016.
 */
import android.view.Menu;
import android.view.MenuItem;
import com.github.paolorotolo.appintro.AppIntro;

public abstract class BaseAppIntro extends AppIntro {
    private int mScrollDurationFactor = 1;

    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.menu_base_intro, menu);
        return super.onCreateOptionsMenu(menu);
    }

    public boolean onOptionsItemSelected(MenuItem item) {
        switch (item.getItemId()) {
            case R.id.action_factor1 /*2131624222*/:
                this.mScrollDurationFactor = 1;
                break;
            case R.id.action_factor2 /*2131624223*/:
                this.mScrollDurationFactor = 2;
                break;
            case R.id.action_factor4 /*2131624224*/:
                this.mScrollDurationFactor = 4;
                break;
        }
        setScrollDurationFactor(this.mScrollDurationFactor);
        return super.onOptionsItemSelected(item);
    }
}

