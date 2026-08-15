package com.example.fitnestazerbaijanintern.navigation

import androidx.compose.foundation.layout.padding
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.outlined.Home
import androidx.compose.material.icons.outlined.Person
import androidx.compose.material.icons.outlined.QrCodeScanner
import androidx.compose.material.icons.outlined.Search
import androidx.compose.material.icons.outlined.Star
import androidx.compose.material3.Icon
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.NavigationBar
import androidx.compose.material3.NavigationBarItem
import androidx.compose.material3.NavigationBarItemDefaults
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.sp
import androidx.navigation.NavGraph.Companion.findStartDestination
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.currentBackStackEntryAsState
import androidx.navigation.compose.rememberNavController
import com.example.fitnestazerbaijanintern.screen.GymDetailScreen
import com.example.fitnestazerbaijanintern.screen.HomeScreen
import com.example.fitnestazerbaijanintern.screen.ProfileScreen
import com.example.fitnestazerbaijanintern.screen.QrScannerScreen
import com.example.fitnestazerbaijanintern.screen.SearchScreen
import com.example.fitnestazerbaijanintern.screen.SubscriptionScreen
import com.example.fitnestazerbaijanintern.ui.theme.CyanPrimary

@Composable
fun MainScreen() {
    val navController = rememberNavController()

    Scaffold(
        bottomBar = {
            NavigationBar(
                // Sabit Color.White əvəzinə dinamik rəng: Light Mode-da ağ, Dark Mode-da tünd
                containerColor = MaterialTheme.colorScheme.surface
            ) {
                val navBackStackEntry by navController.currentBackStackEntryAsState()
                val currentRoute = navBackStackEntry?.destination?.route

                // 1. Əsas Səhifə
                NavigationBarItem(
                    selected = currentRoute == "home",
                    onClick = {
                        if (currentRoute != "home") {
                            navController.navigate("home") {
                                popUpTo(navController.graph.findStartDestination().id) { saveState = true }
                                launchSingleTop = true
                                restoreState = true
                            }
                        }
                    },
                    icon = { Icon(Icons.Outlined.Home, contentDescription = "Əsas səhifə") },
                    label = { Text("Əsas səhifə", fontSize = 10.sp) },
                    colors = NavigationBarItemDefaults.colors(
                        selectedIconColor = CyanPrimary,
                        selectedTextColor = CyanPrimary,
                        unselectedIconColor = MaterialTheme.colorScheme.onSecondary,
                        unselectedTextColor = MaterialTheme.colorScheme.onSecondary,
                        indicatorColor = CyanPrimary.copy(alpha = 0.15f)
                    )
                )

                // 2. Axtarış
                NavigationBarItem(
                    selected = currentRoute == "search",
                    onClick = {
                        if (currentRoute != "search") {
                            navController.navigate("search") {
                                popUpTo(navController.graph.findStartDestination().id) { saveState = true }
                                launchSingleTop = true
                                restoreState = true
                            }
                        }
                    },
                    icon = { Icon(Icons.Outlined.Search, contentDescription = "Axtarış") },
                    label = { Text("Axtarış", fontSize = 10.sp) },
                    colors = NavigationBarItemDefaults.colors(
                        selectedIconColor = CyanPrimary,
                        selectedTextColor = CyanPrimary,
                        unselectedIconColor = MaterialTheme.colorScheme.onSecondary,
                        unselectedTextColor = MaterialTheme.colorScheme.onSecondary,
                        indicatorColor = CyanPrimary.copy(alpha = 0.15f)
                    )
                )

                // 3. QR
                NavigationBarItem(
                    selected = currentRoute == "qr",
                    onClick = {
                        if (currentRoute != "qr") {
                            navController.navigate("qr") {
                                popUpTo(navController.graph.findStartDestination().id) { saveState = true }
                                launchSingleTop = true
                                restoreState = true
                            }
                        }
                    },
                    icon = { Icon(Icons.Outlined.QrCodeScanner, contentDescription = "QR") },
                    label = { Text("QR", fontSize = 10.sp) },
                    colors = NavigationBarItemDefaults.colors(
                        selectedIconColor = CyanPrimary,
                        selectedTextColor = CyanPrimary,
                        unselectedIconColor = MaterialTheme.colorScheme.onSecondary,
                        unselectedTextColor = MaterialTheme.colorScheme.onSecondary,
                        indicatorColor = CyanPrimary.copy(alpha = 0.15f)
                    )
                )

                // 4. Abunəlik
                NavigationBarItem(
                    selected = currentRoute == "subscription",
                    onClick = {
                        if (currentRoute != "subscription") {
                            navController.navigate("subscription") {
                                popUpTo(navController.graph.findStartDestination().id) { saveState = true }
                                launchSingleTop = true
                                restoreState = true
                            }
                        }
                    },
                    icon = { Icon(Icons.Outlined.Star, contentDescription = "Abunəlik") },
                    label = { Text("Abunəlik", fontSize = 10.sp) },
                    colors = NavigationBarItemDefaults.colors(
                        selectedIconColor = CyanPrimary,
                        selectedTextColor = CyanPrimary,
                        unselectedIconColor = MaterialTheme.colorScheme.onSecondary,
                        unselectedTextColor = MaterialTheme.colorScheme.onSecondary,
                        indicatorColor = CyanPrimary.copy(alpha = 0.15f)
                    )
                )

                // 5. Profil (Daha çox)
                NavigationBarItem(
                    selected = currentRoute == "profile",
                    onClick = {
                        if (currentRoute != "profile") {
                            navController.navigate("profile") {
                                popUpTo(navController.graph.findStartDestination().id) { saveState = true }
                                launchSingleTop = true
                                restoreState = true
                            }
                        }
                    },
                    icon = { Icon(Icons.Outlined.Person, contentDescription = "Daha çox") },
                    label = { Text("Daha çox", fontSize = 10.sp) },
                    colors = NavigationBarItemDefaults.colors(
                        selectedIconColor = CyanPrimary,
                        selectedTextColor = CyanPrimary,
                        unselectedIconColor = MaterialTheme.colorScheme.onSecondary,
                        unselectedTextColor = MaterialTheme.colorScheme.onSecondary,
                        indicatorColor = CyanPrimary.copy(alpha = 0.15f)
                    )
                )
            }
        }
    ) { innerPadding ->
        NavHost(
            navController = navController,
            startDestination = "home",
            modifier = Modifier.padding(innerPadding)
        ) {
            composable("home") {
                HomeScreen(
                    onGymClick = { gymId ->
                        navController.navigate("gymDetail/$gymId")
                    }
                )
            }
            composable("search") {
                SearchScreen(
                    onGymClick = { gymId ->
                        navController.navigate("gymDetail/$gymId")
                    }
                )
            }
            composable("qr") { QrScannerScreen() }
            composable("subscription") { SubscriptionScreen() }
            composable("profile") { ProfileScreen() }

            composable("gymDetail/{gymId}") { backStackEntry ->
                val gymId = backStackEntry.arguments?.getString("gymId")?.toIntOrNull() ?: 1
                GymDetailScreen(
                    gymId = gymId,
                    onBackClick = { navController.popBackStack() }
                )
            }
        }
    }
}