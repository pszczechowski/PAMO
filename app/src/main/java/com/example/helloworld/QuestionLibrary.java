package com.example.helloworld;

public class QuestionLibrary {
    private String[] Questions = {
            "Jakie objaw nie towarzyszy podczas zakażenia koronawirusem ?",
            "Jaka grupa wiekowa ludzi jest narażona najbardziej na śmierć ?",
            "W jakim kraju zaczeła sie Pandemia ?",
            "Czy noszenie maseczek ma sens ?",
            "W jakim województwie w Polsce jest najwięcej zarażonych",
            "Który kraj do tej pory ma najwięcej zgonów w ciągu doby?",
            "Koniec QUIZU twój wynik to"

    };


    private String[][] Choices = {
            {"Kaszel", "Gorączka", "Ból brzucha"},
            {"10-30", "30-50", "50+"},
            {"Polska", "Chiny", "Włochy"},
            {"Tak", "Nie", "Zależy czy jesteś chory czy nie"},
            {"Pomorskie", "Małopolskie", "Mazowieckie"},
            {"Włochy", "USA", "Hiszpania"},
            {"Włochy", "USA", "Hiszpania"}
    };



    private String[] CorrectAnswers = {"Ból brzucha", "50+", "Chiny", "Zależy czy jesteś chory czy nie", "Mazowieckie", "Włochy", "Włochy"};




    public String getQuestion(int a) {
        String question = Questions[a];
        return question;
    }


    public String getChoice1(int a) {
        String choice0 = Choices[a][0];
        return choice0;
    }


    public String getChoice2(int a) {
        String choice1 = Choices[a][1];
        return choice1;
    }

    public String getChoice3(int a) {
        String choice2 = Choices[a][2];
        return choice2;
    }

    public String getCorrectAnswer(int a) {
        String answer = CorrectAnswers[a];
        return answer;
    }

}

