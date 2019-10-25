package com.example.toas_snack_bar

import android.app.NotificationChannel
import android.app.NotificationManager
import android.content.Context
import android.content.DialogInterface
import android.graphics.Color
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import androidx.appcompat.app.AlertDialog
import androidx.core.app.NotificationCompat
import com.google.android.material.snackbar.Snackbar
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)




        // THIS IS THE BEST NTOIFICATION


        val notificationManager :  NotificationManager = getSystemService(Context.NOTIFICATION_SERVICE)
             as NotificationManager

        val id = "channel_01"
        val name = "Default_channel"
        val importance = NotificationManager.IMPORTANCE_HIGH
        val channel = NotificationChannel(id , name , importance)
        channel.lightColor = Color.CYAN
        notificationManager.createNotificationChannel(channel)

        btn_notify.setOnClickListener{

            var nCBuilder = NotificationCompat.Builder(this,
                "Channel_01")
            nCBuilder.setSmallIcon(R.drawable.notification_icon_background)
            nCBuilder.setContentTitle("Notification")
            nCBuilder.setContentText("This is a notification")

            val mNoficiationManager =
                getSystemService(Context.NOTIFICATION_SERVICE)
                        as NotificationManager

            mNoficiationManager.notify(1, nCBuilder.build())
        }

        // this is snackBAR
        btn_snack.setOnClickListener{
       var builder = Snackbar.make(it , "Snackbar" , Snackbar.LENGTH_LONG)

            builder.show()
        }

        // THIS IS THE BEST EXAMPLE OF TOAST

         btn_tost.setOnClickListener{
             Toast.makeText(this , " This is an exmaple of Toast " , Toast.LENGTH_LONG)
                 .show()


         }


        }



    }


