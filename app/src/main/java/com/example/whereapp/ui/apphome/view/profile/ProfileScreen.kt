import android.annotation.SuppressLint
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.*
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.navigation.NavController
import com.example.whereapp.ui.apphome.view.topbar.topAppBar
import com.example.whereapp.R


@Composable
@SuppressLint("UnusedMaterialScaffoldPaddingParameter")
fun ProfileScreen(navController: NavController){
    Scaffold(
        bottomBar = {
            BottonNagivationApp(navController)
        },
        topBar = { topAppBar() }

    ) {
        Column {
            Profile()
        }

    }
}

@Composable
fun Profile(){
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

        Setting(icon = R.drawable.icon_user , settingName = "Edit Profile")
        Setting(icon = R.drawable.icon_about , settingName = "About")

        Setting(icon = R.drawable.icon_langauge , settingName = "Language")
        Setting(icon = R.drawable.icon_privacy , settingName = "Policy privacy")


    }
}

@Composable
fun Setting(icon: Int,settingName: String) {
    Spacer(modifier = Modifier.fillMaxWidth().height(1.dp).background(Color.Black))
    Box(
        Modifier
            .fillMaxWidth()
            .height(100.dp),
        contentAlignment = Alignment.Center
    ) {
        Row(
            modifier = Modifier.fillMaxSize()
        ) {
            Box(
                modifier = Modifier
                    .weight(1f)
                    .fillMaxSize(),
                contentAlignment = Alignment.CenterStart
            ) {
                Image(
                    painter = painterResource(id = icon),
                    contentDescription = null,
                    modifier = Modifier
                        .clip(RoundedCornerShape(50))
                        .padding(start = 20.dp, end = 20.dp)
                        .size(50.dp)
                )

            }
            Box(
                modifier = Modifier
                    .weight(1f)
                    .fillMaxSize(),
                contentAlignment = Alignment.CenterStart
            ) {
                Text(settingName)
            }

            Box(
                modifier = Modifier
                    .weight(1f)
                    .fillMaxSize(),
                contentAlignment = Alignment.CenterEnd
            ) {
                IconButton(
                    onClick = { /*TODO*/ }) {
                    Image(
                        painter = painterResource(
                            id = R.drawable.icon_gonext
                        ), contentDescription = null
                    )
                }
            }
        }
    }
}


