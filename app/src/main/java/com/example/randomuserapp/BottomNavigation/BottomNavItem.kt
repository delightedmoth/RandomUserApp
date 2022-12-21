package com.example.randomuserapp.BottomNavigation

import com.example.randomuserapp.R

sealed class BottomNavItem(var title:String, var icon:Int, var screen_route:String){

    object Home : BottomNavItem("Home", R.drawable.ic_baseline_home_24,"home")
    object Camera: BottomNavItem("Camera",R.drawable.ic_baseline_camera_alt_24,"camera")
    object Settings: BottomNavItem("Settings",R.drawable.ic_baseline_settings_24,"settings")
}