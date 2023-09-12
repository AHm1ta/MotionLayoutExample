package com.example.uitestapp

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.FragmentTransaction
import com.example.uitestapp.databinding.FragmentMainBinding
import com.example.uitestapp.databinding.FragmentSecondBinding

class SecondFragment : Fragment(R.layout.fragment_second) {

    private lateinit var binding: FragmentSecondBinding

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        binding = FragmentSecondBinding.bind(view)

        binding.thirdPage.setOnClickListener {
            val thirdFragment = ThirdFragment.newInstance()
            val transaction: FragmentTransaction =
                requireActivity().supportFragmentManager.beginTransaction()
            transaction.replace(R.id.main_container, thirdFragment)
            transaction.addToBackStack(null)
            transaction.commit()
        }

    }

    companion object {

        @JvmStatic
        fun newInstance() = SecondFragment()
    }
}