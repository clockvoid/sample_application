package jp.co.clockvoid.sample_application

import android.os.Bundle
import android.util.Log
import android.view.View
import androidx.fragment.app.Fragment
import androidx.fragment.app.FragmentManager
import androidx.fragment.app.FragmentTransaction
import androidx.navigation.fragment.findNavController
import kotlinx.android.synthetic.main.fragment_start.*

class StartFragment : Fragment(R.layout.fragment_start) {

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        Log.d("startfragment", "onviewcreated")

        button_to_fragment_1.setOnClickListener {
            val transaction = parentFragmentManager.beginTransaction()
            val fragment = OneFragment()
            transaction.replace(R.id.navHostFragment, fragment)
            transaction.addToBackStack(null)
            transaction.commit()
        }

        button_to_fragment_2.setOnClickListener {
            val transaction = parentFragmentManager.beginTransaction()
            val fragment = TwoFragment()
            transaction.replace(R.id.navHostFragment, fragment)
            transaction.addToBackStack(null)
            transaction.commit()
        }
    }
}
