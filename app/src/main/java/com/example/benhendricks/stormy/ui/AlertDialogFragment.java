package com.example.benhendricks.stormy.ui;

import android.app.AlertDialog;
import android.app.Dialog;
import android.app.DialogFragment;
import android.content.Context;
import android.os.Bundle;

import com.example.benhendricks.stormy.R;

/**
 * Created by ben.hendricks on 3/21/2018.
 */

public class AlertDialogFragment extends DialogFragment {

    @Override
    public Dialog onCreateDialog(Bundle savedInstanceState) {
        Context context = getActivity();
        AlertDialog.Builder builder = new AlertDialog.Builder(context);
        builder.setTitle(context.getString(R.string.error_title))
                .setMessage(context.getString(R.string.error_message))
                .setPositiveButton("OK", null);

    AlertDialog dialog = builder.create();
    return dialog;

    }


}
