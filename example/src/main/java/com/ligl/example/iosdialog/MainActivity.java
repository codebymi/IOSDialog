package com.ligl.example.iosdialog;

import android.app.Activity;
import android.content.Context;
import android.content.DialogInterface;
import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.LinearLayout;

import com.ligl.android.widget.iosdialog.IOSDialog;
import com.ligl.android.widget.iosdialog.IOSSheetDialog;

public class MainActivity extends Activity {

    Context context;

    @Override
    protected void onCreate(Bundle savedInstanceState) {

        super.onCreate(savedInstanceState);
        context = this;
        LinearLayout ll = new LinearLayout(this);
        ll.setOrientation(LinearLayout.VERTICAL);

        Button btn = null;

        btn = new Button(this);
        btn.setText("ios style dialog");
        btn.setOnClickListener(new OnClickListener() {
            @Override
            public void onClick(View v) {
                new IOSDialog.Builder(context).setTitle("Tip").setMessage("IOS style dialog").show();
            }
        });
        ll.addView(btn);

        btn = new Button(this);
        btn.setText("ios style dialog without title");
        btn.setOnClickListener(new OnClickListener() {
            @Override
            public void onClick(View v) {
                new IOSDialog.Builder(context).setMessage("IOS style dialog,have no title").show();
            }
        });
        ll.addView(btn);

        btn = new Button(this);
        btn.setText("Custom Dialog button");
        btn.setOnClickListener(new OnClickListener() {
            @Override
            public void onClick(View v) {
                new IOSDialog.Builder(context)
                        .setTitle("title")
                        .setMessage("message")
                        .setPositiveButton("OK", null)
                        .setNegativeButton("Cancel", null).show();
            }
        });
        ll.addView(btn);

        btn = new Button(this);
        btn.setText("ios style dialog(multiple lines of text)");
        btn.setOnClickListener(new OnClickListener() {
            @Override
            public void onClick(View v) {
                new IOSDialog.Builder(context)
                        .setTitle("Hello")
                        .setMessage(
                                "Test multiple lines of text\n1\n1\n1\n1\n1\n1\n1\n1\n1\n1\n1\n1\n1\n1\n1\n1\n1\n1\n1\n1\n1\n1\n1\n1\n1\n1\n1\n1\n1\n1\n1\n1\n1\n1\n1\n1\n1\n1\n1\n1\n1\n1\n1\n1\n1\n1\n1\n1\n1\n1\n1\n1\n1\n1\n1\n1\n1\n1\n1\n1\n1\n1\n1\n1\n1\n1\n1\n1\n1\n1\n1\n1\n1\n1\n1\n1\n1\n1\n1\n1\n1\n1\n1\n1\n1\n1\n1\n1\n1\n1\n1\n1\n1\n1\n1\n1\n1\n1\n1\n1\n1\n1\n1\n1\n1\n1\n1111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111112222222")
                        // .setMessage("1")
                        .setPositiveButton("OK",
                                new DialogInterface.OnClickListener() {

                                    @Override
                                    public void onClick(DialogInterface dialog,
                                                        int which) {
                                        // dialog.dismiss();
                                    }
                                })
                        .setNegativeButton("Cancel",
                                new DialogInterface.OnClickListener() {

                                    @Override
                                    public void onClick(DialogInterface dialog,
                                                        int which) {
                                        // dialog.dismiss();
                                    }
                                }).show();
            }
        });
        ll.addView(btn);

        btn = new Button(this);
        btn.setText("ios sheet style dialog");
        btn.setOnClickListener(new OnClickListener() {
            @Override
            public void onClick(View v) {
                IOSSheetDialog.SheetItem[] items = new IOSSheetDialog.SheetItem[2];
                items[0] = new IOSSheetDialog.SheetItem("item1", IOSSheetDialog.SheetItem.RED);
                items[1] = new IOSSheetDialog.SheetItem("item2", IOSSheetDialog.SheetItem.BLUE);
                IOSSheetDialog dialog2 = new IOSSheetDialog.Builder(context)
                        .setTitle("Title").setData(items, null).show();
            }
        });
        ll.addView(btn);

        btn = new Button(this);
        btn.setText("ios sheet style dialog without title");
        btn.setOnClickListener(new OnClickListener() {
            @Override
            public void onClick(View v) {
                IOSSheetDialog.SheetItem[] items = new IOSSheetDialog.SheetItem[1];
                items[0] = new IOSSheetDialog.SheetItem("item1", IOSSheetDialog.SheetItem.RED);
                IOSSheetDialog dialog2 = new IOSSheetDialog.Builder(context)
                        .setData(items, null).show();
            }
        });
        ll.addView(btn);

        setContentView(ll);
    }
}
