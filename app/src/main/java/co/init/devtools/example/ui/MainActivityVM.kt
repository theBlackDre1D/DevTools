package co.init.devtools.example.ui

import androidx.lifecycle.ViewModel
import co.init.devtools.example.domain.GetCoinInfoUseCase
import dagger.hilt.android.lifecycle.HiltViewModel
import kotlinx.coroutines.flow.MutableStateFlow
import kotlinx.coroutines.flow.StateFlow
import javax.inject.Inject

@HiltViewModel
class MainActivityVM @Inject constructor(
    private val getCoinInfoUseCase: GetCoinInfoUseCase
) : ViewModel() {

    private val _state = MutableStateFlow(MainActivity.State())
    val state: StateFlow<MainActivity.State> get() = _state

    fun getCoinInfo() {

    }
}