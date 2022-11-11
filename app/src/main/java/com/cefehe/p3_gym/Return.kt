package com.cefehe.p3_gym

import android.content.Intent
import android.os.Bundle
import androidx.fragment.app.Fragment


class Return : Fragment() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        requireContext().also {
            val intent = Intent(it, MainActivity::class.java)
            it.startActivity(intent)
        }
    }
}