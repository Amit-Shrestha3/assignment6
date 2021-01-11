package com.amit.softuser

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.fragment.app.Fragment
import com.amit.softuser.fragments.AboutFragment
import com.amit.softuser.fragments.AddFragment
import com.amit.softuser.fragments.HomeFragment
import com.google.android.material.bottomnavigation.BottomNavigationView

class HomeActivity : AppCompatActivity() {
    private lateinit var nav : BottomNavigationView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_home)

        nav =findViewById(R.id.btmNav)

        if (savedInstanceState== null)
        {
            val fragment =HomeFragment()
            supportFragmentManager.beginTransaction().replace(R.id.container, fragment, fragment.javaClass.getSimpleName())
                .commit()
        }
        nav.setOnNavigationItemSelectedListener(selectedMenuItem)
    }

    private val selectedMenuItem = BottomNavigationView.OnNavigationItemSelectedListener { menuItem ->
        when (menuItem.itemId){
            R.id.home ->{
                val fragment =HomeFragment()
                supportFragmentManager.beginTransaction().replace(R.id.container, fragment, fragment.javaClass.getSimpleName())
                    .commit()
                return@OnNavigationItemSelectedListener true

            } R.id.addStd ->{
                val fragment =AddFragment()
                supportFragmentManager.beginTransaction().replace(R.id.container, fragment, fragment.javaClass.getSimpleName())
                    .commit()
                return@OnNavigationItemSelectedListener true

            } R.id.about ->{
                val fragment =AboutFragment()
                supportFragmentManager.beginTransaction().replace(R.id.container, fragment, fragment.javaClass.getSimpleName())
                    .commit()
                return@OnNavigationItemSelectedListener true

            }
        }
        false
    }
}