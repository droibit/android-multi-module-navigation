package com.example.android.navigations.module1

import android.net.Uri
import android.os.Bundle
import android.view.View
import android.widget.Button
import androidx.fragment.app.Fragment
import androidx.navigation.NavOptions
import androidx.navigation.fragment.findNavController
import com.example.android.navigations.module1.ModuleFragment1Directions.Companion.toModuleFragment2

class ModuleFragment1 : Fragment(R.layout.fragment1) {

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        view.findViewById<Button>(R.id.nextScreenButton).setOnClickListener {
            findNavController().navigate(toModuleFragment2())
        }

        view.findViewById<Button>(R.id.module2Button).setOnClickListener {
            findNavController().navigate(Uri.parse("sample-app://module2/fragment1"))
//            findNavController().navigate(Uri.parse("sample-app://module2/fragment2"))
//            findNavController().navigate(
//                Uri.parse("sample-app://module2/fragment2"),
//                NavOptions.Builder()
//                    .setPopUpTo(R.id.nav_module1, inclusive = true)
//                    .build()
//            )
        }
    }
}