package com.example.unittesting

import android.content.Context
import androidx.test.core.app.ApplicationProvider
import com.google.common.truth.Truth.assertThat
import org.junit.Before
import org.junit.Test


class ResourceComparerTest{

    lateinit var  resourceComparer : ResourceComparer

    @Before
    fun setUp(){
        resourceComparer = ResourceComparer()
    }

    @Test
    fun stringResourceSameGivenString_returnsTrue() {
        val context = ApplicationProvider.getApplicationContext<Context>()
        val result = resourceComparer.isEqual(context, R.string.app_name, "UnitTesting")
        assertThat(result).isTrue()
    }

    @Test
    fun stringResourceDifferentString_returnFalse(){
        val context = ApplicationProvider.getApplicationContext<Context>()
        val result = resourceComparer.isEqual(context,R.string.app_name,"Unit")
        assertThat(result).isFalse()
    }
}