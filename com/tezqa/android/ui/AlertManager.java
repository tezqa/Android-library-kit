package com.tezqa.android.ui;

import android.app.AlertDialog;
import android.content.Context;
import android.content.DialogInterface;
import android.widget.Toast;

/**
 * Author: Samir Moussouni | Tezqa
 * Email: sam@tezqa.com
 * www: http://www.tezqa.com
 */
public class AlertManager {

    /**
     * Display a simple Alert Dialog
     * @param context   Application context
     * @param title     Alert dialog title
     * @param message   Alert message
     * //@param status    Success/failure (used to set icon) - null if icon is no needed
     * */
    public static void showAlertDialog(final Context context, String title, final String message) {
        AlertDialog alertDialog = new AlertDialog.Builder(context).create();
        alertDialog.setTitle(title);
        alertDialog.setMessage(message);
        alertDialog.show();
    }

    /**
     * Display a simple Alert Dialog
     * @param context   Application context
     * @param title     Alert dialog title
     * @param message   Alert message
     * @param okLabel   Label to display in the button
     * //@param status    Success/failure (used to set icon) - null if icon is no needed
     * */
    public static void showAlertDialog(final Context context, String title, String message, String okLabel) {

        AlertDialog alertDialog = new AlertDialog.Builder(context).create();
        alertDialog.setTitle(title);
        alertDialog.setMessage(message);

        // Setting OK Button
        alertDialog.setButton(okLabel, new DialogInterface.OnClickListener() {
            public void onClick(DialogInterface dialog, int which) {
            }
        });

        alertDialog.show();

    }

    /**
     * Display a simple Toast
     * @param context   Application context
     * @param message   Toast message
     * @param duration  Toast duration
     * */
    public static void showToast(final Context context, String message, int duration) {

        Toast toast = Toast.makeText(context, message, duration);
        toast.show();

    }

}
