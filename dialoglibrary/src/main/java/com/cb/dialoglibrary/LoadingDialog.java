package com.cb.dialoglibrary;

import android.content.Context;
import android.icu.util.IndianCalendar;
import android.os.Bundle;
import android.support.v7.app.AlertDialog;

import com.wang.avi.AVLoadingIndicatorView;
import com.wang.avi.Indicator;

/**
 * ================================================================
 * 创建时间：2019/4/25 0025
 * 创 建 人：Mr.常
 * 文件描述：加载动画页面(默认为白色菊花旋转样式)
 * 码    农：你不是我记忆中Bug、但致命的程度没两样！
 * ================================================================
 */
public class LoadingDialog extends AlertDialog {

    private static LoadingDialog loadingDialog;
    private AVLoadingIndicatorView avi;

    public static LoadingDialog getInstance(Context context) {
        if (null == loadingDialog) {
            loadingDialog = new LoadingDialog(context, R.style.TransparentDialog); //设置AlertDialog背景透明
            loadingDialog.setCancelable(false);
            loadingDialog.setCanceledOnTouchOutside(false);
        }
        return loadingDialog;
    }

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


    /**
     * 监听Back键按下事件,方法1:
     * 注意:
     * super.onBackPressed()会自动调用finish()方法,关闭
     * 当前Activity.
     * 若要屏蔽Back键盘,注释该行代码即可
     */
    @Override
    public void onBackPressed() {
        super.onBackPressed();
        dismiss();    //关闭加载动画页面
    }
}