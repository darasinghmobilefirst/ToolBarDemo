package com.demos.toolbardemo

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.LinearLayout
import com.demos.toolbardemo.databinding.ActivityMainBinding
import com.demos.toolbardemo.databinding.ActivityThirdBinding

class ThirdActivity : AppCompatActivity()
{
    lateinit var binding: ActivityThirdBinding;

    override fun onCreate(savedInstanceState: Bundle?)
    {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_third)
        binding = ActivityThirdBinding.inflate(getLayoutInflater());
        var view = binding.getRoot();
        setContentView(view);


        CommanUtils.add_header_tool_bar(this,binding.llHeaderBar,"Third",true,true,true,true);
        CommanUtils.add_bottom_view(this,binding.llBottomView,"Bottom","");
    }


}