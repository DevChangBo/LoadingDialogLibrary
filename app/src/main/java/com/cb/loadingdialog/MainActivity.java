package com.cb.loadingdialog;

import android.app.Dialog;
import android.content.DialogInterface;
import android.os.Bundle;
import android.view.View;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

import com.cb.dialoglibrary.DialogUtils;
import com.cb.dialoglibrary.InstanceName;
import com.cb.dialoglibrary.SweetAlertDialog;

import butterknife.ButterKnife;
import butterknife.OnClick;

public class MainActivity extends AppCompatActivity implements DialogInterface.OnCancelListener{

    public SweetAlertDialog mDialog;//对话框
    private Dialog loadingDialog;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        ButterKnife.bind(this);
    }

    @OnClick({R.id.bt_instance1, R.id.bt_instance2, R.id.bt_instance3, R.id.bt_instance4, R.id.bt_instance5, R.id.bt_instance6, R.id.bt_instance7, R.id.bt_instance8, R.id.bt_instance9, R.id.bt_instance10, R.id.bt_instance11, R.id.bt_instance12, R.id.bt_instance13, R.id.bt_instance14, R.id.bt_instance15, R.id.bt_instance16, R.id.bt_instance17, R.id.bt_instance18, R.id.bt_instance19, R.id.bt_instance20, R.id.bt_instance21, R.id.bt_instance22, R.id.bt_instance23, R.id.bt_instance24, R.id.bt_instance25, R.id.bt_instance26, R.id.bt_instance27, R.id.bt_instance28,
            R.id.bt_dialogType1,R.id.bt_dialogType2,R.id.bt_dialogType3,R.id.bt_dialogType4,R.id.bt_dialogType5,R.id.bt_dialogType6})
    public void onViewClicked(View view) {
        switch (view.getId()) {
            case R.id.bt_instance1:
                loadingDialog= DialogUtils.getInstance().getLoadingDialog(this,this);
                break;
            case R.id.bt_instance2:
                loadingDialog= DialogUtils.getInstance().getLoadingDialog(this,this,InstanceName.BallGridPulseIndicator);
                break;
            case R.id.bt_instance3:
                loadingDialog= DialogUtils.getInstance().getLoadingDialog(this,this,InstanceName.BallClipRotateIndicator);
                break;
            case R.id.bt_instance4:
                loadingDialog= DialogUtils.getInstance().getLoadingDialog(this,this,InstanceName.BallClipRotatePulseIndicator);
                break;
            case R.id.bt_instance5:
                loadingDialog= DialogUtils.getInstance().getLoadingDialog(this,this,InstanceName.SquareSpinIndicator);
                break;
            case R.id.bt_instance6:
                loadingDialog= DialogUtils.getInstance().getLoadingDialog(this,this,InstanceName.BallClipRotateMultipleIndicator);
                break;
            case R.id.bt_instance7:
                loadingDialog= DialogUtils.getInstance().getLoadingDialog(this,this,InstanceName.BallPulseRiseIndicator);
                break;
            case R.id.bt_instance8:
                loadingDialog= DialogUtils.getInstance().getLoadingDialog(this,this,InstanceName.BallRotateIndicator);
                break;
            case R.id.bt_instance9:
                loadingDialog= DialogUtils.getInstance().getLoadingDialog(this,this,InstanceName.CubeTransitionIndicator);
                break;
            case R.id.bt_instance10:
                loadingDialog=DialogUtils.getInstance().getLoadingDialog(this,this,InstanceName.BallZigZagIndicator);
                break;
            case R.id.bt_instance11:
                loadingDialog= DialogUtils.getInstance().getLoadingDialog(this,this,InstanceName.BallZigZagDeflectIndicator);
                break;
            case R.id.bt_instance12:
                loadingDialog= DialogUtils.getInstance().getLoadingDialog(this,this,InstanceName.BallTrianglePathIndicator);
                break;
            case R.id.bt_instance13:
                loadingDialog= DialogUtils.getInstance().getLoadingDialog(this,this,InstanceName.BallScaleIndicator);
                break;
            case R.id.bt_instance14:
                loadingDialog= DialogUtils.getInstance().getLoadingDialog(this,this,InstanceName.LineScaleIndicator);
                break;
            case R.id.bt_instance15:
                loadingDialog= DialogUtils.getInstance().getLoadingDialog(this,this,InstanceName.LineScalePartyIndicator);
                break;
            case R.id.bt_instance16:
                loadingDialog= DialogUtils.getInstance().getLoadingDialog(this,this,InstanceName.BallScaleMultipleIndicator);
                break;
            case R.id.bt_instance17:
                loadingDialog= DialogUtils.getInstance().getLoadingDialog(this,this,InstanceName.BallPulseSyncIndicator);
                break;
            case R.id.bt_instance18:
                loadingDialog= DialogUtils.getInstance().getLoadingDialog(this,this,InstanceName.BallBeatIndicator);
                break;
            case R.id.bt_instance19:
                loadingDialog= DialogUtils.getInstance().getLoadingDialog(this,this,InstanceName.LineScalePulseOutIndicator);
                break;
            case R.id.bt_instance20:
                loadingDialog= DialogUtils.getInstance().getLoadingDialog(this,this,InstanceName.LineScalePulseOutRapidIndicator);
                break;
            case R.id.bt_instance21:
                loadingDialog= DialogUtils.getInstance().getLoadingDialog(this,this,InstanceName.BallScaleRippleIndicator);
                break;
            case R.id.bt_instance22:
                loadingDialog= DialogUtils.getInstance().getLoadingDialog(this,this,InstanceName.BallScaleRippleMultipleIndicator);
                break;
            case R.id.bt_instance23:
                loadingDialog= DialogUtils.getInstance().getLoadingDialog(this,this,InstanceName.BallSpinFadeLoaderIndicator);
                break;
            case R.id.bt_instance24:
                loadingDialog= DialogUtils.getInstance().getLoadingDialog(this,this,InstanceName.LineSpinFadeLoaderIndicator);
                break;
            case R.id.bt_instance25:
                loadingDialog= DialogUtils.getInstance().getLoadingDialog(this,this,InstanceName.TriangleSkewSpinIndicator);
                break;
            case R.id.bt_instance26:
                loadingDialog= DialogUtils.getInstance().getLoadingDialog(this,this,InstanceName.PacmanIndicator);
                break;
            case R.id.bt_instance27:
                loadingDialog= DialogUtils.getInstance().getLoadingDialog(this,this,InstanceName.BallGridBeatIndicator);
                break;
            case R.id.bt_instance28:
                loadingDialog= DialogUtils.getInstance().getLoadingDialog(this,this,InstanceName.SemiCircleSpinIndicator);
                break;
            case R.id.bt_dialogType1:
                mDialog = DialogUtils.getInstance().getDialog(this, "标题", "内容", SweetAlertDialog.NORMAL_TYPE, false, sweetAlertDialog -> mDialog.dismiss());
                mDialog.show();
                break;
            case R.id.bt_dialogType2:
                mDialog = DialogUtils.getInstance().getDialog(this, "标题", "内容", SweetAlertDialog.ERROR_TYPE, false, sweetAlertDialog -> mDialog.dismiss());
                mDialog.show();
                break;
            case R.id.bt_dialogType3:
                mDialog = DialogUtils.getInstance().getDialog(this, "标题", "内容", SweetAlertDialog.SUCCESS_TYPE, false, sweetAlertDialog -> mDialog.dismiss());
                mDialog.show();
                break;
            case R.id.bt_dialogType4:
                mDialog = DialogUtils.getInstance().getDialog(this, "标题", "内容", SweetAlertDialog.WARNING_TYPE, false, sweetAlertDialog -> mDialog.dismiss());
                mDialog.show();
                break;
            case R.id.bt_dialogType5:
                mDialog = DialogUtils.getInstance().getDialog(this, "标题", "内容", SweetAlertDialog.CUSTOM_IMAGE_TYPE, false, sweetAlertDialog -> mDialog.dismiss());
                mDialog.show();
                break;
            case R.id.bt_dialogType6:
                mDialog = DialogUtils.getInstance().getDialog(this, "标题", "内容", SweetAlertDialog.PROGRESS_TYPE, false, sweetAlertDialog -> mDialog.dismiss());
                mDialog.show();
                break;
        }
    }

    @Override
    public void onCancel(DialogInterface dialogInterface) {
        Toast.makeText(MainActivity.this, "操作取消", Toast.LENGTH_SHORT).show();
    }
}
