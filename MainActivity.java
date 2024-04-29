package com.example.homework1;
import androidx.appcompat.app.AppCompatActivity;

import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;


public class MainActivity extends Activity {
    // 调用Actvity
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);//关联activity.xml
        // 关联登录/清空按钮、用户名、密码
        Button bLogin = (Button)this.findViewById(R.id.loginLog);
        Button bClear = (Button)this.findViewById(R.id.loginClear);
        final EditText eUid = (EditText)this.findViewById(R.id.EditTextuid);
        final EditText eMima = (EditText)this.findViewById(R.id.EditTextPwd);
        // 登录按钮监听器
        bLogin.setOnClickListener(
                new OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        String strUid = eUid.getText().toString().trim();
                        String strPwd = eMima.getText().toString().trim();
                        // 判断如果用户名是123456 密码是LING就是登录成功
                        if(strUid.equals("1234567") && strPwd.equals("LING"))
                        {
                            Toast.makeText(MainActivity.this,"恭喜登录成功！",Toast.LENGTH_SHORT).show();
                        }
                        else
                        {
                            Toast.makeText(MainActivity.this,"请输入正确的用户名或密码！",Toast.LENGTH_SHORT).show();
                        }
                    }
                }
        );
        // 清空按钮监听器
        bClear.setOnClickListener(
                new OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        //清空 设置密码和用户名为空
                        eUid.setText("");
                        eMima.setText("");
                    }
                }
        );

    }
}

