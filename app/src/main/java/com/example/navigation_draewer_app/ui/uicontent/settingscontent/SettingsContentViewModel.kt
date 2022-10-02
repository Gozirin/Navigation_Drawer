package com.example.navigation_draewer_app.ui.uicontent.settingscontent

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel

class SettingsContentViewModel : ViewModel() {

    private val _text = MutableLiveData<String>().apply {
        value = "This is Setting Content Fragment"
    }
    val text: LiveData<String> = _text
}
