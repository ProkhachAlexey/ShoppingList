package com.prokhach.shoppinglist.domain

// Интерактор для удаления элемента из списка покупок

class DeleteShopItemUseCase(private val shopListRepository: ShopListRepository) {
    fun deleteShopItem(shopItem: ShopItem) {
        shopListRepository.deleteShopItem(shopItem)
    }
}