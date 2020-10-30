package mx.tecnm.ladm_u2_practica1_drivera

import android.graphics.Canvas
import android.graphics.Color
import android.graphics.Paint
import android.view.View

class Lienzo (p:MainActivity) : View(p) {

    var puntero = p

    //luna
    var luna = Figura(500,60,40)

    //arboles
    var arbol = Figura(100,500,70,150)
    var arbol1 = Figura(250,500,70,150)
    var arbol2 = Figura(400,500,70,150)
    var arbol3 = Figura(550,500,70,150)

    //copaArboles
    //arbol1
    var copa = Figura(100,500,40)
    var copa1 = Figura(160,490,40)
    var copa2 = Figura(130,450,40)
    var copa3 = Figura(150,450,40)
    //arbol2
    var copaA = Figura(250,500,40)
    var copaA1 = Figura(310,490,40)
    var copaA2 = Figura(280,450,40)
    var copaA3 = Figura(250,450,40)

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
    //nube3
    var Tnube = Figura(460,100,40)
    var Tnube1 = Figura(490,130,40)
    var Tnube2 = Figura(520,100,40)
    var Tnube3 = Figura(550,130,40)



    override fun onDraw(canvas: Canvas) {
        super.onDraw(canvas)
        var paint = Paint()

        //fondo
        canvas.drawColor(Color.BLACK)


        //arbol(es)
        paint.color = Color.rgb(139,69,19)
        arbol.pintar(canvas, paint)
        arbol1.pintar(canvas, paint)
        arbol2.pintar(canvas, paint)
        arbol3.pintar(canvas, paint)


        //copas
        //arbol1
        paint.color = Color.GREEN
        copa.pintar(canvas,paint)
        copa1.pintar(canvas,paint)
        copa2.pintar(canvas,paint)
        copa3.pintar(canvas,paint)
        //arbol2
        copaA.pintar(canvas,paint)
        copaA1.pintar(canvas,paint)
        copaA2.pintar(canvas,paint)
        copaA3.pintar(canvas,paint)


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
        //
        Tnube.pintar(canvas, paint)
        Tnube1.pintar(canvas, paint)
        Tnube2.pintar(canvas, paint)
        Tnube3.pintar(canvas, paint)



    }//onDraw

}//Lienzo