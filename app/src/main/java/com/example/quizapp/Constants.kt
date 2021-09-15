package com.example.quizapp

object Constants{
    fun getQuestions():ArrayList<Question>{
        val questionsList = ArrayList<Question>()
        val que1 = Question(1, "What country this flag belong to?",
            R.drawable.ic_flag_of_brazil, "Argentina", "Brasil", "Armenia","Pingas",
            2)
        questionsList.add(que1)

        val que2 = Question(2, "What country this flag belong to?",
            R.drawable.ic_flag_of_argentina, "Argentina", "Brasil", "Armenia","Pingas",
            1)
        questionsList.add(que2)

        val que3 = Question(3, "What country this flag belong to?",
            R.drawable.ic_flag_of_belgium, "Argentina", "Brasil", "Belgium","Pingas",
            3)
        questionsList.add(que3)

        val que4 = Question(4, "What country this flag belong to?",
            R.drawable.ic_flag_of_india, "Argentina", "Brasil", "Armenia","India",
            4)
        questionsList.add(que4)


        return questionsList
    }
}