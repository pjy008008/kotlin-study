package racingcar.ui

import racingcar.car.Car
import java.util.Scanner

class InputView {
    fun getCars(): List<Car> {
        val sc: Scanner = Scanner(System.`in`)
        val carNames = sc.nextLine()
            .validateNotNullOrBlank()
            .split(",")
            .map { it.trim() }

        // 차 이름 공백 확인
        if(carNames.any{ it.isBlank()}){
            throw IllegalArgumentException("car name can't be a blank")
        }
        return carNames.map { Car(it) }
    }

    private fun String?.validateNotNullOrBlank():String {
        if (this.isNullOrBlank()) {
            throw IllegalArgumentException("invalid input")
        }
        return this
    }
}