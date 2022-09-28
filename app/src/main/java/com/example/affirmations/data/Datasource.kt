package com.example.affirmations.data

import com.example.affirmations.R
import com.example.affirmations.model.Affirmation

class Datasource() {

    // a função retorba lista de Affirmations
    fun loadAffirmations(): List<Affirmation> {

        // dentro de <> tipo dos itens da lista
        // Dentro dos parênteses cria uma Affirmation
        return listOf<Affirmation>(
            Affirmation(R.string.affimartion1, R.drawable.image1),
            Affirmation(R.string.affimartion2, R.drawable.image2),
            Affirmation(R.string.affimartion3, R.drawable.image3),
            Affirmation(R.string.affimartion4, R.drawable.image4),
            Affirmation(R.string.affimartion5, R.drawable.image5),
            Affirmation(R.string.affimartion6, R.drawable.image6),
            Affirmation(R.string.affimartion7, R.drawable.image7),
            Affirmation(R.string.affimartion8, R.drawable.image8),
            Affirmation(R.string.affimartion9, R.drawable.image9),
            Affirmation(R.string.affimartion10, R.drawable.image10)
        )
    }
}