import android.annotation.SuppressLint
import androidx.compose.material.Scaffold
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.unit.sp
import androidx.navigation.NavController

@Composable
@SuppressLint("UnusedMaterialScaffoldPaddingParameter")
fun ProfileScreen(navController: NavController){
    Scaffold(
        bottomBar = {
            BottonNagivationApp(navController)
        }
    ) {
        Text(text = "PROFILE SCREEN", fontSize = 14.sp)

    }
}