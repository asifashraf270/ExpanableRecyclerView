package com.gurus.expandablerecyclerview

import android.util.Log
import android.view.View
import androidx.recyclerview.widget.RecyclerView

open class ChildViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView),
    View.OnClickListener {

    override fun onClick(v: View?) {
        when (v?.id) {
            R.id.imageView -> {
                var postion = v.getTag() as Int

                Log.e("response", "got click listener" + postion)
            }
        }
    }

}