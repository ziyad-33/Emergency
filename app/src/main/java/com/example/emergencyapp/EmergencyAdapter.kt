package com.example.emergencyapp

import android.app.Activity
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView

class EmergencyAdapter(val  activity : Activity, val emergencies : ArrayList<Emergency>) :
        RecyclerView.Adapter<EmergencyAdapter.MVH>(){


    class MVH(view: View): RecyclerView.ViewHolder{



            }
    override fun onCreateViewHolder(
        parent: ViewGroup,
        viewType: Int
    ): Emergency.MVH {
        TODO("Not yet implemented")
    }

    override fun onBindViewHolder(holder: Emergency.MVH, position: Int) {
        TODO("Not yet implemented")
    }

    override fun getItemCount(): Int {
        TODO("Not yet implemented")
    }


}
