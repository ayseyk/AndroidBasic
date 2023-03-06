package com.example.androidbasics.navPart

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import android.widget.TextView
import androidx.fragment.app.Fragment
import androidx.navigation.findNavController
import androidx.navigation.fragment.navArgs
import com.example.androidbasics.R

class SecondFragment : Fragment() {

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        return inflater.inflate(R.layout.fragment_second, container, false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        val button = view.findViewById<Button>(R.id.to_activity_button)
        val receivedText = view.findViewById<TextView>(R.id.received_text)

        val name = navArgs<SecondFragmentArgs>().value.name
        var number = navArgs<SecondFragmentArgs>().value.number
        val student = navArgs<SecondFragmentArgs>().value.student

        receivedText.text = resources.getString((R.string.second_fragment_received_text), name, number)
        //receivedText.text = resources.getString((R.string.second_fragment_received_text), student.name, student.number)

        button.setOnClickListener {
            view.findNavController().navigate(R.id.second_to_main_activity)
            //view.findNavController().navigate(R.id.action_global_mainActivity)
        }

        /** Fragment içinden shared preferences' a erişim
         * val preferences = this.requireActivity().getSharedPreferences("atmoswareApp", Context.MODE_PRIVATE)
         */
    }
}
