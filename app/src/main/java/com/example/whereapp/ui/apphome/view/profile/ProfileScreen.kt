import android.annotation.SuppressLint
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.*
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.unit.dp

import androidx.navigation.NavController
import com.example.whereapp.ui.apphome.view.topbar.topAppBar
import com.example.whereapp.R
import com.example.whereapp.ui.apphome.viewModel.profile.LanguageViewModel
import java.util.Locale
import androidx.compose.ui.platform.LocalConfiguration
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.tooling.preview.Preview



@Composable
@SuppressLint("UnusedMaterialScaffoldPaddingParameter")
fun ProfileScreen(navController: NavController, languageViewModel: LanguageViewModel){
    Scaffold(
        bottomBar = {
            BottonNagivationApp(navController)
        },
        topBar = { topAppBar() }

    ) {
        Column {
            Profile(languageViewModel)
        }

    }
}

@Composable
fun Profile(languageViewModel: LanguageViewModel){
    Column(
        modifier = Modifier.fillMaxWidth()
    ) {
        Box(
            modifier = Modifier
                .fillMaxWidth()
                .height(200.dp)
            // Set the size of the box
            , contentAlignment = Alignment.Center
        ) {
            Column() {
                Image(painter = painterResource(id = R.drawable.icon_user),
                    contentDescription = null,
                    modifier = Modifier
                        .clip(RoundedCornerShape(50))
                )
                Text(text = "Name")
                Text("@User name")
            }

        }

        Setting(icon = R.drawable.icon_user , settingName = "Edit Profile"){
            // Define lo que sucede cuando se hace clic en Edit Profile
        }
        Setting(icon = R.drawable.icon_about , settingName = "About") {
            // Define lo que sucede cuando se hace clic en About
        }

        Setting(icon = R.drawable.icon_langauge,
                settingName = "Language") {
            //ME VOY A MATAR


        }
        Setting(icon = R.drawable.icon_privacy , settingName = "Policy privacy"){
            // Define lo que sucede cuando se hace clic en Policy privacy
        }


    }
}


@Composable
fun LanguageToggleButton() {
    var locale by remember { mutableStateOf(Locale.getDefault()) }

    Button(onClick = {
        locale = if (locale.language == "en") Locale("es") else Locale("en")
        // Aquí deberías aplicar el 'locale' al contexto de tu aplicación y reiniciar la Activity
        // TODO: Actualizar la configuración y reiniciar la Activity
    }) {
        Text(text = if (locale.language == "en") "Switch to Spanish" else "Switch to English")
    }
}

@Composable
fun Setting(
    icon: Int,
    settingName: String,
    onClick: () -> Unit // Parámetro para manejar eventos de clic
) {
    // Espaciador superior
    Spacer(modifier = Modifier
        .fillMaxWidth()
        .height(1.dp)
        .background(Color.Black)
    )

    // Contenedor principal para el ajuste
    Box(
        modifier = Modifier
            .fillMaxWidth()
            .height(56.dp)
            .clickable(onClick = onClick),
        contentAlignment = Alignment.CenterStart
    ) {
        Row(
            modifier = Modifier
                .fillMaxSize()
                .padding(horizontal = 20.dp),
            verticalAlignment = Alignment.CenterVertically
        ) {
            // Icono del ajuste
            Image(
                painter = painterResource(id = icon),
                contentDescription = null,
                modifier = Modifier
                    .size(24.dp)
                    .clip(RoundedCornerShape(50))
            )

            Spacer(Modifier.width(16.dp))

            // Nombre del ajuste
            Text(
                text = settingName,
                modifier = Modifier.weight(1f)
            )


            IconButton(
                onClick = onClick,
                modifier = Modifier.size(24.dp)
            ) {

                Image(
                    painter = painterResource(id = R.drawable.icon_gonext),
                    contentDescription = null // Añade una descripción apropiada para accesibilidad
                )
            }
        }
    }

    // Espaciador inferior
    Spacer(modifier = Modifier
        .fillMaxWidth()
        .height(1.dp)
        .background(Color.Black)
    )
}


