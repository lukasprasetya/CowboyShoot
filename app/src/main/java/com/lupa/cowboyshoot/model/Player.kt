package com.lupa.cowboyshoot.model

import com.lupa.cowboyshoot.enum.PlayerPosition
import com.lupa.cowboyshoot.enum.PlayerSide
import com.lupa.cowboyshoot.enum.PlayerState

data class Player(
    val playerSide: PlayerSide,
    val playerState: PlayerState,
    val playerPosition: PlayerPosition
)