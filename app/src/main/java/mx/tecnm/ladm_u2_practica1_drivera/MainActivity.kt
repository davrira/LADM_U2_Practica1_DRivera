package mx.tecnm.ladm_u2_practica1_drivera

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle

class MainActivity : AppCompatActivity() {

    var miLienzo : Lienzo? = null

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        miLienzo = Lienzo(this)
        setContentView(miLienzo)

    }//onCreate

}//class