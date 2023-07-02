package com.example.mur;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.app.Dialog;
import android.content.Intent;
import android.graphics.Bitmap;
import android.graphics.Color;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.ColorDrawable;
import android.os.Bundle;
import android.os.Environment;
import android.view.Gravity;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.AutoCompleteTextView;
import android.widget.Button;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.Toast;

import com.google.android.material.bottomsheet.BottomSheetDialog;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStream;

public class PlanActivity extends AppCompatActivity {
    ImageButton back, setting, room, konstr, element, odin, dwa, tree, chetre, pat, stol5,
                door, door2, door3, door4, door5, door6, win, win2, um, cancel,
                tul, rac, van, dush, kroodn, krovdet, krovdws, stol1, stul1, stol2, stul2, knig,
                divan1, divan2, divan3, kreslo1, kreslo2, plita, rac2, stol3, stol4;
    LinearLayout linearLayout;


    @SuppressLint({"MissingInflatedId", "WrongViewCast"})
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_plan);

        linearLayout = findViewById(R.id.planlay);

        back = findViewById(R.id.buttonBack);
        back.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent intent = new Intent(PlanActivity.this, HomeActivity.class);
                startActivity(intent);
            }
        });

        setting = findViewById(R.id.settings);
        setting.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

            }
        });

        room = findViewById(R.id.btnetazh);
        room.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                showDialog();
            }
        });

        konstr = findViewById(R.id.btnkoridor);
        konstr.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                showDialog2();
            }
        });

        element = findViewById(R.id.btnbed);
        element.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                showDialog3();
            }
        });
    }

    private void showDialog() {

        final Dialog dialog = new Dialog(this);
        dialog.requestWindowFeature(Window.FEATURE_NO_TITLE);
        dialog.setContentView(R.layout.bottomsheetlayout);

        cancel = dialog.findViewById(R.id.cancelButton);

        cancel.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                dialog.dismiss();
            }
        });

        odin = dialog.findViewById(R.id.imageView1);
        odin.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                ImageView imageView = new ImageView(PlanActivity.this);
                imageView.setImageResource(R.drawable.odin);

                addView(imageView, ViewGroup.LayoutParams.WRAP_CONTENT, 200);
            }
        });
        dwa = dialog.findViewById(R.id.imageView2);
        dwa.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                ImageView imageView = new ImageView(PlanActivity.this);
                imageView.setImageResource(R.drawable.dwa);

                addView(imageView, ViewGroup.LayoutParams.WRAP_CONTENT, 200);
            }
        });
        tree = dialog.findViewById(R.id.imageView3);
        tree.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                ImageView imageView = new ImageView(PlanActivity.this);
                imageView.setImageResource(R.drawable.tree);

                addView(imageView, ViewGroup.LayoutParams.WRAP_CONTENT, 200);
            }
        });
        chetre = dialog.findViewById(R.id.imageView4);
        chetre.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                ImageView imageView = new ImageView(PlanActivity.this);
                imageView.setImageResource(R.drawable.chetre);

                addView(imageView, ViewGroup.LayoutParams.WRAP_CONTENT, 200);
            }
        });
        pat = dialog.findViewById(R.id.imageView5);
        pat.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                ImageView imageView = new ImageView(PlanActivity.this);
                imageView.setImageResource(R.drawable.pat);

                addView(imageView, ViewGroup.LayoutParams.WRAP_CONTENT, 200);
            }
        });

        dialog.show();
        dialog.getWindow().setLayout(ViewGroup.LayoutParams.MATCH_PARENT, ViewGroup.LayoutParams.WRAP_CONTENT);
        dialog.getWindow().setBackgroundDrawable(new ColorDrawable(Color.TRANSPARENT));
        dialog.getWindow().getAttributes().windowAnimations = R.style.DialogAnimation;
        dialog.getWindow().setGravity(Gravity.BOTTOM);
    }

    public void addView(ImageView imageView, int width, int hight){
        LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(width, hight);
        layoutParams.setMargins(0, 10, 0, 10);

        imageView.setLayoutParams(layoutParams);
        linearLayout.addView(imageView);
    }
    private void showDialog2() {

        final Dialog dialog = new Dialog(this);
        dialog.requestWindowFeature(Window.FEATURE_NO_TITLE);
        dialog.setContentView(R.layout.bottomsheetlayout2);

        cancel = dialog.findViewById(R.id.cancelButton);

        cancel.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                dialog.dismiss();
            }
        });

        door = dialog.findViewById(R.id.door);
        door.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                ImageView imageView = new ImageView(PlanActivity.this);
                imageView.setImageResource(R.drawable.door1);

                addView(imageView, ViewGroup.LayoutParams.WRAP_CONTENT, 200);
            }
        });
        door2 = dialog.findViewById(R.id.door2);
        door2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                ImageView imageView = new ImageView(PlanActivity.this);
                imageView.setImageResource(R.drawable.door2);

                addView(imageView, ViewGroup.LayoutParams.WRAP_CONTENT, 200);
            }
        });
        door3 = dialog.findViewById(R.id.door3);
        door3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                ImageView imageView = new ImageView(PlanActivity.this);
                imageView.setImageResource(R.drawable.door3);

                addView(imageView, ViewGroup.LayoutParams.WRAP_CONTENT, 200);
            }
        });
        door4 = dialog.findViewById(R.id.door4);
        door4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                ImageView imageView = new ImageView(PlanActivity.this);
                imageView.setImageResource(R.drawable.door4);

                addView(imageView, ViewGroup.LayoutParams.WRAP_CONTENT, 200);
            }
        });
        door5 = dialog.findViewById(R.id.door5);
        door5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                ImageView imageView = new ImageView(PlanActivity.this);
                imageView.setImageResource(R.drawable.door5);

                addView(imageView, ViewGroup.LayoutParams.WRAP_CONTENT, 200);
            }
        });
        door6 = dialog.findViewById(R.id.door6);
        door6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                ImageView imageView = new ImageView(PlanActivity.this);
                imageView.setImageResource(R.drawable.door6);

                addView(imageView, ViewGroup.LayoutParams.WRAP_CONTENT, 200);
            }
        });
        win = dialog.findViewById(R.id.win);
        win.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                ImageView imageView = new ImageView(PlanActivity.this);
                imageView.setImageResource(R.drawable.win);

                addView(imageView, ViewGroup.LayoutParams.WRAP_CONTENT, 200);
            }
        });
        win2 = dialog.findViewById(R.id.win2);
        win2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                ImageView imageView = new ImageView(PlanActivity.this);
                imageView.setImageResource(R.drawable.win2);

                addView(imageView, ViewGroup.LayoutParams.WRAP_CONTENT, 200);
            }
        });

        dialog.show();
        dialog.getWindow().setLayout(ViewGroup.LayoutParams.MATCH_PARENT, ViewGroup.LayoutParams.WRAP_CONTENT);
        dialog.getWindow().setBackgroundDrawable(new ColorDrawable(Color.TRANSPARENT));
        dialog.getWindow().getAttributes().windowAnimations = R.style.DialogAnimation;
        dialog.getWindow().setGravity(Gravity.BOTTOM);
    }

    private void showDialog3() {

        final Dialog dialog = new Dialog(this);
        dialog.requestWindowFeature(Window.FEATURE_NO_TITLE);
        dialog.setContentView(R.layout.bottomsheetlayout3);

        divan1 = dialog.findViewById(R.id.divan);
        divan1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                ImageView imageView = new ImageView(PlanActivity.this);
                imageView.setImageResource(R.drawable.ic_divan);

                addView(imageView, ViewGroup.LayoutParams.WRAP_CONTENT, 200);
            }
        });

        divan2 = dialog.findViewById(R.id.divan2);
        divan2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                ImageView imageView = new ImageView(PlanActivity.this);
                imageView.setImageResource(R.drawable.ic_divan2);

                addView(imageView, ViewGroup.LayoutParams.WRAP_CONTENT, 200);
            }
        });

        divan3 = dialog.findViewById(R.id.divan3);
        divan3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                ImageView imageView = new ImageView(PlanActivity.this);
                imageView.setImageResource(R.drawable.ic_divan3);

                addView(imageView, ViewGroup.LayoutParams.WRAP_CONTENT, 200);
            }
        });

        dush = dialog.findViewById(R.id.dush);
        dush.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                ImageView imageView = new ImageView(PlanActivity.this);
                imageView.setImageResource(R.drawable.ic_dush);

                addView(imageView, ViewGroup.LayoutParams.WRAP_CONTENT, 200);
            }
        });

        knig = dialog.findViewById(R.id.knigi);
        knig.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                ImageView imageView = new ImageView(PlanActivity.this);
                imageView.setImageResource(R.drawable.ic_knizhnaya_polka);

                addView(imageView, ViewGroup.LayoutParams.WRAP_CONTENT, 200);
            }
        });

        kreslo1 = dialog.findViewById(R.id.kreslo);
        kreslo1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                ImageView imageView = new ImageView(PlanActivity.this);
                imageView.setImageResource(R.drawable.ic_kreslo);

                addView(imageView, ViewGroup.LayoutParams.WRAP_CONTENT, 200);
            }
        });

        kreslo2 = dialog.findViewById(R.id.kreslo2);
        kreslo2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                ImageView imageView = new ImageView(PlanActivity.this);
                imageView.setImageResource(R.drawable.ic_kreslo2);

                addView(imageView, ViewGroup.LayoutParams.WRAP_CONTENT, 200);
            }
        });

        krovdet = dialog.findViewById(R.id.detkrov);
        krovdet.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                ImageView imageView = new ImageView(PlanActivity.this);
                imageView.setImageResource(R.drawable.ic_krovat_det);

                addView(imageView, ViewGroup.LayoutParams.WRAP_CONTENT, 200);
            }
        });

        krovdws = dialog.findViewById(R.id.dwukrow);
        krovdws.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                ImageView imageView = new ImageView(PlanActivity.this);
                imageView.setImageResource(R.drawable.ic_krovat_dvu);

                addView(imageView, ViewGroup.LayoutParams.WRAP_CONTENT, 200);
            }
        });

        kroodn = dialog.findViewById(R.id.odnokrow);
        kroodn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                ImageView imageView = new ImageView(PlanActivity.this);
                imageView.setImageResource(R.drawable.ic_krovat_odno);

                addView(imageView, ViewGroup.LayoutParams.WRAP_CONTENT, 200);
            }
        });

        stol5 = dialog.findViewById(R.id.obed);
        stol5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                ImageView imageView = new ImageView(PlanActivity.this);
                imageView.setImageResource(R.drawable.ic_obedennyj_stol);

                addView(imageView, ViewGroup.LayoutParams.WRAP_CONTENT, 200);
            }
        });

        stol1 = dialog.findViewById(R.id.obed2);
        stol1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                ImageView imageView = new ImageView(PlanActivity.this);
                imageView.setImageResource(R.drawable.ic_obedennyj_stol2);

                addView(imageView, ViewGroup.LayoutParams.WRAP_CONTENT, 200);
            }
        });

        stol2 = dialog.findViewById(R.id.stol);
        stol2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                ImageView imageView = new ImageView(PlanActivity.this);
                imageView.setImageResource(R.drawable.ic_pismennyj_stol);

                addView(imageView, ViewGroup.LayoutParams.WRAP_CONTENT, 200);
            }
        });

        plita = dialog.findViewById(R.id.plita);
        plita.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                ImageView imageView = new ImageView(PlanActivity.this);
                imageView.setImageResource(R.drawable.ic_plita);

                addView(imageView, ViewGroup.LayoutParams.WRAP_CONTENT, 200);
            }
        });

        rac = dialog.findViewById(R.id.rac);
        rac.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                ImageView imageView = new ImageView(PlanActivity.this);
                imageView.setImageResource(R.drawable.ic_rakovina);

                addView(imageView, ViewGroup.LayoutParams.WRAP_CONTENT, 200);
            }
        });

        rac2 = dialog.findViewById(R.id.rac2);
        rac2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                ImageView imageView = new ImageView(PlanActivity.this);
                imageView.setImageResource(R.drawable.ic_rakovina2);

                addView(imageView, ViewGroup.LayoutParams.WRAP_CONTENT, 200);
            }
        });

        stol3 = dialog.findViewById(R.id.stol2);
        stol3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                ImageView imageView = new ImageView(PlanActivity.this);
                imageView.setImageResource(R.drawable.ic_stol3);

                addView(imageView, ViewGroup.LayoutParams.WRAP_CONTENT, 200);
            }
        });

        stol4 = dialog.findViewById(R.id.stol3);
        stol4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                ImageView imageView = new ImageView(PlanActivity.this);
                imageView.setImageResource(R.drawable.ic_stol5);

                addView(imageView, ViewGroup.LayoutParams.WRAP_CONTENT, 200);
            }
        });

        stul1 = dialog.findViewById(R.id.stul1);
        stul1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                ImageView imageView = new ImageView(PlanActivity.this);
                imageView.setImageResource(R.drawable.ic_stul1);

                addView(imageView, ViewGroup.LayoutParams.WRAP_CONTENT, 200);
            }
        });

        stul2 = dialog.findViewById(R.id.stul2);
        stul2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                ImageView imageView = new ImageView(PlanActivity.this);
                imageView.setImageResource(R.drawable.ic_stul2);

                addView(imageView, ViewGroup.LayoutParams.WRAP_CONTENT, 200);
            }
        });

        tul = dialog.findViewById(R.id.tual);
        tul.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                ImageView imageView = new ImageView(PlanActivity.this);
                imageView.setImageResource(R.drawable.ic_tualet);

                addView(imageView, ViewGroup.LayoutParams.WRAP_CONTENT, 200);
            }
        });

        um = dialog.findViewById(R.id.um);
        um.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                ImageView imageView = new ImageView(PlanActivity.this);
                imageView.setImageResource(R.drawable.ic_umyvalnik);

                addView(imageView, ViewGroup.LayoutParams.WRAP_CONTENT, 200);
            }
        });

        van = dialog.findViewById(R.id.vann);
        van.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                ImageView imageView = new ImageView(PlanActivity.this);
                imageView.setImageResource(R.drawable.ic_vanna);

                addView(imageView, ViewGroup.LayoutParams.WRAP_CONTENT, 200);
            }
        });

        cancel = dialog.findViewById(R.id.cancelButton);
        cancel.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                dialog.dismiss();
            }
        });

        dialog.show();
        dialog.getWindow().setLayout(ViewGroup.LayoutParams.MATCH_PARENT, ViewGroup.LayoutParams.WRAP_CONTENT);
        dialog.getWindow().setBackgroundDrawable(new ColorDrawable(Color.TRANSPARENT));
        dialog.getWindow().getAttributes().windowAnimations = R.style.DialogAnimation;
        dialog.getWindow().setGravity(Gravity.BOTTOM);
    }
}
