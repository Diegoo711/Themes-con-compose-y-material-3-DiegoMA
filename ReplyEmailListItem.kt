package com.example.app.ui.components

import androidx.compose.material3.*
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.text.style.TextOverflow
import androidx.compose.ui.unit.dp
import com.example.app.model.Email

@Composable
fun ReplyEmailListItem(email: Email) {
    Text(
        text = email.sender.firstName,
        style = MaterialTheme.typography.labelMedium
    )

    Text(
        text = email.createdAt,
        style = MaterialTheme.typography.labelMedium,
        color = MaterialTheme.colorScheme.onSurfaceVariant
    )

    Text(
        text = email.subject,
        style = MaterialTheme.typography.titleLarge,
        modifier = Modifier.padding(top = 12.dp, bottom = 8.dp),
    )

    Text(
        text = email.body,
        maxLines = 2,
        style = MaterialTheme.typography.bodyLarge,
        color = MaterialTheme.colorScheme.onSurfaceVariant,
        overflow = TextOverflow.Ellipsis
    )
}
