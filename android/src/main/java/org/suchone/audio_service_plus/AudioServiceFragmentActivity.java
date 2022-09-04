package org.suchone.audio_service_plus;

import android.content.Context;

import androidx.annotation.NonNull;

import io.flutter.embedding.android.FlutterFragmentActivity;
import io.flutter.embedding.engine.FlutterEngine;

public class AudioServiceFragmentActivity extends FlutterFragmentActivity {
    @Override
    public FlutterEngine provideFlutterEngine(@NonNull Context context) {
        return AudioServicePlusPlugin.getFlutterEngine(context);
    }

    @Override
    protected String getCachedEngineId() {
        AudioServicePlusPlugin.getFlutterEngine(this);
        return AudioServicePlusPlugin.getFlutterEngineId();
    }

    // The engine is created and managed by AudioServicePlugin,
    // it should not be destroyed with the activity.
    @Override
    public boolean shouldDestroyEngineWithHost() {
        return false;
    }
}
