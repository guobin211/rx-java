package com.mix.kotlinapp

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.core.app.NotificationCompat
import androidx.core.app.NotificationManagerCompat
import com.mix.kotlinapp.ui.main.MainFragment

class MainActivity : AppCompatActivity() {

    private lateinit var notifyManage: NotificationManagerCompat
    private val channelId = "package com.mix.kotlin_app_channelId"
    private val notificationId: Int = 2999

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.main_activity)
        if (savedInstanceState == null) {
            supportFragmentManager.beginTransaction()
                    .replace(R.id.container, MainFragment.newInstance())
                    .commitNow()
        }
        notifyManage = NotificationManagerCompat.from(applicationContext)

        val msg = NotificationCompat.Builder(this, channelId)
            .setSmallIcon(R.drawable.ic_launcher_foreground)
            .setContentTitle("MainActivity")
            .setContentText("MainActivity Content")
            .setPriority(NotificationCompat.PRIORITY_DEFAULT)
            .build()
        notifyManage.notify(this.notificationId, msg)
    }
}