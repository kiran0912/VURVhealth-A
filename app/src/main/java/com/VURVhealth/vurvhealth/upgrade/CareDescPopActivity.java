package com.VURVhealth.vurvhealth.upgrade;

import android.app.Dialog;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.text.Html;
import android.view.Gravity;
import android.view.View;
import android.view.Window;
import android.view.WindowManager;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;

import com.VURVhealth.vurvhealth.R;

/**
 * Created by yqlabs on 16/6/17.
 */

public class CareDescPopActivity extends AppCompatActivity {

    private TextView toolbar_txt, desc_heading, desc_para, tvRateBanner;
    private ImageView backBtn, infoRx, infoDental, infoVision;
    LinearLayout llPrescription, llDental, llVision;

    /** Called when the activity is first created. */
    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.description_screen);

        toolbar_txt = (TextView) findViewById(R.id.toolbar_txt);
        desc_heading = (TextView) findViewById(R.id.desc_heading);
        desc_para = (TextView) findViewById(R.id.desc_para);
        tvRateBanner = (TextView) findViewById(R.id.tvRateBanner);

        backBtn = (ImageView) findViewById(R.id.backBtn);
        infoRx = (ImageView) findViewById(R.id.infoRx);
        infoDental = (ImageView) findViewById(R.id.infoDental);
        infoVision = (ImageView) findViewById(R.id.infoVision);

        llPrescription = (LinearLayout) findViewById(R.id.llPrescription);
        llDental = (LinearLayout) findViewById(R.id.llDental);
        llVision = (LinearLayout) findViewById(R.id.llVision);

        toolbar_txt.setText(getResources().getString(R.string.care));
        desc_heading.setText(getResources().getString(R.string.care_heading));
        desc_para.setText(Html.fromHtml(getResources().getString(R.string.care_desc)));
        tvRateBanner.setText(getResources().getString(R.string.starting_at));

        llPrescription.setVisibility(View.VISIBLE);
        llDental.setVisibility(View.VISIBLE);
        llVision.setVisibility(View.VISIBLE);

        backBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
//                startActivity(new Intent(CareDescriptionActivity.this, UpgradeSubscriptionActivity.class));
                finish();
            }
        });

        tvRateBanner.setVisibility(View.GONE);

        infoRx.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                infoPrescCustomAlertDialog();
            }
        });
        infoDental.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                infoDoctorCustomAlertDialog();
            }
        });

        infoVision.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                infoFacilityCustomAlertDialog();
            }
        });

    }

    //show popup for prescription info
    private void infoPrescCustomAlertDialog() {

        final Dialog customDialog = new Dialog(CareDescPopActivity.this);
        customDialog.setCancelable(false);
        customDialog.requestWindowFeature(Window.FEATURE_NO_TITLE);
        customDialog.setContentView(R.layout.presc_info_screen);

        WindowManager.LayoutParams lp = new WindowManager.LayoutParams();
        lp.copyFrom(customDialog.getWindow().getAttributes());
        lp.width = WindowManager.LayoutParams.MATCH_PARENT;
        lp.height = WindowManager.LayoutParams.MATCH_PARENT;
        lp.gravity = Gravity.CENTER;

        ImageView img_cancelBtn = (ImageView) customDialog.findViewById(R.id.img_cancelBtn);

        customDialog.getWindow().setAttributes(lp);

        customDialog.show();

        img_cancelBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                customDialog.dismiss();
                customDialog.cancel();

            }
        });

    }
    //show popup for dental info
    private void infoDoctorCustomAlertDialog() {

        final Dialog customDialog = new Dialog(CareDescPopActivity.this);
        customDialog.setCancelable(false);
        customDialog.requestWindowFeature(Window.FEATURE_NO_TITLE);
        customDialog.setContentView(R.layout.dental_info_screen);

        WindowManager.LayoutParams lp = new WindowManager.LayoutParams();
        lp.copyFrom(customDialog.getWindow().getAttributes());
        lp.width = WindowManager.LayoutParams.MATCH_PARENT;
        lp.height = WindowManager.LayoutParams.MATCH_PARENT;
        lp.gravity = Gravity.CENTER;

        ImageView img_cancelBtn = (ImageView) customDialog.findViewById(R.id.img_cancelBtn);

        customDialog.getWindow().setAttributes(lp);

        customDialog.show();

        assert img_cancelBtn != null;
        img_cancelBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                customDialog.dismiss();
                customDialog.cancel();

            }
        });

    }

    //show popup for vision info
    private void infoFacilityCustomAlertDialog() {

        final Dialog customDialog = new Dialog(CareDescPopActivity.this);
        customDialog.setCancelable(false);
        customDialog.requestWindowFeature(Window.FEATURE_NO_TITLE);
        customDialog.setContentView(R.layout.vision_info_screen);

        WindowManager.LayoutParams lp = new WindowManager.LayoutParams();
        lp.copyFrom(customDialog.getWindow().getAttributes());
        lp.width = WindowManager.LayoutParams.MATCH_PARENT;
        lp.height = WindowManager.LayoutParams.MATCH_PARENT;
        lp.gravity = Gravity.CENTER;

        ImageView img_cancelBtn = (ImageView) customDialog.findViewById(R.id.img_cancelBtn);

        customDialog.getWindow().setAttributes(lp);

        customDialog.show();

        img_cancelBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                customDialog.dismiss();
                customDialog.cancel();

            }
        });

    }

    @Override
    public void onBackPressed() {
        super.onBackPressed();
        finish();
    }
}
