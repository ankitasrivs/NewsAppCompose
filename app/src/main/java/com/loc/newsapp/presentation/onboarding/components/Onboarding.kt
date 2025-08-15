package com.loc.newsapp.presentation.onboarding.components

import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxHeight
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.colorResource
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import com.loc.newsapp.R
import com.loc.newsapp.presentation.Dimensions
import com.loc.newsapp.presentation.onboarding.Page

@Composable
fun Onboarding(
    modifier: Modifier = Modifier,
    page: Page
) {
 Column(modifier = modifier) {
     Image(
         modifier = Modifier.fillMaxWidth()
             .fillMaxHeight(fraction = 0.6f),
         painter = painterResource(id = page.image),
         contentDescription = null,
         contentScale = ContentScale.Crop)
     Spacer(modifier = Modifier.padding(Dimensions.MediumPassing1))
     Text(text = page.title, modifier = Modifier.padding(horizontal = Dimensions.MediumPassing2), style = MaterialTheme.typography.displaySmall.copy(fontWeight = FontWeight.Bold), color = colorResource(
         R.color.display_small))

     Text(text = page.descrption, modifier = Modifier.padding(horizontal = Dimensions.MediumPassing2), style = MaterialTheme.typography.bodyMedium,
         color = colorResource(
         R.color.text_medium))

 }
}