package com.amit.softuser.fragments


import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.amit.softuser.R
import com.amit.softuser.adapter.StudentAdapter
import com.amit.softuser.model.Storage
import com.amit.softuser.model.User
import java.util.ArrayList


class HomeFragment : Fragment() {
private lateinit var  studentRecyclerView : RecyclerView
private var storage =  Storage()


    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        val view =inflater.inflate(R.layout.fragment_home,container,false)
        return  view
    }


    override fun onActivityCreated(savedInstanceState: Bundle?) {

        super.onActivityCreated(savedInstanceState)

        studentRecyclerView= view!!.findViewById(R.id.studentRecyclerView)
        studentRecyclerView.layoutManager = LinearLayoutManager(context)

        getData()
    }

    private fun getData(){
        val arr = storage.returnStudent()

        val adapter = StudentAdapter(context, arr)
        studentRecyclerView.adapter = adapter
    }
}