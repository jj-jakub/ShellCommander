package domain.sequences

import domain.model.basic.BasicSequence
import domain.model.basic.BasicSequenceEvent
import domain.model.basic.Pause
import domain.model.basic.Square

class ShootingStarRefresher : ComposedSequence {
    override fun getSequence() = BasicSequence(
        repeatTimes = 1,
        events = mutableListOf<BasicSequenceEvent>().apply {
            addAll(sequenceMoves)
        }
    )

    // Top right corner of star, zoom 1.5/5
    private val starSq = Square(1416.0F, 779.0F, 1483.0F, 858.0F)
    private val delay = Pause(62 * 1000, 65 * 1000)

    private val sequenceMoves = listOf(
        starSq,
        delay,
    )
}