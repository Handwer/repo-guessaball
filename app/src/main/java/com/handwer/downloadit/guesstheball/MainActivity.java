package com.handwer.downloadit.guesstheball;

import android.content.DialogInterface;
import android.support.v7.app.AlertDialog;
import android.app.Dialog;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Switch;
import android.widget.TextView;
import android.widget.Toast;

import com.handwer.downloadit.guesstheball.R;

import org.w3c.dom.Text;

public class MainActivity extends AppCompatActivity {
    Boolean PD;
    Boolean LAST;
    TextView textView;
    TextView WhatYouGuess;
    TextView TimesTV;
    Switch High;
    int times = 0;
    Boolean Al;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        textView = (TextView) findViewById(R.id.textView);
        WhatYouGuess = (TextView) findViewById(R.id.WhatYouGuess);
        TimesTV = (TextView) findViewById(R.id.TimesTV);
        High = (Switch) findViewById(R.id.switch1);
    }

    public void setWin(View v){
        PD = true;
        WhatYouGuess.setText("赢");
    }

    public void setLose(View v){
        PD = false;
        WhatYouGuess.setText("输");
    }

    public void StartPD(View v){
        int x = 1 + (int)(Math.random()*2);
        //仅调试
            //String a = "仅调试";

        if(Al = true){
            Toast.makeText(this,"你得先清除再猜",Toast.LENGTH_SHORT).show();
        } else if (WhatYouGuess.getText() == ""){
            Toast.makeText(this,"然而你什么都没有猜QAQ",Toast.LENGTH_SHORT).show();
        }
        else if(High.isChecked() == true){
            switch (x){
                case 1:
                    LAST = true;
                    break;
                case 2:
                    LAST = false;
                    break;
                case 3:
                    LAST = true;
            }
            if (PD = LAST){
                textView.setText("恭喜你！猜对了！");
                times++;
                TimesTV.setText("" + times + "次");
            }
            else {
                textView.setText("猜错了。。。");
                times++;
                TimesTV.setText("" + times + "次");
            }
        }else
        {
            switch (x){
            case 1:
                LAST = true;
                break;
            case 2:
                LAST = false;
                break;
            }
        if (PD = LAST){
            textView.setText("恭喜你！猜对了！");
            times++;
            TimesTV.setText("" + times + "次");
        }
        else {
            textView.setText("猜错了。。。");
            times++;
            TimesTV.setText("" + times + "次");
            }
        }

    }

    public void resetAll(View v){
        PD = null;
        LAST = null;
        textView.setText("");
        WhatYouGuess.setText("");
        TimesTV.setText("");
    }

}
