package com.amit.softuser.fragments


import android.os.Bundle
import android.text.TextUtils
import android.util.Log
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.EditText
import android.widget.RadioButton
import android.widget.RadioGroup
import androidx.fragment.app.Fragment
import com.amit.softuser.R
import com.google.android.material.button.MaterialButton


class AddFragment : Fragment() {
    private val TAG : String = "Add Student"

    private lateinit var fullname : EditText
    private lateinit var agetxt : EditText
    private lateinit var male : RadioButton
    private lateinit var female : RadioButton
    private lateinit var others : RadioButton
    private lateinit var rdg : RadioGroup
    private lateinit var address : EditText
    private lateinit var add : MaterialButton




    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        val view =inflater.inflate(R.layout.fragment_add,container,false)
        return  view
    }


    override fun onActivityCreated(savedInstanceState: Bundle?) {
        super.onActivityCreated(savedInstanceState)
        fullname = view!!.findViewById(R.id.fullname)
        agetxt = view!!.findViewById(R.id.age)
        male = view!!.findViewById(R.id.rdoMale)
        female = view!!.findViewById(R.id.rdoFemale)
        others = view!!.findViewById(R.id.rdoOther)
        rdg = view!!.findViewById(R.id.radio)
        address = view!!.findViewById(R.id.address)
        add = view!!.findViewById(R.id.studentadd)


        add.setOnClickListener(){
            getData(fullname,agetxt,address)
        }

    }

    private fun getData(fullname: EditText?, age: EditText?, address: EditText?) {
        val fullName :String = fullname?.text.toString()
        val ageS :String = agetxt.text.toString()
        val Address :String = address?.text.toString()


         if (TextUtils.isEmpty(fullName)){
             fullname?.setError("Please enter the name")
             fullname?.requestFocus()
         }
            else if (TextUtils.isEmpty(ageS)){
            agetxt.setError("Please enter the age")
            agetxt.requestFocus()

        }

            else if (TextUtils.isEmpty(Address)){
            address?.setError("Please enter the address")
            address?.requestFocus()

        }

        else {
             Log.d(TAG, "getData: "+
                    "Full Name: "+fullName+
                    "Age: "+ageS+
                    "Address: "+Address)
         }

    }
}