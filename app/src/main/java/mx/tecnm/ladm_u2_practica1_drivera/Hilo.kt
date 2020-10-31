package mx.tecnm.ladm_u2_practica1_drivera

class Hilo (p:MainActivity) : Thread() {

    var puntero = p

    override fun run() {
        super.run()

        sleep(5000)

        while (true){

            sleep(1400)
            puntero.runOnUiThread {
                puntero.miLienzo!!.redibujar()
            }//runOnUi

        }//while

    }//run

}//Hilo