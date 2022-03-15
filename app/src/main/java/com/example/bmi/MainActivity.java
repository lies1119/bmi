package com.example.bmi;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    TextView width,height,bmi;
    RadioButton man,woman;
    Button cal;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        RadioGroup group = findViewById(R.id.sexGroup);
        width=findViewById(R.id.width);
        height=findViewById(R.id.height);
        man=findViewById(R.id.man);
        woman=findViewById(R.id.woman);
        cal=findViewById(R.id.cal);
        cal.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Double txt1=Double.valueOf(width.getText().toString());
                Double txt2=Double.valueOf(height.getText().toString());

                double result=txt1/(txt2*txt2);
                TextView bmi_v = findViewById(R.id.bmi);
                bmi_v.setText(String.valueOf(result));
                TextView zd=findViewById(R.id.zhenduan);

                int buttonId = group.getCheckedRadioButtonId();
                if(buttonId == R.id.man){
                    if (result<20) {
                        zd.setText("体重过轻");
                    }else if(result<25){
                        zd.setText("体重正常");
                    }else if(result<27){
                        zd.setText("体重超重");
                    }else if(result<30){
                        zd.setText("轻度肥胖");
                    }else if(result <35){
                        zd.setText("中度肥胖");
                    }else{
                        zd.setText("重度肥胖");
                    }
                } else if(buttonId == R.id.woman){
                    if (result<19) {
                        zd.setText("体重过轻");
                    }else if(result<24){
                        zd.setText("体重正常");
                    }else if(result<26){
                        zd.setText("体重超重");
                    }else if(result<29){
                        zd.setText("轻度肥胖");
                    }else if(result <34){
                        zd.setText("中度肥胖");
                    }else{
                        zd.setText("重度肥胖");
                    }
                }
            }
        });

    }

}