package mx.tecnm.ladm_u2_practica1_drivera

import android.graphics.Bitmap
import android.graphics.Canvas
import android.graphics.Paint
import android.graphics.PaintFlagsDrawFilter
import android.provider.MediaStore
import java.util.*

class Figura () {

    var x = 0f
    var y = 0f
    var decX = 5f

    var radio = 0f
    var ancho = 0f
    var alto = 0f

    var bitmap : Bitmap? = null

    var tipo = 1


    //circulo
    constructor(x:Int, y:Int, radio: Int) : this() {

        this.x = x.toFloat()
        this.y = y.toFloat()
        this.radio = radio.toFloat()

    }//constructor


    //rectangulo
    constructor(x:Int, y:Int, ancho:Int, alto:Int) : this(){

        this.x = x.toFloat()
        this.y = y.toFloat()
        this.ancho = ancho.toFloat()
        this.alto = alto.toFloat()
        tipo = 2

    }//constructor


    //imagen
    constructor(x: Int, y:Int, imagen:Bitmap) : this(){

        bitmap = imagen
        this.x = x.toFloat()
        this.y = y.toFloat()
        ancho = bitmap!!.width.toFloat()
        alto = bitmap!!.height.toFloat()
        tipo = 3

    }//imagen


    fun coordRandom(){

        var r = Random()
        this.x = r.nextInt(900-100).toFloat()
        this.y = r.nextInt(900-100).toFloat()

    }//pasos


    fun pintar(c:Canvas, p:Paint ){

        when(tipo){
            1->{
                c.drawCircle(x,y,radio,p)
            }//1-circulo

            2->{
                c.drawRect(x, y, x+ancho, y+alto, p)
            }//2-rectangulo

            3->{
                c.drawBitmap(bitmap!!,x,y,p)
            }//imagen

        }//when

    }//pintar





}//Figura