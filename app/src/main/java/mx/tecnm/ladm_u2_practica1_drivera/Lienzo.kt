package mx.tecnm.ladm_u2_practica1_drivera

import android.graphics.Canvas
import android.graphics.Color
import android.graphics.Paint
import android.view.View

class Lienzo (p:MainActivity) : View(p) {

    var puntero = p

    var arbol = Figura(200,500,70,150)
    var luna = Figura(500,60,40)
    //nube
    var nube = Figura(60, 100, 40)
    var nube1 = Figura(90, 130, 40)
    var nube2 = Figura(120, 100, 40)
    var nube3 = Figura(150, 130, 40)
    //nube2
    var Dnube = Figura(260, 180, 40)
    var Dnube1 = Figura(290, 210, 40)
    var Dnube2 = Figura(320, 180, 40)
    var Dnube3 = Figura(350, 210, 40)


    override fun onDraw(canvas: Canvas) {
        super.onDraw(canvas)
        var paint = Paint()

        //fondo
        canvas.drawColor(Color.BLACK)

        //arbol(es)
        paint.color = Color.rgb(139,69,19)
        arbol.pintar(canvas, paint)


        //luna
        paint.color = Color.DKGRAY
        luna.pintar(canvas, paint)


        //nube
        paint.color = Color.WHITE
        nube.pintar(canvas,paint)
        nube1.pintar(canvas,paint)
        nube2.pintar(canvas,paint)
        nube3.pintar(canvas,paint)
        //
        Dnube.pintar(canvas,paint)
        Dnube1.pintar(canvas,paint)
        Dnube2.pintar(canvas,paint)
        Dnube3.pintar(canvas,paint)



    }//onDraw

}//Lienzo