package com.masahirosaito.tictactoe

import android.app.AlertDialog
import android.os.Bundle
import android.support.v4.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup

class MainFragment : Fragment() {
    var mDialog: AlertDialog? = null

    override fun onCreateView(inflater: LayoutInflater?, container: ViewGroup?, savedInstanceState: Bundle?): View? {
        val rootView: View = inflater!!.inflate(R.layout.fragment_main, container, false)

        // TODO: ここでボタンを処理する
        rootView.findViewById(R.id.about_button).setOnClickListener {
            mDialog = AlertDialog.Builder(activity).run {
                setTitle(R.string.about_title)
                setMessage(R.string.about_text)
                setCancelable(false)
                setPositiveButton(R.string.ok_label, null)
                show()
            }
        }

        return rootView
    }

    override fun onPause() {
        super.onPause()

        mDialog?.dismiss()
    }
}
