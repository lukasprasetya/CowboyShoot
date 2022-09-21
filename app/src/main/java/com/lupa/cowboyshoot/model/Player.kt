package com.lupa.cowboyshoot.model

import com.lupa.cowboyshoot.enum.PlayerPosition
import com.lupa.cowboyshoot.enum.PlayerSide
import com.lupa.cowboyshoot.enum.PlayerState

data class Player(
    val playerSide: PlayerSide,
    var playerState: PlayerState,
    var playerPosition: PlayerPosition
)