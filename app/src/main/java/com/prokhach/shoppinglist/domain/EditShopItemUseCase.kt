package com.prokhach.shoppinglist.domain

// Интерактор для редактирования элемента из списка покупок

class EditShopItemUseCase(private val shopListRepository: ShopListRepository) {
    fun editShopItem(shopItem: ShopItem) {
        shopListRepository.editShopItem(shopItem)
    }
}