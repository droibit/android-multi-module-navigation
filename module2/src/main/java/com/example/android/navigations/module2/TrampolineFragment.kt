package com.example.android.navigations.module2

import android.os.Bundle
import android.util.Log
import androidx.fragment.app.Fragment
import androidx.navigation.fragment.findNavController

class TrampolineFragment : Fragment() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        Log.d("DEBUG", "args=$arguments")

        val args = requireArguments()
        when (val id = requireNotNull(args.getString("id"))) {
            "fragment1" -> {
                findNavController().navigate(
                    TrampolineFragmentDirections.toFragment1()
                )
            }
            "fragment2" -> {
                findNavController().navigate(
                    TrampolineFragmentDirections.toFragment2()
                )
            }
        }
    }

    override fun onDestroy() {
        super.onDestroy()
        Log.d("DEBUG", "TrampolineFragment#onDestroy()")
    }
}