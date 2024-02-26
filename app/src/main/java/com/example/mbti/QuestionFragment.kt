package com.example.mbti

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment

class QuestionFragment : Fragment() {


    private var questionType : Int = 0

    // 리스트를 만들어서 여기다 데이터를 넣어줌 (이렇게하면 리스트에서 해당 번호만 주면 가져올수있음 (0,1,2,3번))
    private val questionTitle = listOf(
        // 유형 (외향형-내향형)
        R.string.question1_title,
        R.string.question2_title,
        R.string.question3_title,
        R.string.question4_title
    )


    private val questionText = listOf(
        // 질문
        // 질문은 첫번째에 3개, 2번쨰에 3개,, 이런식으로 있어서 리스트에 리스트를 또 넣어줘야함
        listOf(R.string.question1_1, R.string.question1_2, R.string.question1_3) ,   // 1번에 대한 3개의 질문
        listOf(R.string.question2_1, R.string.question2_2, R.string.question2_3),
        listOf(R.string.question3_1, R.string.question3_2, R.string.question3_3),
        listOf(R.string.question4_1, R.string.question4_2, R.string.question4_3),
    )


    private val questionAnswers = listOf(
        // 질문1에 대한 답변
        listOf(
            listOf(R.string.question1_1_answer1, R.string.question1_1_answer2),
            listOf(R.string.question1_2_answer1, R.string.question1_2_answer2),
            listOf(R.string.question1_3_answer1, R.string.question1_3_answer2)
        ),
        // 질문2에 대한 답변
        listOf(
            listOf(R.string.question2_1_answer1, R.string.question2_1_answer2),
            listOf(R.string.question2_2_answer1, R.string.question2_2_answer2),
            listOf(R.string.question2_3_answer1, R.string.question2_3_answer2)
        ),
        // 질문3에 대한 답변
        listOf(
            listOf(R.string.question3_1_answer1, R.string.question3_1_answer2),
            listOf(R.string.question3_2_answer1, R.string.question3_2_answer2),
            listOf(R.string.question3_3_answer1, R.string.question3_3_answer2)
        ),
        // 질문4에 대한 답변
        listOf(
            listOf(R.string.question4_1_answer1, R.string.question4_1_answer2),
            listOf(R.string.question4_2_answer1, R.string.question4_2_answer2),
            listOf(R.string.question4_3_answer1, R.string.question4_3_answer2)
        )
    )


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        arguments?.let{
            // 몇번쨰 화면인지를  questionType변수로 선언
            questionType = it.getInt(ARG_QUESTION_TYPE)
        }
    }


    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?
    ): View? {

        val


    }





    companion object{

        // 새로운 페이지 번호 받기
        private const val ARG_QUESTION_TYPE = "questionType"

        // 넘기는 페이지 번호 받아옴
        fun newInstance(questionType : Int) : QuestionFragment{
            val fragment = QuestionFragment()
            val args = Bundle()     // 데이터 받아오는 변수

            // 새로운 페이지의 페이지 번호를 전달
            args.putInt(ARG_QUESTION_TYPE, questionType)
            // 두번쨰페이지 데이터를 가짐
            fragment.arguments = args
            return fragment
        }
    }
}