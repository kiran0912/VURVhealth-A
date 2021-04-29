package com.VURVhealth.vurvhealth.vision;

import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.content.ContextCompat;
import android.support.v7.app.AppCompatActivity;
import android.text.Html;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.TextView;
import com.VURVhealth.vurvhealth.R;
import com.VURVhealth.vurvhealth.prescriptions.PrescriptionBannerActivity;
import com.VURVhealth.vurvhealth.upgrade.UpgradeRxFlipActivity;
import com.VURVhealth.vurvhealth.upgrade.UpgradeVisionFlipActivity;
import com.fasterxml.jackson.core.util.MinimalPrettyPrinter;
import java.text.SimpleDateFormat;

public class VisionVURVBannerActivity extends AppCompatActivity {
    private FrameLayout cardImg;
    private ImageView img_cancelBtn;
    private String lastName;
    private TextView name;
    private Button openBtn;
    private TextView raMemID;
    private TextView rxBinNum;
    private TextView rxGRP;
    private TextView rxPcnNum;
    private TextView tvExp;
    private TextView tvHealth;
    private TextView tvPatient;
    private TextView tvPatient2;
    private TextView tvPlan;
    private TextView tvVURVID;
    private TextView tvVurvName;
    private String vurvID;
    private String vurvName;
    private TextView vurv_id;

    /* renamed from: com.VURVhealth.VURVhealth.vision.VisionVURVBannerActivity$1 */
    class C08361 implements OnClickListener {
        C08361() {
        }

        public void onClick(View v) {
            VisionVURVBannerActivity.this.finish();
        }
    }

    /* renamed from: com.VURVhealth.VURVhealth.vision.VisionVURVBannerActivity$2 */
    class C08372 implements OnClickListener {
        C08372() {
        }

        public void onClick(View v) {
            Intent intent = new Intent(VisionVURVBannerActivity.this, UpgradeVisionFlipActivity.class);
            intent.putExtra("activity", "VisionVURVBannerActivity");
            VisionVURVBannerActivity.this.startActivity(intent);
            VisionVURVBannerActivity.this.overridePendingTransition(R.anim.fade_in, R.anim.fade_out);
        }
    }

    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.vurvid_banner_screen);
        this.img_cancelBtn = (ImageView) findViewById(R.id.img_cancelBtn);
        this.openBtn = (Button) findViewById(R.id.openBtn);
        this.tvVurvName = (TextView) findViewById(R.id.tvVurvName);
        this.tvVURVID = (TextView) findViewById(R.id.tvVURVID);
        this.tvPatient = (TextView) findViewById(R.id.tvPatient);
        this.tvPatient2 = (TextView) findViewById(R.id.tvPatient2);
        this.tvPatient2.setVisibility(View.VISIBLE);
        this.tvHealth = (TextView) findViewById(R.id.tvHealth);
        this.rxBinNum = (TextView) findViewById(R.id.rxBinNum);
        this.rxPcnNum = (TextView) findViewById(R.id.rxPcnNum);
        this.raMemID = (TextView) findViewById(R.id.raMemID);
        this.rxGRP = (TextView) findViewById(R.id.rxGRP);
        this.name = (TextView) findViewById(R.id.name);
        this.vurv_id = (TextView) findViewById(R.id.vurv_id);
        this.tvExp = (TextView) findViewById(R.id.tvExp);
        this.tvPlan = (TextView) findViewById(R.id.tvPlan);
        this.cardImg = (FrameLayout) findViewById(R.id.cardImg);
        this.cardImg.setBackgroundResource(R.drawable.card_vision_new);
        SharedPreferences prefsData = getSharedPreferences("VURVProfileDetails", 0);
        this.vurvName = prefsData.getString("firstName", "");
        this.lastName = prefsData.getString("lastName", "");
        this.vurvID = prefsData.getString("vurvId", "");
        this.tvVurvName.setText(this.vurvName + MinimalPrettyPrinter.DEFAULT_ROOT_VALUE_SEPARATOR + this.lastName);


        cardImg.setOnClickListener(new OnClickListener() {
            @Override
            public void onClick(View view) {

                Intent intent = new Intent(VisionVURVBannerActivity.this, UpgradeVisionFlipActivity.class);
                intent.putExtra("activity", "VisionVURVBannerActivity");
                startActivity(intent);            }
        });

        /*srikanth*/
        try {
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append(this.vurvID.substring(0, 4));
            stringBuilder.append("-");
            stringBuilder.append(this.vurvID.substring(4, 7));
            stringBuilder.append("-");
            stringBuilder.append(this.vurvID.substring(7, 11));
            this.tvVURVID.setText("VURV ID: " + stringBuilder);
        } catch (ArrayIndexOutOfBoundsException e2) {
            this.tvVURVID.setText("VURV ID: " + this.vurvID);
        }


//        this.tvVURVID.setText("VURV ID: " + this.vurvID);
        this.rxGRP.setVisibility(View.GONE);
        this.raMemID.setVisibility(View.GONE);
        this.name.setText(this.vurvName + MinimalPrettyPrinter.DEFAULT_ROOT_VALUE_SEPARATOR + this.lastName);


        /*srikanth*/
        try {
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append(this.vurvID.substring(0, 4));
            stringBuilder.append("-");
            stringBuilder.append(this.vurvID.substring(4, 7));
            stringBuilder.append("-");
            stringBuilder.append(this.vurvID.substring(7, 11));
            this.vurv_id.setText("VURV ID: " + stringBuilder);
        } catch (ArrayIndexOutOfBoundsException e2) {
            this.vurv_id.setText("VURV ID: " + this.vurvID);
        }

//        this.vurv_id.setText("VURV ID: " + this.vurvID);
        this.rxBinNum.setVisibility(View.GONE);
        this.rxPcnNum.setVisibility(View.GONE);
        String dobFormat = null;
        try {
            dobFormat = new SimpleDateFormat("MM/dd/yyyy").format(new SimpleDateFormat("yyyy-MM-dd").parse(prefsData.getString("subscription_end_date", "12/12/2017")));
        } catch (Exception e) {
            e.printStackTrace();
        }
        this.tvExp.setText(getResources().getString(R.string.expires) + MinimalPrettyPrinter.DEFAULT_ROOT_VALUE_SEPARATOR + dobFormat);
        this.tvPlan.setText(getString(R.string.plan) + " CARE");
        this.tvPatient.setText(Html.fromHtml(getResources().getString(R.string.vision_vurv_txt)));
        this.tvPatient2.setText(Html.fromHtml(getResources().getString(R.string.vision_vurv_text1)));
        this.tvPatient.setTextColor(ContextCompat.getColor(this, R.color.black));
        this.tvHealth.setVisibility(View.GONE);
        this.img_cancelBtn.setOnClickListener(new C08361());
        this.openBtn.setOnClickListener(new C08372());
    }

    public void onBackPressed() {
        super.onBackPressed();
        finish();
    }
}