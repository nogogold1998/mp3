package com.bt.mp3.ui.mymusic

import androidx.hilt.lifecycle.ViewModelInject
import com.bt.base.ui.BaseViewModel
import com.bt.mp3.annotation.DefaultDispatcher
import kotlinx.coroutines.CoroutineDispatcher

class MyMusicViewModel @ViewModelInject constructor(
    @DefaultDispatcher private val defaultDispatcher: CoroutineDispatcher
) : BaseViewModel()
