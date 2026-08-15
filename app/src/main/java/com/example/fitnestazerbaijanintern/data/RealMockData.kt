package com.example.fitnestazerbaijanintern.data

data class UserProfileData(
    val name: String,
    val surname: String,
    val phone: String,
    val email: String,
    val userId: String,
    val subscriptionPlan: String,
    val isSubscriptionActive: Boolean
)

data class MarketProductModel(
    val storeName: String,
    val address: String,
    val discountText: String,
    val imageUrl: String
)

object RealMockData {
    val user = UserProfileData(
        name = "Abdulla",
        surname = "Hüseynli",
        phone = "+994 50 123 45 67",
        email = "abdullahuseynli@gmail.com",
        userId = "ID: 12345ADFS6",
        subscriptionPlan = "Premium Plan",
        isSubscriptionActive = true
    )

    val marketProducts = listOf(
        MarketProductModel(
            storeName = "FitMarket - Nərimanov",
            address = "Təbriz küç. 24, Bakı",
            discountText = "15% Keşbek",
            imageUrl = "https://images.unsplash.com/photo-1517838277536-f5f99be501cd?q=80&w=400"
        )
    )

    val gyms = listOf(
        GymModel(
            id = 1,
            name = "Pusula Fitness",
            distance = "1.2 km uzaqlıqda",
            rating = 4.8,
            imageUrl = "https://images.unsplash.com/photo-1534438327276-14e5300c3a48?q=80&w=600",
            isNew = true,
            description = "Pusula Fitness mərkəzində son model kardiomaşınlar, serfifikasiyalı məşqçilər və geniş sauna zonası mövcuddur.",
            address = "Nərimanov r., Mayakovski küç. 12"
        ),
        GymModel(
            id = 2,
            name = "Bodybuilder Gym",
            distance = "2.5 km uzaqlıqda",
            rating = 4.5,
            imageUrl = "https://images.unsplash.com/photo-1540497077202-7c8a3999166f?q=80&w=600",
            isNew = false,
            description = "Ağır atletika və pauerliftinq həvəskarları üçün tam peşəkar avadanlıqlarla təchiz olunmuş zal.",
            address = "Nəsimi r., 28 May küç. 45"
        ),
        GymModel(
            id = 3,
            name = "Olympic Stars",
            distance = "3.8 km uzaqlıqda",
            rating = 4.9,
            imageUrl = "https://images.unsplash.com/photo-1571902943202-507ec2618e8f?q=80&w=600",
            isNew = false,
            description = "Olimpiya standartlarına cavab verən hovuz, trenajor zalı və döyüş növləri üzrə xüsusi rinqlər.",
            address = "Xətai r., Xocalı pr. 18"
        )
    )
}