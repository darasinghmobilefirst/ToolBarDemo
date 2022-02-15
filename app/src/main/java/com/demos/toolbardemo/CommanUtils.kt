package com.demos.toolbardemo

import android.content.Context
import android.content.Intent
import android.view.LayoutInflater
import android.view.View
import android.widget.LinearLayout
import androidx.appcompat.app.AppCompatActivity
import com.demos.toolbardemo.databinding.BottomCartOrderBinding
import com.demos.toolbardemo.databinding.HeaderToolBarBinding

class CommanUtils {

    companion object
    {
        fun add_header_tool_bar(activity: AppCompatActivity, llHeaderBar: LinearLayout,str_title: String,isBackShow : Boolean,isSearchShow : Boolean,isShoppingCartShow : Boolean,isFilterSHow : Boolean)
        {

            if(llHeaderBar!=null)
            {
                llHeaderBar.removeAllViews()
            }

            var binding = HeaderToolBarBinding.inflate(activity.getLayoutInflater());

            binding.txtHeaderTitle.text=str_title;

            if(isBackShow==true)
            {
                binding.imgBack.visibility=View.VISIBLE
            }
            else
            {
                binding.imgBack.visibility=View.GONE
            }

            if(isSearchShow==true)
            {
                binding.imgSearch.visibility=View.VISIBLE
            }
            else
            {
                binding.imgSearch.visibility=View.GONE
            }

            if(isShoppingCartShow==true)
            {
                binding.imgShoppingCart.visibility=View.VISIBLE
            }
            else
            {
                binding.imgShoppingCart.visibility=View.GONE
            }

            if(isFilterSHow==true)
            {
                binding.imgFilter.visibility=View.VISIBLE
            }
            else
            {
                binding.imgFilter.visibility=View.GONE
            }

            binding.imgBack.setOnClickListener {
                activity.onBackPressed()
            }
            binding.imgSearch.setOnClickListener {  }
            binding.imgShoppingCart.setOnClickListener {  }
            binding.imgFilter.setOnClickListener {  }

            llHeaderBar.addView(binding.root)

        }

        fun add_bottom_view(activity: AppCompatActivity, llHeaderBar: LinearLayout,str_title: String,str_next_screen: String)
        {

            if(llHeaderBar!=null)
            {
                llHeaderBar.removeAllViews()
            }

            var binding = BottomCartOrderBinding.inflate(activity.getLayoutInflater());

            binding.txtPrice.text=str_title;


            binding.llNext.setOnClickListener {

                if(str_next_screen.equals("Third"))
                {
                    val intent = Intent(activity, ThirdActivity::class.java)
                    activity.startActivity(intent)
                }
                else
                {
                    activity.onBackPressed()
                }

            }
            binding.llViewPriceDetails.setOnClickListener {
                activity.onBackPressed()
            }

            llHeaderBar.addView(binding.root)

        }

    }

}