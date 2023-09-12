package com.example.uitestapp

import android.os.Bundle
import android.view.View
import androidx.fragment.app.Fragment
import androidx.fragment.app.FragmentTransaction
import com.example.uitestapp.databinding.FragmentMainBinding


class MainFragment : Fragment(R.layout.fragment_main) {

    private lateinit var binding: FragmentMainBinding


    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        binding = FragmentMainBinding.bind(view)

        binding.secondPage.setOnClickListener {
            val secondFragment = SecondFragment.newInstance()
            val transaction: FragmentTransaction =
                requireActivity().supportFragmentManager.beginTransaction()
            transaction.replace(R.id.main_container, secondFragment)
            transaction.addToBackStack(null)
            transaction.commit()
        }

    }


    companion object {

        @JvmStatic
        fun newInstance() = MainFragment()
    }
}