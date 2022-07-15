package com.prokhach.shoppinglist.domain

import androidx.lifecycle.LiveData

// Интерактор для получения всего списка покупок

class GetShopListUseCase(private val shopListRepository: ShopListRepository) {
    fun getShopList(): LiveData<List<ShopItem>> {
        return shopListRepository.getShopList()
    }
}