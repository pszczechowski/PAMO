package com.example.helloworld

class QuestionLibrary {
    private val Questions = arrayOf(
            "Jakie objaw nie towarzyszy podczas zakażenia koronawirusem ?",
            "Jaka grupa wiekowa ludzi jest narażona najbardziej na śmierć ?",
            "W jakim kraju zaczeła sie Pandemia ?",
            "Czy noszenie maseczek ma sens ?",
            "W jakim województwie w Polsce jest najwięcej zarażonych",
            "Który kraj do tej pory ma najwięcej zgonów w ciągu doby?")
    private val Choices = arrayOf(arrayOf("Kaszel", "Gorączka", "Ból brzucha"), arrayOf("10-30", "30-50", "50+"), arrayOf("Polska", "Chiny", "Włochy"), arrayOf("Tak", "Nie", "Zależy czy jesteś chory czy nie"), arrayOf("Pomorskie", "Małopolskie", "Mazowieckie"), arrayOf("Włochy", "USA", "Hiszpania"))
    private val CorrectAnswers = arrayOf("Ból brzucha", "50+", "Chiny", "Zależy czy jesteś chory czy nie", "Mazowieckie", "Włochy")
    fun getQuestion(a: Int): String {
        return Questions[a]
    }

    fun getChoice1(a: Int): String {
        return Choices[a][0]
    }

    fun getChoice2(a: Int): String {
        return Choices[a][1]
    }

    fun getChoice3(a: Int): String {
        return Choices[a][2]
    }

    fun getCorrectAnswer(a: Int): String {
        return CorrectAnswers[a]
    }
}