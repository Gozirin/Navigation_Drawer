package com.example.navigation_draewer_app.ui.communication

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel

class CommunicationViewModel : ViewModel() {

    private val _text = MutableLiveData<String>().apply {
        value = "This is communication Fragment"
    }
    val text: LiveData<String> = _text
}

