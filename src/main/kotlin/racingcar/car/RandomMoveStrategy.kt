package racingcar.car

import kotlin.random.Random

class RandomMoveStrategy:MoveStrategy {
    override fun move(): Boolean {
        val randomInt = Random.nextInt(10)
        return randomInt > 3
    }
}