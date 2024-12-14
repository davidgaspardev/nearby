package dev.davidgaspar.nearby.data.model

import androidx.annotation.DrawableRes
import dev.davidgaspar.nearby.R

enum class NearbyCategoryFilterChipView(
    val description: String,
    @DrawableRes val icon: Int
) {
    ALIMENTACAO("Alimentação", R.drawable.ic_tools_kitchen_2),
    COMPRAS("Compras", R.drawable.ic_shopping_bag),
    HOSPEDAGEM("Hospedagem", R.drawable.ic_bed),
    SUPERMERCADO("Supermercado", R.drawable.ic_shopping_cart),
    ENTRETENIMENTO("Cinema", R.drawable.ic_movie),
    FARMACIA("Farmácia", R.drawable.ic_first_aid_kit),
    COMBUSTIVEL("Combustível", R.drawable.ic_gas_station),
    PADARIA("Padaria", R.drawable.ic_bakery);

    companion object {
        fun fromDescription(description: String): NearbyCategoryFilterChipView? {
            return entries.find { it.description == description }
        }
    }
}