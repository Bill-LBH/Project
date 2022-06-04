package com.example.project.util;

import android.content.Context;
import android.widget.Toast;

//进行一个简单的封装
public class ToastUtil {
    public static Toast mToast;
    public static void showMsg(Context context, String msg){
        if ((mToast == null)){
            mToast = Toast.makeText(context,msg,Toast.LENGTH_LONG);
        }else {
            mToast.setText(msg);
        }
        mToast.show();
    }

}
