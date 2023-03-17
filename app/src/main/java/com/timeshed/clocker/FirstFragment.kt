package com.timeshed.clocker

import android.os.Bundle
import android.text.Editable
import android.text.TextWatcher
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.EditText
import androidx.navigation.fragment.findNavController
import com.timeshed.clocker.databinding.FragmentFirstBinding

/**
 * A simple [Fragment] subclass as the default destination in the navigation.
 */
class FirstFragment : Fragment() {
 //test3
private var _binding: FragmentFirstBinding? = null
    // This property is only valid between onCreateView and
    // onDestroyView.
    private val binding get() = _binding!!

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {

      _binding = FragmentFirstBinding.inflate(inflater, container, false)
      return binding.root

    }





    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        val EditTextPIN  = view.findViewById<EditText>(R.id.EditTextPIN) as EditText
        EditTextPIN .addTextChangedListener(object : TextWatcher {

            override fun afterTextChanged(s: Editable) {}

            override fun beforeTextChanged(s: CharSequence, start: Int,
                                           count: Int, after: Int) {
            }

            override fun onTextChanged(s: CharSequence, start: Int,
                                       before: Int, count: Int) {

                if (EditTextPIN.text.length >3) {

                }//end if
                }
        })





        binding.buttonFirst.setOnClickListener {
            findNavController().navigate(R.id.action_FirstFragment_to_SecondFragment)
        }


        binding.oneBtn.setOnClickListener {


            val currentVal = EditTextPIN.text.toString()
            EditTextPIN .setText(currentVal + "1")
        }


        binding.twoBtn.setOnClickListener {


            val currentVal = EditTextPIN.text.toString()

            EditTextPIN.setText(currentVal + "2")
        }


        binding.threeBtn.setOnClickListener {


            val currentVal = EditTextPIN.text.toString()

            EditTextPIN.setText(currentVal + "3")
        }


        binding.fourBtn.setOnClickListener {


            val currentVal = EditTextPIN.text.toString()

            EditTextPIN.setText(currentVal + "4")
        }

        binding.fiveBtn.setOnClickListener {


            val currentVal = EditTextPIN.text.toString()

            EditTextPIN.setText(currentVal + "5")
        }


        binding.sixBtn.setOnClickListener {

            val currentVal = EditTextPIN.text.toString()

            EditTextPIN.setText(currentVal + "6")
        }


        binding.sevenBtn.setOnClickListener {


            val currentVal = EditTextPIN.text.toString()

            EditTextPIN.setText(currentVal + "7")
        }

        binding.eightBtn.setOnClickListener {


            val currentVal = EditTextPIN.text.toString()

            EditTextPIN.setText(currentVal + "8")
        }


        binding.nineBtn.setOnClickListener {


            val currentVal = EditTextPIN.text.toString()

            EditTextPIN.setText(currentVal + "9")
        }


        binding.zeroBtn.setOnClickListener {


            val currentVal = EditTextPIN.text.toString()

            EditTextPIN.setText(currentVal + "0")
        }//end binding

        binding.backBtn.setOnClickListener {

            val EditTextPIN = view.findViewById<EditText>(R.id.EditTextPIN) as EditText
            val currentVal = EditTextPIN.text.toString()




            if ((currentVal.length)>0)
            {
                EditTextPIN.setText(currentVal.substring(0, currentVal.length-1));
            }




        }//end binding




    }

override fun onDestroyView() {
        super.onDestroyView()
        _binding = null
    }
}