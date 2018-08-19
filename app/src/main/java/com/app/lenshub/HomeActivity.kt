package com.app.lenshub

import android.app.FragmentManager
import android.content.Context
import android.content.Intent
import android.content.SharedPreferences
import android.net.Uri
import android.os.Bundle
import android.support.design.widget.NavigationView
import android.support.v4.view.GravityCompat
import android.support.v4.widget.DrawerLayout
import android.support.v7.app.ActionBarDrawerToggle
import android.support.v7.app.AppCompatActivity
import android.support.v7.widget.Toolbar
import android.util.Log
import android.view.Menu
import android.view.MenuItem
import android.view.View
import android.widget.*

import com.app.lenshub.extensions.replaceFragmentWithBackStack
import com.app.lenshub.extensions.replaceFragmentWithOutBackStack
import com.app.lenshub.fragments.CategoryFragment
import com.app.lenshub.fragments.HomeFragment
import com.app.lenshub.utils.Constants
import com.bumptech.glide.Glide
import com.bumptech.glide.request.RequestOptions
import com.app.lenshub.fragments.ProfileFragment
import com.app.lenshub.model.Category
import com.google.android.gms.auth.api.signin.GoogleSignIn
import com.quinny898.library.persistentsearch.SearchBox
import com.quinny898.library.persistentsearch.SearchResult
import com.google.android.gms.auth.api.Auth
import com.google.android.gms.common.api.GoogleApiClient
import com.google.android.gms.auth.api.signin.GoogleSignInOptions
import com.google.android.gms.common.api.ResultCallback
import com.google.android.gms.common.api.Status


class HomeActivity : AppCompatActivity(), NavigationView.OnNavigationItemSelectedListener {

    private val TAG = "HomeActivity"
    private var sharePreference: SharedPreferences? = null
    private var category: Category? = null
    private var menuSearch: MenuItem? = null
    private var toolbar: Toolbar? = null;
    private var mToolBarNavigationListenerIsRegistered = false

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_home)
        init()
    }

    private fun init() {

        sharePreference = getSharedPreferences(Constants.SHARE_PREFERENCE_FILE, Context.MODE_PRIVATE)

        val navigationView = findViewById<View>(R.id.nav_view) as NavigationView
        navigationView.setNavigationItemSelectedListener(this)
        updateNavigationHeaderView(navigationView)

        toolbar = findViewById<android.support.v7.widget.Toolbar>(R.id.toolbar)
        setSupportActionBar(toolbar)

        val toogle = ActionBarDrawerToggle(this, findViewById(R.id.drawer_layout), toolbar, R.string.navigation_drawer_open, R.string.navigation_drawer_close)
        toogle.syncState()

        supportFragmentManager.replaceFragmentWithOutBackStack(R.id.container, HomeFragment())

        val drawer = findViewById<View>(R.id.drawer_layout) as DrawerLayout
        supportFragmentManager.addOnBackStackChangedListener(android.support.v4.app.FragmentManager.OnBackStackChangedListener {

            if (supportFragmentManager.getBackStackEntryCount() > 0) {
                    supportActionBar?.setDisplayHomeAsUpEnabled(true); // show back button
                    toolbar?.setNavigationOnClickListener(View.OnClickListener { onBackPressed() })
                } else {
                    //show hamburger
                    supportActionBar?.setDisplayHomeAsUpEnabled(false);
                    toogle.syncState();
                    toolbar?.setNavigationOnClickListener(View.OnClickListener {
                        drawer.openDrawer(GravityCompat.START);
                    })
                    setTitle(resources.getString(R.string.app_name))
                }
        })
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
        menuSearch = menu.findItem(R.id.action_search)
        return true
    }

    override fun onOptionsItemSelected(item: MenuItem): Boolean {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        val id = item.itemId


        return if (id == R.id.action_search) {
            launchSearchActivity()
            return true
        } else super.onOptionsItemSelected(item)

    }


    private fun updateNavigationHeaderView(navView: NavigationView) {
        val headerView: View = navView.getHeaderView(0)
        headerView.findViewById<TextView>(R.id.textViewName).text = sharePreference?.getString(Constants.USER_NAME, "")
        headerView.findViewById<TextView>(R.id.textViewEmail).text = sharePreference?.getString(Constants.USER_EMAIL, "")
        headerView.findViewById<TextView>(R.id.textViewCity).text = sharePreference?.getString(Constants.USER_CITY, "")
        Glide.with(this).load(sharePreference?.getString(Constants.USER_PHOTO_URL, "")).apply(RequestOptions.circleCropTransform()).into(headerView.findViewById<ImageView>(R.id.imageViewPhoto))
        headerView.findViewById<TextView>(R.id.textViewEdit).setOnClickListener {
            supportFragmentManager.replaceFragmentWithBackStack(R.id.container, ProfileFragment())
            handelVisibilityOfSearch(false)
            handleDrawer()
        }
    }

    private fun handleDrawer() {
        val drawer = findViewById<View>(R.id.drawer_layout) as DrawerLayout
        if (drawer.isDrawerOpen(GravityCompat.START)) {
            drawer.closeDrawer(GravityCompat.START)
        } else {
            drawer.openDrawer(GravityCompat.START)
        }
    }

    private fun launchSearchActivity() {
        val intent = Intent()
        intent.setClass(this, SearchActivity::class.java)
        startActivity(intent)
    }

    private fun handelVisibilityOfSearch(isVisible: Boolean) {
        //menuSearch?.isVisible = isVisible
    }

    fun setCategory(category: Category) {
        this.category = category
    }

    fun getCategory(): Category {
        return category!!
    }

    override fun onNavigationItemSelected(item: MenuItem): Boolean {
        // Handle navigation view item clicks here.
        val id = item.itemId

        if (id == R.id.nav_home) {

            supportFragmentManager.replaceFragmentWithOutBackStack(R.id.container, HomeFragment())
            handelVisibilityOfSearch(true)

        } else if (id == R.id.nav_category) {

            supportFragmentManager.replaceFragmentWithOutBackStack(R.id.container, CategoryFragment())
            handelVisibilityOfSearch(false)

        } else if (id == R.id.nav_nearme) {

            Toast.makeText(this, getString(R.string.not_implemented), Toast.LENGTH_SHORT).show()

        } else if (id == R.id.nav_upload) {

            Toast.makeText(this, getString(R.string.not_implemented), Toast.LENGTH_SHORT).show()

        } else if (id == R.id.nav_logout) {
            finish()
        }

        val drawer = findViewById<View>(R.id.drawer_layout) as DrawerLayout
        drawer.closeDrawer(GravityCompat.START)
        return true
    }

}
