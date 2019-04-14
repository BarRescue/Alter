package gg.rsmod.plugins.content.items.prayerscrolls

on_item_option(Items.DEXTEROUS_PRAYER_SCROLL, "read") {
    player.queue {
        player.animate(id = 7403)
        itemMessageBox("You can make out some faded words on the ancient parchment. It appears to be an archaic invocation of the gods! Would you like to absorb its power? <br>(Warning: This will consume the scroll.)</b>", item = Items.DEXTEROUS_PRAYER_SCROLL)
        when (options("Learn Rigour", "Cancel", title = "This will consume the scroll")) {
            1 -> {
                if (player.inventory.contains(Items.DEXTEROUS_PRAYER_SCROLL)) {
                    player.inventory.remove(item = Items.DEXTEROUS_PRAYER_SCROLL)
                    player.setVarbit(id = 5451, value = 1)
                    itemMessageBox("You study the scroll and learn a new prayer: <col=8B0000>Rigour</col>", item = Items.DEXTEROUS_PRAYER_SCROLL)
                }
            }
            2 -> {
                player.animate(id = -1)
            }
        }
    }
}

on_item_option(Items.ARCANE_PRAYER_SCROLL, "read") {
    player.queue {
        player.animate(id = 7403)
        itemMessageBox("You can make out some faded words on the ancient parchment. It appears to be an archaic invocation of the gods! Would you like to absorb its power? <br>(Warning: This will consume the scroll.)</b>", item = Items.ARCANE_PRAYER_SCROLL)
        when (options("Learn Augury", "Cancel", title = "This will consume the scroll")) {
            1 -> {
                if (player.inventory.contains(Items.ARCANE_PRAYER_SCROLL)) {
                    player.inventory.remove(item = Items.ARCANE_PRAYER_SCROLL)
                    player.setVarbit(id = 5452, value = 1)
                    itemMessageBox("You study the scroll and learn a new prayer: <col=8B0000>Augury</col>", item = Items.ARCANE_PRAYER_SCROLL)
                }
            }
            2 -> {
                player.animate(id = -1)
            }
        }
    }
}

on_item_option(Items.TORN_PRAYER_SCROLL, "read") {
    player.queue {
        player.animate(id = 7403)
        itemMessageBox("You can make out some faded words on the ancient parchment. It appears to be an archaic invocation of the gods! Would you like to absorb its power? <br>(Warning: This will consume the scroll.)</b>", item = Items.TORN_PRAYER_SCROLL)
        when (options("Learn Preserve", "Cancel", title = "This will consume the scroll")) {
            1 -> {
                if (player.inventory.contains(Items.TORN_PRAYER_SCROLL)) {
                    player.inventory.remove(item = Items.TORN_PRAYER_SCROLL)
                    player.setVarbit(id = 5453, value = 1)
                    itemMessageBox("You study the scroll and learn a new prayer: <col=8B0000>Preserve</col>", item = Items.TORN_PRAYER_SCROLL)
                }
            }
            2 -> {
                player.animate(id = -1)
            }
        }
    }
}