package campus.tech.kakao.contacts

import android.os.Bundle
import android.view.View
import android.widget.EditText
import android.widget.TextView
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import androidx.constraintlayout.widget.ConstraintLayout

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val moreBtn = findViewById<TextView>(R.id.more)
        val moreForm = findViewById<ConstraintLayout>(R.id.more_form)
        val cancel = findViewById<TextView>(R.id.cancel)
        val save = findViewById<TextView>(R.id.save)

        moreBtn.setOnClickListener {
            swapVisibility(moreBtn, moreForm)
        }
        cancel.setOnClickListener {
            clickCancelEvent()
        }
        save.setOnClickListener {
            RequiredInputVerify()
        }
    }

    fun swapVisibility(viewA: View, viewB: View) {
        val temp = viewA.visibility
        viewA.visibility = viewB.visibility
        viewB.visibility = temp
    }
    }
}
