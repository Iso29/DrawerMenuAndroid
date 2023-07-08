package com.islamzadais.bottomnavtest

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import androidx.appcompat.app.ActionBarDrawerToggle
import androidx.core.view.GravityCompat
import androidx.navigation.fragment.NavHostFragment
import androidx.navigation.ui.NavigationUI
import com.islamzadais.bottomnavtest.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    private lateinit var binding: ActivityMainBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

//        val navHostFragment = supportFragmentManager.findFragmentById(R.id.fragmentContainerView) as NavHostFragment
//        NavigationUI.setupWithNavController(binding.bottomNavigationView,navHostFragment.navController)

        setSupportActionBar(binding.toolBar)
        binding.drawerNavView.bringToFront()
        val toggle = ActionBarDrawerToggle(this,binding.drawer,binding.toolBar,R.string.open_drawer,R.string.close_drawer)
        binding.drawer.addDrawerListener(toggle)
        toggle.syncState()
//        binding.drawerNavView.setNavigationItemSelectedListener {
//            if(it)
//        }

    }

    override fun onBackPressed() {
        if(binding.drawer.isDrawerOpen(GravityCompat.START)){
            binding.drawer.closeDrawer(GravityCompat.START)
        }else{
            super.onBackPressed()
        }
    }
}