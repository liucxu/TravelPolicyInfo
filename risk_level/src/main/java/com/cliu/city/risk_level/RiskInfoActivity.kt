package com.cliu.city.risk_level

import android.os.Bundle
import com.alibaba.android.arouter.facade.annotation.Route
import com.cliu.appbase.config.ARouterConfig
import com.cliu.appbase.ui.BaseActivity
import com.cliu.city.risk_level.databinding.ActivityRiskInfoBinding

/**
 * show risk level info about citys
 */
@Route(path = ARouterConfig.RISK_INFO)
class RiskInfoActivity : BaseActivity<ActivityRiskInfoBinding>() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
    }

    override fun createViewBinding(): ActivityRiskInfoBinding {
        return ActivityRiskInfoBinding.inflate(layoutInflater)
    }

}