package com.gurus.expandablerecyclerview

interface ParentListItemExpandCollapseListener {
    fun onParentListItemExpanded(position:Int)
    fun onParentListItemCollapsed(position:Int)
}