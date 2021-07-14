package com.gurus.expandablerecyclerview

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.iamkamrul.expandablerecyclerviewlist.listener.ExpandCollapseListener
import com.iamkamrul.expandablerecyclerviewlistsample.adapter.CategoryAdapter
import com.iamkamrul.expandablerecyclerviewlistsample.model.Category
import com.iamkamrul.expandablerecyclerviewlistsample.model.CategoryList

class MainActivity : AppCompatActivity() {
    private val adapter = CategoryAdapter()
    lateinit var recyclerView: RecyclerView
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        recyclerView = findViewById(R.id.categoryListRv)
        val data = listOf(
            Category(
                "Action",
                listOf(CategoryList("My Spy"), CategoryList("BloodShot"), CategoryList("Midway"))
            ),
            Category(
                "Drama",
                listOf(CategoryList("The Godfather"), CategoryList("The Dark Knight"))
            ),
            Category(
                "War",
                listOf(CategoryList("Apocalypse Now"), CategoryList("Saving Private Ryan"))
            )
        )


        recyclerView.setHasFixedSize(true)
        recyclerView.layoutManager = LinearLayoutManager(this)
        adapter.setExpandCollapseListener(object : ExpandCollapseListener {
            override fun onListItemExpanded(position: Int) {
            }

            override fun onListItemCollapsed(position: Int) {

            }

        })
        recyclerView.adapter = adapter
        adapter.setExpandableParentItemList(data)
    }
}