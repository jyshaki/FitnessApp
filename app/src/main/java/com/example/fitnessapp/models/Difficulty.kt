package com.example.fitnessapp.models

enum class Difficulty {
    BEGINNER {
             override fun getTranslatedName(): String {
                return "POCZĄTKUJĄCY"
             }
             },
    ADVANCED{
        override fun getTranslatedName(): String {
            return "ZAAWANSOWANY"
        }
    };
    abstract fun getTranslatedName(): String
}