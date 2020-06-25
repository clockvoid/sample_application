package jp.co.clockvoid.sample_application

import android.os.Bundle
import android.util.Log
import android.view.View
import androidx.fragment.app.Fragment
import androidx.navigation.fragment.findNavController
import kotlinx.android.synthetic.main.fragment_start.*

class StartFragment : Fragment(R.layout.fragment_start) {

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        Log.d("startfragment", "onviewcreated")

        button_to_fragment_1.setOnClickListener {
            val action = StartFragmentDirections.actionStartFragmentToOneFragment()
            findNavController().navigate(action)
        }

        button_to_fragment_2.setOnClickListener {
            val action = StartFragmentDirections.actionStartFragmentToTwoFragment()
            findNavController().navigate(action)
        }
    }
}
