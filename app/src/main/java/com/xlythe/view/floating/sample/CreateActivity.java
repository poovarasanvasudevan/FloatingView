package com.xlythe.view.floating.sample;

import android.support.annotation.DrawableRes;

import com.xlythe.view.floating.CreateShortcutActivity;

/**
 * Creates the shortcut icon
 */
public class CreateActivity extends CreateShortcutActivity {
    @Override
    public CharSequence getShortcutName() {
        return getString(R.string.app_name);
    }

    @DrawableRes
    @Override
    public int getShortcutIcon() {
        return R.mipmap.ic_launcher;
    }
}
