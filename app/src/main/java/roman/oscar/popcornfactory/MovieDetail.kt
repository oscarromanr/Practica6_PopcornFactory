package roman.oscar.popcornfactory

import android.os.Bundle
import android.widget.ImageView
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity

class MovieDetail : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_movie_detail)
        cargarDescripcion()
    }

    fun cargarDescripcion(){

        var title: TextView = findViewById(R.id.tituloPelicula) as TextView
        var description: TextView = findViewById(R.id.descripcionPelicula) as TextView
        var image: ImageView= findViewById(R.id.imagenPelicula) as ImageView

        intent.getStringExtra("titulo")

        var tituloPelicula= intent.getStringExtra("titulo")
        var descripcionPelicula= intent.getStringExtra("sinopsis")
        var imagenPelicula= intent.getIntExtra("header", 0)

        title.setText(tituloPelicula)
        description.setText(descripcionPelicula)
        image.setImageResource(imagenPelicula)
    }

}