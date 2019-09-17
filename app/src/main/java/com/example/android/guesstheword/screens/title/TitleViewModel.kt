package com.example.android.guesstheword.screens.title

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel

class TitleViewModel : ViewModel() {

    private val _playGame = MutableLiveData<Boolean>()
    val playGame: LiveData<Boolean>
        get() = _playGame

    init {
        _playGame.value = false
    }

    fun playGame() {
        _playGame.value = true
    }

    fun onPlayGameComplete() {
        _playGame.value = false
    }
}