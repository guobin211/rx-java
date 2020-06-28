package com.mix.kotlinapp.ui.main

import androidx.lifecycle.ViewModelProviders
import android.os.Bundle
import android.util.Log
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.RemoteViews
import android.widget.Toast
import androidx.core.app.NotificationCompat
import androidx.core.app.NotificationManagerCompat
import androidx.core.widget.addTextChangedListener
import com.mix.kotlinapp.R
import kotlinx.android.synthetic.main.global_notify.*
import kotlinx.android.synthetic.main.main_fragment.*

fun log(s: String): Unit {
    Log.i("MainFragment", s)
}

class MainFragment : Fragment() {

    companion object {
        fun newInstance() = MainFragment()
    }

    private lateinit var viewModel: MainViewModel
    private val channelId = "package com.mix.kotlin_app_MainFragment"
    private val notificationId: Int = 3999

    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?,
                              savedInstanceState: Bundle?): View {
        return inflater.inflate(R.layout.main_fragment, container, false)
    }

    override fun onActivityCreated(savedInstanceState: Bundle?) {
        super.onActivityCreated(savedInstanceState)
        this.initInputListener()
        this.initNotifyButton()
    }

    private fun initInputListener() {
        viewModel = ViewModelProviders.of(this).get(MainViewModel::class.java)
        log(viewModel.dataMap.toString())
        main_frag_text.text = viewModel.dataMap.getOrDefault("name", "Empty")
        main_frag_input.addTextChangedListener {
            log(it.toString())
            if (it.toString().isEmpty()) {
                main_frag_text.text = viewModel.dataMap.getOrDefault("name", "Empty")
            } else {
                main_frag_text.text = it.toString()
            }
        }
    }

    private fun initNotifyButton() {
        main_frag_button.setOnClickListener {
            log("main_frag_button click")
            this.openNotify()
        }
    }

    private fun openNotify() {
        val msg = NotificationCompat.Builder(context!!, channelId)
            .setVisibility(NotificationCompat.VISIBILITY_PUBLIC)
            .setSmallIcon(R.drawable.ic_launcher_foreground)
            .setCustomBigContentView(RemoteViews("com.mix.kotlinapp", R.layout.global_notify))
            .setPriority(NotificationCompat.PRIORITY_DEFAULT)
            .build()
        val notifyManage = NotificationManagerCompat.from(context!!)
        notifyManage.notify(this.notificationId, msg)
    }

    private fun initNotifyAction() {
        close_dialog.setOnClickListener {
            log("close_dialog click")
            Toast.makeText(context, "关闭", Toast.LENGTH_SHORT).show()
        }
        previous.setOnClickListener {
            log("previous click")
            Toast.makeText(context, "上一首", Toast.LENGTH_SHORT).show()
        }
        next.setOnClickListener {
            log("next click")
            Toast.makeText(context, "下一首", Toast.LENGTH_SHORT).show()
        }
        play.setOnClickListener {
            log("play click")
            println(it.background)
            Toast.makeText(context, "播放或暂停", Toast.LENGTH_SHORT).show()
        }
    }

}