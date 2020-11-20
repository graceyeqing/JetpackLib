package com.fmt.github.tasks

import androidx.core.content.ContextCompat
import com.fmt.github.R
import com.fmt.launch.starter.task.Task
import com.scwang.smartrefresh.header.*
import com.scwang.smartrefresh.layout.SmartRefreshLayout
import com.scwang.smartrefresh.layout.api.DefaultRefreshFooterCreator
import com.scwang.smartrefresh.layout.api.RefreshFooter
import com.scwang.smartrefresh.layout.api.RefreshLayout
import com.scwang.smartrefresh.layout.footer.ClassicsFooter


class InitSmartRefreshLayoutTask : Task() {

    override fun run() {
        //设置全局的Header构建器
        SmartRefreshLayout.setDefaultRefreshHeaderCreator { context, layout ->
//            layout.setEnableHeaderTranslationContent(false)
//            MaterialHeader(context).setColorSchemeColors(
//                ContextCompat.getColor(
//                    context,
//                    R.color.colorPrimary
//                )
//            )
            //气球飘
//            DeliveryHeader(context)
            //盒子掉落
//            DropBoxHeader(context)
//            PhoenixHeader(context)
            //苹果水滴
//            WaterDropHeader(context)
            //全屏水波
            WaveSwipeHeader(context)
        }

        //设置全局的Footer构建器
        SmartRefreshLayout.setDefaultRefreshFooterCreator{context, layout ->
                //指定为经典Footer，默认是 BallPulseFooter
            ClassicsFooter(context).setDrawableSize(20f)
        }
    }
}