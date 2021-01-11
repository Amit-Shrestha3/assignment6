package com.amit.softuser.adapter

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.EditText
import android.widget.ImageView
import androidx.recyclerview.widget.RecyclerView
import com.amit.softuser.R
import com.amit.softuser.model.User

class StudentAdapter(val studentList : List<User>) : RecyclerView.Adapter<StudentAdapter.StudentViewHolder>() {


    class StudentViewHolder(itemView:View) : RecyclerView.ViewHolder(itemView) {
        val profile : ImageView
        val del : ImageView
        val username : EditText
        val age : EditText
        val address : EditText
        val gender : EditText

        init {
            profile =itemView.findViewById(R.id.profile)
            del =itemView.findViewById(R.id.delete)
            username =itemView.findViewById(R.id.username)
            age =itemView.findViewById(R.id.age)
            address =itemView.findViewById(R.id.address)
            gender =itemView.findViewById(R.id.gender)
        }
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): StudentViewHolder {
        val view : View
        view = LayoutInflater.from(parent.context).inflate(R.layout.student_item_layout, parent, false)

        return StudentViewHolder(view)
    }

    override fun onBindViewHolder(holder: StudentViewHolder, position: Int) {
        val getPosition = studentList[position]
    }

    override fun getItemCount(): Int {
        return studentList.size
    }
}