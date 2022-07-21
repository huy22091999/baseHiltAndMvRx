
package com.example.demodaggermvrx

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ListView
import android.widget.TextView
import android.widget.Toast
import androidx.lifecycle.Observer
import com.example.demodaggermvrx.ext.user.UserAdapter
import com.example.demodaggermvrx.ext.user.UserViewModel
import com.example.demodaggermvrx.model.User
import dagger.android.AndroidInjection
import retrofit2.Call
import retrofit2.Callback
import retrofit2.Response
import javax.inject.Inject

class MainActivity : AppCompatActivity() {
    @Inject
    lateinit var viewModel: UserViewModel
    var list= mutableListOf<User>()
    lateinit var adapterU: UserAdapter
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        AndroidInjection.inject(this)
        var txt=findViewById<ListView>(R.id.txtresult)
        adapterU= UserAdapter(context = this,list)
        txt.adapter=adapterU
        viewModel.getUser()
        viewModel.user.observe(this, Observer {
            it.enqueue(object :Callback<List<User>>{
                override fun onResponse(call: Call<List<User>>, response: Response<List<User>>) {
                    list.addAll(response.body()!!)
                    adapterU.notifyDataSetChanged()
                }

                override fun onFailure(call: Call<List<User>>, t: Throwable) {
                    Toast.makeText(this@MainActivity,"Lỗi khi load dữ",Toast.LENGTH_SHORT).show()
                }

            })
        })


    }
}