package com.amit.softuser.adapter

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.amit.softuser.R
import com.amit.softuser.model.Storage
import com.amit.softuser.model.User
import com.bumptech.glide.Glide

class StudentAdapter(
    val context: Context?,
    val studentList: List<User>) : RecyclerView.Adapter<StudentAdapter.StudentViewHolder>() {



    class StudentViewHolder(itemView:View) : RecyclerView.ViewHolder(itemView) {
        val profile : ImageView
        val del : ImageView
        val username : TextView
        val age : TextView
        val address : TextView
        val gender : TextView

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

        holder.username.setText(getPosition.name)
        holder.age.setText(getPosition.age)
        holder.gender.setText(getPosition.gender)
        holder.address.setText(getPosition.address)

        if (context != null) {
            Glide.with(context).load(getPosition.url).into(holder.profile)
        }

        holder.del.setOnClickListener(){
            val removeStudent = Storage()
            removeStudent.deleteStudent(getPosition)
            notifyItemRemoved(position)
            notifyDataSetChanged()
        }
    }

    override fun getItemCount(): Int {
        return studentList.size
    }
}