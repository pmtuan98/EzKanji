package com.illidant.easykanzicapstone.platform.api

object ApiConstant {
    const val BASE_URL = "http://104.155.187.140:8081/api/"
    const val URL_LOGIN = "auth/signin"
    const val URL_REGISTER = "auth/signup"
    const val URL_RESET_PASSWORD = "auth/users/reset-password"
    const val URL_CHANGE_PASSWORD = "auth/users/change-password"
    const val URL_FORGOT_PASSWORD = "auth/users/forgot-password"
    const val URL_GET_ALL_LEVELS = "v1/levels"
    const val URL_GET_KANJI_BY_LESSON_ID = "v1/lessons/{id}/kanjis"
    const val URL_GET_LESSON_BY_LEVEL_ID = "v1/level/{id}/lessons"
    const val URL_GET_KANJI_BY_ID = "v1/kanjis/{id}"
    const val URL_GET_VOCAB_BY_KANJI_ID = "v1/kanji/{id}/vocabs"
    const val URL_GET_VOCAB_BY_LESSON_ID = "v1/lesson/{id}/vocabs"
    const val URL_GET_QUIZ_BY_LESSON_ID = "v1/lesson/{id}/quizzesMultiple"
    const val URL_GET_QUIZ_BY_LEVEL_ID = "v1/level/{id}/quizzesMultiple"
    const val URL_TEST_RESULT = "v1/test/save_result"
    const val URL_SEARCH = "v1/search"
    const val URL_TEST_HISTORY = "v1/test/{id1}/users/{id2}/levels"
    const val URL_TEST_RANKING = "v1/level/{id}/rankings"

    const val READ_TIMEOUT: Long = 60
    const val CONNECTION_TIMEOUT: Long = 60
}
