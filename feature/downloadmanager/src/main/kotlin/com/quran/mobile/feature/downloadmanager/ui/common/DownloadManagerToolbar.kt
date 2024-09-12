package com.quran.mobile.feature.downloadmanager.ui.common

import androidx.compose.foundation.layout.RowScope
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.ArrowBack
import androidx.compose.material3.Icon
import androidx.compose.material3.IconButton
import androidx.compose.material3.Text
import androidx.compose.material3.TopAppBar
import androidx.compose.material3.TopAppBarDefaults
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.style.TextOverflow
import com.quran.labs.androidquran.common.ui.core.modifier.autoMirror

@Composable
fun DownloadManagerToolbar(
  title: String,
  onBackPressed: (() -> Unit),
  actions: @Composable (RowScope.() -> Unit) = {}
) {
  TopAppBar(
    title = {
      Text(
        text = title,
        maxLines = 1,
        overflow = TextOverflow.Ellipsis
      )
    },
    navigationIcon = {
      IconButton(onClick = onBackPressed) {
        Icon(
          imageVector = Icons.Filled.ArrowBack,
          contentDescription = "",
          modifier = Modifier.autoMirror()
        )
      }
    },
          actions = actions,
          colors = TopAppBarDefaults.topAppBarColors(
                  containerColor = Color(0xFF0D423A),
                  titleContentColor = Color(0xFFF7F3EA),
                  navigationIconContentColor = Color(0xFFF7F3EA)
      )

  )
}
