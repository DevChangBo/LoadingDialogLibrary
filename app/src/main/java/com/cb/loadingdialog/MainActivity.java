package com.cb.loadingdialog;

import android.content.DialogInterface;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.text.TextUtils;
import android.util.Log;
import android.view.View;
import android.widget.Toast;

import com.cb.dialoglibrary.DialogUtils;
import com.cb.dialoglibrary.InstanceName;
import com.cb.dialoglibrary.LoadingDialog;
import com.cb.dialoglibrary.SweetAlertDialog;

import butterknife.ButterKnife;
import butterknife.OnClick;

public class MainActivity extends AppCompatActivity implements DialogInterface.OnCancelListener{

    public SweetAlertDialog mDialog;//对话框
    private LoadingDialog loadingDialog;
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
                loadingDialog= LoadingDialog.getInstance(this,this);
                loadingDialog.show();
                loadingDialog.indicatorName(InstanceName.BallPulseIndicator);
                break;
            case R.id.bt_instance2:
                loadingDialog= LoadingDialog.getInstance(this,this);
                loadingDialog.show();
                loadingDialog.indicatorName(InstanceName.BallGridPulseIndicator);
                break;
            case R.id.bt_instance3:
                loadingDialog= LoadingDialog.getInstance(this,this);
                loadingDialog.show();
                loadingDialog.indicatorName(InstanceName.BallClipRotateIndicator);
                break;
            case R.id.bt_instance4:
                loadingDialog= LoadingDialog.getInstance(this,this);
                loadingDialog.show();
                loadingDialog.indicatorName(InstanceName.BallClipRotatePulseIndicator);
                break;
            case R.id.bt_instance5:
                loadingDialog= LoadingDialog.getInstance(this,this);
                loadingDialog.show();
                loadingDialog.indicatorName(InstanceName.SquareSpinIndicator);
                break;
            case R.id.bt_instance6:
                loadingDialog= LoadingDialog.getInstance(this,this);
                loadingDialog.show();
                loadingDialog.indicatorName(InstanceName.BallClipRotateMultipleIndicator);
                break;
            case R.id.bt_instance7:
                loadingDialog= LoadingDialog.getInstance(this,this);
                loadingDialog.show();
                loadingDialog.indicatorName(InstanceName.BallPulseRiseIndicator);
                break;
            case R.id.bt_instance8:
                loadingDialog= LoadingDialog.getInstance(this,this);
                loadingDialog.show();
                loadingDialog.indicatorName(InstanceName.BallRotateIndicator);
                break;
            case R.id.bt_instance9:
                loadingDialog= LoadingDialog.getInstance(this,this);
                loadingDialog.show();
                loadingDialog.indicatorName(InstanceName.CubeTransitionIndicator);
                break;
            case R.id.bt_instance10:
                loadingDialog= LoadingDialog.getInstance(this,this);
                loadingDialog.show();
                loadingDialog.indicatorName(InstanceName.BallZigZagIndicator);
                break;
            case R.id.bt_instance11:
                loadingDialog= LoadingDialog.getInstance(this,this);
                loadingDialog.show();
                loadingDialog.indicatorName(InstanceName.BallZigZagDeflectIndicator);
                break;
            case R.id.bt_instance12:
                loadingDialog= LoadingDialog.getInstance(this,this);
                loadingDialog.show();
                loadingDialog.indicatorName(InstanceName.BallTrianglePathIndicator);
                break;
            case R.id.bt_instance13:
                loadingDialog= LoadingDialog.getInstance(this,this);
                loadingDialog.show();
                loadingDialog.indicatorName(InstanceName.BallScaleIndicator);
                break;
            case R.id.bt_instance14:
                loadingDialog= LoadingDialog.getInstance(this,this);
                loadingDialog.show();
                loadingDialog.indicatorName(InstanceName.LineScaleIndicator);
                break;
            case R.id.bt_instance15:
                loadingDialog= LoadingDialog.getInstance(this,this);
                loadingDialog.show();
                loadingDialog.indicatorName(InstanceName.LineScalePartyIndicator);
                break;
            case R.id.bt_instance16:
                loadingDialog= LoadingDialog.getInstance(this,this);
                loadingDialog.show();
                loadingDialog.indicatorName(InstanceName.BallScaleMultipleIndicator);
                break;
            case R.id.bt_instance17:
                loadingDialog= LoadingDialog.getInstance(this,this);
                loadingDialog.show();
                loadingDialog.indicatorName(InstanceName.BallPulseSyncIndicator);
                break;
            case R.id.bt_instance18:
                loadingDialog= LoadingDialog.getInstance(this,this);
                loadingDialog.show();
                loadingDialog.indicatorName(InstanceName.BallBeatIndicator);
                break;
            case R.id.bt_instance19:
                loadingDialog= LoadingDialog.getInstance(this,this);
                loadingDialog.show();
                loadingDialog.indicatorName(InstanceName.LineScalePulseOutIndicator);
                break;
            case R.id.bt_instance20:
                loadingDialog= LoadingDialog.getInstance(this,this);
                loadingDialog.show();
                loadingDialog.indicatorName(InstanceName.LineScalePulseOutRapidIndicator);
                break;
            case R.id.bt_instance21:
                loadingDialog= LoadingDialog.getInstance(this,this);
                loadingDialog.show();
                loadingDialog.indicatorName(InstanceName.BallScaleRippleIndicator);
                break;
            case R.id.bt_instance22:
                loadingDialog= LoadingDialog.getInstance(this,this);
                loadingDialog.show();
                loadingDialog.indicatorName(InstanceName.BallScaleRippleMultipleIndicator);
                break;
            case R.id.bt_instance23:
                loadingDialog= LoadingDialog.getInstance(this,this);
                loadingDialog.show();
                loadingDialog.indicatorName(InstanceName.BallSpinFadeLoaderIndicator);
                break;
            case R.id.bt_instance24:
                loadingDialog= LoadingDialog.getInstance(this,this);
                loadingDialog.show();
                loadingDialog.indicatorName(InstanceName.LineSpinFadeLoaderIndicator);
                break;
            case R.id.bt_instance25:
                loadingDialog= LoadingDialog.getInstance(this,this);
                loadingDialog.show();
                loadingDialog.indicatorName(InstanceName.TriangleSkewSpinIndicator);
                break;
            case R.id.bt_instance26:
                loadingDialog= LoadingDialog.getInstance(this,this);
                loadingDialog.show();
                loadingDialog.indicatorName(InstanceName.PacmanIndicator);
                break;
            case R.id.bt_instance27:
                loadingDialog= LoadingDialog.getInstance(this,this);
                loadingDialog.show();
                loadingDialog.indicatorName(InstanceName.BallGridBeatIndicator);
                break;
            case R.id.bt_instance28:
                loadingDialog= LoadingDialog.getInstance(this,this);
                loadingDialog.show();
                loadingDialog.indicatorName(InstanceName.SemiCircleSpinIndicator);
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
