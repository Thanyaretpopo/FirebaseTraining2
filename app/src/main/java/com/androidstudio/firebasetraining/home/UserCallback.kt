package com.androidstudio.firebasetraining.home


import com.androidstudio.firebasetraining.home.model.UserListModel

interface UserCallback {
    fun onSelectItem(userListModel: UserListModel?)
    fun onSelectItemLongClick(userListModel: UserListModel?)
}