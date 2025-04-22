package racingcar.car

class NeverMoveStrategy : MoveStrategy{
    override fun move(): Boolean =false;
}