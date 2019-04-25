package com.cb.loadingdialog;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;

import com.cb.dialoglibrary.DialogUtils;
import com.cb.dialoglibrary.InstanceName;
import com.cb.dialoglibrary.LoadingDialog;
import com.cb.dialoglibrary.SweetAlertDialog;

import butterknife.ButterKnife;
import butterknife.OnClick;

public class MainActivity extends AppCompatActivity {

    public SweetAlertDialog mDialog;//对话框
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
                LoadingDialog.getInstance(this).show();
                LoadingDialog.getInstance(this).indicatorName(InstanceName.BallPulseIndicator);
                break;
            case R.id.bt_instance2:
                LoadingDialog.getInstance(this).show();
                LoadingDialog.getInstance(this).indicatorName(InstanceName.BallGridPulseIndicator);
                break;
            case R.id.bt_instance3:
                LoadingDialog.getInstance(this).show();
                LoadingDialog.getInstance(this).indicatorName(InstanceName.BallClipRotateIndicator);
                break;
            case R.id.bt_instance4:
                LoadingDialog.getInstance(this).show();
                LoadingDialog.getInstance(this).indicatorName(InstanceName.BallClipRotatePulseIndicator);
                break;
            case R.id.bt_instance5:
                LoadingDialog.getInstance(this).show();
                LoadingDialog.getInstance(this).indicatorName(InstanceName.SquareSpinIndicator);
                break;
            case R.id.bt_instance6:
                LoadingDialog.getInstance(this).show();
                LoadingDialog.getInstance(this).indicatorName(InstanceName.BallClipRotateMultipleIndicator);
                break;
            case R.id.bt_instance7:
                LoadingDialog.getInstance(this).show();
                LoadingDialog.getInstance(this).indicatorName(InstanceName.BallPulseRiseIndicator);
                break;
            case R.id.bt_instance8:
                LoadingDialog.getInstance(this).show();
                LoadingDialog.getInstance(this).indicatorName(InstanceName.BallRotateIndicator);
                break;
            case R.id.bt_instance9:
                LoadingDialog.getInstance(this).show();
                LoadingDialog.getInstance(this).indicatorName(InstanceName.CubeTransitionIndicator);
                break;
            case R.id.bt_instance10:
                LoadingDialog.getInstance(this).show();
                LoadingDialog.getInstance(this).indicatorName(InstanceName.BallZigZagIndicator);
                break;
            case R.id.bt_instance11:
                LoadingDialog.getInstance(this).show();
                LoadingDialog.getInstance(this).indicatorName(InstanceName.BallZigZagDeflectIndicator);
                break;
            case R.id.bt_instance12:
                LoadingDialog.getInstance(this).show();
                LoadingDialog.getInstance(this).indicatorName(InstanceName.BallTrianglePathIndicator);
                break;
            case R.id.bt_instance13:
                LoadingDialog.getInstance(this).show();
                LoadingDialog.getInstance(this).indicatorName(InstanceName.BallScaleIndicator);
                break;
            case R.id.bt_instance14:
                LoadingDialog.getInstance(this).show();
                LoadingDialog.getInstance(this).indicatorName(InstanceName.LineScaleIndicator);
                break;
            case R.id.bt_instance15:
                LoadingDialog.getInstance(this).show();
                LoadingDialog.getInstance(this).indicatorName(InstanceName.LineScalePartyIndicator);
                break;
            case R.id.bt_instance16:
                LoadingDialog.getInstance(this).show();
                LoadingDialog.getInstance(this).indicatorName(InstanceName.BallScaleMultipleIndicator);
                break;
            case R.id.bt_instance17:
                LoadingDialog.getInstance(this).show();
                LoadingDialog.getInstance(this).indicatorName(InstanceName.BallPulseSyncIndicator);
                break;
            case R.id.bt_instance18:
                LoadingDialog.getInstance(this).show();
                LoadingDialog.getInstance(this).indicatorName(InstanceName.BallBeatIndicator);
                break;
            case R.id.bt_instance19:
                LoadingDialog.getInstance(this).show();
                LoadingDialog.getInstance(this).indicatorName(InstanceName.LineScalePulseOutIndicator);
                break;
            case R.id.bt_instance20:
                LoadingDialog.getInstance(this).show();
                LoadingDialog.getInstance(this).indicatorName(InstanceName.LineScalePulseOutRapidIndicator);
                break;
            case R.id.bt_instance21:
                LoadingDialog.getInstance(this).show();
                LoadingDialog.getInstance(this).indicatorName(InstanceName.BallScaleRippleIndicator);
                break;
            case R.id.bt_instance22:
                LoadingDialog.getInstance(this).show();
                LoadingDialog.getInstance(this).indicatorName(InstanceName.BallScaleRippleMultipleIndicator);
                break;
            case R.id.bt_instance23:
                LoadingDialog.getInstance(this).show();
                LoadingDialog.getInstance(this).indicatorName(InstanceName.BallSpinFadeLoaderIndicator);
                break;
            case R.id.bt_instance24:
                LoadingDialog.getInstance(this).show();
                LoadingDialog.getInstance(this).indicatorName(InstanceName.LineSpinFadeLoaderIndicator);
                break;
            case R.id.bt_instance25:
                LoadingDialog.getInstance(this).show();
                LoadingDialog.getInstance(this).indicatorName(InstanceName.TriangleSkewSpinIndicator);
                break;
            case R.id.bt_instance26:
                LoadingDialog.getInstance(this).show();
                LoadingDialog.getInstance(this).indicatorName(InstanceName.PacmanIndicator);
                break;
            case R.id.bt_instance27:
                LoadingDialog.getInstance(this).show();
                LoadingDialog.getInstance(this).indicatorName(InstanceName.BallGridBeatIndicator);
                break;
            case R.id.bt_instance28:
                LoadingDialog.getInstance(this).show();
                LoadingDialog.getInstance(this).indicatorName(InstanceName.SemiCircleSpinIndicator);
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
}
