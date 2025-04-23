package com.example.unilinksexample;

import android.os.Bundle;

import androidx.annotation.Nullable;

import io.flutter.app.FlutterActivity;
import com.prosbucket.unilinks.UniLinksPlugin;

public class EmbeddingV1Activity extends FlutterActivity {
    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        UniLinksPlugin.registerWith(registrarFor("com.prosbucket.unilinks.UniLinksPlugin"));
    }
}
