package com.mix.kotlin_app

import androidx.fragment.app.Fragment

/**
 * com.mix.kotlin_app
 * FragmentManager.kt
 * @Date 2020-06-15
 * @Author GuoBin<guobin201314@gmail.com>
 * @Project kotlin-app
 */
class FragmentManager {
    @Volatile
    private var mInstance: FragmentManager? = null

    fun getInstance(): FragmentManager? {
        if (mInstance == null) {
            synchronized(FragmentManager::class.java) {
                if (mInstance == null) {
                    mInstance = FragmentManager()
                }
            }
        }
        return mInstance
    }

    private val mHashMap: HashMap<String, Fragment?> = HashMap()

    fun createFragment(clazz: Class<*>, isobaric: Boolean?): Fragment? {
        var fragment: Fragment? = null
        val className = clazz.name
        if (mHashMap.containsKey(className)) {
            fragment = mHashMap[className]
        } else {
            try {
                fragment = Class.forName(className).newInstance() as Fragment
            } catch (e: InstantiationException) {
                e.printStackTrace()
            } catch (e: IllegalAccessException) {
                e.printStackTrace()
            } catch (e: ClassNotFoundException) {
                e.printStackTrace()
            }
        }
        if (isobaric == null || isobaric) {
            mHashMap[className] = fragment
        }
        return fragment
    }
}