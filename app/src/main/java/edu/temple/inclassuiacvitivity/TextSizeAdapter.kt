package edu.temple.inclassuiacvitivity

import android.content.Context
import android.view.View
import android.view.ViewGroup
import android.widget.BaseAdapter
import android.widget.TextView

class TextSizeAdapter(_context: Context, _textSizes:Array<Int>) : BaseAdapter() {

    val context = _context
    val textSizes = _textSizes
    override fun getCount(): Int {
        return textSizes.size
    }

    override fun getItem(p0: Int) = textSizes[p0]


    override fun getItemId(p0: Int) = p0.toLong()

    override fun getView(p0: Int, p1: View?, p2: ViewGroup?): View {



      val textView: TextView



        if (p1 == null) {
        val textView = TextView(context)
            textView.setPadding(10,20,0,20)
    } else {
        textView = p1 as TextView
    }
        val textView = TextView(context)
        textView.textSize = textSizes[p0].toFloat()
        textView.setPadding(10,20,0,20)
        textView.text = textSizes[p0].toString()
        return textView
    }
}
