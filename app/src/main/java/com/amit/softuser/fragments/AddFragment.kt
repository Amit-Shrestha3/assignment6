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
import android.widget.Toast
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
    private lateinit var Imgurl: EditText

    private lateinit var gender :String


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
        Imgurl = view!!.findViewById(R.id.Imgurl)


        male.setOnClickListener(){
            gender="Male"
        }
        female.setOnClickListener(){
            gender="Female"
        }
        others.setOnClickListener(){
            gender="Others"
        }
        add.setOnClickListener(){
            getData(fullname,agetxt,address,gender, Imgurl)
        }

    }

    private fun getData(fullname: EditText?, agetxt: EditText?, address: EditText?, gender: String, Imgurl: EditText) {
        val fullName :String = fullname?.text.toString()
        val ageS :String = agetxt?.text.toString()
        val Address :String = address?.text.toString()
        val gen :String = gender
        val url :String = Imgurl.text.toString()


         if (TextUtils.isEmpty(fullName)){
             fullname?.setError("Please enter the name")
             fullname?.requestFocus()
         }
            else if (TextUtils.isEmpty(ageS)){
            agetxt?.setError("Please enter the age")
            agetxt?.requestFocus()

        }

            else if (TextUtils.isEmpty(Address)){
            address?.setError("Please enter the address")
            address?.requestFocus()

        }
        else if (TextUtils.isEmpty(url)){
            Imgurl.setError("Please enter the address")
            Imgurl.requestFocus()

        }
        else if (gen.isEmpty()){
            Toast.makeText(context,"Enter your gender",Toast.LENGTH_SHORT).show()

         }

        else {
             Log.d(TAG, "getData: "+
                    "Full Name: "+fullName+
                    "Age: "+ ageS+
                    "Address: "+ Address+
                    "Gender: "+ gender
                    )
         }

    }
}