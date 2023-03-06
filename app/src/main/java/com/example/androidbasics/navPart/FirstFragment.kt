package com.example.androidbasics.navPart

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import android.widget.TextView
import androidx.fragment.app.Fragment
import androidx.navigation.Navigation.findNavController
import androidx.navigation.findNavController
import com.example.androidbasics.R

class FirstFragment : Fragment() {

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        return inflater.inflate(R.layout.fragment_first, container, false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        val name = view.findViewById<TextView>(R.id.name_text)
        val number = view.findViewById<TextView>(R.id.number_text)
        val toSecondButton = view.findViewById<Button>(R.id.to_second_button)
        val toActivityButton = view.findViewById<Button>(R.id.first_to_activity_button)

        toActivityButton.setOnClickListener {
            //view.findNavController().navigate(R.id.first_to_main_activity)
            view.findNavController().navigate(R.id.action_global_mainActivity)
            //tanımlı aksiyon olmamasına rağmen geçiş sağlanır, global aksiyon ile.
        }

        toSecondButton.setOnClickListener {
            if(number.text.isEmpty()) number.text = "0"

            val student = Student(name.text.toString(), number.text.toString().toInt())
            val action = FirstFragmentDirections.firstToSecond(name.text.toString(), number.text.toString().toInt(), student)

            findNavController(view).navigate(action)
            //navController navHosta uygun yolu gösterir.
        }
    }
}
