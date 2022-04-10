package com.whysjfi.stable

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.view.View
import android.widget.Button
import android.widget.Toast
import com.example.annotation_s.BindView
import com.whysjfi.annotation.EventBase
import com.whysjfi.annotation.InjectUtils
import com.whysjfi.annotation.OnClick
import com.whysjfi.annotation.OnLongClick

class MainActivity : AppCompatActivity() {

    @BindView(R.id.btn_test1)
    lateinit var btn1:Button
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        JettButterknife.bind(this)
        InjectUtils.inject(this)
        Log.d("whysjfi", "#############33 instance = " + btn1)
    }

    @OnClick(R.id.btn_test1,R.id.btn_test2)
    fun onClickBtn(view: View) {
        when(view.id) {
            R.id.btn_test1 -> {
                Log.d("whysjfi","hahhahaha 按下button1")
                showToast("单击 Button1")
            }
            R.id.btn_test2 -> {
                Log.d("whysjfi","hahhahaha 按下button2")
                showToast("单击 Button2")
            }
        }
    }

    @OnLongClick(R.id.btn_test2, R.id.btn_test1)
    fun onLongClickView(view: View) :Boolean {
        when(view.id) {
            R.id.btn_test1 -> {
                Log.d("whysjfi","hahhahaha 长按button1")
                showToast("长按Button1")
            }
            R.id.btn_test2 -> {
                Log.d("whysjfi","hahhahaha 长按下button2")
                showToast("长按Button2")
            }
        }
        return true
    }

    private fun showToast(str:String) {
        Toast.makeText(applicationContext, str, Toast.LENGTH_SHORT).show()
    }
}