package com.cb.dialoglibrary;

import android.content.Context;
import android.os.Bundle;

import androidx.appcompat.app.AlertDialog;


/**
 * ================================================================
 * 创建时间：2019/4/25 0025
 * 创 建 人：Mr.常
 * 文件描述：加载动画页面(默认为白色菊花旋转样式)
 * 码    农：你不是我记忆中Bug、但致命的程度没两样！
 * ================================================================
 */
public class LoadingDialog extends AlertDialog {

    private AVLoadingIndicatorView avi;


    public LoadingDialog(Context context, int themeResId) {
        super(context,themeResId);
    }

    @Override
    protected void onStart() {
        super.onStart();
        this.setContentView(R.layout.dialog_loading);
        avi = (AVLoadingIndicatorView)this.findViewById(R.id.avi);
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
    }

    /**
     * 设置加载动画颜色
     * @param color
     */
    public void indicatorColor(int color){
        avi.setIndicatorColor(color);
    }

    /**
     * 设置加载动画样式
     * @param indicatorName
     */
    public void indicatorName(String indicatorName){
        avi.setIndicator(indicatorName);

    }



    @Override
    public void show() {
        super.show();
        avi.show();
    }

    @Override
    public void dismiss() {
        super.dismiss();
        avi.hide();
    }


}
