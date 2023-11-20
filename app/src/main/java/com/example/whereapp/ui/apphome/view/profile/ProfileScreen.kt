import android.annotation.SuppressLint
import androidx.compose.foundation.Image
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.*
import androidx.compose.runtime.Composable

import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.unit.dp

import androidx.navigation.NavController
import com.example.whereapp.ui.apphome.view.topbar.topAppBar
import com.example.whereapp.R
import com.example.whereapp.ui.apphome.viewModel.profile.LanguageViewModel

import androidx.compose.ui.platform.LocalContext

import com.example.whereapp.navigation.Model


@Composable
@SuppressLint("UnusedMaterialScaffoldPaddingParameter")
fun ProfileScreen(navController: NavController, languageViewModel: LanguageViewModel){


    Scaffold(
        bottomBar = {
            BottonNagivationApp(navController)
        },
        topBar = { topAppBar() }
    ) { paddingValues ->
        Column(
        ) {
            Profile(languageViewModel,navController)
        }
    }


}

@Composable
fun Profile(languageViewModel: LanguageViewModel,navController: NavController){
    val context = LocalContext.current
    Column(
        modifier = Modifier.fillMaxWidth()
    ) {
        Box(
            modifier = Modifier
                .fillMaxWidth()
                .height((context.resources.getDimension(R.dimen.box_tiny).dp))

            , contentAlignment = Alignment.Center
        ) {
            Image(
                contentScale = ContentScale.Crop,
                painter = painterResource(id = R.drawable.barra),
                contentDescription = null,
                modifier = Modifier.fillMaxSize()
            )

            Column(
                verticalArrangement = Arrangement.Center,
                horizontalAlignment = Alignment.CenterHorizontally
            ) {
                Image(painter = painterResource(id = R.drawable.icon_user),
                    contentDescription = null,
                    modifier = Modifier
                        .clip(RoundedCornerShape(50))
                )
                Text(text = "You")
                Text("@User name")
            }

        }

        Setting(icon = R.drawable.icon_user , settingName = "Edit Profile"){

        }
        Setting(icon = R.drawable.icon_about , settingName = "About") {
            navController.navigate(Model.AboutScreen.route)
        }

        Setting(icon = R.drawable.icon_langauge,
                settingName = "Language") {



        }
        Setting(icon = R.drawable.icon_privacy , settingName = "Policy privacy"){
            navController.navigate(Model.PrivacyScreen.route)
        }

    }

}



@Composable
fun Setting(
    icon: Int,
    settingName: String,
    onClick: () -> Unit
) {

    Box(
        modifier = Modifier
            .fillMaxWidth()
            .height(80.dp)
            .clickable(onClick = onClick),
        contentAlignment = Alignment.CenterStart
    ) {
        Row(
            modifier = Modifier
                .fillMaxSize()
                .padding(horizontal = 20.dp),
            verticalAlignment = Alignment.CenterVertically
        ) {

            Image(
                painter = painterResource(id = icon),
                contentDescription = null,
                modifier = Modifier
                    .size(24.dp)
                    .clip(RoundedCornerShape(50))
            )

            Spacer(Modifier.width(16.dp))


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
                    contentDescription = null
                )
            }
        }
    }


}


