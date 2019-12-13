package com.cb.dialoglibrary;

import android.app.Activity;
import android.app.Dialog;
import android.content.Context;
import android.content.DialogInterface;

/**
 * ================================================================
 * 创建时间：2019/4/25 0025
 * 创 建 人：Mr.常
 * 文件描述：对话弹出框
 * 码    农：你不是我记忆中Bug、但致命的程度没两样！
 * ================================================================
 */
public class DialogUtils {
    private static DialogUtils mDialogUtils;

    private DialogUtils() {
    }

    public static DialogUtils getInstance() {
        mDialogUtils = mDialogUtils == null ? new DialogUtils() : mDialogUtils;
        return mDialogUtils;
    }

    public Dialog getLoadingDialog(Context context, DialogInterface.OnCancelListener mCancelListener) {
        LoadingDialog dialog = new LoadingDialog(context, R.style.TransparentDialog); //设置AlertDialog背景透明
        dialog.setCanceledOnTouchOutside(false);
        dialog.setOnCancelListener(mCancelListener);
        dialog.show();
        return dialog;
    }


    public Dialog getLoadingDialog(Context context, DialogInterface.OnCancelListener mCancelListener,String indicatorName) {
        LoadingDialog dialog = new LoadingDialog(context, R.style.TransparentDialog); //设置AlertDialog背景透明
        dialog.setCanceledOnTouchOutside(false);
        dialog.setOnCancelListener(mCancelListener);
        dialog.show();
        dialog.indicatorName(indicatorName);
        return dialog;
    }


    /**
     * 获取一个对话框
     *
     * @param mActivity              上下午
     * @param title                 标题
     * @param content               内容
     * @param dialogType            对话框类型  SweetAlertDialog.ERROR_TYPE...
     * @param isCancelable          对话框是否可以取消
     * @param mOnSweetClickListener 确定按钮点击事件
     * @return
     */
    public SweetAlertDialog getDialog(Activity mActivity, String title, String content, int dialogType, boolean isCancelable, SweetAlertDialog.OnSweetClickListener mOnSweetClickListener) {
        SweetAlertDialog mDialog = new SweetAlertDialog(mActivity, dialogType)
                .setTitleText(title)
                .setContentText(content)
                .setConfirmClickListener(mOnSweetClickListener);
        mDialog.setCancelable(isCancelable);
        mDialog.setConfirmText("确定");
        return mDialog;
    }

}
