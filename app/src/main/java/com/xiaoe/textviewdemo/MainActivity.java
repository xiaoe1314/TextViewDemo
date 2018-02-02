package com.xiaoe.textviewdemo;

import android.graphics.Paint;
import android.graphics.Typeface;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.text.Html;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        //加粗可在布局文件xml里设置android:textStyle="bold"，也可以代码设置
        TextView textView = findViewById(R.id.two);
        //设置加粗
        textView.setTypeface(Typeface.defaultFromStyle(Typeface.BOLD));
        //设置下划线
        textView.getPaint().setFlags(Paint. UNDERLINE_TEXT_FLAG );


        /*
         * 设置行间距直接在布局文件xml里设置
         * android:lineSpacingExtra="5dp"
         * android:lineSpacingMultiplier="1.5"
         */
        ShangshabanChangeTextSpaceView shangshabanChangeTextSpaceView = findViewById(R.id.three);
        //设置字间距必须设置这两个方法才有效果
        shangshabanChangeTextSpaceView.setSpacing(8f);
        shangshabanChangeTextSpaceView.setText(R.string.three);


        // Android支持html格式的字符串，
        // 通过调用Html.fromHtml(str)方法可以转换html格式的字符串str。
        TextView textView2 = findViewById(R.id.four);
        String textStr1 = "<font color=\"#123569\">支持html格式的字符串，</font><br/>";
        String textStr2 = "<font color=\"#00ff69\">支持html格式的字符串</font>";
        textView2.setText(Html.fromHtml(textStr1 + textStr2));
    }
}
