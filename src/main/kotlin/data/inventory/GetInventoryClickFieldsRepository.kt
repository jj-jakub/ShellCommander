package data.inventory

import data.inventory.s9.S9InventoryClickFields

class GetInventoryClickFieldsRepository {
    operator fun invoke() = S9InventoryClickFields()
}