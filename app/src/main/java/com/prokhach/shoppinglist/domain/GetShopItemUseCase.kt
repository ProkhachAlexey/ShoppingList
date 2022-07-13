package com.prokhach.shoppinglist.domain

// Интерактор для получения элемента из списка покупок

class GetShopItemUseCase(private val shopListRepository: ShopListRepository) {
    fun getShopItem(shopItemId: Int): ShopItem {
        return shopListRepository.getShopItem(shopItemId)
    }
}