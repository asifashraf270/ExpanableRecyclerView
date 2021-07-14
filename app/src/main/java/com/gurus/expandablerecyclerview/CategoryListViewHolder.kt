package com.iamkamrul.expandablerecyclerviewlistsample.viewholder

import android.view.View
import android.widget.ImageView
import android.widget.TextView
import com.gurus.expandablerecyclerview.ChildViewHolder
import com.gurus.expandablerecyclerview.R
import com.iamkamrul.expandablerecyclerviewlistsample.model.CategoryList

class CategoryListViewHolder(view: View) : ChildViewHolder(view) {
    fun bind(categoryList: CategoryList, position: Int) {
        itemView.findViewById<TextView>(R.id.nameTv).text = categoryList.name
        itemView.findViewById<ImageView>(R.id.imageView).setTag(position)
        itemView.findViewById<ImageView>(R.id.imageView).setOnClickListener(this)

    }
}