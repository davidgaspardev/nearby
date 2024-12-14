package dev.davidgaspar.nearby.ui.component.button

import androidx.annotation.DrawableRes
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.PaddingValues
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.heightIn
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.Icon
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import dev.davidgaspar.nearby.R
import dev.davidgaspar.nearby.ui.theme.GreenBase
import dev.davidgaspar.nearby.ui.theme.Typography

@Composable
fun NearbyButton(
    text: String? = null,
    @DrawableRes iconRes: Int? = null,
    modifier: Modifier = Modifier,
    onClick: () -> Unit
) {
    Button(
        onClick = onClick,
        shape = RoundedCornerShape(16.dp),
        contentPadding = if (text == null && iconRes != null) PaddingValues(0.dp) else ButtonDefaults.ContentPadding,
        colors = ButtonDefaults.buttonColors(
            containerColor = GreenBase
        ),
        modifier = modifier.heightIn(min = 56.dp)
    ) {
        Row(
            verticalAlignment = Alignment.CenterVertically,
            horizontalArrangement = Arrangement.spacedBy(8.dp),
        ) {
            iconRes?.let {
                Icon(
                    painter = painterResource(id = it),
                    contentDescription = "Button Icon",
                )
            }
            text?.let {
                Text(
                    text = it.uppercase(),
                    style = Typography.labelLarge,
                )
            }
        }
    }
}

@Preview
@Composable
private fun NearbyButtonPreview() {
    NearbyButton(
        text = "Confirmar",
        modifier = Modifier.fillMaxWidth(),
        iconRes = R.drawable.ic_scan,
        onClick = { }
    )
}

@Preview
@Composable
private fun NearbyButtonNoIconPreview() {
    NearbyButton(
        text = "Confirmar",
        modifier = Modifier.fillMaxWidth(),
        onClick = { }
    )
}

@Preview
@Composable
private fun NearbyButtonNoTextPreview() {
    NearbyButton(
        iconRes = R.drawable.ic_arrow_left,
        onClick = { }
    )
}
