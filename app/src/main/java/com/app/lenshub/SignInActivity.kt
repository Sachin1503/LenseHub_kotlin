package com.app.lenshub

import android.content.Context
import android.content.Intent
import android.content.SharedPreferences
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.view.View
import com.app.lenshub.utils.Constants

import com.google.android.gms.auth.api.signin.GoogleSignIn
import com.google.android.gms.auth.api.signin.GoogleSignInAccount
import com.google.android.gms.auth.api.signin.GoogleSignInClient
import com.google.android.gms.auth.api.signin.GoogleSignInOptions
import com.google.android.gms.common.SignInButton
import com.google.android.gms.common.api.ApiException
import com.google.android.gms.tasks.Task

open class SignInActivity : AppCompatActivity(), View.OnClickListener {
    private var btnSignInButton: SignInButton? = null
    var mGoogleSignInClient: GoogleSignInClient? = null

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_login)

        btnSignInButton = findViewById(R.id.btnSignInButton)
        btnSignInButton!!.setSize(SignInButton.SIZE_WIDE)

        // Configure sign-in to request the user's ID, email address, and basic
        // profile. ID and basic profile are included in DEFAULT_SIGN_IN.
        val gso = GoogleSignInOptions.Builder(GoogleSignInOptions.DEFAULT_SIGN_IN)
                .requestEmail()
                .build()
        mGoogleSignInClient = GoogleSignIn.getClient(this, gso)
        btnSignInButton!!.setOnClickListener(this)
    }

    override fun onStart() {
        super.onStart()
        // Check for existing Google Sign In account, if the user is already signed in
        // the GoogleSignInAccount will be non-null.
        val account = GoogleSignIn.getLastSignedInAccount(this)
        updateUI(account)
    }

    override fun onActivityResult(requestCode: Int, resultCode: Int, data: Intent) {
        super.onActivityResult(requestCode, resultCode, data)
        if (requestCode == RC_SIGN_IN) {
            // The Task returned from this call is always completed, no need to attach
            // a listener.
            val task = GoogleSignIn.getSignedInAccountFromIntent(data)
            handleSignInResult(task)
        }
    }

    override fun onStop() {
        super.onStop()
    }

    override fun onClick(v: View) {
        when (v.id) {
            R.id.btnSignInButton -> signIn()
        }
    }

    private fun handleSignInResult(completedTask: Task<GoogleSignInAccount>) {
        try {
            val account = completedTask.getResult(ApiException::class.java)

            // Signed in successfully, show authenticated UI.
            updateUI(account)
        } catch (e: ApiException) {
            // The ApiException status code indicates the detailed failure reason.
            // Please refer to the GoogleSignInStatusCodes class reference for more information.
            Log.w(TAG, "signInResult:failed code=" + e.statusCode)
            updateUI(null)
        }

    }

    private fun updateUI(googleSignInAccount: GoogleSignInAccount?) {
        if (googleSignInAccount != null) {
            btnSignInButton!!.isEnabled = false
            //If user is already signed in the start home activity
            val pref:SharedPreferences = getSharedPreferences(Constants.SHARE_PREFERENCE_FILE, Context.MODE_PRIVATE);
            val editor = pref.edit()
            editor.putString(Constants.USER_ID,googleSignInAccount.id)
            editor.putString(Constants.USER_NAME,googleSignInAccount.displayName)
            editor.putString(Constants.USER_EMAIL,googleSignInAccount.email)
            editor.putString(Constants.USER_PHOTO_URL, googleSignInAccount.photoUrl.toString())
            editor.apply()

            finish()
            val homeIntent = Intent()
            homeIntent.setClass(this, HomeActivity::class.java)
            startActivity(homeIntent)
        } else {
            btnSignInButton!!.isEnabled = true
        }
    }

    private fun signIn() {
        val signInIntent = mGoogleSignInClient!!.signInIntent
        startActivityForResult(signInIntent, RC_SIGN_IN)
    }

    companion object {

        private val RC_SIGN_IN = 101
        private val TAG = SignInActivity::class.java.simpleName
    }
}
