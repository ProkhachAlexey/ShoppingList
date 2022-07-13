package com.prokhach.shoppinglist.domain

// Интерактор для получения всего списка покупок

class GetShopListUseCase(private val shopListRepository: ShopListRepository) {
    fun getShopList(): List<ShopItem> {
        return shopListRepository.getShopList()
    }
}