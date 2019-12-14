package com.androidstudio.firebasetraining.home.presenter


import com.androidstudio.firebasetraining.common.BaseView
import com.androidstudio.firebasetraining.home.model.UserListModel
import com.androidstudio.firebasetraining.home.model.UserModel

class UserContract {
    interface Presenter {

        fun addDefaultEmail()

        fun loadDataFormFirebase()

        fun removeItemMember(userId: String)
    }

    interface View : BaseView {

        fun updateData(model: UserModel)

        fun updateList(model: List<UserListModel>)

    }
}