package com.demos.toolbardemo

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.LinearLayout
import com.demos.toolbardemo.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity()
{
    lateinit var binding: ActivityMainBinding;

    override fun onCreate(savedInstanceState: Bundle?)
    {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        binding = ActivityMainBinding.inflate(getLayoutInflater());
        var view = binding.getRoot();
        setContentView(view);

        binding.llBottomBar.bottomNavigation.setOnItemSelectedListener { item ->

            when (item.itemId) {
                R.id.page_1 -> {

                    true
                }
                R.id.page_2 -> {
                    val intent = Intent(this, SecondActivity::class.java)
                    startActivity(intent)
                    true

                }
                R.id.page_3 -> {
                    val intent = Intent(this, ThirdActivity::class.java)
                    startActivity(intent)
                    true

                }
                else -> false
            }

        }

        binding.llBottomBar.bottomNavigation.setOnItemReselectedListener { item ->
            when (item.itemId) {
                R.id.page_1 -> {

                }
                R.id.page_2 -> {

                }
                R.id.page_3 -> {

                }

            }
        }

        CommanUtils.add_header_tool_bar(this,binding.llHeaderBar,"Home",false,true,true,false);
    }


}