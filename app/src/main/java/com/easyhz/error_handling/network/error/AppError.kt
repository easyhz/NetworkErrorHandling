package com.easyhz.error_handling.network.error

import android.util.Log

sealed class AppError: Throwable() {
    data object UnexpectedError: AppError() {
        override fun printStackTrace() {
            Log.e("AppError", "예상치 못한 에러가 발생했습니다.")
        }
        override val message: String = "예상치 못한 에러가 발생했습니다."
    }
    data object NetworkError: AppError() {
        override fun printStackTrace() {
            Log.e("AppError", "네트워크 오류가 발생했습니다.")
        }
    }
}