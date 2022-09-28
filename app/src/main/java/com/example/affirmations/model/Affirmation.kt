package com.example.affirmations.model

import androidx.annotation.DrawableRes
import androidx.annotation.StringRes

// construtor da classe de dados
data class Affirmation(
    // usando anotações de recurso para evitar trocar parametros
    @StringRes val stringResourceId: Int,
    @DrawableRes val imageResourceId: Int
)