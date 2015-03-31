package com.tezqa.android.utils;

import android.hardware.Camera;
import android.util.Log;

/**
 * Author: Samir Moussouni | Tezqa
 * Email: sam@tezqa.com
 * www: http://www.tezqa.com
 */
public class CameraUtils {

    public static final String TAG = "CameraUtils";

    /**
     * Return camera instance
     */
    public static Camera getCameraInstance(int displayOrientation) {
        Camera cam = null;
        try {
            cam = Camera.open();

            // More efficient way to find available cameras. Nexus 7 needs this.
            if (cam == null) {
                int availableCameras = Camera.getNumberOfCameras();
                for (int i = 0; i < availableCameras; i++) {
                    cam = Camera.open(i);
                    if (cam != null) break;
                }
            }

            cam.setDisplayOrientation(displayOrientation);
            Log.d(TAG, "Getting Camera: " + cam.toString());
        }
        catch (Exception e) {
            Log.e(TAG, "Camera is not available (in use or does not exist)");
            Log.e(TAG, e.toString());
        }
        return cam;
    }

}
