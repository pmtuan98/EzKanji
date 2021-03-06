package com.illidant.easykanzicapstone.platform.source


import com.illidant.easykanzicapstone.domain.model.Quiz
import retrofit2.Call

interface QuizDataSource {
    interface Remote {
        fun getQuizByLessonID(id: Int): Call<List<Quiz>>
        fun getQuizByLevelID(id: Int): Call<List<Quiz>>
    }
}