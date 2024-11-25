package kr.ac.kumoh.ce.s20240000.mys24w13lazylist.viewmodel

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import kr.ac.kumoh.ce.s20240000.mys24w13lazylist.model.Song

class SongViewModel : ViewModel() {
    private val _songs = MutableLiveData<List<Song>>()
    val songs: LiveData<List<Song>>
        get() = _songs

    fun add(song: Song) {
        val newList = listOf(*_songs.value?.toTypedArray() ?: arrayOf(), song)
        _songs.value = newList
    }
}