package com.example.criminal_intent

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.example.criminal_intent.databinding.FragmentCrimeDetailBinding
import java.util.UUID
import java.util.Date

private lateinit var binding: FragmentCrimeDetailBinding
private lateinit var crime:Crime


class CrimeDetailFragment : Fragment() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        crime = Crime(
            id = UUID.randomUUID(),
            title = "",
            date = Date(),
            isSolved = false
        )

    }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        binding =
            FragmentCrimeDetailBinding.inflate(inflater, container, false)
        return binding.root
    }

}