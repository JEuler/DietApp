package com.cloverrepublic.dietapp

import android.content.ActivityNotFoundException
import android.content.Intent
import android.net.Uri
import android.os.Bundle
import android.support.v7.app.AppCompatActivity
import android.view.CollapsibleActionView
import android.view.Menu
import android.view.MenuItem
import android.view.View

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }

    override fun onCreateOptionsMenu(menu: Menu): Boolean {
        val inflater = menuInflater
        inflater.inflate(R.menu.main_menu, menu)
        return true
    }

    override fun onOptionsItemSelected(item: MenuItem): Boolean =
            when (item.itemId) {
                R.id.about_item -> {
                    val intent = Intent(this, AboutActivity::class.java)
                    startActivity(intent)
                    true
                }
                else -> super.onOptionsItemSelected(item)
            }

    fun onGeneralInformationClick(view: View) {
        val intent = Intent(this, BasicsInfoActivity::class.java)
        startActivity(intent)
    }

    fun onProteinClick(view: View) {
        val intent = Intent(this, ProteinInfoActivity::class.java)
        startActivity(intent)
    }

    fun onWeightLossClick(view: View) {
        val intent = Intent(this, WeightLossInfoActivity::class.java)
        startActivity(intent)
    }


    fun onFatsClick(view: View) {
        val intent = Intent(this, FatsInfoActivity::class.java)
        startActivity(intent)
    }

    fun onHydrocarbonesClick(view: View) {
        val intent = Intent(this, HydrocarbonsInfoActivity::class.java)
        startActivity(intent)
    }

    fun onBreakfastClick(view: View) {
        val intent = Intent(this, BreakfastInfoActivity::class.java)
        startActivity(intent)
    }
}
