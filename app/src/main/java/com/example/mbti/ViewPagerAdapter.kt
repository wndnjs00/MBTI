package com.example.mbti

import androidx.fragment.app.Fragment
import androidx.fragment.app.FragmentActivity
import androidx.viewpager2.adapter.FragmentStateAdapter

class ViewPagerAdapter(fragmentActivity : FragmentActivity) : FragmentStateAdapter (fragmentActivity){

    // 질문지 개수 리턴        // override fun getItemCount(): Int = 4 이렇게도 사용가능
    override fun getItemCount(): Int {
        return 4
    }


    override fun createFragment(position: Int): Fragment {
        return QuestionFragment.newInstance(position)
    }
}