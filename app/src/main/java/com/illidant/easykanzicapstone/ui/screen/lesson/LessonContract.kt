package com.illidant.easykanzicapstone.ui.screen.lesson

import com.illidant.easykanzicapstone.domain.model.Lesson

interface LessonContract {
    interface View {
        fun getLesson(listLesson: List<Lesson>)
    }

    interface Presenter {
        fun lessonRequest(id: Int)
    }
}