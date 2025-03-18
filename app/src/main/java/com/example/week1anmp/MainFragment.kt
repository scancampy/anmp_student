package com.example.week1anmp

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.navigation.Navigation
import com.example.week1anmp.databinding.FragmentMainBinding

class MainFragment : Fragment() {
    private lateinit var binding:FragmentMainBinding

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        binding = FragmentMainBinding.inflate(inflater,container,
            false)
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        binding.btnStart.setOnClickListener {
            val action = MainFragmentDirections.actionGameFragment(
                binding.txtName.text.toString())
            Navigation.findNavController(it).navigate(action)
        }

        binding.btnOption.setOnClickListener {
            val action = MainFragmentDirections.actionOptionFragment()
            Navigation.findNavController(it).navigate(action)
        }
    }
}