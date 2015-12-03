package com.star.beatbox;


import android.content.Context;
import android.content.res.AssetManager;

public class BeatBox {

    private static final String TAG = "BeatBox";
    private static final String SOUNDS_FOLDER = "sample_sounds";

    private AssetManager mAssetManager;

    public BeatBox(Context context) {
        mAssetManager = context.getAssets();
    }
}
