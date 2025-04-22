package racingcar.car

class Car(
    private val name: String,
    private val moveStrategy: MoveStrategy = RandomMoveStrategy()
){

    private var position:String = ""

    fun drive() {
        if (moveStrategy.move()) {
            position += "-"
        }
    }
}