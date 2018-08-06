package com.app.lenshub

import android.content.Context
import android.content.SharedPreferences
import android.net.Uri
import android.os.Bundle
import android.support.design.widget.NavigationView
import android.support.v4.view.GravityCompat
import android.support.v4.widget.DrawerLayout
import android.support.v7.app.AppCompatActivity
import android.view.Menu
import android.view.MenuItem
import android.view.View
import android.widget.ImageView
import android.widget.TextView

import com.app.lenshub.extensions.replaceFragmentWithBackStack
import com.app.lenshub.extensions.replaceFragmentWithOutBackStack
import com.app.lenshub.fragments.CategoryFragment
import com.app.lenshub.fragments.HomeFragment
import com.app.lenshub.utils.Constants
import com.bumptech.glide.Glide
import com.bumptech.glide.request.RequestOptions
import android.widget.Toast
import com.google.android.gms.auth.api.signin.GoogleSignIn
import com.quinny898.library.persistentsearch.SearchBox
import com.quinny898.library.persistentsearch.SearchResult
import com.google.android.gms.auth.api.Auth
import com.google.android.gms.common.api.GoogleApiClient
import com.google.android.gms.auth.api.signin.GoogleSignInOptions
import com.google.android.gms.common.api.ResultCallback
import com.google.android.gms.common.api.Status


class HomeActivity : AppCompatActivity(), NavigationView.OnNavigationItemSelectedListener{

    private var sharePreference:SharedPreferences? = null

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_home)
        init()
    }

    private fun init(){

        sharePreference  = getSharedPreferences(Constants.SHARE_PREFERENCE_FILE, Context.MODE_PRIVATE)

        val navigationView = findViewById<View>(R.id.nav_view) as NavigationView
        navigationView.setNavigationItemSelectedListener(this)
        updateNavigationHeaderView(navigationView)

        val drawer = findViewById<View>(R.id.drawer_layout) as DrawerLayout
        val search = findViewById<SearchBox>(R.id.searchbox)
        search.setMenuListener(MyMenuListener(drawer))
        search.enableVoiceRecognition(this)
        search.setSearchListener(MySearchListener())
        search.setLogoText(resources.getString(R.string.app_name))
        supportFragmentManager.replaceFragmentWithOutBackStack(R.id.container,HomeFragment())

    }

    override fun onBackPressed() {
        val drawer = findViewById<View>(R.id.drawer_layout) as DrawerLayout
        if (drawer.isDrawerOpen(GravityCompat.START)) {
            drawer.closeDrawer(GravityCompat.START)
        } else {
            super.onBackPressed()
        }
    }

    override fun onCreateOptionsMenu(menu: Menu): Boolean {
        // Inflate the menu; this adds items to the action bar if it is present.
        menuInflater.inflate(R.menu.navigation, menu)
        return true
    }

    override fun onOptionsItemSelected(item: MenuItem): Boolean {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        val id = item.itemId


        return if (id == R.id.action_settings) {
            true
        } else super.onOptionsItemSelected(item)

    }

    override fun onNavigationItemSelected(item: MenuItem): Boolean {
        // Handle navigation view item clicks here.
        val id = item.itemId

        if (id == R.id.nav_home) {

            supportFragmentManager.replaceFragmentWithOutBackStack(R.id.container,HomeFragment())

        } else if (id == R.id.nav_category) {

            supportFragmentManager.replaceFragmentWithOutBackStack(R.id.container,CategoryFragment())

        } else if (id == R.id.nav_nearme) {

            Toast.makeText(this,"Feature is not implemented", Toast.LENGTH_SHORT).show()

        } else if (id == R.id.nav_logout) {
            finish()
        }

        val drawer = findViewById<View>(R.id.drawer_layout) as DrawerLayout
        drawer.closeDrawer(GravityCompat.START)
        return true
    }

    private fun updateNavigationHeaderView(navView:NavigationView){
        val headerView:View = navView.getHeaderView(0)
        headerView.findViewById<TextView>(R.id.textViewName).text = sharePreference?.getString(Constants.USER_NAME,"")
        headerView.findViewById<TextView>(R.id.textViewEmail).text = sharePreference?.getString(Constants.USER_EMAIL,"")
        Glide.with(this).load(sharePreference?.getString(Constants.USER_PHOTO_URL,"")).apply(RequestOptions.circleCropTransform()).into(headerView.findViewById<ImageView>(R.id.imageViewPhoto))
    }

    class MyMenuListener(val drawer: DrawerLayout):SearchBox.MenuListener{
        override fun onMenuClick() {
            if (drawer.isDrawerOpen(GravityCompat.START)) {
                drawer.closeDrawer(GravityCompat.START)
            } else {
                drawer.openDrawer(GravityCompat.START)
            }
        }

    }

    class MySearchListener:SearchBox.SearchListener{
        override fun onSearchOpened() {
        }

        override fun onSearchCleared() {
        }

        override fun onSearchClosed() {
        }

        override fun onSearchTermChanged(term: String?) {
        }

        override fun onSearch(result: String?) {
        }

        override fun onResultClick(result: SearchResult?) {
        }

    }
}
