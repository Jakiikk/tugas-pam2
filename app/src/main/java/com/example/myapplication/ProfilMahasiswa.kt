package com.example.myapplication

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.border
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Email
import androidx.compose.material.icons.filled.Phone
import androidx.compose.material.icons.filled.School
import androidx.compose.material3.Icon
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp

@Composable
fun ProfilMahasiswa() {

    // Warna utama
    val Biru = Color(0xFF2563EB)
    val BiruMuda = Color(0xFFEFF6FF)
    val Abu = Color(0xFF666666)

    Column(
        modifier = Modifier
            .fillMaxSize()
            .background(Color(0xFFF8FAFC))
    ) {

        // =========================
        // HEADER PROFIL
        // =========================
        Box(
            modifier = Modifier
                .fillMaxWidth()
                .height(330.dp)
                .clip(
                    RoundedCornerShape(
                        bottomStart = 35.dp,
                        bottomEnd = 35.dp
                    )
                )
                .background(Biru),
            contentAlignment = Alignment.TopCenter
        ) {

            Column(
                horizontalAlignment = Alignment.CenterHorizontally
            ) {

                Spacer(
                    modifier = Modifier.height(45.dp)
                )

                Text(
                    text = "PROFIL MAHASISWA",
                    fontSize = 21.sp,
                    fontWeight = FontWeight.Bold,
                    color = Color.White
                )

                Spacer(
                    modifier = Modifier.height(22.dp)
                )

                // Foto Profil
                Image(
                    painter = painterResource(
                        id = R.drawable.zaki
                    ),
                    contentDescription = "Foto Profil",
                    contentScale = ContentScale.Crop,
                    modifier = Modifier
                        .size(125.dp)
                        .clip(CircleShape)
                        .border(
                            width = 5.dp,
                            color = Color.White,
                            shape = CircleShape
                        )
                )

                Spacer(
                    modifier = Modifier.height(15.dp)
                )

                Text(
                    text = "Muhammad Zaki Al Hilmi",
                    fontSize = 22.sp,
                    fontWeight = FontWeight.Bold,
                    color = Color.White
                )

                Spacer(
                    modifier = Modifier.height(5.dp)
                )

                Text(
                    text = "245150407111025",
                    fontSize = 14.sp,
                    color = Color.White
                )

                Text(
                    text = "Sistem Informasi • FILKOM UB",
                    fontSize = 14.sp,
                    color = Color.White
                )
            }
        }

        // =========================
        // INFORMASI MAHASISWA
        // =========================
        Column(
            modifier = Modifier
                .fillMaxWidth()
                .padding(
                    start = 20.dp,
                    end = 20.dp,
                    top = 25.dp
                ),
            verticalArrangement = Arrangement.spacedBy(12.dp)
        ) {

            Text(
                text = "Informasi Kontak",
                fontSize = 18.sp,
                fontWeight = FontWeight.Bold,
                color = Color(0xFF1E293B)
            )

            // Nomor Telepon
            InfoCard(
                icon = Icons.Default.Phone,
                title = "Nomor Telepon",
                value = "081266756368",
                iconBackground = BiruMuda,
                iconColor = Biru
            )

            // Email
            InfoCard(
                icon = Icons.Default.Email,
                title = "Email",
                value = "mzakialhilmi@student.ub.ac.id",
                iconBackground = BiruMuda,
                iconColor = Biru
            )

            // Pendidikan
            InfoCard(
                icon = Icons.Default.School,
                title = "Pendidikan",
                value = "Universitas Brawijaya",
                iconBackground = BiruMuda,
                iconColor = Biru
            )
        }
    }
}


// =================================
// COMPONENT KARTU INFORMASI
// =================================

@Composable
fun InfoCard(
    icon: androidx.compose.ui.graphics.vector.ImageVector,
    title: String,
    value: String,
    iconBackground: Color,
    iconColor: Color
) {

    Row(
        modifier = Modifier
            .fillMaxWidth()
            .clip(
                RoundedCornerShape(16.dp)
            )
            .background(Color.White)
            .padding(16.dp),
        verticalAlignment = Alignment.CenterVertically
    ) {

        // Icon
        Box(
            modifier = Modifier
                .size(48.dp)
                .clip(CircleShape)
                .background(iconBackground),
            contentAlignment = Alignment.Center
        ) {

            Icon(
                imageVector = icon,
                contentDescription = title,
                tint = iconColor,
                modifier = Modifier.size(24.dp)
            )
        }

        Spacer(
            modifier = Modifier.size(15.dp)
        )

        // Text
        Column {

            Text(
                text = title,
                fontSize = 12.sp,
                color = Color.Gray
            )

            Spacer(
                modifier = Modifier.height(3.dp)
            )

            Text(
                text = value,
                fontSize = 15.sp,
                fontWeight = FontWeight.Medium,
                color = Color(0xFF1E293B)
            )
        }
    }
}