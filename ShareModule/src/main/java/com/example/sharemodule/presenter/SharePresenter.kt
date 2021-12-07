package com.example.sharemodule.presenter

import com.example.sharemodule.data.interactor.ShareInteractor
import kotlinx.coroutines.CoroutineScope
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.SupervisorJob
import kotlinx.coroutines.launch
import kotlin.coroutines.CoroutineContext

class SharePresenter(private val shareInteractor: ShareInteractor): CoroutineScope {

    override val coroutineContext: CoroutineContext
        get() = Dispatchers.IO + SupervisorJob()

    fun getUserProducts() {
        launch {
            val productsUsers = launch {
                val products = shareInteractor.getProducts()
                val users = shareInteractor.getPartyMembers()
            }
        }
    }
}