package com.example.whereapp.ui.apphome.viewModel.profile

import androidx.lifecycle.ViewModel
import java.util.Locale

import kotlinx.coroutines.flow.MutableStateFlow
import kotlinx.coroutines.flow.asStateFlow

class LanguageViewModel : ViewModel() {
    private val _languageState = MutableStateFlow(Locale.getDefault())
    val languageState = _languageState.asStateFlow()

    fun toggleLanguage() {
        _languageState.value = if (_languageState.value.language == "es") {
            Locale("en")
        } else {
            Locale("es")
        }
    }
}
