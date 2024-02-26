package com.example.mbti

import android.media.tv.AdResponse
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.viewpager2.widget.ViewPager2

class TestActivity : AppCompatActivity() {

    private lateinit var viewPager : ViewPager2

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_test)


        viewPager = findViewById(R.id.viewPager)

        // 뷰페이져와 어뎁터 연결
        viewPager.adapter = ViewPagerAdapter(this)

        // 화면 스와이프 막기
        viewPager.isUserInputEnabled = false

    }



    // 다음페이지로 넘기는 함수
    fun moveToNextQuesition(){

        // 현재페이지가 마지막 페이지인지 확인
        if(viewPager.currentItem == 3){

            // 마지막페이지로 이동

        }else{
            // 다음페이지로 이동
            // 다음페이지의 페이지 번호 받아오기
            val nextItem = viewPager.currentItem + 1

            if (nextItem < viewPager.adapter?.itemCount ?: 0){
                // 다음페이지로 넘김
                viewPager.setCurrentItem(nextItem, true)
            }
        }


    }




}

// 선택하고 다음버튼을 눌렀을때, 불려지는 데이터
class QuestionResults {

    // 질문지 응답저장하는 변수 (1번 저장(많은값 저장))
    val result = mutableListOf<Int>()

    // 1번,1번,2번 저장
    fun addResponses(response: List<Int>){

        // 1,1,2를 그룹으로 묶은 뒤, 각각의 개수를 세고 , 거기서 많은값을 가져오는데 그것의 key값
        // ex) mostFrequent = 1
        val mostFrequent = response.groupingBy { it }.eachCount().maxByOrNull { it.value }?.key

        // 이것을 result에 저장해줌
        mostFrequent?.let{
            result.add(it)
        }

    }

}