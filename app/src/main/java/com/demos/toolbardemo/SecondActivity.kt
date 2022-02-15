package com.demos.toolbardemo

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.LinearLayout
import com.demos.toolbardemo.databinding.ActivityMainBinding
import com.demos.toolbardemo.databinding.ActivitySecondBinding

class SecondActivity : AppCompatActivity()
{
    lateinit var binding: ActivitySecondBinding;

    override fun onCreate(savedInstanceState: Bundle?)
    {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_second)
        binding = ActivitySecondBinding.inflate(getLayoutInflater());
        var view = binding.getRoot();
        setContentView(view);


        CommanUtils.add_header_tool_bar(this,binding.llHeaderBar,"Seconds",true,true,true,true);
        CommanUtils.add_bottom_view(this,binding.llBottomView,"Bottom","Third");

    }


}