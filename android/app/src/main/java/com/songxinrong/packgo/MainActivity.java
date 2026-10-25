package com.songxinrong.packgo;

import android.os.Bundle;

import com.getcapacitor.BridgeActivity;

public class MainActivity extends BridgeActivity {
    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        // Show text at the sizes the app was designed with, instead of scaling it
        // by the phone's system font size (Settings → Display → Font size).
        getBridge().getWebView().getSettings().setTextZoom(100);
    }
}
