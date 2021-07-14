package com.gurus.expandablerecyclerview

import com.iamkamrul.expandablerecyclerviewlist.model.ParentListItem


data class ParentWrapper(var isExpanded:Boolean=false,
                         var parentListItem: ParentListItem,
                         var isInitiallyExpanded: Boolean = parentListItem.isInitiallyExpanded(),
                         var childListItem: List<*> = parentListItem.getChildItemList())