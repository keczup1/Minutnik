package com.example.ja.minutnik

import android.support.v7.app.AppCompatActivity
import android.os.*
import android.widget.Button
import android.widget.TextView
import android.widget.Toast


class Minutnik : AppCompatActivity() {

    var miliTime = 0
    var cTimer: CountDownTimer? = null
    var tState = TimerState.NEW

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.minutnik_2)

        val plustenminbutton=findViewById<Button>(R.id.plustenminbutton)
        val tenmintextview=findViewById<TextView>(R.id.tenmintextview)
        val plusminbutton=findViewById<Button>(R.id.plusminbutton)
        val mintextview=findViewById<TextView>(R.id.mintextview)
        val plustensecbutton=findViewById<Button>(R.id.plustensecbutton)
        val tensectextview=findViewById<TextView>(R.id.tensectextview)
        val plussecbutton=findViewById<Button>(R.id.plussecbutton)
        val sectextview=findViewById<TextView>(R.id.sectextview)
        val mintenminbutton=findViewById<Button>(R.id.mintenminbutton)
        val minminbutton=findViewById<Button>(R.id.minminbutton)
        val mintensecbutton=findViewById<Button>(R.id.mintensecbutton)
        val minsecbutton=findViewById<Button>(R.id.minsecbutton)
        val startbutton=findViewById<Button>(R.id.StartButton)
        val stopbutton=findViewById<Button>(R.id.StopButton)
        val resetbutton=findViewById<Button>(R.id.ResetButton)

        fun MinTenMin(){
            var t=tenmintextview.text.toString().toInt()
            if(t==0){

            }else{
                t--
                tenmintextview.text=t.toString()
            }
        }

        fun MinOneMin(){
            var t=mintextview.text.toString().toInt()
            if(t==0){
                mintextview.text="9"
                MinTenMin()
            }else{
                t--
                mintextview.text=t.toString()
            }
        }

        fun MinTenSec(){
            var t=tensectextview.text.toString().toInt()
            if(t==0){
                tensectextview.text="9"
                MinOneMin()
            }else{
                t--
                tensectextview.text=t.toString()
            }
        }

        fun MinOneSec(){
            var t=sectextview.text.toString().toInt()
            if(t==0){
                sectextview.text="9"
                MinTenSec()
            }else{
                t--
                sectextview.text=t.toString()
            }
        }

        plustenminbutton.setOnClickListener {
            if(tState!=TimerState.WORKING) {
                var t = tenmintextview.text.toString().toInt()
                if (t != 9) {
                    t += 1
                    tenmintextview.text = t.toString()
                } else {
                    tenmintextview.text = "0"
                }
            }
        }

        mintenminbutton.setOnClickListener {
            if(tState!=TimerState.WORKING) {
                var t = tenmintextview.text.toString().toInt()
                if (t != 0) {
                    t -= 1
                    tenmintextview.text = t.toString()
                } else {
                    tenmintextview.text = "9"
                }
            }
        }

        plusminbutton.setOnClickListener {
            if(tState!=TimerState.WORKING) {
                var t = mintextview.text.toString().toInt()
                if (t != 9) {
                    t += 1
                    mintextview.text = t.toString()
                } else {
                    mintextview.text = "0"
                }
            }
        }

        minminbutton.setOnClickListener {
            if(tState!=TimerState.WORKING) {
                var t = mintextview.text.toString().toInt()
                if (t != 0) {
                    t -= 1
                    mintextview.text = t.toString()
                } else {
                    mintextview.text = "9"
                }
            }
        }

        plustensecbutton.setOnClickListener {
            if(tState!=TimerState.WORKING) {
                var t = tensectextview.text.toString().toInt()
                if (t != 9) {
                    t += 1
                    tensectextview.text = t.toString()
                } else {
                    tensectextview.text = "0"
                }
            }
        }

        mintensecbutton.setOnClickListener {
            if(tState!=TimerState.WORKING) {
                var t = tensectextview.text.toString().toInt()
                if (t != 0) {
                    t -= 1
                    tensectextview.text = t.toString()
                } else {
                    tensectextview.text = "9"
                }
            }
        }

        plussecbutton.setOnClickListener {
            if(tState!=TimerState.WORKING) {
                var t = sectextview.text.toString().toInt()
                if (t != 9) {
                    t += 1
                    sectextview.text = t.toString()
                } else {
                    sectextview.text = "0"
                }
            }
        }

        minsecbutton.setOnClickListener {
            if(tState!=TimerState.WORKING) {
                var t = sectextview.text.toString().toInt()
                if (t != 0) {
                    t -= 1
                    sectextview.text = t.toString()
                } else {
                    sectextview.text = "9"
                }
            }
        }

        resetbutton.setOnClickListener {
            if(tState!=TimerState.WORKING) {
                 tenmintextview.text = "0"
                 mintextview.text = "0"
                 tensectextview.text = "0"
                 sectextview.text = "0"
             }
        }

        fun toast(message: CharSequence) =
            Toast.makeText(this, message, Toast.LENGTH_SHORT).show()

        startbutton.setOnClickListener {
            tenmintextview.text = "3"
            /*if(tState!=TimerState.WORKING) {
                tState=TimerState.WORKING

                /*miliTime = (sectextview.text.toString().toInt() +
                        tensectextview.text.toString().toInt() * 10 +
                        mintextview.text.toString().toInt() * 60 +
                        tenmintextview.text.toString().toInt() * 600) * 1000*/
                miliTime=1000

                cTimer = object : CountDownTimer(miliTime.toLong(), 1000) {

                    override fun onTick(millisUntilFinished: Long) {
                        MinOneSec()
                    }

                    override fun onFinish() {
                        tenmintextview.text = "0"
                        mintextview.text = "0"
                        tensectextview.text = "0"
                        sectextview.text = "0"

                        tState = TimerState.NEW
                        toast("Time's up!")
                    }
                }
                cTimer?.start()
            }*/



        }

        /*stopbutton.setOnClickListener() {
            /*//if(tState==TimerState.WORKING){
                cTimer?.cancel()
                /*miliTime = ((sectextview.text.toString().toInt() +
                        tensectextview.text.toString().toInt() * 10 +
                        mintextview.text.toString().toInt() * 60 +
                        tenmintextview.text.toString().toInt() * 600) * 1000)*/
                miliTime=1000
                tState=TimerState.STOPPED
            //}*/

            /*if(tState!=TimerState.WORKING) {
                tenmintextview.text = "0"
                mintextview.text = "0"
                tensectextview.text = "0"
                sectextview.text = "0"
            }*/
        }*/



    }
}
