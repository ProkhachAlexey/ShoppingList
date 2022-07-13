package com.prokhach.shoppinglist.domain

// Интерактор для создания элемента в список покупок

class AddShopItemUseCase(private val shopListRepository: ShopListRepository) {
    fun addShopItem(shopItem: ShopItem) {
        shopListRepository.addShopItem(shopItem)
    }
}