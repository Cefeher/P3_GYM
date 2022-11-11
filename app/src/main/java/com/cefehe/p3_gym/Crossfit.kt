package com.cefehe.p3_gym

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.drawerlayout.widget.DrawerLayout
import androidx.navigation.fragment.NavHostFragment
import androidx.navigation.ui.AppBarConfiguration
import androidx.navigation.ui.NavigationUI
import com.cefehe.p3_gym.databinding.ActivityCrossfitBinding
import com.google.android.material.bottomnavigation.BottomNavigationView
import com.google.android.material.navigation.NavigationView

class Crossfit : AppCompatActivity() {
    private lateinit var binding: ActivityCrossfitBinding
    private lateinit var appBarConfiguration: AppBarConfiguration

    override fun onCreate(savedInstanceState: Bundle?) {
        setTheme(R.style.Theme_P3_GYM)
        super.onCreate(savedInstanceState)
        setContentView(ActivityCrossfitBinding.inflate(layoutInflater).also { binding = it }
            .root)

        setSupportActionBar(binding.toolbar)

        val drawerLayout: DrawerLayout = binding.drawerLayout
        val navView: NavigationView = binding.navView
        val navViewBottom = binding.bottomNavigation

        val navHosFragment = supportFragmentManager.findFragmentById(R.id.nav_host_fragment) as NavHostFragment
        val navController = navHosFragment.navController

        appBarConfiguration = AppBarConfiguration(setOf(
            //Top-level destinations
            R.id.crossfit1Fragment,
            R.id.crossfit2Fragment,
            R.id.crossfit3Fragment,
            R.id.haltero,
            R.id.gimnasticos,
            R.id.endurance,
            ),
            drawerLayout
        )

        NavigationUI.setupWithNavController(navView, navController)
        NavigationUI.setupWithNavController(navViewBottom, navController)
        NavigationUI.setupWithNavController(binding.toolbar, navController, appBarConfiguration)
        supportActionBar?.title = "WHAT'S CROSSFIT";

    }
}