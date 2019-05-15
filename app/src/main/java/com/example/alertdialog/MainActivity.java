package com.example.alertdialog;

import android.app.Dialog;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    Button button;
    EditText et_1,et_2,et_3,et_4,et_5,et_6,et_7,et_8,et_9,et_10;
    TextView tv_1,tv_2,tv_3,tv_4,tv_5,tv_6,tv_7,tv_8,tv_9,tv_10;
    int count = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        button =findViewById(R.id.button);
        button.setOnClickListener(view->{
            Dialog dialog = new Dialog(this);
            dialog.setContentView(R.layout.dialog_layout);
            EditText editText1 = dialog.findViewById(R.id.et_1);
            EditText editText2 = dialog.findViewById(R.id.et_2);
            EditText editText3 = dialog.findViewById(R.id.et_3);
            EditText editText4 = dialog.findViewById(R.id.et_4);
            EditText editText5 = dialog.findViewById(R.id.et_5);
            EditText editText6 = dialog.findViewById(R.id.et_6);
            EditText editText7 = dialog.findViewById(R.id.et_7);
            EditText editText8 = dialog.findViewById(R.id.et_8);
            EditText editText9 = dialog.findViewById(R.id.et_9);
            EditText editText10 = dialog.findViewById(R.id.et_10);

            TextView textView1 = dialog.findViewById(R.id.tv_1);
            TextView textView2 = dialog.findViewById(R.id.tv_2);
            TextView textView3 = dialog.findViewById(R.id.tv_3);
            TextView textView4 = dialog.findViewById(R.id.tv_4);
            TextView textView5 = dialog.findViewById(R.id.tv_5);
            TextView textView6 = dialog.findViewById(R.id.tv_6);
            TextView textView7 = dialog.findViewById(R.id.tv_7);
            TextView textView8 = dialog.findViewById(R.id.tv_8);
            TextView textView9 = dialog.findViewById(R.id.tv_9);
            TextView textView10 = dialog.findViewById(R.id.tv_10);

            TextView counter = dialog.findViewById(R.id.count);

            Button button1 = dialog.findViewById(R.id.btn_prevoius);
            Button button2 = dialog.findViewById(R.id.btn_next);
        //    editText1.setText(count);
        //    counter.setText(count);

            button2.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    count = count+1;


                    if(count == 1){
                        textView1.setText("11");
                        textView2.setText("12");
                        textView3.setText("13");
                        textView4.setText("14");
                        textView5.setText("15");
                        textView6.setText("16");
                        textView7.setText("17");
                        textView8.setText("18");
                        textView9.setText("19");
                        textView10.setText("20");
                    }
                    if(count == 2){
                        textView1.setText("21");
                        textView2.setText("22");
                        textView3.setText("23");
                        textView4.setText("24");
                        textView5.setText("25");
                        textView6.setText("26");
                        textView7.setText("27");
                        textView8.setText("28");
                        textView9.setText("29");
                        textView10.setText("30");
                    }
                    if(count == 3){
                        textView1.setText("31");
                        textView2.setText("32");
                        textView3.setText("33");
                        textView4.setText("34");
                        textView5.setText("35");
                        textView6.setText("36");
                        textView7.setText("37");
                        textView8.setText("38");
                        textView9.setText("39");
                        textView10.setText("40");
                    }
                    if(count == 4){
                        textView1.setText("41");
                        textView2.setText("42");
                        textView3.setText("43");
                        textView4.setText("44");
                        textView5.setText("45");
                        textView6.setText("46");
                        textView7.setText("47");
                        textView8.setText("48");
                        textView9.setText("49");
                        textView10.setText("50");
                    }
                    if(count == 5){
                        textView1.setText("51");
                        textView2.setText("52");
                        textView3.setText("53");
                        textView4.setText("54");
                        textView5.setText("55");
                        textView6.setText("56");
                        textView7.setText("57");
                        textView8.setText("58");
                        textView9.setText("59");
                        textView10.setText("60");
                    }
                    if(count == 6){
                        textView1.setText("61");
                        textView2.setText("62");
                        textView3.setText("63");
                        textView4.setText("64");
                        textView5.setText("65");
                        textView6.setText("66");
                        textView7.setText("67");
                        textView8.setText("68");
                        textView9.setText("69");
                        textView10.setText("70");
                    }
                    if(count == 7){
                        textView1.setText("71");
                        textView2.setText("72");
                        textView3.setText("73");
                        textView4.setText("74");
                        textView5.setText("75");
                        textView6.setText("76");
                        textView7.setText("77");
                        textView8.setText("78");
                        textView9.setText("79");
                        textView10.setText("80");
                    }
                    if(count == 8){
                        textView1.setText("81");
                        textView2.setText("82");
                        textView3.setText("83");
                        textView4.setText("84");
                        textView5.setText("85");
                        textView6.setText("86");
                        textView7.setText("87");
                        textView8.setText("88");
                        textView9.setText("89");
                        textView10.setText("90");
                    }
                    if(count == 9){
                        textView1.setText("91");
                        textView2.setText("92");
                        textView3.setText("93");
                        textView4.setText("94");
                        textView5.setText("95");
                        textView6.setText("96");
                        textView7.setText("97");
                        textView8.setText("98");
                        textView9.setText("99");
                        textView10.setText("100");
                    } else if(count > 9){
                        count = 0;
                        dialog.dismiss();
                    }


                }
            });
            button1.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    count = count-1;

                    if(count < 0){
                        count = 0;
                    }
                    if(count == 0){
                        textView1.setText("1");
                        textView2.setText("2");
                        textView3.setText("3");
                        textView4.setText("4");
                        textView5.setText("5");
                        textView6.setText("6");
                        textView7.setText("7");
                        textView8.setText("8");
                        textView9.setText("9");
                        textView10.setText("10");
                    } else if(count == 1){
                        textView1.setText("11");
                        textView2.setText("12");
                        textView3.setText("13");
                        textView4.setText("14");
                        textView5.setText("15");
                        textView6.setText("16");
                        textView7.setText("17");
                        textView8.setText("18");
                        textView9.setText("19");
                        textView10.setText("20");
                    } else if(count == 2){
                        textView1.setText("21");
                        textView2.setText("22");
                        textView3.setText("23");
                        textView4.setText("24");
                        textView5.setText("25");
                        textView6.setText("26");
                        textView7.setText("27");
                        textView8.setText("28");
                        textView9.setText("29");
                        textView10.setText("30");
                    } else if(count == 3){
                        textView1.setText("31");
                        textView2.setText("32");
                        textView3.setText("33");
                        textView4.setText("34");
                        textView5.setText("35");
                        textView6.setText("36");
                        textView7.setText("37");
                        textView8.setText("38");
                        textView9.setText("39");
                        textView10.setText("40");
                    } else if(count == 4){
                        textView1.setText("41");
                        textView2.setText("42");
                        textView3.setText("43");
                        textView4.setText("44");
                        textView5.setText("45");
                        textView6.setText("46");
                        textView7.setText("47");
                        textView8.setText("48");
                        textView9.setText("49");
                        textView10.setText("50");
                    } else if(count == 5){
                        textView1.setText("51");
                        textView2.setText("52");
                        textView3.setText("53");
                        textView4.setText("54");
                        textView5.setText("55");
                        textView6.setText("56");
                        textView7.setText("57");
                        textView8.setText("58");
                        textView9.setText("59");
                        textView10.setText("60");
                    } else if(count == 6){
                        textView1.setText("61");
                        textView2.setText("62");
                        textView3.setText("63");
                        textView4.setText("64");
                        textView5.setText("65");
                        textView6.setText("66");
                        textView7.setText("67");
                        textView8.setText("68");
                        textView9.setText("69");
                        textView10.setText("70");
                    } else if(count == 7){
                        textView1.setText("71");
                        textView2.setText("72");
                        textView3.setText("73");
                        textView4.setText("74");
                        textView5.setText("75");
                        textView6.setText("76");
                        textView7.setText("77");
                        textView8.setText("78");
                        textView9.setText("79");
                        textView10.setText("80");
                    } else if(count == 8){
                        textView1.setText("81");
                        textView2.setText("82");
                        textView3.setText("83");
                        textView4.setText("84");
                        textView5.setText("85");
                        textView6.setText("86");
                        textView7.setText("87");
                        textView8.setText("88");
                        textView9.setText("89");
                        textView10.setText("90");
                    } else if(count == 9){
                        textView1.setText("91");
                        textView2.setText("92");
                        textView3.setText("93");
                        textView4.setText("94");
                        textView5.setText("95");
                        textView6.setText("96");
                        textView7.setText("97");
                        textView8.setText("98");
                        textView9.setText("99");
                        textView10.setText("100");

                    }


                }
            });
            dialog.show();
        });

    }
}
