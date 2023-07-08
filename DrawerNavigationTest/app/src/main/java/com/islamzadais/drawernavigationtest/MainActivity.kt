package com.islamzadais.drawernavigationtest

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.MenuItem
import androidx.appcompat.app.ActionBarDrawerToggle
import androidx.core.view.GravityCompat
import androidx.navigation.Navigation
import androidx.navigation.fragment.NavHostFragment
import androidx.navigation.fragment.findNavController
import androidx.navigation.ui.NavigationUI
import com.google.android.material.navigation.NavigationView.OnNavigationItemSelectedListener
import com.islamzadais.drawernavigationtest.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    private lateinit var binding : ActivityMainBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)


        // first way
        val navHostFragment = supportFragmentManager.findFragmentById(R.id.fragmentContainerView) as NavHostFragment
        NavigationUI.setupWithNavController(binding.navigationView,navHostFragment.navController)

        setSupportActionBar(binding.toolbar)
        binding.navigationView.bringToFront()
        val toggle = ActionBarDrawerToggle(this,binding.drawerLayout,binding.toolbar,R.string.open_drawer,R.string.close_drawer)
        binding.drawerLayout.addDrawerListener(toggle)
        toggle.syncState()


        //second way
//        binding.navigationView.setNavigationItemSelectedListener(object : OnNavigationItemSelectedListener{
//            override fun onNavigationItemSelected(item: MenuItem): Boolean {
//                if(item == binding.navigationView.menu.findItem(R.id.firstFragment)){
//                    navHostFragment.findNavController().navigate(R.id.firstFragment)
//                    return true
//                }else if(item == binding.navigationView.menu.findItem(R.id.secondFragment)){
//                    navHostFragment.findNavController().navigate(R.id.secondFragment)
//                    return true
//                }
//                return true
//            }
//
//        })

    }

    override fun onBackPressed() {
        if(binding.drawerLayout.isDrawerOpen(GravityCompat.START)){
            binding.drawerLayout.closeDrawer(GravityCompat.START)
        }else{
            super.onBackPressed()
        }
    }
}